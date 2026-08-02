package defpackage;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class by4 implements u34 {
    public final jyr a = l18.b.b(hag.I(yx4.class), true);

    /* JADX WARN: Removed duplicated region for block: B:23:0x01c9 A[LOOP:0: B:21:0x01c3->B:23:0x01c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0149 A[LOOP:1: B:32:0x0143->B:34:0x0149, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6 A[LOOP:2: B:41:0x00d0->B:43:0x00d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, cg6 cg6Var) {
        ay4 ay4Var;
        nm6 nm6Var;
        int i2;
        int i3;
        Object z;
        int i4;
        long j;
        jyr jyrVar;
        Serializable k;
        int i5;
        int i6;
        long j2;
        int i7;
        Collection collection;
        Collection collection2;
        Serializable m;
        List list;
        long j3;
        int i8;
        int i9;
        List list2;
        List list3;
        Collection collection3;
        int i10 = i;
        if (cg6Var instanceof ay4) {
            ay4Var = (ay4) cg6Var;
            int i11 = ay4Var.s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                ay4Var.s = i11 - Integer.MIN_VALUE;
                ay4 ay4Var2 = ay4Var;
                Object obj = ay4Var2.q;
                nm6Var = nm6.a;
                i2 = ay4Var2.s;
                jyr jyrVar2 = this.a;
                if (i2 != 0) {
                    qgg.h0(obj);
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    yx4 yx4Var = (yx4) jyrVar2.getValue();
                    Integer num = new Integer(i10);
                    ay4Var2.j = i10;
                    i3 = 0;
                    ay4Var2.k = 0;
                    ay4Var2.p = elapsedRealtimeNanos;
                    ay4Var2.l = 0;
                    ay4Var2.s = 1;
                    z = yx4Var.z(null, null, null, num, ay4Var2);
                    if (z != nm6Var) {
                        i4 = 0;
                        j = elapsedRealtimeNanos;
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            collection3 = (List) ay4Var2.o;
                            list2 = ay4Var2.n;
                            list3 = ay4Var2.m;
                            qgg.h0(obj);
                            ygg yggVar = new ygg(((Number) obj).longValue(), list2, CollectionsKt.g0(collection3, list3));
                            SystemClock.elapsedRealtimeNanos();
                            return yggVar;
                        }
                        i6 = ay4Var2.l;
                        j3 = ay4Var2.p;
                        i8 = ay4Var2.k;
                        i9 = ay4Var2.j;
                        Collection collection4 = (List) ay4Var2.n;
                        list = ay4Var2.m;
                        qgg.h0(obj);
                        collection2 = collection4;
                        jyrVar = jyrVar2;
                        Iterable<jja> iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        for (jja jjaVar : iterable) {
                            jjaVar.getClass();
                            mqs mqsVar = jjaVar.a;
                            arrayList.add(new e24(mqsVar.c, mqsVar.x0, qo6.a, pd.R(mqsVar.f().a), jjaVar.b));
                        }
                        yx4 yx4Var2 = (yx4) jyrVar.getValue();
                        ay4Var2.m = list;
                        ay4Var2.n = arrayList;
                        ay4Var2.o = (List) collection2;
                        ay4Var2.j = i9;
                        ay4Var2.k = i8;
                        ay4Var2.p = j3;
                        ay4Var2.l = i6;
                        ay4Var2.s = 4;
                        obj = yx4Var2.f(ay4Var2);
                        if (obj != nm6Var) {
                            list2 = arrayList;
                            list3 = list;
                            collection3 = collection2;
                            ygg yggVar2 = new ygg(((Number) obj).longValue(), list2, CollectionsKt.g0(collection3, list3));
                            SystemClock.elapsedRealtimeNanos();
                            return yggVar2;
                        }
                        return nm6Var;
                    }
                    i6 = ay4Var2.l;
                    long j4 = ay4Var2.p;
                    int i12 = ay4Var2.k;
                    int i13 = ay4Var2.j;
                    Collection collection5 = (List) ay4Var2.m;
                    qgg.h0(obj);
                    j2 = j4;
                    i5 = i13;
                    jyrVar = jyrVar2;
                    i7 = i12;
                    collection = collection5;
                    collection2 = collection;
                    Iterable<kca> iterable2 = (Iterable) obj;
                    ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
                    for (kca kcaVar : iterable2) {
                        kcaVar.getClass();
                        oq oqVar = kcaVar.a;
                        arrayList2.add(new e24(oqVar.b, oqVar.D, qo6.b, null, kcaVar.b));
                        j2 = j2;
                    }
                    long j5 = j2;
                    yx4 yx4Var3 = (yx4) jyrVar.getValue();
                    Boolean bool = Boolean.TRUE;
                    Integer num2 = new Integer(i5);
                    ay4Var2.m = arrayList2;
                    ay4Var2.n = (List) collection2;
                    ay4Var2.j = i5;
                    ay4Var2.k = i7;
                    ay4Var2.p = j5;
                    ay4Var2.l = i6;
                    ay4Var2.s = 3;
                    yx4Var3.getClass();
                    m = yx4.m(yx4Var3, null, null, num2, bool, ay4Var2, 19);
                    if (m != nm6Var) {
                        list = arrayList2;
                        obj = m;
                        j3 = j5;
                        i8 = i7;
                        i9 = i5;
                        Iterable<jja> iterable3 = (Iterable) obj;
                        ArrayList arrayList3 = new ArrayList(v75.o(iterable3, 10));
                        while (r2.hasNext()) {
                        }
                        yx4 yx4Var22 = (yx4) jyrVar.getValue();
                        ay4Var2.m = list;
                        ay4Var2.n = arrayList3;
                        ay4Var2.o = (List) collection2;
                        ay4Var2.j = i9;
                        ay4Var2.k = i8;
                        ay4Var2.p = j3;
                        ay4Var2.l = i6;
                        ay4Var2.s = 4;
                        obj = yx4Var22.f(ay4Var2);
                        if (obj != nm6Var) {
                        }
                    }
                    return nm6Var;
                }
                int i14 = ay4Var2.l;
                long j6 = ay4Var2.p;
                int i15 = ay4Var2.k;
                int i16 = ay4Var2.j;
                qgg.h0(obj);
                i3 = i14;
                i10 = i16;
                i4 = i15;
                j = j6;
                z = obj;
                Iterable<gga> iterable4 = (Iterable) z;
                ArrayList arrayList4 = new ArrayList(v75.o(iterable4, 10));
                for (gga ggaVar : iterable4) {
                    ggaVar.getClass();
                    cvl cvlVar = ggaVar.a;
                    arrayList4.add(new e24(cvlVar.b, op7.c(cvlVar), qo6.e, null, ggaVar.b));
                    jyrVar2 = jyrVar2;
                }
                jyrVar = jyrVar2;
                yx4 yx4Var4 = (yx4) jyrVar.getValue();
                Integer num3 = new Integer(i10);
                ay4Var2.m = arrayList4;
                ay4Var2.j = i10;
                ay4Var2.k = i4;
                ay4Var2.p = j;
                ay4Var2.l = i3;
                ay4Var2.s = 2;
                yx4Var4.getClass();
                k = yx4Var4.k(null, null, num3, ay4Var2);
                if (k != nm6Var) {
                    i5 = i10;
                    i6 = i3;
                    obj = k;
                    j2 = j;
                    i7 = i4;
                    collection = arrayList4;
                    collection2 = collection;
                    Iterable<kca> iterable22 = (Iterable) obj;
                    ArrayList arrayList22 = new ArrayList(v75.o(iterable22, 10));
                    while (r2.hasNext()) {
                    }
                    long j52 = j2;
                    yx4 yx4Var32 = (yx4) jyrVar.getValue();
                    Boolean bool2 = Boolean.TRUE;
                    Integer num22 = new Integer(i5);
                    ay4Var2.m = arrayList22;
                    ay4Var2.n = (List) collection2;
                    ay4Var2.j = i5;
                    ay4Var2.k = i7;
                    ay4Var2.p = j52;
                    ay4Var2.l = i6;
                    ay4Var2.s = 3;
                    yx4Var32.getClass();
                    m = yx4.m(yx4Var32, null, null, num22, bool2, ay4Var2, 19);
                    if (m != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        ay4Var = new ay4(this, cg6Var);
        ay4 ay4Var22 = ay4Var;
        Object obj2 = ay4Var22.q;
        nm6Var = nm6.a;
        i2 = ay4Var22.s;
        jyr jyrVar22 = this.a;
        if (i2 != 0) {
        }
        Iterable<gga> iterable42 = (Iterable) z;
        ArrayList arrayList42 = new ArrayList(v75.o(iterable42, 10));
        while (r4.hasNext()) {
        }
        jyrVar = jyrVar22;
        yx4 yx4Var42 = (yx4) jyrVar.getValue();
        Integer num32 = new Integer(i10);
        ay4Var22.m = arrayList42;
        ay4Var22.j = i10;
        ay4Var22.k = i4;
        ay4Var22.p = j;
        ay4Var22.l = i3;
        ay4Var22.s = 2;
        yx4Var42.getClass();
        k = yx4Var42.k(null, null, num32, ay4Var22);
        if (k != nm6Var) {
        }
        return nm6Var;
    }
}
