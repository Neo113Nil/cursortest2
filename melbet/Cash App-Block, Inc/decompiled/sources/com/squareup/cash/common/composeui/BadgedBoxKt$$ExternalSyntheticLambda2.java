package com.squareup.cash.common.composeui;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import coil3.RealImageLoader;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class BadgedBoxKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ float f$4;
    public final /* synthetic */ float f$5;
    public final /* synthetic */ Function f$6;
    public final /* synthetic */ int f$7;

    public /* synthetic */ BadgedBoxKt$$ExternalSyntheticLambda2(float f, float f2, int i, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, RealImageLoader realImageLoader, CircularBadgeShape circularBadgeShape, AvatarBadgeViewModel avatarBadgeViewModel) {
        this.f$0 = realImageLoader;
        this.f$1 = modifier;
        this.f$2 = avatarBadgeViewModel;
        this.f$3 = circularBadgeShape;
        this.f$4 = f;
        this.f$5 = f2;
        this.f$6 = composableLambdaImpl;
        this.f$7 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Function function = this.f$6;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                AvatarBadgeViewModel avatarBadgeViewModel = (AvatarBadgeViewModel) obj4;
                CircularBadgeShape circularBadgeShape = (CircularBadgeShape) obj3;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) function;
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                float f = this.f$4;
                float f2 = this.f$5;
                VisibleKt.m3485BadgedBox3GLzNTs(f, f2, updateChangedFlags, composer, composableLambdaImpl, (Modifier) obj5, (RealImageLoader) obj6, circularBadgeShape, avatarBadgeViewModel);
                break;
            default:
                ((Integer) obj2).intValue();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                PaymentDeviceCustomizationViewKt.m3437FallbackGridjIwJxvA((List) obj6, (String) obj5, this.f$4, this.f$5, (SharedTransitionScope) obj4, (AnimatedVisibilityScope) obj3, (Function1) function, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BadgedBoxKt$$ExternalSyntheticLambda2(List list, String str, float f, float f2, SharedTransitionScope sharedTransitionScope, AnimatedVisibilityScope animatedVisibilityScope, Function1 function1, int i) {
        this.f$0 = list;
        this.f$1 = str;
        this.f$4 = f;
        this.f$5 = f2;
        this.f$2 = sharedTransitionScope;
        this.f$3 = animatedVisibilityScope;
        this.f$6 = function1;
        this.f$7 = i;
    }
}
