package x2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2521Ce;
import com.google.android.gms.internal.ads.C3324ha;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import s2.C4949p;
import s2.r;

/* loaded from: classes.dex */
public final class l implements c {

    /* renamed from: n, reason: collision with root package name */
    public final Context f41877n;

    /* renamed from: u, reason: collision with root package name */
    public final String f41878u;

    /* renamed from: v, reason: collision with root package name */
    public String f41879v;

    public l(Context context, String str) {
        this.f41877n = context;
        this.f41878u = str;
    }

    public final k a(HashMap hashMap, String str) {
        k kVar = k.f41874v;
        k kVar2 = k.f41873u;
        if (str != null) {
            C3324ha c3324ha = AbstractC3592ma.f33030g;
            r rVar = r.f40506e;
            if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.f33015e3)).booleanValue() || !C4949p.f40498g.f40501c) {
                    try {
                        StringBuilder sb = new StringBuilder(str.length() + 13);
                        sb.append("Pinging URL: ");
                        sb.append(str);
                        i.a(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) c(str).openConnection();
                        try {
                            d dVar = C4949p.f40498g.f40499a;
                            String str2 = this.f41878u;
                            httpURLConnection.setConnectTimeout(60000);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setReadTimeout(60000);
                            if (str2 != null) {
                                httpURLConnection.setRequestProperty("User-Agent", str2);
                            }
                            httpURLConnection.setUseCaches(false);
                            if (hashMap != null) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            f fVar = new f();
                            fVar.a(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            fVar.b(httpURLConnection, responseCode);
                            if (responseCode >= 200 && responseCode < 300) {
                                if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.V8)).booleanValue()) {
                                    this.f41879v = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                kVar2 = k.f41872n;
                                httpURLConnection.disconnect();
                                return kVar2;
                            }
                            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(str);
                            i.f(sb2.toString());
                            if (responseCode == 502) {
                                kVar2 = kVar;
                            }
                            httpURLConnection.disconnect();
                            return kVar2;
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (MalformedURLException e9) {
                        e = e9;
                        kVar = kVar2;
                        d(str, e);
                        return kVar;
                    } catch (IOException e10) {
                        e = e10;
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + str.length() + 27);
                        sb3.append("Error while pinging URL: ");
                        sb3.append(str);
                        sb3.append(". ");
                        sb3.append(message);
                        i.f(sb3.toString());
                        return kVar;
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                        kVar = kVar2;
                        d(str, e);
                        return kVar;
                    } catch (RuntimeException e12) {
                        e = e12;
                        String message2 = e.getMessage();
                        StringBuilder sb32 = new StringBuilder(String.valueOf(message2).length() + str.length() + 27);
                        sb32.append("Error while pinging URL: ");
                        sb32.append(str);
                        sb32.append(". ");
                        sb32.append(message2);
                        i.f(sb32.toString());
                        return kVar;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return kVar2;
    }

    @Override // x2.c
    public final k b(String str) {
        return a(null, str);
    }

    public final URL c(String str) {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e9) {
            e = e9;
            d(str, e);
        } catch (MalformedURLException e10) {
            e = e10;
            d(str, e);
        } catch (URISyntaxException e11) {
            d(str, e11);
            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f33021f)).booleanValue()) {
                try {
                    i.a("Attempting to parse components, encode, and reconstruct URI.");
                    URL url2 = new URL(str);
                    URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    url = uri.toURL();
                    String obj = uri.toString();
                    StringBuilder sb = new StringBuilder(str.length() + 114 + obj.length());
                    sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                    sb.append(str);
                    sb.append("\" -> encoded URI: ");
                    sb.append(obj);
                    i.a(sb.toString());
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e12) {
                    d(str, e12);
                }
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 47);
        sb2.append("Falling back to direct new URL(\"");
        sb2.append(str);
        sb2.append("\") constructor.");
        i.a(sb2.toString());
        return new URL(str);
    }

    public final void d(String str, Exception exc) {
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        i.f(sb.toString());
        C2521Ce.a(this.f41877n).f(exc, "HttpUrlPinger.pingUrl", ((Integer) r.f40506e.f40509c.a(AbstractC3592ma.ie)).intValue() / 100.0f);
    }
}
