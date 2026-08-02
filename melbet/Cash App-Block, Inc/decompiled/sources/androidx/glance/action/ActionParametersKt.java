package androidx.glance.action;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.moneybot.views.chat.MoneybotChatViewKt$$ExternalSyntheticLambda24;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheetKt;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class ActionParametersKt {
    public static final void NonEmptyCartWarningContent(int i, Composer composer, Modifier modifier, Function1 function1) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-251108542);
        int i2 = (gapComposer.changedInstance(function1) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            String stringResource = Room.stringResource(gapComposer, R.string.no_cart_items_have_been_detected);
            String stringResource2 = Room.stringResource(gapComposer, R.string.go_back_to_your_cart_and_we_ll_try_again);
            String stringResource3 = Room.stringResource(gapComposer, R.string.ok);
            ButtonProminence buttonProminence = ButtonProminence.STANDARD;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(12, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SingleUsePaymentAddCardSheetKt.SingleUsePaymentHalfSheetContent(stringResource, stringResource2, stringResource3, buttonProminence, true, null, (Function0) rememberedValue, gapComposer, 27648, 32);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotChatViewKt$$ExternalSyntheticLambda24(modifier, function1, i, 7);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.RequestContactsPermission.deepLinkSpecs;
    }

    public static final MutableActionParameters mutableActionParametersOf(ActionParameters$Pair... actionParameters$PairArr) {
        ArrayList arrayList = new ArrayList(actionParameters$PairArr.length);
        if (actionParameters$PairArr.length <= 0) {
            Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            return new MutableActionParameters(MapsKt__MapsKt.mutableMapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        }
        ActionParameters$Pair actionParameters$Pair = actionParameters$PairArr[0];
        throw null;
    }
}
