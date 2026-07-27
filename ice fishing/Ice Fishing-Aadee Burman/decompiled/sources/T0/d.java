package T0;

import D.y;
import J0.x;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.C2991bm;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import u0.C5059i;
import z0.C5253i;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public static final String f3029v = J0.s.f("EnqueueRunnable");

    /* renamed from: n, reason: collision with root package name */
    public final K0.k f3030n;

    /* renamed from: u, reason: collision with root package name */
    public final C2991bm f3031u;

    public d(K0.k kVar) {
        C2991bm c2991bm = new C2991bm(2);
        this.f3030n = kVar;
        this.f3031u = c2991bm;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(K0.k kVar) {
        boolean z3;
        boolean z6;
        boolean z9;
        WorkDatabase workDatabase;
        boolean z10;
        boolean z11;
        boolean z12;
        Iterator it;
        boolean z13;
        long j6;
        K0.p pVar;
        Iterator it2;
        boolean z14;
        Iterator it3;
        kVar.getClass();
        String[] strArr = (String[]) K0.k.p(kVar).toArray(new String[0]);
        long currentTimeMillis = System.currentTimeMillis();
        K0.p pVar2 = kVar.i;
        WorkDatabase workDatabase2 = pVar2.f1534c;
        boolean z15 = strArr != null && strArr.length > 0;
        if (z15) {
            z6 = false;
            z9 = false;
            z3 = true;
            for (String str : strArr) {
                S0.p h9 = workDatabase2.t().h(str);
                if (h9 == null) {
                    J0.s.d().b(f3029v, y.o("Prerequisite ", str, " doesn't exist; not enqueuing"));
                    break;
                }
                int i = h9.f2809b;
                z3 &= i == 3;
                if (i == 4) {
                    z9 = true;
                } else if (i == 6) {
                    z6 = true;
                }
            }
        } else {
            z3 = true;
            z6 = false;
            z9 = false;
        }
        String str2 = kVar.f1519j;
        boolean isEmpty = TextUtils.isEmpty(str2);
        if (isEmpty || z15) {
            workDatabase = workDatabase2;
            z10 = isEmpty;
            z11 = z15;
        } else {
            S0.q t6 = workDatabase2.t();
            t6.getClass();
            C5059i a9 = C5059i.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            if (str2 == null) {
                a9.o(1);
            } else {
                a9.c(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t6.f2827a;
            workDatabase_Impl.b();
            Cursor m4 = workDatabase_Impl.m(a9);
            try {
                ArrayList arrayList = new ArrayList(m4.getCount());
                while (m4.moveToNext()) {
                    String id = m4.isNull(0) ? null : m4.getString(0);
                    WorkDatabase workDatabase3 = workDatabase2;
                    int n9 = com.bumptech.glide.f.n(m4.getInt(1));
                    boolean z16 = isEmpty;
                    boolean z17 = z15;
                    kotlin.jvm.internal.h.e(id, "id");
                    S0.o oVar = new S0.o();
                    oVar.f2806a = id;
                    oVar.f2807b = n9;
                    arrayList.add(oVar);
                    workDatabase2 = workDatabase3;
                    isEmpty = z16;
                    z15 = z17;
                }
                workDatabase = workDatabase2;
                z10 = isEmpty;
                z11 = z15;
                m4.close();
                a9.j();
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        int i6 = ((S0.o) it4.next()).f2807b;
                        if (i6 != 1 && i6 != 2) {
                        }
                        z13 = false;
                    }
                    new b(pVar2, str2, 1).run();
                    S0.q t9 = workDatabase.t();
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        String str3 = ((S0.o) it5.next()).f2806a;
                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) t9.f2827a;
                        workDatabase_Impl2.b();
                        S0.h hVar = (S0.h) t9.f2829c;
                        C5253i a10 = hVar.a();
                        if (str3 == null) {
                            a10.o(1);
                        } else {
                            a10.c(1, str3);
                        }
                        workDatabase_Impl2.c();
                        try {
                            a10.b();
                            workDatabase_Impl2.o();
                        } finally {
                            workDatabase_Impl2.k();
                            hVar.n(a10);
                        }
                    }
                    z12 = true;
                    it = kVar.f1520k.iterator();
                    boolean z18 = z12;
                    while (it.hasNext()) {
                        J0.t tVar = (J0.t) it.next();
                        S0.p pVar3 = tVar.f1407b;
                        if (!z11 || z3) {
                            pVar3.f2820n = currentTimeMillis;
                        } else if (z9) {
                            pVar3.f2809b = 4;
                        } else if (z6) {
                            pVar3.f2809b = 6;
                        } else {
                            pVar3.f2809b = 5;
                        }
                        if (pVar3.f2809b == 1) {
                            z18 = true;
                        }
                        S0.q t10 = workDatabase.t();
                        List schedulers = pVar2.f1536e;
                        kotlin.jvm.internal.h.e(schedulers, "schedulers");
                        try {
                            if (Build.VERSION.SDK_INT < 26) {
                                J0.d dVar = pVar3.f2816j;
                                j6 = currentTimeMillis;
                                String name = ConstraintTrackingWorker.class.getName();
                                String str4 = pVar3.f2810c;
                                if (!kotlin.jvm.internal.h.a(str4, name) && (dVar.f1377d || dVar.f1378e)) {
                                    J0.g gVar = new J0.g(0);
                                    gVar.a(pVar3.f2812e.f1391a);
                                    pVar = pVar2;
                                    gVar.f1388a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str4);
                                    J0.h hVar2 = new J0.h(gVar.f1388a);
                                    J0.h.c(hVar2);
                                    String name2 = ConstraintTrackingWorker.class.getName();
                                    int i9 = pVar3.f2809b;
                                    String str5 = pVar3.f2811d;
                                    long j9 = pVar3.f2814g;
                                    J0.d constraints = pVar3.f2816j;
                                    it2 = it;
                                    z14 = z18;
                                    long j10 = pVar3.f2820n;
                                    boolean z19 = pVar3.f2823q;
                                    String id2 = pVar3.f2808a;
                                    kotlin.jvm.internal.h.e(id2, "id");
                                    AbstractC4404f.l(i9, com.anythink.core.express.b.a.f17526b);
                                    J0.h output = pVar3.f2813f;
                                    kotlin.jvm.internal.h.e(output, "output");
                                    kotlin.jvm.internal.h.e(constraints, "constraints");
                                    int i10 = pVar3.f2818l;
                                    AbstractC4404f.l(i10, "backoffPolicy");
                                    int i11 = pVar3.f2824r;
                                    AbstractC4404f.l(i11, "outOfQuotaPolicy");
                                    pVar3 = new S0.p(id2, i9, name2, str5, hVar2, output, j9, pVar3.f2815h, pVar3.i, constraints, pVar3.f2817k, i10, pVar3.f2819m, j10, pVar3.f2821o, pVar3.f2822p, z19, i11, pVar3.f2825s, pVar3.f2826t);
                                    WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) t10.f2827a;
                                    workDatabase_Impl3.b();
                                    workDatabase_Impl3.c();
                                    ((S0.b) t10.f2828b).q(pVar3);
                                    workDatabase_Impl3.o();
                                    workDatabase_Impl3.k();
                                    UUID uuid = tVar.f1406a;
                                    if (z11) {
                                        for (String str6 : strArr) {
                                            String uuid2 = uuid.toString();
                                            kotlin.jvm.internal.h.d(uuid2, "id.toString()");
                                            S0.a aVar = new S0.a(uuid2, str6);
                                            S0.c f3 = workDatabase.f();
                                            workDatabase_Impl3 = (WorkDatabase_Impl) f3.f2775u;
                                            workDatabase_Impl3.b();
                                            workDatabase_Impl3.c();
                                            try {
                                                ((S0.b) f3.f2776v).q(aVar);
                                                workDatabase_Impl3.o();
                                                workDatabase_Impl3.k();
                                            } finally {
                                            }
                                        }
                                    }
                                    S0.s u3 = workDatabase.u();
                                    String uuid3 = uuid.toString();
                                    kotlin.jvm.internal.h.d(uuid3, "id.toString()");
                                    u3.getClass();
                                    LinkedHashSet tags = tVar.f1408c;
                                    kotlin.jvm.internal.h.e(tags, "tags");
                                    it3 = tags.iterator();
                                    while (it3.hasNext()) {
                                        S0.r rVar = new S0.r((String) it3.next(), uuid3);
                                        workDatabase_Impl3 = (WorkDatabase_Impl) u3.f2840u;
                                        workDatabase_Impl3.b();
                                        workDatabase_Impl3.c();
                                        try {
                                            ((S0.b) u3.f2841v).q(rVar);
                                            workDatabase_Impl3.o();
                                            workDatabase_Impl3.k();
                                        } finally {
                                        }
                                    }
                                    if (z10) {
                                        S0.l r9 = workDatabase.r();
                                        String uuid4 = uuid.toString();
                                        kotlin.jvm.internal.h.d(uuid4, "id.toString()");
                                        S0.k kVar2 = new S0.k(str2, uuid4);
                                        workDatabase_Impl3 = (WorkDatabase_Impl) r9.f2797u;
                                        workDatabase_Impl3.b();
                                        workDatabase_Impl3.c();
                                        try {
                                            ((S0.b) r9.f2798v).q(kVar2);
                                            workDatabase_Impl3.o();
                                        } finally {
                                        }
                                    }
                                    pVar2 = pVar;
                                    currentTimeMillis = j6;
                                    it = it2;
                                    z18 = z14;
                                }
                            } else {
                                j6 = currentTimeMillis;
                            }
                            ((S0.b) t10.f2828b).q(pVar3);
                            workDatabase_Impl3.o();
                            workDatabase_Impl3.k();
                            UUID uuid5 = tVar.f1406a;
                            if (z11) {
                            }
                            S0.s u32 = workDatabase.u();
                            String uuid32 = uuid5.toString();
                            kotlin.jvm.internal.h.d(uuid32, "id.toString()");
                            u32.getClass();
                            LinkedHashSet tags2 = tVar.f1408c;
                            kotlin.jvm.internal.h.e(tags2, "tags");
                            it3 = tags2.iterator();
                            while (it3.hasNext()) {
                            }
                            if (z10) {
                            }
                            pVar2 = pVar;
                            currentTimeMillis = j6;
                            it = it2;
                            z18 = z14;
                        } finally {
                        }
                        pVar = pVar2;
                        it2 = it;
                        z14 = z18;
                        WorkDatabase_Impl workDatabase_Impl32 = (WorkDatabase_Impl) t10.f2827a;
                        workDatabase_Impl32.b();
                        workDatabase_Impl32.c();
                    }
                    z13 = z18;
                    kVar.f1523n = true;
                    return z13;
                }
            } catch (Throwable th) {
                m4.close();
                a9.j();
                throw th;
            }
        }
        z12 = false;
        it = kVar.f1520k.iterator();
        boolean z182 = z12;
        while (it.hasNext()) {
        }
        z13 = z182;
        kVar.f1523n = true;
        return z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        C2991bm c2991bm = this.f3031u;
        K0.k kVar = this.f3030n;
        try {
            kVar.getClass();
            HashSet hashSet = new HashSet();
            hashSet.addAll(kVar.f1521l);
            HashSet p9 = K0.k.p(kVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(kVar.f1521l);
                    z3 = false;
                    break;
                } else if (p9.contains((String) it.next())) {
                    z3 = true;
                    break;
                }
            }
            if (z3) {
                throw new IllegalStateException("WorkContinuation has cycles (" + kVar + ")");
            }
            K0.p pVar = kVar.i;
            WorkDatabase workDatabase = pVar.f1534c;
            workDatabase.c();
            try {
                boolean a9 = a(kVar);
                workDatabase.o();
                if (a9) {
                    j.a(pVar.f1532a, RescheduleReceiver.class, true);
                    K0.i.a(pVar.f1533b, pVar.f1534c, pVar.f1536e);
                }
                c2991bm.S(x.f1410f0);
            } finally {
                workDatabase.k();
            }
        } catch (Throwable th) {
            c2991bm.S(new J0.u(th));
        }
    }
}
