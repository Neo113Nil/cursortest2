package androidx.compose.foundation.layout;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class OffsetKt {
    public static final int End = 6;
    public static final int Horizontal = 15;
    public static final int Left = 10;

    /* renamed from: Left, reason: collision with other field name */
    public static final Arrangement$Absolute$Left$1 f4Left;
    public static final int Right = 5;

    /* renamed from: Right, reason: collision with other field name */
    public static final Arrangement$Absolute$Left$1 f5Right;
    public static final int Start = 9;
    public static final Drop$$ExternalSyntheticBUOutline0 bottomCalc = new Drop$$ExternalSyntheticBUOutline0(4);

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.Arrangement$Absolute$Left$1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.layout.Arrangement$Absolute$Left$1] */
    static {
        final int i = 0;
        f4Left = new Arrangement$Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement$Horizontal
            public final void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
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
                        return "AbsoluteArrangement#Left";
                    default:
                        return "AbsoluteArrangement#Right";
                }
            }
        };
        final int i2 = 1;
        f5Right = new Arrangement$Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement$Horizontal
            public final void arrange(Density density, int i22, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
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
                        return "AbsoluteArrangement#Left";
                    default:
                        return "AbsoluteArrangement#Right";
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BoxWithConstraints(Modifier modifier, Alignment alignment, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Alignment alignment2;
        int i4;
        boolean z2;
        Modifier modifier3;
        Alignment alignment3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(380139498);
        int i5 = i2 & 1;
        int i6 = 4;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            alignment2 = alignment;
            i3 |= gapComposer.changed(alignment2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                z2 = z;
                i3 |= gapComposer.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
                }
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
                    modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    Alignment alignment4 = i7 != 0 ? Alignment.Companion.TopStart : alignment2;
                    if (i4 != 0) {
                        z2 = false;
                    }
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment4, z2);
                    boolean changed = gapComposer.changed(maybeCachedBoxMeasurePolicy) | ((i3 & 7168) == 2048);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new TextKt$$ExternalSyntheticLambda0(i6, maybeCachedBoxMeasurePolicy, composableLambdaImpl);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    RulerKt.SubcomposeLayout(modifier3, (Function2) rememberedValue, gapComposer, i3 & 14, 0);
                    alignment3 = alignment4;
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    alignment3 = alignment2;
                }
                boolean z3 = z2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(modifier3, (Object) alignment3, z3, (Object) composableLambdaImpl, i, i2, 1);
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            }
            boolean z32 = z2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        alignment2 = alignment;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
        }
        boolean z322 = z2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void FlowRow(Modifier modifier, Arrangement$Horizontal arrangement$Horizontal, Arrangement$Vertical arrangement$Vertical, int i, FlowRowOverflow flowRowOverflow, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2) {
        int i3;
        FlowRowOverflow flowRowOverflow2;
        BiasAlignment.Vertical vertical = Alignment.Companion.Top;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1956591841);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(arrangement$Horizontal) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(arrangement$Vertical) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer.changed(vertical) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= gapComposer.changed(i) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i2) == 0) {
            i3 |= gapComposer.changed(Integer.MAX_VALUE) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i2) == 0) {
            flowRowOverflow2 = flowRowOverflow;
            i3 |= gapComposer.changed(flowRowOverflow2) ? 1048576 : PKIFailureInfo.signerNotTrusted;
        } else {
            flowRowOverflow2 = flowRowOverflow;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 & 3670016;
            boolean z = i5 == 1048576;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                flowRowOverflow2.getClass();
                FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.Clip;
                rememberedValue = new FlowLayoutOverflowState();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
            int i6 = i4 >> 3;
            boolean changed = ((((57344 & i6) ^ 24576) > 16384 && gapComposer.changed(Integer.MAX_VALUE)) || (i6 & 24576) == 16384) | ((((i6 & 14) ^ 6) > 4 && gapComposer.changed(arrangement$Horizontal)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && gapComposer.changed(arrangement$Vertical)) || (i6 & 48) == 32) | ((((i6 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(vertical)) || (i6 & MLKEMEngine.KyberPolyBytes) == 256) | ((((i6 & 7168) ^ 3072) > 2048 && gapComposer.changed(i)) || (i6 & 3072) == 2048) | gapComposer.changed(flowLayoutOverflowState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(arrangement$Horizontal, arrangement$Vertical, arrangement$Horizontal.mo252getSpacingD9Ej5fM(), new CrossAxisAlignment$VerticalCrossAxisAlignment(vertical), arrangement$Vertical.mo252getSpacingD9Ej5fM(), i, flowLayoutOverflowState);
                gapComposer.updateRememberedValue(flowMeasurePolicy);
                rememberedValue2 = flowMeasurePolicy;
            }
            FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) rememberedValue2;
            boolean z2 = (i5 == 1048576) | ((i4 & 29360128) == 8388608) | ((i4 & 458752) == 131072);
            Object rememberedValue3 = gapComposer.rememberedValue();
            Object obj = rememberedValue3;
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ComposableLambdaImpl(new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 1), true, -1192950673));
                flowRowOverflow.getClass();
                FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType2 = FlowLayoutOverflow$OverflowType.Clip;
                gapComposer.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            ComposableLambdaImpl combineAsVirtualLayouts = RulerKt.combineAsVirtualLayouts((List) obj);
            boolean changed2 = gapComposer.changed(flowMeasurePolicy2);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new MultiContentMeasurePolicyImpl(flowMeasurePolicy2);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue4;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Recorder$$ExternalSyntheticOutline2.m(0, combineAsVirtualLayouts, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(modifier, arrangement$Horizontal, arrangement$Vertical, i, flowRowOverflow, composableLambdaImpl, i2);
        }
    }

    public static final Modifier aspectRatio(float f, Modifier modifier, boolean z) {
        return modifier.then(new AspectRatioElement(f, z));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m269constructorimpl(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return ConstraintsKt.Constraints(layoutOrientation == layoutOrientation2 ? Constraints.m1027getMinWidthimpl(j) : Constraints.m1026getMinHeightimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m1025getMaxWidthimpl(j) : Constraints.m1024getMaxHeightimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m1026getMinHeightimpl(j) : Constraints.m1027getMinWidthimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m1024getMaxHeightimpl(j) : Constraints.m1025getMaxWidthimpl(j));
    }

    public static final Modifier consumeWindowInsets(Modifier modifier, AndroidWindowInsets androidWindowInsets) {
        return modifier.then(new UnionInsetsConsumingModifierElement(androidWindowInsets));
    }

    public static final Modifier height(Modifier modifier, IntrinsicSize intrinsicSize) {
        return modifier.then(new IntrinsicHeightElement(intrinsicSize));
    }

    /* renamed from: isSatisfiedBy-NN6Ew-U, reason: not valid java name */
    public static final boolean m271isSatisfiedByNN6EwU(int i, int i2, long j) {
        int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j);
        if (i > Constraints.m1025getMaxWidthimpl(j) || m1027getMinWidthimpl > i) {
            return false;
        }
        return i2 <= Constraints.m1024getMaxHeightimpl(j) && Constraints.m1026getMinHeightimpl(j) <= i2;
    }

    public static final Modifier offset(Modifier modifier, Function1 function1) {
        return modifier.then(new OffsetPxElement(function1, new GestureNodeKt$$ExternalSyntheticLambda0(1, function1)));
    }

    /* renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m272offsetVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new OffsetElement(f, f2, new OffsetKt$$ExternalSyntheticLambda0(f, f2, 0)));
    }

    /* renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static Modifier m273offsetVpY3zN4$default(Modifier modifier, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m272offsetVpY3zN4(modifier, f, f2);
    }

    public static final Modifier onConsumedWindowInsetsChanged(Modifier modifier, Function1 function1) {
        return modifier.then(new ConsumedInsetsModifierElement(function1));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m274toBoxConstraintsOenEA2s(long j) {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        return ConstraintsKt.Constraints(Constraints.m1027getMinWidthimpl(j), Constraints.m1025getMaxWidthimpl(j), Constraints.m1026getMinHeightimpl(j), Constraints.m1024getMaxHeightimpl(j));
    }

    public static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final Modifier width(Modifier modifier) {
        IntrinsicSize intrinsicSize = IntrinsicSize.Min;
        return modifier.then(new IntrinsicWidthElement());
    }

    public static final Modifier windowInsetsBottomHeight(AndroidWindowInsets androidWindowInsets) {
        return new DerivedHeightModifierElement(androidWindowInsets);
    }

    public static final Modifier windowInsetsPadding(Modifier modifier, WindowInsets windowInsets) {
        return modifier.then(new InsetsPaddingModifierElement(windowInsets));
    }

    public abstract int calculateAlignmentLinePosition(Placeable placeable);

    public static final Modifier consumeWindowInsets(Modifier modifier, PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesConsumingModifierElement(paddingValues));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowRow(Modifier modifier, Arrangement$Horizontal arrangement$Horizontal, Arrangement$Vertical arrangement$Vertical, BiasAlignment.Vertical vertical, int i, int i2, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i3, int i4) {
        int i5;
        Arrangement$Vertical arrangement$Vertical2;
        int i6;
        int i7;
        ComposableLambdaImpl composableLambdaImpl2;
        Modifier modifier2;
        Arrangement$Horizontal arrangement$Horizontal2;
        BiasAlignment.Vertical vertical2;
        Arrangement$Vertical arrangement$Vertical3;
        GapComposer gapComposer;
        int i8;
        int i9;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1303174015);
        int i10 = i4 & 1;
        if (i10 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (gapComposer2.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i11 = i4 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= gapComposer2.changed(arrangement$Horizontal) ? 32 : 16;
        }
        int i12 = i4 & 4;
        if (i12 != 0) {
            i5 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            arrangement$Vertical2 = arrangement$Vertical;
            i5 |= gapComposer2.changed(arrangement$Vertical2) ? 256 : 128;
            int i13 = i5 | 3072;
            i6 = i4 & 16;
            if (i6 == 0) {
                i13 = i5 | 27648;
            } else if ((i3 & 24576) == 0) {
                i13 |= gapComposer2.changed(i) ? 16384 : PKIFailureInfo.certRevoked;
                i7 = i13 | 196608;
                if ((i3 & 1572864) == 0) {
                    composableLambdaImpl2 = composableLambdaImpl;
                    i7 |= gapComposer2.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                } else {
                    composableLambdaImpl2 = composableLambdaImpl;
                }
                if (gapComposer2.shouldExecute(i7 & 1, (599187 & i7) != 599186)) {
                    if (i10 != 0) {
                        modifier = Modifier.Companion.$$INSTANCE;
                    }
                    Modifier modifier3 = modifier;
                    Arrangement$Horizontal arrangement$Horizontal3 = i11 != 0 ? SpacerKt.Start : arrangement$Horizontal;
                    Arrangement$Vertical arrangement$Vertical4 = i12 != 0 ? SpacerKt.Top : arrangement$Vertical2;
                    BiasAlignment.Vertical vertical3 = Alignment.Companion.Top;
                    int i14 = i6 != 0 ? Integer.MAX_VALUE : i;
                    FlowRow(modifier3, arrangement$Horizontal3, arrangement$Vertical4, i14, FlowRowOverflow.Clip, composableLambdaImpl2, gapComposer2, ((i7 << 3) & 29360128) | (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7));
                    vertical2 = vertical3;
                    i8 = i14;
                    gapComposer = gapComposer2;
                    i9 = Integer.MAX_VALUE;
                    arrangement$Vertical3 = arrangement$Vertical4;
                    arrangement$Horizontal2 = arrangement$Horizontal3;
                    modifier2 = modifier3;
                } else {
                    gapComposer2.skipToGroupEnd();
                    modifier2 = modifier;
                    arrangement$Horizontal2 = arrangement$Horizontal;
                    vertical2 = vertical;
                    arrangement$Vertical3 = arrangement$Vertical2;
                    gapComposer = gapComposer2;
                    i8 = i;
                    i9 = i2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new FlowLayoutKt$$ExternalSyntheticLambda1(modifier2, arrangement$Horizontal2, arrangement$Vertical3, vertical2, i8, i9, composableLambdaImpl, i3, i4);
                    return;
                }
                return;
            }
            i7 = i13 | 196608;
            if ((i3 & 1572864) == 0) {
            }
            if (gapComposer2.shouldExecute(i7 & 1, (599187 & i7) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        arrangement$Vertical2 = arrangement$Vertical;
        int i132 = i5 | 3072;
        i6 = i4 & 16;
        if (i6 == 0) {
        }
        i7 = i132 | 196608;
        if ((i3 & 1572864) == 0) {
        }
        if (gapComposer2.shouldExecute(i7 & 1, (599187 & i7) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
