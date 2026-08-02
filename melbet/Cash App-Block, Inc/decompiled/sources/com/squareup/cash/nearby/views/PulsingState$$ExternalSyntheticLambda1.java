package com.squareup.cash.nearby.views;

import bo.app.c7$$ExternalSyntheticLambda6;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PulsingState$$ExternalSyntheticLambda1 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ PulsingState$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                return ((Boolean) ((PulsingState$$ExternalSyntheticLambda0) function1).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((MarkerKt$$ExternalSyntheticLambda2) function1).invoke(obj)).booleanValue();
            case 2:
                return ((Boolean) ((c7$$ExternalSyntheticLambda6) function1).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((HeroCardViewKt$$ExternalSyntheticLambda0) function1).invoke(obj)).booleanValue();
        }
    }
}
