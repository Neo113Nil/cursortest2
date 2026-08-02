package com.squareup.cash.afterpayapplet.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.Room;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda3;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Error;
import com.squareup.cash.afterpayapplet.viewmodels.Loading;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpayAppletHomeView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterpayAppletHomeView f$0;
    public final /* synthetic */ AfterpayAppletHomeViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ AfterpayAppletHomeView$$ExternalSyntheticLambda0(AfterpayAppletHomeViewModel afterpayAppletHomeViewModel, Function1 function1, AfterpayAppletHomeView afterpayAppletHomeView, int i) {
        this.$r8$classId = i;
        this.f$1 = afterpayAppletHomeViewModel;
        this.f$2 = function1;
        this.f$0 = afterpayAppletHomeView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        AfterpayAppletHomeView afterpayAppletHomeView = this.f$0;
        AfterpayAppletHomeViewModel afterpayAppletHomeViewModel = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                afterpayAppletHomeView.Content(afterpayAppletHomeViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (afterpayAppletHomeViewModel instanceof Loading) {
                    gapComposer.startReplaceGroup(515614227);
                    AfterpaySearchViewKt.AfterpayAppletHomeLoading((Loading) afterpayAppletHomeViewModel, function1, gapComposer, 0);
                    gapComposer.end(false);
                } else if (afterpayAppletHomeViewModel instanceof AfterpayAppletHomeContentViewModel) {
                    gapComposer.startReplaceGroup(515753231);
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(afterpayAppletHomeView.imageLoader), Expect_jvmKt.rememberComposableLambda(1464642781, new AfterpayAppletHomeView$$ExternalSyntheticLambda0(afterpayAppletHomeViewModel, function1, afterpayAppletHomeView, 3), gapComposer), gapComposer, 56);
                    gapComposer.end(false);
                } else {
                    if (!(afterpayAppletHomeViewModel instanceof Error)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2061577496, false);
                    }
                    gapComposer.startReplaceGroup(516118070);
                    Error error = (Error) afterpayAppletHomeViewModel;
                    String str = error.screenTitle;
                    String str2 = error.titleText;
                    String str3 = error.subtitleText;
                    String str4 = error.buttonText;
                    String stringResource = Room.stringResource(gapComposer, R.string.afterpay_applet_help_button);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda3(9, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ReceiptUiKt$$ExternalSyntheticLambda3(10, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function02 = (Function0) rememberedValue2;
                    boolean changed3 = gapComposer.changed(function1);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ReceiptUiKt$$ExternalSyntheticLambda3(11, function1);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    AfterpaySearchViewKt.AfterpayAppletError(str, str2, str3, str4, stringResource, function0, function02, (Function0) rememberedValue3, gapComposer, 0, 0);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                afterpayAppletHomeView.Content(afterpayAppletHomeViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AfterpaySearchViewKt.AfterpayAppletHomeLoaded((AfterpayAppletHomeContentViewModel) afterpayAppletHomeViewModel, this.f$2, afterpayAppletHomeView.useOptimizeExperimentHeader, afterpayAppletHomeView.shouldHideCalendar, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AfterpayAppletHomeView$$ExternalSyntheticLambda0(AfterpayAppletHomeView afterpayAppletHomeView, AfterpayAppletHomeViewModel afterpayAppletHomeViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = afterpayAppletHomeView;
        this.f$1 = afterpayAppletHomeViewModel;
        this.f$2 = function1;
    }
}
