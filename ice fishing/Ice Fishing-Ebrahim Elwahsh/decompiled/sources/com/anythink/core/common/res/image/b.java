package com.anythink.core.common.res.image;

import android.os.SystemClock;
import com.anythink.core.common.v.b.d;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f16396a = getClass().getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    protected String f16397d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f16398e;

    /* renamed from: f, reason: collision with root package name */
    protected long f16399f;

    /* renamed from: g, reason: collision with root package name */
    protected long f16400g;

    /* renamed from: h, reason: collision with root package name */
    protected long f16401h;
    protected long i;

    /* renamed from: j, reason: collision with root package name */
    protected long f16402j;

    /* renamed from: com.anythink.core.common.res.image.b$1, reason: invalid class name */
    public class AnonymousClass1 extends d {
        public AnonymousClass1() {
        }

        private void b(String str) {
            HttpURLConnection httpURLConnection;
            b.this.f16399f = System.currentTimeMillis();
            b.this.f16400g = SystemClock.elapsedRealtime();
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    String unused = b.this.f16396a;
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (SocketTimeoutException e6) {
                e = e6;
            } catch (Exception e9) {
                e = e9;
            } catch (OutOfMemoryError e10) {
                e = e10;
            } catch (StackOverflowError e11) {
                e = e11;
            } catch (Error e12) {
                e = e12;
            } catch (ConnectTimeoutException e13) {
                e = e13;
            }
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                Map<String, String> a9 = b.this.a();
                if (a9 != null && a9.size() > 0) {
                    for (String str2 : a9.keySet()) {
                        httpURLConnection.addRequestProperty(str2, a9.get(str2));
                        String unused2 = b.this.f16396a;
                        a9.get(str2);
                    }
                }
                b bVar = b.this;
                if (bVar.f16398e) {
                    bVar.a(c.f16405b, "Task had been canceled.");
                    httpURLConnection.disconnect();
                    return;
                }
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    b bVar2 = b.this;
                    if (bVar2.f16398e) {
                        bVar2.a(c.f16405b, "Task had been canceled.");
                        httpURLConnection.disconnect();
                        return;
                    }
                    bVar2.f16402j = httpURLConnection.getContentLength();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    boolean a10 = b.this.a(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    b.this.f16401h = System.currentTimeMillis();
                    b.this.i = SystemClock.elapsedRealtime();
                    if (a10) {
                        String unused3 = b.this.f16396a;
                        b bVar3 = b.this;
                        String str3 = bVar3.f16397d;
                        bVar3.c();
                    } else {
                        String unused4 = b.this.f16396a;
                        b bVar4 = b.this;
                        String str4 = bVar4.f16397d;
                        bVar4.a(c.f16404a, "Save fail!");
                    }
                    httpURLConnection.disconnect();
                    return;
                }
                String unused5 = b.this.f16396a;
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    b.this.a(c.f16404a, "Resource download fail, status code: " + responseCode + ", " + httpURLConnection.getResponseMessage() + ", url: " + str);
                    httpURLConnection.disconnect();
                    return;
                }
                b bVar5 = b.this;
                if (bVar5.f16398e) {
                    bVar5.a(c.f16405b, "Task had been canceled.");
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField != null) {
                        if (!headerField.toLowerCase().startsWith("http")) {
                            b.this.a(c.f16404a, "Final url is wrong:".concat(headerField));
                            httpURLConnection.disconnect();
                            return;
                        }
                        b(headerField);
                    }
                }
                httpURLConnection.disconnect();
            } catch (OutOfMemoryError e14) {
                e = e14;
                httpURLConnection2 = httpURLConnection;
                System.gc();
                String unused6 = b.this.f16396a;
                e.getMessage();
                b.this.a(c.f16404a, e.getMessage());
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            } catch (StackOverflowError e15) {
                e = e15;
                httpURLConnection2 = httpURLConnection;
                System.gc();
                String unused7 = b.this.f16396a;
                e.getMessage();
                b.this.a(c.f16404a, e.getMessage());
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            } catch (Error e16) {
                e = e16;
                httpURLConnection2 = httpURLConnection;
                System.gc();
                String unused8 = b.this.f16396a;
                e.getMessage();
                b.this.a(c.f16404a, e.getMessage());
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            } catch (SocketTimeoutException e17) {
                e = e17;
                httpURLConnection2 = httpURLConnection;
                b.this.a(c.f16404a, e.getMessage());
                String unused9 = b.this.f16396a;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            } catch (ConnectTimeoutException e18) {
                e = e18;
                httpURLConnection2 = httpURLConnection;
                b.this.a(c.f16404a, e.getMessage());
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            } catch (Exception e19) {
                e = e19;
                httpURLConnection2 = httpURLConnection;
                String unused10 = b.this.f16396a;
                e.getMessage();
                b.this.a(c.f16404a, e.getMessage());
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        }

        @Override // com.anythink.core.common.v.b.d
        public final void a() {
            try {
                b(b.this.f16397d);
            } catch (Exception e6) {
                String unused = b.this.f16396a;
                e6.getMessage();
                b.this.a(c.f16404a, e6.getMessage());
            } catch (OutOfMemoryError e9) {
                e = e9;
                System.gc();
                b.this.a(c.f16404a, e.getMessage());
            } catch (StackOverflowError e10) {
                e = e10;
                System.gc();
                b.this.a(c.f16404a, e.getMessage());
            }
        }
    }

    public b(String str) {
        this.f16397d = str;
    }

    private void e() {
        this.f16398e = true;
    }

    private void f() {
        a(new AnonymousClass1());
    }

    private static int g() {
        return 60000;
    }

    private static int h() {
        return 60000;
    }

    public abstract Map<String, String> a();

    public abstract void a(d dVar);

    public abstract void a(String str, String str2);

    public abstract boolean a(InputStream inputStream);

    public abstract void b();

    public abstract void c();

    public final void d() {
        this.f16398e = false;
        a(new AnonymousClass1());
    }
}
