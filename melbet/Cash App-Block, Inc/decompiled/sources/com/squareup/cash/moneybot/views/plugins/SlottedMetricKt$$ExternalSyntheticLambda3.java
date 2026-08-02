package com.squareup.cash.moneybot.views.plugins;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScopeInstance;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.offers.views.OffersFormattedDetailKt$$ExternalSyntheticLambda7;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.protos.cash.kgoose.api.v3.Metric;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class SlottedMetricKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ SlottedMetricKt$$ExternalSyntheticLambda3(CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, long j, ComposableLambdaImpl composableLambdaImpl, NavigationType navigationType, Function0 function0, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3) {
        this.f$0 = collapsingToolbarScaffoldState;
        this.f$3 = j;
        this.f$1 = composableLambdaImpl;
        this.f$2 = navigationType;
        this.f$4 = function0;
        this.f$5 = composableLambdaImpl2;
        this.f$6 = composableLambdaImpl3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        char c;
        MutableState mutableState;
        SlotContent.Metric metric;
        long j;
        TextStyle textStyle;
        TextMeasurer textMeasurer;
        Density density;
        Object m994copyp1EtxEg$default;
        long pack;
        long j2;
        TextStyle textStyle2;
        TextStyle textStyle3;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$6;
        Object obj5 = this.f$5;
        Object obj6 = this.f$4;
        Object obj7 = this.f$2;
        Object obj8 = this.f$1;
        long j3 = this.f$3;
        Object obj9 = this.f$0;
        switch (i) {
            case 0:
                SlotContent.Metric metric2 = (SlotContent.Metric) obj9;
                AnimatedAmountTextView.Amount amount = (AnimatedAmountTextView.Amount) obj8;
                TextStyle textStyle4 = (TextStyle) obj7;
                TextMeasurer textMeasurer2 = (TextMeasurer) obj6;
                Density density2 = (Density) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    String str2 = metric2.amountPrefix;
                    String str3 = metric2.amountSuffix;
                    boolean changed = gapComposer.changed(str2) | gapComposer.changed(amount.text) | gapComposer.changed(str3);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        String fullAmountText = SlottedMetricKt.fullAmountText(metric2);
                        Metric.TrendDirection trendDirection = metric2.trendDirection;
                        rememberedValue = fullAmountText.concat((trendDirection == null || trendDirection == Metric.TrendDirection.TREND_DIRECTION_UNSPECIFIED) ? "" : "up");
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    String str4 = (String) rememberedValue;
                    boolean changed2 = gapComposer.changed(boxWithConstraintsScopeImpl.constraints) | gapComposer.changed(str4) | gapComposer.changed(textStyle4) | gapComposer.changed(j3) | gapComposer.changed(textMeasurer2);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        SpanStyle spanStyle = textStyle4.spanStyle;
                        ParagraphStyle paragraphStyle = textStyle4.paragraphStyle;
                        str = str3;
                        String str5 = str4;
                        long j4 = spanStyle.fontSize;
                        TextMeasurer textMeasurer3 = textMeasurer2;
                        TextStyle textStyle5 = textStyle4;
                        long j5 = paragraphStyle.lineHeight;
                        long j6 = j4;
                        long j7 = j5;
                        c = ' ';
                        while (true) {
                            Room.m1168checkArithmeticNB67dxo(j6, j3);
                            TextMeasurer textMeasurer4 = textMeasurer3;
                            mutableState = mutableState2;
                            if (Float.compare(TextUnit.m1059getValueimpl(j6), TextUnit.m1059getValueimpl(j3)) > 0) {
                                long j8 = j6;
                                textStyle = textStyle5;
                                j = j8;
                                String str6 = str5;
                                TextLayoutResult m979measurewNUYSr0$default = TextMeasurer.m979measurewNUYSr0$default(textMeasurer4, str6, TextStyle.m994copyp1EtxEg$default(textStyle5, 0L, j8, null, null, 0L, null, 0L, null, null, null, 0, j7, null, null, 0, 16646141), 1, boxWithConstraintsScopeImpl.constraints, 972);
                                metric = metric2;
                                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl2 = boxWithConstraintsScopeImpl;
                                textMeasurer = textMeasurer4;
                                if (((int) (m979measurewNUYSr0$default.size >> 32)) < m979measurewNUYSr0$default.multiParagraph.width || m979measurewNUYSr0$default.getDidOverflowHeight()) {
                                    Density density3 = density2;
                                    if (TextUnitType.m1062equalsimpl0(TextUnit.m1058getTypeUIouoOA(j), 4294967296L)) {
                                        pack = Room.pack(4294967296L, TextUnit.m1059getValueimpl(j) - 2.0f);
                                    } else {
                                        Room.m1167checkArithmeticR2X_6o(j);
                                        pack = Room.pack(j & 1095216660480L, TextUnit.m1059getValueimpl(j) * 0.9f);
                                    }
                                    Room.m1168checkArithmeticNB67dxo(pack, j3);
                                    if (Float.compare(TextUnit.m1059getValueimpl(pack), TextUnit.m1059getValueimpl(j3)) < 0) {
                                        pack = j3;
                                    }
                                    long j9 = TextUnit.Unspecified;
                                    if (TextUnit.m1057equalsimpl0(j5, j9) || TextUnit.m1057equalsimpl0(j4, j9)) {
                                        j2 = pack;
                                    } else {
                                        float m1059getValueimpl = TextUnit.m1059getValueimpl(j4);
                                        Room.m1167checkArithmeticR2X_6o(pack);
                                        j2 = pack;
                                        long pack2 = Room.pack(j2 & 1095216660480L, TextUnit.m1059getValueimpl(j2) / m1059getValueimpl);
                                        float m1059getValueimpl2 = TextUnit.m1059getValueimpl(j5);
                                        Room.m1167checkArithmeticR2X_6o(pack2);
                                        j7 = Room.pack(pack2 & 1095216660480L, TextUnit.m1059getValueimpl(pack2) * m1059getValueimpl2);
                                    }
                                    metric2 = metric;
                                    textStyle5 = textStyle;
                                    textMeasurer3 = textMeasurer;
                                    boxWithConstraintsScopeImpl = boxWithConstraintsScopeImpl2;
                                    mutableState2 = mutableState;
                                    density2 = density3;
                                    str5 = str6;
                                    j6 = j2;
                                }
                            } else {
                                metric = metric2;
                                j = j6;
                                textStyle = textStyle5;
                                textMeasurer = textMeasurer4;
                            }
                        }
                        density = density2;
                        m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, j, null, null, 0L, null, 0L, null, null, null, 0, j7, null, null, 0, 16646141);
                        gapComposer.updateRememberedValue(m994copyp1EtxEg$default);
                    } else {
                        metric = metric2;
                        str = str3;
                        mutableState = mutableState2;
                        density = density2;
                        m994copyp1EtxEg$default = rememberedValue2;
                        c = ' ';
                        textMeasurer = textMeasurer2;
                    }
                    TextStyle textStyle6 = (TextStyle) m994copyp1EtxEg$default;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Bottom, gapComposer, 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    boolean changed3 = gapComposer.changed(((AnimatedAmountTextView.Amount) mutableState.getValue()).text) | gapComposer.changed(textStyle6) | gapComposer.changed(textMeasurer);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        textStyle2 = textStyle6;
                        rememberedValue3 = Integer.valueOf((int) (TextMeasurer.m979measurewNUYSr0$default(textMeasurer, ((AnimatedAmountTextView.Amount) mutableState.getValue()).text, textStyle6, 1, 0L, 1004).size >> c));
                        gapComposer.updateRememberedValue(rememberedValue3);
                    } else {
                        textStyle2 = textStyle6;
                    }
                    State m155animateDpAsStateAjpBEmI = AnimateAsStateKt.m155animateDpAsStateAjpBEmI(density.mo233toDpu2uoSUM(((Number) rememberedValue3).intValue()), AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), "SlottedMetricAmountWidth", null, gapComposer, 432, 8);
                    String str7 = metric.amountPrefix;
                    if (str7 == null) {
                        gapComposer.startReplaceGroup(499452562);
                        gapComposer.end(false);
                        textStyle3 = textStyle2;
                    } else {
                        gapComposer.startReplaceGroup(499452563);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle2, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                        textStyle3 = textStyle2;
                        gapComposer.end(false);
                    }
                    Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(companion, ((Dp) m155animateDpAsStateAjpBEmI.getValue()).value);
                    AnimatedAmountTextView.Amount amount2 = (AnimatedAmountTextView.Amount) mutableState.getValue();
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    TextStyle textStyle7 = textStyle3;
                    VisibleKt.m3482AnimatedAmountTextJDMA8c0(m290width3ABfNKs, textStyle7, colors2.semantic.text.standard, 0, amount2, new AnimatedAmountTextView.AnimationSpeed(10), false, textStyle3.spanStyle.fontSize, gapComposer, 1572864, 8);
                    if (str == null) {
                        gapComposer.startReplaceGroup(500039826);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(500039827);
                        Colors colors3 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle7, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = (CollapsingToolbarScaffoldState) obj9;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj8;
                NavigationType navigationType = (NavigationType) obj7;
                Function0 function0 = (Function0) obj6;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj5;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj4;
                CollapsingToolbarScopeInstance collapsingToolbarScopeInstance = (CollapsingToolbarScopeInstance) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                collapsingToolbarScopeInstance.getClass();
                if ((intValue2 & 6) == 0) {
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    intValue2 |= (intValue2 & 8) == 0 ? gapComposer2.changed(collapsingToolbarScopeInstance) : gapComposer2.changedInstance(collapsingToolbarScopeInstance) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    CollapsingToolbarState collapsingToolbarState = collapsingToolbarScaffoldState.toolbarState;
                    float intValue3 = collapsingToolbarState.minHeightState$delegate.getIntValue();
                    float intValue4 = collapsingToolbarState.maxHeightState$delegate.getIntValue();
                    float intValue5 = collapsingToolbarState.height$delegate.getIntValue();
                    float f = intValue3 * 3.0f;
                    boolean z = intValue4 >= f;
                    float f2 = z ? intValue3 * 2.0f : (intValue4 * 2.0f) / 3.0f;
                    if (!z) {
                        f = intValue4;
                    }
                    float f3 = RecyclerView.DECELERATION_RATE;
                    float coerceIn = RangesKt___RangesKt.coerceIn((intValue5 - f2) / (f - f2), RecyclerView.DECELERATION_RATE, 1.0f);
                    if (intValue3 > RecyclerView.DECELERATION_RATE) {
                        float f4 = z ? intValue3 * 2.0f : (intValue4 * 2.0f) / 3.0f;
                        f3 = RangesKt___RangesKt.coerceIn((intValue5 - f4) / (intValue3 - f4), RecyclerView.DECELERATION_RATE, 1.0f);
                    }
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(CollapsingToolbarScopeInstance.road(AlphaKt.alpha(ImageKt.m177backgroundbw27NRU(companion, j3, rectangleShapeKt$RectangleShape$1), coerceIn)), RecyclerView.DECELERATION_RATE, 56.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer3, true);
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(companion, 56.0f), j3, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-527875364, new OffersFormattedDetailKt$$ExternalSyntheticLambda7(f3, composableLambdaImpl3, 1), gapComposer3);
                    boolean changed4 = gapComposer3.changed(function0);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ComposeDialogKt$$ExternalSyntheticLambda10(12, function0);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, composableLambdaImpl2, gapComposer3, 6, 44);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SlottedMetricKt$$ExternalSyntheticLambda3(SlotContent.Metric metric, AnimatedAmountTextView.Amount amount, TextStyle textStyle, long j, TextMeasurer textMeasurer, Density density, MutableState mutableState) {
        this.f$0 = metric;
        this.f$1 = amount;
        this.f$2 = textStyle;
        this.f$3 = j;
        this.f$4 = textMeasurer;
        this.f$5 = density;
        this.f$6 = mutableState;
    }
}
