package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q implements Runnable {
    public static final q b = new q(0);
    public static final q c = new q(1);
    public static final q d = new q(2);
    public static final q e = new q(3);
    public static final q f = new q(4);
    public static final q g = new q(5);
    public static final q h = new q(6);
    public static final q i = new q(7);
    public static final q j = new q(8);
    public static final q k = new q(9);
    public static final q l = new q(10);
    public static final q m = new q(11);
    public static final q n = new q(12);
    public static final q o = new q(13);
    public static final q p = new q(14);
    public static final q q = new q(15);
    public static final /* synthetic */ q r = new q(16);
    public final /* synthetic */ int a;

    public /* synthetic */ q(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01b2 A[Catch: all -> 0x017a, Exception -> 0x021e, TryCatch #38 {Exception -> 0x021e, all -> 0x017a, blocks: (B:135:0x015d, B:137:0x016d, B:140:0x0174, B:141:0x0182, B:144:0x0192, B:146:0x0198, B:148:0x01ca, B:150:0x0207, B:157:0x0217, B:183:0x0204, B:184:0x019e, B:187:0x01b2, B:193:0x01ad, B:194:0x017d), top: B:134:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #3 {all -> 0x00a8, blocks: (B:28:0x006c, B:31:0x007e, B:35:0x0085, B:37:0x0095, B:44:0x00a4, B:52:0x0092, B:57:0x007a, B:40:0x009f, B:54:0x0076, B:49:0x008e), top: B:27:0x006c, inners: #1, #13, #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4 A[Catch: all -> 0x00de, LOOP:1: B:70:0x00ce->B:72:0x00d4, LOOP_END, TRY_LEAVE, TryCatch #37 {all -> 0x00de, blocks: (B:66:0x00b8, B:69:0x00ca, B:70:0x00ce, B:72:0x00d4, B:88:0x00c6, B:85:0x00c2), top: B:65:0x00b8, outer: #11, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        tee teeVar;
        Class b2;
        JSONObject jSONObject;
        ArrayList arrayList;
        Iterator it;
        AtomicBoolean atomicBoolean;
        Set set = null;
        set = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        AtomicBoolean atomicBoolean2 = null;
        AtomicBoolean atomicBoolean3 = null;
        AtomicBoolean atomicBoolean4 = null;
        JSONObject c2 = null;
        ArrayList a = null;
        ArrayList a2 = null;
        switch (this.a) {
            case 0:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    Object systemService = j3c.b().getSystemService("activity");
                    if (systemService == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                    }
                    r.a((ActivityManager) systemService);
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th) {
                    bp6.a(this, th);
                    return;
                }
            case 1:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    String str = oh.a;
                    if (oh.f == null) {
                        oh.f = wyf.J();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    bp6.a(this, th2);
                    return;
                }
            case 2:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    u80.a();
                    return;
                } catch (Throwable th3) {
                    bp6.a(this, th3);
                    return;
                }
            case 3:
                Set set2 = bp6.a;
                if (set2.contains(this)) {
                    return;
                }
                try {
                    pa7 pa7Var = lt0.a;
                    if (!set2.contains(lt0.class)) {
                        try {
                            lt0.c = null;
                        } catch (Throwable th4) {
                            bp6.a(lt0.class, th4);
                        }
                    }
                    if (y9w.t() != 2) {
                        lt0.e(2);
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    bp6.a(this, th5);
                    return;
                }
            case 4:
                Set set3 = bp6.a;
                if (set3.contains(this)) {
                    return;
                }
                try {
                    nt0.I(lt0.a());
                    pa7 pa7Var2 = new pa7(1);
                    if (set3.contains(lt0.class)) {
                        return;
                    }
                    try {
                        lt0.a = pa7Var2;
                        return;
                    } catch (Throwable th6) {
                        bp6.a(lt0.class, th6);
                        return;
                    }
                } catch (Throwable th7) {
                    bp6.a(this, th7);
                    return;
                }
            case 5:
                Set set4 = bp6.a;
                if (set4.contains(this)) {
                    return;
                }
                try {
                    HashSet hashSet = new HashSet();
                    pa7 pa7Var3 = lt0.a;
                    if (!set4.contains(lt0.class)) {
                        try {
                            set = lt0.a.d();
                        } catch (Throwable th8) {
                            bp6.a(lt0.class, th8);
                        }
                    }
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        hashSet.add(((la) it2.next()).b);
                    }
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        q8c.f((String) it3.next(), true);
                    }
                    return;
                } catch (Throwable th9) {
                    bp6.a(this, th9);
                    return;
                }
            case 6:
                Set set5 = bp6.a;
                if (set5.contains(this)) {
                    return;
                }
                try {
                    Context b3 = j3c.b();
                    pee.a(b3, tee.f(b3, pee.g), false);
                    Object obj = pee.g;
                    if (!set5.contains(tee.class)) {
                        try {
                            b3.getClass();
                            tee teeVar2 = tee.f;
                            a2 = teeVar2.a(teeVar2.e(b3, obj, "subs"));
                        } catch (Throwable th10) {
                            bp6.a(tee.class, th10);
                        }
                    }
                    pee.a(b3, a2, true);
                    return;
                } catch (Throwable th11) {
                    bp6.a(this, th11);
                    return;
                }
            case 7:
                Set set6 = bp6.a;
                if (set6.contains(this)) {
                    return;
                }
                try {
                    Context b4 = j3c.b();
                    ArrayList f2 = tee.f(b4, pee.g);
                    if (f2.isEmpty()) {
                        Object obj2 = pee.g;
                        if (!set6.contains(tee.class)) {
                            try {
                                b4.getClass();
                                ArrayList arrayList2 = new ArrayList();
                                if (obj2 != null && (b2 = (teeVar = tee.f).b(b4, "com.android.vending.billing.IInAppBillingService")) != null && teeVar.c("getPurchaseHistory", b2) != null) {
                                    a = teeVar.a(teeVar.d(b4, obj2));
                                }
                                a = arrayList2;
                            } catch (Throwable th12) {
                                bp6.a(tee.class, th12);
                            }
                        }
                        f2 = a;
                    }
                    pee.a(b4, f2, false);
                    return;
                } catch (Throwable th13) {
                    bp6.a(this, th13);
                    return;
                }
            case 8:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    qee.f();
                    return;
                } catch (Throwable th14) {
                    bp6.a(this, th14);
                    return;
                }
            case 9:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    qee.f();
                    return;
                } catch (Throwable th15) {
                    bp6.a(this, th15);
                    return;
                }
            case 10:
                Set set7 = bp6.a;
                if (set7.contains(this)) {
                    return;
                }
                try {
                    Context b5 = j3c.b();
                    b5.getClass();
                    av1 C = etn.C(b5);
                    if (C == null || !C.e) {
                        x2i.S();
                        if (set7.contains(x2i.class)) {
                            return;
                        }
                        try {
                            x2i.b = true;
                            return;
                        } catch (Throwable th16) {
                            bp6.a(x2i.class, th16);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th17) {
                    bp6.a(this, th17);
                    return;
                }
            case 11:
                Set set8 = bp6.a;
                if (set8.contains(this)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = j3c.b().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                    String string = sharedPreferences.getString("models", null);
                    if (string != null && string.length() != 0) {
                        jSONObject = new JSONObject(string);
                        long j2 = sharedPreferences.getLong("model_request_timestamp", 0L);
                        if (x6c.b(v6c.ModelRequest) || jSONObject.length() == 0 || !oci.a(j2)) {
                            oci ociVar = oci.d;
                            if (!set8.contains(oci.class)) {
                                try {
                                    c2 = ociVar.c();
                                } catch (Throwable th18) {
                                    bp6.a(oci.class, th18);
                                }
                            }
                            if (c2 != null) {
                                return;
                            }
                            sharedPreferences.edit().putString("models", c2.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                            jSONObject = c2;
                        }
                        oci ociVar2 = oci.d;
                        Set set9 = bp6.a;
                        if (!set9.contains(oci.class)) {
                            try {
                                if (!set9.contains(ociVar2)) {
                                    try {
                                        Iterator<String> keys = jSONObject.keys();
                                        while (keys.hasNext()) {
                                            try {
                                                nci v = hyf.v(jSONObject.getJSONObject(keys.next()));
                                                if (v != null) {
                                                    oci.a.put(v.d, v);
                                                }
                                            } catch (JSONException unused2) {
                                            }
                                        }
                                    } catch (Throwable th19) {
                                        bp6.a(ociVar2, th19);
                                    }
                                }
                            } catch (Throwable th20) {
                                bp6.a(oci.class, th20);
                            }
                        }
                        oci ociVar3 = oci.d;
                        if (bp6.a.contains(oci.class)) {
                            return;
                        }
                        try {
                            ociVar3.b();
                            return;
                        } catch (Throwable th21) {
                            bp6.a(oci.class, th21);
                            return;
                        }
                    }
                    jSONObject = new JSONObject();
                    long j22 = sharedPreferences.getLong("model_request_timestamp", 0L);
                    if (x6c.b(v6c.ModelRequest)) {
                    }
                    oci ociVar4 = oci.d;
                    if (!set8.contains(oci.class)) {
                    }
                    if (c2 != null) {
                    }
                } catch (Exception unused3) {
                    return;
                } catch (Throwable th22) {
                    bp6.a(this, th22);
                    return;
                }
                break;
            case 12:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    oqr.a();
                    return;
                } catch (Throwable th23) {
                    bp6.a(this, th23);
                    return;
                }
            case 13:
                Set set10 = bp6.a;
                if (set10.contains(this)) {
                    return;
                }
                try {
                    if (set10.contains(rre.class)) {
                        return;
                    }
                    try {
                        rre.b = true;
                        rre.c = m8c.b("FBSDKFeatureIntegritySample", j3c.c(), false);
                        return;
                    } catch (Throwable th24) {
                        bp6.a(rre.class, th24);
                        return;
                    }
                } catch (Throwable th25) {
                    bp6.a(this, th25);
                    return;
                }
            case 14:
                Set set11 = bp6.a;
                try {
                    if (set11.contains(this)) {
                        return;
                    }
                    try {
                        ArrayList arrayList3 = xwi.a;
                        if (!set11.contains(xwi.class)) {
                            try {
                                arrayList = xwi.a;
                            } catch (Throwable th26) {
                                bp6.a(xwi.class, th26);
                            }
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((wwi) it.next()).a(true);
                            }
                            ArrayList arrayList4 = xwi.a;
                            if (!bp6.a.contains(xwi.class)) {
                                try {
                                    atomicBoolean3 = xwi.b;
                                } catch (Throwable th27) {
                                    bp6.a(xwi.class, th27);
                                }
                            }
                            atomicBoolean3.set(false);
                            return;
                        }
                        arrayList = null;
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                        }
                        ArrayList arrayList42 = xwi.a;
                        if (!bp6.a.contains(xwi.class)) {
                        }
                        atomicBoolean3.set(false);
                        return;
                    } catch (Throwable th28) {
                        ArrayList arrayList5 = xwi.a;
                        if (!bp6.a.contains(xwi.class)) {
                            try {
                                atomicBoolean4 = xwi.b;
                            } catch (Throwable th29) {
                                bp6.a(xwi.class, th29);
                            }
                        }
                        atomicBoolean4.set(false);
                        throw th28;
                    }
                } catch (Throwable th30) {
                    bp6.a(this, th30);
                    return;
                }
            case 15:
                Set set12 = bp6.a;
                if (set12.contains(this)) {
                    return;
                }
                try {
                    oqr oqrVar = oqr.d;
                    if (!set12.contains(oqr.class)) {
                        try {
                            atomicBoolean = oqr.a;
                        } catch (Throwable th31) {
                            bp6.a(oqr.class, th31);
                        }
                        if (atomicBoolean.get()) {
                            if (!bp6.a.contains(oqr.class)) {
                                try {
                                    atomicBoolean2 = oqr.a;
                                } catch (Throwable th32) {
                                    bp6.a(oqr.class, th32);
                                }
                            }
                            atomicBoolean2.set(true);
                            if (set12.contains(oqr.class)) {
                                return;
                            }
                            try {
                                oqrVar.b();
                                return;
                            } catch (Throwable th33) {
                                bp6.a(oqr.class, th33);
                                return;
                            }
                        }
                        return;
                    }
                    atomicBoolean = null;
                    if (atomicBoolean.get()) {
                    }
                } catch (Throwable th34) {
                    bp6.a(this, th34);
                    return;
                }
            case 16:
                return;
            case 17:
                try {
                    Method method = bqs.b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (r3b.d()) {
                        r3b.a().e();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th35) {
                    Method method2 = bqs.b;
                    Trace.endSection();
                    throw th35;
                }
            case 18:
            case 19:
                return;
            case 20:
                throw null;
            case 21:
                throw null;
            case 22:
                Iterator it4 = new ArrayList(mto.d.keySet()).iterator();
                while (it4.hasNext()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it4.next();
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        mto.d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            case 23:
                return;
            case 24:
                vjp.h = false;
                return;
            case 25:
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 18:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ q(dkp dkpVar, int i2) {
        this.a = i2;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
