package defpackage;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class p8b {
    public static final String a = jsg.n("EnqueueRunnable");

    public static void a(s3w s3wVar) {
        boolean z;
        g4w g4wVar = s3wVar.a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(s3wVar.e);
        HashSet b = s3w.b(s3wVar);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(s3wVar.e);
                z = false;
                break;
            } else if (b.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            rj7.n(s3wVar, ")", "WorkContinuation has cycles (");
            return;
        }
        WorkDatabase workDatabase = g4wVar.c;
        r46 r46Var = g4wVar.b;
        workDatabase.b();
        try {
            bow.n(workDatabase, r46Var, s3wVar);
            boolean b2 = b(s3wVar);
            workDatabase.t();
            if (b2) {
                tto.b(r46Var, g4wVar.c, g4wVar.e);
            }
        } finally {
            workDatabase.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01aa  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(s3w s3wVar) {
        boolean z;
        boolean z2;
        boolean z3;
        List list;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        Iterator it;
        boolean z6;
        boolean z7;
        HashSet b = s3w.b(s3wVar);
        g4w g4wVar = s3wVar.a;
        List list2 = s3wVar.d;
        String[] strArr = (String[]) b.toArray(new String[0]);
        String str = s3wVar.b;
        opb opbVar = s3wVar.c;
        g4wVar.b.d.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = g4wVar.c;
        boolean z8 = strArr != null && strArr.length > 0;
        if (z8) {
            z2 = false;
            z3 = false;
            z = true;
            for (String str2 : strArr) {
                t4w e = workDatabase2.A().e(str2);
                if (e == null) {
                    jsg.j().g(a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    break;
                }
                c4w c4wVar = e.b;
                z &= c4wVar == c4w.c;
                if (c4wVar == c4w.d) {
                    z3 = true;
                } else if (c4wVar == c4w.f) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!isEmpty && !z8) {
            List f = workDatabase2.A().f(str);
            if (!f.isEmpty()) {
                if (opbVar != opb.c && opbVar != opb.d) {
                    if (opbVar == opb.b) {
                        Iterator it2 = f.iterator();
                        while (it2.hasNext()) {
                            c4w c4wVar2 = ((r4w) it2.next()).b;
                            if (c4wVar2 != c4w.a && c4wVar2 != c4w.b) {
                            }
                            z7 = false;
                            z6 = true;
                        }
                    }
                    workDatabase2.getClass();
                    workDatabase2.s(new b6n(25, new cy1(3, workDatabase2, str, g4wVar)));
                    x4w A = workDatabase2.A();
                    Iterator it3 = f.iterator();
                    while (it3.hasNext()) {
                        A.c(((r4w) it3.next()).a);
                    }
                    list = list2;
                    z4 = isEmpty;
                    workDatabase = workDatabase2;
                    z5 = true;
                    it = list.iterator();
                    boolean z9 = z5;
                    while (it.hasNext()) {
                    }
                    z6 = true;
                    z7 = z9;
                    s3wVar.g = z6;
                    return z7;
                }
                rx7 v = workDatabase2.v();
                ArrayList arrayList = new ArrayList();
                Iterator it4 = f.iterator();
                while (it4.hasNext()) {
                    r4w r4wVar = (r4w) it4.next();
                    List list3 = list2;
                    String str3 = r4wVar.a;
                    v.getClass();
                    str3.getClass();
                    boolean z10 = isEmpty;
                    WorkDatabase workDatabase3 = workDatabase2;
                    Iterator it5 = it4;
                    if (!((Boolean) up6.F(v.a, true, false, new wq(str3, 19))).booleanValue()) {
                        c4w c4wVar3 = r4wVar.b;
                        boolean z11 = (c4wVar3 == c4w.c) & z;
                        if (c4wVar3 == c4w.d) {
                            z3 = true;
                        } else if (c4wVar3 == c4w.f) {
                            z2 = true;
                        }
                        arrayList.add(r4wVar.a);
                        z = z11;
                    }
                    list2 = list3;
                    isEmpty = z10;
                    workDatabase2 = workDatabase3;
                    it4 = it5;
                }
                list = list2;
                z4 = isEmpty;
                workDatabase = workDatabase2;
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (opbVar == opb.d && (z2 || z3)) {
                    x4w A2 = workDatabase.A();
                    Iterator it6 = A2.f(str).iterator();
                    while (it6.hasNext()) {
                        A2.c(((r4w) it6.next()).a);
                    }
                    z2 = false;
                    z3 = false;
                    arrayList2 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                z8 = strArr.length > 0;
                z5 = false;
                it = list.iterator();
                boolean z92 = z5;
                while (it.hasNext()) {
                    p4w p4wVar = (p4w) it.next();
                    t4w t4wVar = p4wVar.b;
                    UUID uuid = p4wVar.a;
                    if (!z8 || z) {
                        t4wVar.n = currentTimeMillis;
                    } else if (z3) {
                        t4wVar.b = c4w.d;
                    } else if (z2) {
                        t4wVar.b = c4w.f;
                    } else {
                        t4wVar.b = c4w.e;
                    }
                    if (t4wVar.b == c4w.a) {
                        z92 = true;
                    }
                    x4w A3 = workDatabase.A();
                    t4w G = bow.G(g4wVar.e, t4wVar);
                    A3.getClass();
                    g4w g4wVar2 = g4wVar;
                    Iterator it7 = it;
                    up6.F(A3.a, false, true, new itv(10, A3, G));
                    if (z8) {
                        int i = 0;
                        for (int length = strArr.length; i < length; length = length) {
                            String str4 = strArr[i];
                            String uuid2 = uuid.toString();
                            uuid2.getClass();
                            nx7 nx7Var = new nx7(uuid2, str4);
                            rx7 v2 = workDatabase.v();
                            v2.getClass();
                            up6.F(v2.a, false, true, new ny2(10, v2, nx7Var));
                            i++;
                            strArr = strArr;
                        }
                    }
                    String[] strArr2 = strArr;
                    z4w B = workDatabase.B();
                    String uuid3 = uuid.toString();
                    uuid3.getClass();
                    B.a(uuid3, p4wVar.c);
                    if (!z4) {
                        l4w y = workDatabase.y();
                        String uuid4 = uuid.toString();
                        uuid4.getClass();
                        k4w k4wVar = new k4w(str, uuid4);
                        y.getClass();
                        up6.F(y.a, false, true, new itv(7, y, k4wVar));
                    }
                    g4wVar = g4wVar2;
                    it = it7;
                    strArr = strArr2;
                }
                z6 = true;
                z7 = z92;
                s3wVar.g = z6;
                return z7;
            }
        }
        list = list2;
        z4 = isEmpty;
        workDatabase = workDatabase2;
        z5 = false;
        it = list.iterator();
        boolean z922 = z5;
        while (it.hasNext()) {
        }
        z6 = true;
        z7 = z922;
        s3wVar.g = z6;
        return z7;
    }
}
