package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class wha {
    public final jyr a = l18.b.b(hag.I(yx4.class), true);

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[LOOP:0: B:11:0x0054->B:13:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(Continuation continuation) {
        tha thaVar;
        int i;
        Iterator it;
        if (continuation instanceof tha) {
            thaVar = (tha) continuation;
            int i2 = thaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                thaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = thaVar.j;
                nm6 nm6Var = nm6.a;
                i = thaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    yx4 yx4Var = (yx4) this.a.getValue();
                    thaVar.l = 1;
                    obj = yx4Var.C(null, thaVar);
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
                    arrayList.add(((jja) it.next()).a);
                }
                return arrayList;
            }
        }
        thaVar = new tha(this, continuation);
        Object obj2 = thaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = thaVar.l;
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
