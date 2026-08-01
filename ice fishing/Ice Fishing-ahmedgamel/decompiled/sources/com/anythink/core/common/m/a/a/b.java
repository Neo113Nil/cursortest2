package com.anythink.core.common.m.a.a;

import android.text.TextUtils;
import com.anythink.core.common.m.a.i;
import com.anythink.core.common.m.a.j;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class b extends com.anythink.core.common.m.a.a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f14424b = "POST";

    /* renamed from: c, reason: collision with root package name */
    private static final String f14425c = "GET";

    /* renamed from: d, reason: collision with root package name */
    private boolean f14426d;

    public b(com.anythink.core.common.m.a.f fVar) {
        super(fVar);
    }

    private j b(i iVar) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        byte[] bArr;
        j.a a9 = new j.a().a(iVar);
        InputStream inputStream = null;
        try {
        } catch (Throwable th) {
            th = th;
            httpURLConnection = null;
        }
        if (this.f14426d) {
            a9.a(new InterruptedException("canceled"));
            return a9.a();
        }
        httpURLConnection = (HttpURLConnection) new URL(iVar.f14462a).openConnection();
        try {
            String str = iVar.f14463b;
            if (TextUtils.isEmpty(str)) {
                str = f14425c;
            }
            httpURLConnection.setRequestMethod(str);
            if (f14424b.equals(str)) {
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
            } else if (f14425c.equals(str)) {
                httpURLConnection.setInstanceFollowRedirects(false);
            }
            httpURLConnection.setConnectTimeout((int) this.f14417a.f14448e);
            httpURLConnection.setReadTimeout((int) this.f14417a.f14444a);
            Map<String, String> map = iVar.f14466e;
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : iVar.f14466e.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            httpURLConnection.connect();
            if (f14424b.equals(str) && (bArr = iVar.f14464c) != null) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.flush();
                outputStream.close();
            }
            responseCode = httpURLConnection.getResponseCode();
            a9.a(responseCode);
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Throwable unused) {
                    a9.a(th);
                    return a9.a();
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            a9.a(th);
            return a9.a();
        }
        if (responseCode == 200) {
            if (!this.f14426d) {
                a9.a(new c(httpURLConnection, a(httpURLConnection)));
                return a9.a();
            }
            a9.a(new InterruptedException("canceled"));
            httpURLConnection.disconnect();
            return a9.a();
        }
        if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
            a9.a(httpURLConnection.getHeaderFields());
            httpURLConnection.disconnect();
            return a9.a();
        }
        if (this.f14426d) {
            a9.a(new InterruptedException("canceled"));
        } else {
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField != null && headerField.toLowerCase().startsWith("http")) {
                iVar.f14462a = headerField;
                httpURLConnection.disconnect();
                return b(iVar);
            }
        }
        httpURLConnection.disconnect();
        return a9.a();
    }

    @Override // com.anythink.core.common.m.a.b
    public final void a(i iVar, com.anythink.core.common.m.a.c cVar) {
    }

    @Override // com.anythink.core.common.m.a.b
    public final j a(i iVar) {
        return b(iVar);
    }

    @Override // com.anythink.core.common.m.a.b
    public final void a() {
        this.f14426d = true;
    }

    private static InputStream a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
        }
        if (!com.anythink.expressad.foundation.g.f.g.b.f19341d.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"))) {
            return inputStream;
        }
        try {
            byte[] bArr = new byte[2];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(2);
            int read = bufferedInputStream.read(bArr);
            bufferedInputStream.reset();
            return (read == -1 || (((bArr[1] & 255) << 8) | (bArr[0] & 255)) != 35615) ? bufferedInputStream : new GZIPInputStream(bufferedInputStream);
        } catch (Exception unused2) {
            return inputStream;
        }
    }
}
