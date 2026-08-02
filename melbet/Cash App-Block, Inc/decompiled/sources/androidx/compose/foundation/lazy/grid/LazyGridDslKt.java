package androidx.compose.foundation.lazy.grid;

import androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda8;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.DefaultFlingBehavior;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListKt;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.jg$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.timeline.IntRangeComparator;
import com.squareup.cash.arcade.components.timeline.OverlappingCollapseRangesError;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.moneybot.views.shared.BaselineFlowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.views.shared.BaselineFlowKt$BaselineFlow$7$1;
import com.squareup.cash.moneybot.views.shared.FlowToken;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotAnimationsEnabledKt;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.tax.views.TaxToolTipViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LazyGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:142:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* renamed from: BaselineFlow-hkzSW1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m314BaselineFlowhkzSW1g(AnnotatedString annotatedString, TextStyle textStyle, Modifier modifier, long j, TextMeasurer textMeasurer, String str, boolean z, long j2, Function0 function0, Function0 function02, Composer composer, int i, int i2) {
        long j3;
        TextMeasurer textMeasurer2;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        long j4;
        TextMeasurer textMeasurer3;
        long j5;
        RecomposeScopeImpl endRestartGroup;
        TextMeasurer textMeasurer4;
        TextMeasurer textMeasurer5;
        String str3;
        long j6;
        int i7;
        boolean z2;
        String str4;
        long j7;
        final List list;
        int i8;
        textStyle.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1940819519);
        int i9 = (i & 6) == 0 ? (gapComposer.changed(annotatedString) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i9 |= gapComposer.changed(textStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i9 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i9 |= 3072;
        } else if ((i & 3072) == 0) {
            j3 = j;
            i9 |= gapComposer.changed(j3) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    textMeasurer2 = textMeasurer;
                    if (gapComposer.changed(textMeasurer2)) {
                        i8 = 16384;
                        i9 |= i8;
                    }
                } else {
                    textMeasurer2 = textMeasurer;
                }
                i8 = PKIFailureInfo.certRevoked;
                i9 |= i8;
            } else {
                textMeasurer2 = textMeasurer;
            }
            i3 = i2 & 32;
            if (i3 == 0) {
                i9 |= 196608;
                str2 = str;
                i4 = 32;
            } else {
                str2 = str;
                i4 = 32;
                if ((i & 196608) == 0) {
                    i9 |= gapComposer.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
            }
            if ((i & 1572864) == 0) {
                i9 |= gapComposer.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i9 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i9 |= gapComposer.changed(j2) ? 8388608 : 4194304;
            }
            i6 = i9;
            if ((i & 100663296) == 0) {
                i6 |= gapComposer.changedInstance(function0) ? 67108864 : 33554432;
            }
            if ((i & 805306368) == 0) {
                i6 |= gapComposer.changedInstance(function02) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
            if (gapComposer.shouldExecute(i6 & 1, (i6 & 306783379) == 306783378)) {
                gapComposer.skipToGroupEnd();
                j4 = j3;
                textMeasurer3 = textMeasurer2;
                j5 = j2;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    long j8 = i10 != 0 ? Color.Unspecified : j3;
                    if ((i2 & 16) != 0) {
                        textMeasurer4 = TextPainterKt.rememberTextMeasurer(gapComposer);
                        i6 &= -57345;
                    } else {
                        textMeasurer4 = textMeasurer2;
                    }
                    String str5 = i3 != 0 ? " " : str2;
                    textMeasurer5 = textMeasurer4;
                    str3 = str5;
                    j6 = i5 != 0 ? 0L : j2;
                    i7 = i6;
                    j3 = j8;
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                    }
                    j6 = j2;
                    str3 = str2;
                    textMeasurer5 = textMeasurer2;
                    i7 = i6;
                }
                gapComposer.endDefaults();
                str2 = str3;
                final int i11 = (int) (TextMeasurer.m979measurewNUYSr0$default(textMeasurer5, str3, textStyle, 0, 0L, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1).size >> i4);
                if (z) {
                    gapComposer.startReplaceGroup(1111767206);
                    z2 = ((Boolean) gapComposer.consume(LocalMoneybotAnimationsEnabledKt.LocalMoneybotAnimationsEnabled)).booleanValue();
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(105046255);
                    gapComposer.end(false);
                    z2 = false;
                }
                boolean z3 = ((i7 & 14) == 4) | ((458752 & i7) == 131072);
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = Composer.Companion.Empty;
                int i12 = i7;
                if (z3 || rememberedValue == obj) {
                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    int i13 = 0;
                    while (true) {
                        str4 = annotatedString.text;
                        j7 = j3;
                        if (i13 >= str4.length()) {
                            break;
                        }
                        int indexOf$default = StringsKt.indexOf$default((CharSequence) annotatedString, str2, i13, false, 4);
                        Integer valueOf = Integer.valueOf(indexOf$default);
                        if (indexOf$default == -1) {
                            valueOf = null;
                        }
                        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) annotatedString, "\n", i13, false, 4);
                        Integer valueOf2 = Integer.valueOf(indexOf$default2);
                        if (indexOf$default2 == -1) {
                            valueOf2 = null;
                        }
                        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) ArraysKt___ArraysKt.filterNotNull(new Integer[]{valueOf, valueOf2}));
                        int intValue = num != null ? num.intValue() : -1;
                        if (intValue == -1) {
                            break;
                        }
                        if (valueOf2 != null && intValue == valueOf2.intValue()) {
                            if (intValue > i13) {
                                createListBuilder.add(new FlowToken.Word(annotatedString.subSequence(i13, intValue)));
                            }
                            createListBuilder.add(FlowToken.NewLine.INSTANCE);
                            i13 = intValue + 1;
                        } else {
                            if (intValue > i13) {
                                createListBuilder.add(new FlowToken.Word(annotatedString.subSequence(i13, intValue)));
                            }
                            i13 = str2.length() + intValue;
                        }
                        j3 = j7;
                    }
                    if (i13 < str4.length()) {
                        createListBuilder.add(new FlowToken.Word(annotatedString.subSequence(i13, str4.length())));
                    }
                    rememberedValue = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    j7 = j3;
                }
                List list2 = (List) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(z2 ? 0 : list2.size(), gapComposer);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue2;
                Boolean valueOf3 = Boolean.valueOf(z2);
                boolean changed = gapComposer.changed(z2) | ((i12 & 29360128) == 8388608) | gapComposer.changedInstance(list2) | ((i12 & 234881024) == 67108864) | ((i12 & 1879048192) == 536870912);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed || rememberedValue3 == obj) {
                    rememberedValue3 = new BaselineFlowKt$BaselineFlow$7$1(z2, j6, list2, function0, function02, parcelableSnapshotMutableIntState, null);
                    list = list2;
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    list = list2;
                }
                Updater.LaunchedEffect(list, valueOf3, (Function2) rememberedValue3, gapComposer);
                boolean z4 = (i12 & 112) == i4;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z4 || rememberedValue4 == obj) {
                    rememberedValue4 = TextMeasurer.m979measurewNUYSr0$default(textMeasurer5, "A\nA", textStyle, 0, 0L, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1);
                    textMeasurer3 = textMeasurer5;
                    gapComposer.updateRememberedValue(rememberedValue4);
                } else {
                    textMeasurer3 = textMeasurer5;
                }
                TextLayoutResult textLayoutResult = (TextLayoutResult) rememberedValue4;
                float lineBaseline = textLayoutResult.getLineBaseline(0);
                float lineTop = textLayoutResult.multiParagraph.getLineTop(0);
                final int lineBaseline2 = (int) (textLayoutResult.getLineBaseline(1) - lineBaseline);
                final int i14 = (int) (lineBaseline - lineTop);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == obj) {
                    rememberedValue5 = new InsightChartKt$$ExternalSyntheticLambda19(28);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue5);
                boolean changedInstance = gapComposer.changedInstance(list) | gapComposer.changed(i11) | gapComposer.changed(lineBaseline2) | gapComposer.changed(i14);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue6 == obj) {
                    rememberedValue6 = new MeasurePolicy() { // from class: com.squareup.cash.moneybot.views.shared.BaselineFlowKt$BaselineFlow$9$1
                        public static final void measure_3p2s80s$pushRow(Ref$ObjectRef ref$ObjectRef, ArrayList arrayList) {
                            if (!((PlaceableRow) ref$ObjectRef.element).idxs.isEmpty()) {
                                arrayList.add(ref$ObjectRef.element);
                            }
                            ref$ObjectRef.element = new PlaceableRow(new ArrayList());
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list3, long j9) {
                            measureScope.getClass();
                            list3.getClass();
                            ArrayList arrayList = new ArrayList(list3.size());
                            ArrayList arrayList2 = new ArrayList(list3.size());
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                Placeable mo833measureBRTryo0 = ((Measurable) it.next()).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j9, 0, 0, 0, 0, 10));
                                arrayList.add(mo833measureBRTryo0);
                                arrayList2.add(Integer.valueOf(mo833measureBRTryo0.get(AlignmentLineKt.FirstBaseline)));
                            }
                            int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j9);
                            ArrayList arrayList3 = new ArrayList();
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            ref$ObjectRef.element = new PlaceableRow(new ArrayList());
                            IntProgressionIterator it2 = CollectionsKt__CollectionsKt.getIndices(arrayList).iterator();
                            while (true) {
                                if (!it2.hasNext) {
                                    break;
                                }
                                int nextInt = it2.nextInt();
                                if (list.get(nextInt) instanceof FlowToken.NewLine) {
                                    measure_3p2s80s$pushRow(ref$ObjectRef, arrayList3);
                                } else {
                                    Object obj2 = arrayList.get(nextInt);
                                    obj2.getClass();
                                    Placeable placeable = (Placeable) obj2;
                                    Object obj3 = arrayList2.get(nextInt);
                                    obj3.getClass();
                                    int intValue2 = ((Number) obj3).intValue();
                                    int i15 = placeable.width;
                                    int i16 = ((PlaceableRow) ref$ObjectRef.element).idxs.isEmpty() ? 0 : i11;
                                    PlaceableRow placeableRow = (PlaceableRow) ref$ObjectRef.element;
                                    if (placeableRow.width + i16 + i15 > m1025getMaxWidthimpl && !placeableRow.idxs.isEmpty()) {
                                        measure_3p2s80s$pushRow(ref$ObjectRef, arrayList3);
                                    }
                                    ((PlaceableRow) ref$ObjectRef.element).idxs.add(Integer.valueOf(nextInt));
                                    PlaceableRow placeableRow2 = (PlaceableRow) ref$ObjectRef.element;
                                    placeableRow2.width = i16 + i15 + placeableRow2.width;
                                    placeableRow2.ascent = Math.max(placeableRow2.ascent, intValue2);
                                    PlaceableRow placeableRow3 = (PlaceableRow) ref$ObjectRef.element;
                                    placeableRow3.descent = Math.max(placeableRow3.descent, placeable.height - intValue2);
                                }
                            }
                            measure_3p2s80s$pushRow(ref$ObjectRef, arrayList3);
                            return MeasureScope.layout$default(measureScope, m1025getMaxWidthimpl, RangesKt___RangesKt.coerceIn(arrayList3.isEmpty() ? 0 : ((arrayList3.size() - 1) * lineBaseline2) + ((PlaceableRow) CollectionsKt.first((List) arrayList3)).ascent + ((PlaceableRow) CollectionsKt.last((List) arrayList3)).descent, Constraints.m1026getMinHeightimpl(j9), Constraints.m1024getMaxHeightimpl(j9)), new ViewfinderKt$$ExternalSyntheticLambda8(i14, arrayList3, lineBaseline2, arrayList, arrayList2, i11));
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue6;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
                gapComposer.startReplaceGroup(2130927405);
                int i15 = 0;
                for (Object obj2 : list) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    long j9 = j7;
                    AnimatedContentKt.AnimatedVisibility(i15 < parcelableSnapshotMutableIntState.getIntValue(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimatableKt.spring$default(1.0f, 120.0f, null, 4), 2), ExitTransitionImpl.None, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(60591876, new TaxToolTipViewKt$$ExternalSyntheticLambda3((FlowToken) obj2, textStyle, j9, 5), gapComposer), (Composer) gapComposer, 196992, 18);
                    i15 = i16;
                    j7 = j9;
                }
                gapComposer.end(false);
                gapComposer.end(true);
                j4 = j7;
                j5 = j6;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new BaselineFlowKt$$ExternalSyntheticLambda2(annotatedString, textStyle, modifier, j4, textMeasurer3, str2, z, j5, function0, function02, i, i2);
                return;
            }
            return;
        }
        j3 = j;
        if ((i & 24576) != 0) {
        }
        i3 = i2 & 32;
        if (i3 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        i6 = i9;
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 306783379) == 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyVerticalGrid(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, Arrangement$Vertical arrangement$Vertical, Arrangement$Horizontal arrangement$Horizontal, FlingBehavior flingBehavior, boolean z, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        PaddingValues paddingValues2;
        int i4;
        Arrangement$Vertical arrangement$Vertical2;
        int i5;
        Arrangement$Horizontal arrangement$Horizontal2;
        int i6;
        boolean z2;
        int i7;
        GapComposer gapComposer;
        LazyGridState lazyGridState2;
        FlingBehavior flingBehavior2;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2;
        PaddingValues paddingValues3;
        Arrangement$Vertical arrangement$Vertical3;
        boolean z3;
        Arrangement$Horizontal arrangement$Horizontal3;
        RecomposeScopeImpl endRestartGroup;
        LazyGridState lazyGridState3;
        Arrangement$Vertical arrangement$Vertical4;
        Arrangement$Horizontal arrangement$Horizontal4;
        int i8;
        FlingBehavior flingBehavior3;
        PaddingValues paddingValues4;
        Arrangement$Vertical arrangement$Vertical5;
        int i9;
        LazyGridState lazyGridState4;
        boolean z4;
        boolean z5;
        AndroidEdgeEffectOverscrollEffect rememberOverscrollEffect;
        int i10;
        int i11;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2072102870);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(gridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i2 & 4) == 0 && gapComposer2.changed(lazyGridState)) {
                i11 = 256;
                i3 |= i11;
            }
            i11 = 128;
            i3 |= i11;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            paddingValues2 = paddingValues;
            i3 |= gapComposer2.changed(paddingValues2) ? 2048 : 1024;
            i4 = i3 | 24576;
            if ((i & 196608) != 0) {
                if ((i2 & 32) == 0) {
                    arrangement$Vertical2 = arrangement$Vertical;
                    if (gapComposer2.changed(arrangement$Vertical2)) {
                        i10 = PKIFailureInfo.unsupportedVersion;
                        i4 |= i10;
                    }
                } else {
                    arrangement$Vertical2 = arrangement$Vertical;
                }
                i10 = 65536;
                i4 |= i10;
            } else {
                arrangement$Vertical2 = arrangement$Vertical;
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i) == 0) {
                arrangement$Horizontal2 = arrangement$Horizontal;
                i4 |= gapComposer2.changed(arrangement$Horizontal2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                if ((i & 12582912) == 0) {
                    i4 |= 4194304;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    i4 |= 100663296;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 100663296) == 0) {
                        i4 |= gapComposer2.changed(z2) ? 67108864 : 33554432;
                    }
                }
                if ((i & 805306368) == 0) {
                    i4 |= 268435456;
                }
                i7 = gapComposer2.changedInstance(function1) ? 4 : 2;
                if (gapComposer2.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i7 & 3) != 2)) {
                    gapComposer2.startDefaults();
                    int i13 = i & 1;
                    Object obj = Composer.Companion.Empty;
                    if (i13 == 0 || gapComposer2.getDefaultsInvalid()) {
                        if ((i2 & 4) != 0) {
                            lazyGridState3 = LazyGridStateKt.rememberLazyGridState(0, 3, gapComposer2);
                            i4 &= -897;
                        } else {
                            lazyGridState3 = lazyGridState;
                        }
                        PaddingValues paddingValuesImpl = i12 != 0 ? new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) : paddingValues2;
                        if ((i2 & 32) != 0) {
                            arrangement$Vertical4 = SpacerKt.Top;
                            i4 &= -458753;
                        } else {
                            arrangement$Vertical4 = arrangement$Vertical2;
                        }
                        arrangement$Horizontal4 = i5 != 0 ? SpacerKt.Start : arrangement$Horizontal2;
                        DecayAnimationSpecImpl rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(gapComposer2);
                        boolean changed = gapComposer2.changed(rememberSplineBasedDecay);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changed || rememberedValue == obj) {
                            rememberedValue = new DefaultFlingBehavior(rememberSplineBasedDecay);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) rememberedValue;
                        if (i6 != 0) {
                            z2 = true;
                        }
                        i8 = i4 & (-1908408321);
                        flingBehavior3 = defaultFlingBehavior;
                        paddingValues4 = paddingValuesImpl;
                        arrangement$Vertical5 = arrangement$Vertical4;
                        i9 = i7;
                        lazyGridState4 = lazyGridState3;
                        z4 = z2;
                        z5 = true;
                        rememberOverscrollEffect = OverscrollKt.rememberOverscrollEffect(gapComposer2);
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                        }
                        i8 = i4 & (-1908408321);
                        lazyGridState4 = lazyGridState;
                        flingBehavior3 = flingBehavior;
                        paddingValues4 = paddingValues2;
                        arrangement$Vertical5 = arrangement$Vertical2;
                        arrangement$Horizontal4 = arrangement$Horizontal2;
                        i9 = i7;
                        z4 = z2;
                        z5 = true;
                        rememberOverscrollEffect = androidEdgeEffectOverscrollEffect;
                    }
                    gapComposer2.endDefaults();
                    int i14 = (i8 & 14) | ((i8 >> 15) & 112);
                    int i15 = 6;
                    boolean z6 = (((((i14 & 14) ^ 6) <= 4 || !gapComposer2.changed(gridCells)) && (i14 & 6) != 4) ? false : z5) | (((((i14 & 112) ^ 48) <= 32 || !gapComposer2.changed(arrangement$Horizontal4)) && (i14 & 48) != 32) ? false : z5);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (z6 || rememberedValue2 == obj) {
                        rememberedValue2 = new GridSlotCache(new TextKt$$ExternalSyntheticLambda0(i15, gridCells, arrangement$Horizontal4));
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    int i16 = i8 >> 3;
                    gapComposer = gapComposer2;
                    Arrangement$Horizontal arrangement$Horizontal5 = arrangement$Horizontal4;
                    LazyGridKt.LazyGrid(modifier, lazyGridState4, (GridSlotCache) rememberedValue2, paddingValues4, flingBehavior3, z4, rememberOverscrollEffect, arrangement$Vertical5, arrangement$Horizontal5, function1, gapComposer, (i16 & 29360128) | (i16 & 14) | 196608 | (i16 & 112) | (i8 & 7168) | (57344 & i8) | ((i8 << 12) & 1879048192), ((i8 >> 18) & 14) | ((i9 << 3) & 112));
                    lazyGridState2 = lazyGridState4;
                    paddingValues3 = paddingValues4;
                    flingBehavior2 = flingBehavior3;
                    z3 = z4;
                    androidEdgeEffectOverscrollEffect2 = rememberOverscrollEffect;
                    arrangement$Vertical3 = arrangement$Vertical5;
                    arrangement$Horizontal3 = arrangement$Horizontal5;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    lazyGridState2 = lazyGridState;
                    flingBehavior2 = flingBehavior;
                    androidEdgeEffectOverscrollEffect2 = androidEdgeEffectOverscrollEffect;
                    paddingValues3 = paddingValues2;
                    arrangement$Vertical3 = arrangement$Vertical2;
                    z3 = z2;
                    arrangement$Horizontal3 = arrangement$Horizontal2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new LazyGridKt$$ExternalSyntheticLambda0(gridCells, modifier, lazyGridState2, paddingValues3, arrangement$Vertical3, arrangement$Horizontal3, flingBehavior2, z3, androidEdgeEffectOverscrollEffect2, function1, i, i2);
                    return;
                }
                return;
            }
            arrangement$Horizontal2 = arrangement$Horizontal;
            if ((i & 12582912) == 0) {
            }
            i6 = i2 & 256;
            if (i6 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (gapComposer2.changedInstance(function1)) {
            }
            if (gapComposer2.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i7 & 3) != 2)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i3 | 24576;
        if ((i & 196608) != 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        arrangement$Horizontal2 = arrangement$Horizontal;
        if ((i & 12582912) == 0) {
        }
        i6 = i2 & 256;
        if (i6 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (gapComposer2.changedInstance(function1)) {
        }
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i7 & 3) != 2)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f3, code lost:
    
        if (r7 == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List access$sortAndMerge(List list) {
        List sortedWith;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TimelineState.CollapseRange) it.next()).collapsedIndices);
        }
        if (LazyListKt.isSortedAndMerged(arrayList)) {
            return CollectionsKt.toList(list2);
        }
        if (LazyListKt.isSortedAndMerged(arrayList)) {
            sortedWith = CollectionsKt.toList(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!((IntRange) next).isEmpty()) {
                    arrayList2.add(next);
                }
            }
            sortedWith = CollectionsKt.sortedWith(arrayList2, IntRangeComparator.INSTANCE);
            if (sortedWith.size() > 1) {
                ArrayList arrayList3 = new ArrayList();
                IntRange intRange = (IntRange) sortedWith.get(0);
                for (IntRange intRange2 : CollectionsKt.drop(sortedWith, 1)) {
                    int i = intRange.last;
                    if (i == Integer.MAX_VALUE) {
                        break;
                    }
                    if (intRange2.first <= i + 1) {
                        intRange = new IntRange(intRange.first, Math.max(intRange.last, intRange2.last), 1);
                    } else {
                        arrayList3.add(intRange);
                        intRange = intRange2;
                    }
                }
                arrayList3.add(intRange);
                sortedWith = CollectionsKt.toList(arrayList3);
            }
        }
        List<IntRange> list3 = sortedWith;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        for (IntRange intRange3 : list3) {
            Iterator it3 = list2.iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (Intrinsics.areEqual(intRange3, ((TimelineState.CollapseRange) next2).collapsedIndices)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj = next2;
                    }
                }
            }
            obj = null;
            TimelineState.CollapseRange collapseRange = (TimelineState.CollapseRange) obj;
            if (collapseRange == null) {
                collapseRange = new TimelineState.CollapseRange(null, intRange3);
            }
            arrayList4.add(collapseRange);
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : list2) {
            if (!arrayList4.contains((TimelineState.CollapseRange) obj2)) {
                arrayList5.add(obj2);
            }
        }
        if (arrayList5.isEmpty()) {
            return arrayList4;
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            String str = ((TimelineState.CollapseRange) it4.next()).label;
            if (str != null) {
                arrayList6.add(str);
            }
        }
        OverlappingCollapseRangesError overlappingCollapseRangesError = new OverlappingCollapseRangesError(arrayList6);
        ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
        if (errorReporter != null) {
            errorReporter.report(overlappingCollapseRangesError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return arrayList4;
        }
        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
        return null;
    }

    public static final TimelineState rememberTimelineState(ImmutableList immutableList, Composer composer, int i) {
        if ((i & 1) != 0) {
            immutableList = SmallPersistentVector.EMPTY;
        }
        Object[] objArr = new Object[0];
        GapComposer gapComposer = (GapComposer) composer;
        boolean changedInstance = gapComposer.changedInstance(immutableList);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new ErrorView$$ExternalSyntheticLambda0(immutableList, 6);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (TimelineState) SaverKt.m581rememberSaveable(objArr, (Saver) TimelineState.Saver.INSTANCE, (Function0) rememberedValue, (Composer) gapComposer, 48);
    }

    public static final TimelineState rememberTimelineState(Composer composer, int i) {
        Object[] objArr = new Object[0];
        boolean changed = ((GapComposer) composer).changed(i);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new jg$$ExternalSyntheticLambda1(i, 26);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (TimelineState) SaverKt.m581rememberSaveable(objArr, (Saver) TimelineState.Saver.INSTANCE, (Function0) rememberedValue, (Composer) gapComposer, 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0090  */
    /* renamed from: BaselineFlow-hkzSW1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m315BaselineFlowhkzSW1g(String str, TextStyle textStyle, Modifier modifier, long j, TextMeasurer textMeasurer, String str2, boolean z, long j2, Function0 function0, Function0 function02, Composer composer, int i, int i2) {
        TextStyle textStyle2;
        long j3;
        long j4;
        int i3;
        Function0 function03;
        Function0 function04;
        int i4;
        GapComposer gapComposer;
        Modifier modifier2;
        TextMeasurer textMeasurer2;
        String str3;
        Function0 function05;
        RecomposeScopeImpl endRestartGroup;
        Function0 function06;
        Modifier modifier3;
        TextMeasurer textMeasurer3;
        int i5;
        Function0 function07;
        String str4;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-997973643);
        int i6 = (i & 6) == 0 ? (gapComposer2.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            textStyle2 = textStyle;
            i6 |= gapComposer2.changed(textStyle2) ? 32 : 16;
        } else {
            textStyle2 = textStyle;
        }
        int i7 = i6 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            j3 = j;
            i7 |= gapComposer2.changed(j3) ? 2048 : 1024;
        } else {
            j3 = j;
        }
        if ((i & 24576) == 0) {
            i7 |= PKIFailureInfo.certRevoked;
        }
        int i8 = i7 | 196608;
        if ((1572864 & i) == 0) {
            i8 |= gapComposer2.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i9 = i2 & 128;
        if (i9 != 0) {
            i8 |= 12582912;
        } else if ((12582912 & i) == 0) {
            j4 = j2;
            i8 |= gapComposer2.changed(j4) ? 8388608 : 4194304;
            i3 = i2 & 256;
            if (i3 == 0) {
                i8 |= 100663296;
            } else if ((100663296 & i) == 0) {
                function03 = function0;
                i8 |= gapComposer2.changedInstance(function03) ? 67108864 : 33554432;
                if ((805306368 & i) == 0) {
                    function04 = function02;
                    i8 |= gapComposer2.changedInstance(function04) ? PKIFailureInfo.duplicateCertReq : 268435456;
                } else {
                    function04 = function02;
                }
                i4 = i8;
                if (gapComposer2.shouldExecute(i4 & 1, (i8 & 306783379) != 306783378)) {
                    gapComposer2.startDefaults();
                    if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                        gapComposer2.skipToGroupEnd();
                        i5 = i4 & (-57345);
                        modifier3 = modifier;
                        textMeasurer3 = textMeasurer;
                        str4 = str2;
                        function07 = function03;
                    } else {
                        TextMeasurer rememberTextMeasurer = TextPainterKt.rememberTextMeasurer(gapComposer2);
                        int i10 = i4 & (-57345);
                        if (i9 != 0) {
                            j4 = 0;
                        }
                        if (i3 != 0) {
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (rememberedValue == Composer.Companion.Empty) {
                                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda6(24);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            function06 = (Function0) rememberedValue;
                        } else {
                            function06 = function03;
                        }
                        modifier3 = Modifier.Companion.$$INSTANCE;
                        textMeasurer3 = rememberTextMeasurer;
                        i5 = i10;
                        function07 = function06;
                        str4 = " ";
                    }
                    long j5 = j4;
                    gapComposer2.endDefaults();
                    StringBuilder sb = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    sb.append(str);
                    String sb2 = sb.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    gapComposer = gapComposer2;
                    for (int i11 = 0; i11 < size; i11++) {
                        arrayList2.add(((AnnotatedString.Builder.MutableRange) arrayList.get(i11)).toRange(sb.length()));
                    }
                    Modifier modifier4 = modifier3;
                    m314BaselineFlowhkzSW1g(new AnnotatedString(sb2, (List) arrayList2), textStyle2, modifier4, j3, textMeasurer3, str4, z, j5, function07, function04, gapComposer, i5 & 2147483632, 0);
                    modifier2 = modifier4;
                    textMeasurer2 = textMeasurer3;
                    str3 = str4;
                    j4 = j5;
                    function05 = function07;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    modifier2 = modifier;
                    textMeasurer2 = textMeasurer;
                    str3 = str2;
                    function05 = function03;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new BaselineFlowKt$$ExternalSyntheticLambda2(str, textStyle, modifier2, j, textMeasurer2, str3, z, j4, function05, function02, i, i2);
                    return;
                }
                return;
            }
            function03 = function0;
            if ((805306368 & i) == 0) {
            }
            i4 = i8;
            if (gapComposer2.shouldExecute(i4 & 1, (i8 & 306783379) != 306783378)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        j4 = j2;
        i3 = i2 & 256;
        if (i3 == 0) {
        }
        function03 = function0;
        if ((805306368 & i) == 0) {
        }
        i4 = i8;
        if (gapComposer2.shouldExecute(i4 & 1, (i8 & 306783379) != 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
