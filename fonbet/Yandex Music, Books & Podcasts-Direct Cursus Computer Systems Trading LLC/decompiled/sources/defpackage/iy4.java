package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class iy4 implements u34 {
    public final jyr a = l18.b.b(hag.I(e15.class), true);

    /* JADX WARN: Removed duplicated region for block: B:16:0x012e A[LOOP:0: B:14:0x0128->B:16:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0159 A[LOOP:1: B:19:0x0153->B:21:0x0159, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017c A[LOOP:2: B:24:0x0176->B:26:0x017c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, cg6 cg6Var) {
        hy4 hy4Var;
        nm6 nm6Var;
        int i2;
        long elapsedRealtimeNanos;
        int i3;
        Object f;
        int i4;
        List list;
        Object e;
        int i5;
        int i6;
        long j;
        int i7;
        Object V;
        List list2;
        List list3;
        Iterator it;
        Iterator it2;
        Iterator it3;
        int i8 = i;
        if (cg6Var instanceof hy4) {
            hy4Var = (hy4) cg6Var;
            int i9 = hy4Var.r;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                hy4Var.r = i9 - Integer.MIN_VALUE;
                hy4 hy4Var2 = hy4Var;
                Object obj = hy4Var2.p;
                nm6Var = nm6.a;
                i2 = hy4Var2.r;
                jyr jyrVar = this.a;
                if (i2 != 0) {
                    qgg.h0(obj);
                    elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    e15 e15Var = (e15) jyrVar.getValue();
                    Integer num = new Integer(i8);
                    hy4Var2.j = i8;
                    i3 = 0;
                    hy4Var2.k = 0;
                    hy4Var2.o = elapsedRealtimeNanos;
                    hy4Var2.l = 0;
                    hy4Var2.r = 1;
                    e15Var.getClass();
                    f = e15.f(e15Var, null, Boolean.TRUE, num, hy4Var2, 41);
                    if (f != nm6Var) {
                        i4 = 0;
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list2 = hy4Var2.n;
                        list3 = hy4Var2.m;
                        qgg.h0(obj);
                        List list4 = (List) obj;
                        ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                        it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(u34.a((cvl) it.next(), t34.a, t34.b));
                        }
                        List list5 = list2;
                        ArrayList arrayList2 = new ArrayList(v75.o(list5, 10));
                        it2 = list5.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(u34.c((oq) it2.next()));
                        }
                        List list6 = list3;
                        ArrayList arrayList3 = new ArrayList(v75.o(list6, 10));
                        it3 = list6.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(u34.b((mqs) it3.next()));
                        }
                        zgg zggVar = new zgg(CollectionsKt.g0(CollectionsKt.g0(arrayList3, arrayList2), arrayList));
                        SystemClock.elapsedRealtimeNanos();
                        return zggVar;
                    }
                    i6 = hy4Var2.l;
                    j = hy4Var2.o;
                    i7 = hy4Var2.k;
                    i5 = hy4Var2.j;
                    List list7 = hy4Var2.m;
                    qgg.h0(obj);
                    list = list7;
                    List list8 = (List) obj;
                    e15 e15Var2 = (e15) jyrVar.getValue();
                    Integer num2 = new Integer(i5);
                    hy4Var2.m = list;
                    hy4Var2.n = list8;
                    hy4Var2.j = i5;
                    hy4Var2.k = i7;
                    hy4Var2.o = j;
                    hy4Var2.l = i6;
                    hy4Var2.r = 3;
                    e15Var2.getClass();
                    Boolean bool = Boolean.TRUE;
                    V = x97.V(dm6.b, new q05(e15Var2, num2, bool, bool, null, null, null), hy4Var2);
                    if (V != nm6Var) {
                        obj = V;
                        list2 = list8;
                        list3 = list;
                        List list42 = (List) obj;
                        ArrayList arrayList4 = new ArrayList(v75.o(list42, 10));
                        it = list42.iterator();
                        while (it.hasNext()) {
                        }
                        List list52 = list2;
                        ArrayList arrayList22 = new ArrayList(v75.o(list52, 10));
                        it2 = list52.iterator();
                        while (it2.hasNext()) {
                        }
                        List list62 = list3;
                        ArrayList arrayList32 = new ArrayList(v75.o(list62, 10));
                        it3 = list62.iterator();
                        while (it3.hasNext()) {
                        }
                        zgg zggVar2 = new zgg(CollectionsKt.g0(CollectionsKt.g0(arrayList32, arrayList22), arrayList4));
                        SystemClock.elapsedRealtimeNanos();
                        return zggVar2;
                    }
                    return nm6Var;
                }
                int i10 = hy4Var2.l;
                long j2 = hy4Var2.o;
                int i11 = hy4Var2.k;
                int i12 = hy4Var2.j;
                qgg.h0(obj);
                elapsedRealtimeNanos = j2;
                i4 = i11;
                f = obj;
                i3 = i10;
                i8 = i12;
                list = (List) f;
                e15 e15Var3 = (e15) jyrVar.getValue();
                Integer num3 = new Integer(i8);
                hy4Var2.m = list;
                hy4Var2.j = i8;
                hy4Var2.k = i4;
                hy4Var2.o = elapsedRealtimeNanos;
                hy4Var2.l = i3;
                hy4Var2.r = 2;
                e15Var3.getClass();
                e = e15.e(e15Var3, null, Boolean.TRUE, num3, hy4Var2, 17);
                if (e != nm6Var) {
                    i5 = i8;
                    i6 = i3;
                    obj = e;
                    j = elapsedRealtimeNanos;
                    i7 = i4;
                    List list82 = (List) obj;
                    e15 e15Var22 = (e15) jyrVar.getValue();
                    Integer num22 = new Integer(i5);
                    hy4Var2.m = list;
                    hy4Var2.n = list82;
                    hy4Var2.j = i5;
                    hy4Var2.k = i7;
                    hy4Var2.o = j;
                    hy4Var2.l = i6;
                    hy4Var2.r = 3;
                    e15Var22.getClass();
                    Boolean bool2 = Boolean.TRUE;
                    V = x97.V(dm6.b, new q05(e15Var22, num22, bool2, bool2, null, null, null), hy4Var2);
                    if (V != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        hy4Var = new hy4(this, cg6Var);
        hy4 hy4Var22 = hy4Var;
        Object obj2 = hy4Var22.p;
        nm6Var = nm6.a;
        i2 = hy4Var22.r;
        jyr jyrVar2 = this.a;
        if (i2 != 0) {
        }
        list = (List) f;
        e15 e15Var32 = (e15) jyrVar2.getValue();
        Integer num32 = new Integer(i8);
        hy4Var22.m = list;
        hy4Var22.j = i8;
        hy4Var22.k = i4;
        hy4Var22.o = elapsedRealtimeNanos;
        hy4Var22.l = i3;
        hy4Var22.r = 2;
        e15Var32.getClass();
        e = e15.e(e15Var32, null, Boolean.TRUE, num32, hy4Var22, 17);
        if (e != nm6Var) {
        }
        return nm6Var;
    }
}
