package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.charting.components.BarChart$Configuration;
import com.squareup.cash.charting.components.BarChart$Direction;
import com.squareup.cash.charting.components.BarChartKt;
import com.squareup.cash.charting.components.ShadowDimensions;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatRange;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ TextFieldKt$$ExternalSyntheticLambda0(float f, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
        this.f$1 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x027e  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        boolean z;
        char c;
        long floatToRawIntBits3;
        long floatToRawIntBits4;
        int floatToRawIntBits5;
        float f;
        ShadowDimensions shadowDimensions;
        long j;
        long j2;
        Animatable animatable;
        int i = this.$r8$classId;
        float f2 = RecyclerView.DECELERATION_RATE;
        Object obj2 = this.f$1;
        float f3 = this.f$0;
        switch (i) {
            case 0:
                BorderStroke borderStroke = (BorderStroke) obj2;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.drawContent();
                CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
                if (Dp.m1037equalsimpl0(f3, RecyclerView.DECELERATION_RATE)) {
                    break;
                } else {
                    float density = canvasDrawScope.getDensity() * f3;
                    float intBitsToFloat = Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - (density / 2.0f);
                    DrawScope.m741drawLine1RTmtNc$default(layoutNodeDrawScope, borderStroke.brush, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax), density, RecyclerView.DECELERATION_RATE, 496);
                    break;
                }
            case 1:
                MutableState mutableState = (MutableState) obj2;
                Size size = (Size) obj;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (size.packedValue >> 32)) * f3;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (size.packedValue & BodyPartID.bodyIdMax)) * f3;
                if (Float.intBitsToFloat((int) (((Size) mutableState.getValue()).packedValue >> 32)) != intBitsToFloat2 || Float.intBitsToFloat((int) (((Size) mutableState.getValue()).packedValue & BodyPartID.bodyIdMax)) != intBitsToFloat3) {
                    mutableState.setValue(new Size((Float.floatToRawIntBits(intBitsToFloat3) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat2) << 32)));
                }
                break;
            case 2:
                androidx.compose.foundation.gestures.DraggableAnchorsConfig draggableAnchorsConfig = (androidx.compose.foundation.gestures.DraggableAnchorsConfig) obj;
                draggableAnchorsConfig.getClass();
                int size2 = ((RealSegmentedControlScope) obj2).segments.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    draggableAnchorsConfig.at(Integer.valueOf(i2), i2 * f3);
                }
                break;
            case 3:
                BarChart$Configuration barChart$Configuration = (BarChart$Configuration) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                long mo753getSizeNHjbRc = drawScope.mo753getSizeNHjbRc();
                AndroidPath Path = AndroidPath_androidKt.Path();
                Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw((Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), drawScope.mo753getSizeNHjbRc());
                float f4 = barChart$Configuration.topStartCornerRadius;
                float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(f4);
                long floatToRawIntBits6 = (Float.floatToRawIntBits(mo236toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo236toPx0680j_4) & BodyPartID.bodyIdMax);
                float f5 = barChart$Configuration.topEndCornerRadius;
                float mo236toPx0680j_42 = drawScope.mo236toPx0680j_4(f5);
                long floatToRawIntBits7 = (Float.floatToRawIntBits(mo236toPx0680j_42) << 32) | (Float.floatToRawIntBits(mo236toPx0680j_42) & BodyPartID.bodyIdMax);
                float f6 = barChart$Configuration.bottomEndCornerRadius;
                float mo236toPx0680j_43 = drawScope.mo236toPx0680j_4(f6);
                long floatToRawIntBits8 = (Float.floatToRawIntBits(mo236toPx0680j_43) << 32) | (Float.floatToRawIntBits(mo236toPx0680j_43) & BodyPartID.bodyIdMax);
                float f7 = barChart$Configuration.bottomStartCornerRadius;
                float mo236toPx0680j_44 = drawScope.mo236toPx0680j_4(f7);
                AndroidPath.addRoundRect$default(Path, Strings.m3986RoundRectZAM2FJo(m1180Recttz77jQw, floatToRawIntBits6, floatToRawIntBits7, floatToRawIntBits8, (Float.floatToRawIntBits(mo236toPx0680j_44) << 32) | (Float.floatToRawIntBits(mo236toPx0680j_44) & BodyPartID.bodyIdMax)));
                DrawScope.m745drawPathLG529CI$default(drawScope, Path, barChart$Configuration.backgroundColor, RecyclerView.DECELERATION_RATE, null, 60);
                float intBitsToFloat4 = Float.intBitsToFloat((int) (mo753getSizeNHjbRc >> 32));
                boolean z2 = barChart$Configuration.reverseDirection;
                BarChart$Direction barChart$Direction = barChart$Configuration.direction;
                if (z2) {
                    if (barChart$Direction == BarChart$Direction.VERTICAL) {
                        floatToRawIntBits = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
                        floatToRawIntBits2 = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
                    } else {
                        floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat4);
                        floatToRawIntBits2 = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
                    }
                } else if (barChart$Direction == BarChart$Direction.VERTICAL) {
                    float intBitsToFloat5 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - (Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * f3);
                    floatToRawIntBits = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
                    floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat5);
                } else {
                    floatToRawIntBits = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
                    floatToRawIntBits2 = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
                }
                long j3 = (floatToRawIntBits << 32) | (floatToRawIntBits2 & BodyPartID.bodyIdMax);
                if (!z2) {
                    z = z2;
                    c = ' ';
                    if (barChart$Direction == BarChart$Direction.VERTICAL) {
                        float intBitsToFloat6 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
                        float intBitsToFloat7 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * f3;
                        floatToRawIntBits4 = Float.floatToRawIntBits(intBitsToFloat6);
                        floatToRawIntBits5 = Float.floatToRawIntBits(intBitsToFloat7);
                    } else {
                        floatToRawIntBits3 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) * f3) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
                        Rect m1180Recttz77jQw2 = DBUtil.m1180Recttz77jQw(j3, floatToRawIntBits3);
                        float mo236toPx0680j_45 = drawScope.mo236toPx0680j_4(f4);
                        long floatToRawIntBits9 = (Float.floatToRawIntBits(mo236toPx0680j_45) << c) | (Float.floatToRawIntBits(mo236toPx0680j_45) & BodyPartID.bodyIdMax);
                        float mo236toPx0680j_46 = drawScope.mo236toPx0680j_4(f5);
                        long floatToRawIntBits10 = (Float.floatToRawIntBits(mo236toPx0680j_46) << c) | (Float.floatToRawIntBits(mo236toPx0680j_46) & BodyPartID.bodyIdMax);
                        float mo236toPx0680j_47 = drawScope.mo236toPx0680j_4(f6);
                        long floatToRawIntBits11 = (Float.floatToRawIntBits(mo236toPx0680j_47) << c) | (Float.floatToRawIntBits(mo236toPx0680j_47) & BodyPartID.bodyIdMax);
                        float mo236toPx0680j_48 = drawScope.mo236toPx0680j_4(f7);
                        RoundRect m3986RoundRectZAM2FJo = Strings.m3986RoundRectZAM2FJo(m1180Recttz77jQw2, floatToRawIntBits9, floatToRawIntBits10, floatToRawIntBits11, (Float.floatToRawIntBits(mo236toPx0680j_48) << c) | (Float.floatToRawIntBits(mo236toPx0680j_48) & BodyPartID.bodyIdMax));
                        f = barChart$Configuration.shadowSize;
                        if (Dp.m1036compareTo0680j_4(f, RecyclerView.DECELERATION_RATE) > 0) {
                        }
                        AndroidPath Path2 = AndroidPath_androidKt.Path();
                        AndroidPath.addRoundRect$default(Path2, m3986RoundRectZAM2FJo);
                        DrawScope.m745drawPathLG529CI$default(drawScope, Path2, barChart$Configuration.barColor, RecyclerView.DECELERATION_RATE, null, 60);
                    }
                } else if (barChart$Direction != BarChart$Direction.VERTICAL) {
                    z = z2;
                    c = ' ';
                    float f8 = -(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) * f3);
                    float intBitsToFloat8 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                    long floatToRawIntBits12 = Float.floatToRawIntBits(f8);
                    j2 = Float.floatToRawIntBits(intBitsToFloat8);
                    j = floatToRawIntBits12 << 32;
                    floatToRawIntBits3 = (j2 & BodyPartID.bodyIdMax) | j;
                    Rect m1180Recttz77jQw22 = DBUtil.m1180Recttz77jQw(j3, floatToRawIntBits3);
                    float mo236toPx0680j_452 = drawScope.mo236toPx0680j_4(f4);
                    long floatToRawIntBits92 = (Float.floatToRawIntBits(mo236toPx0680j_452) << c) | (Float.floatToRawIntBits(mo236toPx0680j_452) & BodyPartID.bodyIdMax);
                    float mo236toPx0680j_462 = drawScope.mo236toPx0680j_4(f5);
                    long floatToRawIntBits102 = (Float.floatToRawIntBits(mo236toPx0680j_462) << c) | (Float.floatToRawIntBits(mo236toPx0680j_462) & BodyPartID.bodyIdMax);
                    float mo236toPx0680j_472 = drawScope.mo236toPx0680j_4(f6);
                    long floatToRawIntBits112 = (Float.floatToRawIntBits(mo236toPx0680j_472) << c) | (Float.floatToRawIntBits(mo236toPx0680j_472) & BodyPartID.bodyIdMax);
                    float mo236toPx0680j_482 = drawScope.mo236toPx0680j_4(f7);
                    RoundRect m3986RoundRectZAM2FJo2 = Strings.m3986RoundRectZAM2FJo(m1180Recttz77jQw22, floatToRawIntBits92, floatToRawIntBits102, floatToRawIntBits112, (Float.floatToRawIntBits(mo236toPx0680j_482) << c) | (Float.floatToRawIntBits(mo236toPx0680j_482) & BodyPartID.bodyIdMax));
                    f = barChart$Configuration.shadowSize;
                    if (Dp.m1036compareTo0680j_4(f, RecyclerView.DECELERATION_RATE) > 0) {
                        float f9 = f * 2.0f;
                        if (BarChartKt.WhenMappings.$EnumSwitchMapping$0[barChart$Direction.ordinal()] == 1) {
                            float f10 = z ? 90.0f : -90.0f;
                            float f11 = m3986RoundRectZAM2FJo2.right;
                            if (!z) {
                                f11 -= Float.intBitsToFloat((int) (floatToRawIntBits3 & BodyPartID.bodyIdMax));
                            }
                            long floatToRawIntBits13 = (Float.floatToRawIntBits(f11) << c) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
                            int i3 = (int) (floatToRawIntBits3 & BodyPartID.bodyIdMax);
                            shadowDimensions = new ShadowDimensions(f10, floatToRawIntBits13, (Float.floatToRawIntBits(Float.intBitsToFloat(i3)) << c) | (Float.floatToRawIntBits(Float.intBitsToFloat(i3)) & BodyPartID.bodyIdMax));
                        } else {
                            int i4 = (int) (floatToRawIntBits3 >> c);
                            shadowDimensions = new ShadowDimensions(z ? RecyclerView.DECELERATION_RATE : -180.0f, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << c) | (Float.floatToRawIntBits(z ? m3986RoundRectZAM2FJo2.bottom - Float.intBitsToFloat((int) (floatToRawIntBits3 >> c)) : m3986RoundRectZAM2FJo2.top) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.intBitsToFloat(i4)) << c) | (Float.floatToRawIntBits(Float.intBitsToFloat(i4)) & BodyPartID.bodyIdMax));
                        }
                        DrawScope.m737drawArcyD3GUKo$default(drawScope, barChart$Configuration.shadowColor, shadowDimensions.startAngle, 180.0f, shadowDimensions.offset, shadowDimensions.size, RecyclerView.DECELERATION_RATE, new Stroke(drawScope.mo236toPx0680j_4(f9), RecyclerView.DECELERATION_RATE, 0, 0, null, 30), 832);
                    }
                    AndroidPath Path22 = AndroidPath_androidKt.Path();
                    AndroidPath.addRoundRect$default(Path22, m3986RoundRectZAM2FJo2);
                    DrawScope.m745drawPathLG529CI$default(drawScope, Path22, barChart$Configuration.barColor, RecyclerView.DECELERATION_RATE, null, 60);
                    break;
                } else {
                    float intBitsToFloat9 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
                    float intBitsToFloat10 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * f3;
                    floatToRawIntBits4 = Float.floatToRawIntBits(intBitsToFloat9);
                    floatToRawIntBits5 = Float.floatToRawIntBits(intBitsToFloat10);
                    c = ' ';
                    z = z2;
                }
                j2 = floatToRawIntBits5;
                j = floatToRawIntBits4 << c;
                floatToRawIntBits3 = (j2 & BodyPartID.bodyIdMax) | j;
                Rect m1180Recttz77jQw222 = DBUtil.m1180Recttz77jQw(j3, floatToRawIntBits3);
                float mo236toPx0680j_4522 = drawScope.mo236toPx0680j_4(f4);
                long floatToRawIntBits922 = (Float.floatToRawIntBits(mo236toPx0680j_4522) << c) | (Float.floatToRawIntBits(mo236toPx0680j_4522) & BodyPartID.bodyIdMax);
                float mo236toPx0680j_4622 = drawScope.mo236toPx0680j_4(f5);
                long floatToRawIntBits1022 = (Float.floatToRawIntBits(mo236toPx0680j_4622) << c) | (Float.floatToRawIntBits(mo236toPx0680j_4622) & BodyPartID.bodyIdMax);
                float mo236toPx0680j_4722 = drawScope.mo236toPx0680j_4(f6);
                long floatToRawIntBits1122 = (Float.floatToRawIntBits(mo236toPx0680j_4722) << c) | (Float.floatToRawIntBits(mo236toPx0680j_4722) & BodyPartID.bodyIdMax);
                float mo236toPx0680j_4822 = drawScope.mo236toPx0680j_4(f7);
                RoundRect m3986RoundRectZAM2FJo22 = Strings.m3986RoundRectZAM2FJo(m1180Recttz77jQw222, floatToRawIntBits922, floatToRawIntBits1022, floatToRawIntBits1122, (Float.floatToRawIntBits(mo236toPx0680j_4822) << c) | (Float.floatToRawIntBits(mo236toPx0680j_4822) & BodyPartID.bodyIdMax));
                f = barChart$Configuration.shadowSize;
                if (Dp.m1036compareTo0680j_4(f, RecyclerView.DECELERATION_RATE) > 0) {
                }
                AndroidPath Path222 = AndroidPath_androidKt.Path();
                AndroidPath.addRoundRect$default(Path222, m3986RoundRectZAM2FJo22);
                DrawScope.m745drawPathLG529CI$default(drawScope, Path222, barChart$Configuration.barColor, RecyclerView.DECELERATION_RATE, null, 60);
            case 4:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, (String) obj2);
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(f3, new ClosedFloatRange(RecyclerView.DECELERATION_RATE, 1.0f), 0));
                break;
            case 5:
                CardRegistry cardRegistry = (CardRegistry) obj2;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                if (cardRegistry != null && (animatable = (Animatable) cardRegistry.cardNuxAnimation$delegate.getValue()) != null) {
                    f2 = ((Number) animatable.getValue()).floatValue();
                }
                reusableGraphicsLayerScope.setTranslationY(f3 * f2);
                break;
            default:
                MutableFloatState mutableFloatState = (MutableFloatState) obj2;
                float floatValue = ((Float) obj).floatValue();
                if (f3 > RecyclerView.DECELERATION_RATE) {
                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
                    ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue((floatValue / f3) + parcelableSnapshotMutableFloatState.getFloatValue());
                    if (parcelableSnapshotMutableFloatState.getFloatValue() < RecyclerView.DECELERATION_RATE) {
                        ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(RecyclerView.DECELERATION_RATE);
                    }
                    if (parcelableSnapshotMutableFloatState.getFloatValue() > 1.0f) {
                        ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(1.0f);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextFieldKt$$ExternalSyntheticLambda0(Object obj, float f, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = f;
    }
}
