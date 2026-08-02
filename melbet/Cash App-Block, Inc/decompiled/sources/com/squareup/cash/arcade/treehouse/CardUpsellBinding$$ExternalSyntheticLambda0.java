package com.squareup.cash.arcade.treehouse;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.arcade.Illustrations;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.marketing.components.CardUpsellKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class CardUpsellBinding$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardUpsellBinding f$0;

    public /* synthetic */ CardUpsellBinding$$ExternalSyntheticLambda0(CardUpsellBinding cardUpsellBinding, int i) {
        this.$r8$classId = 1;
        this.f$0 = cardUpsellBinding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ComposableLambdaImpl composableLambdaImpl;
        int i = this.$r8$classId;
        Object[] objArr = 0;
        int i2 = 2;
        CardUpsellBinding cardUpsellBinding = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    String str = (String) cardUpsellBinding.body$delegate.getValue();
                    if (str == null) {
                        gapComposer.startReplaceGroup(1742602218);
                        gapComposer.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer.startReplaceGroup(1742602219);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-993089343, new TransfersViewKt$$ExternalSyntheticLambda5(str, 19), gapComposer);
                        gapComposer.end(false);
                        composableLambdaImpl = rememberComposableLambda;
                    }
                    Function0 function0 = (Function0) cardUpsellBinding.onClick$delegate.getValue();
                    if (function0 == null) {
                        gapComposer.startReplaceGroup(1742697885);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new MotionKt$$ExternalSyntheticLambda0(27);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        function0 = (Function0) rememberedValue;
                    } else {
                        gapComposer.startReplaceGroup(333310384);
                    }
                    gapComposer.end(false);
                    Function0 function02 = function0;
                    Illustrations illustrations = (Illustrations) cardUpsellBinding.illustration$delegate.getValue();
                    CardUpsellKt.CardUpsellSmall(Expect_jvmKt.rememberComposableLambda(191860964, new CardUpsellBinding$$ExternalSyntheticLambda0(cardUpsellBinding, i2, objArr == true ? 1 : 0), gapComposer), Expect_jvmKt.rememberComposableLambda(380938061, new BankingDialogKt$$ExternalSyntheticLambda8(cardUpsellBinding, 8), gapComposer), function02, null, composableLambdaImpl, illustrations != null ? CardUpsellKt.toCardUpsellIllustration(illustrations) : null, gapComposer, 54, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                cardUpsellBinding.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, (String) cardUpsellBinding.title$delegate.getValue(), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardUpsellBinding$$ExternalSyntheticLambda0(CardUpsellBinding cardUpsellBinding, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = cardUpsellBinding;
    }
}
