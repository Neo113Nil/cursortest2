package y4;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import u.l0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final String f8737i = o4.o.f("EnqueueRunnable");

    /* renamed from: g, reason: collision with root package name */
    public final p4.j f8738g;

    /* renamed from: h, reason: collision with root package name */
    public final x4.e f8739h;

    public c(p4.j jVar) {
        x4.e eVar = new x4.e(7);
        this.f8738g = jVar;
        this.f8739h = eVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(p4.j jVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        List list;
        boolean z13;
        boolean z14;
        Iterator it;
        boolean z15;
        jVar.getClass();
        HashSet O = p4.j.O(jVar);
        p4.n nVar = jVar.f5480c;
        List list2 = jVar.f5482e;
        String[] strArr = (String[]) O.toArray(new String[0]);
        String str = jVar.f5481d;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = nVar.f5495c;
        boolean z16 = strArr != null && strArr.length > 0;
        if (z16) {
            z11 = false;
            z12 = false;
            z10 = true;
            for (String str2 : strArr) {
                x4.p k3 = workDatabase.t().k(str2);
                if (k3 == null) {
                    o4.o.d().b(f8737i, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    break;
                }
                int i10 = k3.f8323b;
                z10 &= i10 == 3;
                if (i10 == 4) {
                    z12 = true;
                } else if (i10 == 6) {
                    z11 = true;
                }
            }
        } else {
            z10 = true;
            z11 = false;
            z12 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (isEmpty || z16) {
            list = list2;
            z13 = isEmpty;
        } else {
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) workDatabase.t().f8342a;
            int i11 = 1;
            b4.o a6 = b4.o.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (str == null) {
                a6.h(1);
            } else {
                a6.c(str, 1);
            }
            workDatabase_Impl.b();
            Cursor m10 = workDatabase_Impl.m(a6);
            try {
                ArrayList arrayList = new ArrayList(m10.getCount());
                while (m10.moveToNext()) {
                    String string = m10.isNull(0) ? null : m10.getString(0);
                    int l10 = l0.l(m10.getInt(i11));
                    List list3 = list2;
                    boolean z17 = isEmpty;
                    pc.j.e(string, "id");
                    x4.o oVar = new x4.o();
                    oVar.f8320a = string;
                    oVar.f8321b = l10;
                    arrayList.add(oVar);
                    list2 = list3;
                    isEmpty = z17;
                    i11 = 1;
                }
                list = list2;
                z13 = isEmpty;
                m10.close();
                a6.f();
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        int i13 = ((x4.o) obj).f8321b;
                        if (i13 != 1 && i13 != 2) {
                        }
                        z15 = false;
                    }
                    new b(nVar, str, 1).run();
                    x4.q t3 = workDatabase.t();
                    int size2 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayList.get(i14);
                        i14++;
                        String str3 = ((x4.o) obj2).f8320a;
                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) t3.f8342a;
                        workDatabase_Impl2.b();
                        x4.h hVar = (x4.h) t3.f8344c;
                        x4.q qVar = t3;
                        i4.i a8 = hVar.a();
                        int i15 = size2;
                        if (str3 == null) {
                            a8.h(1);
                        } else {
                            a8.c(str3, 1);
                        }
                        workDatabase_Impl2.c();
                        try {
                            a8.a();
                            workDatabase_Impl2.o();
                            workDatabase_Impl2.k();
                            hVar.d(a8);
                            t3 = qVar;
                            size2 = i15;
                        } catch (Throwable th) {
                            workDatabase_Impl2.k();
                            hVar.d(a8);
                            throw th;
                        }
                    }
                    z14 = true;
                    it = list.iterator();
                    boolean z18 = z14;
                    while (it.hasNext()) {
                        o4.p pVar = (o4.p) it.next();
                        x4.p pVar2 = pVar.f5220b;
                        UUID uuid = pVar.f5219a;
                        if (!z16 || z10) {
                            pVar2.f8335n = currentTimeMillis;
                        } else if (z12) {
                            pVar2.f8323b = 4;
                        } else if (z11) {
                            pVar2.f8323b = 6;
                        } else {
                            pVar2.f8323b = 5;
                        }
                        if (pVar2.f8323b == 1) {
                            z18 = true;
                        }
                        x4.q t10 = workDatabase.t();
                        p4.n nVar2 = nVar;
                        pc.j.e(nVar.f5497e, "schedulers");
                        WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) t10.f8342a;
                        workDatabase_Impl3.b();
                        workDatabase_Impl3.c();
                        try {
                            ((x4.b) t10.f8343b).f(pVar2);
                            workDatabase_Impl3.o();
                            workDatabase_Impl3.k();
                            if (z16) {
                                int length = strArr.length;
                                int i16 = 0;
                                while (i16 < length) {
                                    String str4 = strArr[i16];
                                    String[] strArr2 = strArr;
                                    Iterator it2 = it;
                                    String uuid2 = uuid.toString();
                                    pc.j.d(uuid2, "id.toString()");
                                    x4.a aVar = new x4.a(uuid2, str4);
                                    x4.c f10 = workDatabase.f();
                                    workDatabase_Impl3 = (WorkDatabase_Impl) f10.f8290g;
                                    workDatabase_Impl3.b();
                                    workDatabase_Impl3.c();
                                    try {
                                        ((x4.b) f10.f8291h).f(aVar);
                                        workDatabase_Impl3.o();
                                        workDatabase_Impl3.k();
                                        i16++;
                                        strArr = strArr2;
                                        it = it2;
                                    } finally {
                                    }
                                }
                            }
                            String[] strArr3 = strArr;
                            Iterator it3 = it;
                            x4.s u10 = workDatabase.u();
                            String uuid3 = uuid.toString();
                            pc.j.d(uuid3, "id.toString()");
                            Set set = pVar.f5221c;
                            u10.getClass();
                            pc.j.e(set, "tags");
                            Iterator it4 = set.iterator();
                            while (it4.hasNext()) {
                                x4.r rVar = new x4.r((String) it4.next(), uuid3);
                                workDatabase_Impl3 = (WorkDatabase_Impl) u10.f8356h;
                                workDatabase_Impl3.b();
                                workDatabase_Impl3.c();
                                try {
                                    ((x4.b) u10.f8357i).f(rVar);
                                    workDatabase_Impl3.o();
                                    workDatabase_Impl3.k();
                                } finally {
                                }
                            }
                            if (!z13) {
                                x4.l r5 = workDatabase.r();
                                String uuid4 = uuid.toString();
                                pc.j.d(uuid4, "id.toString()");
                                x4.k kVar = new x4.k(str, uuid4);
                                workDatabase_Impl3 = (WorkDatabase_Impl) r5.f8312h;
                                workDatabase_Impl3.b();
                                workDatabase_Impl3.c();
                                try {
                                    ((x4.b) r5.f8313i).f(kVar);
                                    workDatabase_Impl3.o();
                                } finally {
                                }
                            }
                            nVar = nVar2;
                            strArr = strArr3;
                            it = it3;
                        } finally {
                        }
                    }
                    z15 = z18;
                    jVar.f5485h = true;
                    return z15;
                }
            } catch (Throwable th2) {
                m10.close();
                a6.f();
                throw th2;
            }
        }
        z14 = false;
        it = list.iterator();
        boolean z182 = z14;
        while (it.hasNext()) {
        }
        z15 = z182;
        jVar.f5485h = true;
        return z15;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        x4.e eVar = this.f8739h;
        p4.j jVar = this.f8738g;
        try {
            jVar.getClass();
            p4.n nVar = jVar.f5480c;
            HashSet hashSet = new HashSet();
            hashSet.addAll(jVar.f5483f);
            HashSet O = p4.j.O(jVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(jVar.f5483f);
                    z10 = false;
                    break;
                } else if (O.contains((String) it.next())) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                throw new IllegalStateException("WorkContinuation has cycles (" + jVar + ")");
            }
            WorkDatabase workDatabase = nVar.f5495c;
            workDatabase.c();
            try {
                boolean a6 = a(jVar);
                workDatabase.o();
                if (a6) {
                    j.a(nVar.f5493a, RescheduleReceiver.class, true);
                    p4.h.a(nVar.f5494b, nVar.f5495c, nVar.f5497e);
                }
                eVar.f(o4.t.f5223d);
            } finally {
                workDatabase.k();
            }
        } catch (Throwable th) {
            eVar.f(new o4.q(th));
        }
    }
}
