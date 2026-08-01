package com.anythink.expressad.b;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18209a = "f";

    /* renamed from: b, reason: collision with root package name */
    private static final int f18210b = 60000;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.f.a f18211c;

    /* renamed from: d, reason: collision with root package name */
    private String f18212d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18213e = true;

    /* renamed from: f, reason: collision with root package name */
    private final int f18214f = 3145728;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.expressad.b.a.a f18215g;

    public f() {
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
        this.f18211c = b9;
        if (b9 == null) {
            com.anythink.expressad.f.b.a();
            this.f18211c = com.anythink.expressad.f.b.c();
        }
    }

    private void a(boolean z3) {
        this.f18213e = z3;
    }

    public final com.anythink.expressad.b.a.a a(String str, boolean z3, boolean z6, com.anythink.expressad.foundation.d.d dVar) {
        int i;
        HttpURLConnection httpURLConnection = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String replace = str.replace(" ", "%20");
        this.f18215g = new com.anythink.expressad.b.a.a();
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(replace).openConnection();
            try {
                httpURLConnection2.setRequestMethod("GET");
                if ((!z3 && !z6) || dVar == null) {
                    httpURLConnection2.setRequestProperty("User-Agent", com.anythink.core.common.v.m.h());
                }
                if (z3 && dVar != null && dVar.F() == 1) {
                    httpURLConnection2.setRequestProperty("User-Agent", com.anythink.core.common.v.m.h());
                }
                if (z6 && dVar != null && dVar.E() == 1) {
                    httpURLConnection2.setRequestProperty("User-Agent", com.anythink.core.common.v.m.h());
                }
                httpURLConnection2.setRequestProperty("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19341d);
                if (this.f18211c.u() && !TextUtils.isEmpty(this.f18212d)) {
                    httpURLConnection2.setRequestProperty("referer", this.f18212d);
                }
                httpURLConnection2.setConnectTimeout(60000);
                httpURLConnection2.setReadTimeout(60000);
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.connect();
                this.f18215g.f18117a = httpURLConnection2.getHeaderField("Location");
                this.f18215g.f18120d = httpURLConnection2.getHeaderField("Referer");
                this.f18215g.f18122f = httpURLConnection2.getResponseCode();
                this.f18215g.f18118b = httpURLConnection2.getContentType();
                this.f18215g.f18121e = httpURLConnection2.getContentLength();
                this.f18215g.f18119c = httpURLConnection2.getContentEncoding();
                boolean equalsIgnoreCase = com.anythink.expressad.foundation.g.f.g.b.f19341d.equalsIgnoreCase(this.f18215g.f18119c);
                com.anythink.expressad.b.a.a aVar = this.f18215g;
                if (aVar.f18122f == 200 && this.f18213e && (i = aVar.f18121e) > 0 && i < 3145728 && !TextUtils.isEmpty(replace)) {
                    try {
                        String a9 = a(httpURLConnection2.getInputStream(), equalsIgnoreCase);
                        if (!TextUtils.isEmpty(a9)) {
                            byte[] bytes = a9.getBytes();
                            if (bytes.length > 0 && bytes.length < 3145728) {
                                this.f18215g.f18123g = a9.trim();
                            }
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                this.f18212d = replace;
                httpURLConnection2.disconnect();
                return this.f18215g;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                try {
                    this.f18215g.f18124h = th.getMessage();
                    return this.f18215g;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[Catch: all -> 0x000f, TryCatch #5 {all -> 0x000f, blocks: (B:41:0x0008, B:4:0x0013, B:8:0x0036, B:10:0x003a, B:11:0x0047), top: B:40:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: Exception -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0031, blocks: (B:34:0x002d, B:13:0x004c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(InputStream inputStream, boolean z3) {
        Throwable th;
        Exception e9;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            if (z3) {
                try {
                    try {
                        inputStream = new GZIPInputStream(inputStream);
                    } catch (Exception e10) {
                        e9 = e10;
                        if (this.f18215g == null) {
                            com.anythink.expressad.b.a.a aVar = new com.anythink.expressad.b.a.a();
                            this.f18215g = aVar;
                            aVar.f18124h = e9.getMessage();
                        }
                        e9.getMessage();
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return sb.toString();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e11) {
                            e11.getMessage();
                        }
                    }
                    throw th;
                }
            }
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } catch (Exception e12) {
                    e9 = e12;
                    bufferedReader = bufferedReader2;
                    if (this.f18215g == null) {
                    }
                    e9.getMessage();
                    if (bufferedReader != null) {
                    }
                    return sb.toString();
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                    }
                    throw th;
                }
            }
            bufferedReader2.close();
        } catch (Exception e13) {
            e13.getMessage();
        }
        return sb.toString();
    }
}
