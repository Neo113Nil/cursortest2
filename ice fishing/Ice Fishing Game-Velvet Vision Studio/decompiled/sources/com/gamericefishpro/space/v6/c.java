package com.gamericefishpro.space.v6;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.gamericefishpro.space.l6.w;
import com.gamericefishpro.space.l6.y;
import com.gamericefishpro.space.s5.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public static final String i = com.gamericefishpro.space.l6.q.d("EnqueueRunnable");
    public final com.gamericefishpro.space.m6.k d;
    public final com.gamericefishpro.space.u6.c e;

    public c(com.gamericefishpro.space.m6.k kVar) {
        com.gamericefishpro.space.u6.c cVar = new com.gamericefishpro.space.u6.c(6);
        this.d = kVar;
        this.e = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0253  */
    /* JADX WARN: Code duplicated, block: B:114:0x0281  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f2  */
    public static boolean a(com.gamericefishpro.space.m6.k kVar) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        List<com.gamericefishpro.space.l6.s> list;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        com.gamericefishpro.space.u6.p workSpec;
        UUID uuid;
        WorkDatabase_Impl workDatabase_Impl;
        com.gamericefishpro.space.u6.s sVarC;
        String id;
        Iterator it;
        WorkDatabase_Impl workDatabase_Impl2;
        WorkDatabase_Impl workDatabase_Impl3;
        int length;
        int i2;
        WorkDatabase_Impl workDatabase_Impl4;
        v vVar;
        kVar.getClass();
        HashSet hashSetE0 = com.gamericefishpro.space.m6.k.e0(kVar);
        com.gamericefishpro.space.m6.o oVar = kVar.c;
        List list2 = kVar.e;
        String[] strArr = (String[]) hashSetE0.toArray(new String[0]);
        String str = kVar.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = oVar.c;
        boolean z9 = strArr != null && strArr.length > 0;
        y yVar = y.y;
        y yVar2 = y.v;
        if (z9) {
            int length2 = strArr.length;
            int i3 = 0;
            z2 = false;
            z3 = false;
            z = true;
            while (true) {
                if (i3 < length2) {
                    String str2 = strArr[i3];
                    com.gamericefishpro.space.u6.p pVarM = workDatabase2.B().m(str2);
                    if (pVarM == null) {
                        com.gamericefishpro.space.l6.q.c().a(i, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        y yVar3 = pVarM.b;
                        z &= yVar3 == y.i;
                        if (yVar3 == yVar2) {
                            z3 = true;
                        } else if (yVar3 == yVar) {
                            z2 = true;
                        }
                        i3++;
                    }
                }
                z8 = true;
                z7 = false;
                kVar.h = z8;
                return z7;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        y yVar4 = y.d;
        if (zIsEmpty || z9) {
            list = list2;
            z4 = zIsEmpty;
            workDatabase = workDatabase2;
            z5 = z9;
        } else {
            WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) workDatabase2.B().a;
            list = list2;
            v vVarB = v.b(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            if (str == null) {
                vVarB.p(1);
            } else {
                vVarB.i(1, str);
            }
            workDatabase_Impl5.b();
            Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl5, vVarB);
            try {
                vVar = vVarB;
                try {
                    ArrayList arrayList = new ArrayList(cursorL.getCount());
                    while (cursorL.moveToNext()) {
                        String id2 = cursorL.isNull(0) ? null : cursorL.getString(0);
                        boolean z10 = zIsEmpty;
                        y state = com.gamericefishpro.space.i.a.C(cursorL.getInt(1));
                        WorkDatabase workDatabase3 = workDatabase2;
                        boolean z11 = z9;
                        Intrinsics.checkNotNullParameter(id2, "id");
                        Intrinsics.checkNotNullParameter(state, "state");
                        com.gamericefishpro.space.u6.o oVar2 = new com.gamericefishpro.space.u6.o();
                        oVar2.a = id2;
                        oVar2.b = state;
                        arrayList.add(oVar2);
                        zIsEmpty = z10;
                        workDatabase2 = workDatabase3;
                        z9 = z11;
                    }
                    z4 = zIsEmpty;
                    workDatabase = workDatabase2;
                    z5 = z9;
                    cursorL.close();
                    vVar.c();
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                y yVar5 = ((com.gamericefishpro.space.u6.o) obj).b;
                                if (yVar5 == yVar4 || yVar5 == y.e) {
                                    z8 = true;
                                    z7 = false;
                                    kVar.h = z8;
                                    return z7;
                                }
                            } else {
                                new b(oVar, str, 1).run();
                                com.gamericefishpro.space.u6.q qVarB = workDatabase.B();
                                int size2 = arrayList.size();
                                int i5 = 0;
                                while (i5 < size2) {
                                    Object obj2 = arrayList.get(i5);
                                    int i6 = i5 + 1;
                                    String str3 = ((com.gamericefishpro.space.u6.o) obj2).a;
                                    WorkDatabase_Impl workDatabase_Impl6 = (WorkDatabase_Impl) qVarB.a;
                                    workDatabase_Impl6.b();
                                    int i7 = size2;
                                    com.gamericefishpro.space.u6.h hVar = (com.gamericefishpro.space.u6.h) qVarB.c;
                                    com.gamericefishpro.space.u6.q qVar = qVarB;
                                    com.gamericefishpro.space.e6.j jVarA = hVar.a();
                                    if (str3 == null) {
                                        jVarA.p(1);
                                    } else {
                                        jVarA.i(1, str3);
                                    }
                                    workDatabase_Impl6.c();
                                    try {
                                        jVarA.b();
                                        workDatabase_Impl6.u();
                                        workDatabase_Impl6.q();
                                        hVar.d(jVarA);
                                        size2 = i7;
                                        qVarB = qVar;
                                        i5 = i6;
                                    } catch (Throwable th) {
                                        workDatabase_Impl6.q();
                                        hVar.d(jVarA);
                                        throw th;
                                    }
                                }
                                z6 = true;
                            }
                        }
                    }
                    for (com.gamericefishpro.space.l6.s sVar : list) {
                        workSpec = sVar.b;
                        uuid = sVar.a;
                        if (z5 || z) {
                            workSpec.n = jCurrentTimeMillis;
                        } else if (z3) {
                            workSpec.b = yVar2;
                        } else if (z2) {
                            workSpec.b = yVar;
                        } else {
                            workSpec.b = y.w;
                        }
                        if (workSpec.b == yVar4) {
                            z6 = true;
                        }
                        com.gamericefishpro.space.u6.q qVarB2 = workDatabase.B();
                        boolean z12 = z6;
                        List schedulers = oVar.e;
                        com.gamericefishpro.space.m6.o oVar3 = oVar;
                        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
                        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                        workDatabase_Impl = (WorkDatabase_Impl) qVarB2.a;
                        workDatabase_Impl.b();
                        workDatabase_Impl.c();
                        try {
                            ((com.gamericefishpro.space.u6.b) qVarB2.b).f(workSpec);
                            workDatabase_Impl.u();
                            workDatabase_Impl.q();
                            if (z5) {
                                length = strArr.length;
                                i2 = 0;
                                while (i2 < length) {
                                    String str4 = strArr[i2];
                                    String[] strArr2 = strArr;
                                    int i8 = length;
                                    String string = uuid.toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
                                    com.gamericefishpro.space.u6.a aVar = new com.gamericefishpro.space.u6.a(string, str4);
                                    com.gamericefishpro.space.u6.c cVarW = workDatabase.w();
                                    workDatabase_Impl4 = (WorkDatabase_Impl) cVarW.d;
                                    workDatabase_Impl4.b();
                                    workDatabase_Impl4.c();
                                    try {
                                        ((com.gamericefishpro.space.u6.b) cVarW.e).f(aVar);
                                        workDatabase_Impl4.u();
                                        workDatabase_Impl4.q();
                                        i2++;
                                        strArr = strArr2;
                                        length = i8;
                                    } catch (Throwable th2) {
                                        workDatabase_Impl4.q();
                                        throw th2;
                                    }
                                }
                            }
                            String[] strArr3 = strArr;
                            sVarC = workDatabase.C();
                            id = uuid.toString();
                            Intrinsics.checkNotNullExpressionValue(id, "id.toString()");
                            Set tags = sVar.c;
                            sVarC.getClass();
                            Intrinsics.checkNotNullParameter(id, "id");
                            Intrinsics.checkNotNullParameter(tags, "tags");
                            it = tags.iterator();
                            while (it.hasNext()) {
                                com.gamericefishpro.space.u6.r rVar = new com.gamericefishpro.space.u6.r((String) it.next(), id);
                                workDatabase_Impl3 = (WorkDatabase_Impl) sVarC.e;
                                workDatabase_Impl3.b();
                                workDatabase_Impl3.c();
                                String str5 = id;
                                try {
                                    ((com.gamericefishpro.space.u6.b) sVarC.i).f(rVar);
                                    workDatabase_Impl3.u();
                                    workDatabase_Impl3.q();
                                    id = str5;
                                } catch (Throwable th3) {
                                    workDatabase_Impl3.q();
                                    throw th3;
                                }
                            }
                            if (!z4) {
                                com.gamericefishpro.space.u6.l lVarZ = workDatabase.z();
                                String string2 = uuid.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
                                com.gamericefishpro.space.u6.k kVar2 = new com.gamericefishpro.space.u6.k(str, string2);
                                workDatabase_Impl2 = (WorkDatabase_Impl) lVarZ.d;
                                workDatabase_Impl2.b();
                                workDatabase_Impl2.c();
                                try {
                                    ((com.gamericefishpro.space.u6.b) lVarZ.e).f(kVar2);
                                    workDatabase_Impl2.u();
                                    workDatabase_Impl2.q();
                                } catch (Throwable th4) {
                                    workDatabase_Impl2.q();
                                    throw th4;
                                }
                            }
                            z6 = z12;
                            oVar = oVar3;
                            strArr = strArr3;
                        } catch (Throwable th5) {
                            workDatabase_Impl.q();
                            throw th5;
                        }
                    }
                    z7 = z6;
                    z8 = true;
                    kVar.h = z8;
                    return z7;
                } catch (Throwable th6) {
                    th = th6;
                    cursorL.close();
                    vVar.c();
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                vVar = vVarB;
            }
        }
        z6 = false;
        while (r4.hasNext()) {
            workSpec = sVar.b;
            uuid = sVar.a;
            if (z5) {
                workSpec.n = jCurrentTimeMillis;
            } else {
                workSpec.n = jCurrentTimeMillis;
            }
            if (workSpec.b == yVar4) {
                z6 = true;
            }
            com.gamericefishpro.space.u6.q qVarB3 = workDatabase.B();
            boolean z13 = z6;
            List schedulers2 = oVar.e;
            com.gamericefishpro.space.m6.o oVar4 = oVar;
            Intrinsics.checkNotNullParameter(schedulers2, "schedulers");
            Intrinsics.checkNotNullParameter(workSpec, "workSpec");
            workDatabase_Impl = (WorkDatabase_Impl) qVarB3.a;
            workDatabase_Impl.b();
            workDatabase_Impl.c();
            ((com.gamericefishpro.space.u6.b) qVarB3.b).f(workSpec);
            workDatabase_Impl.u();
            workDatabase_Impl.q();
            if (z5) {
                length = strArr.length;
                i2 = 0;
                while (i2 < length) {
                    String str6 = strArr[i2];
                    String[] strArr4 = strArr;
                    int i9 = length;
                    String string3 = uuid.toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "id.toString()");
                    com.gamericefishpro.space.u6.a aVar2 = new com.gamericefishpro.space.u6.a(string3, str6);
                    com.gamericefishpro.space.u6.c cVarW2 = workDatabase.w();
                    workDatabase_Impl4 = (WorkDatabase_Impl) cVarW2.d;
                    workDatabase_Impl4.b();
                    workDatabase_Impl4.c();
                    ((com.gamericefishpro.space.u6.b) cVarW2.e).f(aVar2);
                    workDatabase_Impl4.u();
                    workDatabase_Impl4.q();
                    i2++;
                    strArr = strArr4;
                    length = i9;
                }
            }
            String[] strArr5 = strArr;
            sVarC = workDatabase.C();
            id = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(id, "id.toString()");
            Set tags2 = sVar.c;
            sVarC.getClass();
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tags2, "tags");
            it = tags2.iterator();
            while (it.hasNext()) {
                com.gamericefishpro.space.u6.r rVar2 = new com.gamericefishpro.space.u6.r((String) it.next(), id);
                workDatabase_Impl3 = (WorkDatabase_Impl) sVarC.e;
                workDatabase_Impl3.b();
                workDatabase_Impl3.c();
                String str7 = id;
                ((com.gamericefishpro.space.u6.b) sVarC.i).f(rVar2);
                workDatabase_Impl3.u();
                workDatabase_Impl3.q();
                id = str7;
            }
            if (!z4) {
                com.gamericefishpro.space.u6.l lVarZ2 = workDatabase.z();
                String string4 = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(string4, "id.toString()");
                com.gamericefishpro.space.u6.k kVar3 = new com.gamericefishpro.space.u6.k(str, string4);
                workDatabase_Impl2 = (WorkDatabase_Impl) lVarZ2.d;
                workDatabase_Impl2.b();
                workDatabase_Impl2.c();
                ((com.gamericefishpro.space.u6.b) lVarZ2.e).f(kVar3);
                workDatabase_Impl2.u();
                workDatabase_Impl2.q();
            }
            z6 = z13;
            oVar = oVar4;
            strArr = strArr5;
        }
        z7 = z6;
        z8 = true;
        kVar.h = z8;
        return z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        com.gamericefishpro.space.u6.c cVar = this.e;
        com.gamericefishpro.space.m6.k kVar = this.d;
        try {
            kVar.getClass();
            com.gamericefishpro.space.m6.o oVar = kVar.c;
            HashSet hashSet = new HashSet();
            hashSet.addAll(kVar.f);
            HashSet hashSetE0 = com.gamericefishpro.space.m6.k.e0(kVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(kVar.f);
                    z = false;
                    break;
                } else if (hashSetE0.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + kVar + ")");
            }
            WorkDatabase workDatabase = oVar.c;
            workDatabase.c();
            try {
                boolean zA = a(kVar);
                workDatabase.u();
                workDatabase.q();
                if (zA) {
                    j.a(oVar.a, RescheduleReceiver.class, true);
                    com.gamericefishpro.space.m6.i.a(oVar.b, oVar.c, oVar.e);
                }
                cVar.m(w.r);
            } catch (Throwable th) {
                workDatabase.q();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.m(new com.gamericefishpro.space.l6.t(th2));
        }
    }
}
