package com.squareup.cash.mooncake.compose_ui.components;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class LoadableContentKt$$ExternalSyntheticLambda11 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ LoadableContentKt$$ExternalSyntheticLambda11(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = this.f$0;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                if (!z) {
                    intValue = -intValue;
                }
                return Integer.valueOf(intValue);
            default:
                if (z) {
                    intValue = -intValue;
                }
                return Integer.valueOf(intValue);
        }
    }
}
