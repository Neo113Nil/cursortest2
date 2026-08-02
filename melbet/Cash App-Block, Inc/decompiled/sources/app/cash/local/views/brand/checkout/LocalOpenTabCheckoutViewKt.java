package app.cash.local.views.brand.checkout;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentTimingViewModel;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.molecule.PlatformKt;
import bo.app.n3$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LocalOpenTabCheckoutViewKt {
    public static final PaddingValuesImpl OpenTabCheckoutInfoTouchTargetPadding = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
    public static final PaddingValuesImpl OpenTabCheckoutPaymentTimingTouchTargetPadding = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, 12.0f, 1);
    public static final PaddingValuesImpl OpenTabCheckoutSpecialInstructionsTouchTargetPadding = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, 12.0f, 1);
    public static final float OpenTabCheckoutSpecialInstructionsInputTopPadding = 4.0f;
    public static final float OpenTabCheckoutCompensatedVerticalPadding = 12.0f;

    public static final void LocalOpenTabCheckoutView(Modifier modifier, LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        boolean z2;
        NeverEqualPolicy neverEqualPolicy;
        TextFieldState textFieldState;
        int i3;
        modifier.getClass();
        localOpenTabCheckoutViewModel.getClass();
        OrderBuilderModel.BuyerInfo.UiReady uiReady = localOpenTabCheckoutViewModel.buyerInfo;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(439650260);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(localOpenTabCheckoutViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String name = uiReady.getName();
            if (name == null) {
                name = "";
            }
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(name, 0L, gapComposer, 0, 2);
            String phone = uiReady.getPhone();
            TextFieldState m382rememberTextFieldStateLepunE2 = TextFieldStateKt.m382rememberTextFieldStateLepunE(phone != null ? phone : "", 0L, gapComposer, 0, 2);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier then = fillMaxWidth.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, then);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ToolbarModel toolbarModel = new ToolbarModel(Room.stringResource(gapComposer, R.string.local_views_open_tab_checkout_title));
            int i4 = i2 & 896;
            boolean z3 = i4 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy2) {
                z = false;
                rememberedValue = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 13);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                z = false;
            }
            boolean z4 = z;
            LocalToolbarKt.m1333LocalToolbarflo8M7A(companion, toolbarModel, null, (Function0) rememberedValue, RecyclerView.DECELERATION_RATE, null, gapComposer, 6, 108);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier then2 = fillMaxWidth2.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
            boolean changedInstance = gapComposer.changedInstance(localOpenTabCheckoutViewModel) | gapComposer.changed(m382rememberTextFieldStateLepunE) | gapComposer.changed(m382rememberTextFieldStateLepunE2) | (i4 == 256 ? true : z4);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                z2 = true;
                neverEqualPolicy = neverEqualPolicy2;
                textFieldState = m382rememberTextFieldStateLepunE;
                rememberedValue2 = new n3$$ExternalSyntheticLambda0(localOpenTabCheckoutViewModel, textFieldState, m382rememberTextFieldStateLepunE2, function1, 11);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                z2 = true;
                neverEqualPolicy = neverEqualPolicy2;
                textFieldState = m382rememberTextFieldStateLepunE;
            }
            TextFieldState textFieldState2 = textFieldState;
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            boolean z5 = z2;
            LazyDslKt.LazyColumn(then2, null, m297PaddingValuesa9UjIt4$default, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, MLKEMEngine.KyberPolyBytes, 506);
            gapComposer = gapComposer;
            gapComposer.end(z5);
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_items_count)).format(NavAction$$ExternalSyntheticOutline0.m(z5 ? 1 : 0, Integer.valueOf(localOpenTabCheckoutViewModel.orderSummary.itemCount), "count"));
            format2.getClass();
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean z6 = localOpenTabCheckoutViewModel.isPlaceOrderEnabled;
            String str = localOpenTabCheckoutViewModel.totalAmount;
            String format3 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_open_tab_checkout_footer_subtitle)).format(new Object[]{format2});
            format3.getClass();
            LocalBottomModalViewModel.Payload.OpenTabInfo openTabInfo = new LocalBottomModalViewModel.Payload.OpenTabInfo(str, format3);
            int ordinal = localOpenTabCheckoutViewModel.paymentTiming.selectedOption.ordinal();
            if (ordinal == 0) {
                i3 = R.string.local_views_open_a_tab;
            } else {
                if (ordinal != z5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i3 = R.string.local_views_place_order;
            }
            LocalBottomModalViewModel localBottomModalViewModel = new LocalBottomModalViewModel(z6, null, openTabInfo, Room.stringResource(gapComposer, i3), localOpenTabCheckoutViewModel.isPlaceOrderLoading, 18);
            boolean changedInstance2 = gapComposer.changedInstance(localOpenTabCheckoutViewModel) | gapComposer.changed(textFieldState2) | gapComposer.changed(m382rememberTextFieldStateLepunE2) | gapComposer.changed(delegatingSoftwareKeyboardController) | (i4 == 256 ? z5 ? 1 : 0 : z4);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy3) {
                OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(localOpenTabCheckoutViewModel, textFieldState2, m382rememberTextFieldStateLepunE2, delegatingSoftwareKeyboardController, function1, 8);
                gapComposer.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
                rememberedValue3 = overlayKt$$ExternalSyntheticLambda3;
            }
            LocalMapKt.LocalBottomModal(m300paddingVpY3zN4$default, localBottomModalViewModel, (Function1) rememberedValue3, 0, gapComposer, 6, 8);
            gapComposer.end(z5);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) modifier, (Object) localOpenTabCheckoutViewModel, function1, i, 16);
        }
    }

    public static final void PaymentTimingOptionRow(LocalCheckoutPaymentTimingViewModel.OptionViewModel optionViewModel, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1967314402);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(optionViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Role role = new Role(3);
            boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(optionViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new StatusRunnable$$ExternalSyntheticLambda1(21, function1, optionViewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier padding = SpacerKt.padding(SelectableKt.m335selectableoSLSa3U$default(fillMaxWidth, z2, true, role, (Function0) rememberedValue, 8), OpenTabCheckoutPaymentTimingTouchTargetPadding);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, padding);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, true);
            int ordinal = optionViewModel.option.ordinal();
            if (ordinal == 0) {
                i3 = R.string.local_views_open_tab_pay_at_end;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i3 = R.string.local_views_open_tab_pay_now;
            }
            String stringResource = Room.stringResource(gapComposer, i3);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) m, TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            ModalKt.Radio(z, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), null, true, null, gapComposer, ((i2 >> 3) & 14) | 48, 20);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(optionViewModel, z, function1, i, 3);
        }
    }

    public static final void PaymentTimingSection(LocalCheckoutPaymentTimingViewModel localCheckoutPaymentTimingViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(772133212);
        int i2 = (gapComposer.changedInstance(localCheckoutPaymentTimingViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            gapComposer.startReplaceGroup(1385002967);
            List list = localCheckoutPaymentTimingViewModel.options;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                LocalCheckoutPaymentTimingViewModel.OptionViewModel optionViewModel = (LocalCheckoutPaymentTimingViewModel.OptionViewModel) list.get(i3);
                PaymentTimingOptionRow(optionViewModel, optionViewModel.option == localCheckoutPaymentTimingViewModel.selectedOption, function1, gapComposer, (i2 << 3) & 896);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(localCheckoutPaymentTimingViewModel, function1, i, 7);
        }
    }
}
