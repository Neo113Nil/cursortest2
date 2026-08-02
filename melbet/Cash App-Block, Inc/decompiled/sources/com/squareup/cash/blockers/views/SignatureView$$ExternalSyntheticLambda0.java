package com.squareup.cash.blockers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import com.squareup.cash.blockers.viewmodels.SignatureViewModel;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class SignatureView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ SignatureViewModel f$1;
    public final /* synthetic */ SignatureView f$2;

    public /* synthetic */ SignatureView$$ExternalSyntheticLambda0(SignatureView signatureView, SignatureViewModel signatureViewModel, Function1 function1, int i) {
        this.f$2 = signatureView;
        this.f$1 = signatureViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        SignatureView signatureView = this.f$2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = SignatureView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new SsnViewKt$$ExternalSyntheticLambda14(12, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
                    SignatureViewModel signatureViewModel = this.f$1;
                    TransactorKt.LoadableContent(signatureViewModel, signatureViewModel instanceof SignatureViewModel.Submitting, null, LoadingIndicatorPosition.CENTER, null, null, Expect_jvmKt.rememberComposableLambda(1502251109, new SetPinViewKt$$ExternalSyntheticLambda4(function1, signatureView), gapComposer), gapComposer, 1575936, 52);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int i3 = SignatureView.$r8$clinit;
                signatureView.Content(this.f$1, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SignatureView$$ExternalSyntheticLambda0(Function1 function1, SignatureViewModel signatureViewModel, SignatureView signatureView) {
        this.f$0 = function1;
        this.f$1 = signatureViewModel;
        this.f$2 = signatureView;
    }
}
