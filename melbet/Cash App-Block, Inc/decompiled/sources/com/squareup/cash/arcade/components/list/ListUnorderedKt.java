package com.squareup.cash.arcade.components.list;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.toolbar.LocalToolbarKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class ListUnorderedKt {
    public static final AtomicInteger nodeId = new AtomicInteger();

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListUnordered(Modifier modifier, ListUnorderedState listUnorderedState, ListUnorderedProminence listUnorderedProminence, ListUnorderedSize listUnorderedSize, float f, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        ListUnorderedState listUnorderedState2;
        float f2;
        ListUnorderedProminence listUnorderedProminence2;
        Modifier modifier3;
        ListUnorderedState listUnorderedState3;
        ListUnorderedSize listUnorderedSize2;
        RecomposeScopeImpl endRestartGroup;
        ListUnorderedProminence listUnorderedProminence3;
        ListUnorderedSize listUnorderedSize3;
        float f3;
        Modifier wrapContentHeight;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1900141931);
        int i5 = i2 & 1;
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
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                listUnorderedState2 = listUnorderedState;
                if (gapComposer.changed(listUnorderedState2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                listUnorderedState2 = listUnorderedState;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            listUnorderedState2 = listUnorderedState;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(listUnorderedProminence == null ? -1 : listUnorderedProminence.ordinal()) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(listUnorderedSize != null ? listUnorderedSize.ordinal() : -1) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            f2 = f;
            i3 |= gapComposer.changed(f2) ? 16384 : PKIFailureInfo.certRevoked;
            if ((196608 & i) == 0) {
                i3 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                gapComposer.skipToGroupEnd();
                listUnorderedProminence2 = listUnorderedProminence;
                modifier3 = modifier2;
                listUnorderedState3 = listUnorderedState2;
                listUnorderedSize2 = listUnorderedSize;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        listUnorderedState3 = rememberListUnorderedState(gapComposer);
                        i3 &= -113;
                    } else {
                        listUnorderedState3 = listUnorderedState2;
                    }
                    listUnorderedProminence3 = i6 != 0 ? ListUnorderedProminence.Standard : listUnorderedProminence;
                    listUnorderedSize3 = i7 != 0 ? ListUnorderedSize.Compact : listUnorderedSize;
                    if (i8 != 0) {
                        f2 = Float.NaN;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    listUnorderedSize3 = listUnorderedSize;
                    modifier3 = modifier2;
                    listUnorderedState3 = listUnorderedState2;
                    listUnorderedProminence3 = listUnorderedProminence;
                }
                gapComposer.endDefaults();
                int ordinal = listUnorderedSize3.ordinal();
                if (ordinal == 0) {
                    f3 = 8.0f;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    f3 = 24.0f;
                }
                wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier3, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(f3, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, wrapContentHeight);
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
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                composableLambdaImpl.invoke(new ListUnorderedScope(listUnorderedState3, listUnorderedProminence3, f2), gapComposer, Integer.valueOf((i3 >> 12) & 112));
                gapComposer.end(true);
                listUnorderedProminence2 = listUnorderedProminence3;
                listUnorderedSize2 = listUnorderedSize3;
            }
            float f4 = f2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalToolbarKt$$ExternalSyntheticLambda1(modifier3, listUnorderedState3, listUnorderedProminence2, listUnorderedSize2, f4, composableLambdaImpl, i, i2, 1);
                return;
            }
            return;
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        float f42 = f2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x016f, code lost:
    
        if (r20 != com.squareup.cash.arcade.components.list.ListUnorderedProminence.Standard) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListUnorderedItem(final ListUnorderedState listUnorderedState, ListUnorderedProminence listUnorderedProminence, final float f, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, final Function2 function2, Function2 function22, Function2 function23, Composer composer, int i) {
        int i2;
        TextStyle textStyle;
        Colors colors;
        final Function2 function24 = function22;
        Function2 function25 = function23;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1807314595);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(listUnorderedState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(listUnorderedProminence.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(function24) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changedInstance(function25) ? 8388608 : 4194304;
        }
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Integer.valueOf(nodeId.incrementAndGet());
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final int intValue = ((Number) rememberedValue).intValue();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new NavBarBinding$$ExternalSyntheticLambda2(11);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SemanticsModifierKt.semantics(fillMaxWidth, true, (Function1) rememberedValue2), ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2);
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MeasurePolicy() { // from class: com.squareup.cash.arcade.components.list.ListUnorderedKt$ListUnorderedItem$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, final long j) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        Measurable measurable;
                        final Placeable placeable;
                        Placeable placeable2;
                        measureScope.getClass();
                        list.getClass();
                        List<Measurable> list2 = list;
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            ((Measurable) it.next()).maxIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j));
                        }
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj), "icon")) {
                                break;
                            }
                        }
                        Measurable measurable2 = (Measurable) obj;
                        for (Measurable measurable3 : list2) {
                            if (Intrinsics.areEqual(RulerKt.getLayoutId(measurable3), AnnotatedPrivateKey.LABEL)) {
                                Iterator it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it3.next();
                                    if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj2), "value")) {
                                        break;
                                    }
                                }
                                Measurable measurable4 = (Measurable) obj2;
                                ListUnorderedState listUnorderedState2 = ListUnorderedState.this;
                                SnapshotStateList snapshotStateList = listUnorderedState2.labels;
                                DerivedSnapshotState derivedSnapshotState = listUnorderedState2.iconWidth$delegate;
                                ListItemModifierNode listItemModifierNode = (ListItemModifierNode) CollectionsKt.lastOrNull((List) snapshotStateList);
                                if (listItemModifierNode == null || listItemModifierNode.id != intValue) {
                                    Iterator it4 = list2.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            obj3 = null;
                                            break;
                                        }
                                        obj3 = it4.next();
                                        if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj3), "bottom_spacer")) {
                                            break;
                                        }
                                    }
                                    measurable = (Measurable) obj3;
                                } else {
                                    measurable = null;
                                }
                                int m1025getMaxWidthimpl = (Constraints.m1025getMaxWidthimpl(j) - ((Number) derivedSnapshotState.getValue()).intValue()) - (listUnorderedState2.getValueWidth() > 0 ? measureScope.mo230roundToPx0680j_4(16.0f) : 0);
                                int labelWidth = (m1025getMaxWidthimpl - listUnorderedState2.getLabelWidth()) - listUnorderedState2.getValueWidth();
                                int i3 = m1025getMaxWidthimpl / 2;
                                boolean z2 = Math.min(listUnorderedState2.getLabelWidth(), listUnorderedState2.getValueWidth()) > i3;
                                float f2 = f;
                                if (Math.abs(f2) <= Float.MAX_VALUE && listUnorderedState2.getValueWidth() > 0) {
                                    i3 = MathKt__MathJVMKt.roundToInt(m1025getMaxWidthimpl * (f2 / (1.0f + f2)));
                                } else if (!z2) {
                                    i3 = (labelWidth >= 0 || listUnorderedState2.getLabelWidth() < listUnorderedState2.getValueWidth()) ? listUnorderedState2.getLabelWidth() : m1025getMaxWidthimpl - listUnorderedState2.getValueWidth();
                                }
                                final int intValue2 = ((Number) derivedSnapshotState.getValue()).intValue();
                                final int i4 = m1025getMaxWidthimpl - i3;
                                if (measurable2 != null) {
                                    int i5 = intValue2 < 0 ? 0 : intValue2;
                                    placeable = measurable2.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, i5, i5, 0, 0, 12));
                                } else {
                                    placeable = null;
                                }
                                int i6 = i3 < 0 ? 0 : i3;
                                final Placeable mo833measureBRTryo0 = measurable3.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, i6, i6, 0, 0, 12));
                                if (measurable4 != null) {
                                    int i7 = i4 < 0 ? 0 : i4;
                                    placeable2 = measurable4.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, i7, i7, 0, 0, 12));
                                } else {
                                    placeable2 = null;
                                }
                                Placeable mo833measureBRTryo02 = measurable != null ? measurable.mo833measureBRTryo0(j) : null;
                                final int i8 = mo833measureBRTryo02 != null ? mo833measureBRTryo02.height : 0;
                                final int max = Math.max(placeable != null ? placeable.height : 0, Math.max(mo833measureBRTryo0.height, placeable2 != null ? placeable2.height : 0)) + i8;
                                final Placeable placeable3 = placeable2;
                                final Placeable placeable4 = mo833measureBRTryo02;
                                return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), max, new Function1() { // from class: com.squareup.cash.arcade.components.list.ListUnorderedKt$ListUnorderedItem$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj4;
                                        placementScope.getClass();
                                        Placeable placeable5 = Placeable.this;
                                        Placeable placeable6 = mo833measureBRTryo0;
                                        if (placeable5 != null) {
                                            int i9 = placeable6.get(AlignmentLinesKt.FirstLineCenter) - (placeable5.height / 2);
                                            if (i9 < 0) {
                                                i9 = 0;
                                            }
                                            placementScope.placeRelative(placeable5, 0, i9, RecyclerView.DECELERATION_RATE);
                                        }
                                        placementScope.placeRelative(placeable6, intValue2, 0, RecyclerView.DECELERATION_RATE);
                                        Placeable placeable7 = placeable3;
                                        if (placeable7 != null) {
                                            placementScope.placeRelative(placeable7, Constraints.m1025getMaxWidthimpl(j) - i4, 0, RecyclerView.DECELERATION_RATE);
                                        }
                                        Placeable placeable8 = placeable4;
                                        if (placeable8 != null) {
                                            placementScope.placeRelative(placeable8, 0, max - i8, RecyclerView.DECELERATION_RATE);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, measurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            if (function25 == null) {
                if (function24 == null) {
                }
                gapComposer.startReplaceGroup(-1695372681);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                gapComposer.end(false);
                TextStyle textStyle2 = textStyle;
                if (function2 == null) {
                    gapComposer.startReplaceGroup(-1695275651);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalIconColor;
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                        colors = colors2;
                    }
                    final int i3 = 0;
                    Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(colors.semantic.icon.standard, dynamicProvidableCompositionLocal), Expect_jvmKt.rememberComposableLambda(2047552879, new Function2() { // from class: com.squareup.cash.arcade.components.list.ListUnorderedKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            Function2 function26 = function2;
                            ListUnorderedState listUnorderedState2 = listUnorderedState;
                            Composer composer2 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            switch (i4) {
                                case 0:
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(RulerKt.layoutId(companion, "icon").then(new ListItemModifierElement(listUnorderedState2.icons, 0)), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer2.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer2.startReusableNode();
                                        if (gapComposer2.inserting) {
                                            gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                        } else {
                                            gapComposer2.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                        Recorder$$ExternalSyntheticOutline1.m(0, function26, gapComposer2, true);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Modifier then = RulerKt.layoutId(companion, "value").then(new ListItemModifierElement(listUnorderedState2.values, 0));
                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterEnd, false);
                                        int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, then);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer3.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer3.startReusableNode();
                                        if (gapComposer3.inserting) {
                                            gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                                        } else {
                                            gapComposer3.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                                        Recorder$$ExternalSyntheticOutline1.m(0, function26, gapComposer3, true);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer), gapComposer, 56);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1694921042);
                    gapComposer.end(false);
                }
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier then = RulerKt.layoutId(companion, AnnotatedPrivateKey.LABEL).then(new ListItemModifierElement(listUnorderedState.labels, intValue));
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, then);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.useNode();
                } else {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                ProvidedValue m = re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal);
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = ArcadeThemeKt.LocalTextStyle;
                Updater.CompositionLocalProvider(new ProvidedValue[]{m, dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(textStyle2)}, Expect_jvmKt.rememberComposableLambda(-609022518, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 13), gapComposer), gapComposer, 56);
                function25 = function23;
                Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal), dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).bodySmall)}, Expect_jvmKt.rememberComposableLambda(306835905, new ToastKt$$ExternalSyntheticLambda11(17, function25), gapComposer), gapComposer, 56);
                gapComposer.end(true);
                if (function22 == null) {
                    gapComposer.startReplaceGroup(-1694334119);
                    function24 = function22;
                    final int i4 = 1;
                    Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal), dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).labelMedium), ArcadeThemeKt.LocalTextAlign.defaultProvidedValue$runtime(new TextAlign(6))}, Expect_jvmKt.rememberComposableLambda(-1817357274, new Function2() { // from class: com.squareup.cash.arcade.components.list.ListUnorderedKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i42 = i4;
                            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                            Function2 function26 = function24;
                            ListUnorderedState listUnorderedState2 = listUnorderedState;
                            Composer composer2 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            switch (i42) {
                                case 0:
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(RulerKt.layoutId(companion2, "icon").then(new ListItemModifierElement(listUnorderedState2.icons, 0)), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                        int hashCode22 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer2.currentCompositionLocalScope();
                                        Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer2.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer2.startReusableNode();
                                        if (gapComposer2.inserting) {
                                            gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                                        } else {
                                            gapComposer2.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope22, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode22), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer2, materializeModifier22, ComposeUiNode.Companion.SetModifier);
                                        Recorder$$ExternalSyntheticOutline1.m(0, function26, gapComposer2, true);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Modifier then2 = RulerKt.layoutId(companion2, "value").then(new ListItemModifierElement(listUnorderedState2.values, 0));
                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterEnd, false);
                                        int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, then2);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer3.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer3.startReusableNode();
                                        if (gapComposer3.inserting) {
                                            gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                                        } else {
                                            gapComposer3.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                                        Recorder$$ExternalSyntheticOutline1.m(0, function26, gapComposer3, true);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer), gapComposer, 56);
                    gapComposer.end(false);
                } else {
                    function24 = function22;
                    gapComposer.startReplaceGroup(-1693883410);
                    gapComposer.end(false);
                }
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(RulerKt.layoutId(companion, "bottom_spacer"), function25 == null ? 8.0f : RecyclerView.DECELERATION_RATE));
                gapComposer.end(true);
            }
            gapComposer.startReplaceGroup(-1695434154);
            textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            gapComposer.end(false);
            TextStyle textStyle22 = textStyle;
            if (function2 == null) {
            }
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier then2 = RulerKt.layoutId(companion2, AnnotatedPrivateKey.LABEL).then(new ListItemModifierElement(listUnorderedState.labels, intValue));
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode22 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer, then2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope22, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode22, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier22, composeUiNode$Companion$SetModifier$14);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTextColor;
            ProvidedValue m2 = re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal2);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal22 = ArcadeThemeKt.LocalTextStyle;
            Updater.CompositionLocalProvider(new ProvidedValue[]{m2, dynamicProvidableCompositionLocal22.defaultProvidedValue$runtime(textStyle22)}, Expect_jvmKt.rememberComposableLambda(-609022518, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 13), gapComposer), gapComposer, 56);
            function25 = function23;
            Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal2), dynamicProvidableCompositionLocal22.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).bodySmall)}, Expect_jvmKt.rememberComposableLambda(306835905, new ToastKt$$ExternalSyntheticLambda11(17, function25), gapComposer), gapComposer, 56);
            gapComposer.end(true);
            if (function22 == null) {
            }
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(RulerKt.layoutId(companion2, "bottom_spacer"), function25 == null ? 8.0f : RecyclerView.DECELERATION_RATE));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda3(listUnorderedState, listUnorderedProminence, f, modifier, composableLambdaImpl, function2, function24, function25, i);
        }
    }

    public static final ListUnorderedState rememberListUnorderedState(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new ListUnorderedState();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (ListUnorderedState) rememberedValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListUnordered(ImmutableList immutableList, Modifier modifier, ListUnorderedState listUnorderedState, ListUnorderedProminence listUnorderedProminence, ListUnorderedSize listUnorderedSize, float f, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        ListUnorderedState listUnorderedState2;
        int i4;
        int i5;
        int i6;
        ListUnorderedSize listUnorderedSize2;
        float f2;
        Modifier modifier3;
        ListUnorderedState listUnorderedState3;
        ListUnorderedProminence listUnorderedProminence2;
        RecomposeScopeImpl endRestartGroup;
        ListUnorderedState listUnorderedState4;
        ListUnorderedState listUnorderedState5;
        ListUnorderedProminence listUnorderedProminence3;
        ListUnorderedSize listUnorderedSize3;
        float f3;
        Modifier modifier4;
        int i7;
        immutableList.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-13379703);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i2 & 4) == 0) {
                    listUnorderedState2 = listUnorderedState;
                    if (gapComposer.changed(listUnorderedState2)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    listUnorderedState2 = listUnorderedState;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                listUnorderedState2 = listUnorderedState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= gapComposer.changed(listUnorderedProminence == null ? -1 : listUnorderedProminence.ordinal()) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= gapComposer.changed(listUnorderedSize != null ? listUnorderedSize.ordinal() : -1) ? 16384 : PKIFailureInfo.certRevoked;
            }
            i6 = i3 | 196608;
            if (!gapComposer.shouldExecute(i6 & 1, (74899 & i6) == 74898)) {
                gapComposer.startDefaults();
                if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i6 &= -897;
                    }
                    listUnorderedProminence3 = listUnorderedProminence;
                    listUnorderedSize3 = listUnorderedSize;
                    f3 = f;
                    modifier4 = modifier2;
                    listUnorderedState5 = listUnorderedState2;
                } else {
                    Modifier modifier5 = i8 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        listUnorderedState4 = rememberListUnorderedState(gapComposer);
                        i6 &= -897;
                    } else {
                        listUnorderedState4 = listUnorderedState2;
                    }
                    listUnorderedState5 = listUnorderedState4;
                    listUnorderedProminence3 = i4 != 0 ? ListUnorderedProminence.Standard : listUnorderedProminence;
                    listUnorderedSize3 = i5 != 0 ? ListUnorderedSize.Compact : listUnorderedSize;
                    f3 = Float.NaN;
                    modifier4 = modifier5;
                }
                gapComposer.endDefaults();
                int i9 = i6 >> 3;
                ListUnordered(modifier4, listUnorderedState5, listUnorderedProminence3, listUnorderedSize3, f3, Expect_jvmKt.rememberComposableLambda(-1175049053, new BankingDialogKt$$ExternalSyntheticLambda8(immutableList, 6), gapComposer), gapComposer, (i9 & 14) | 196608 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i9 & 57344), 0);
                modifier3 = modifier4;
                listUnorderedState3 = listUnorderedState5;
                listUnorderedProminence2 = listUnorderedProminence3;
                listUnorderedSize2 = listUnorderedSize3;
                f2 = f3;
            } else {
                gapComposer.skipToGroupEnd();
                listUnorderedSize2 = listUnorderedSize;
                f2 = f;
                modifier3 = modifier2;
                listUnorderedState3 = listUnorderedState2;
                listUnorderedProminence2 = listUnorderedProminence;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalToolbarKt$$ExternalSyntheticLambda1(immutableList, modifier3, listUnorderedState3, listUnorderedProminence2, listUnorderedSize2, f2, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        i6 = i3 | 196608;
        if (!gapComposer.shouldExecute(i6 & 1, (74899 & i6) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
