package com.gamericefishpro.space.w;

import com.gamericefishpro.space.t0.s2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements s2 {
    public final com.gamericefishpro.space.u6.l d;
    public final com.gamericefishpro.space.t0.f1 e;
    public o i;
    public long v;
    public long w;
    public boolean y;

    public /* synthetic */ j(com.gamericefishpro.space.u6.l lVar, Object obj, o oVar, int i) {
        this(lVar, obj, (i & 4) != 0 ? null : oVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // com.gamericefishpro.space.t0.s2
    public final Object getValue() {
        return this.e.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.e.getValue() + ", velocity=" + ((Function1) this.d.e).invoke(this.i) + ", isRunning=" + this.y + ", lastFrameTimeNanos=" + this.v + ", finishedTimeNanos=" + this.w + ')';
    }

    public j(com.gamericefishpro.space.u6.l lVar, Object obj, o oVar, long j, long j2, boolean z) {
        o oVarH;
        this.d = lVar;
        this.e = com.gamericefishpro.space.t0.i.v(obj);
        if (oVar != null) {
            oVarH = c.h(oVar);
        } else {
            oVarH = (o) ((Function1) lVar.d).invoke(obj);
            oVarH.d();
        }
        this.i = oVarH;
        this.v = j;
        this.w = j2;
        this.y = z;
    }
}
