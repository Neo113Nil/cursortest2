package kotlinx.coroutines.flow.internal;

import defpackage.bvf0;
import defpackage.fse;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public final class g extends e {
    public final zls x;

    public g(zls zlsVar, tpr tprVar, fse fseVar, int i, BufferOverflow bufferOverflow) {
        super(i, fseVar, tprVar, bufferOverflow);
        this.x = zlsVar;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final a h(fse fseVar, int i, BufferOverflow bufferOverflow) {
        return new g(this.x, this.w, fseVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public final Object k(vpr vprVar, Continuation continuation) {
        Object n = bvf0.n(new ChannelFlowTransformLatest$flowCollect$3(this, vprVar, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
