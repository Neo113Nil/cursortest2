package com.squareup.cash.pools.views;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolDescriptionKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ PoolDescriptionKt$$ExternalSyntheticLambda3(Function0 function0, boolean z) {
        this.$r8$classId = 2;
        this.f$1 = function0;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function0 function0 = this.f$1;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                if (z) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                if (z) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 2:
                return Boolean.valueOf(((Boolean) function0.invoke()).booleanValue() == z);
            default:
                if (z) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PoolDescriptionKt$$ExternalSyntheticLambda3(boolean z, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = function0;
    }
}
