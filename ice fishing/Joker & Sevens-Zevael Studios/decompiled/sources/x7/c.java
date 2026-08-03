package x7;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import b0.q0;
import g7.o;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import l7.n;
import org.json.JSONException;
import org.json.JSONObject;
import p6.u;
import x4.l;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f8377m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final i7.g f8378a;

    /* renamed from: b, reason: collision with root package name */
    public final z7.c f8379b;

    /* renamed from: c, reason: collision with root package name */
    public final l f8380c;

    /* renamed from: d, reason: collision with root package name */
    public final k f8381d;

    /* renamed from: e, reason: collision with root package name */
    public final n f8382e;

    /* renamed from: f, reason: collision with root package name */
    public final i f8383f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8384g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f8385h;

    /* renamed from: i, reason: collision with root package name */
    public final m7.k f8386i;

    /* renamed from: j, reason: collision with root package name */
    public String f8387j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f8388k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f8389l;

    static {
        new AtomicInteger(1);
    }

    public c(i7.g gVar, w7.a aVar, ExecutorService executorService, m7.k kVar) {
        gVar.a();
        z7.c cVar = new z7.c(gVar.f3231a, aVar);
        l lVar = new l(gVar);
        if (u7.d.f6723g == null) {
            u7.d.f6723g = new u7.d();
        }
        u7.d dVar = u7.d.f6723g;
        if (k.f8397d == null) {
            k.f8397d = new k(dVar);
        }
        k kVar2 = k.f8397d;
        n nVar = new n(new l7.d(2, gVar));
        i iVar = new i();
        this.f8384g = new Object();
        this.f8388k = new HashSet();
        this.f8389l = new ArrayList();
        this.f8378a = gVar;
        this.f8379b = cVar;
        this.f8380c = lVar;
        this.f8381d = kVar2;
        this.f8382e = nVar;
        this.f8383f = iVar;
        this.f8385h = executorService;
        this.f8386i = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.f8380c;
        r2 = r2.a();
        r2.f8796a = r3;
        r2.f8797b = 3;
        r2 = r2.a();
        r4.h(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        y7.b j3;
        synchronized (f8377m) {
            try {
                i7.g gVar = this.f8378a;
                gVar.a();
                s a6 = s.a(gVar.f3231a);
                try {
                    j3 = this.f8380c.j();
                    int i10 = j3.f8804b;
                    boolean z10 = true;
                    if (i10 != 2 && i10 != 1) {
                        z10 = false;
                    }
                    if (a6 != null) {
                        a6.j();
                    }
                } catch (Throwable th) {
                    if (a6 != null) {
                        a6.j();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(j3);
        this.f8386i.execute(new b(this, 2));
    }

    public final y7.b b(y7.b bVar) {
        int responseCode;
        z7.b f10;
        z7.c cVar = this.f8379b;
        i7.g gVar = this.f8378a;
        gVar.a();
        String str = gVar.f3233c.f3245a;
        String str2 = bVar.f8803a;
        i7.g gVar2 = this.f8378a;
        gVar2.a();
        String str3 = gVar2.f3233c.f3251g;
        String str4 = bVar.f8806d;
        z7.d dVar = cVar.f9171c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a6 = z7.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c3 = cVar.c(a6, str);
            try {
                try {
                    c3.setRequestMethod("POST");
                    c3.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c3.setDoOutput(true);
                    z7.c.h(c3);
                    responseCode = c3.getResponseCode();
                    dVar.b(responseCode);
                } finally {
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f10 = z7.c.f(c3);
            } else {
                z7.c.b(c3, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    q0 a8 = z7.b.a();
                    a8.f873a = 3;
                    f10 = a8.a();
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        q0 a10 = z7.b.a();
                        a10.f873a = 2;
                        f10 = a10.a();
                    }
                }
            }
            int d10 = v.f.d(f10.f9166c);
            if (d10 != 0) {
                if (d10 == 1) {
                    y7.a a11 = bVar.a();
                    a11.f8802g = "BAD CONFIG";
                    a11.f8797b = 5;
                    return a11.a();
                }
                if (d10 != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.f8387j = null;
                }
                y7.a a12 = bVar.a();
                a12.f8797b = 2;
                return a12.a();
            }
            String str5 = f10.f9164a;
            long j3 = f10.f9165b;
            k kVar = this.f8381d;
            kVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            kVar.f8398a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            y7.a a13 = bVar.a();
            a13.f8798c = str5;
            a13.f8800e = Long.valueOf(j3);
            a13.f8801f = Long.valueOf(seconds);
            return a13.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final o c() {
        String str;
        e();
        synchronized (this) {
            str = this.f8387j;
        }
        if (str != null) {
            return i7.b.u(str);
        }
        g7.h hVar = new g7.h();
        h hVar2 = new h(hVar);
        synchronized (this.f8384g) {
            this.f8389l.add(hVar2);
        }
        o oVar = hVar.f2537a;
        this.f8385h.execute(new b(this, 0));
        return oVar;
    }

    public final o d() {
        e();
        g7.h hVar = new g7.h();
        g gVar = new g(this.f8381d, hVar);
        synchronized (this.f8384g) {
            this.f8389l.add(gVar);
        }
        o oVar = hVar.f2537a;
        this.f8385h.execute(new b(this, 1));
        return oVar;
    }

    public final void e() {
        i7.g gVar = this.f8378a;
        gVar.a();
        u.d(gVar.f3233c.f3246b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        u.d(gVar.f3233c.f3251g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        u.d(gVar.f3233c.f3245a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f3233c.f3246b;
        Pattern pattern = k.f8396c;
        u.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        u.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.f8396c.matcher(gVar.f3233c.f3245a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f3232b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(y7.b bVar) {
        String string;
        i7.g gVar = this.f8378a;
        gVar.a();
        if (!gVar.f3232b.equals("CHIME_ANDROID_SDK")) {
            i7.g gVar2 = this.f8378a;
            gVar2.a();
        }
        if (bVar.f8804b == 1) {
            y7.c cVar = (y7.c) this.f8382e.get();
            synchronized (cVar.f8811a) {
                try {
                    synchronized (cVar.f8811a) {
                        string = cVar.f8811a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = cVar.a();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f8383f.getClass();
            return i.a();
        }
        this.f8383f.getClass();
        return i.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [z7.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [z7.a] */
    public final y7.b g(y7.b bVar) {
        int responseCode;
        String str = bVar.f8803a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            y7.c cVar = (y7.c) this.f8382e.get();
            synchronized (cVar.f8811a) {
                try {
                    String[] strArr = y7.c.f8810c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String string = cVar.f8811a.getString("|T|" + cVar.f8812b + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i10++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        z7.c cVar2 = this.f8379b;
        i7.g gVar = this.f8378a;
        gVar.a();
        String str4 = gVar.f3233c.f3245a;
        String str5 = bVar.f8803a;
        i7.g gVar2 = this.f8378a;
        gVar2.a();
        String str6 = gVar2.f3233c.f3251g;
        i7.g gVar3 = this.f8378a;
        gVar3.a();
        String str7 = gVar3.f3233c.f3246b;
        z7.d dVar = cVar2.f9171c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a6 = z7.c.a("projects/" + str6 + "/installations");
        int i11 = 0;
        z7.a aVar = cVar2;
        while (i11 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c3 = aVar.c(a6, str4);
            try {
                try {
                    c3.setRequestMethod("POST");
                    c3.setDoOutput(true);
                    if (str2 != null) {
                        c3.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    z7.c.g(c3, str5, str7);
                    responseCode = c3.getResponseCode();
                    dVar.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    z7.a e10 = z7.c.e(c3);
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = e10;
                } else {
                    try {
                        z7.c.b(c3, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c3.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar = aVar;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        z7.a aVar2 = new z7.a(null, null, null, null, 2);
                        c3.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVar2;
                    } else {
                        c3.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar = aVar;
                    }
                }
                int d10 = v.f.d(aVar.f9163e);
                if (d10 != 0) {
                    if (d10 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    y7.a a8 = bVar.a();
                    a8.f8802g = "BAD CONFIG";
                    a8.f8797b = 5;
                    return a8.a();
                }
                String str8 = aVar.f9160b;
                String str9 = aVar.f9161c;
                k kVar = this.f8381d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f8398a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                z7.b bVar2 = aVar.f9162d;
                String str10 = bVar2.f9164a;
                long j3 = bVar2.f9165b;
                y7.a a10 = bVar.a();
                a10.f8796a = str8;
                a10.f8797b = 4;
                a10.f8798c = str10;
                a10.f8799d = str9;
                a10.f8800e = Long.valueOf(j3);
                a10.f8801f = Long.valueOf(seconds);
                return a10.a();
            } finally {
                c3.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f8384g) {
            try {
                Iterator it = this.f8389l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(y7.b bVar) {
        synchronized (this.f8384g) {
            try {
                Iterator it = this.f8389l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
