package com.squareup.cash.data.contacts;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes6.dex */
public final class RealContactSync$reset$2$1 implements Function0 {
    public final /* synthetic */ CancellableContinuationImpl $continuation;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RealContactSync$reset$2$1(CancellableContinuationImpl cancellableContinuationImpl, int i) {
        this.$r8$classId = i;
        this.$continuation = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CancellableContinuationImpl cancellableContinuationImpl = this.$continuation;
        switch (i) {
            case 0:
                Result.Companion companion = Result.Companion;
                Unit unit = Unit.INSTANCE;
                cancellableContinuationImpl.resumeWith(unit);
                return unit;
            default:
                Result.Companion companion2 = Result.Companion;
                Unit unit2 = Unit.INSTANCE;
                cancellableContinuationImpl.resumeWith(unit2);
                return unit2;
        }
    }
}
