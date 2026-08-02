package com.squareup.cash.datefilterbar.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.pos.LocalPosCheckInViewKt;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafd;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.observabilitynaming.ObservabilityView;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.market.hours.InvestingPlaceholderGraphView;
import com.squareup.cash.investing.viewmodels.InvestmentEntityContentModel;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPlaceholderGraphViewModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.onboarding.viewmodels.OnboardingLandingViewModel;
import com.squareup.cash.payments.views.UtilKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.views.TaxToolTipViewKt$$ExternalSyntheticLambda3;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.oneformapp.DLog;

/* loaded from: classes6.dex */
public final /* synthetic */ class DateFilterChipKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ DateFilterChipKt$$ExternalSyntheticLambda0(long j, RoundedCornerShape roundedCornerShape, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function0 function0, ComposableLambdaImpl composableLambdaImpl) {
        this.f$1 = j;
        this.f$2 = roundedCornerShape;
        this.f$3 = mutableInteractionSourceImpl;
        this.f$4 = function0;
        this.f$5 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        BoxScopeInstance boxScopeInstance;
        boolean z2;
        int i = this.$r8$classId;
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        long j = this.f$1;
        Object obj3 = this.f$5;
        Object obj4 = this.f$4;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        switch (i) {
            case 0:
                RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj6;
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj5;
                Function0 function0 = (Function0) obj4;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m275defaultMinSizeVpY3zN4 = SizeKt.m275defaultMinSizeVpY3zN4(companion, 48.0f, 32.0f);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        z = false;
                        rememberedValue = new SessionQueries$$ExternalSyntheticLambda1(5, false);
                        gapComposer.updateRememberedValue(rememberedValue);
                    } else {
                        z = false;
                    }
                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(ClipKt.clip(ImageKt.m177backgroundbw27NRU(SemanticsModifierKt.semantics(m275defaultMinSizeVpY3zN4, z, (Function1) rememberedValue), j, roundedCornerShape), roundedCornerShape), mutableInteractionSourceImpl, (IndicationNodeFactory) gapComposer.consume(IndicationKt.LocalIndication), false, null, null, function0, 28);
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m182clickableO2vRcR0$default, 16.0f, 4.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke((Object) boxScopeInstance2, (Object) gapComposer, (Object) 6);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                LocalMapKt.m1316AnimatedAlternatingTextuDo3WH8((String) obj6, (String) obj5, (Modifier) obj4, this.f$1, (TextStyle) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                LocalPosCheckInViewKt.m1330RedeemExplanationsW7UJKQ((Modifier) obj6, this.f$1, (String) obj5, (ArrayList) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int i2 = InvestingPlaceholderGraphView.$r8$clinit;
                ((InvestingPlaceholderGraphView) obj6).m3584PlaceholderGraphBx497Mc((InvestingPlaceholderGraphViewModel) obj5, (Function1) obj4, (ComposableLambdaImpl) obj3, this.f$1, (Composer) obj, Updater.updateChangedFlags(33153));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                DLog.m4316InvestmentEntityCollapsingHeaderuDo3WH8((InvestmentEntityContentModel) obj6, (RealImageLoader) obj5, this.f$1, (Function1) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(196615));
                return Unit.INSTANCE;
            default:
                OnboardingLandingViewModel onboardingLandingViewModel = (OnboardingLandingViewModel) obj6;
                RealImageLoader realImageLoader = (RealImageLoader) obj5;
                MutableState mutableState = (MutableState) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    ChromeConfigKt.ChromeConfig(ChromeSystemIconColor.ALWAYS_LIGHT, Boolean.TRUE, gapComposer2, 390, 10);
                    ObservabilityView[] observabilityViewArr = ObservabilityView.$VALUES;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(TestTagKt.testTag(companion, "welcome_screen"), 1.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    String str = onboardingLandingViewModel.placeholderImageUrl;
                    String str2 = onboardingLandingViewModel.videoUrl;
                    boolean changed = gapComposer2.changed(mutableState);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        boxScopeInstance = boxScopeInstance2;
                        rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda9(22, mutableState);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    } else {
                        boxScopeInstance = boxScopeInstance2;
                    }
                    Function1 function12 = (Function1) rememberedValue2;
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new UtilKt$$ExternalSyntheticLambda0(3, function1);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    zzafd.OnboardingLandingMedia(str, str2, realImageLoader, function12, (Function1) rememberedValue3, SizeKt.fillMaxSize(companion, 1.0f), gapComposer2, 196608);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        gapComposer2.startReplaceGroup(-1415339182);
                        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Bottom;
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 6);
                        int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), ((Dp) gapComposer2.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2);
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer2, 0);
                        int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).headlineSmall, (TextLineBalancing) null, onboardingLandingViewModel.tagline, (Map) null, (Function1) null, false);
                        gapComposer2.end(true);
                        DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(1223346466, new TaxToolTipViewKt$$ExternalSyntheticLambda3(function1, j, onboardingLandingViewModel), gapComposer2), gapComposer2, 24582, 14);
                        z2 = true;
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                    } else {
                        z2 = true;
                        gapComposer2.startReplaceGroup(-1414430076);
                        ProgressCircularKt.ProgressCircular(0, 0, gapComposer2, boxScopeInstance.align(companion, Alignment.Companion.Center));
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(z2);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DateFilterChipKt$$ExternalSyntheticLambda0(Modifier modifier, long j, String str, ArrayList arrayList, Function1 function1, int i) {
        this.f$2 = modifier;
        this.f$1 = j;
        this.f$3 = str;
        this.f$4 = arrayList;
        this.f$5 = function1;
    }

    public /* synthetic */ DateFilterChipKt$$ExternalSyntheticLambda0(InvestingPlaceholderGraphView investingPlaceholderGraphView, InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel, Function1 function1, ComposableLambdaImpl composableLambdaImpl, long j, int i) {
        this.f$2 = investingPlaceholderGraphView;
        this.f$3 = investingPlaceholderGraphViewModel;
        this.f$4 = function1;
        this.f$5 = composableLambdaImpl;
        this.f$1 = j;
    }

    public /* synthetic */ DateFilterChipKt$$ExternalSyntheticLambda0(InvestmentEntityContentModel investmentEntityContentModel, RealImageLoader realImageLoader, long j, Function1 function1, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$2 = investmentEntityContentModel;
        this.f$3 = realImageLoader;
        this.f$1 = j;
        this.f$4 = function1;
        this.f$5 = composableLambdaImpl;
    }

    public /* synthetic */ DateFilterChipKt$$ExternalSyntheticLambda0(OnboardingLandingViewModel onboardingLandingViewModel, RealImageLoader realImageLoader, MutableState mutableState, Function1 function1, long j) {
        this.f$2 = onboardingLandingViewModel;
        this.f$3 = realImageLoader;
        this.f$4 = mutableState;
        this.f$5 = function1;
        this.f$1 = j;
    }

    public /* synthetic */ DateFilterChipKt$$ExternalSyntheticLambda0(String str, String str2, Modifier modifier, long j, TextStyle textStyle, int i) {
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = modifier;
        this.f$1 = j;
        this.f$5 = textStyle;
    }
}
