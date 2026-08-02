package com.plaid.internal;

import android.net.Network;
import android.os.Build;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.InterfaceC0270r1;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import javax.net.SocketFactory;

/* renamed from: com.plaid.internal.i7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0196i7 implements InterfaceC0270r1 {
    public final C0323x0 a;
    public final C0175g4 b;
    public int c;

    public C0196i7(C0175g4 c0175g4) {
        W3 w3 = Z3.a;
        this.a = new C0323x0("socket-http-client");
        this.c = 0;
        this.b = c0175g4;
    }

    @Override // com.plaid.internal.InterfaceC0270r1
    public final InterfaceC0270r1.b a(InterfaceC0270r1.a aVar) {
        boolean z;
        Socket socket;
        Socket socket2;
        C0288t1 c0288t1;
        C0323x0 c0323x0 = this.a;
        StringBuilder sb = new StringBuilder("request ");
        sb.append(aVar.b ? "POST" : "GET");
        sb.append(" ");
        sb.append(aVar.a);
        W3 w3 = W3.DEBUG;
        c0323x0.a(w3, sb.toString(), new Object[0]);
        try {
            z = new URL(aVar.a).getProtocol().equals("https");
        } catch (MalformedURLException unused) {
            z = false;
        }
        if (z) {
            a$$ExternalSyntheticBUOutline0.m$4("https not supported by this httpclient");
            return null;
        }
        int i = aVar.c;
        if (i <= -1) {
            i = this.c;
        }
        try {
            URL url = new URL(aVar.a);
            Network network = this.b.a;
            InetAddress byName = network.getByName(url.getHost());
            socket = null;
            try {
                this.a.a(w3, "host " + url.getHost() + " resolved to " + byName, new Object[0]);
                SocketFactory socketFactory = network.getSocketFactory();
                int port = url.getPort();
                if (port == -1) {
                    port = url.getDefaultPort();
                }
                Socket createSocket = socketFactory.createSocket(byName, port);
                try {
                    createSocket.setSoTimeout(i);
                    OutputStream outputStream = createSocket.getOutputStream();
                    try {
                        if (aVar.b) {
                            c0288t1 = new C0288t1(url, "POST");
                            C0154e1 c0154e1 = C0154e1.c;
                            c0288t1.c.put("accept".toLowerCase(), (String) c0154e1.a("http.accept.post", "application/json", String.class));
                            c0288t1.c.put("accept".toLowerCase(), (String) c0154e1.a("http.accept.post", "application/json", String.class));
                            c0288t1.f = aVar.d;
                            c0288t1.g = !c0154e1.a("http.no-gzip");
                        } else {
                            c0288t1 = new C0288t1(url, "GET");
                            c0288t1.c.put("accept".toLowerCase(), (String) C0154e1.c.a("http.accept.get", "application/json, */*", String.class));
                        }
                        if (!C0154e1.c.a("http.no-user-agent")) {
                            StringBuilder sb2 = new StringBuilder("Prove SDK;version=2.9.1;os=Android ");
                            sb2.append(Build.VERSION.RELEASE);
                            sb2.append(";device=");
                            String str = Build.MANUFACTURER;
                            String str2 = Build.MODEL;
                            if (!str2.toLowerCase().startsWith(str.toLowerCase())) {
                                str2 = str + " " + str2;
                            }
                            sb2.append(str2);
                            c0288t1.c.put("user-agent".toLowerCase(), sb2.toString());
                        }
                        c0288t1.a(outputStream);
                        InputStream inputStream = createSocket.getInputStream();
                        C0297u1 a = C0297u1.a(inputStream);
                        inputStream.close();
                        InterfaceC0270r1.b bVar = new InterfaceC0270r1.b(a.a, a.b, a.d, a.c);
                        AbstractC0306v1.a(outputStream);
                        AbstractC0306v1.a(createSocket);
                        return bVar;
                    } catch (Throwable th) {
                        th = th;
                        socket = outputStream;
                        socket2 = createSocket;
                        AbstractC0306v1.a(socket);
                        AbstractC0306v1.a(socket2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                socket2 = socket;
                AbstractC0306v1.a(socket);
                AbstractC0306v1.a(socket2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            socket = null;
        }
    }

    @Override // com.plaid.internal.InterfaceC0270r1
    public final EnumC0340z isConnected() {
        return null;
    }

    @Override // com.plaid.internal.InterfaceC0270r1
    public final void a() {
        try {
            C0175g4 c0175g4 = this.b;
            if (c0175g4.d) {
                return;
            }
            c0175g4.d = true;
            c0175g4.b.run();
        } catch (Exception e) {
            this.a.a(e, "couldn't release the network");
        }
    }
}
