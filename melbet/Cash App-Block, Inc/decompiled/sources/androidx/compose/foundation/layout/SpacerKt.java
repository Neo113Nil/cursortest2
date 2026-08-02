package androidx.compose.foundation.layout;

import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda4;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class SpacerKt {
    public static final Arrangement$Top$1 Bottom;
    public static final Arrangement$End$1 End;
    public static final Arrangement$Top$1 Top;
    public static final Arrangement$End$1 Start = new Arrangement$End$1(1);
    public static final Arrangement$Center$1 Center = new Arrangement$Center$1(0);
    public static final Arrangement$Center$1 SpaceEvenly = new Arrangement$Center$1(3);
    public static final Arrangement$Center$1 SpaceBetween = new Arrangement$Center$1(2);
    public static final Arrangement$Center$1 SpaceAround = new Arrangement$Center$1(1);
    public static final FixedIntInsets EmptyWindowInsets = new FixedIntInsets();
    public static final ScrollState$$ExternalSyntheticLambda4 systemBarsLambda = new ScrollState$$ExternalSyntheticLambda4(29);
    public static final SaversKt$$ExternalSyntheticLambda2 statusBarsLambda = new SaversKt$$ExternalSyntheticLambda2(1);
    public static final SaversKt$$ExternalSyntheticLambda2 imeLambda = new SaversKt$$ExternalSyntheticLambda2(2);
    public static final SaversKt$$ExternalSyntheticLambda2 navigationBarsLambda = new SaversKt$$ExternalSyntheticLambda2(3);

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.layout.Arrangement$Top$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.layout.Arrangement$Top$1] */
    static {
        final int i = 0;
        End = new Arrangement$End$1(i);
        Top = new Arrangement$Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
            @Override // androidx.compose.foundation.layout.Arrangement$Vertical
            public final void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
                int i3 = 0;
                switch (i) {
                    case 0:
                        int length = iArr.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i3 < length) {
                            int i6 = iArr[i3];
                            iArr2[i4] = i5;
                            i5 += i6;
                            i3++;
                            i4++;
                        }
                        break;
                    default:
                        int i7 = 0;
                        for (int i8 : iArr) {
                            i7 += i8;
                        }
                        int length2 = iArr.length;
                        int i9 = i2 - i7;
                        int i10 = 0;
                        while (i3 < length2) {
                            int i11 = iArr[i3];
                            iArr2[i10] = i9;
                            i9 += i11;
                            i3++;
                            i10++;
                        }
                        break;
                }
            }

            public final String toString() {
                switch (i) {
                    case 0:
                        return "Arrangement#Top";
                    default:
                        return "Arrangement#Bottom";
                }
            }
        };
        final int i2 = 1;
        Bottom = new Arrangement$Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
            @Override // androidx.compose.foundation.layout.Arrangement$Vertical
            public final void arrange(Density density, int i22, int[] iArr, int[] iArr2) {
                int i3 = 0;
                switch (i2) {
                    case 0:
                        int length = iArr.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i3 < length) {
                            int i6 = iArr[i3];
                            iArr2[i4] = i5;
                            i5 += i6;
                            i3++;
                            i4++;
                        }
                        break;
                    default:
                        int i7 = 0;
                        for (int i8 : iArr) {
                            i7 += i8;
                        }
                        int length2 = iArr.length;
                        int i9 = i22 - i7;
                        int i10 = 0;
                        while (i3 < length2) {
                            int i11 = iArr[i3];
                            iArr2[i10] = i9;
                            i9 += i11;
                            i3++;
                            i10++;
                        }
                        break;
                }
            }

            public final String toString() {
                switch (i2) {
                    case 0:
                        return "Arrangement#Top";
                    default:
                        return "Arrangement#Bottom";
                }
            }
        };
    }

    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValuesImpl m294PaddingValues0680j_4(float f) {
        return new PaddingValuesImpl(f, f, f, f);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static PaddingValuesImpl m295PaddingValuesYgX7TsA$default(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new PaddingValuesImpl(f, f2, f, f2);
    }

    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValuesImpl m296PaddingValuesa9UjIt4(float f, float f2, float f3, float f4) {
        return new PaddingValuesImpl(f, f2, f3, f4);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static PaddingValuesImpl m297PaddingValuesa9UjIt4$default(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new PaddingValuesImpl(f, f2, f3, f4);
    }

    public static final void Spacer(Composer composer, Modifier modifier) {
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.INSTANCE;
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, modifier);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
        if (gapComposer2.applier == null) {
            Updater.invalidApplier();
            throw null;
        }
        gapComposer2.startReusableNode();
        if (gapComposer2.inserting) {
            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
        } else {
            gapComposer2.useNode();
        }
        Updater.m576setimpl(composer, spacerMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
        Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
        Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
        Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
        gapComposer2.end(true);
    }

    public static final InsetsPaddingValues asPaddingValues(WindowInsets windowInsets, Composer composer) {
        return new InsetsPaddingValues(windowInsets, (Density) ((GapComposer) composer).consume(CompositionLocalsKt.LocalDensity));
    }

    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo266calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo265calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo265calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo266calculateRightPaddingu2uoSUM(layoutDirection);
    }

    public static final RowColumnParentData getRowColumnParentData(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        return rowColumnParentData != null ? rowColumnParentData.weight : RecyclerView.DECELERATION_RATE;
    }

    public static final Modifier imePadding(Modifier modifier) {
        return modifier.then(new SystemInsetsPaddingModifierElement(imeLambda));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MeasureResult measure(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i, int i2, int i3, int i4, int i5, MeasureScope measureScope, List list, Placeable[] placeableArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        List list2 = list;
        long j = i5;
        int i17 = i7 - i6;
        int[] iArr2 = new int[i17];
        int i18 = i6;
        int i19 = 0;
        int i20 = 0;
        boolean z2 = false;
        int i21 = 0;
        int i22 = 0;
        float f2 = RecyclerView.DECELERATION_RATE;
        while (i18 < i7) {
            Measurable measurable = (Measurable) list2.get(i18);
            long j2 = j;
            RowColumnParentData rowColumnParentData = getRowColumnParentData(measurable);
            float weight = getWeight(rowColumnParentData);
            if (!z2) {
                SpacerKt spacerKt = rowColumnParentData != null ? rowColumnParentData.crossAxisAlignment : null;
                if (!(spacerKt != null ? spacerKt instanceof CrossAxisAlignment$AlignmentLineCrossAxisAlignment : false)) {
                    z2 = false;
                    if (weight <= RecyclerView.DECELERATION_RATE) {
                        f2 += weight;
                        i20++;
                        i14 = i18;
                    } else {
                        int i23 = i3 - i21;
                        Placeable placeable = placeableArr[i18];
                        if (placeable == null) {
                            if (i3 == Integer.MAX_VALUE) {
                                i14 = i18;
                                i15 = i20;
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i14 = i18;
                                i15 = i20;
                                i16 = i23 < 0 ? 0 : i23;
                            }
                            placeable = measurable.mo833measureBRTryo0(rowColumnMeasurePolicy.mo260createConstraintsxF2OJ5Q(0, i16, false, i4));
                        } else {
                            i14 = i18;
                            i15 = i20;
                        }
                        int mainAxisSize = rowColumnMeasurePolicy.mainAxisSize(placeable);
                        int crossAxisSize = rowColumnMeasurePolicy.crossAxisSize(placeable);
                        iArr2[i14 - i6] = mainAxisSize;
                        int i24 = i23 - mainAxisSize;
                        if (i24 < 0) {
                            i24 = 0;
                        }
                        i22 = Math.min(i5, i24);
                        i21 += mainAxisSize + i22;
                        i19 = Math.max(i19, crossAxisSize);
                        placeableArr[i14] = placeable;
                        i20 = i15;
                    }
                    i18 = i14 + 1;
                    j = j2;
                }
            }
            z2 = true;
            if (weight <= RecyclerView.DECELERATION_RATE) {
            }
            i18 = i14 + 1;
            j = j2;
        }
        long j3 = j;
        boolean z3 = true;
        if (i20 == 0) {
            i21 -= i22;
            i9 = 0;
        } else {
            long j4 = (r24 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i21) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f3 = j5 / f2;
            int i25 = i6;
            while (i25 < i7) {
                j5 -= Math.round(getWeight(getRowColumnParentData((Measurable) list2.get(i25))) * f3);
                i25++;
                j4 = j4;
            }
            long j6 = j4;
            int i26 = i6;
            int i27 = 0;
            while (i26 < i7) {
                if (placeableArr[i26] == null) {
                    Measurable measurable2 = (Measurable) list2.get(i26);
                    RowColumnParentData rowColumnParentData2 = getRowColumnParentData(measurable2);
                    float weight2 = getWeight(rowColumnParentData2);
                    if (weight2 <= RecyclerView.DECELERATION_RATE) {
                        InlineClassHelperKt.throwIllegalStateException("All weights <= 0 should have placeables");
                    }
                    i10 = i26;
                    int signum = Long.signum(j5);
                    f = f3;
                    j5 -= signum;
                    int max = Math.max(0, Math.round(f * weight2) + signum);
                    if ((rowColumnParentData2 != null ? rowColumnParentData2.fill : z3) && max != Integer.MAX_VALUE) {
                        i11 = max;
                        z = z3;
                        Placeable mo833measureBRTryo0 = measurable2.mo833measureBRTryo0(rowColumnMeasurePolicy.mo260createConstraintsxF2OJ5Q(i11, max, z, i4));
                        int mainAxisSize2 = rowColumnMeasurePolicy.mainAxisSize(mo833measureBRTryo0);
                        int crossAxisSize2 = rowColumnMeasurePolicy.crossAxisSize(mo833measureBRTryo0);
                        iArr2[i10 - i6] = mainAxisSize2;
                        i27 += mainAxisSize2;
                        int max2 = Math.max(i19, crossAxisSize2);
                        placeableArr[i10] = mo833measureBRTryo0;
                        i19 = max2;
                    }
                    i11 = 0;
                    z = z3;
                    Placeable mo833measureBRTryo02 = measurable2.mo833measureBRTryo0(rowColumnMeasurePolicy.mo260createConstraintsxF2OJ5Q(i11, max, z, i4));
                    int mainAxisSize22 = rowColumnMeasurePolicy.mainAxisSize(mo833measureBRTryo02);
                    int crossAxisSize22 = rowColumnMeasurePolicy.crossAxisSize(mo833measureBRTryo02);
                    iArr2[i10 - i6] = mainAxisSize22;
                    i27 += mainAxisSize22;
                    int max22 = Math.max(i19, crossAxisSize22);
                    placeableArr[i10] = mo833measureBRTryo02;
                    i19 = max22;
                } else {
                    i10 = i26;
                    f = f3;
                    z = z3;
                }
                list2 = list;
                z3 = z;
                i26 = i10 + 1;
                f3 = f;
            }
            i9 = (int) (i27 + j6);
            int i28 = i3 - i21;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i28) {
                i9 = i28;
            }
        }
        if (z2) {
            int i29 = 0;
            i12 = 0;
            for (int i30 = i6; i30 < i7; i30++) {
                Placeable placeable2 = placeableArr[i30];
                placeable2.getClass();
                Object parentData = placeable2.getParentData();
                RowColumnParentData rowColumnParentData3 = parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null;
                SpacerKt spacerKt2 = rowColumnParentData3 != null ? rowColumnParentData3.crossAxisAlignment : null;
                Integer calculateAlignmentLinePosition$foundation_layout = spacerKt2 != null ? spacerKt2.calculateAlignmentLinePosition$foundation_layout(placeable2) : null;
                if (calculateAlignmentLinePosition$foundation_layout != null) {
                    int intValue = calculateAlignmentLinePosition$foundation_layout.intValue();
                    int crossAxisSize3 = rowColumnMeasurePolicy.crossAxisSize(placeable2);
                    i29 = Math.max(i29, intValue != Integer.MIN_VALUE ? calculateAlignmentLinePosition$foundation_layout.intValue() : 0);
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = crossAxisSize3;
                    }
                    i12 = Math.max(i12, crossAxisSize3 - intValue);
                }
            }
            i13 = i29;
        } else {
            i12 = 0;
            i13 = 0;
        }
        int i31 = i21 + i9;
        int max3 = Math.max(i31 < 0 ? 0 : i31, i);
        int max4 = Math.max(i19, Math.max(i2, i12 + i13));
        int[] iArr3 = new int[i17];
        rowColumnMeasurePolicy.populateMainAxisPositions(max3, iArr2, iArr3, measureScope);
        return rowColumnMeasurePolicy.placeHelper(placeableArr, measureScope, i13, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    public static final Modifier navigationBarsPadding(Modifier modifier) {
        return modifier.then(new SystemInsetsPaddingModifierElement(navigationBarsLambda));
    }

    public static final Modifier padding(Modifier modifier, PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new CashApp$$ExternalSyntheticLambda2(paddingValues, 5)));
    }

    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m298padding3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new PaddingElement(f, f, f, f, new PulsingState$$ExternalSyntheticLambda0(f, 1)));
    }

    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m299paddingVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new PaddingElement(f, f2, f, f2, new PaddingKt$$ExternalSyntheticLambda1(f, f2, 0)));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static Modifier m300paddingVpY3zN4$default(Modifier modifier, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m299paddingVpY3zN4(modifier, f, f2);
    }

    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m301paddingqDBjuR0(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new PaddingElement(f, f2, f3, f4, new Function1() { // from class: androidx.compose.foundation.layout.PaddingKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set(new Dp(f), "start");
                inspectorInfo.getProperties().set(new Dp(f2), "top");
                inspectorInfo.getProperties().set(new Dp(f3), "end");
                inspectorInfo.getProperties().set(new Dp(f4), "bottom");
                return Unit.INSTANCE;
            }
        }));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static Modifier m302paddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return m301paddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    public static void placeCenter$foundation_layout(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i7;
        }
    }

    public static void placeSpaceAround$foundation_layout(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = iArr.length == 0 ? RecyclerView.DECELERATION_RATE : (i - i3) / iArr.length;
        float f = length / 2.0f;
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i7 = iArr[length3];
            iArr2[length3] = Math.round(f);
            f += i7 + length;
        }
    }

    public static void placeSpaceBetween$foundation_layout(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float max = (i - i3) / Math.max(iArr.length - 1, 1);
        float f = (z && iArr.length == 1) ? max : RecyclerView.DECELERATION_RATE;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f);
                f += i5 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f);
            f += i7 + max;
            i2++;
            i6++;
        }
    }

    public static void placeSpaceEvenly$foundation_layout(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (z) {
            float f = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f2 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f2);
            f2 += i7 + length;
            i2++;
            i6++;
        }
    }

    public static final Modifier statusBarsPadding(Modifier modifier) {
        return modifier.then(new SystemInsetsPaddingModifierElement(statusBarsLambda));
    }

    public static final Modifier systemBarsPadding(Modifier modifier) {
        return modifier.then(new SystemInsetsPaddingModifierElement(systemBarsLambda));
    }

    public static final InsetsValues toInsetsValues(Insets insets) {
        return new InsetsValues(insets.left, insets.top, insets.right, insets.bottom);
    }

    public abstract int align$foundation_layout(int i, int i2, LayoutDirection layoutDirection, Placeable placeable, int i3);

    public Integer calculateAlignmentLinePosition$foundation_layout(Placeable placeable) {
        return null;
    }
}
