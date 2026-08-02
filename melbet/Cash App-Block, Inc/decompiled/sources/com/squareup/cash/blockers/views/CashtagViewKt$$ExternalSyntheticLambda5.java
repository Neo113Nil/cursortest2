package com.squareup.cash.blockers.views;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n3$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewModel;
import com.squareup.cash.banking.views.BankingDialogKt;
import com.squareup.cash.banking.views.TransfersView$$ExternalSyntheticLambda0;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.viewmodels.CashtagViewModel;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasPickerViewModel;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.savings.viewmodels.CelebrationViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.cash.savings.views.SavingsScreenViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda11;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* loaded from: classes5.dex */
public final /* synthetic */ class CashtagViewKt$$ExternalSyntheticLambda5 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ CashtagViewKt$$ExternalSyntheticLambda5(Function1 function1, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = mutableState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x028e, code lost:
    
        if (r14 == r13) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v32 */
    @Override // kotlin.jvm.functions.Function4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        ComposableLambdaImpl composableLambdaImpl;
        Object obj6;
        CashtagViewModel cashtagViewModel;
        Function1 function1;
        Object obj7;
        ?? r13;
        Function1 function12;
        Object obj8;
        MutableState mutableState;
        int i;
        boolean z;
        int i2 = this.$r8$classId;
        Function1 function13 = this.f$0;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        MutableState mutableState2 = this.f$1;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj9 = Composer.Companion.Empty;
        switch (i2) {
            case 0:
                Object obj10 = (AnimatedContentScopeImpl) obj;
                CashtagViewModel cashtagViewModel2 = (CashtagViewModel) obj2;
                Composer composer = (Composer) obj3;
                ((Integer) obj4).getClass();
                obj10.getClass();
                cashtagViewModel2.getClass();
                Modifier imePadding = SpacerKt.imePadding(companion);
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer, 0);
                GapComposer gapComposer = (GapComposer) composer;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer, imePadding);
                ComposeUiNode.Companion.getClass();
                Function0 function0 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(function0);
                } else {
                    gapComposer2.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(composer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(composer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(composer, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(composer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(composer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                NavigationType navigationType = cashtagViewModel2.dismissButtonEnabled ? NavigationType.CLOSE : NavigationType.NONE;
                Function1 function14 = this.f$0;
                boolean changed = gapComposer2.changed(function14);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == obj9) {
                    obj5 = obj9;
                    rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(0, function14);
                    gapComposer2.updateRememberedValue(rememberedValue);
                } else {
                    obj5 = obj9;
                }
                DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, composer, 6, 108);
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), ImageKt.rememberScrollState(composer), false, 14);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer, 0);
                int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer, verticalScroll$default);
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(function0);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(composer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(composer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Request$Priority$EnumUnboxingLocalUtility.m(hashCode2, composer, composeUiNode$Companion$SetModifier$13, composer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(composer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                SpacerKt.Spacer(composer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                Countries.PageHeader(cashtagViewModel2.title, (Modifier) null, (Function2) null, cashtagViewModel2.subTitle, composer, 0, 6);
                SpacerKt.Spacer(composer, SizeKt.m277height3ABfNKs(companion, 32.0f));
                Modifier focusRequester = FocusTraversalKt.focusRequester(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), DBUtil.rememberFocusRequesterAndRequestFocus(composer));
                MutableState mutableState3 = this.f$1;
                TextFieldValue textFieldValue = (TextFieldValue) mutableState3.getValue();
                String str = cashtagViewModel2.label;
                if (str == null) {
                    gapComposer2.startReplaceGroup(-1349245304);
                    gapComposer2.end(false);
                    composableLambdaImpl = null;
                } else {
                    gapComposer2.startReplaceGroup(-1349245303);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-995762993, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, 10), composer);
                    gapComposer2.end(false);
                    composableLambdaImpl = rememberComposableLambda;
                }
                String str2 = cashtagViewModel2.hint;
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, 2, (Boolean) null, 119);
                boolean changedInstance = gapComposer2.changedInstance(obj10) | gapComposer2.changedInstance(cashtagViewModel2) | gapComposer2.changed(function14) | gapComposer2.changed(mutableState3);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                Object obj11 = obj5;
                if (changedInstance || rememberedValue2 == obj11) {
                    obj6 = obj10;
                    cashtagViewModel = cashtagViewModel2;
                    function1 = function14;
                    Object n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0(obj6, cashtagViewModel, function1, mutableState3, 27);
                    gapComposer2.updateRememberedValue(n3__externalsyntheticlambda0);
                    rememberedValue2 = n3__externalsyntheticlambda0;
                } else {
                    cashtagViewModel = cashtagViewModel2;
                    function1 = function14;
                    obj6 = obj10;
                }
                Function1 function15 = (Function1) rememberedValue2;
                KeyboardActions keyboardActions = new KeyboardActions(function15, function15, function15, function15, function15, function15);
                boolean changed2 = gapComposer2.changed(mutableState3) | gapComposer2.changed(function1);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue3 == obj11) {
                    rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda3(function1, mutableState3, 6);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                InputFieldKt.InputField(textFieldValue, (Function1) rememberedValue3, focusRequester, (InputState) null, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(1544044419, new CashtagViewKt$$ExternalSyntheticLambda10(cashtagViewModel, 0), composer), (Function2) null, Expect_jvmKt.rememberComposableLambda(-732416103, new CashtagViewKt$$ExternalSyntheticLambda11(cashtagViewModel, 0), composer), str2, keyboardOptions, keyboardActions, (VisualTransformation) null, composer, 818085888, 0, 2120);
                SpacerKt.Spacer(composer, new LayoutWeightElement(1.0f, true));
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1019796509, new ComposeDialogKt$$ExternalSyntheticLambda12(obj6, cashtagViewModel, function1, mutableState3, 17), composer), composer, 24576, 15);
                gapComposer2.end(true);
                gapComposer2.end(true);
                return Unit.INSTANCE;
            case 1:
                BetterOverdraftViewModel betterOverdraftViewModel = (BetterOverdraftViewModel) obj2;
                Composer composer2 = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                betterOverdraftViewModel.getClass();
                if (!(betterOverdraftViewModel instanceof BetterOverdraftViewModel.Loaded)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                    return null;
                }
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                GapComposer gapComposer3 = (GapComposer) composer2;
                int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(composer2, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer4 = (GapComposer) composer2;
                if (gapComposer4.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer4.startReusableNode();
                if (gapComposer4.inserting) {
                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer4.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(composer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(composer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
                Integer valueOf2 = Integer.valueOf(hashCode3);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(composer2, valueOf2, composeUiNode$Companion$SetModifier$17);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(composer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(composer2, materializeModifier3, composeUiNode$Companion$SetModifier$18);
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(composer2).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, composer2, 0);
                int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(composer2, m177backgroundbw27NRU);
                gapComposer4.startReusableNode();
                if (gapComposer4.inserting) {
                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer4.useNode();
                }
                Updater.m576setimpl(composer2, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(composer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                Request$Priority$EnumUnboxingLocalUtility.m(hashCode4, composer2, composeUiNode$Companion$SetModifier$17, composer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(composer2, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                BetterOverdraftViewModel.Loaded loaded = (BetterOverdraftViewModel.Loaded) betterOverdraftViewModel;
                BetterOverdraftViewModel.Loaded.OverdraftHeaderViewModel overdraftHeaderViewModel = loaded.headerViewModel;
                String str3 = loaded.title;
                NavigationType navigationType2 = NavigationType.BACK;
                boolean changed3 = gapComposer4.changed(function13);
                Object rememberedValue4 = gapComposer4.rememberedValue();
                if (!changed3) {
                    obj7 = obj9;
                    break;
                } else {
                    obj7 = obj9;
                }
                rememberedValue4 = new TransfersView$$ExternalSyntheticLambda0(4, function13);
                gapComposer4.updateRememberedValue(rememberedValue4);
                DBUtil.TitleBarSub(str3, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, composer2, 48, 108);
                Object obj12 = obj7;
                Modifier verticalScroll$default2 = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), ImageKt.rememberScrollState(composer2), false, 14);
                ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, composer2, 0);
                int hashCode5 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer4.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(composer2, verticalScroll$default2);
                gapComposer4.startReusableNode();
                if (gapComposer4.inserting) {
                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer4.useNode();
                }
                Updater.m576setimpl(composer2, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(composer2, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                Request$Priority$EnumUnboxingLocalUtility.m(hashCode5, composer2, composeUiNode$Companion$SetModifier$17, composer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(composer2, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                DBUtil.SpacerWithinSectionMedium(0, 1, composer2, null);
                Strings.getSizes(composer2).getClass();
                DefaultSizes.spacing.getClass();
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, composer2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(composer2).headlineSmall, (TextLineBalancing) null, overdraftHeaderViewModel.title, (Map) null, (Function1) null, false);
                String str4 = loaded.subtitle;
                if (str4 == null) {
                    gapComposer4.startReplaceGroup(-885150839);
                    r13 = 0;
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(-885150838);
                    DBUtil.SpacerWithinSectionMedium(0, 1, composer2, null);
                    Strings.getSizes(composer2).getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(composer2).semantic.text.standard, composer2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(composer2).bodyMedium, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    r13 = 0;
                    gapComposer4.end(false);
                }
                String str5 = overdraftHeaderViewModel.linkText;
                if (str5 == null) {
                    gapComposer4.startReplaceGroup(-884743158);
                    gapComposer4.end(r13);
                    i = r13;
                    mutableState = mutableState2;
                    obj8 = obj12;
                    function12 = function13;
                } else {
                    gapComposer4.startReplaceGroup(-884743157);
                    DBUtil.SpacerWithinSectionMedium(r13, 1, composer2, null);
                    function12 = function13;
                    boolean changed4 = gapComposer4.changed(function12);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    obj8 = obj12;
                    if (changed4 || rememberedValue5 == obj8) {
                        mutableState = mutableState2;
                        rememberedValue5 = new CashtagViewKt$$ExternalSyntheticLambda13(function12, mutableState, 4);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    } else {
                        mutableState = mutableState2;
                    }
                    coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue5, null, ButtonProminence.SUBTLE, false, false, null, Expect_jvmKt.rememberComposableLambda(-187107985, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str5, 8), composer2), composer2, 1573248, 58);
                    i = 0;
                    gapComposer4.end(false);
                }
                DBUtil.SpacerWithinSectionMedium(i, 1, composer2, null);
                DBUtil.SpacerBetweenSectionLarge(i, 1, composer2, null);
                int i3 = (intValue >> 3) & 14;
                BankingDialogKt.OverdraftUsageCircle(loaded, new HorizontalAlignElement(Alignment.Companion.CenterHorizontally), composer2, i3);
                SpacerKt.Spacer(composer2, new LayoutWeightElement(1.0f, true));
                if (loaded.toggleButtonText == null && loaded.payButtonText == null) {
                    gapComposer4.startReplaceGroup(-883946798);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(-884028483);
                    BankingDialogKt.OverdraftFooter(loaded, function12, composer2, i3);
                    gapComposer4.end(false);
                }
                gapComposer4.end(true);
                gapComposer4.end(true);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    gapComposer4.startReplaceGroup(1091919878);
                    BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo overdraftLimitsInfo = loaded.limitsInfo;
                    Object rememberedValue6 = gapComposer4.rememberedValue();
                    if (rememberedValue6 == obj8) {
                        rememberedValue6 = new TabContentViewKt$$ExternalSyntheticLambda1(17, mutableState);
                        gapComposer4.updateRememberedValue(rememberedValue6);
                    }
                    BankingDialogKt.OverdraftLimitsInfoSheet(overdraftLimitsInfo, (Function0) rememberedValue6, composer2, 48);
                    z = false;
                    gapComposer4.end(false);
                } else {
                    z = false;
                    gapComposer4.startReplaceGroup(1092073638);
                    gapComposer4.end(false);
                }
                BetterOverdraftViewModel.Loaded.TurnOffConfirmationSheet turnOffConfirmationSheet = loaded.turnOffConfirmationSheet;
                if (turnOffConfirmationSheet == null) {
                    gapComposer4.startReplaceGroup(1092128290);
                    gapComposer4.end(z);
                } else {
                    gapComposer4.startReplaceGroup(1092128291);
                    boolean changed5 = gapComposer4.changed(function12);
                    Object rememberedValue7 = gapComposer4.rememberedValue();
                    if (changed5 || rememberedValue7 == obj8) {
                        rememberedValue7 = new TransfersView$$ExternalSyntheticLambda0(5, function12);
                        gapComposer4.updateRememberedValue(rememberedValue7);
                    }
                    Function0 function02 = (Function0) rememberedValue7;
                    boolean changed6 = gapComposer4.changed(function12);
                    Object rememberedValue8 = gapComposer4.rememberedValue();
                    if (changed6 || rememberedValue8 == obj8) {
                        rememberedValue8 = new TransfersView$$ExternalSyntheticLambda0(6, function12);
                        gapComposer4.updateRememberedValue(rememberedValue8);
                    }
                    BankingDialogKt.TurnOffOverdraftConfirmationSheet(turnOffConfirmationSheet, function02, (Function0) rememberedValue8, composer2, 0);
                    gapComposer4.end(false);
                }
                gapComposer4.end(true);
                return Unit.INSTANCE;
            case 2:
                AliasPickerViewModel aliasPickerViewModel = (AliasPickerViewModel) obj2;
                Composer composer3 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                aliasPickerViewModel.getClass();
                ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer3, 0);
                GapComposer gapComposer5 = (GapComposer) composer3;
                int hashCode6 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer5.currentCompositionLocalScope();
                Modifier materializeModifier6 = PlatformKt.materializeModifier(composer3, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer6 = (GapComposer) composer3;
                if (gapComposer6.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer6.startReusableNode();
                if (gapComposer6.inserting) {
                    gapComposer6.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer6.useNode();
                }
                Updater.m576setimpl(composer3, columnMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer3, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer3, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer3, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                NavigationType navigationType3 = NavigationType.BACK;
                boolean changed7 = gapComposer6.changed(function13);
                Object rememberedValue9 = gapComposer6.rememberedValue();
                if (changed7 || rememberedValue9 == obj9) {
                    rememberedValue9 = new P2PListViewKt$$ExternalSyntheticLambda0(14, function13);
                    gapComposer6.updateRememberedValue(rememberedValue9);
                }
                DBUtil.TitleBarSub((String) null, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue9, (Modifier) null, (Function3) null, composer3, 54, 108);
                SpacerKt.Spacer(composer3, SizeKt.m285size3ABfNKs(companion, 16.0f));
                Countries.PageHeader(aliasPickerViewModel.headerText, (Modifier) null, (Function2) null, (String) null, composer3, 0, 14);
                SpacerKt.Spacer(composer3, SizeKt.m285size3ABfNKs(companion, 32.0f));
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), true);
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                boolean changedInstance2 = gapComposer6.changedInstance(aliasPickerViewModel);
                Object rememberedValue10 = gapComposer6.rememberedValue();
                if (changedInstance2 || rememberedValue10 == obj9) {
                    rememberedValue10 = new MusicViewKt$$ExternalSyntheticLambda6(23, aliasPickerViewModel, mutableState2);
                    gapComposer6.updateRememberedValue(rememberedValue10);
                }
                LazyDslKt.LazyColumn(m, null, null, arrangement$SpacedAligned, null, null, false, null, (Function1) rememberedValue10, composer3, 24576, 494);
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(2102599510, new ShiftListViewKt$$ExternalSyntheticLambda11(function13, mutableState2, 5), composer3), composer3, 24576, 15);
                gapComposer6.end(true);
                return Unit.INSTANCE;
            default:
                SavingsScreenViewModel savingsScreenViewModel = (SavingsScreenViewModel) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                savingsScreenViewModel.getClass();
                SavingsScreenViewModel.Content content = (SavingsScreenViewModel.Content) savingsScreenViewModel;
                GapComposer gapComposer7 = (GapComposer) ((Composer) obj3);
                Object rememberedValue11 = gapComposer7.rememberedValue();
                if (rememberedValue11 == obj9) {
                    rememberedValue11 = new TabToolbarsKt$$ExternalSyntheticLambda10(7, mutableState2);
                    gapComposer7.updateRememberedValue(rememberedValue11);
                }
                Function1 function16 = this.f$0;
                SavingsScreenViewKt.SavingsScreen(content, (Function1) rememberedValue11, function16, null, gapComposer7, ((intValue2 >> 3) & 14) | 48);
                CelebrationViewModel celebrationViewModel = content.celebration;
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                ButtonGroupKt.Celebration(celebrationViewModel, ImageKt.m177backgroundbw27NRU(OffsetKt.windowInsetsPadding(fillMaxSize, Arrangement$End$1.current(gapComposer7).systemBars), Color.Transparent, rectangleShapeKt$RectangleShape$1), ((Boolean) mutableState2.getValue()).booleanValue(), function16, gapComposer7, 0);
                return Unit.INSTANCE;
        }
    }
}
