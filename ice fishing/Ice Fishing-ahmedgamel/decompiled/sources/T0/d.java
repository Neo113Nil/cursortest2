package T0;

import D.x;
import J0.w;
import a.AbstractC0426a;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.Wv;
import i1.C4585b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import u0.C5060i;
import z0.C5220i;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public static final String f3112v = J0.r.f("EnqueueRunnable");

    /* renamed from: n, reason: collision with root package name */
    public final K0.k f3113n;

    /* renamed from: u, reason: collision with root package name */
    public final S0.s f3114u;

    public d(K0.k kVar) {
        S0.s sVar = new S0.s(2);
        this.f3113n = kVar;
        this.f3114u = sVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(K0.k kVar) {
        boolean z6;
        boolean z9;
        boolean z10;
        WorkDatabase workDatabase;
        boolean z11;
        boolean z12;
        boolean z13;
        Iterator it;
        boolean z14;
        long j6;
        K0.p pVar;
        Iterator it2;
        boolean z15;
        Iterator it3;
        kVar.getClass();
        String[] strArr = (String[]) K0.k.t(kVar).toArray(new String[0]);
        long currentTimeMillis = System.currentTimeMillis();
        K0.p pVar2 = kVar.f1628e;
        WorkDatabase workDatabase2 = pVar2.f1643c;
        boolean z16 = strArr != null && strArr.length > 0;
        if (z16) {
            z9 = false;
            z10 = false;
            z6 = true;
            for (String str : strArr) {
                S0.p h3 = workDatabase2.t().h(str);
                if (h3 == null) {
                    J0.r.d().b(f3112v, x.l("Prerequisite ", str, " doesn't exist; not enqueuing"));
                    break;
                }
                int i = h3.f2938b;
                z6 &= i == 3;
                if (i == 4) {
                    z10 = true;
                } else if (i == 6) {
                    z9 = true;
                }
            }
        } else {
            z6 = true;
            z9 = false;
            z10 = false;
        }
        String str2 = kVar.f1629f;
        boolean isEmpty = TextUtils.isEmpty(str2);
        if (isEmpty || z16) {
            workDatabase = workDatabase2;
            z11 = isEmpty;
            z12 = z16;
        } else {
            S0.q t6 = workDatabase2.t();
            t6.getClass();
            C5060i a9 = C5060i.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            if (str2 == null) {
                a9.o(1);
            } else {
                a9.c(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t6.f2956a;
            workDatabase_Impl.b();
            Cursor m9 = workDatabase_Impl.m(a9);
            try {
                ArrayList arrayList = new ArrayList(m9.getCount());
                while (m9.moveToNext()) {
                    String id = m9.isNull(0) ? null : m9.getString(0);
                    WorkDatabase workDatabase3 = workDatabase2;
                    int i4 = AbstractC0426a.i(m9.getInt(1));
                    boolean z17 = isEmpty;
                    boolean z18 = z16;
                    kotlin.jvm.internal.h.e(id, "id");
                    S0.o oVar = new S0.o();
                    oVar.f2935a = id;
                    oVar.f2936b = i4;
                    arrayList.add(oVar);
                    workDatabase2 = workDatabase3;
                    isEmpty = z17;
                    z16 = z18;
                }
                workDatabase = workDatabase2;
                z11 = isEmpty;
                z12 = z16;
                m9.close();
                a9.j();
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        int i6 = ((S0.o) it4.next()).f2936b;
                        if (i6 != 1 && i6 != 2) {
                        }
                        z14 = false;
                    }
                    new b(pVar2, str2, 1).run();
                    S0.q t9 = workDatabase.t();
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        String str3 = ((S0.o) it5.next()).f2935a;
                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) t9.f2956a;
                        workDatabase_Impl2.b();
                        S0.h hVar = (S0.h) t9.f2958c;
                        C5220i a10 = hVar.a();
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
                    z13 = true;
                    it = kVar.f1630g.iterator();
                    boolean z19 = z13;
                    while (it.hasNext()) {
                        J0.s sVar = (J0.s) it.next();
                        S0.p pVar3 = sVar.f1435b;
                        if (!z12 || z6) {
                            pVar3.f2949n = currentTimeMillis;
                        } else if (z10) {
                            pVar3.f2938b = 4;
                        } else if (z9) {
                            pVar3.f2938b = 6;
                        } else {
                            pVar3.f2938b = 5;
                        }
                        if (pVar3.f2938b == 1) {
                            z19 = true;
                        }
                        S0.q t10 = workDatabase.t();
                        List schedulers = pVar2.f1645e;
                        kotlin.jvm.internal.h.e(schedulers, "schedulers");
                        try {
                            if (Build.VERSION.SDK_INT < 26) {
                                J0.d dVar = pVar3.f2945j;
                                j6 = currentTimeMillis;
                                String name = ConstraintTrackingWorker.class.getName();
                                String str4 = pVar3.f2939c;
                                if (!kotlin.jvm.internal.h.a(str4, name) && (dVar.f1406d || dVar.f1407e)) {
                                    C4585b c4585b = new C4585b(9);
                                    c4585b.s(pVar3.f2941e.f1419a);
                                    pVar = pVar2;
                                    ((HashMap) c4585b.f38152u).put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str4);
                                    J0.g gVar = new J0.g((HashMap) c4585b.f38152u);
                                    J0.g.c(gVar);
                                    String name2 = ConstraintTrackingWorker.class.getName();
                                    int i9 = pVar3.f2938b;
                                    String str5 = pVar3.f2940d;
                                    long j9 = pVar3.f2943g;
                                    J0.d constraints = pVar3.f2945j;
                                    it2 = it;
                                    z15 = z19;
                                    long j10 = pVar3.f2949n;
                                    boolean z20 = pVar3.f2952q;
                                    String id2 = pVar3.f2937a;
                                    kotlin.jvm.internal.h.e(id2, "id");
                                    Wv.n(i9, com.anythink.core.express.b.a.f18313b);
                                    J0.g output = pVar3.f2942f;
                                    kotlin.jvm.internal.h.e(output, "output");
                                    kotlin.jvm.internal.h.e(constraints, "constraints");
                                    int i10 = pVar3.f2947l;
                                    Wv.n(i10, "backoffPolicy");
                                    int i11 = pVar3.f2953r;
                                    Wv.n(i11, "outOfQuotaPolicy");
                                    pVar3 = new S0.p(id2, i9, name2, str5, gVar, output, j9, pVar3.f2944h, pVar3.i, constraints, pVar3.f2946k, i10, pVar3.f2948m, j10, pVar3.f2950o, pVar3.f2951p, z20, i11, pVar3.f2954s, pVar3.f2955t);
                                    WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) t10.f2956a;
                                    workDatabase_Impl3.b();
                                    workDatabase_Impl3.c();
                                    ((S0.b) t10.f2957b).q(pVar3);
                                    workDatabase_Impl3.o();
                                    workDatabase_Impl3.k();
                                    UUID uuid = sVar.f1434a;
                                    if (z12) {
                                        for (String str6 : strArr) {
                                            String uuid2 = uuid.toString();
                                            kotlin.jvm.internal.h.d(uuid2, "id.toString()");
                                            S0.a aVar = new S0.a(uuid2, str6);
                                            S0.c f2 = workDatabase.f();
                                            workDatabase_Impl3 = (WorkDatabase_Impl) f2.f2902u;
                                            workDatabase_Impl3.b();
                                            workDatabase_Impl3.c();
                                            try {
                                                ((S0.b) f2.f2903v).q(aVar);
                                                workDatabase_Impl3.o();
                                                workDatabase_Impl3.k();
                                            } finally {
                                            }
                                        }
                                    }
                                    S0.s u6 = workDatabase.u();
                                    String uuid3 = uuid.toString();
                                    kotlin.jvm.internal.h.d(uuid3, "id.toString()");
                                    u6.getClass();
                                    LinkedHashSet tags = sVar.f1436c;
                                    kotlin.jvm.internal.h.e(tags, "tags");
                                    it3 = tags.iterator();
                                    while (it3.hasNext()) {
                                        S0.r rVar = new S0.r((String) it3.next(), uuid3);
                                        workDatabase_Impl3 = (WorkDatabase_Impl) u6.f2969u;
                                        workDatabase_Impl3.b();
                                        workDatabase_Impl3.c();
                                        try {
                                            ((S0.b) u6.f2970v).q(rVar);
                                            workDatabase_Impl3.o();
                                            workDatabase_Impl3.k();
                                        } finally {
                                        }
                                    }
                                    if (z11) {
                                        S0.l r9 = workDatabase.r();
                                        String uuid4 = uuid.toString();
                                        kotlin.jvm.internal.h.d(uuid4, "id.toString()");
                                        S0.k kVar2 = new S0.k(str2, uuid4);
                                        workDatabase_Impl3 = (WorkDatabase_Impl) r9.f2926u;
                                        workDatabase_Impl3.b();
                                        workDatabase_Impl3.c();
                                        try {
                                            ((S0.b) r9.f2927v).q(kVar2);
                                            workDatabase_Impl3.o();
                                        } finally {
                                        }
                                    }
                                    pVar2 = pVar;
                                    currentTimeMillis = j6;
                                    it = it2;
                                    z19 = z15;
                                }
                            } else {
                                j6 = currentTimeMillis;
                            }
                            ((S0.b) t10.f2957b).q(pVar3);
                            workDatabase_Impl3.o();
                            workDatabase_Impl3.k();
                            UUID uuid5 = sVar.f1434a;
                            if (z12) {
                            }
                            S0.s u62 = workDatabase.u();
                            String uuid32 = uuid5.toString();
                            kotlin.jvm.internal.h.d(uuid32, "id.toString()");
                            u62.getClass();
                            LinkedHashSet tags2 = sVar.f1436c;
                            kotlin.jvm.internal.h.e(tags2, "tags");
                            it3 = tags2.iterator();
                            while (it3.hasNext()) {
                            }
                            if (z11) {
                            }
                            pVar2 = pVar;
                            currentTimeMillis = j6;
                            it = it2;
                            z19 = z15;
                        } finally {
                        }
                        pVar = pVar2;
                        it2 = it;
                        z15 = z19;
                        WorkDatabase_Impl workDatabase_Impl32 = (WorkDatabase_Impl) t10.f2956a;
                        workDatabase_Impl32.b();
                        workDatabase_Impl32.c();
                    }
                    z14 = z19;
                    kVar.f1632j = true;
                    return z14;
                }
            } catch (Throwable th) {
                m9.close();
                a9.j();
                throw th;
            }
        }
        z13 = false;
        it = kVar.f1630g.iterator();
        boolean z192 = z13;
        while (it.hasNext()) {
        }
        z14 = z192;
        kVar.f1632j = true;
        return z14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        S0.s sVar = this.f3114u;
        K0.k kVar = this.f3113n;
        try {
            kVar.getClass();
            HashSet hashSet = new HashSet();
            hashSet.addAll(kVar.f1631h);
            HashSet t6 = K0.k.t(kVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(kVar.f1631h);
                    z6 = false;
                    break;
                } else if (t6.contains((String) it.next())) {
                    z6 = true;
                    break;
                }
            }
            if (z6) {
                throw new IllegalStateException("WorkContinuation has cycles (" + kVar + ")");
            }
            K0.p pVar = kVar.f1628e;
            WorkDatabase workDatabase = pVar.f1643c;
            workDatabase.c();
            try {
                boolean a9 = a(kVar);
                workDatabase.o();
                if (a9) {
                    j.a(pVar.f1641a, RescheduleReceiver.class, true);
                    K0.i.a(pVar.f1642b, pVar.f1643c, pVar.f1645e);
                }
                sVar.k(w.f1438a0);
            } finally {
                workDatabase.k();
            }
        } catch (Throwable th) {
            sVar.k(new J0.t(th));
        }
    }
}
