package com.gamericefishpro.space.pi;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface d1 extends CoroutineContext.Element {
    m0 J(boolean z, boolean z2, g1 g1Var);

    boolean b();

    void c(CancellationException cancellationException);

    m0 n(Function1 function1);

    boolean start();

    CancellationException t();

    Object y(com.gamericefishpro.space.th.a aVar);

    k z(l1 l1Var);
}
