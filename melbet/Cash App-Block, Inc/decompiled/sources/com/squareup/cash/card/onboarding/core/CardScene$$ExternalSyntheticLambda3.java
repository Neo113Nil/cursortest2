package com.squareup.cash.card.onboarding.core;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferredImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardScene$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CompletableDeferredImpl f$0;

    public /* synthetic */ CardScene$$ExternalSyntheticLambda3(int i, CompletableDeferredImpl completableDeferredImpl) {
        this.$r8$classId = i;
        this.f$0 = completableDeferredImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        CompletableDeferredImpl completableDeferredImpl = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (th != null && !completableDeferredImpl.isCompleted()) {
                    CancellationException cancellationException = new CancellationException("Engine job cancelled");
                    cancellationException.initCause(th);
                    completableDeferredImpl.cancelInternal(cancellationException);
                }
                return Unit.INSTANCE;
            case 1:
                Unit unit = Unit.INSTANCE;
                completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(unit);
                return unit;
            default:
                if (th != null && !completableDeferredImpl.isCompleted()) {
                    CancellationException cancellationException2 = new CancellationException("Engine job cancelled");
                    cancellationException2.initCause(th);
                    completableDeferredImpl.cancelInternal(cancellationException2);
                }
                return Unit.INSTANCE;
        }
    }
}
