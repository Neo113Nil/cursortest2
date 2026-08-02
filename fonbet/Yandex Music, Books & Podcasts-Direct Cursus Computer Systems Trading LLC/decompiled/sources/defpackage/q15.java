package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class q15 implements u34 {
    public final jyr a;
    public final jyr b;

    public q15() {
        bdt I = hag.I(frt.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(e15.class), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        if (r13 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, cg6 cg6Var) {
        p15 p15Var;
        int i2;
        long elapsedRealtimeNanos;
        e15 e15Var;
        int i3;
        int i4;
        if (cg6Var instanceof p15) {
            p15Var = (p15) cg6Var;
            int i5 = p15Var.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                p15Var.q = i5 - Integer.MIN_VALUE;
                Object obj = p15Var.o;
                nm6 nm6Var = nm6.a;
                i2 = p15Var.q;
                if (i2 != 0) {
                    qgg.h0(obj);
                    elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    e15Var = (e15) this.b.getValue();
                    pjc g = ((frt) this.a.getValue()).g();
                    p15Var.m = e15Var;
                    p15Var.j = i;
                    i3 = 0;
                    p15Var.k = 0;
                    p15Var.n = elapsedRealtimeNanos;
                    p15Var.l = 0;
                    p15Var.q = 1;
                    obj = zsd.g0(g, p15Var);
                    if (obj != nm6Var) {
                        i4 = 0;
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) obj) {
                        cvl cvlVar = (cvl) obj2;
                        if (!cvlVar.d() || cvlVar.g > 0) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(u34.a((cvl) it.next(), t34.c, t34.b));
                    }
                    zgg zggVar = new zgg(arrayList2);
                    SystemClock.elapsedRealtimeNanos();
                    return zggVar;
                }
                int i6 = p15Var.l;
                long j = p15Var.n;
                int i7 = p15Var.k;
                int i8 = p15Var.j;
                e15Var = p15Var.m;
                qgg.h0(obj);
                i3 = i6;
                i = i8;
                elapsedRealtimeNanos = j;
                i4 = i7;
                String str = ((xxq) obj).a;
                Integer num = new Integer(i);
                p15Var.m = null;
                p15Var.j = i;
                p15Var.k = i4;
                p15Var.n = elapsedRealtimeNanos;
                p15Var.l = i3;
                p15Var.q = 2;
                obj = e15.i(e15Var, str, num, p15Var, 6);
            }
        }
        p15Var = new p15(this, cg6Var);
        Object obj3 = p15Var.o;
        nm6 nm6Var2 = nm6.a;
        i2 = p15Var.q;
        if (i2 != 0) {
        }
        String str2 = ((xxq) obj3).a;
        Integer num2 = new Integer(i);
        p15Var.m = null;
        p15Var.j = i;
        p15Var.k = i4;
        p15Var.n = elapsedRealtimeNanos;
        p15Var.l = i3;
        p15Var.q = 2;
        obj3 = e15.i(e15Var, str2, num2, p15Var, 6);
    }
}
