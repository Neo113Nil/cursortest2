package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import javax.net.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* loaded from: classes6.dex */
public final class fy6 {
    public volatile boolean a = false;
    public volatile boolean b = false;
    public final LinkedList c = new LinkedList();
    public final Object d = new Object();
    public final Thread e = new Thread(new he0(23, this));
    public Socket f;
    public BufferedInputStream g;
    public BufferedOutputStream h;
    public final /* synthetic */ gy6 i;

    public fy6(gy6 gy6Var) {
        this.i = gy6Var;
    }

    public static boolean a(fy6 fy6Var) {
        URI uri;
        URI uri2;
        SSLSocketFactory sSLSocketFactory;
        int i;
        URI uri3;
        int i2;
        URI uri4;
        int i3;
        int i4;
        URI uri5;
        int i5;
        URI uri6;
        int i6;
        synchronized (fy6Var.d) {
            try {
                if (fy6Var.b) {
                    return false;
                }
                uri = fy6Var.i.uri;
                String scheme = uri.getScheme();
                uri2 = fy6Var.i.uri;
                int port = uri2.getPort();
                if (scheme == null) {
                    throw new cbe("The scheme component of the URI cannot be null");
                }
                if (scheme.equals("ws")) {
                    Socket createSocket = SocketFactory.getDefault().createSocket();
                    fy6Var.f = createSocket;
                    i4 = fy6Var.i.readTimeout;
                    createSocket.setSoTimeout(i4);
                    Socket socket = fy6Var.f;
                    if (port != -1) {
                        uri6 = fy6Var.i.uri;
                        InetSocketAddress inetSocketAddress = new InetSocketAddress(uri6.getHost(), port);
                        i6 = fy6Var.i.connectTimeout;
                        socket.connect(inetSocketAddress, i6);
                    } else {
                        uri5 = fy6Var.i.uri;
                        InetSocketAddress inetSocketAddress2 = new InetSocketAddress(uri5.getHost(), 80);
                        i5 = fy6Var.i.connectTimeout;
                        socket.connect(inetSocketAddress2, i5);
                    }
                } else {
                    if (!scheme.equals("wss")) {
                        throw new cbe("The scheme component of the URI should be ws or wss");
                    }
                    sSLSocketFactory = fy6Var.i.socketFactory;
                    Socket createSocket2 = sSLSocketFactory.createSocket();
                    fy6Var.f = createSocket2;
                    i = fy6Var.i.readTimeout;
                    createSocket2.setSoTimeout(i);
                    Socket socket2 = fy6Var.f;
                    if (port != -1) {
                        uri4 = fy6Var.i.uri;
                        InetSocketAddress inetSocketAddress3 = new InetSocketAddress(uri4.getHost(), port);
                        i3 = fy6Var.i.connectTimeout;
                        socket2.connect(inetSocketAddress3, i3);
                    } else {
                        uri3 = fy6Var.i.uri;
                        InetSocketAddress inetSocketAddress4 = new InetSocketAddress(uri3.getHost(), 443);
                        i2 = fy6Var.i.connectTimeout;
                        socket2.connect(inetSocketAddress4, i2);
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(fy6 fy6Var, ldk ldkVar) {
        synchronized (fy6Var.d) {
            fy6Var.c.addLast(ldkVar);
            fy6Var.a = true;
            fy6Var.d.notify();
        }
    }

    public static void c(fy6 fy6Var) {
        URI uri;
        URI uri2;
        URI uri3;
        URI uri4;
        URI uri5;
        String sb;
        Map map;
        URI uri6;
        fy6Var.getClass();
        fy6Var.h = new BufferedOutputStream(fy6Var.f.getOutputStream(), SQLiteDatabase.OPEN_FULLMUTEX);
        byte[] bArr = new byte[16];
        new Random().nextBytes(bArr);
        String e = cp2.e(bArr);
        StringBuilder sb2 = new StringBuilder("GET ");
        gy6 gy6Var = fy6Var.i;
        uri = gy6Var.uri;
        String rawPath = uri.getRawPath();
        uri2 = gy6Var.uri;
        String rawQuery = uri2.getRawQuery();
        if (rawQuery != null) {
            rawPath = ouj.o(rawPath, "?", rawQuery);
        }
        sb2.append(rawPath);
        sb2.append(" HTTP/1.1\r\nHost: ");
        uri3 = gy6Var.uri;
        if (uri3.getPort() == -1) {
            uri6 = gy6Var.uri;
            sb = uri6.getHost();
        } else {
            StringBuilder sb3 = new StringBuilder();
            uri4 = gy6Var.uri;
            sb3.append(uri4.getHost());
            sb3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            uri5 = gy6Var.uri;
            sb3.append(uri5.getPort());
            sb = sb3.toString();
        }
        su4.v(sb2, sb, "\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: ", e, "\r\nSec-WebSocket-Version: 13\r\n");
        map = gy6Var.headers;
        for (Map.Entry entry : map.entrySet()) {
            sb2.append((String) entry.getKey());
            sb2.append(": ");
            sb2.append((String) entry.getValue());
            sb2.append("\r\n");
        }
        sb2.append("\r\n");
        fy6Var.h.write(sb2.toString().getBytes(StandardCharsets.US_ASCII));
        fy6Var.h.flush();
        InputStream inputStream = fy6Var.f.getInputStream();
        try {
            eg0 eg0Var = new eg0(new o6c(25));
            eg0Var.g = inputStream;
            rd2 d = new gn7(eg0Var).d();
            lv2 l = d.l();
            if (l == null) {
                throw new wp3("There is no status line");
            }
            int i = l.b;
            if (i != 101) {
                throw new wp3("Invalid status code. Expected 101, received: " + i);
            }
            ej3[] k = d.k("Upgrade");
            if (k.length == 0) {
                throw new wp3("There is no header named Upgrade");
            }
            ej3 ej3Var = k[0];
            pd4 pd4Var = ej3Var.b;
            String lowerCase = pd4Var.g(ej3Var.c, pd4Var.b).toLowerCase();
            if (!lowerCase.equals("websocket")) {
                throw new wp3("Invalid value for header Upgrade. Expected: websocket, received: ".concat(lowerCase));
            }
            ej3[] k2 = d.k("Connection");
            if (k2.length == 0) {
                throw new wp3("There is no header named Connection");
            }
            ej3 ej3Var2 = k2[0];
            pd4 pd4Var2 = ej3Var2.b;
            String lowerCase2 = pd4Var2.g(ej3Var2.c, pd4Var2.b).toLowerCase();
            if (!lowerCase2.equals("upgrade")) {
                throw new wp3("Invalid value for header Connection. Expected: upgrade, received: ".concat(lowerCase2));
            }
            ej3[] k3 = d.k("Sec-WebSocket-Accept");
            if (k3.length == 0) {
                throw new wp3("There is no header named Sec-WebSocket-Accept");
            }
            ej3 ej3Var3 = k3[0];
            pd4 pd4Var3 = ej3Var3.b;
            String g = pd4Var3.g(ej3Var3.c, pd4Var3.b);
            try {
                String e2 = cp2.e(MessageDigest.getInstance("SHA-1").digest((e + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes(oe4.a)));
                if (!g.equals(e2)) {
                    throw new wp3("Invalid value for header Sec-WebSocket-Accept. Expected: " + e2 + ", received: " + g);
                }
                fy6Var.e.start();
                gy6Var.wasPrimaryConnectionSuccessful = true;
                gy6Var.connectionRetryCounter = 0;
                gy6.n(gy6Var);
                fy6Var.g = new BufferedInputStream(fy6Var.f.getInputStream(), SQLiteDatabase.OPEN_FULLMUTEX);
                while (true) {
                    int read = fy6Var.g.read();
                    if (read == -1) {
                        kac.f("Unexpected end of stream");
                        return;
                    }
                    int i2 = (read << 28) >>> 28;
                    int read2 = (fy6Var.g.read() << 25) >>> 25;
                    if (read2 == 126) {
                        byte[] bArr2 = new byte[2];
                        for (int i3 = 0; i3 < 2; i3++) {
                            bArr2[i3] = (byte) fy6Var.g.read();
                        }
                        read2 = c9g.A(new byte[]{0, 0, bArr2[0], bArr2[1]});
                    } else if (read2 == 127) {
                        byte[] bArr3 = new byte[8];
                        for (int i4 = 0; i4 < 8; i4++) {
                            bArr3[i4] = (byte) fy6Var.g.read();
                        }
                        read2 = c9g.A(new byte[]{bArr3[4], bArr3[5], bArr3[6], bArr3[7]});
                    }
                    byte[] bArr4 = new byte[read2];
                    for (int i5 = 0; i5 < read2; i5++) {
                        bArr4[i5] = (byte) fy6Var.g.read();
                    }
                    if (i2 != 0) {
                        if (i2 == 1) {
                            gy6.q(gy6Var, new String(bArr4, StandardCharsets.UTF_8));
                        } else if (i2 != 2) {
                            switch (i2) {
                                case 8:
                                    fy6Var.d();
                                    gy6Var.r(read2 > 0 ? ((bArr4[0] << 8) & 65280) | (bArr4[1] & 255) : -1, read2 > 2 ? Arrays.toString(Arrays.copyOfRange(bArr4, 3, read2)) : null);
                                    return;
                                case 9:
                                    gy6.o(gy6Var, bArr4);
                                    gy6Var.sendPong(bArr4);
                                    break;
                                case 10:
                                    gy6.p(gy6Var, bArr4);
                                    break;
                                default:
                                    fy6Var.d();
                                    gy6.m(gy6Var, new wp3("Unknown opcode: 0x" + Integer.toHexString(i2)));
                                    return;
                            }
                        } else {
                            gy6.l(gy6Var, bArr4);
                        }
                    }
                }
            } catch (NoSuchAlgorithmException e3) {
                throw new IllegalArgumentException(e3);
            }
        } catch (q6e e4) {
            throw new wp3(e4.getMessage());
        }
    }

    public final void d() {
        try {
            synchronized (this.d) {
                try {
                    if (!this.b) {
                        this.b = true;
                        Socket socket = this.f;
                        if (socket != null) {
                            socket.close();
                            this.a = true;
                            this.d.notify();
                        }
                    }
                } finally {
                }
            }
        } catch (IOException unused) {
        }
    }

    public final void e(int i, byte[] bArr) {
        byte[] bArr2;
        int i2;
        SecureRandom secureRandom;
        int length = bArr == null ? 0 : bArr.length;
        if (length < 126) {
            bArr2 = new byte[length + 6];
            bArr2[0] = (byte) (i | (-128));
            bArr2[1] = (byte) (length | (-128));
            i2 = 2;
        } else if (length < 65536) {
            bArr2 = new byte[length + 8];
            bArr2[0] = (byte) (i | (-128));
            bArr2[1] = -2;
            byte[] bArr3 = {(byte) (length >>> 8), (byte) length};
            bArr2[2] = bArr3[0];
            bArr2[3] = bArr3[1];
            i2 = 4;
        } else {
            bArr2 = new byte[length + 14];
            bArr2[0] = (byte) (i | (-128));
            bArr2[1] = -1;
            byte[] bArr4 = {0, 0, 0, 0, (byte) (length >>> 24), (byte) (length >>> 16), (byte) (length >>> 8), (byte) length};
            bArr2[2] = bArr4[0];
            bArr2[3] = bArr4[1];
            bArr2[4] = bArr4[2];
            bArr2[5] = bArr4[3];
            bArr2[6] = bArr4[4];
            bArr2[7] = bArr4[5];
            bArr2[8] = bArr4[6];
            bArr2[9] = bArr4[7];
            i2 = 10;
        }
        byte[] bArr5 = new byte[4];
        secureRandom = this.i.secureRandom;
        secureRandom.nextBytes(bArr5);
        bArr2[i2] = bArr5[0];
        bArr2[i2 + 1] = bArr5[1];
        bArr2[i2 + 2] = bArr5[2];
        bArr2[i2 + 3] = bArr5[3];
        int i3 = i2 + 4;
        for (int i4 = 0; i4 < length; i4++) {
            bArr2[i3] = (byte) (bArr[i4] ^ bArr5[i4 % 4]);
            i3++;
        }
        this.h.write(bArr2);
        this.h.flush();
    }
}
