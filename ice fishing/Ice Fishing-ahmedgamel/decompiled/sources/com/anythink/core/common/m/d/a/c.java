package com.anythink.core.common.m.d.a;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.m.b.h;
import com.anythink.core.common.m.d.d;
import com.anythink.core.common.v.q;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: c, reason: collision with root package name */
    private static final int f14578c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f14579d = 7;

    /* renamed from: a, reason: collision with root package name */
    protected Socket f14580a;

    /* renamed from: e, reason: collision with root package name */
    private String f14582e;

    /* renamed from: f, reason: collision with root package name */
    private int f14583f;

    /* renamed from: b, reason: collision with root package name */
    private final String f14581b = getClass().getSimpleName();

    /* renamed from: g, reason: collision with root package name */
    private byte[] f14584g = null;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f14585h = new byte[1];

    private boolean b() {
        Socket socket = this.f14580a;
        return (socket == null || !socket.isConnected() || this.f14580a.isClosed()) ? false : true;
    }

    public abstract void a(d dVar, d.a aVar);

    public final void b(final d dVar, final d.a aVar) {
        com.anythink.core.common.v.b.d dVar2 = new com.anythink.core.common.v.b.d() { // from class: com.anythink.core.common.m.d.a.c.1
            /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
            @Override // com.anythink.core.common.v.b.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a() {
                d.a aVar2;
                try {
                    c.this.b(dVar);
                    c.this.a(dVar, aVar);
                } catch (SocketException e9) {
                    String unused = c.this.f14581b;
                    e9.getMessage();
                    dVar.toString();
                    c.b(c.this);
                    try {
                        c.this.b(dVar);
                        c.this.a(dVar, aVar);
                    } catch (Throwable th) {
                        String unused2 = c.this.f14581b;
                        e9.getMessage();
                        dVar.toString();
                        th = th;
                        String str = th.getMessage() + "," + q.a(th.getStackTrace());
                        String unused3 = c.this.f14581b;
                        dVar.a("", str, c.this.f14582e, c.this.f14583f);
                        aVar2 = aVar;
                        if (aVar2 == null) {
                            aVar2.a(th);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    String unused4 = c.this.f14581b;
                    th.getMessage();
                    String str2 = th.getMessage() + "," + q.a(th.getStackTrace());
                    String unused32 = c.this.f14581b;
                    dVar.a("", str2, c.this.f14582e, c.this.f14583f);
                    aVar2 = aVar;
                    if (aVar2 == null) {
                    }
                }
            }
        };
        if (dVar.c() == 6) {
            com.anythink.core.common.v.b.b.a().a(dVar2, 2);
        } else {
            com.anythink.core.common.v.b.b.a().a(dVar2, 3);
        }
    }

    private void a(d dVar) {
        synchronized (this) {
            try {
                if (this.f14580a == null) {
                    Socket socket = new Socket();
                    this.f14580a = socket;
                    socket.setSoTimeout(60000);
                }
                h e_ = dVar.e_();
                if (e_ != null) {
                    this.f14582e = e_.a();
                    this.f14583f = e_.b();
                    this.f14580a.connect(new InetSocketAddress(this.f14582e, this.f14583f), 30000);
                } else {
                    throw new IllegalArgumentException("The domain must not can be null or empty.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(d dVar) {
        try {
            Socket socket = this.f14580a;
            if (socket == null || !socket.isConnected() || this.f14580a.isClosed()) {
                synchronized (this) {
                    try {
                        if (this.f14580a == null) {
                            Socket socket2 = new Socket();
                            this.f14580a = socket2;
                            socket2.setSoTimeout(60000);
                        }
                        h e_ = dVar.e_();
                        if (e_ != null) {
                            this.f14582e = e_.a();
                            this.f14583f = e_.b();
                            this.f14580a.connect(new InetSocketAddress(this.f14582e, this.f14583f), 30000);
                        } else {
                            throw new IllegalArgumentException("The domain must not can be null or empty.");
                        }
                    } finally {
                    }
                }
            }
            byte[] e9 = dVar.e();
            if (e9 != null) {
                int length = e9.length;
                if (e9.length == 0) {
                    return;
                }
                int i = length + 7;
                byte[] bArr = this.f14584g;
                if (bArr == null || bArr.length < i) {
                    this.f14584g = new byte[i];
                }
                byte[] bArr2 = this.f14584g;
                bArr2[0] = 0;
                bArr2[1] = 3;
                bArr2[2] = (byte) dVar.c();
                byte[] bArr3 = this.f14584g;
                bArr3[3] = (byte) ((length >>> 24) & p.f8473b);
                bArr3[4] = (byte) ((length >>> 16) & p.f8473b);
                bArr3[5] = (byte) ((length >>> 8) & p.f8473b);
                bArr3[6] = (byte) (length & p.f8473b);
                System.arraycopy(e9, 0, bArr3, 7, e9.length);
                OutputStream outputStream = this.f14580a.getOutputStream();
                outputStream.write(this.f14584g, 0, i);
                outputStream.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a() {
        synchronized (this) {
            try {
                Socket socket = this.f14580a;
                if (socket != null) {
                    socket.close();
                    this.f14580a = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    public final int a(InputStream inputStream) {
        if (inputStream.read(this.f14585h, 0, 1) != -1) {
            byte[] bArr = this.f14585h;
            byte b9 = bArr[0];
            bArr[0] = 0;
            return b9;
        }
        throw new SocketException("Socket.InputStream read length = -1!");
    }

    public static /* synthetic */ void b(c cVar) {
        synchronized (cVar) {
            try {
                Socket socket = cVar.f14580a;
                if (socket != null) {
                    socket.close();
                    cVar.f14580a = null;
                }
            } catch (Exception unused) {
            }
        }
    }
}
