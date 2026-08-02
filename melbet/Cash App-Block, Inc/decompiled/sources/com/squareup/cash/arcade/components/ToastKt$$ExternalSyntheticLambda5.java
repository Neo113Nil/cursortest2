package com.squareup.cash.arcade.components;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class ToastKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Density f$0;

    public /* synthetic */ ToastKt$$ExternalSyntheticLambda5(Density density, int i) {
        this.$r8$classId = i;
        this.f$0 = density;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Density density = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj).getClass();
                return Integer.valueOf(density.mo230roundToPx0680j_4(10.0f));
            case 1:
                ((Float) obj).getClass();
                return Float.valueOf(density.mo236toPx0680j_4(56.0f));
            default:
                ((Integer) obj).getClass();
                return Integer.valueOf(density.mo230roundToPx0680j_4(2.0f));
        }
    }
}
