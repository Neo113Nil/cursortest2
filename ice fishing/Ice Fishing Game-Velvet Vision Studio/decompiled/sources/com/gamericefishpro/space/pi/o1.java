package com.gamericefishpro.space.pi;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends kotlin.coroutines.a implements d1 {
    public static final o1 e = new o1(u.e);

    @Override // com.gamericefishpro.space.pi.d1
    public final m0 J(boolean z, boolean z2, g1 g1Var) {
        return p1.d;
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final boolean b() {
        return true;
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final m0 n(Function1 function1) {
        return p1.d;
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final boolean start() {
        return false;
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final CancellationException t() {
        throw new IllegalStateException("This job is always active");
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final Object y(com.gamericefishpro.space.th.a aVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final k z(l1 l1Var) {
        return p1.d;
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final void c(CancellationException cancellationException) {
    }
}
