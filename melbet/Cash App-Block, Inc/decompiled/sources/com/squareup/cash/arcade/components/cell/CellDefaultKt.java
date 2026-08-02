package com.squareup.cash.arcade.components.cell;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.views.TaxToolTipViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda3;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class CellDefaultKt {
    public static final ComposableLambdaImpl lambda$95974281 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5(0, 14), false, 95974281);

    static {
        new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(5), false, 196638810);
        new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 17), false, 390940600);
        new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(3), false, -1947566753);
        new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 15), false, 2019989697);
        new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(4), false, -1546951783);
        new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 16), false, 1695810422);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f9  */
    /* renamed from: CellActivity-6RhP_wg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3388CellActivity6RhP_wg(final ComposableLambdaImpl composableLambdaImpl, final ComposableLambdaImpl composableLambdaImpl2, final ComposableLambdaImpl composableLambdaImpl3, final Function0 function0, Modifier modifier, Badge badge, final Function2 function2, Function2 function22, boolean z, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        final Function2 function23;
        int i6;
        int i7;
        int i8;
        int i9;
        GapComposer gapComposer;
        final Badge badge2;
        final boolean z2;
        final Modifier modifier3;
        final long j2;
        RecomposeScopeImpl endRestartGroup;
        Badge badge3;
        Function2 function24;
        boolean z3;
        Modifier modifier4;
        long j3;
        Object rememberedValue;
        NeverEqualPolicy neverEqualPolicy;
        Function2 function25;
        List list;
        Badge badge4;
        NeverEqualPolicy neverEqualPolicy2;
        long j4;
        boolean z4;
        RealCellActivityAccessoryScope realCellActivityAccessoryScope;
        int i10;
        Modifier modifier5;
        boolean changed;
        Object rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        int i11;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1270656170);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(composableLambdaImpl2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(composableLambdaImpl3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked;
            i4 = i2 & 32;
            int i13 = 196608;
            if (i4 == 0) {
                if ((196608 & i) == 0) {
                    i13 = (262144 & i) == 0 ? gapComposer2.changed(badge) : gapComposer2.changedInstance(badge) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if ((1572864 & i) == 0) {
                    i3 |= gapComposer2.changedInstance(function2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                    function23 = function22;
                    i6 = 2;
                } else {
                    function23 = function22;
                    i6 = 2;
                    if ((i & 12582912) == 0) {
                        i3 |= gapComposer2.changedInstance(function23) ? 8388608 : 4194304;
                    }
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= gapComposer2.changed(z) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    int i14 = i3;
                    if ((i2 & 512) == 0) {
                        i9 = i7;
                        if (gapComposer2.changed(j)) {
                            i11 = PKIFailureInfo.duplicateCertReq;
                            i8 = i14 | i11;
                        }
                    } else {
                        i9 = i7;
                    }
                    i11 = 268435456;
                    i8 = i14 | i11;
                } else {
                    i8 = i3;
                    i9 = i7;
                }
                int i15 = i9;
                if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) != 306783378)) {
                    gapComposer2.startDefaults();
                    int i16 = i & 1;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i16 == 0 || gapComposer2.getDefaultsInvalid()) {
                        if (i12 != 0) {
                            modifier2 = companion;
                        }
                        Badge badge5 = i4 != 0 ? null : badge;
                        if (i5 != 0) {
                            function23 = null;
                        }
                        boolean z5 = i15 != 0 ? false : z;
                        if ((i2 & 512) != 0) {
                            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                            } else {
                                gapComposer2.startReplaceGroup(-1762997739);
                                gapComposer2.end(false);
                            }
                            i8 &= -1879048193;
                            z3 = z5;
                            badge3 = badge5;
                            function24 = function23;
                            modifier4 = modifier2;
                            j3 = colors.component.cell.background.f171default;
                            gapComposer2.endDefaults();
                            boolean z6 = !z3 || function2 == null || function24 == null;
                            float f = (function2 == null || function24 != null) ? 80.0f : 64.0f;
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1570333846, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 25), gapComposer2);
                            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1483436802, new CellActivityKt$$ExternalSyntheticLambda1(composableLambdaImpl2, function2, function24, 0), gapComposer2);
                            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-407844866, new CellDefaultKt$$ExternalSyntheticLambda3(badge3, 1), gapComposer2);
                            rememberedValue = gapComposer2.rememberedValue();
                            Function2 function26 = function24;
                            neverEqualPolicy = Composer.Companion.Empty;
                            if (rememberedValue == neverEqualPolicy) {
                                rememberedValue = new RealCellActivityAccessoryScope();
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            RealCellActivityAccessoryScope realCellActivityAccessoryScope2 = (RealCellActivityAccessoryScope) rememberedValue;
                            composableLambdaImpl3.invoke(realCellActivityAccessoryScope2, gapComposer2, Integer.valueOf(((i8 >> 3) & 112) | 6));
                            ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(788297839, new ButtonBinding$$ExternalSyntheticLambda2(realCellActivityAccessoryScope2, 15), gapComposer2);
                            Function2[] function2Arr = new Function2[4];
                            function2Arr[0] = rememberComposableLambda;
                            function2Arr[1] = rememberComposableLambda2;
                            function2Arr[i6] = rememberComposableLambda3;
                            function2Arr[3] = rememberComposableLambda4;
                            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) function2Arr);
                            Modifier modifier6 = modifier4;
                            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(modifier4, j3, ColorKt.RectangleShape), 1.0f), f, RecyclerView.DECELERATION_RATE, i6);
                            if (function0 == null) {
                                gapComposer2.startReplaceGroup(1725993056);
                                Object rememberedValue4 = gapComposer2.rememberedValue();
                                if (rememberedValue4 == neverEqualPolicy) {
                                    rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                                }
                                gapComposer = gapComposer2;
                                function25 = function26;
                                list = listOf;
                                z4 = z6;
                                neverEqualPolicy2 = neverEqualPolicy;
                                i10 = 0;
                                j4 = j3;
                                badge4 = badge3;
                                realCellActivityAccessoryScope = realCellActivityAccessoryScope2;
                                modifier5 = ImageKt.m182clickableO2vRcR0$default(companion, (MutableInteractionSourceImpl) rememberedValue4, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 0, 15), false, null, null, function0, 28);
                                gapComposer.end(false);
                            } else {
                                function25 = function26;
                                list = listOf;
                                badge4 = badge3;
                                neverEqualPolicy2 = neverEqualPolicy;
                                j4 = j3;
                                z4 = z6;
                                realCellActivityAccessoryScope = realCellActivityAccessoryScope2;
                                i10 = 0;
                                modifier5 = companion;
                                gapComposer = gapComposer2;
                                gapComposer.startReplaceGroup(1726196106);
                                gapComposer.end(false);
                            }
                            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m279heightInVpY3zN4$default.then(modifier5), ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, 16.0f);
                            changed = gapComposer.changed(z4);
                            rememberedValue2 = gapComposer.rememberedValue();
                            if (!changed || rememberedValue2 == neverEqualPolicy2) {
                                rememberedValue2 = new CellActivityKt$CellActivity$2$1(realCellActivityAccessoryScope, z4);
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue2;
                            ComposableLambdaImpl combineAsVirtualLayouts = RulerKt.combineAsVirtualLayouts(list);
                            changed2 = gapComposer.changed(multiContentMeasurePolicy);
                            rememberedValue3 = gapComposer.rememberedValue();
                            if (!changed2 || rememberedValue3 == neverEqualPolicy2) {
                                rememberedValue3 = new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy);
                                gapComposer.updateRememberedValue(rememberedValue3);
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
                            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer.applier != null) {
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
                            Recorder$$ExternalSyntheticOutline2.m(i10, combineAsVirtualLayouts, gapComposer, true);
                            modifier3 = modifier6;
                            function23 = function25;
                            badge2 = badge4;
                            j2 = j4;
                            z2 = z3;
                        } else {
                            badge3 = badge5;
                            function24 = function23;
                            z3 = z5;
                        }
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i2 & 512) != 0) {
                            i8 &= -1879048193;
                        }
                        badge3 = badge;
                        z3 = z;
                        function24 = function23;
                    }
                    modifier4 = modifier2;
                    j3 = j;
                    gapComposer2.endDefaults();
                    if (z3) {
                    }
                    if (function2 == null) {
                    }
                    ComposableLambdaImpl rememberComposableLambda5 = Expect_jvmKt.rememberComposableLambda(1570333846, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 25), gapComposer2);
                    ComposableLambdaImpl rememberComposableLambda22 = Expect_jvmKt.rememberComposableLambda(1483436802, new CellActivityKt$$ExternalSyntheticLambda1(composableLambdaImpl2, function2, function24, 0), gapComposer2);
                    ComposableLambdaImpl rememberComposableLambda32 = Expect_jvmKt.rememberComposableLambda(-407844866, new CellDefaultKt$$ExternalSyntheticLambda3(badge3, 1), gapComposer2);
                    rememberedValue = gapComposer2.rememberedValue();
                    Function2 function262 = function24;
                    neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                    }
                    RealCellActivityAccessoryScope realCellActivityAccessoryScope22 = (RealCellActivityAccessoryScope) rememberedValue;
                    composableLambdaImpl3.invoke(realCellActivityAccessoryScope22, gapComposer2, Integer.valueOf(((i8 >> 3) & 112) | 6));
                    ComposableLambdaImpl rememberComposableLambda42 = Expect_jvmKt.rememberComposableLambda(788297839, new ButtonBinding$$ExternalSyntheticLambda2(realCellActivityAccessoryScope22, 15), gapComposer2);
                    Function2[] function2Arr2 = new Function2[4];
                    function2Arr2[0] = rememberComposableLambda5;
                    function2Arr2[1] = rememberComposableLambda22;
                    function2Arr2[i6] = rememberComposableLambda32;
                    function2Arr2[3] = rememberComposableLambda42;
                    List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) function2Arr2);
                    Modifier modifier62 = modifier4;
                    Modifier m279heightInVpY3zN4$default2 = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(modifier4, j3, ColorKt.RectangleShape), 1.0f), f, RecyclerView.DECELERATION_RATE, i6);
                    if (function0 == null) {
                    }
                    Modifier m299paddingVpY3zN42 = SpacerKt.m299paddingVpY3zN4(m279heightInVpY3zN4$default2.then(modifier5), ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, 16.0f);
                    changed = gapComposer.changed(z4);
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new CellActivityKt$CellActivity$2$1(realCellActivityAccessoryScope, z4);
                    gapComposer.updateRememberedValue(rememberedValue2);
                    MultiContentMeasurePolicy multiContentMeasurePolicy2 = (MultiContentMeasurePolicy) rememberedValue2;
                    ComposableLambdaImpl combineAsVirtualLayouts2 = RulerKt.combineAsVirtualLayouts(list);
                    changed2 = gapComposer.changed(multiContentMeasurePolicy2);
                    rememberedValue3 = gapComposer.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue3 = new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy2);
                    gapComposer.updateRememberedValue(rememberedValue3);
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue3;
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN42);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier != null) {
                    }
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    badge2 = badge;
                    z2 = z;
                    modifier3 = modifier2;
                    j2 = j;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.cell.CellActivityKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                            CellDefaultKt.m3388CellActivity6RhP_wg(ComposableLambdaImpl.this, composableLambdaImpl2, composableLambdaImpl3, function0, modifier3, badge2, function2, function23, z2, j2, (Composer) obj, updateChangedFlags, i2);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i3 |= i13;
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            int i152 = i9;
            if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) != 306783378)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        int i132 = 196608;
        if (i4 == 0) {
        }
        i3 |= i132;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        int i1522 = i9;
        if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) != 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bd  */
    /* renamed from: CellActivity-GZm5OLo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3389CellActivityGZm5OLo(final ComposableLambdaImpl composableLambdaImpl, final String str, final Function1 function1, final Function0 function0, Modifier modifier, Badge badge, final String str2, String str3, boolean z, int i, long j, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        String str4;
        int i7;
        int i8;
        GapComposer gapComposer;
        final Badge badge2;
        final boolean z2;
        final int i9;
        final Modifier modifier3;
        final String str5;
        final long j2;
        RecomposeScopeImpl endRestartGroup;
        Badge badge3;
        long j3;
        boolean z3;
        int i10;
        boolean z4;
        ComposableLambdaImpl composableLambdaImpl2;
        ComposableLambdaImpl composableLambdaImpl3;
        str.getClass();
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1812019574);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer2.changedInstance(composableLambdaImpl) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        int i11 = i3 & 16;
        if (i11 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked;
            i5 = i3 & 32;
            int i12 = 196608;
            if (i5 == 0) {
                if ((196608 & i2) == 0) {
                    i12 = (262144 & i2) == 0 ? gapComposer2.changed(badge) : gapComposer2.changedInstance(badge) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if ((1572864 & i2) == 0) {
                    i4 |= gapComposer2.changed(str2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((12582912 & i2) == 0) {
                    str4 = str3;
                    i4 |= gapComposer2.changed(str4) ? 8388608 : 4194304;
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i4 |= gapComposer2.changed(z) ? 67108864 : 33554432;
                    }
                    i8 = i4 | 805306368;
                    if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378)) {
                        gapComposer = gapComposer2;
                        gapComposer.skipToGroupEnd();
                        badge2 = badge;
                        z2 = z;
                        i9 = i;
                        modifier3 = modifier2;
                        str5 = str4;
                        j2 = j;
                    } else {
                        gapComposer2.startDefaults();
                        if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.Companion.$$INSTANCE;
                            }
                            Badge badge4 = i5 != 0 ? null : badge;
                            if (i6 != 0) {
                                str4 = null;
                            }
                            boolean z5 = i7 != 0 ? false : z;
                            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                            } else {
                                gapComposer2.startReplaceGroup(-1762997739);
                                gapComposer2.end(false);
                            }
                            badge3 = badge4;
                            j3 = colors.component.cell.background.f171default;
                            z3 = z5;
                            i10 = 1;
                        } else {
                            gapComposer2.skipToGroupEnd();
                            badge3 = badge;
                            z3 = z;
                            i10 = i;
                            j3 = j;
                        }
                        Modifier modifier4 = modifier2;
                        gapComposer2.endDefaults();
                        if (str2 != null) {
                            gapComposer2.startReplaceGroup(-1568174176);
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1533613953, new CardTransitionKt$$ExternalSyntheticLambda3(str2, i10, 1), gapComposer2);
                            z4 = false;
                            gapComposer2.end(false);
                            composableLambdaImpl2 = rememberComposableLambda;
                        } else {
                            z4 = false;
                            gapComposer2.startReplaceGroup(-1568094506);
                            gapComposer2.end(false);
                            composableLambdaImpl2 = null;
                        }
                        if (str4 != null) {
                            gapComposer2.startReplaceGroup(-1568032630);
                            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-194532288, new ToastKt$$ExternalSyntheticLambda1(str4, 25), gapComposer2);
                            gapComposer2.end(z4);
                            composableLambdaImpl3 = rememberComposableLambda2;
                        } else {
                            gapComposer2.startReplaceGroup(-1567962570);
                            gapComposer2.end(z4);
                            composableLambdaImpl3 = null;
                        }
                        gapComposer = gapComposer2;
                        m3388CellActivity6RhP_wg(composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-1769121259, new ToastKt$$ExternalSyntheticLambda1(str, 26), gapComposer2), Expect_jvmKt.rememberComposableLambda(592166903, new BrandSheetViewKt$$ExternalSyntheticLambda6(19, function1), gapComposer2), function0, modifier4, badge3, composableLambdaImpl2, composableLambdaImpl3, z3, j3, gapComposer, (i8 & 14) | 432 | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (i8 & 234881024), 0);
                        i9 = i10;
                        str5 = str4;
                        modifier3 = modifier4;
                        badge2 = badge3;
                        z2 = z3;
                        j2 = j3;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.cell.CellActivityKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                                CellDefaultKt.m3389CellActivityGZm5OLo(ComposableLambdaImpl.this, str, function1, function0, modifier3, badge2, str2, str5, z2, i9, j2, (Composer) obj, updateChangedFlags, i3);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                str4 = str3;
                i7 = i3 & 256;
                if (i7 == 0) {
                }
                i8 = i4 | 805306368;
                if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i4 |= i12;
            if ((1572864 & i2) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            str4 = str3;
            i7 = i3 & 256;
            if (i7 == 0) {
            }
            i8 = i4 | 805306368;
            if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 32;
        int i122 = 196608;
        if (i5 == 0) {
        }
        i4 |= i122;
        if ((1572864 & i2) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        str4 = str3;
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i4 | 805306368;
        if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: CellDefaultBase-hdfVwu4, reason: not valid java name */
    public static final void m3390CellDefaultBasehdfVwu4(final Function2 function2, final Function2 function22, final Function2 function23, final long j, final Badge badge, final CellDefaultAccessory cellDefaultAccessory, final Function0 function0, final String str, final boolean z, final boolean z2, final CellConfig cellConfig, final Modifier modifier, Function0 function02, Composer composer, final int i, final int i2) {
        int i3;
        CellDefaultAccessory cellDefaultAccessory2;
        int i4;
        GapComposer gapComposer;
        CellDefaultColors cellDefaultColors;
        final Function0 function03 = function02;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(213223877);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function22) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? gapComposer2.changed(badge) : gapComposer2.changedInstance(badge) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            cellDefaultAccessory2 = cellDefaultAccessory;
            i3 |= gapComposer2.changed(cellDefaultAccessory2) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            cellDefaultAccessory2 = cellDefaultAccessory;
        }
        if ((i & 1572864) == 0) {
            i3 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i3 |= gapComposer2.changed(str) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer2.changed(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer2.changed(z2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = (gapComposer2.changed(cellConfig.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changedInstance(function03) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            if (z) {
                gapComposer2.startReplaceGroup(-1250270612);
                cellDefaultColors = new CellDefaultColors(Strings.getColors(gapComposer2).semantic.icon.standard, Strings.getColors(gapComposer2).semantic.icon.inverse, Strings.getColors(gapComposer2).semantic.text.standard, Strings.getColors(gapComposer2).semantic.text.standard);
            } else {
                gapComposer2.startReplaceGroup(-1250269619);
                cellDefaultColors = new CellDefaultColors(Strings.getColors(gapComposer2).semantic.icon.disabled, Strings.getColors(gapComposer2).semantic.icon.extraSubtle, Strings.getColors(gapComposer2).semantic.text.disabled, Strings.getColors(gapComposer2).semantic.text.disabled);
            }
            int i5 = 0;
            gapComposer2.end(false);
            int i6 = i4;
            CellDefaultColors cellDefaultColors2 = cellDefaultColors;
            gapComposer = gapComposer2;
            int i7 = 4;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(33156100, new CellDefaultKt$$ExternalSyntheticLambda5(modifier, j, function23, function0, str, z, cellDefaultAccessory, Expect_jvmKt.rememberComposableLambda(-642217499, new LocalHomeViewKt$$ExternalSyntheticLambda0(function2, cellConfig, cellDefaultColors2, z, 9), gapComposer2), Expect_jvmKt.rememberComposableLambda(-1589701991, new LocalHomeViewKt$$ExternalSyntheticLambda0(cellDefaultColors2, z, function23, function22, 10), gapComposer2), Expect_jvmKt.rememberComposableLambda(-1753201635, new CellDefaultKt$$ExternalSyntheticLambda3(badge, i5), gapComposer2), Expect_jvmKt.rememberComposableLambda(1076245516, new LocalHomeViewKt$$ExternalSyntheticLambda0(z, cellDefaultAccessory2, badge, function0, 11), gapComposer2), z2), gapComposer);
            if (function02 != null) {
                gapComposer.startReplaceGroup(-96511611);
                float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(88.0f);
                boolean changed = gapComposer.changed(mo236toPx0680j_4);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new PulsingState$$ExternalSyntheticLambda0(mo236toPx0680j_4, i7);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SwipeToDismissBoxState rememberSwipeToDismissBoxState = MenuKt.rememberSwipeToDismissBoxState(gapComposer, (Function1) rememberedValue);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-238901182, new BankingDialogKt$$ExternalSyntheticLambda8(rememberSwipeToDismissBoxState, 3), gapComposer);
                boolean z3 = (i6 & 896) == 256;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    function03 = function02;
                    rememberedValue2 = new LocalMapKt$$ExternalSyntheticLambda10(16, function03);
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    function03 = function02;
                }
                MenuKt.SwipeToDismissBox(rememberSwipeToDismissBoxState, rememberComposableLambda2, null, false, false, false, (Function1) rememberedValue2, Expect_jvmKt.rememberComposableLambda(691061116, new OverlayKt$$ExternalSyntheticLambda0(rememberComposableLambda, 5), gapComposer), gapComposer, 12586040, 52);
                gapComposer.end(false);
            } else {
                function03 = function02;
                gapComposer.startReplaceGroup(-95467066);
                rememberComposableLambda.invoke((Object) gapComposer, (Object) 6);
                gapComposer.end(false);
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.cell.CellDefaultKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    CellDefaultKt.m3390CellDefaultBasehdfVwu4(Function2.this, function22, function23, j, badge, cellDefaultAccessory, function0, str, z, z2, cellConfig, modifier, function03, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f3  */
    /* renamed from: CellDefaultLargeIcon-aIPZJ5k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3391CellDefaultLargeIconaIPZJ5k(final Icons icons, final String str, final long j, final ComposableLambdaImpl composableLambdaImpl, Modifier modifier, long j2, Function0 function0, String str2, boolean z, boolean z2, Function2 function2, Badge badge, CellDefaultAccessory cellDefaultAccessory, long j3, Function0 function02, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        int i5;
        final long j4;
        int i6;
        final Function0 function03;
        int i7;
        String str3;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        final Badge badge2;
        final CellDefaultAccessory cellDefaultAccessory2;
        final Function0 function04;
        final String str4;
        final boolean z4;
        GapComposer gapComposer;
        final boolean z5;
        final Function2 function22;
        final long j5;
        RecomposeScopeImpl endRestartGroup;
        boolean z6;
        int i20;
        long j6;
        long j7;
        int i21;
        long j8;
        Function0 function05;
        boolean z7;
        String str5;
        int i22;
        boolean z8;
        Function2 function23;
        Badge badge3;
        CellDefaultAccessory cellDefaultAccessory3;
        Function0 function06;
        long j9;
        long j10;
        int i23;
        boolean z9;
        long j11;
        long j12;
        long j13;
        Colors colors;
        int i24;
        icons.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(964026090);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(icons.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(j) ? 256 : 128;
        }
        int i25 = 1024;
        if ((i & 3072) == 0) {
            i4 |= gapComposer2.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        int i26 = i3 & 16;
        if (i26 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
                j4 = j2;
            } else {
                j4 = j2;
                if ((i & 196608) == 0) {
                    i4 |= gapComposer2.changed(j4) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                function03 = function0;
            } else {
                function03 = function0;
                if ((i & 1572864) == 0) {
                    i4 |= gapComposer2.changedInstance(function03) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                str3 = str2;
            } else {
                str3 = str2;
                if ((i & 12582912) == 0) {
                    i4 |= gapComposer2.changed(str3) ? 8388608 : 4194304;
                }
            }
            if ((i & 100663296) != 0) {
                if ((i3 & 256) == 0) {
                    z3 = z;
                    if (gapComposer2.changed(z3)) {
                        i24 = 67108864;
                        i4 |= i24;
                    }
                } else {
                    z3 = z;
                }
                i24 = 33554432;
                i4 |= i24;
            } else {
                z3 = z;
            }
            i8 = i3 & 512;
            if (i8 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i9 = i8;
                i4 |= gapComposer2.changed(z2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i12 = i2 | 6;
                    i11 = i10;
                } else if ((i2 & 6) == 0) {
                    i11 = i10;
                    i12 = i2 | (gapComposer2.changedInstance(function2) ? 4 : 2);
                } else {
                    i11 = i10;
                    i12 = i2;
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                } else if ((i2 & 48) == 0) {
                    i12 |= (i2 & 64) == 0 ? gapComposer2.changed(badge) : gapComposer2.changedInstance(badge) ? 32 : 16;
                }
                int i27 = i12;
                i14 = i3 & 4096;
                if (i14 != 0) {
                    i15 = i27 | MLKEMEngine.KyberPolyBytes;
                } else {
                    i15 = i27;
                    if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                        i15 |= gapComposer2.changed(cellDefaultAccessory) ? 256 : 128;
                        if ((i2 & 3072) != 0) {
                            i16 = i14;
                            if ((i3 & PKIFailureInfo.certRevoked) == 0 && gapComposer2.changed(j3)) {
                                i25 = 2048;
                            }
                            i15 |= i25;
                        } else {
                            i16 = i14;
                        }
                        int i28 = i15;
                        i17 = i3 & 16384;
                        if (i17 == 0) {
                            i18 = i28 | 24576;
                        } else {
                            int i29 = i28;
                            if ((i2 & 24576) == 0) {
                                i29 |= gapComposer2.changedInstance(function02) ? 16384 : 8192;
                            }
                            i18 = i29;
                        }
                        i19 = i4;
                        if (gapComposer2.shouldExecute(i19 & 1, (i4 & 306783379) == 306783378 || (i18 & 9363) != 9362)) {
                            gapComposer2.skipToGroupEnd();
                            badge2 = badge;
                            cellDefaultAccessory2 = cellDefaultAccessory;
                            function04 = function02;
                            str4 = str3;
                            z4 = z3;
                            gapComposer = gapComposer2;
                            z5 = z2;
                            function22 = function2;
                            j5 = j3;
                        } else {
                            gapComposer2.startDefaults();
                            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                Modifier modifier3 = i26 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                long j14 = i5 != 0 ? Color.Unspecified : j4;
                                if (i6 != 0) {
                                    function03 = null;
                                }
                                if (i7 != 0) {
                                    str3 = null;
                                }
                                if ((i3 & 256) != 0) {
                                    z6 = ((Boolean) gapComposer2.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                                    i20 = i19 & (-234881025);
                                } else {
                                    z6 = z3;
                                    i20 = i19;
                                }
                                boolean z10 = i9 != 0 ? false : z2;
                                Function2 function24 = i11 != 0 ? null : function2;
                                Badge badge4 = i13 != 0 ? null : badge;
                                CellDefaultAccessory cellDefaultAccessory4 = i16 != 0 ? null : cellDefaultAccessory;
                                if ((i3 & PKIFailureInfo.certRevoked) != 0) {
                                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    j6 = j14;
                                    j7 = colors2.component.cell.background.f171default;
                                    i18 &= -7169;
                                } else {
                                    j6 = j14;
                                    j7 = j3;
                                }
                                i21 = i18;
                                j8 = j7;
                                function05 = function03;
                                z7 = z6;
                                str5 = str3;
                                i22 = i20;
                                z8 = z10;
                                function23 = function24;
                                badge3 = badge4;
                                cellDefaultAccessory3 = cellDefaultAccessory4;
                                function06 = i17 != 0 ? null : function02;
                                modifier2 = modifier3;
                                j9 = j6;
                            } else {
                                gapComposer2.skipToGroupEnd();
                                int i30 = (i3 & 256) != 0 ? i19 & (-234881025) : i19;
                                if ((i3 & PKIFailureInfo.certRevoked) != 0) {
                                    i18 &= -7169;
                                }
                                z8 = z2;
                                function23 = function2;
                                j8 = j3;
                                function06 = function02;
                                i21 = i18;
                                i22 = i30;
                                j9 = j4;
                                function05 = function03;
                                str5 = str3;
                                z7 = z3;
                                badge3 = badge;
                                cellDefaultAccessory3 = cellDefaultAccessory;
                            }
                            gapComposer2.endDefaults();
                            if (z7) {
                                j10 = j9;
                                gapComposer2.startReplaceGroup(-1144436727);
                                if (j10 != 16) {
                                    i23 = i21;
                                    z9 = false;
                                    j11 = j10;
                                } else {
                                    Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    if (colors3 == null) {
                                        z9 = false;
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        z9 = false;
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                        colors = colors3;
                                    }
                                    i23 = i21;
                                    j11 = colors.semantic.icon.standard;
                                }
                                gapComposer2.end(z9);
                            } else {
                                j10 = j9;
                                i23 = i21;
                                z9 = false;
                                gapComposer2.startReplaceGroup(-1144353058);
                                Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors4 == null) {
                                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                j11 = colors4.semantic.icon.extraSubtle;
                                gapComposer2.end(false);
                            }
                            if (z7) {
                                j12 = j11;
                                gapComposer2.startReplaceGroup(-1144249828);
                                gapComposer2.end(z9);
                                j13 = j;
                            } else {
                                j12 = j11;
                                gapComposer2.startReplaceGroup(-1144215139);
                                Colors colors5 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors5 == null) {
                                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z9);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(z9);
                                }
                                j13 = colors5.semantic.background.subtle;
                                gapComposer2.end(z9);
                            }
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-820900856, new TaxToolTipViewKt$$ExternalSyntheticLambda1(j13, icons, str, j12), gapComposer2);
                            int i31 = i22 >> 6;
                            int i32 = i22 >> 9;
                            int i33 = (i31 & 896) | (i31 & 112) | 6 | (i32 & 7168) | (57344 & i32) | (458752 & i32) | (i32 & 3670016);
                            int i34 = i23 << 21;
                            m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, composableLambdaImpl, modifier2, function05, str5, z7, z8, function23, badge3, cellDefaultAccessory3, j8, function06, gapComposer2, i33 | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), (i23 >> 9) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                            function04 = function06;
                            gapComposer = gapComposer2;
                            j5 = j8;
                            badge2 = badge3;
                            cellDefaultAccessory2 = cellDefaultAccessory3;
                            z5 = z8;
                            function22 = function23;
                            str4 = str5;
                            z4 = z7;
                            function03 = function05;
                            j4 = j10;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.cell.CellDefaultKt$$ExternalSyntheticLambda21
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                                    CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(Icons.this, str, j, composableLambdaImpl, modifier2, j4, function03, str4, z4, z5, function22, badge2, cellDefaultAccessory2, j5, function04, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                }
                if ((i2 & 3072) != 0) {
                }
                int i282 = i15;
                i17 = i3 & 16384;
                if (i17 == 0) {
                }
                i19 = i4;
                if (gapComposer2.shouldExecute(i19 & 1, (i4 & 306783379) == 306783378 || (i18 & 9363) != 9362)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            int i272 = i12;
            i14 = i3 & 4096;
            if (i14 != 0) {
            }
            if ((i2 & 3072) != 0) {
            }
            int i2822 = i15;
            i17 = i3 & 16384;
            if (i17 == 0) {
            }
            i19 = i4;
            if (gapComposer2.shouldExecute(i19 & 1, (i4 & 306783379) == 306783378 || (i18 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        if ((i & 100663296) != 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        int i2722 = i12;
        i14 = i3 & 4096;
        if (i14 != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        int i28222 = i15;
        i17 = i3 & 16384;
        if (i17 == 0) {
        }
        i19 = i4;
        if (gapComposer2.shouldExecute(i19 & 1, (i4 & 306783379) == 306783378 || (i18 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: CellDefaultLargeIcon-ygcbOzY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3392CellDefaultLargeIconygcbOzY(final Function2 function2, final ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, String str, boolean z, boolean z2, Function2 function22, Badge badge, CellDefaultAccessory cellDefaultAccessory, long j, Function0 function02, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        ComposableLambdaImpl composableLambdaImpl2;
        Modifier modifier2;
        int i5;
        Function0 function03;
        int i6;
        boolean z3;
        int i7;
        final boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        GapComposer gapComposer;
        final Function2 function23;
        final Badge badge2;
        final Function0 function04;
        final boolean z5;
        final Modifier modifier3;
        final Function0 function05;
        final String str2;
        final CellDefaultAccessory cellDefaultAccessory2;
        final long j2;
        RecomposeScopeImpl endRestartGroup;
        CellDefaultAccessory cellDefaultAccessory3;
        Modifier modifier4;
        long j3;
        Function0 function06;
        Modifier modifier5;
        long j4;
        Function2 function24;
        boolean z6;
        boolean z7;
        String str3;
        Function0 function07;
        int i17;
        Badge badge3;
        int i18;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1959613396);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i4 |= gapComposer2.changedInstance(composableLambdaImpl2) ? 32 : 16;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                function03 = function0;
                i4 |= gapComposer2.changedInstance(function03) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= gapComposer2.changed(str) ? 16384 : PKIFailureInfo.certRevoked;
                    if ((i & 196608) != 0) {
                        z3 = z;
                        i4 |= ((i3 & 32) == 0 && gapComposer2.changed(z3)) ? PKIFailureInfo.unsupportedVersion : 65536;
                    } else {
                        z3 = z;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                        z4 = z2;
                    } else {
                        z4 = z2;
                        if ((i & 1572864) == 0) {
                            i4 |= gapComposer2.changed(z4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        }
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i9 = i4 | (gapComposer2.changedInstance(function22) ? 8388608 : 4194304);
                        i10 = i3 & 256;
                        int i20 = 100663296;
                        if (i10 == 0) {
                            if ((i & 100663296) == 0) {
                                i20 = (i & 134217728) == 0 ? gapComposer2.changed(badge) : gapComposer2.changedInstance(badge) ? 67108864 : 33554432;
                            }
                            i11 = i3 & 512;
                            if (i11 == 0) {
                                i9 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i12 = i11;
                                i9 |= gapComposer2.changed(cellDefaultAccessory) ? PKIFailureInfo.duplicateCertReq : 268435456;
                                if ((i2 & 6) == 0) {
                                    if ((i3 & 1024) == 0) {
                                        i13 = i10;
                                        if (gapComposer2.changed(j)) {
                                            i18 = 4;
                                            i14 = i2 | i18;
                                        }
                                    } else {
                                        i13 = i10;
                                    }
                                    i18 = 2;
                                    i14 = i2 | i18;
                                } else {
                                    i13 = i10;
                                    i14 = i2;
                                }
                                int i21 = i13;
                                i15 = i3 & 2048;
                                if (i15 != 0) {
                                    i14 |= 48;
                                } else if ((i2 & 48) == 0) {
                                    i16 = i15;
                                    i14 |= gapComposer2.changedInstance(function02) ? 32 : 16;
                                    if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i14 & 19) != 18)) {
                                        gapComposer = gapComposer2;
                                        gapComposer.skipToGroupEnd();
                                        function23 = function22;
                                        badge2 = badge;
                                        function04 = function02;
                                        z5 = z3;
                                        modifier3 = modifier2;
                                        function05 = function03;
                                        str2 = str;
                                        cellDefaultAccessory2 = cellDefaultAccessory;
                                        j2 = j;
                                    } else {
                                        gapComposer2.startDefaults();
                                        if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                            Modifier modifier6 = i19 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                            if (i5 != 0) {
                                                function03 = null;
                                            }
                                            String str4 = i6 != 0 ? null : str;
                                            if ((i3 & 32) != 0) {
                                                z3 = ((Boolean) gapComposer2.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                                                i9 &= -458753;
                                            }
                                            if (i7 != 0) {
                                                z4 = false;
                                            }
                                            Function2 function25 = i8 != 0 ? null : function22;
                                            Badge badge4 = i21 != 0 ? null : badge;
                                            cellDefaultAccessory3 = i12 != 0 ? null : cellDefaultAccessory;
                                            if ((i3 & 1024) != 0) {
                                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                                } else {
                                                    gapComposer2.startReplaceGroup(-1762997739);
                                                    gapComposer2.end(false);
                                                }
                                                modifier4 = modifier6;
                                                j3 = colors.component.cell.background.f171default;
                                                i14 &= -15;
                                            } else {
                                                modifier4 = modifier6;
                                                j3 = j;
                                            }
                                            if (i16 != 0) {
                                                modifier5 = modifier4;
                                                j4 = j3;
                                                function24 = function25;
                                                z6 = z3;
                                                z7 = z4;
                                                str3 = str4;
                                                function07 = function03;
                                                i17 = i9;
                                                function06 = null;
                                            } else {
                                                function06 = function02;
                                                modifier5 = modifier4;
                                                j4 = j3;
                                                function24 = function25;
                                                z6 = z3;
                                                z7 = z4;
                                                str3 = str4;
                                                function07 = function03;
                                                i17 = i9;
                                            }
                                            badge3 = badge4;
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                            if ((i3 & 32) != 0) {
                                                i9 &= -458753;
                                            }
                                            if ((i3 & 1024) != 0) {
                                                i14 &= -15;
                                            }
                                            str3 = str;
                                            function24 = function22;
                                            cellDefaultAccessory3 = cellDefaultAccessory;
                                            j4 = j;
                                            function06 = function02;
                                            z6 = z3;
                                            z7 = z4;
                                            modifier5 = modifier2;
                                            function07 = function03;
                                            i17 = i9;
                                            badge3 = badge;
                                        }
                                        gapComposer2.endDefaults();
                                        int i22 = i17 << 9;
                                        gapComposer = gapComposer2;
                                        m3390CellDefaultBasehdfVwu4(function2, composableLambdaImpl2, function24, j4, badge3, cellDefaultAccessory3 == null ? CellDefaultAccessory.None.INSTANCE : cellDefaultAccessory3, function07, str3, z6, z7, CellConfig.LargeIcon, modifier5, function06, gapComposer, (i17 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i17 >> 15) & 896) | ((i14 << 9) & 7168) | ((i17 >> 12) & 57344) | (3670016 & i22) | (29360128 & i22) | (234881024 & i22) | (i22 & 1879048192), ((i17 >> 3) & 112) | 6 | ((i14 << 3) & 896));
                                        cellDefaultAccessory2 = cellDefaultAccessory3;
                                        function23 = function24;
                                        j2 = j4;
                                        badge2 = badge3;
                                        function05 = function07;
                                        str2 = str3;
                                        z5 = z6;
                                        z4 = z7;
                                        modifier3 = modifier5;
                                        function04 = function06;
                                    }
                                    endRestartGroup = gapComposer.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.cell.CellDefaultKt$$ExternalSyntheticLambda19
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                ((Integer) obj2).getClass();
                                                int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                                                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Function2.this, composableLambdaImpl, modifier3, function05, str2, z5, z4, function23, badge2, cellDefaultAccessory2, j2, function04, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        return;
                                    }
                                    return;
                                }
                                i16 = i15;
                                if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i14 & 19) != 18)) {
                                }
                                endRestartGroup = gapComposer.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i12 = i11;
                            if ((i2 & 6) == 0) {
                            }
                            int i212 = i13;
                            i15 = i3 & 2048;
                            if (i15 != 0) {
                            }
                            i16 = i15;
                            if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i14 & 19) != 18)) {
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i9 |= i20;
                        i11 = i3 & 512;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        if ((i2 & 6) == 0) {
                        }
                        int i2122 = i13;
                        i15 = i3 & 2048;
                        if (i15 != 0) {
                        }
                        i16 = i15;
                        if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i14 & 19) != 18)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i4;
                    i10 = i3 & 256;
                    int i202 = 100663296;
                    if (i10 == 0) {
                    }
                    i9 |= i202;
                    i11 = i3 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if ((i2 & 6) == 0) {
                    }
                    int i21222 = i13;
                    i15 = i3 & 2048;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i14 & 19) != 18)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((i & 196608) != 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i4;
                i10 = i3 & 256;
                int i2022 = 100663296;
                if (i10 == 0) {
                }
                i9 |= i2022;
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i2 & 6) == 0) {
                }
                int i212222 = i13;
                i15 = i3 & 2048;
                if (i15 != 0) {
                }
                i16 = i15;
                if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i14 & 19) != 18)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function03 = function0;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((i & 196608) != 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i4;
            i10 = i3 & 256;
            int i20222 = 100663296;
            if (i10 == 0) {
            }
            i9 |= i20222;
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i2 & 6) == 0) {
            }
            int i2122222 = i13;
            i15 = i3 & 2048;
            if (i15 != 0) {
            }
            i16 = i15;
            if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i14 & 19) != 18)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function03 = function0;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((i & 196608) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i4;
        i10 = i3 & 256;
        int i202222 = 100663296;
        if (i10 == 0) {
        }
        i9 |= i202222;
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i2 & 6) == 0) {
        }
        int i21222222 = i13;
        i15 = i3 & 2048;
        if (i15 != 0) {
        }
        i16 = i15;
        if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i14 & 19) != 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: CellDefaultNoIcon-pX9LQoI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3393CellDefaultNoIconpX9LQoI(Function2 function2, Modifier modifier, Function0 function0, boolean z, boolean z2, Function2 function22, Badge badge, long j, CellDefaultAccessory cellDefaultAccessory, Function0 function02, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0 function03;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        GapComposer gapComposer;
        Badge badge2;
        CellDefaultAccessory cellDefaultAccessory2;
        Modifier modifier3;
        Function0 function04;
        boolean z5;
        boolean z6;
        Function2 function23;
        long j2;
        Function0 function05;
        RecomposeScopeImpl endRestartGroup;
        boolean z7;
        long j3;
        CellDefaultAccessory cellDefaultAccessory3;
        Badge badge3;
        int i13;
        Function0 function06;
        boolean z8;
        Modifier modifier4;
        Function2 function24;
        boolean z9;
        int i14;
        int i15;
        Function0 function07;
        long j4;
        int i16;
        int i17;
        int i18;
        function2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(695603061);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i19 = i2 & 2;
        if (i19 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                function03 = function0;
                i3 |= gapComposer2.changedInstance(function03) ? 256 : 128;
                int i20 = i3 | 3072;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        z3 = z;
                        if (gapComposer2.changed(z3)) {
                            i18 = 16384;
                            i20 |= i18;
                        }
                    } else {
                        z3 = z;
                    }
                    i18 = PKIFailureInfo.certRevoked;
                    i20 |= i18;
                } else {
                    z3 = z;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i20 |= 196608;
                } else if ((196608 & i) == 0) {
                    z4 = z2;
                    i20 |= gapComposer2.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i20 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i20 |= gapComposer2.changedInstance(function22) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                    i7 = i2 & 128;
                    int i21 = 12582912;
                    if (i7 == 0) {
                        if ((i & 12582912) == 0) {
                            i21 = (i & 16777216) == 0 ? gapComposer2.changed(badge) : gapComposer2.changedInstance(badge) ? 8388608 : 4194304;
                        }
                        if ((i & 100663296) == 0) {
                            if ((i2 & 256) == 0) {
                                i16 = i20;
                                if (gapComposer2.changed(j)) {
                                    i17 = 67108864;
                                    i8 = i16 | i17;
                                }
                            } else {
                                i16 = i20;
                            }
                            i17 = 33554432;
                            i8 = i16 | i17;
                        } else {
                            i8 = i20;
                        }
                        i9 = i8;
                        i10 = i2 & 512;
                        if (i10 != 0) {
                            i9 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i11 = i10;
                            i9 |= gapComposer2.changed(cellDefaultAccessory) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            int i22 = i2 & 1024;
                            i12 = i22 == 0 ? 6 : gapComposer2.changedInstance(function02) ? 4 : 2;
                            if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i12 & 3) != 2)) {
                                gapComposer = gapComposer2;
                                gapComposer.skipToGroupEnd();
                                badge2 = badge;
                                cellDefaultAccessory2 = cellDefaultAccessory;
                                modifier3 = modifier2;
                                function04 = function03;
                                z5 = z3;
                                z6 = z4;
                                function23 = function22;
                                j2 = j;
                                function05 = function02;
                            } else {
                                gapComposer2.startDefaults();
                                if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                    if (i19 != 0) {
                                        modifier2 = Modifier.Companion.$$INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function03 = null;
                                    }
                                    if ((i2 & 16) != 0) {
                                        z7 = ((Boolean) gapComposer2.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                                        i9 &= -57345;
                                    } else {
                                        z7 = z3;
                                    }
                                    if (i5 != 0) {
                                        z4 = false;
                                    }
                                    Function2 function25 = i6 != 0 ? null : function22;
                                    Badge badge4 = i7 != 0 ? null : badge;
                                    if ((i2 & 256) != 0) {
                                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                        } else {
                                            gapComposer2.startReplaceGroup(-1762997739);
                                            gapComposer2.end(false);
                                        }
                                        j3 = colors.component.cell.background.f171default;
                                        i9 &= -234881025;
                                    } else {
                                        j3 = j;
                                    }
                                    cellDefaultAccessory3 = i11 != 0 ? null : cellDefaultAccessory;
                                    if (i22 != 0) {
                                        badge3 = badge4;
                                        i13 = 6;
                                        function06 = null;
                                    } else {
                                        badge3 = badge4;
                                        i13 = 6;
                                        function06 = function02;
                                    }
                                    z8 = z7;
                                    modifier4 = modifier2;
                                    function24 = function25;
                                    z9 = z4;
                                    i14 = i9;
                                    i15 = i12;
                                    function07 = function03;
                                    j4 = j3;
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i9 &= -57345;
                                    }
                                    if ((i2 & 256) != 0) {
                                        i9 &= -234881025;
                                    }
                                    function24 = function22;
                                    cellDefaultAccessory3 = cellDefaultAccessory;
                                    function06 = function02;
                                    modifier4 = modifier2;
                                    z8 = z3;
                                    z9 = z4;
                                    i14 = i9;
                                    i13 = 6;
                                    i15 = i12;
                                    badge3 = badge;
                                    j4 = j;
                                    function07 = function03;
                                }
                                gapComposer2.endDefaults();
                                int i23 = i14 << 12;
                                gapComposer = gapComposer2;
                                m3390CellDefaultBasehdfVwu4(null, function2, function24, j4, badge3, cellDefaultAccessory3 == null ? CellDefaultAccessory.None.INSTANCE : cellDefaultAccessory3, function07, null, z8, z9, CellConfig.SmallOrNoIcon, modifier4, function06, gapComposer, ((i14 << 3) & 112) | i13 | ((i14 >> 12) & 896) | ((i14 >> 15) & 7168) | ((i14 >> 9) & 57344) | (3670016 & i23) | (29360128 & i23) | (234881024 & i23) | (i23 & 1879048192), (i14 & 112) | i13 | ((i15 << i13) & 896));
                                cellDefaultAccessory2 = cellDefaultAccessory3;
                                function23 = function24;
                                j2 = j4;
                                badge2 = badge3;
                                function04 = function07;
                                z5 = z8;
                                z6 = z9;
                                modifier3 = modifier4;
                                function05 = function06;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new CellDefaultKt$$ExternalSyntheticLambda0(function2, modifier3, function04, z5, z6, function23, badge2, j2, cellDefaultAccessory2, function05, i, i2);
                                return;
                            }
                            return;
                        }
                        i11 = i10;
                        int i222 = i2 & 1024;
                        if (i222 == 0) {
                        }
                        if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i12 & 3) != 2)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i20 |= i21;
                    if ((i & 100663296) == 0) {
                    }
                    i9 = i8;
                    i10 = i2 & 512;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    int i2222 = i2 & 1024;
                    if (i2222 == 0) {
                    }
                    if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i12 & 3) != 2)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                int i212 = 12582912;
                if (i7 == 0) {
                }
                i20 |= i212;
                if ((i & 100663296) == 0) {
                }
                i9 = i8;
                i10 = i2 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                int i22222 = i2 & 1024;
                if (i22222 == 0) {
                }
                if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i12 & 3) != 2)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function03 = function0;
            int i202 = i3 | 3072;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            int i2122 = 12582912;
            if (i7 == 0) {
            }
            i202 |= i2122;
            if ((i & 100663296) == 0) {
            }
            i9 = i8;
            i10 = i2 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            int i222222 = i2 & 1024;
            if (i222222 == 0) {
            }
            if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i12 & 3) != 2)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function03 = function0;
        int i2022 = i3 | 3072;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        int i21222 = 12582912;
        if (i7 == 0) {
        }
        i2022 |= i21222;
        if ((i & 100663296) == 0) {
        }
        i9 = i8;
        i10 = i2 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        int i2222222 = i2 & 1024;
        if (i2222222 == 0) {
        }
        if (gapComposer2.shouldExecute(i9 & 1, (i9 & 306783379) == 306783378 || (i12 & 3) != 2)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: CellDefaultSmallIcon-ygcbOzY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3394CellDefaultSmallIconygcbOzY(Function2 function2, Function2 function22, Modifier modifier, Function0 function0, boolean z, boolean z2, Function2 function23, Badge badge, CellDefaultAccessory cellDefaultAccessory, long j, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0 function02;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        Function2 function24;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        GapComposer gapComposer;
        Function2 function25;
        Modifier modifier3;
        Function0 function03;
        boolean z5;
        boolean z6;
        Badge badge2;
        CellDefaultAccessory cellDefaultAccessory2;
        long j2;
        RecomposeScopeImpl endRestartGroup;
        boolean z7;
        CellDefaultAccessory cellDefaultAccessory3;
        long j3;
        Badge badge3;
        Function2 function26;
        boolean z8;
        Modifier modifier4;
        Function0 function04;
        boolean z9;
        int i14;
        long j4;
        int i15;
        function22.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1821258464);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function22) ? 32 : 16;
        }
        int i16 = i2 & 4;
        if (i16 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= gapComposer2.changedInstance(function02) ? 2048 : 1024;
                int i17 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        z3 = z;
                        if (gapComposer2.changed(z3)) {
                            i15 = PKIFailureInfo.unsupportedVersion;
                            i17 |= i15;
                        }
                    } else {
                        z3 = z;
                    }
                    i15 = 65536;
                    i17 |= i15;
                } else {
                    z3 = z;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i17 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    z4 = z2;
                    i17 |= gapComposer2.changed(z4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i17 |= 12582912;
                        function24 = function23;
                    } else {
                        function24 = function23;
                        if ((i & 12582912) == 0) {
                            i17 |= gapComposer2.changedInstance(function24) ? 8388608 : 4194304;
                        }
                    }
                    i7 = i17;
                    i8 = i2 & 256;
                    int i18 = 100663296;
                    if (i8 == 0) {
                        if ((i & 100663296) == 0) {
                            i18 = (i & 134217728) == 0 ? gapComposer2.changed(badge) : gapComposer2.changedInstance(badge) ? 67108864 : 33554432;
                        }
                        i9 = i2 & 512;
                        if (i9 != 0) {
                            i7 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i10 = i9;
                            i7 |= gapComposer2.changed(cellDefaultAccessory) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            if ((i2 & 1024) != 0) {
                                i11 = i6;
                                if (gapComposer2.changed(j)) {
                                    i12 = 4;
                                    int i19 = 48;
                                    i13 = i12 | 48;
                                    int i20 = i11;
                                    if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i13 & 19) != 18)) {
                                        gapComposer2.startDefaults();
                                        if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                            if (i16 != 0) {
                                                modifier2 = Modifier.Companion.$$INSTANCE;
                                            }
                                            if (i4 != 0) {
                                                function02 = null;
                                            }
                                            if ((i2 & 32) != 0) {
                                                z7 = ((Boolean) gapComposer2.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                                                i7 &= -458753;
                                            } else {
                                                z7 = z3;
                                            }
                                            if (i5 != 0) {
                                                z4 = false;
                                            }
                                            if (i20 != 0) {
                                                function24 = null;
                                            }
                                            Badge badge4 = i8 != 0 ? null : badge;
                                            cellDefaultAccessory3 = i10 == 0 ? cellDefaultAccessory : null;
                                            if ((i2 & 1024) != 0) {
                                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                                } else {
                                                    gapComposer2.startReplaceGroup(-1762997739);
                                                    gapComposer2.end(false);
                                                }
                                                j3 = colors.component.cell.background.f171default;
                                            } else {
                                                j3 = j;
                                                i19 = i13;
                                            }
                                            badge3 = badge4;
                                            function26 = function24;
                                            z8 = z7;
                                            modifier4 = modifier2;
                                            function04 = function02;
                                            z9 = z4;
                                            i14 = i7;
                                            j4 = j3;
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                            if ((i2 & 32) != 0) {
                                                i7 &= -458753;
                                            }
                                            badge3 = badge;
                                            if ((i2 & 1024) != 0) {
                                                cellDefaultAccessory3 = cellDefaultAccessory;
                                                function26 = function24;
                                                modifier4 = modifier2;
                                                function04 = function02;
                                                z8 = z3;
                                                z9 = z4;
                                                i14 = i7;
                                                j4 = j;
                                            } else {
                                                cellDefaultAccessory3 = cellDefaultAccessory;
                                                modifier4 = modifier2;
                                                function04 = function02;
                                                z8 = z3;
                                                z9 = z4;
                                                i19 = i13;
                                                i14 = i7;
                                                j4 = j;
                                                function26 = function24;
                                            }
                                        }
                                        gapComposer2.endDefaults();
                                        int i21 = i14 << 9;
                                        gapComposer = gapComposer2;
                                        m3390CellDefaultBasehdfVwu4(function2, function22, function26, j4, badge3, cellDefaultAccessory3 == null ? CellDefaultAccessory.None.INSTANCE : cellDefaultAccessory3, function04, null, z8, z9, CellConfig.SmallOrNoIcon, modifier4, null, gapComposer, (i14 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i14 >> 15) & 896) | ((i19 << 9) & 7168) | ((i14 >> 12) & 57344) | (3670016 & i21) | (29360128 & i21) | (234881024 & i21) | (i21 & 1879048192), ((i14 >> 3) & 112) | 390);
                                        cellDefaultAccessory2 = cellDefaultAccessory3;
                                        function25 = function26;
                                        j2 = j4;
                                        badge2 = badge3;
                                        function03 = function04;
                                        z5 = z8;
                                        z6 = z9;
                                        modifier3 = modifier4;
                                    } else {
                                        gapComposer = gapComposer2;
                                        gapComposer.skipToGroupEnd();
                                        function25 = function24;
                                        modifier3 = modifier2;
                                        function03 = function02;
                                        z5 = z3;
                                        z6 = z4;
                                        badge2 = badge;
                                        cellDefaultAccessory2 = cellDefaultAccessory;
                                        j2 = j;
                                    }
                                    endRestartGroup = gapComposer.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.block = new CellDefaultKt$$ExternalSyntheticLambda0(function2, function22, modifier3, function03, z5, z6, function25, badge2, cellDefaultAccessory2, j2, i, i2);
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                i11 = i6;
                            }
                            i12 = 2;
                            int i192 = 48;
                            i13 = i12 | 48;
                            int i202 = i11;
                            if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i13 & 19) != 18)) {
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i10 = i9;
                        if ((i2 & 1024) != 0) {
                        }
                        i12 = 2;
                        int i1922 = 48;
                        i13 = i12 | 48;
                        int i2022 = i11;
                        if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i13 & 19) != 18)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i7 |= i18;
                    i9 = i2 & 512;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    if ((i2 & 1024) != 0) {
                    }
                    i12 = 2;
                    int i19222 = 48;
                    i13 = i12 | 48;
                    int i20222 = i11;
                    if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i13 & 19) != 18)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i17;
                i8 = i2 & 256;
                int i182 = 100663296;
                if (i8 == 0) {
                }
                i7 |= i182;
                i9 = i2 & 512;
                if (i9 != 0) {
                }
                i10 = i9;
                if ((i2 & 1024) != 0) {
                }
                i12 = 2;
                int i192222 = 48;
                i13 = i12 | 48;
                int i202222 = i11;
                if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i13 & 19) != 18)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function02 = function0;
            int i172 = i3 | 24576;
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i172;
            i8 = i2 & 256;
            int i1822 = 100663296;
            if (i8 == 0) {
            }
            i7 |= i1822;
            i9 = i2 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i2 & 1024) != 0) {
            }
            i12 = 2;
            int i1922222 = 48;
            i13 = i12 | 48;
            int i2022222 = i11;
            if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i13 & 19) != 18)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        int i1722 = i3 | 24576;
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i1722;
        i8 = i2 & 256;
        int i18222 = 100663296;
        if (i8 == 0) {
        }
        i7 |= i18222;
        i9 = i2 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i2 & 1024) != 0) {
        }
        i12 = 2;
        int i19222222 = 48;
        i13 = i12 | 48;
        int i20222222 = i11;
        if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i13 & 19) != 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r29v0, types: [androidx.compose.runtime.internal.ComposableLambdaImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Object, kotlin.Function, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CellSearchResult(Function2 function2, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, Function2 function22, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0 function02;
        Modifier modifier3;
        Function0 function03;
        RecomposeScopeImpl endRestartGroup;
        Modifier wrapContentHeight;
        Modifier modifier4;
        boolean z;
        Throwable th;
        RealCellSearchResultAccessoryScope realCellSearchResultAccessoryScope;
        Modifier.Companion companion;
        Modifier modifier5;
        RealCellSearchResultAccessoryScope realCellSearchResultAccessoryScope2;
        Modifier.Companion companion2;
        boolean z2;
        ?? r6;
        boolean z3;
        boolean z4;
        BiasAlignment biasAlignment = Alignment.Companion.TopStart;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2135645639);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
                }
                if ((196608 & i) == 0) {
                    i3 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                    if (i5 != 0) {
                        modifier2 = companion3;
                    }
                    Function0 function04 = i4 != 0 ? null : function02;
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new RealCellSearchResultAccessoryScope();
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    RealCellSearchResultAccessoryScope realCellSearchResultAccessoryScope3 = (RealCellSearchResultAccessoryScope) rememberedValue;
                    if (function1 == 0) {
                        realCellSearchResultAccessoryScope3.setContent(null);
                    } else {
                        function1.invoke(realCellSearchResultAccessoryScope3);
                    }
                    Modifier modifier6 = modifier2;
                    wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    int i6 = i3;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m276defaultMinSizeVpY3zN4$default(wrapContentHeight, RecyclerView.DECELERATION_RATE, 80.0f, 1), Strings.getColors(gapComposer).component.cell.background.f171default, ColorKt.RectangleShape);
                    if (function04 == null) {
                        gapComposer.startReplaceGroup(-1667988437);
                        gapComposer.end(false);
                        z = false;
                        realCellSearchResultAccessoryScope = realCellSearchResultAccessoryScope3;
                        companion = companion3;
                        modifier4 = modifier6;
                        modifier5 = null;
                        th = null;
                    } else {
                        gapComposer.startReplaceGroup(-1667988436);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                        modifier4 = modifier6;
                        z = false;
                        th = null;
                        realCellSearchResultAccessoryScope = realCellSearchResultAccessoryScope3;
                        Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(companion3, mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15), false, null, null, function04, 28);
                        companion = companion3;
                        gapComposer.end(false);
                        modifier5 = m182clickableO2vRcR0$default;
                    }
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU.then(modifier5 == null ? companion : modifier5), ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, 16.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw th;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    if (function2 != null) {
                        gapComposer.startReplaceGroup(-941605137);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        realCellSearchResultAccessoryScope2 = realCellSearchResultAccessoryScope;
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
                        gapComposer.startReusableNode();
                        companion2 = companion;
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        r6 = 0;
                        z2 = true;
                        Recorder$$ExternalSyntheticOutline2.m(i6 & 14, function2, gapComposer, true, false);
                    } else {
                        realCellSearchResultAccessoryScope2 = realCellSearchResultAccessoryScope;
                        companion2 = companion;
                        z2 = true;
                        gapComposer.startReplaceGroup(-941576307);
                        gapComposer.end(z);
                        r6 = z;
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, z2);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, r6);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    composableLambdaImpl.invoke(gapComposer, Integer.valueOf((i6 >> 3) & 14));
                    Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).bodySmall), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, ArcadeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(256751327, new ToastKt$$ExternalSyntheticLambda11(8, function22), gapComposer), gapComposer, 56);
                    gapComposer.end(true);
                    if (function1 != 0) {
                        gapComposer.startReplaceGroup(-941268105);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, companion2);
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                        Function2 function23 = (Function2) realCellSearchResultAccessoryScope2.content$delegate.getValue();
                        if (function23 == null) {
                            gapComposer.startReplaceGroup(-447046372);
                            z4 = false;
                        } else {
                            z4 = false;
                            gapComposer.startReplaceGroup(-291515515);
                            function23.invoke(gapComposer, 0);
                        }
                        gapComposer.end(z4);
                        z3 = true;
                        gapComposer.end(true);
                        gapComposer.end(z4);
                    } else {
                        z3 = true;
                        gapComposer.startReplaceGroup(-941216211);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z3);
                    function03 = function04;
                    modifier3 = modifier4;
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    function03 = function02;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1((Object) function2, (ComposableLambdaImpl) composableLambdaImpl, modifier3, (Function) function03, function22, (Function) function1, i, i2, 13);
                    return;
                }
                return;
            }
            function02 = function0;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CellSearchResult(Function2 function2, String str, Modifier modifier, Function0 function0, String str2, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str3;
        int i5;
        Function1 function12;
        Function1 function13;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(761770397);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str3 = str2;
                i3 |= gapComposer.changed(str3) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    function12 = function1;
                    i3 |= gapComposer.changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536;
                    if (!gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                        Modifier modifier3 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        ComposableLambdaImpl composableLambdaImpl = null;
                        if (i4 != 0) {
                            str3 = null;
                        }
                        if (i5 != 0) {
                            function12 = null;
                        }
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(290589640, new ToastKt$$ExternalSyntheticLambda1(str, 27), gapComposer);
                        if (str3 == null) {
                            gapComposer.startReplaceGroup(-704926384);
                        } else {
                            gapComposer.startReplaceGroup(-704926383);
                            composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-900145648, new ToastKt$$ExternalSyntheticLambda1(str3, 28), gapComposer);
                        }
                        gapComposer.end(false);
                        Function1 function14 = function12;
                        CellSearchResult(function2, rememberComposableLambda, modifier3, function0, composableLambdaImpl, function14, gapComposer, (i3 & 14) | 48 | (i3 & 896) | (i3 & 7168) | (i3 & 458752), 0);
                        modifier2 = modifier3;
                        function13 = function14;
                    } else {
                        gapComposer.skipToGroupEnd();
                        function13 = function12;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(function2, str, modifier2, function0, str3, function13, i, i2, 12);
                        return;
                    }
                    return;
                }
                function12 = function1;
                if (!gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str3 = str2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function12 = function1;
            if (!gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str3 = str2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function12 = function1;
        if (!gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
