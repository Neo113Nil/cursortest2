package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\u00020\u001c*\u00020\u001d2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00152\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\"\u0010 \u001a\u00020\u001c*\u00020\u001d2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00152\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\"\u0010!\u001a\u00020\u001c*\u00020\u001d2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00152\u0006\u0010\"\u001a\u00020\u001cH\u0016J\"\u0010#\u001a\u00020\u001c*\u00020\u001d2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00152\u0006\u0010\"\u001a\u00020\u001cH\u0016J8\u0010$\u001a\u00020\u001c2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00152\u0006\u0010\"\u001a\u00020\u001c2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0&H\u0002J<\u0010'\u001a\u00020\u001c*\u00020\u001d2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00152\u0006\u0010\u001f\u001a\u00020\u001c2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0&H\u0002JO\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¢\u0006\u0004\b0\u00101Jk\u00102\u001a\u00020\u001c*\u0002032\u0006\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?J°\u0001\u0010@\u001a\u00020A*\u00020B2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010E2\b\u0010H\u001a\u0004\u0018\u00010E2\b\u0010I\u001a\u0004\u0018\u00010E2\b\u0010J\u001a\u0004\u0018\u00010E2\b\u0010K\u001a\u0004\u0018\u00010E2\u0006\u0010L\u001a\u00020E2\b\u0010M\u001a\u0004\u0018\u00010E2\u0006\u0010N\u001a\u00020\u001c2\u0006\u0010O\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020=2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020RH\u0002J\u0080\u0001\u0010S\u001a\u00020A*\u00020B2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010E2\b\u0010H\u001a\u0004\u0018\u00010E2\b\u0010I\u001a\u0004\u0018\u00010E2\b\u0010J\u001a\u0004\u0018\u00010E2\b\u0010K\u001a\u0004\u0018\u00010E2\u0006\u0010L\u001a\u00020E2\b\u0010M\u001a\u0004\u0018\u00010E2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010U\u001a\u00020=H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006V"}, d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "labelPosition", "Landroidx/compose/material3/TextFieldLabelPosition;", "labelProgress", "Landroidx/compose/material3/internal/FloatProducer;", "placeholderAlpha", "affixAlpha", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "minimizedLabelHalfHeight", "Landroidx/compose/ui/unit/Dp;", "<init>", "(ZLandroidx/compose/material3/TextFieldLabelPosition;Landroidx/compose/material3/internal/FloatProducer;Landroidx/compose/material3/internal/FloatProducer;Landroidx/compose/material3/internal/FloatProducer;Landroidx/compose/foundation/layout/PaddingValues;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "height", "minIntrinsicWidth", "intrinsicWidth", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "calculateWidth", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-yeHjK3Y", "(IIIIIIIJ)I", "calculateHeight", "Landroidx/compose/ui/unit/Density;", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "isLabelAbove", "", "calculateHeight-mKXJcVc", "(Landroidx/compose/ui/unit/Density;IIIIIIIIJZF)I", "placeWithLabel", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelStartY", "labelEndY", "textPosition", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "placeWithoutLabel", "textPlaceable", "density", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final FloatProducer affixAlpha;
    private final TextFieldLabelPosition labelPosition;
    private final FloatProducer labelProgress;
    private final float minimizedLabelHalfHeight;
    private final PaddingValues paddingValues;
    private final FloatProducer placeholderAlpha;
    private final boolean singleLine;

    public /* synthetic */ TextFieldMeasurePolicy(boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, FloatProducer floatProducer2, FloatProducer floatProducer3, PaddingValues paddingValues, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, textFieldLabelPosition, floatProducer, floatProducer2, floatProducer3, paddingValues, f);
    }

    private TextFieldMeasurePolicy(boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, FloatProducer floatProducer2, FloatProducer floatProducer3, PaddingValues paddingValues, float f) {
        this.singleLine = z;
        this.labelPosition = textFieldLabelPosition;
        this.labelProgress = floatProducer;
        this.placeholderAlpha = floatProducer2;
        this.affixAlpha = floatProducer3;
        this.paddingValues = paddingValues;
        this.minimizedLabelHalfHeight = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo81measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Measurable measurable;
        Measurable measurable2;
        long j2;
        Placeable placeable;
        Measurable measurable3;
        Measurable measurable4;
        long j3;
        Placeable placeable2;
        Measurable measurable5;
        int minIntrinsicHeight;
        Measurable measurable6;
        Measurable measurable7;
        final float invoke = this.labelProgress.invoke();
        final int i = measureScope.mo522roundToPx0680j_4(this.paddingValues.getTop());
        int i2 = measureScope.mo522roundToPx0680j_4(this.paddingValues.getBottom());
        long m9665copyZbe2FdA$default = Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i3);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i3++;
        }
        Measurable measurable8 = measurable;
        Placeable mo8285measureBRTryo0 = measurable8 != null ? measurable8.mo8285measureBRTryo0(m9665copyZbe2FdA$default) : null;
        int widthOrZero = LayoutUtilKt.getWidthOrZero(mo8285measureBRTryo0);
        int max = Math.max(0, LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo0));
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i4);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i4++;
        }
        Measurable measurable9 = measurable2;
        if (measurable9 != null) {
            j2 = m9665copyZbe2FdA$default;
            placeable = measurable9.mo8285measureBRTryo0(ConstraintsKt.m9695offsetNN6EwU$default(j2, -widthOrZero, 0, 2, null));
        } else {
            j2 = m9665copyZbe2FdA$default;
            placeable = null;
        }
        int widthOrZero2 = widthOrZero + LayoutUtilKt.getWidthOrZero(placeable);
        int max2 = Math.max(max, LayoutUtilKt.getHeightOrZero(placeable));
        int size3 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list.get(i5);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i5++;
        }
        Measurable measurable10 = measurable3;
        Placeable mo8285measureBRTryo02 = measurable10 != null ? measurable10.mo8285measureBRTryo0(ConstraintsKt.m9695offsetNN6EwU$default(j2, -widthOrZero2, 0, 2, null)) : null;
        int widthOrZero3 = widthOrZero2 + LayoutUtilKt.getWidthOrZero(mo8285measureBRTryo02);
        int max3 = Math.max(max2, LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo02));
        int size4 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                measurable4 = null;
                break;
            }
            measurable4 = list.get(i6);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i6++;
        }
        Measurable measurable11 = measurable4;
        if (measurable11 != null) {
            j3 = j2;
            placeable2 = measurable11.mo8285measureBRTryo0(ConstraintsKt.m9695offsetNN6EwU$default(j2, -widthOrZero3, 0, 2, null));
        } else {
            j3 = j2;
            placeable2 = null;
        }
        int widthOrZero4 = widthOrZero3 + LayoutUtilKt.getWidthOrZero(placeable2);
        int max4 = Math.max(max3, LayoutUtilKt.getHeightOrZero(placeable2));
        boolean z = this.labelPosition instanceof TextFieldLabelPosition.Above;
        int size5 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                measurable5 = null;
                break;
            }
            measurable5 = list.get(i7);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), TextFieldImplKt.LabelId)) {
                break;
            }
            i7++;
        }
        Measurable measurable12 = measurable5;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (!z) {
            objectRef.element = measurable12 != null ? measurable12.mo8285measureBRTryo0(ConstraintsKt.m9694offsetNN6EwU(j3, -widthOrZero4, -i2)) : 0;
            minIntrinsicHeight = 0;
        } else {
            minIntrinsicHeight = measurable12 != null ? measurable12.minIntrinsicHeight(Constraints.m9677getMinWidthimpl(j)) : 0;
        }
        int size6 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size6) {
                measurable6 = null;
                break;
            }
            measurable6 = list.get(i8);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), TextFieldImplKt.SupportingId)) {
                break;
            }
            i8++;
        }
        Measurable measurable13 = measurable6;
        int minIntrinsicHeight2 = measurable13 != null ? measurable13.minIntrinsicHeight(Constraints.m9677getMinWidthimpl(j)) : 0;
        int heightOrZero = i + LayoutUtilKt.getHeightOrZero((Placeable) objectRef.element) + minIntrinsicHeight;
        long m9694offsetNN6EwU = ConstraintsKt.m9694offsetNN6EwU(Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), -widthOrZero4, ((-heightOrZero) - i2) - minIntrinsicHeight2);
        int size7 = list2.size();
        int i9 = 0;
        while (i9 < size7) {
            Measurable measurable14 = list.get(i9);
            int i10 = size7;
            int i11 = heightOrZero;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable14), TextFieldImplKt.TextFieldId)) {
                final Placeable mo8285measureBRTryo03 = measurable14.mo8285measureBRTryo0(m9694offsetNN6EwU);
                long m9665copyZbe2FdA$default2 = Constraints.m9665copyZbe2FdA$default(m9694offsetNN6EwU, 0, 0, 0, 0, 14, null);
                int size8 = list2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        measurable7 = null;
                        break;
                    }
                    measurable7 = list.get(i12);
                    int i13 = size8;
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable7), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i12++;
                    size8 = i13;
                }
                Measurable measurable15 = measurable7;
                Placeable mo8285measureBRTryo04 = measurable15 != null ? measurable15.mo8285measureBRTryo0(m9665copyZbe2FdA$default2) : null;
                int max5 = Math.max(max4, Math.max(LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo03), LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo04)) + i11 + i2);
                long j4 = j3;
                final Ref.ObjectRef objectRef2 = objectRef;
                boolean z2 = z;
                final int m4284calculateWidthyeHjK3Y = m4284calculateWidthyeHjK3Y(LayoutUtilKt.getWidthOrZero(mo8285measureBRTryo0), LayoutUtilKt.getWidthOrZero(placeable), LayoutUtilKt.getWidthOrZero(mo8285measureBRTryo02), LayoutUtilKt.getWidthOrZero(placeable2), mo8285measureBRTryo03.getWidth(), LayoutUtilKt.getWidthOrZero((Placeable) objectRef.element), LayoutUtilKt.getWidthOrZero(mo8285measureBRTryo04), j);
                if (z2) {
                    objectRef2.element = measurable12 != null ? measurable12.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(j4, 0, m4284calculateWidthyeHjK3Y, 0, minIntrinsicHeight, 5, null)) : 0;
                }
                Placeable mo8285measureBRTryo05 = measurable13 != null ? measurable13.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(ConstraintsKt.m9695offsetNN6EwU$default(j4, 0, -max5, 1, null), 0, m4284calculateWidthyeHjK3Y, 0, 0, 9, null)) : null;
                int heightOrZero2 = LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo05);
                boolean z3 = z2;
                int m4283calculateHeightmKXJcVc = m4283calculateHeightmKXJcVc(measureScope, mo8285measureBRTryo03.getHeight(), LayoutUtilKt.getHeightOrZero((Placeable) objectRef2.element), LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo0), LayoutUtilKt.getHeightOrZero(placeable), LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo02), LayoutUtilKt.getHeightOrZero(placeable2), LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo04), LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo05), j, z3, invoke);
                final int heightOrZero3 = (m4283calculateHeightmKXJcVc - heightOrZero2) - (z3 ? LayoutUtilKt.getHeightOrZero((Placeable) objectRef2.element) : 0);
                int size9 = list2.size();
                int i14 = 0;
                while (i14 < size9) {
                    Measurable measurable16 = list.get(i14);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable16), TextFieldImplKt.ContainerId)) {
                        final Placeable mo8285measureBRTryo06 = measurable16.mo8285measureBRTryo0(ConstraintsKt.Constraints(m4284calculateWidthyeHjK3Y != Integer.MAX_VALUE ? m4284calculateWidthyeHjK3Y : 0, m4284calculateWidthyeHjK3Y, heightOrZero3 != Integer.MAX_VALUE ? heightOrZero3 : 0, heightOrZero3));
                        final int i15 = m4283calculateHeightmKXJcVc;
                        final boolean z4 = z3;
                        final Placeable placeable3 = mo8285measureBRTryo0;
                        final Placeable placeable4 = placeable;
                        final Placeable placeable5 = mo8285measureBRTryo02;
                        final Placeable placeable6 = mo8285measureBRTryo05;
                        final Placeable placeable7 = mo8285measureBRTryo04;
                        final Placeable placeable8 = placeable2;
                        return MeasureScope.CC.layout$default(measureScope, m4284calculateWidthyeHjK3Y, i15, null, new Function1() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit measure_3p2s80s$lambda$9;
                                measure_3p2s80s$lambda$9 = TextFieldMeasurePolicy.measure_3p2s80s$lambda$9(Ref.ObjectRef.this, z4, this, heightOrZero3, i, m4284calculateWidthyeHjK3Y, i15, mo8285measureBRTryo03, placeable7, placeable3, placeable4, placeable5, placeable8, mo8285measureBRTryo06, placeable6, invoke, measureScope, (Placeable.PlacementScope) obj);
                                return measure_3p2s80s$lambda$9;
                            }
                        }, 4, null);
                    }
                    i14++;
                    m4283calculateHeightmKXJcVc = m4283calculateHeightmKXJcVc;
                    z3 = z3;
                    heightOrZero3 = heightOrZero3;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i9++;
            objectRef = objectRef;
            size7 = i10;
            heightOrZero = i11;
            m9694offsetNN6EwU = m9694offsetNN6EwU;
            z = z;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit measure_3p2s80s$lambda$9(Ref.ObjectRef objectRef, boolean z, TextFieldMeasurePolicy textFieldMeasurePolicy, int i, int i2, int i3, int i4, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, float f, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2;
        int mo522roundToPx0680j_4;
        int i5;
        if (objectRef.element != 0) {
            if (z) {
                placementScope2 = placementScope;
                i5 = 0;
            } else {
                if (textFieldMeasurePolicy.singleLine) {
                    mo522roundToPx0680j_4 = Alignment.INSTANCE.getCenterVertically().align(((Placeable) objectRef.element).getHeight(), i);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                    mo522roundToPx0680j_4 = i2 + placementScope2.mo522roundToPx0680j_4(textFieldMeasurePolicy.minimizedLabelHalfHeight);
                }
                i5 = mo522roundToPx0680j_4;
            }
            textFieldMeasurePolicy.placeWithLabel(placementScope2, i3, i4, placeable, (Placeable) objectRef.element, placeable2, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, i5, z ? 0 : i2, z, f, textFieldMeasurePolicy.placeholderAlpha, textFieldMeasurePolicy.affixAlpha, i2 + (z ? 0 : ((Placeable) objectRef.element).getHeight()), measureScope.getLayoutDirection());
        } else {
            textFieldMeasurePolicy.placeWithoutLabel(placementScope, i3, i4, placeable, placeable2, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, textFieldMeasurePolicy.placeholderAlpha, textFieldMeasurePolicy.affixAlpha, placementScope.getDensity());
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new Function2() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int maxIntrinsicHeight;
                maxIntrinsicHeight = ((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue());
                return Integer.valueOf(maxIntrinsicHeight);
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new Function2() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int minIntrinsicHeight;
                minIntrinsicHeight = ((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue());
                return Integer.valueOf(minIntrinsicHeight);
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new Function2() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int maxIntrinsicWidth;
                maxIntrinsicWidth = ((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue());
                return Integer.valueOf(maxIntrinsicWidth);
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new Function2() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int minIntrinsicWidth;
                minIntrinsicWidth = ((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue());
                return Integer.valueOf(minIntrinsicWidth);
            }
        });
    }

    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    private final int m4284calculateWidthyeHjK3Y(int leadingWidth, int trailingWidth, int prefixWidth, int suffixWidth, int textFieldWidth, int labelWidth, int placeholderWidth, long constraints) {
        int i = prefixWidth + suffixWidth;
        return ConstraintsKt.m9692constrainWidthK40F9xA(constraints, leadingWidth + Math.max(textFieldWidth + i, Math.max(placeholderWidth + i, labelWidth)) + trailingWidth);
    }

    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    private final int m4283calculateHeightmKXJcVc(Density density, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        int mo522roundToPx0680j_4 = density.mo522roundToPx0680j_4(Dp.m9732constructorimpl(this.paddingValues.getTop() + this.paddingValues.getBottom())) + ((i2 <= 0 || z) ? 0 : Math.max(density.mo522roundToPx0680j_4(Dp.m9732constructorimpl(this.minimizedLabelHalfHeight * 2)), MathHelpersKt.lerp(0, i2, MotionTokens.INSTANCE.getEasingEmphasizedAccelerateCubicBezier().transform(f)))) + ComparisonsKt.maxOf(i, i7, i5, i6, z ? 0 : MathHelpersKt.lerp(i2, 0, f));
        if (!z) {
            i2 = 0;
        }
        return ConstraintsKt.m9691constrainHeightK40F9xA(j, i2 + Math.max(i3, Math.max(i4, mo522roundToPx0680j_4)) + i8);
    }

    private final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, int i3, int i4, boolean z, float f, final FloatProducer floatProducer, final FloatProducer floatProducer2, int i5, LayoutDirection layoutDirection) {
        int height = z ? placeable2.getHeight() : 0;
        Placeable.PlacementScope.place$default(placementScope, placeable8, 0, height, 0.0f, 4, null);
        int heightOrZero = (i2 - LayoutUtilKt.getHeightOrZero(placeable9)) - (z ? placeable2.getHeight() : 0);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, height + Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        int lerp = MathHelpersKt.lerp(i3, i4, f);
        if (z) {
            Placeable.PlacementScope.place$default(placementScope, placeable2, TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable2.getWidth(), i, layoutDirection), lerp, 0.0f, 4, null);
        } else {
            int widthOrZero = layoutDirection == LayoutDirection.Ltr ? LayoutUtilKt.getWidthOrZero(placeable4) : LayoutUtilKt.getWidthOrZero(placeable5);
            Placeable.PlacementScope.place$default(placementScope, placeable2, MathHelpersKt.lerp(TextFieldImplKt.getExpandedAlignment(this.labelPosition).align(placeable2.getWidth(), (i - LayoutUtilKt.getWidthOrZero(placeable4)) - LayoutUtilKt.getWidthOrZero(placeable5), layoutDirection) + widthOrZero, TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable2.getWidth(), (i - LayoutUtilKt.getWidthOrZero(placeable4)) - LayoutUtilKt.getWidthOrZero(placeable5), layoutDirection) + widthOrZero, f), lerp, 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable6, LayoutUtilKt.getWidthOrZero(placeable4), height + i5, 0.0f, new Function1() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit placeWithLabel$lambda$0;
                    placeWithLabel$lambda$0 = TextFieldMeasurePolicy.placeWithLabel$lambda$0(FloatProducer.this, (GraphicsLayerScope) obj);
                    return placeWithLabel$lambda$0;
                }
            }, 4, (Object) null);
        }
        int widthOrZero2 = LayoutUtilKt.getWidthOrZero(placeable4) + LayoutUtilKt.getWidthOrZero(placeable6);
        int i6 = height + i5;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero2, i6, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable3, widthOrZero2, i6, 0.0f, new Function1() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit placeWithLabel$lambda$1;
                    placeWithLabel$lambda$1 = TextFieldMeasurePolicy.placeWithLabel$lambda$1(FloatProducer.this, (GraphicsLayerScope) obj);
                    return placeWithLabel$lambda$1;
                }
            }, 4, (Object) null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable7, (i - LayoutUtilKt.getWidthOrZero(placeable5)) - placeable7.getWidth(), i6, 0.0f, new Function1() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit placeWithLabel$lambda$2;
                    placeWithLabel$lambda$2 = TextFieldMeasurePolicy.placeWithLabel$lambda$2(FloatProducer.this, (GraphicsLayerScope) obj);
                    return placeWithLabel$lambda$2;
                }
            }, 4, (Object) null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), heightOrZero) + height, 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, height + heightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit placeWithLabel$lambda$0(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit placeWithLabel$lambda$1(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit placeWithLabel$lambda$2(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return Unit.INSTANCE;
    }

    private final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, final FloatProducer floatProducer, final FloatProducer floatProducer2, float f) {
        Placeable.PlacementScope.m8357place70tqf50$default(placementScope, placeable7, IntOffset.INSTANCE.m9875getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i2 - LayoutUtilKt.getHeightOrZero(placeable8);
        int roundToInt = MathKt.roundToInt(this.paddingValues.getTop() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable5, LayoutUtilKt.getWidthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, roundToInt, placeable5), 0.0f, new Function1() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit placeWithoutLabel$lambda$0;
                    placeWithoutLabel$lambda$0 = TextFieldMeasurePolicy.placeWithoutLabel$lambda$0(FloatProducer.this, (GraphicsLayerScope) obj);
                    return placeWithoutLabel$lambda$0;
                }
            }, 4, (Object) null);
        }
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeable5) + LayoutUtilKt.getWidthOrZero(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, roundToInt, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable2, widthOrZero, placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, roundToInt, placeable2), 0.0f, new Function1() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit placeWithoutLabel$lambda$1;
                    placeWithoutLabel$lambda$1 = TextFieldMeasurePolicy.placeWithoutLabel$lambda$1(FloatProducer.this, (GraphicsLayerScope) obj);
                    return placeWithoutLabel$lambda$1;
                }
            }, 4, (Object) null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable6, (i - LayoutUtilKt.getWidthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, roundToInt, placeable6), 0.0f, new Function1() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit placeWithoutLabel$lambda$2;
                    placeWithoutLabel$lambda$2 = TextFieldMeasurePolicy.placeWithoutLabel$lambda$2(FloatProducer.this, (GraphicsLayerScope) obj);
                    return placeWithoutLabel$lambda$2;
                }
            }, 4, (Object) null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(TextFieldMeasurePolicy textFieldMeasurePolicy, int i, int i2, Placeable placeable) {
        return textFieldMeasurePolicy.singleLine ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i) : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit placeWithoutLabel$lambda$0(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit placeWithoutLabel$lambda$1(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit placeWithoutLabel$lambda$2(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return Unit.INSTANCE;
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> measurables, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> intrinsicMeasurer) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        IntrinsicMeasurable intrinsicMeasurable5;
        IntrinsicMeasurable intrinsicMeasurable6;
        List<? extends IntrinsicMeasurable> list = measurables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable7 = measurables.get(i);
            if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.TextFieldId)) {
                int intValue = intrinsicMeasurer.invoke(intrinsicMeasurable7, Integer.valueOf(height)).intValue();
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i2 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = measurables.get(i2);
                    if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.LabelId)) {
                        break;
                    }
                    i2++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                int intValue2 = intrinsicMeasurable8 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable8, Integer.valueOf(height)).intValue() : 0;
                int size3 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = measurables.get(i3);
                    if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                int intValue3 = intrinsicMeasurable9 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable9, Integer.valueOf(height)).intValue() : 0;
                int size4 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = measurables.get(i4);
                    if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                int intValue4 = intrinsicMeasurable10 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable10, Integer.valueOf(height)).intValue() : 0;
                int size5 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                    intrinsicMeasurable5 = measurables.get(i5);
                    if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                int intValue5 = intrinsicMeasurable11 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable11, Integer.valueOf(height)).intValue() : 0;
                int size6 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = measurables.get(i6);
                    if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                int intValue6 = intrinsicMeasurable12 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable12, Integer.valueOf(height)).intValue() : 0;
                int size7 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = measurables.get(i7);
                    if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable13), TextFieldImplKt.PlaceholderId)) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                return m4284calculateWidthyeHjK3Y(intValue6, intValue3, intValue4, intValue5, intValue, intValue2, intrinsicMeasurable14 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable14, Integer.valueOf(height)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        int i2;
        int i3;
        int i4;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i5;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i6;
        int i7;
        IntrinsicMeasurable intrinsicMeasurable5;
        int i8;
        List<? extends IntrinsicMeasurable> list2;
        IntrinsicMeasurable intrinsicMeasurable6;
        IntrinsicMeasurable intrinsicMeasurable7;
        TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        List<? extends IntrinsicMeasurable> list3 = list;
        int size = list3.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i9);
            if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i9++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable;
        if (intrinsicMeasurable8 != null) {
            i2 = i;
            i3 = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            i4 = function2.invoke(intrinsicMeasurable8, Integer.valueOf(i2)).intValue();
        } else {
            i2 = i;
            i3 = i2;
            i4 = 0;
        }
        int size2 = list3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i10);
            if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i10++;
        }
        IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable2;
        if (intrinsicMeasurable9 != null) {
            i3 = LayoutUtilKt.subtractConstraintSafely(i3, intrinsicMeasurable9.maxIntrinsicWidth(Integer.MAX_VALUE));
            i5 = function2.invoke(intrinsicMeasurable9, Integer.valueOf(i2)).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list3.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i11);
            if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.LabelId)) {
                break;
            }
            i11++;
        }
        IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable3;
        int intValue = intrinsicMeasurable10 != null ? function2.invoke(intrinsicMeasurable10, Integer.valueOf(i3)).intValue() : 0;
        int size4 = list3.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i12);
            if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
                break;
            }
            i12++;
        }
        IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable4;
        if (intrinsicMeasurable11 != null) {
            int intValue2 = function2.invoke(intrinsicMeasurable11, Integer.valueOf(i3)).intValue();
            int subtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(i3, intrinsicMeasurable11.maxIntrinsicWidth(Integer.MAX_VALUE));
            i7 = intValue2;
            i6 = subtractConstraintSafely;
        } else {
            i6 = i3;
            i7 = 0;
        }
        int size5 = list3.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size5) {
                intrinsicMeasurable5 = null;
                break;
            }
            intrinsicMeasurable5 = list.get(i13);
            if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
                break;
            }
            i13++;
        }
        IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable5;
        if (intrinsicMeasurable12 != null) {
            i8 = function2.invoke(intrinsicMeasurable12, Integer.valueOf(i6)).intValue();
            i6 = LayoutUtilKt.subtractConstraintSafely(i6, intrinsicMeasurable12.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            i8 = 0;
        }
        int size6 = list3.size();
        int i14 = 0;
        while (i14 < size6) {
            IntrinsicMeasurable intrinsicMeasurable13 = list.get(i14);
            if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable13), TextFieldImplKt.TextFieldId)) {
                int intValue3 = function2.invoke(intrinsicMeasurable13, Integer.valueOf(i6)).intValue();
                int size7 = list3.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size7) {
                        list2 = list3;
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i15);
                    list2 = list3;
                    if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i15++;
                    list3 = list2;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable6;
                int intValue4 = intrinsicMeasurable14 != null ? function2.invoke(intrinsicMeasurable14, Integer.valueOf(i6)).intValue() : 0;
                int size8 = list2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size8) {
                        intrinsicMeasurable7 = null;
                        break;
                    }
                    intrinsicMeasurable7 = list.get(i16);
                    if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.SupportingId)) {
                        break;
                    }
                    i16++;
                }
                IntrinsicMeasurable intrinsicMeasurable15 = intrinsicMeasurable7;
                return textFieldMeasurePolicy.m4283calculateHeightmKXJcVc(intrinsicMeasureScope, intValue3, intValue, i4, i5, i7, i8, intValue4, intrinsicMeasurable15 != null ? function2.invoke(intrinsicMeasurable15, Integer.valueOf(i2)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), textFieldMeasurePolicy.labelPosition instanceof TextFieldLabelPosition.Above, textFieldMeasurePolicy.labelProgress.invoke());
            }
            i14++;
            textFieldMeasurePolicy = this;
            list3 = list3;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
