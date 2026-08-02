package androidx.glance.appwidget;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.room.Room;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheetKt;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class AppWidgetUtilsKt {
    public static final void ReviewPlanContent(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-701855011);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String stringResource = Room.stringResource(gapComposer, R.string.sup_checkout_sheet_header);
            String stringResource2 = Room.stringResource(gapComposer, R.string.sup_checkout_sheet_body);
            String stringResource3 = Room.stringResource(gapComposer, R.string.sup_checkout_continue_button);
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SingleUsePaymentAddCardSheetKt.SingleUsePaymentHalfSheetContent(stringResource, stringResource2, stringResource3, null, false, null, (Function0) rememberedValue, gapComposer, 0, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 26, z);
        }
    }

    public static final String createUniqueRemoteUiName(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "appWidget-");
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.RequestReviewPrompt.deepLinkSpecs;
    }
}
