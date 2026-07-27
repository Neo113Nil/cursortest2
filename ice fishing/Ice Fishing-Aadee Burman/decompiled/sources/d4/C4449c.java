package d4;

import P2.w;
import R3.n;
import S0.l;
import S0.s;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import c4.InterfaceC0542a;
import e4.C4463a;
import e4.C4464b;
import f4.C4509a;
import g7.m;
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
import u.AbstractC5049e;

/* renamed from: d4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4449c implements InterfaceC4450d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f37051m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final O3.g f37052a;

    /* renamed from: b, reason: collision with root package name */
    public final f4.c f37053b;

    /* renamed from: c, reason: collision with root package name */
    public final s f37054c;

    /* renamed from: d, reason: collision with root package name */
    public final k f37055d;

    /* renamed from: e, reason: collision with root package name */
    public final n f37056e;

    /* renamed from: f, reason: collision with root package name */
    public final i f37057f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f37058g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f37059h;
    public final S3.j i;

    /* renamed from: j, reason: collision with root package name */
    public String f37060j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f37061k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f37062l;

    static {
        new AtomicInteger(1);
    }

    public C4449c(O3.g gVar, InterfaceC0542a interfaceC0542a, ExecutorService executorService, S3.j jVar) {
        gVar.a();
        f4.c cVar = new f4.c(gVar.f2345a, interfaceC0542a);
        s sVar = new s(gVar);
        if (a4.e.f4348u == null) {
            a4.e.f4348u = new a4.e();
        }
        a4.e eVar = a4.e.f4348u;
        if (k.f37071d == null) {
            k.f37071d = new k(eVar);
        }
        k kVar = k.f37071d;
        n nVar = new n(new R3.d(2, gVar));
        i iVar = new i();
        this.f37058g = new Object();
        this.f37061k = new HashSet();
        this.f37062l = new ArrayList();
        this.f37052a = gVar;
        this.f37053b = cVar;
        this.f37054c = sVar;
        this.f37055d = kVar;
        this.f37056e = nVar;
        this.f37057f = iVar;
        this.f37059h = executorService;
        this.i = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.f37054c;
        r2 = r2.a();
        r2.f37664b = r3;
        r2.f37665c = 3;
        r2 = r2.a();
        r4.l(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C4463a m4;
        synchronized (f37051m) {
            try {
                O3.g gVar = this.f37052a;
                gVar.a();
                l A9 = l.A(gVar.f2345a);
                try {
                    m4 = this.f37054c.m();
                    int i = m4.f37196b;
                    boolean z3 = true;
                    if (i != 2 && i != 1) {
                        z3 = false;
                    }
                    if (A9 != null) {
                        A9.H();
                    }
                } catch (Throwable th) {
                    if (A9 != null) {
                        A9.H();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(m4);
        this.i.execute(new RunnableC4448b(this, 2));
    }

    public final C4463a b(C4463a c4463a) {
        int responseCode;
        f4.b f3;
        O3.g gVar = this.f37052a;
        gVar.a();
        String str = gVar.f2347c.f2358a;
        String str2 = c4463a.f37195a;
        O3.g gVar2 = this.f37052a;
        gVar2.a();
        String str3 = gVar2.f2347c.f2364g;
        String str4 = c4463a.f37198d;
        f4.c cVar = this.f37053b;
        f4.d dVar = cVar.f37506c;
        if (!dVar.a()) {
            throw new C4451e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a9 = f4.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c9 = cVar.c(a9, str);
            try {
                try {
                    c9.setRequestMethod("POST");
                    c9.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c9.setDoOutput(true);
                    f4.c.h(c9);
                    responseCode = c9.getResponseCode();
                    dVar.b(responseCode);
                } catch (Throwable th) {
                    c9.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f3 = f4.c.f(c9);
            } else {
                f4.c.b(c9, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    F.d a10 = f4.b.a();
                    a10.f854b = 3;
                    f3 = a10.c();
                } else {
                    if (responseCode == 429) {
                        throw new C4451e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        F.d a11 = f4.b.a();
                        a11.f854b = 2;
                        f3 = a11.c();
                    }
                    c9.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            c9.disconnect();
            TrafficStats.clearThreadStatsTag();
            int d2 = AbstractC5049e.d(f3.f37501c);
            if (d2 == 0) {
                k kVar = this.f37055d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f37072a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                m a12 = c4463a.a();
                a12.f37666d = f3.f37499a;
                a12.f37668f = Long.valueOf(f3.f37500b);
                a12.f37669g = Long.valueOf(seconds);
                return a12.a();
            }
            if (d2 == 1) {
                m a13 = c4463a.a();
                a13.f37670h = "BAD CONFIG";
                a13.f37665c = 5;
                return a13.a();
            }
            if (d2 != 2) {
                throw new C4451e("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.f37060j = null;
            }
            m a14 = c4463a.a();
            a14.f37665c = 2;
            return a14.a();
        }
        throw new C4451e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final j3.m c() {
        String str;
        e();
        synchronized (this) {
            str = this.f37060j;
        }
        if (str != null) {
            return S0.f.i(str);
        }
        j3.h hVar = new j3.h();
        h hVar2 = new h(hVar);
        synchronized (this.f37058g) {
            this.f37062l.add(hVar2);
        }
        j3.m mVar = hVar.f38358a;
        this.f37059h.execute(new RunnableC4448b(this, 0));
        return mVar;
    }

    public final j3.m d() {
        e();
        j3.h hVar = new j3.h();
        g gVar = new g(this.f37055d, hVar);
        synchronized (this.f37058g) {
            this.f37062l.add(gVar);
        }
        this.f37059h.execute(new RunnableC4448b(this, 1));
        return hVar.f38358a;
    }

    public final void e() {
        O3.g gVar = this.f37052a;
        gVar.a();
        w.f(gVar.f2347c.f2359b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        w.f(gVar.f2347c.f2364g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        w.f(gVar.f2347c.f2358a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f2347c.f2359b;
        Pattern pattern = k.f37070c;
        w.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        w.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.f37070c.matcher(gVar.f2347c.f2358a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f2346b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(C4463a c4463a) {
        String string;
        O3.g gVar = this.f37052a;
        gVar.a();
        if (!gVar.f2346b.equals("CHIME_ANDROID_SDK")) {
            O3.g gVar2 = this.f37052a;
            gVar2.a();
        }
        if (c4463a.f37196b == 1) {
            C4464b c4464b = (C4464b) this.f37056e.get();
            synchronized (c4464b.f37203a) {
                try {
                    synchronized (c4464b.f37203a) {
                        string = c4464b.f37203a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = c4464b.a();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f37057f.getClass();
            return i.a();
        }
        this.f37057f.getClass();
        return i.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [f4.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [f4.a] */
    public final C4463a g(C4463a c4463a) {
        int responseCode;
        String str = c4463a.f37195a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            C4464b c4464b = (C4464b) this.f37056e.get();
            synchronized (c4464b.f37203a) {
                try {
                    String[] strArr = C4464b.f37202c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str3 = strArr[i];
                            String string = c4464b.f37203a.getString("|T|" + c4464b.f37204b + com.anythink.expressad.foundation.g.a.bU + str3, null);
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
        f4.c cVar = this.f37053b;
        O3.g gVar = this.f37052a;
        gVar.a();
        String str4 = gVar.f2347c.f2358a;
        String str5 = c4463a.f37195a;
        O3.g gVar2 = this.f37052a;
        gVar2.a();
        String str6 = gVar2.f2347c.f2364g;
        O3.g gVar3 = this.f37052a;
        gVar3.a();
        String str7 = gVar3.f2347c.f2359b;
        f4.d dVar = cVar.f37506c;
        if (!dVar.a()) {
            throw new C4451e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a9 = f4.c.a("projects/" + str6 + "/installations");
        int i6 = 0;
        C4509a c4509a = cVar;
        while (i6 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c9 = c4509a.c(a9, str4);
            try {
                try {
                    c9.setRequestMethod("POST");
                    c9.setDoOutput(true);
                    if (str2 != null) {
                        c9.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    f4.c.g(c9, str5, str7);
                    responseCode = c9.getResponseCode();
                    dVar.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    C4509a e9 = f4.c.e(c9);
                    c9.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c4509a = e9;
                } else {
                    try {
                        f4.c.b(c9, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c9.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i6++;
                        c4509a = c4509a;
                    }
                    if (responseCode == 429) {
                        throw new C4451e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C4509a c4509a2 = new C4509a(null, null, null, null, 2);
                        c9.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c4509a = c4509a2;
                    } else {
                        c9.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i6++;
                        c4509a = c4509a;
                    }
                }
                int d2 = AbstractC5049e.d(c4509a.f37498e);
                if (d2 != 0) {
                    if (d2 != 1) {
                        throw new C4451e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    m a10 = c4463a.a();
                    a10.f37670h = "BAD CONFIG";
                    a10.f37665c = 5;
                    return a10.a();
                }
                String str8 = c4509a.f37495b;
                String str9 = c4509a.f37496c;
                k kVar = this.f37055d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f37072a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                f4.b bVar = c4509a.f37497d;
                String str10 = bVar.f37499a;
                long j6 = bVar.f37500b;
                m a11 = c4463a.a();
                a11.f37664b = str8;
                a11.f37665c = 4;
                a11.f37666d = str10;
                a11.f37667e = str9;
                a11.f37668f = Long.valueOf(j6);
                a11.f37669g = Long.valueOf(seconds);
                return a11.a();
            } finally {
                c9.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new C4451e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f37058g) {
            try {
                Iterator it = this.f37062l.iterator();
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

    public final void i(C4463a c4463a) {
        synchronized (this.f37058g) {
            try {
                Iterator it = this.f37062l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(c4463a)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
