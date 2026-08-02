package com.squareup.cash.blockers.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.viewmodels.InputError;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.views.brand.checkout.CheckoutExpandableReviewRowKt;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda4;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* loaded from: classes5.dex */
public final /* synthetic */ class SetNameViewKt$$ExternalSyntheticLambda5 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ SetNameViewKt$$ExternalSyntheticLambda5(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = z;
        this.f$4 = obj4;
        this.f$5 = obj5;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        NavigationType navigationType;
        int i = this.$r8$classId;
        Object obj5 = this.f$5;
        Object obj6 = this.f$4;
        Object obj7 = this.f$2;
        Object obj8 = this.f$1;
        Object obj9 = this.f$0;
        switch (i) {
            case 0:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj9;
                Function1 function1 = (Function1) obj8;
                Shaker shaker = (Shaker) obj7;
                MutableState mutableState = (MutableState) obj6;
                InputState inputState = (InputState) obj5;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj;
                SetNameViewModel setNameViewModel = (SetNameViewModel) obj2;
                Composer composer = (Composer) obj3;
                ((Integer) obj4).getClass();
                animatedContentScopeImpl.getClass();
                setNameViewModel.getClass();
                Modifier imePadding = SpacerKt.imePadding(Modifier.Companion.$$INSTANCE);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
                GapComposer gapComposer = (GapComposer) composer;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer, imePadding);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                boolean z = setNameViewModel.canExit;
                if (z) {
                    navigationType = NavigationType.CLOSE;
                } else {
                    if (z) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    navigationType = NavigationType.NONE;
                }
                NavigationType navigationType2 = navigationType;
                boolean changed = gapComposer2.changed(delegatingSoftwareKeyboardController) | gapComposer2.changed(function1);
                Object rememberedValue = gapComposer2.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, 0);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, composer, 6, 108);
                DBUtil.SpacerWithinSectionMedium(0, 1, composer, null);
                Countries.PageHeader(setNameViewModel.title, (Modifier) null, (Function2) null, setNameViewModel.instructionLabel, composer, 0, 6);
                DBUtil.SpacerBetweenSectionLarge(0, 1, composer, null);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new TouchRecorder();
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                TouchRecorder touchRecorder = (TouchRecorder) rememberedValue2;
                boolean z2 = this.f$3;
                Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(1480840572, new SheetKt$$ExternalSyntheticLambda0(shaker, setNameViewModel, animatedContentScopeImpl, z2, function1, mutableState, touchRecorder, inputState), composer), composer, 392, 2);
                SpacerKt.Spacer(composer, new LayoutWeightElement(1.0f, true));
                DimensionKt.ButtonCtaGroup(null, false, null, Expect_jvmKt.rememberComposableLambda(-1327128890, new BorrowHomeKt$$ExternalSyntheticLambda0(23, setNameViewModel, function1), composer), Expect_jvmKt.rememberComposableLambda(-778226331, new SheetKt$$ExternalSyntheticLambda4(animatedContentScopeImpl, mutableState, setNameViewModel, touchRecorder, function1, z2), composer), composer, 27648, 7);
                gapComposer2.end(true);
                return Unit.INSTANCE;
            default:
                PaddingValues paddingValues = (PaddingValues) obj9;
                String str = (String) obj8;
                Function0 function0 = (Function0) obj7;
                TextFieldState textFieldState = (TextFieldState) obj6;
                TextFieldState textFieldState2 = (TextFieldState) obj5;
                OrderBuilderModel.BuyerInfo.UiReady uiReady = (OrderBuilderModel.BuyerInfo.UiReady) obj2;
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                uiReady.getClass();
                boolean z3 = uiReady instanceof OrderBuilderModel.BuyerInfo.UiReady.Validated;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (z3) {
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    gapComposer3.startReplaceGroup(-2106173039);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    OrderBuilderModel.BuyerInfo.UiReady.Validated validated = (OrderBuilderModel.BuyerInfo.UiReady.Validated) uiReady;
                    String joinToString$default = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{validated.name, validated.phone}), Room.stringResource(gapComposer3, R.string.local_views_separator_dot), null, null, 0, null, null, 62);
                    if (paddingValues == null) {
                        paddingValues = CheckoutExpandableReviewRowKt.CheckoutReviewRowTouchTargetPadding;
                    }
                    CheckoutExpandableReviewRowKt.m1299CheckoutReviewRow_6dBP3U(fillMaxWidth, str, joinToString$default, null, false, function0, paddingValues, false, false, gapComposer3, 24582, 392);
                    gapComposer3.end(false);
                } else {
                    if (!(uiReady instanceof OrderBuilderModel.BuyerInfo.UiReady.Editing)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer2, -1314866944, false);
                    }
                    GapComposer gapComposer4 = (GapComposer) composer2;
                    gapComposer4.startReplaceGroup(-2105676853);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, this.f$3 && ((OrderBuilderModel.BuyerInfo.UiReady.Editing) uiReady).legalConsent != null ? RecyclerView.DECELERATION_RATE : 12.0f, 7);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    String stringResource = Room.stringResource(gapComposer4, R.string.local_views_name_hint);
                    OrderBuilderModel.BuyerInfo.UiReady.Editing editing = (OrderBuilderModel.BuyerInfo.UiReady.Editing) uiReady;
                    InputError inputError = editing.phoneError;
                    InputError inputError2 = editing.nameError;
                    InputFieldKt.InputField(textFieldState, null, false, false, CheckoutTipSectionKt.isError(inputError2, textFieldState.getValue$foundation().text.length()), CheckoutTipSectionKt.lambda$1907123998, null, null, CheckoutTipSectionKt.helperText(inputError2, textFieldState.getValue$foundation().text.length()), stringResource, null, null, null, null, null, null, gapComposer4, 196608, 0, 64718);
                    InputFieldKt.InputField(textFieldState2, null, false, false, CheckoutTipSectionKt.isError(inputError, textFieldState2.getValue$foundation().text.length()), CheckoutTipSectionKt.lambda$1064757717, null, null, CheckoutTipSectionKt.helperText(inputError, textFieldState2.getValue$foundation().text.length()), Room.stringResource(gapComposer4, R.string.local_views_phone_hint), new KeyboardOptions(0, (Boolean) null, 4, 0, (Boolean) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), null, null, null, null, null, gapComposer4, 196608, 6, 63694);
                    gapComposer4.end(true);
                    gapComposer4.end(false);
                }
                return Unit.INSTANCE;
        }
    }
}
