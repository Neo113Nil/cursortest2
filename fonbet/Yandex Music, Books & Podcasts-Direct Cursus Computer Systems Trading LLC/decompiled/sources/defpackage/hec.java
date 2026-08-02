package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.connectsdk.service.command.ServiceCommand;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hec implements iec {
    public static final Object m = new Object();
    public final aec a;
    public final fec b;
    public final qdc c;
    public final ovt d;
    public final brf e;
    public final shn f;
    public final Object g;
    public final ExecutorService h;
    public final lhp i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public hec(aec aecVar, uzm uzmVar, ExecutorService executorService, lhp lhpVar) {
        aecVar.a();
        fec fecVar = new fec(aecVar.a, uzmVar);
        qdc qdcVar = new qdc(22, aecVar);
        if (ybl.a == null) {
            ybl.a = new ybl();
        }
        ybl yblVar = ybl.a;
        if (ovt.c == null) {
            ovt.c = new ovt(yblVar);
        }
        ovt ovtVar = ovt.c;
        brf brfVar = new brf(new mn5(2, aecVar));
        shn shnVar = new shn();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = aecVar;
        this.b = fecVar;
        this.c = qdcVar;
        this.d = ovtVar;
        this.e = brfVar;
        this.f = shnVar;
        this.h = executorService;
        this.i = lhpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.c;
        r2 = r2.a();
        r2.c = r3;
        r2.b = 3;
        r2 = r2.i();
        r4.y(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        sd2 J;
        synchronized (m) {
            try {
                aec aecVar = this.a;
                aecVar.a();
                xiu b = xiu.b(aecVar.a);
                try {
                    J = this.c.J();
                    int i = J.b;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (b != null) {
                        b.C();
                    }
                } catch (Throwable th) {
                    if (b != null) {
                        b.C();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(J);
        this.i.execute(new gec(this, 2));
    }

    public final sd2 b(sd2 sd2Var) {
        int responseCode;
        ce2 f;
        fec fecVar = this.b;
        aec aecVar = this.a;
        aecVar.a();
        String str = aecVar.c.a;
        String str2 = sd2Var.a;
        aec aecVar2 = this.a;
        aecVar2.a();
        String str3 = aecVar2.c.g;
        String str4 = sd2Var.d;
        wx0 wx0Var = fecVar.c;
        if (!wx0Var.b()) {
            throw new jec("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a = fec.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c = fecVar.c(a, str);
            try {
                try {
                    c.setRequestMethod(ServiceCommand.TYPE_POST);
                    c.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c.setDoOutput(true);
                    fec.h(c);
                    responseCode = c.getResponseCode();
                    wx0Var.d(responseCode);
                } finally {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f = fec.f(c);
            } else {
                fec.b(c, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    x0 a2 = ce2.a();
                    a2.b = 3;
                    f = a2.o();
                } else {
                    if (responseCode == 429) {
                        throw new jec("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        x0 a3 = ce2.a();
                        a3.b = 2;
                        f = a3.o();
                    }
                }
            }
            int D = ouj.D(f.c);
            if (D == 0) {
                String str5 = f.a;
                long j = f.b;
                this.d.a.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                rd2 a4 = sd2Var.a();
                a4.d = str5;
                a4.g = Long.valueOf(j);
                a4.h = Long.valueOf(currentTimeMillis);
                return a4.i();
            }
            if (D == 1) {
                rd2 a5 = sd2Var.a();
                a5.f = "BAD CONFIG";
                a5.b = 5;
                return a5.i();
            }
            if (D != 2) {
                throw new jec("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.j = null;
            }
            rd2 a6 = sd2Var.a();
            a6.b = 2;
            return a6.i();
        }
        throw new jec("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final onx c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return ywf.w(str);
        }
        i8s i8sVar = new i8s();
        u8d u8dVar = new u8d(i8sVar);
        synchronized (this.g) {
            this.l.add(u8dVar);
        }
        onx onxVar = i8sVar.a;
        this.h.execute(new gec(this, 0));
        return onxVar;
    }

    public final onx d() {
        e();
        i8s i8sVar = new i8s();
        b7d b7dVar = new b7d(this.d, i8sVar);
        synchronized (this.g) {
            this.l.add(b7dVar);
        }
        onx onxVar = i8sVar.a;
        this.h.execute(new gec(this, 1));
        return onxVar;
    }

    public final void e() {
        aec aecVar = this.a;
        aecVar.a();
        y1g.D(aecVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        aecVar.a();
        y1g.D(aecVar.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        aecVar.a();
        y1g.D(aecVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        aecVar.a();
        String str = aecVar.c.b;
        Pattern pattern = ovt.b;
        y1g.y("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER));
        aecVar.a();
        y1g.y("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", ovt.b.matcher(aecVar.c.a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(sd2 sd2Var) {
        String string;
        aec aecVar = this.a;
        aecVar.a();
        if (!aecVar.b.equals("CHIME_ANDROID_SDK")) {
            aec aecVar2 = this.a;
            aecVar2.a();
        }
        if (sd2Var.b == 1) {
            bbe bbeVar = (bbe) this.e.get();
            synchronized (bbeVar.a) {
                try {
                    synchronized (bbeVar.a) {
                        string = bbeVar.a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = bbeVar.a();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f.getClass();
            return shn.a();
        }
        this.f.getClass();
        return shn.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [fec] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [jd2] */
    public final sd2 g(sd2 sd2Var) {
        int responseCode;
        String str = sd2Var.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            bbe bbeVar = (bbe) this.e.get();
            synchronized (bbeVar.a) {
                try {
                    String[] strArr = bbe.c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str3 = strArr[i];
                            String string = bbeVar.a.getString("|T|" + bbeVar.b + "|" + str3, null);
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
        fec fecVar = this.b;
        aec aecVar = this.a;
        aecVar.a();
        String str4 = aecVar.c.a;
        String str5 = sd2Var.a;
        aec aecVar2 = this.a;
        aecVar2.a();
        String str6 = aecVar2.c.g;
        aec aecVar3 = this.a;
        aecVar3.a();
        String str7 = aecVar3.c.b;
        wx0 wx0Var = fecVar.c;
        if (!wx0Var.b()) {
            throw new jec("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a = fec.a("projects/" + str6 + "/installations");
        int i2 = 0;
        jd2 jd2Var = fecVar;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c = jd2Var.c(a, str4);
            try {
                try {
                    c.setRequestMethod(ServiceCommand.TYPE_POST);
                    c.setDoOutput(true);
                    if (str2 != null) {
                        c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    fec.g(c, str5, str7);
                    responseCode = c.getResponseCode();
                    wx0Var.d(responseCode);
                } finally {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                jd2 e = fec.e(c);
                c.disconnect();
                TrafficStats.clearThreadStatsTag();
                jd2Var = e;
            } else {
                try {
                    fec.b(c, str7, str4, str6);
                } catch (IOException | AssertionError unused3) {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                    jd2Var = jd2Var;
                }
                if (responseCode == 429) {
                    throw new jec("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    jd2 jd2Var2 = new jd2(null, null, null, null, 2);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    jd2Var = jd2Var2;
                } else {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                    jd2Var = jd2Var;
                }
            }
            int D = ouj.D(jd2Var.e);
            if (D != 0) {
                if (D != 1) {
                    throw new jec("Firebase Installations Service is unavailable. Please try again later.");
                }
                rd2 a2 = sd2Var.a();
                a2.f = "BAD CONFIG";
                a2.b = 5;
                return a2.i();
            }
            String str8 = jd2Var.b;
            String str9 = jd2Var.c;
            this.d.a.getClass();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            ce2 ce2Var = jd2Var.d;
            String str10 = ce2Var.a;
            long j = ce2Var.b;
            rd2 a3 = sd2Var.a();
            a3.c = str8;
            a3.b = 4;
            a3.d = str10;
            a3.e = str9;
            a3.g = Long.valueOf(j);
            a3.h = Long.valueOf(currentTimeMillis);
            return a3.i();
        }
        throw new jec("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((jer) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(sd2 sd2Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((jer) it.next()).b(sd2Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
