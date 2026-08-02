package com.squareup.cash.shopping.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.web.WebAppBridge;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.shopping.viewmodels.AutofillFooterViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.shopping.viewmodels.WebNavigationHeaderModel;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.webview.android.WebViewProvider;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt;
import com.stripe.android.financialconnections.presentation.Async;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShoppingWebContainerViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ String f$10;
    public final /* synthetic */ String f$11;
    public final /* synthetic */ boolean f$12;
    public final /* synthetic */ Object f$13;
    public final /* synthetic */ Object f$14;
    public final /* synthetic */ Function f$15;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ ShoppingWebContainerViewKt$$ExternalSyntheticLambda0(Modifier modifier, ShoppingViewModel shoppingViewModel, Function1 function1, WebViewProvider webViewProvider, KeyboardState keyboardState, Ref$ObjectRef ref$ObjectRef, MutableState mutableState, MutableState mutableState2, CoroutineScope coroutineScope, String str, String str2, boolean z, Ref$IntRef ref$IntRef, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, Function7 function7) {
        this.f$0 = modifier;
        this.f$1 = shoppingViewModel;
        this.f$2 = function1;
        this.f$3 = webViewProvider;
        this.f$4 = keyboardState;
        this.f$5 = ref$ObjectRef;
        this.f$6 = mutableState;
        this.f$7 = mutableState2;
        this.f$9 = coroutineScope;
        this.f$10 = str;
        this.f$11 = str2;
        this.f$12 = z;
        this.f$13 = ref$IntRef;
        this.f$14 = parcelableSnapshotMutableIntState;
        this.f$15 = function7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14, types: [int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Modifier.Companion companion;
        boolean z;
        MutableState mutableState;
        BiasAlignment.Horizontal horizontal;
        Modifier modifier;
        Function1 function1;
        ?? r15;
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r152;
        int i;
        int i2 = this.$r8$classId;
        Function function = this.f$15;
        Object obj3 = this.f$14;
        Object obj4 = this.f$13;
        Object obj5 = this.f$9;
        Object obj6 = this.f$7;
        Object obj7 = this.f$6;
        Object obj8 = this.f$5;
        Object obj9 = this.f$4;
        Object obj10 = this.f$3;
        Object obj11 = this.f$1;
        Object obj12 = this.f$0;
        switch (i2) {
            case 0:
                Modifier modifier2 = (Modifier) obj12;
                ShoppingViewModel shoppingViewModel = (ShoppingViewModel) obj11;
                WebViewProvider webViewProvider = (WebViewProvider) obj10;
                KeyboardState keyboardState = (KeyboardState) obj9;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj8;
                MutableState mutableState2 = (MutableState) obj7;
                MutableState mutableState3 = (MutableState) obj6;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj4;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                Function7 function7 = (Function7) function;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                ?? r1 = (GapComposer) composer;
                boolean shouldExecute = r1.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = r1.applier;
                if (shouldExecute) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(r1.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = r1.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(r1, modifier2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    r1.startReusableNode();
                    if (r1.inserting) {
                        r1.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        r1.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(r1, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(r1, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(r1, valueOf, composeUiNode$Companion$SetModifier$14);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(r1, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(r1, materializeModifier, composeUiNode$Companion$SetModifier$15);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, r1, 0);
                    int hashCode2 = Long.hashCode(r1.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = r1.currentCompositionLocalScope();
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(r1, companion2);
                    r1.startReusableNode();
                    if (r1.inserting) {
                        r1.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        r1.useNode();
                    }
                    Updater.m576setimpl(r1, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(r1, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, (GapComposer) r1, composeUiNode$Companion$SetModifier$14, (GapComposer) r1, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(r1, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                    WebNavigationHeaderModel headerModel = shoppingViewModel.getHeaderModel();
                    Function1 function12 = this.f$2;
                    ShopErrorKt.WebNavigationHeader(headerModel, function12, new BasicShieetScope$$ExternalSyntheticLambda10(18, function12, ref$ObjectRef, mutableState2), r1, 0);
                    ModalKt.HorizontalDivider(0, 1, r1, null);
                    boolean z5 = shoppingViewModel instanceof ShoppingViewModel.ValidUrl;
                    if (z5) {
                        r1.startReplaceGroup(-974512594);
                        ShoppingWebContainerViewKt.AnimatedAutofillSuccessToast((ShoppingViewModel.ValidUrl) shoppingViewModel, r1, 0);
                        r1.end(false);
                    } else {
                        r1.startReplaceGroup(-974450129);
                        r1.end(false);
                    }
                    boolean z6 = shoppingViewModel instanceof ShoppingViewModel.ErrorUrl;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (z6) {
                        r1.startReplaceGroup(-974399041);
                        mutableState3.setValue(Boolean.FALSE);
                        String stringResource = Room.stringResource(r1, R.string.shop_web_page_error_card_title);
                        ShoppingViewModel.ErrorUrl errorUrl = (ShoppingViewModel.ErrorUrl) shoppingViewModel;
                        String str = errorUrl.errorDescription;
                        companion = companion2;
                        Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 16.0f);
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                        z = z5;
                        if (1.0f <= 0.0d) {
                            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                        }
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(m299paddingVpY3zN4.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 1.0f);
                        int ordinal = errorUrl.action.ordinal();
                        if (ordinal == 0) {
                            i = R.string.shop_retry_button_text;
                        } else {
                            if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            i = R.string.shop_go_back_button_text;
                        }
                        String stringResource2 = Room.stringResource(r1, i);
                        boolean changedInstance = r1.changedInstance(shoppingViewModel) | r1.changed(function12);
                        Object rememberedValue = r1.rememberedValue();
                        Object obj13 = rememberedValue;
                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                            BasicShieetScope$$ExternalSyntheticLambda10 basicShieetScope$$ExternalSyntheticLambda10 = new BasicShieetScope$$ExternalSyntheticLambda10(19, shoppingViewModel, function12, mutableState2);
                            r1.updateRememberedValue(basicShieetScope$$ExternalSyntheticLambda10);
                            obj13 = basicShieetScope$$ExternalSyntheticLambda10;
                        }
                        ShopErrorKt.ShopError(0, r1, fillMaxWidth, stringResource, str, stringResource2, (Function0) obj13);
                        r15 = 0;
                        r1.end(false);
                        mutableState = mutableState2;
                        function1 = function12;
                        horizontal = horizontal2;
                        modifier = null;
                    } else {
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                        companion = companion2;
                        z = z5;
                        r1.startReplaceGroup(-973703742);
                        if (1.0f <= 0.0d) {
                            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                        }
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
                        boolean changedInstance2 = r1.changedInstance(webViewProvider) | r1.changed(function12) | r1.changedInstance(shoppingViewModel);
                        Object rememberedValue2 = r1.rememberedValue();
                        Object obj14 = rememberedValue2;
                        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                            CardTransitionKt$$ExternalSyntheticLambda4 cardTransitionKt$$ExternalSyntheticLambda4 = new CardTransitionKt$$ExternalSyntheticLambda4(10, shoppingViewModel, webViewProvider, function12);
                            r1.updateRememberedValue(cardTransitionKt$$ExternalSyntheticLambda4);
                            obj14 = cardTransitionKt$$ExternalSyntheticLambda4;
                        }
                        Function1 function13 = (Function1) obj14;
                        mutableState = mutableState2;
                        horizontal = horizontal2;
                        modifier = null;
                        function1 = function12;
                        AndroidView_androidKt.AndroidView(function13, fillMaxWidth2, new ShoppingWebContainerViewKt$$ExternalSyntheticLambda5(coroutineScope, shoppingViewModel, this.f$10, this.f$11, this.f$12, ref$ObjectRef, ref$IntRef, function12, mutableState, parcelableSnapshotMutableIntState, mutableState3, function7), r1, 0, 0);
                        r15 = 0;
                        r1.end(false);
                    }
                    if (z6) {
                        r1.startReplaceGroup(-970277684);
                        ShoppingWebContainerViewKt.Footer(shoppingViewModel, function1, (WebAppBridge) mutableState.getValue(), r1, r15);
                        r1.end(r15);
                        z3 = r15;
                    } else {
                        if (!z) {
                            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) r1, -1970962623, false);
                        }
                        r1.startReplaceGroup(-970170703);
                        ShoppingViewModel.ValidUrl validUrl = (ShoppingViewModel.ValidUrl) shoppingViewModel;
                        AutofillFooterViewModel autofillFooterViewModel = validUrl.autofillFooterViewModel;
                        if (autofillFooterViewModel == null || keyboardState != KeyboardState.Open || validUrl.showAutofillSuccessToast) {
                            z2 = false;
                            r1.startReplaceGroup(-969760728);
                            ShoppingWebContainerViewKt.Footer(shoppingViewModel, function1, (WebAppBridge) mutableState.getValue(), r1, 0);
                            r1.end(false);
                        } else {
                            r1.startReplaceGroup(-969933212);
                            function1.invoke(ShoppingWebViewEvent.AutofillPillShown.INSTANCE);
                            z2 = false;
                            ModalKt.HorizontalDivider(0, 1, r1, modifier);
                            ShopErrorKt.AutofillFooter(modifier, autofillFooterViewModel, function1, r1, 0);
                            r1.end(false);
                        }
                        r1.end(z2);
                        z3 = z2;
                    }
                    r1.end(true);
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        r1.startReplaceGroup(-1087829797);
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, r1, z3 ? 1 : 0);
                        int hashCode3 = Long.hashCode(r1.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = r1.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(r1, companion);
                        r1.startReusableNode();
                        if (r1.inserting) {
                            r1.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            r1.useNode();
                        }
                        Updater.m576setimpl(r1, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                        Updater.m576setimpl(r1, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, (GapComposer) r1, composeUiNode$Companion$SetModifier$1, (GapComposer) r1, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(r1, materializeModifier3, composeUiNode$Companion$SetModifier$15);
                        Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(Request$Priority$EnumUnboxingLocalUtility.m(companion, 52.0f, (GapComposer) r1, companion, 1.0f), 4.0f);
                        float intValue2 = parcelableSnapshotMutableIntState.getIntValue() / 100.0f;
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                        Colors colors = (Colors) r1.consume(staticProvidableCompositionLocal);
                        r152 = 0;
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m((GapComposer) r1, -1762997026, (GapComposer) r1, false);
                        } else {
                            r1.startReplaceGroup(-1762997739);
                            r1.end(false);
                        }
                        long j = colors.semantic.background.standard;
                        Colors colors2 = (Colors) r1.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m((GapComposer) r1, -1762997026, (GapComposer) r1, false);
                        } else {
                            r1.startReplaceGroup(-1762997739);
                            r1.end(false);
                        }
                        ProgressIndicatorKt.m497LinearProgressIndicator_5eSRE(intValue2, m277height3ABfNKs, colors2.semantic.text.brand, j, r1, 48);
                        z4 = true;
                        r1.end(true);
                        r1.end(false);
                    } else {
                        z4 = true;
                        r1.startReplaceGroup(-1087462695);
                        r1.end(z3);
                        r152 = z3;
                    }
                    ShoppingWebContainerViewKt.PaykitInfoToast(shoppingViewModel, function1, r1, r152);
                    r1.end(z4);
                } else {
                    r1.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ManualEntryScreenKt.ManualEntryContent(this.f$10, (Integer) obj12, this.f$11, (Integer) obj11, (String) obj10, (Integer) obj9, this.f$12, (Async) obj8, (Async) obj7, this.f$2, (Function1) obj6, (Function1) obj5, (Function0) obj4, (Function1) obj3, (Function0) function, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ShoppingWebContainerViewKt$$ExternalSyntheticLambda0(String str, Integer num, String str2, Integer num2, String str3, Integer num3, boolean z, Async async, Async async2, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function0 function02, int i) {
        this.f$10 = str;
        this.f$0 = num;
        this.f$11 = str2;
        this.f$1 = num2;
        this.f$3 = str3;
        this.f$4 = num3;
        this.f$12 = z;
        this.f$5 = async;
        this.f$6 = async2;
        this.f$2 = function1;
        this.f$7 = function12;
        this.f$9 = function13;
        this.f$13 = function0;
        this.f$14 = function14;
        this.f$15 = function02;
    }
}
