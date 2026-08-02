package com.squareup.cash.common.ui;

import androidx.collection.ArrayMap;
import androidx.compose.foundation.layout.FillNode$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda4;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.internal.Perfs$$ExternalSyntheticLambda2;

/* loaded from: classes.dex */
public final /* synthetic */ class ColorModelsKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ColorModelsKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Color m;
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                Colors colors = (Colors) obj;
                ((Integer) obj3).getClass();
                colors.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(1007789761);
                Color forTheme = ThemablesKt.forTheme((ColorModel) obj4, gapComposer);
                if (forTheme != null) {
                    colors = DimensionKt.m1468withTint4WTKRHQ(colors, forTheme.value);
                }
                gapComposer.end(false);
                return colors;
            case 1:
                MeasureScope measureScope = (MeasureScope) obj;
                Placeable mo833measureBRTryo0 = ((Measurable) obj2).mo833measureBRTryo0(ConstraintsKt.m1031constrainN9IONVI(((Constraints) obj3).value, ConstraintsKt.Constraints(0, Integer.MAX_VALUE, measureScope.mo230roundToPx0680j_4(((Dp) ((TextLayoutState) obj4).minHeightForSingleLineField$delegate.getValue()).value), Integer.MAX_VALUE)));
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new FillNode$$ExternalSyntheticLambda0(mo833measureBRTryo0, 3));
            case 2:
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) obj4;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                TransformedTextFieldState transformedTextFieldState = textFieldDecoratorModifierNode.textFieldState;
                TextFieldCharSequence value$foundation = booleanValue ? transformedTextFieldState.textFieldState.getValue$foundation() : transformedTextFieldState.getVisualText();
                long j = value$foundation.selection;
                if (!textFieldDecoratorModifierNode.enabled || Math.min(intValue, intValue2) < 0 || Math.max(intValue, intValue2) > value$foundation.text.length()) {
                    r1 = false;
                } else {
                    int i3 = TextRange.$r8$clinit;
                    if (intValue != ((int) (j >> 32)) || intValue2 != ((int) (j & BodyPartID.bodyIdMax))) {
                        long TextRange = SizeKt.TextRange(intValue, intValue2);
                        if (booleanValue || intValue == intValue2) {
                            textFieldDecoratorModifierNode.textFieldSelectionState.setTextToolbarState(TextToolbarState.None);
                        } else {
                            textFieldDecoratorModifierNode.textFieldSelectionState.setTextToolbarState(TextToolbarState.Selection);
                        }
                        TransformedTextFieldState transformedTextFieldState2 = textFieldDecoratorModifierNode.textFieldState;
                        if (booleanValue) {
                            transformedTextFieldState2.m417selectUntransformedCharsIn5zctL8(TextRange);
                        } else {
                            transformedTextFieldState2.m416selectCharsIn5zctL8(TextRange);
                        }
                    }
                }
                return Boolean.valueOf(r1);
            case 3:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    composableLambdaImpl.invoke(adaptiveStackScope, gapComposer2, Integer.valueOf(intValue3 & 14));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                MeasureScope measureScope2 = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                measureScope2.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo02 = measurable.mo833measureBRTryo0(((Constraints) obj3).value);
                return measureScope2.layout(mo833measureBRTryo02.width, mo833measureBRTryo02.height, (ArrayMap) obj4, new FillNode$$ExternalSyntheticLambda0(mo833measureBRTryo02, 9));
            case 5:
                BlockersScreens blockersScreens = (BlockersScreens) obj4;
                Colors colors2 = (Colors) obj;
                ((Integer) obj3).getClass();
                colors2.getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj2);
                gapComposer3.startReplaceGroup(-558570389);
                com.squareup.protos.cash.ui.Color color = blockersScreens.getBlockersData().serverAccentColor;
                Color color2 = null;
                if (color == null) {
                    gapComposer3.startReplaceGroup(-1667073332);
                    gapComposer3.end(false);
                    m = null;
                } else {
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, 84770773, color, gapComposer3, false);
                }
                if (m == null) {
                    gapComposer3.startReplaceGroup(-1667018771);
                    ColorModel colorModel = blockersScreens.getBlockersData().accentColor;
                    if (colorModel == null) {
                        gapComposer3.startReplaceGroup(-1667018772);
                        gapComposer3.end(false);
                    } else {
                        color2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, 84772533, colorModel, gapComposer3, false);
                    }
                    gapComposer3.end(false);
                    m = color2;
                } else {
                    gapComposer3.startReplaceGroup(84769619);
                    gapComposer3.end(false);
                }
                if (m == null) {
                    ClientScenario clientScenario = blockersScreens.getBlockersData().clientScenario;
                    switch (clientScenario == null ? -1 : BlockersData.WhenMappings.$EnumSwitchMapping$0[clientScenario.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            gapComposer3.startReplaceGroup(-1666889842);
                            Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                            if (colors3 == null) {
                                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(false);
                            }
                            colors2 = DimensionKt.m1468withTint4WTKRHQ(colors2, colors3.semantic.icon.brand);
                            gapComposer3.end(false);
                            break;
                        default:
                            if (!blockersScreens.getBlockersData().isTaxesFlow()) {
                                gapComposer3.startReplaceGroup(84783217);
                                gapComposer3.end(false);
                                break;
                            } else {
                                gapComposer3.startReplaceGroup(-1666775669);
                                Colors colors4 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors4 == null) {
                                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                colors2 = DimensionKt.m1468withTint4WTKRHQ(colors2, colors4.semantic.service.taxes);
                                gapComposer3.end(false);
                                break;
                            }
                    }
                } else {
                    gapComposer3.startReplaceGroup(84774498);
                    gapComposer3.end(false);
                    colors2 = DimensionKt.m1468withTint4WTKRHQ(colors2, m.value);
                }
                gapComposer3.end(false);
                return colors2;
            case 6:
                MeasureScope measureScope3 = (MeasureScope) obj;
                Measurable measurable2 = (Measurable) obj2;
                Constraints constraints = (Constraints) obj3;
                measureScope3.getClass();
                measurable2.getClass();
                ((ParcelableSnapshotMutableIntState) obj4).setIntValue(Constraints.m1024getMaxHeightimpl(constraints.value));
                Placeable mo833measureBRTryo03 = measurable2.mo833measureBRTryo0(constraints.value);
                return MeasureScope.layout$default(measureScope3, mo833measureBRTryo03.width, mo833measureBRTryo03.height, new FillNode$$ExternalSyntheticLambda0(mo833measureBRTryo03, 10));
            case 7:
                ((Perfs$$ExternalSyntheticLambda2) obj4).invoke((Throwable) obj);
                return Unit.INSTANCE;
            case 8:
                return new BufferedChannel$$ExternalSyntheticLambda4(i2, obj3, (BufferedChannel) obj4, (SelectInstance) obj);
            default:
                ((SemaphoreAndMutexImpl) obj4).release();
                return Unit.INSTANCE;
        }
    }
}
