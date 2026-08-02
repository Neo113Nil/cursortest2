package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.room.Room;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheetKt;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes3.dex */
public abstract class CoroutineBroadcastReceiverKt {
    public static final void SpendingLimitReachedContent(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-164187887);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String stringResource = Room.stringResource(gapComposer, R.string.sup_spending_limit_reached_header);
            String stringResource2 = Room.stringResource(gapComposer, R.string.sup_spending_limit_reached_message);
            String stringResource3 = Room.stringResource(gapComposer, R.string.ok);
            boolean z2 = true;
            ButtonProminence buttonProminence = ButtonProminence.STANDARD;
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(15, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SingleUsePaymentAddCardSheetKt.SingleUsePaymentHalfSheetContent(stringResource, stringResource2, stringResource3, buttonProminence, false, null, (Function0) rememberedValue, gapComposer, 3072, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 27, z);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.SelectP2pFiatPaymentInstrument.deepLinkSpecs;
    }

    public static final void goAsync(BroadcastReceiver broadcastReceiver, CoroutineContext coroutineContext, Function2 function2) {
        ContextScope CoroutineScope = JobKt.CoroutineScope(CoroutineContext.Element.DefaultImpls.plus(JobKt.SupervisorJob$default(), coroutineContext));
        JobKt.launch$default(CoroutineScope, null, null, new FlowExtKt$simpleScan$1(function2, CoroutineScope, broadcastReceiver.goAsync(), null, 18), 3);
    }
}
