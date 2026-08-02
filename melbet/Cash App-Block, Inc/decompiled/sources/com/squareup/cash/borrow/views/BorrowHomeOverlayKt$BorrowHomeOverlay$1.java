package com.squareup.cash.borrow.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$2$1$1;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final class BorrowHomeOverlayKt$BorrowHomeOverlay$1 implements Function3 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BorrowHomeOverlayKt$BorrowHomeOverlay$1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.$onEvent = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                BorrowHomeOverlayViewModel borrowHomeOverlayViewModel = (BorrowHomeOverlayViewModel) obj;
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                borrowHomeOverlayViewModel.getClass();
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-770549610, new ButtonKt$Button$2.AnonymousClass1(11, borrowHomeOverlayViewModel, function1), composer), composer, 3072, 7);
                break;
            default:
                ((Number) obj3).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new QuickPayViewKt$QuickPay$1$1$1$2$2$1$1(6, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                AlphaKt.Alpha(ImageKt.m182clickableO2vRcR0$default(fillMaxSize, mutableInteractionSourceImpl, null, false, null, null, (Function0) rememberedValue2, 28), gapComposer, 0);
                break;
        }
        return Unit.INSTANCE;
    }
}
