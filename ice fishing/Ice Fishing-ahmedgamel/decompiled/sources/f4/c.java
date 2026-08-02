package f4;

import R2.w;
import S0.l;
import S0.s;
import T3.n;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import e4.InterfaceC4481a;
import g4.C4532a;
import g4.C4533b;
import g7.m;
import h4.C4574a;
import h4.C4575b;
import h4.C4576c;
import h4.C4577d;
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
import org.json.JSONException;
import org.json.JSONObject;
import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f37453m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Q3.g f37454a;

    /* renamed from: b, reason: collision with root package name */
    public final C4576c f37455b;

    /* renamed from: c, reason: collision with root package name */
    public final s f37456c;

    /* renamed from: d, reason: collision with root package name */
    public final j f37457d;

    /* renamed from: e, reason: collision with root package name */
    public final n f37458e;

    /* renamed from: f, reason: collision with root package name */
    public final h f37459f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f37460g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f37461h;
    public final U3.i i;

    /* renamed from: j, reason: collision with root package name */
    public String f37462j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f37463k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f37464l;

    static {
        new AtomicInteger(1);
    }

    public c(Q3.g gVar, InterfaceC4481a interfaceC4481a, ExecutorService executorService, U3.i iVar) {
        gVar.a();
        C4576c c4576c = new C4576c(gVar.f2661a, interfaceC4481a);
        s sVar = new s(gVar);
        if (c4.e.f5740n == null) {
            c4.e.f5740n = new c4.e();
        }
        c4.e eVar = c4.e.f5740n;
        if (j.f37472d == null) {
            j.f37472d = new j(eVar);
        }
        j jVar = j.f37472d;
        n nVar = new n(new T3.d(2, gVar));
        h hVar = new h();
        this.f37460g = new Object();
        this.f37463k = new HashSet();
        this.f37464l = new ArrayList();
        this.f37454a = gVar;
        this.f37455b = c4576c;
        this.f37456c = sVar;
        this.f37457d = jVar;
        this.f37458e = nVar;
        this.f37459f = hVar;
        this.f37461h = executorService;
        this.i = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.f37456c;
        r2 = r2.a();
        r2.f37689b = r3;
        r2.f37690c = 3;
        r2 = r2.a();
        r4.j(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C4532a m9;
        synchronized (f37453m) {
            try {
                Q3.g gVar = this.f37454a;
                gVar.a();
                l E8 = l.E(gVar.f2661a);
                try {
                    m9 = this.f37456c.m();
                    int i = m9.f37672b;
                    boolean z6 = true;
                    if (i != 2 && i != 1) {
                        z6 = false;
                    }
                    if (E8 != null) {
                        E8.G();
                    }
                } catch (Throwable th) {
                    if (E8 != null) {
                        E8.G();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(m9);
        this.i.execute(new b(this, 2));
    }

    public final C4532a b(C4532a c4532a) {
        int responseCode;
        C4575b f2;
        Q3.g gVar = this.f37454a;
        gVar.a();
        String str = gVar.f2663c.f2674a;
        String str2 = c4532a.f37671a;
        Q3.g gVar2 = this.f37454a;
        gVar2.a();
        String str3 = gVar2.f2663c.f2680g;
        String str4 = c4532a.f37674d;
        C4576c c4576c = this.f37455b;
        C4577d c4577d = c4576c.f38130c;
        if (!c4577d.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a9 = C4576c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c9 = c4576c.c(a9, str);
            try {
                try {
                    c9.setRequestMethod("POST");
                    c9.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c9.setDoOutput(true);
                    C4576c.h(c9);
                    responseCode = c9.getResponseCode();
                    c4577d.b(responseCode);
                } catch (Throwable th) {
                    c9.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f2 = C4576c.f(c9);
            } else {
                C4576c.b(c9, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    F.d a10 = C4575b.a();
                    a10.f917b = 3;
                    f2 = a10.c();
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        F.d a11 = C4575b.a();
                        a11.f917b = 2;
                        f2 = a11.c();
                    }
                    c9.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            c9.disconnect();
            TrafficStats.clearThreadStatsTag();
            int d9 = AbstractC5050e.d(f2.f38125c);
            if (d9 == 0) {
                j jVar = this.f37457d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f37473a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                m a12 = c4532a.a();
                a12.f37691d = f2.f38123a;
                a12.f37693f = Long.valueOf(f2.f38124b);
                a12.f37694g = Long.valueOf(seconds);
                return a12.a();
            }
            if (d9 == 1) {
                m a13 = c4532a.a();
                a13.f37695h = "BAD CONFIG";
                a13.f37690c = 5;
                return a13.a();
            }
            if (d9 != 2) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.f37462j = null;
            }
            m a14 = c4532a.a();
            a14.f37690c = 2;
            return a14.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final l3.m c() {
        String str;
        e();
        synchronized (this) {
            str = this.f37462j;
        }
        if (str != null) {
            return com.bumptech.glide.d.r(str);
        }
        l3.h hVar = new l3.h();
        g gVar = new g(hVar);
        synchronized (this.f37460g) {
            this.f37464l.add(gVar);
        }
        l3.m mVar = hVar.f38870a;
        this.f37461h.execute(new b(this, 0));
        return mVar;
    }

    public final l3.m d() {
        e();
        l3.h hVar = new l3.h();
        f fVar = new f(this.f37457d, hVar);
        synchronized (this.f37460g) {
            this.f37464l.add(fVar);
        }
        this.f37461h.execute(new b(this, 1));
        return hVar.f38870a;
    }

    public final void e() {
        Q3.g gVar = this.f37454a;
        gVar.a();
        w.f(gVar.f2663c.f2675b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        w.f(gVar.f2663c.f2680g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        w.f(gVar.f2663c.f2674a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f2663c.f2675b;
        Pattern pattern = j.f37471c;
        w.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        w.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f37471c.matcher(gVar.f2663c.f2674a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f2662b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(C4532a c4532a) {
        String string;
        Q3.g gVar = this.f37454a;
        gVar.a();
        if (!gVar.f2662b.equals("CHIME_ANDROID_SDK")) {
            Q3.g gVar2 = this.f37454a;
            gVar2.a();
        }
        if (c4532a.f37672b == 1) {
            C4533b c4533b = (C4533b) this.f37458e.get();
            synchronized (c4533b.f37679a) {
                try {
                    synchronized (c4533b.f37679a) {
                        string = c4533b.f37679a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = c4533b.a();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f37459f.getClass();
            return h.a();
        }
        this.f37459f.getClass();
        return h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [h4.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [h4.a] */
    public final C4532a g(C4532a c4532a) {
        int responseCode;
        String str = c4532a.f37671a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            C4533b c4533b = (C4533b) this.f37458e.get();
            synchronized (c4533b.f37679a) {
                try {
                    String[] strArr = C4533b.f37678c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str3 = strArr[i];
                            String string = c4533b.f37679a.getString("|T|" + c4533b.f37680b + com.anythink.expressad.foundation.g.a.bU + str3, null);
                            if (string == null || string.isEmpty()) {
                                i++;
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
        C4576c c4576c = this.f37455b;
        Q3.g gVar = this.f37454a;
        gVar.a();
        String str4 = gVar.f2663c.f2674a;
        String str5 = c4532a.f37671a;
        Q3.g gVar2 = this.f37454a;
        gVar2.a();
        String str6 = gVar2.f2663c.f2680g;
        Q3.g gVar3 = this.f37454a;
        gVar3.a();
        String str7 = gVar3.f2663c.f2675b;
        C4577d c4577d = c4576c.f38130c;
        if (!c4577d.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a9 = C4576c.a("projects/" + str6 + "/installations");
        int i4 = 0;
        C4574a c4574a = c4576c;
        while (i4 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c9 = c4574a.c(a9, str4);
            try {
                try {
                    c9.setRequestMethod("POST");
                    c9.setDoOutput(true);
                    if (str2 != null) {
                        c9.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    C4576c.g(c9, str5, str7);
                    responseCode = c9.getResponseCode();
                    c4577d.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    C4574a e9 = C4576c.e(c9);
                    c9.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c4574a = e9;
                } else {
                    try {
                        C4576c.b(c9, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c9.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i4++;
                        c4574a = c4574a;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C4574a c4574a2 = new C4574a(null, null, null, null, 2);
                        c9.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c4574a = c4574a2;
                    } else {
                        c9.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i4++;
                        c4574a = c4574a;
                    }
                }
                int d9 = AbstractC5050e.d(c4574a.f38122e);
                if (d9 != 0) {
                    if (d9 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    m a10 = c4532a.a();
                    a10.f37695h = "BAD CONFIG";
                    a10.f37690c = 5;
                    return a10.a();
                }
                String str8 = c4574a.f38119b;
                String str9 = c4574a.f38120c;
                j jVar = this.f37457d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f37473a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C4575b c4575b = c4574a.f38121d;
                String str10 = c4575b.f38123a;
                long j6 = c4575b.f38124b;
                m a11 = c4532a.a();
                a11.f37689b = str8;
                a11.f37690c = 4;
                a11.f37691d = str10;
                a11.f37692e = str9;
                a11.f37693f = Long.valueOf(j6);
                a11.f37694g = Long.valueOf(seconds);
                return a11.a();
            } finally {
                c9.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f37460g) {
            try {
                Iterator it = this.f37464l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(C4532a c4532a) {
        synchronized (this.f37460g) {
            try {
                Iterator it = this.f37464l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(c4532a)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
