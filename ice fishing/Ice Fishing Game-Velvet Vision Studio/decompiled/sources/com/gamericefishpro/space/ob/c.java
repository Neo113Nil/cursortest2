package com.gamericefishpro.space.ob;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.gamericefishpro.space.bb.q;
import com.gamericefishpro.space.n9.y;
import com.gamericefishpro.space.r9.o;
import com.gamericefishpro.space.v8.c0;
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

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {
    public static final Object m = new Object();
    public final com.gamericefishpro.space.wa.g a;
    public final com.gamericefishpro.space.qb.c b;
    public final com.gamericefishpro.space.u6.c c;
    public final j d;
    public final q e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final com.gamericefishpro.space.cb.j i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(com.gamericefishpro.space.wa.g gVar, com.gamericefishpro.space.nb.a aVar, ExecutorService executorService, com.gamericefishpro.space.cb.j jVar) {
        gVar.a();
        com.gamericefishpro.space.qb.c cVar = new com.gamericefishpro.space.qb.c(gVar.a, aVar);
        com.gamericefishpro.space.u6.c cVar2 = new com.gamericefishpro.space.u6.c();
        cVar2.e = gVar;
        if (y.O == null) {
            y.O = new y(24);
        }
        y yVar = y.O;
        if (j.d == null) {
            j.d = new j(yVar);
        }
        j jVar2 = j.d;
        q qVar = new q(new com.gamericefishpro.space.bb.d(2, gVar));
        h hVar = new h();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = gVar;
        this.b = cVar;
        this.c = cVar2;
        this.d = jVar2;
        this.e = qVar;
        this.f = hVar;
        this.h = executorService;
        this.i = jVar;
    }

    public final void a() {
        com.gamericefishpro.space.pb.b bVarR;
        synchronized (m) {
            try {
                com.gamericefishpro.space.wa.g gVar = this.a;
                gVar.a();
                com.gamericefishpro.space.u6.e eVarB = com.gamericefishpro.space.u6.e.b(gVar.a);
                try {
                    bVarR = this.c.r();
                    int i = bVarR.b;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (z) {
                        String strF = f(bVarR);
                        com.gamericefishpro.space.u6.c cVar = this.c;
                        com.gamericefishpro.space.pb.a aVarA = bVarR.a();
                        aVarA.a = strF;
                        aVarA.b = 3;
                        bVarR = aVarA.a();
                        cVar.k(bVarR);
                    }
                    if (eVarB != null) {
                        eVarB.h();
                    }
                } catch (Throwable th) {
                    if (eVarB != null) {
                        eVarB.h();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(bVarR);
        this.i.execute(new b(this, 1));
    }

    public final com.gamericefishpro.space.pb.b b(com.gamericefishpro.space.pb.b bVar) throws e {
        int i;
        com.gamericefishpro.space.qb.b bVar2;
        com.gamericefishpro.space.qb.b bVarF;
        com.gamericefishpro.space.qb.c cVar = this.b;
        com.gamericefishpro.space.wa.g gVar = this.a;
        gVar.a();
        String str = gVar.c.a;
        String str2 = bVar.a;
        com.gamericefishpro.space.wa.g gVar2 = this.a;
        gVar2.a();
        String str3 = gVar2.c.g;
        String str4 = bVar.d;
        com.gamericefishpro.space.qb.d dVar = cVar.c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = com.gamericefishpro.space.qb.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    com.gamericefishpro.space.qb.c.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        bVarF = com.gamericefishpro.space.qb.c.f(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    com.gamericefishpro.space.qb.c.b(httpURLConnectionC, null, str, str3);
                    i = i2;
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            bVar2 = new com.gamericefishpro.space.qb.b(null, 0L, 3);
                        } else {
                            if (responseCode == 429) {
                                throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                bVar2 = new com.gamericefishpro.space.qb.b(null, 0L, 2);
                            }
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2 = i + 1;
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVarF = bVar2;
                        break;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused2) {
                i = i2;
            }
        }
        int iB = com.gamericefishpro.space.i3.e.b(bVarF.c);
        if (iB != 0) {
            if (iB == 1) {
                com.gamericefishpro.space.pb.a aVarA = bVar.a();
                aVarA.g = "BAD CONFIG";
                aVarA.b = 5;
                return aVarA.a();
            }
            if (iB != 2) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.j = null;
            }
            com.gamericefishpro.space.pb.a aVarA2 = bVar.a();
            aVarA2.b = 2;
            return aVarA2.a();
        }
        String str5 = bVarF.a;
        long j = bVarF.b;
        j jVar = this.d;
        jVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jVar.a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        com.gamericefishpro.space.pb.a aVarA3 = bVar.a();
        aVarA3.c = str5;
        aVarA3.e = j;
        byte b = (byte) (aVarA3.h | 1);
        aVarA3.f = seconds;
        aVarA3.h = (byte) (b | 2);
        return aVarA3.a();
    }

    public final o c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return com.gamericefishpro.space.d9.h.w(str);
        }
        com.gamericefishpro.space.r9.h hVar = new com.gamericefishpro.space.r9.h();
        g gVar = new g(hVar);
        synchronized (this.g) {
            this.l.add(gVar);
        }
        o oVar = hVar.a;
        this.h.execute(new b(this, 0));
        return oVar;
    }

    public final o d() {
        e();
        com.gamericefishpro.space.r9.h hVar = new com.gamericefishpro.space.r9.h();
        f fVar = new f(this.d, hVar);
        synchronized (this.g) {
            this.l.add(fVar);
        }
        o oVar = hVar.a;
        this.h.execute(new b(this, 2));
        return oVar;
    }

    public final void e() {
        com.gamericefishpro.space.wa.g gVar = this.a;
        gVar.a();
        c0.e(gVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        c0.e(gVar.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        c0.e(gVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.c.b;
        Pattern pattern = j.c;
        c0.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        c0.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.c.matcher(gVar.c.a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: all -> 0x003f, DONT_GENERATE, TRY_ENTER, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final String f(com.gamericefishpro.space.pb.b bVar) {
        com.gamericefishpro.space.pb.c cVar;
        String string;
        com.gamericefishpro.space.wa.g gVar = this.a;
        gVar.a();
        if (!gVar.b.equals("CHIME_ANDROID_SDK")) {
            com.gamericefishpro.space.wa.g gVar2 = this.a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.b)) {
                if (bVar.b == 1) {
                    cVar = (com.gamericefishpro.space.pb.c) this.e.get();
                    synchronized (cVar.a) {
                        try {
                            synchronized (cVar.a) {
                                string = cVar.a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = cVar.a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return h.a();
                }
            }
        } else if (bVar.b == 1) {
            cVar = (com.gamericefishpro.space.pb.c) this.e.get();
            synchronized (cVar.a) {
                synchronized (cVar.a) {
                    string = cVar.a.getString("|S|id", null);
                    if (string != null) {
                        string = cVar.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return h.a();
                }
            }
        }
        this.f.getClass();
        return h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.gamericefishpro.space.qb.c] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.gamericefishpro.space.qb.a] */
    public final com.gamericefishpro.space.pb.b g(com.gamericefishpro.space.pb.b bVar) throws e {
        String str = bVar.a;
        String string = null;
        if (str != null && str.length() == 11) {
            com.gamericefishpro.space.pb.c cVar = (com.gamericefishpro.space.pb.c) this.e.get();
            synchronized (cVar.a) {
                try {
                    String[] strArr = com.gamericefishpro.space.pb.c.c;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = cVar.a.getString("|T|" + cVar.b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.gamericefishpro.space.qb.c cVar2 = this.b;
        com.gamericefishpro.space.wa.g gVar = this.a;
        gVar.a();
        String str3 = gVar.c.a;
        String str4 = bVar.a;
        com.gamericefishpro.space.wa.g gVar2 = this.a;
        gVar2.a();
        String str5 = gVar2.c.g;
        com.gamericefishpro.space.wa.g gVar3 = this.a;
        gVar3.a();
        String str6 = gVar3.c.b;
        com.gamericefishpro.space.qb.d dVar = cVar2.c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = com.gamericefishpro.space.qb.c.a("projects/" + str5 + "/installations");
        int i2 = 0;
        com.gamericefishpro.space.qb.a aVar = cVar2;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    com.gamericefishpro.space.qb.c.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        com.gamericefishpro.space.qb.a aVarE = com.gamericefishpro.space.qb.c.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVarE;
                    } else {
                        try {
                            com.gamericefishpro.space.qb.c.b(httpURLConnectionC, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                com.gamericefishpro.space.qb.a aVar2 = new com.gamericefishpro.space.qb.a(null, null, null, null, 2);
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar = aVar2;
                            } else {
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i2++;
                                aVar = aVar;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        aVar = aVar;
                    }
                    int iB = com.gamericefishpro.space.i3.e.b(aVar.e);
                    if (iB != 0) {
                        if (iB != 1) {
                            throw new e("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        com.gamericefishpro.space.pb.a aVarA = bVar.a();
                        aVarA.g = "BAD CONFIG";
                        aVarA.b = 5;
                        return aVarA.a();
                    }
                    String str7 = aVar.b;
                    String str8 = aVar.c;
                    j jVar = this.d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    com.gamericefishpro.space.qb.b bVar2 = aVar.d;
                    String str9 = bVar2.a;
                    long j = bVar2.b;
                    com.gamericefishpro.space.pb.a aVarA2 = bVar.a();
                    aVarA2.a = str7;
                    aVarA2.b = 4;
                    aVarA2.c = str9;
                    aVarA2.d = str8;
                    aVarA2.e = j;
                    byte b = (byte) (aVarA2.h | 1);
                    aVarA2.f = seconds;
                    aVarA2.h = (byte) (b | 2);
                    return aVarA2.a();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(com.gamericefishpro.space.pb.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
