package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ey4 implements u34 {
    public final jyr a = l18.b.b(hag.I(e15.class), true);

    /* JADX WARN: Removed duplicated region for block: B:14:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[LOOP:1: B:31:0x00a1->B:33:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, cg6 cg6Var) {
        cy4 cy4Var;
        Object obj;
        nm6 nm6Var;
        int i2;
        long elapsedRealtimeNanos;
        int i3;
        Object V;
        int i4;
        Iterator it;
        ArrayList arrayList;
        int i5 = i;
        if (cg6Var instanceof cy4) {
            cy4Var = (cy4) cg6Var;
            int i6 = cy4Var.q;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cy4Var.q = i6 - Integer.MIN_VALUE;
                obj = cy4Var.o;
                nm6Var = nm6.a;
                i2 = cy4Var.q;
                jyr jyrVar = this.a;
                if (i2 != 0) {
                    qgg.h0(obj);
                    elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    e15 e15Var = (e15) jyrVar.getValue();
                    Integer num = new Integer(i5);
                    cy4Var.j = i5;
                    i3 = 0;
                    cy4Var.k = 0;
                    cy4Var.n = elapsedRealtimeNanos;
                    cy4Var.l = 0;
                    cy4Var.q = 1;
                    e15Var.getClass();
                    List list = dw.MyMusicAlbums.a;
                    V = x97.V(dm6.b, new n05(e15Var, num, vz1.k(list, list), Boolean.FALSE, null, null), cy4Var);
                    if (V != nm6Var) {
                        i4 = 0;
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = cy4Var.m;
                    qgg.h0(obj);
                    Iterable<kjm> iterable = (Iterable) obj;
                    ArrayList arrayList2 = new ArrayList(v75.o(iterable, 10));
                    for (kjm kjmVar : iterable) {
                        kjmVar.getClass();
                        String str = kjmVar.f;
                        if (str == null) {
                            str = "";
                        }
                        co6 co6Var = kjmVar.m;
                        qo6 qo6Var = qo6.c;
                        Date date = kjmVar.i;
                        arrayList2.add(new e24(str, co6Var, qo6Var, null, date != null ? date.getTime() : 0L));
                    }
                    zgg zggVar = new zgg(CollectionsKt.g0(arrayList2, arrayList));
                    SystemClock.elapsedRealtimeNanos();
                    return zggVar;
                }
                int i7 = cy4Var.l;
                long j = cy4Var.n;
                int i8 = cy4Var.k;
                int i9 = cy4Var.j;
                qgg.h0(obj);
                i3 = i7;
                i5 = i9;
                elapsedRealtimeNanos = j;
                i4 = i8;
                V = obj;
                Iterable iterable2 = (Iterable) V;
                ArrayList arrayList3 = new ArrayList(v75.o(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(u34.c((oq) it.next()));
                }
                e15 e15Var2 = (e15) jyrVar.getValue();
                Integer num2 = new Integer(i5);
                cy4Var.m = arrayList3;
                cy4Var.j = i5;
                cy4Var.k = i4;
                cy4Var.n = elapsedRealtimeNanos;
                cy4Var.l = i3;
                cy4Var.q = 2;
                e15Var2.getClass();
                obj = x97.V(dm6.b, new vv4(e15Var2, num2, (Continuation) null, 2), cy4Var);
                if (obj != nm6Var) {
                    arrayList = arrayList3;
                    Iterable<kjm> iterable3 = (Iterable) obj;
                    ArrayList arrayList22 = new ArrayList(v75.o(iterable3, 10));
                    while (r2.hasNext()) {
                    }
                    zgg zggVar2 = new zgg(CollectionsKt.g0(arrayList22, arrayList));
                    SystemClock.elapsedRealtimeNanos();
                    return zggVar2;
                }
                return nm6Var;
            }
        }
        cy4Var = new cy4(this, cg6Var);
        obj = cy4Var.o;
        nm6Var = nm6.a;
        i2 = cy4Var.q;
        jyr jyrVar2 = this.a;
        if (i2 != 0) {
        }
        Iterable iterable22 = (Iterable) V;
        ArrayList arrayList32 = new ArrayList(v75.o(iterable22, 10));
        it = iterable22.iterator();
        while (it.hasNext()) {
        }
        e15 e15Var22 = (e15) jyrVar2.getValue();
        Integer num22 = new Integer(i5);
        cy4Var.m = arrayList32;
        cy4Var.j = i5;
        cy4Var.k = i4;
        cy4Var.n = elapsedRealtimeNanos;
        cy4Var.l = i3;
        cy4Var.q = 2;
        e15Var22.getClass();
        obj = x97.V(dm6.b, new vv4(e15Var22, num22, (Continuation) null, 2), cy4Var);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[LOOP:0: B:11:0x0060->B:13:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, cg6 cg6Var) {
        dy4 dy4Var;
        int i2;
        Iterator it;
        if (cg6Var instanceof dy4) {
            dy4Var = (dy4) cg6Var;
            int i3 = dy4Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dy4Var.l = i3 - Integer.MIN_VALUE;
                Object obj = dy4Var.j;
                nm6 nm6Var = nm6.a;
                i2 = dy4Var.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    SystemClock.elapsedRealtimeNanos();
                    e15 e15Var = (e15) this.a.getValue();
                    Integer num = new Integer(i);
                    dy4Var.l = 1;
                    obj = e15.i(e15Var, null, num, dy4Var, 11);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(u34.a((cvl) it.next(), t34.a, t34.b));
                }
                zgg zggVar = new zgg(arrayList);
                SystemClock.elapsedRealtimeNanos();
                return zggVar;
            }
        }
        dy4Var = new dy4(this, cg6Var);
        Object obj2 = dy4Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = dy4Var.l;
        if (i2 != 0) {
        }
        List list2 = (List) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
        }
        zgg zggVar2 = new zgg(arrayList2);
        SystemClock.elapsedRealtimeNanos();
        return zggVar2;
    }
}
