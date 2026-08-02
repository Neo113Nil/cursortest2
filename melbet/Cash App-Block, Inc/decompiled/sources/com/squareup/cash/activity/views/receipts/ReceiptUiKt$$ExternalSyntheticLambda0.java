package com.squareup.cash.activity.views.receipts;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.util.DBUtil;
import com.squareup.cash.activity.viewmodels.ReceiptViewModel;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class ReceiptUiKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ ReceiptViewModel f$1;

    public /* synthetic */ ReceiptUiKt$$ExternalSyntheticLambda0(Function1 function1, ReceiptViewModel receiptViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = receiptViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ReceiptViewModel receiptViewModel = this.f$1;
        Function1 function1 = this.f$0;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1317977302, new ReceiptUiKt$$ExternalSyntheticLambda0(function1, receiptViewModel, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda3(0, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer2, 0, 1);
                    if (Intrinsics.areEqual(receiptViewModel, ReceiptViewModel.Loading.INSTANCE)) {
                        gapComposer2.startReplaceGroup(-439161441);
                        ReceiptUiKt.Loading(gapComposer2, 0);
                        gapComposer2.end(false);
                    } else if (receiptViewModel instanceof ReceiptViewModel.LoadingError) {
                        gapComposer2.startReplaceGroup(-439159694);
                        ReceiptUiKt.LoadingError((ReceiptViewModel.LoadingError) receiptViewModel, function1, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        if (!(receiptViewModel instanceof ReceiptViewModel.Loaded)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -439162879, false);
                        }
                        gapComposer2.startReplaceGroup(-439157555);
                        ReceiptUiKt.Receipt((ReceiptViewModel.Loaded) receiptViewModel, function1, gapComposer2, 0);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
