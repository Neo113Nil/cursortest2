package com.squareup.cash.paymentpad.views;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class HomeViewKt$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SplashScreenAnimationObserver f$0;

    public /* synthetic */ HomeViewKt$$ExternalSyntheticLambda10(SplashScreenAnimationObserver splashScreenAnimationObserver, int i) {
        this.$r8$classId = i;
        this.f$0 = splashScreenAnimationObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SplashScreenAnimationObserver splashScreenAnimationObserver = this.f$0;
        switch (i) {
            case 0:
                ((Density) obj).getClass();
                return new IntOffset(MathKt__MathJVMKt.roundToInt(splashScreenAnimationObserver.translationY.getFloatValue()) & BodyPartID.bodyIdMax);
            case 1:
                ((Density) obj).getClass();
                return new IntOffset(Math.round(splashScreenAnimationObserver.translationY.getFloatValue()) & BodyPartID.bodyIdMax);
            case 2:
                ((Density) obj).getClass();
                return new IntOffset(Math.round(splashScreenAnimationObserver.translationY.getFloatValue()) & BodyPartID.bodyIdMax);
            default:
                ((DisposableEffectScope) obj).getClass();
                splashScreenAnimationObserver.observers.incrementAndGet();
                return new CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1(splashScreenAnimationObserver, 4);
        }
    }
}
