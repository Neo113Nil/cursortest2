package kotlin.collections;

import defpackage.qrq0;
import defpackage.vrq0;
import defpackage.vvn;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final class c implements qrq0 {
    public final /* synthetic */ qrq0 a;

    public c(qrq0 qrq0Var) {
        this.a = qrq0Var;
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        return !it.hasNext() ? vvn.a : vrq0.a(new SlidingWindowKt$windowedIterator$1(2, 2, it, true, true, null));
    }
}
