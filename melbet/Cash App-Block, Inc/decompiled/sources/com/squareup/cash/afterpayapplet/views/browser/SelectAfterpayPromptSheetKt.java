package com.squareup.cash.afterpayapplet.views.browser;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda3;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda4;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.views.TaxAuthorizationView$Content$1$1;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public abstract class SelectAfterpayPromptSheetKt {
    public static final ComposableLambdaImpl lambda$2010844811 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(15), false, 2010844811);

    static {
        new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(15), false, -1136991436);
    }

    public static final void SelectAfterpayPrompt(Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-398158586);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(function1) ? 4 : 2);
        } else {
            i2 = i;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new TaxAuthorizationView$Content$1$1(function1, (Continuation) null, 5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            long j = Strings.getColors(gapComposer).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m177backgroundbw27NRU, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextViewKt.Avatar(AvatarSize.Size64, new AvatarEntry("", Strings.getColors(gapComposer).semantic.background.brand, null, new AvatarImage.LocalIcon(Icons.LogoAfterpay24, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer, 6, 28);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).header, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.select_afterpay_prompt_title), (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.select_afterpay_prompt_message), (Map) null, (Function1) null, false);
            z = false;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 16.0f, 1);
            boolean z3 = i3 == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new ReceiptUiKt$$ExternalSyntheticLambda3(29, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, m300paddingVpY3zN4$default2, buttonProminence, false, false, null, lambda$2010844811, gapComposer, 1573248, 56);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function12, i, 3, z);
        }
    }
}
