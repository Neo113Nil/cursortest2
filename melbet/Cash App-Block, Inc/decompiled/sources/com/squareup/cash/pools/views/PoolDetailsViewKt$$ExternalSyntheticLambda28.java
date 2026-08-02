package com.squareup.cash.pools.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolDetailsViewKt$$ExternalSyntheticLambda28 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;

    public /* synthetic */ PoolDetailsViewKt$$ExternalSyntheticLambda28(float f, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        float f = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, f));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                AndroidPath androidPath = (AndroidPath) obj;
                androidPath.getClass();
                ((LayoutDirection) obj3).getClass();
                double intBitsToFloat = (Float.intBitsToFloat((int) (r1.packedValue >> 32)) / Math.sin(Math.toRadians(70.0d))) * Math.sin(Math.toRadians(20.0d));
                AndroidPath Path = AndroidPath_androidKt.Path();
                long j = ((Size) obj2).packedValue;
                int i2 = (int) (BodyPartID.bodyIdMax & j);
                Path.moveTo(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat(i2) * f);
                int i3 = (int) (j >> 32);
                Path.lineTo(Float.intBitsToFloat(i3), (Float.intBitsToFloat(i2) * f) - ((float) intBitsToFloat));
                Path.lineTo(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2));
                Path.lineTo(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat(i2));
                Path.close();
                ColorKt.addOutline(androidPath, new Outline$Generic(Path));
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 0.6f), f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j2 = colors.semantic.background.subtle;
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj4 = DefaultSizes.border.entries;
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, j2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), f);
                    Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    long j3 = colors2.semantic.background.subtle;
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj5 = DefaultSizes.border.entries;
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs2, j3, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, f, ((Density) gapComposer4.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Room.getSp(12)));
                    Colors colors3 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    long j4 = colors3.semantic.background.subtle;
                    ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj6 = DefaultSizes.border.entries;
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN4, j4, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f)), gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(((Constraints) obj3).value);
                int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(f);
                int i4 = mo833measureBRTryo0.height - mo230roundToPx0680j_4;
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, i4 >= 0 ? i4 : 0, new ProgressIndicatorKt$$ExternalSyntheticLambda4(mo833measureBRTryo0, mo230roundToPx0680j_4, 10));
            default:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors4 = (Colors) gapComposer5.consume(staticProvidableCompositionLocal);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    long j5 = colors4.semantic.background.brand;
                    Icons icons = Icons.Paychecks16;
                    Colors colors5 = (Colors) gapComposer5.consume(staticProvidableCompositionLocal);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j5, icons, colors5.semantic.icon.inverse, this.f$0, gapComposer5, 48, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
