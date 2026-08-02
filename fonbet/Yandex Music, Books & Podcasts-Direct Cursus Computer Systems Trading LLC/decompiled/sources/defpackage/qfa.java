package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class qfa {
    public final jyr a = l18.b.b(hag.I(yx4.class), true);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[LOOP:0: B:12:0x0062->B:14:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(Continuation continuation) {
        mfa mfaVar;
        int i;
        Iterator it;
        if (continuation instanceof mfa) {
            mfaVar = (mfa) continuation;
            int i2 = mfaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mfaVar.l = i2 - Integer.MIN_VALUE;
                mfa mfaVar2 = mfaVar;
                Object obj = mfaVar2.j;
                nm6 nm6Var = nm6.a;
                i = mfaVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    yx4 yx4Var = (yx4) this.a.getValue();
                    mfaVar2.l = 1;
                    yx4Var.getClass();
                    Boolean bool = Boolean.TRUE;
                    obj = yx4.m(yx4Var, null, bool, null, bool, mfaVar2, 17);
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
        mfaVar = new mfa(this, continuation);
        mfa mfaVar22 = mfaVar;
        Object obj2 = mfaVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = mfaVar22.l;
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
