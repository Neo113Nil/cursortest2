package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class sb0 {
    public final jyr a;
    public final jyr b;

    public sb0() {
        bdt I = hag.I(yx4.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(e15.class), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[LOOP:0: B:11:0x0053->B:13:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(Integer num, cg6 cg6Var) {
        rb0 rb0Var;
        int i;
        Iterator it;
        if (cg6Var instanceof rb0) {
            rb0Var = (rb0) cg6Var;
            int i2 = rb0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rb0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = rb0Var.j;
                nm6 nm6Var = nm6.a;
                i = rb0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    yx4 yx4Var = (yx4) this.a.getValue();
                    rb0Var.l = 1;
                    obj = yx4Var.b(num, rb0Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pda) it.next()).a);
                }
                return arrayList;
            }
        }
        rb0Var = new rb0(this, cg6Var);
        Object obj2 = rb0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = rb0Var.l;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }
}
