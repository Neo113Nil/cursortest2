package com.squareup.cash.paymentpad.views;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.CombinedClickableElement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.molecule.PlatformKt;
import bo.app.g6$$ExternalSyntheticLambda11;
import coil3.RealImageLoader;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.squareup.cardcustomizations.signature.PatternStateListener;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda27;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt$$ExternalSyntheticLambda20;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.paymentpad.viewmodels.HomeViewModel;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.ui.util.RealCashVibrator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class HomeViewKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;

    public /* synthetic */ HomeViewKt$$ExternalSyntheticLambda0(ClientRenderablePlugin clientRenderablePlugin, boolean z, MutableState mutableState, String str, MoneybotHomeViewModel.WidgetCard widgetCard, Function1 function1, String str2, List list) {
        this.f$0 = clientRenderablePlugin;
        this.f$5 = z;
        this.f$1 = mutableState;
        this.f$2 = str;
        this.f$4 = widgetCard;
        this.f$3 = function1;
        this.f$6 = str2;
        this.f$7 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.squareup.cash.moneybot.components.api.ClientRenderablePlugin] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.GapComposer] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r18;
        Function0 function0;
        Modifier then;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = Composer.Companion.Empty;
        Object obj5 = this.f$7;
        Object obj6 = this.f$6;
        Object obj7 = this.f$4;
        Object obj8 = this.f$2;
        Object obj9 = this.f$1;
        Object obj10 = this.f$0;
        switch (i) {
            case 0:
                PaymentPadTheme paymentPadTheme = (PaymentPadTheme) obj10;
                RealImageLoader realImageLoader = (RealImageLoader) obj9;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj8;
                HomeViewModel homeViewModel = (HomeViewModel) obj7;
                SplashScreenAnimationObserver splashScreenAnimationObserver = (SplashScreenAnimationObserver) obj6;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj5;
                UiScope uiScope = (UiScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    ArcadeThemeKt.ArcadeTheme(HomeViewKt.colors(paymentPadTheme, gapComposer), null, null, Expect_jvmKt.rememberComposableLambda(552262340, new SheetKt$$ExternalSyntheticLambda2(realImageLoader, realCashVibrator, this.f$3, homeViewModel, this.f$5, paymentPadTheme, splashScreenAnimationObserver, elementBoundsRegistry, uiScope), gapComposer), gapComposer, 3072, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj10;
                SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj9;
                PatternStateListener patternStateListener = (PatternStateListener) obj8;
                SignatureState signatureState = (SignatureState) obj7;
                PatternStampState patternStampState = (PatternStampState) obj6;
                CardStudioViewModelV2.Content content = (CardStudioViewModelV2.Content) obj5;
                Composer composer2 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                GapComposer gapComposer2 = (GapComposer) composer2;
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SpacerKt.statusBarsPadding(SpacerKt.m298padding3ABfNKs(fillMaxWidth, 16.0f)), 52.0f, RecyclerView.DECELERATION_RATE, 2);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, composer2, 54);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer2, m279heightInVpY3zN4$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                ?? r8 = (GapComposer) composer2;
                if (r8.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                r8.startReusableNode();
                if (r8.inserting) {
                    r8.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    r8.useNode();
                }
                Updater.m576setimpl(composer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Icons icons = Icons.Undo24;
                String stringResource = Room.stringResource(composer2, R.string.accessibility_undo);
                boolean z = this.f$5;
                boolean z2 = !z ? snapshotStateList2.isEmpty() : snapshotStateList.isEmpty();
                boolean changed = r8.changed(z);
                Object rememberedValue = r8.rememberedValue();
                if (changed || rememberedValue == obj4) {
                    rememberedValue = new g6$$ExternalSyntheticLambda11(z, snapshotStateList, snapshotStateList2, 4);
                    r8.updateRememberedValue(rememberedValue);
                }
                StorageUtil.ButtonIcon(icons, stringResource, (Function0) rememberedValue, null, z2, null, composer2, 6, 40);
                Icons icons2 = Icons.Check24;
                String stringResource2 = Room.stringResource(composer2, R.string.accessibility_done);
                boolean changed2 = r8.changed(z) | r8.changedInstance(patternStateListener) | r8.changedInstance(signatureState) | r8.changedInstance(patternStampState);
                Function1 function1 = this.f$3;
                boolean changed3 = changed2 | r8.changed(function1) | r8.changedInstance(content);
                Object rememberedValue2 = r8.rememberedValue();
                if (changed3 || rememberedValue2 == obj4) {
                    rememberedValue2 = new CardStudioViewV2Kt$$ExternalSyntheticLambda27(z, patternStateListener, signatureState, patternStampState, function1, content);
                    r8.updateRememberedValue(rememberedValue2);
                }
                StorageUtil.ButtonIcon(icons2, stringResource2, (Function0) rememberedValue2, null, false, null, composer2, 6, 56);
                r8.end(true);
                return Unit.INSTANCE;
            default:
                ?? r14 = (ClientRenderablePlugin) obj10;
                MutableState mutableState = (MutableState) obj9;
                String str = (String) obj8;
                MoneybotHomeViewModel.WidgetCard widgetCard = (MoneybotHomeViewModel.WidgetCard) obj7;
                String str2 = (String) obj6;
                List list = (List) obj5;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue2 & 6) == 0) {
                    r18 = 0;
                    intValue2 |= ((GapComposer) composer3).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                } else {
                    r18 = 0;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Modifier containerModifier = r14.containerModifier(companion);
                    boolean z3 = this.f$5;
                    if (z3) {
                        gapComposer3.startReplaceGroup(2124231064);
                        boolean changed4 = gapComposer3.changed(mutableState);
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        if (changed4 || rememberedValue3 == obj4) {
                            rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda2(23, mutableState);
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        function0 = (Function0) rememberedValue3;
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(2124264078);
                        gapComposer3.end(false);
                        function0 = r18;
                    }
                    if (!z3) {
                        str = r18;
                    }
                    boolean changedInstance = gapComposer3.changedInstance(widgetCard);
                    Function1 function12 = this.f$3;
                    boolean changed5 = changedInstance | gapComposer3.changed(function12);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed5 || rememberedValue4 == obj4) {
                        rememberedValue4 = new MoneybotHomeViewKt$$ExternalSyntheticLambda20(widgetCard, function12, 1);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    then = containerModifier.then(new CombinedClickableElement(null, null, null, "", str, (Function0) rememberedValue4, function0, true, true));
                    boolean changed6 = gapComposer3.changed(z3) | gapComposer3.changed(str2) | gapComposer3.changedInstance(widgetCard) | gapComposer3.changed(function12);
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (changed6 || rememberedValue5 == obj4) {
                        rememberedValue5 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(z3, str2, widgetCard, function12);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(then, false, (Function1) rememberedValue5);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, semantics);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw r18;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    r14.RenderContent(widgetCard.callbackModel, gapComposer3, 0);
                    gapComposer3.end(true);
                    if (z3) {
                        gapComposer3.startReplaceGroup(2124930889);
                        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                        Dp dp = new Dp(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM());
                        boolean changed7 = gapComposer3.changed(mutableState);
                        Object rememberedValue6 = gapComposer3.rememberedValue();
                        if (changed7 || rememberedValue6 == obj4) {
                            rememberedValue6 = new CashMapViewKt$$ExternalSyntheticLambda2(24, mutableState);
                            gapComposer3.updateRememberedValue(rememberedValue6);
                        }
                        ExpandableContentKt.m3634ExpandableContent0aeBpQE(list, booleanValue, 175.0f, dp, (Function0) rememberedValue6, gapComposer3, MLKEMEngine.KyberPolyBytes, 0);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(2125130963);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ HomeViewKt$$ExternalSyntheticLambda0(PaymentPadTheme paymentPadTheme, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, Function1 function1, HomeViewModel homeViewModel, boolean z, SplashScreenAnimationObserver splashScreenAnimationObserver, ElementBoundsRegistry elementBoundsRegistry) {
        this.f$0 = paymentPadTheme;
        this.f$1 = realImageLoader;
        this.f$2 = realCashVibrator;
        this.f$3 = function1;
        this.f$4 = homeViewModel;
        this.f$5 = z;
        this.f$6 = splashScreenAnimationObserver;
        this.f$7 = elementBoundsRegistry;
    }

    public /* synthetic */ HomeViewKt$$ExternalSyntheticLambda0(boolean z, SnapshotStateList snapshotStateList, SnapshotStateList snapshotStateList2, PatternStateListener patternStateListener, SignatureState signatureState, PatternStampState patternStampState, Function1 function1, CardStudioViewModelV2.Content content) {
        this.f$5 = z;
        this.f$0 = snapshotStateList;
        this.f$1 = snapshotStateList2;
        this.f$2 = patternStateListener;
        this.f$4 = signatureState;
        this.f$6 = patternStampState;
        this.f$3 = function1;
        this.f$7 = content;
    }
}
