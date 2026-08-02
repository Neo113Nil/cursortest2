package com.plaid.internal;

import android.os.Build;
import com.plaid.internal.InterfaceC0270r1;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* renamed from: com.plaid.internal.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0143d implements InterfaceC0270r1 {
    public final C0323x0 a;
    public final C0175g4 b;
    public int c;

    public C0143d(C0175g4 c0175g4) {
        W3 w3 = Z3.a;
        this.a = new C0323x0("http-client");
        this.c = 0;
        this.b = c0175g4;
    }

    @Override // com.plaid.internal.InterfaceC0270r1
    public final InterfaceC0270r1.b a(InterfaceC0270r1.a aVar) {
        InputStream errorStream;
        C0323x0 c0323x0 = this.a;
        StringBuilder sb = new StringBuilder("request ");
        sb.append(aVar.b ? "POST" : "GET");
        sb.append(" ");
        sb.append(aVar.a);
        c0323x0.a(W3.DEBUG, sb.toString(), new Object[0]);
        int i = aVar.c;
        if (i <= -1) {
            i = this.c;
        }
        HttpURLConnection httpURLConnection = null;
        OutputStream outputStream = null;
        String str = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) this.b.a.openConnection(new URL(aVar.a));
            try {
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.setRequestProperty("Connection", "close");
                httpURLConnection2.setRequestProperty("Cache-Control", "no-cache");
                C0154e1 c0154e1 = C0154e1.c;
                if (!c0154e1.a("http.no-user-agent")) {
                    StringBuilder sb2 = new StringBuilder("Prove SDK;version=2.9.1;os=Android ");
                    sb2.append(Build.VERSION.RELEASE);
                    sb2.append(";device=");
                    String str2 = Build.MANUFACTURER;
                    String str3 = Build.MODEL;
                    if (!str3.toLowerCase().startsWith(str2.toLowerCase())) {
                        str3 = str2 + " " + str3;
                    }
                    sb2.append(str3);
                    httpURLConnection2.setRequestProperty("user-agent", sb2.toString());
                }
                if (aVar.b) {
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setRequestProperty("Accept", (String) c0154e1.a("http.accept.post", "application/json", String.class));
                    httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection2.setDoOutput(true);
                    boolean a = c0154e1.a("http.no-gzip");
                    String str4 = aVar.d;
                    byte[] a2 = !a ? AbstractC0306v1.a(str4) : str4.getBytes(StandardCharsets.UTF_8);
                    if (!a) {
                        httpURLConnection2.setRequestProperty("Content-Encoding", "gzip");
                    }
                    httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(a2.length));
                    try {
                        OutputStream outputStream2 = httpURLConnection2.getOutputStream();
                        try {
                            outputStream2.write(a2, 0, a2.length);
                            AbstractC0306v1.a(outputStream2);
                        } catch (Throwable th) {
                            th = th;
                            outputStream = outputStream2;
                            AbstractC0306v1.a(outputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    httpURLConnection2.setRequestProperty("Accept", (String) c0154e1.a("http.accept.get", "application/json, */*", String.class));
                }
                httpURLConnection2.connect();
                try {
                    errorStream = httpURLConnection2.getInputStream();
                } catch (FileNotFoundException unused) {
                    errorStream = httpURLConnection2.getErrorStream();
                }
                int responseCode = httpURLConnection2.getResponseCode();
                String responseMessage = httpURLConnection2.getResponseMessage();
                if (errorStream != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = errorStream.read(bArr, 0, 1024);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                }
                InterfaceC0270r1.b bVar = new InterfaceC0270r1.b(responseCode, responseMessage, str, httpURLConnection2.getHeaderFields());
                httpURLConnection2.disconnect();
                return bVar;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.plaid.internal.InterfaceC0270r1
    public final EnumC0340z isConnected() {
        C0175g4 c0175g4 = this.b;
        return c0175g4.d ? EnumC0340z.NO : c0175g4.c;
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
