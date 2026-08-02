package kotlinx.coroutines.flow.internal;

import defpackage.fse;
import defpackage.mqq0;
import defpackage.q5z;
import defpackage.sb2;
import defpackage.tfi0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public final class h extends a {
    public final Iterable w;

    public h(Iterable iterable, fse fseVar, int i, BufferOverflow bufferOverflow) {
        super(fseVar, i, bufferOverflow);
        this.w = iterable;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final Object e(y6f0 y6f0Var, Continuation continuation) {
        mqq0 mqq0Var = new mqq0(y6f0Var);
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            tje.N(y6f0Var, null, null, new ChannelLimitedFlowMerge$collectTo$2$1((tpr) it.next(), mqq0Var, null), 3);
        }
        return zy11.a;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final a h(fse fseVar, int i, BufferOverflow bufferOverflow) {
        return new h(this.w, fseVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final tfi0 j(tse tseVar) {
        wls channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        x6f0 x6f0Var = new x6f0(q5z.M(tseVar, this.a), sb2.a(this.b, bufferOverflow, null, 4));
        x6f0Var.m0(coroutineStart, x6f0Var, channelFlow$collectToFun$1);
        return x6f0Var;
    }
}
