package com.gamericefishpro.space.ti;

import com.gamericefishpro.space.si.d0;
import com.gamericefishpro.space.si.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends d0 implements l0 {
    @Override // com.gamericefishpro.space.si.l0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.A;
            Intrinsics.b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.B + ((long) ((int) ((o() + ((long) this.D)) - this.B)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.A;
            Intrinsics.b(objArr);
            q(Integer.valueOf(((Number) objArr[((int) ((this.B + ((long) ((int) ((o() + ((long) this.D)) - this.B)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
