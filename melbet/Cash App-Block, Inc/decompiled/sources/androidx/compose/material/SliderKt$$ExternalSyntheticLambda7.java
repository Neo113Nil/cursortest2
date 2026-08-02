package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.NavDestination;
import androidx.navigation.NavInflater;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.marketing.components.ArrowOrientation;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda3;
import com.squareup.cash.marketing.components.TooltipState;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.home.OffersHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.views.LinkedAccountsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.util.RealCashVibrator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.ClosedFloatingPointRange;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ float f$4;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda7(float f, LocalizedMoneyFormatter.Factory factory, RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel, RealCashVibrator realCashVibrator, Function1 function1) {
        this.$r8$classId = 4;
        this.f$1 = recurringReloadConfigurationViewModel;
        this.f$0 = function1;
        this.f$4 = f;
        this.f$2 = factory;
        this.f$3 = realCashVibrator;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Arrangement$End$1 arrangement$End$1;
        BiasAlignment.Vertical vertical;
        ComposableLambdaImpl composableLambdaImpl;
        Function3 function3;
        boolean z;
        int i = this.$r8$classId;
        float f = this.f$4;
        int i2 = 28;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$0;
        Object obj6 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                SliderKt.CorrectValueSideEffect((Function1) obj5, (ClosedFloatingPointRange) obj6, (ClosedFloatRange) obj4, (MutableState) obj3, this.f$4, (Composer) obj, Updater.updateChangedFlags(3073));
                return Unit.INSTANCE;
            case 1:
                Modifier modifier = (Modifier) obj5;
                String str = (String) obj6;
                Badge.Large large = (Badge.Large) obj4;
                TextStyle textStyle = (TextStyle) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(str);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new BadgeKt$$ExternalSyntheticLambda3(str, 4);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    com.squareup.cash.arcade.Colors colors = (com.squareup.cash.arcade.Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.m276defaultMinSizeVpY3zN4$default(SizeKt.m277height3ABfNKs(ImageKt.m177backgroundbw27NRU(semantics, colors.component.badge.background, RoundedCornerShapeKt.CircleShape), f), f, RecyclerView.DECELERATION_RATE, 2), f / 4.0f, RecyclerView.DECELERATION_RATE, 2);
                    String str2 = large.text;
                    com.squareup.cash.arcade.Colors colors2 = (com.squareup.cash.arcade.Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(3, 0, 0, 3, 805502976, 0, 3280, colors2.component.badge.text, (Composer) gapComposer, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Modifier modifier2 = (Modifier) obj5;
                Function3 function32 = (Function3) obj6;
                Function3 function33 = (Function3) obj4;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(SpacerKt.statusBarsPadding(modifier2), 1.0f), 52.0f, RecyclerView.DECELERATION_RATE, 2);
                    Arrangement$End$1 arrangement$End$12 = SpacerKt.Start;
                    BiasAlignment.Vertical vertical2 = Alignment.Companion.Top;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$12, vertical2, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m279heightInVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (function32 != null) {
                        gapComposer2.startReplaceGroup(-1200250447);
                        SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, f - 4.0f));
                        function3 = function33;
                        RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$12, vertical2, gapComposer2, 0);
                        vertical = vertical2;
                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                        arrangement$End$1 = arrangement$End$12;
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
                        gapComposer2.startReusableNode();
                        composableLambdaImpl = composableLambdaImpl2;
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        function32.invoke(new TitleBarActionScope(), gapComposer2, 0);
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                    } else {
                        arrangement$End$1 = arrangement$End$12;
                        vertical = vertical2;
                        composableLambdaImpl = composableLambdaImpl2;
                        function3 = function33;
                        gapComposer2.startReplaceGroup(-1200118511);
                        SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, f));
                        gapComposer2.end(false);
                    }
                    Updater.CompositionLocalProvider(ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((com.squareup.cash.arcade.Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).sectionTitle), Expect_jvmKt.rememberComposableLambda(27490032, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 14), gapComposer2), gapComposer2, 56);
                    if (function3 != null) {
                        gapComposer2.startReplaceGroup(-1199760368);
                        float f2 = f - 12.0f;
                        SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, f2));
                        RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer2, 0);
                        int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, companion);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                        function3.invoke(new TitleBarActionScope(), gapComposer2, 0);
                        z = true;
                        gapComposer2.end(true);
                        SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, f2));
                        gapComposer2.end(false);
                    } else {
                        z = true;
                        gapComposer2.startReplaceGroup(-1199381455);
                        SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, f));
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(z);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                TooltipState tooltipState = (TooltipState) obj5;
                Function0 function0 = (Function0) obj6;
                String str3 = (String) obj4;
                Alignment.Horizontal horizontal = (Alignment.Horizontal) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean changed2 = gapComposer3.changed(tooltipState) | gapComposer3.changed(function0);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new TooltipBoxKt$$ExternalSyntheticLambda3(tooltipState, function0, 1);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(Modifier.Companion.$$INSTANCE, null, null, false, null, null, (Function0) rememberedValue2, 28);
                    boolean changed3 = gapComposer3.changed(tooltipState);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new RealGooglePayer$$ExternalSyntheticLambda0(tooltipState, i2);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    CardUpsellKt.m3597TooltiposbwsH8(m182clickableO2vRcR0$default, str3, this.f$4, (Function0) rememberedValue3, horizontal, (ArrowOrientation) tooltipState.orientation$delegate.getValue(), gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                final RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) obj6;
                final Function1 function1 = (Function1) obj5;
                final LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) obj4;
                final RealCashVibrator realCashVibrator = (RealCashVibrator) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean changed4 = gapComposer4.changed(function1);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(24, function1);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    Function0 function02 = (Function0) rememberedValue4;
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new TaxWebAppBridge$$ExternalSyntheticLambda1(20);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    Function1 function12 = (Function1) rememberedValue5;
                    final float f3 = this.f$4;
                    boolean changed5 = gapComposer4.changed(f3);
                    Object rememberedValue6 = gapComposer4.rememberedValue();
                    if (changed5 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new PulsingState$$ExternalSyntheticLambda0(f3, 16);
                        gapComposer4.updateRememberedValue(rememberedValue6);
                    }
                    Function1 function13 = (Function1) rememberedValue6;
                    boolean changed6 = gapComposer4.changed(function1);
                    Object rememberedValue7 = gapComposer4.rememberedValue();
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(26, function1);
                        gapComposer4.updateRememberedValue(rememberedValue7);
                    }
                    Function0 function03 = (Function0) rememberedValue7;
                    boolean changed7 = gapComposer4.changed(function1);
                    Object rememberedValue8 = gapComposer4.rememberedValue();
                    if (changed7 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(27, function1);
                        gapComposer4.updateRememberedValue(rememberedValue8);
                    }
                    NavInflater.Companion.TransferSheet(recurringReloadConfigurationViewModel, function02, function12, function13, function03, (Function0) rememberedValue8, true, null, Expect_jvmKt.rememberComposableLambda(555793118, new Function6() { // from class: com.squareup.cash.transfers.views.RecurringReloadConfigurationViewKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function6
                        public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
                            int i3;
                            final float floatValue = ((Float) obj7).floatValue();
                            final PaddingValues paddingValues = (PaddingValues) obj8;
                            final Function0 function04 = (Function0) obj9;
                            Composer composer5 = (Composer) obj11;
                            int intValue5 = ((Integer) obj12).intValue();
                            paddingValues.getClass();
                            function04.getClass();
                            ((Function0) obj10).getClass();
                            if ((intValue5 & 6) == 0) {
                                i3 = (((GapComposer) composer5).changed(floatValue) ? 4 : 2) | intValue5;
                            } else {
                                i3 = intValue5;
                            }
                            if ((intValue5 & 48) == 0) {
                                i3 |= ((GapComposer) composer5).changed(paddingValues) ? 32 : 16;
                            }
                            if ((intValue5 & MLKEMEngine.KyberPolyBytes) == 0) {
                                i3 |= ((GapComposer) composer5).changedInstance(function04) ? 256 : 128;
                            }
                            GapComposer gapComposer5 = (GapComposer) composer5;
                            boolean shouldExecute2 = gapComposer5.shouldExecute(i3 & 1, (i3 & 8339) != 8338);
                            Applier applier2 = gapComposer5.applier;
                            if (shouldExecute2) {
                                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel2 = recurringReloadConfigurationViewModel;
                                float f4 = AddMoneyViewKt.calculatePeekPosition(recurringReloadConfigurationViewModel2, f3).value;
                                boolean z2 = (recurringReloadConfigurationViewModel2 instanceof RecurringReloadConfigurationViewModel.SelectFrequency) || (recurringReloadConfigurationViewModel2 instanceof RecurringReloadConfigurationViewModel.SelectDay);
                                Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                                if (colors3 == null) {
                                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                                } else {
                                    gapComposer5.startReplaceGroup(-1762997739);
                                    gapComposer5.end(false);
                                }
                                long j = colors3.semantic.background.f1047app;
                                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                                Modifier modifier3 = Modifier.Companion.$$INSTANCE;
                                Modifier then = ImageKt.m177backgroundbw27NRU(modifier3, j, rectangleShapeKt$RectangleShape$1).then(z2 ? SizeKt.m277height3ABfNKs(modifier3, f4) : modifier3);
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                                int hashCode4 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer5.currentCompositionLocalScope();
                                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer5, then);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                if (applier2 == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer5.startReusableNode();
                                if (gapComposer5.inserting) {
                                    gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                                } else {
                                    gapComposer5.useNode();
                                }
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                                Updater.m576setimpl(gapComposer5, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                                Updater.m576setimpl(gapComposer5, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                                Integer valueOf2 = Integer.valueOf(hashCode4);
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                                Updater.m576setimpl(gapComposer5, valueOf2, composeUiNode$Companion$SetModifier$17);
                                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                                Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$12);
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                                Updater.m576setimpl(gapComposer5, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                                if (!z2) {
                                    modifier3 = new LayoutWeightElement(1.0f, true);
                                }
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                int hashCode5 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer5.currentCompositionLocalScope();
                                Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer5, modifier3);
                                gapComposer5.startReusableNode();
                                if (gapComposer5.inserting) {
                                    gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                                } else {
                                    gapComposer5.useNode();
                                }
                                Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                                Updater.m576setimpl(gapComposer5, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                                Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer5, composeUiNode$Companion$SetModifier$17, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$12);
                                Updater.m576setimpl(gapComposer5, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                                Object rememberedValue9 = gapComposer5.rememberedValue();
                                NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                if (rememberedValue9 == neverEqualPolicy2) {
                                    rememberedValue9 = new TaxWebAppBridge$$ExternalSyntheticLambda1(21);
                                    gapComposer5.updateRememberedValue(rememberedValue9);
                                }
                                Function1 function14 = (Function1) rememberedValue9;
                                Object rememberedValue10 = gapComposer5.rememberedValue();
                                if (rememberedValue10 == neverEqualPolicy2) {
                                    rememberedValue10 = new TaxWebAppBridge$$ExternalSyntheticLambda1(18);
                                    gapComposer5.updateRememberedValue(rememberedValue10);
                                }
                                final Function1 function15 = function1;
                                final LocalizedMoneyFormatter.Factory factory2 = factory;
                                final RealCashVibrator realCashVibrator2 = realCashVibrator;
                                AnimatedContentKt.AnimatedContent(recurringReloadConfigurationViewModel2, null, function14, null, "RecurringReloadConfigurationNavigation", (Function1) rememberedValue10, Expect_jvmKt.rememberComposableLambda(1336658137, new Function4() { // from class: com.squareup.cash.transfers.views.RecurringReloadConfigurationViewKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function4
                                    public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel3 = (RecurringReloadConfigurationViewModel) obj14;
                                        int intValue6 = ((Integer) obj16).intValue();
                                        ((AnimatedContentScopeImpl) obj13).getClass();
                                        recurringReloadConfigurationViewModel3.getClass();
                                        GapComposer gapComposer6 = (GapComposer) ((Composer) obj15);
                                        Object rememberedValue11 = gapComposer6.rememberedValue();
                                        if (rememberedValue11 == Composer.Companion.Empty) {
                                            rememberedValue11 = new TaxWebAppBridge$$ExternalSyntheticLambda1(19);
                                            gapComposer6.updateRememberedValue(rememberedValue11);
                                        }
                                        NavDestination.Companion.SheetCrossfade(recurringReloadConfigurationViewModel3, floatValue, null, (Function1) rememberedValue11, Expect_jvmKt.rememberComposableLambda(1984609769, new OffersHomeViewKt$$ExternalSyntheticLambda2(paddingValues, function15, function04, factory2, realCashVibrator2), gapComposer6), gapComposer6, ((intValue6 >> 3) & 14) | 27648);
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer5), gapComposer5, 1794432, 10);
                                gapComposer5.end(true);
                                gapComposer5.end(true);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer4), gapComposer4, 102236544, 128);
                    boolean changed8 = gapComposer4.changed(function1);
                    Object rememberedValue9 = gapComposer4.rememberedValue();
                    if (changed8 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(28, function1);
                        gapComposer4.updateRememberedValue(rememberedValue9);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue9, gapComposer4, 0, 1);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda7(Modifier modifier, Object obj, float f, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = modifier;
        this.f$1 = obj;
        this.f$4 = f;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda7(TooltipState tooltipState, Function0 function0, String str, float f, Alignment.Horizontal horizontal) {
        this.$r8$classId = 3;
        this.f$0 = tooltipState;
        this.f$1 = function0;
        this.f$2 = str;
        this.f$4 = f;
        this.f$3 = horizontal;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda7(Function1 function1, ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatRange closedFloatRange, MutableState mutableState, float f, int i) {
        this.$r8$classId = 0;
        this.f$0 = function1;
        this.f$1 = closedFloatingPointRange;
        this.f$2 = closedFloatRange;
        this.f$3 = mutableState;
        this.f$4 = f;
    }
}
