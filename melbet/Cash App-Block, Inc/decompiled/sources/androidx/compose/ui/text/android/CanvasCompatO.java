package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.CanvasCompatO;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.h2$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.calendar.viewmodels.CalendarTextStyle;
import com.squareup.cash.calendar.viewmodels.DotStyle;
import com.squareup.cash.calendar.views.CalendarDateItemDateNumberTextStyles;
import com.squareup.cash.calendar.views.CalendarDateItemStyle;
import com.squareup.cash.calendar.views.CalendarDateItemTextColors;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda11;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.payments.backend.api.P2pSettingsManagerKt$WhenMappings;
import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class CanvasCompatO {
    public static final void AnimatedDateRow(Modifier modifier, final List list, final ScheduleCalendarDate scheduleCalendarDate, final boolean z, final CalendarDateItemStyle calendarDateItemStyle, final Function1 function1, final boolean z2, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2078144645);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer2.changed(scheduleCalendarDate) : gapComposer2.changedInstance(scheduleCalendarDate) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(calendarDateItemStyle) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changed(z2) ? 8388608 : 4194304;
        }
        final int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            final int indexOf = CollectionsKt.indexOf(scheduleCalendarDate, list);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            OffsetKt.BoxWithConstraints(SizeKt.fillMaxWidth(companion, 1.0f), null, false, Expect_jvmKt.rememberComposableLambda(1301452763, new Function3() { // from class: com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Modifier.Companion companion2;
                    boolean z3;
                    int i4;
                    CalendarDateItemStyle calendarDateItemStyle2;
                    float f;
                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    boxWithConstraintsScopeImpl.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    boolean shouldExecute = gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18);
                    Applier applier = gapComposer3.applier;
                    if (shouldExecute) {
                        List<ScheduleCalendarDate> list2 = list;
                        float m259getMaxWidthD9Ej5fM = list2.isEmpty() ? RecyclerView.DECELERATION_RATE : boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM() / list2.size();
                        Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer3, 0);
                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        boolean z4 = z2;
                        CalendarDateItemStyle calendarDateItemStyle3 = calendarDateItemStyle;
                        Object obj4 = Composer.Companion.Empty;
                        if (z4) {
                            gapComposer3.startReplaceGroup(255334808);
                            z3 = z4;
                            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion3, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, 1);
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m300paddingVpY3zN4$default);
                            gapComposer3.startReusableNode();
                            companion2 = companion3;
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                            ProgressCircularKt.ProgressCircular(0, 1, gapComposer3, null);
                            gapComposer3.end(true);
                            gapComposer3.end(false);
                            i4 = 3;
                            calendarDateItemStyle2 = calendarDateItemStyle3;
                            f = 1.0f;
                        } else {
                            companion2 = companion3;
                            z3 = z4;
                            CalendarDateItemStyle calendarDateItemStyle4 = calendarDateItemStyle3;
                            gapComposer3.startReplaceGroup(255583025);
                            for (ScheduleCalendarDate scheduleCalendarDate2 : list2) {
                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                                boolean areEqual = Intrinsics.areEqual(scheduleCalendarDate2, scheduleCalendarDate);
                                Function1 function12 = function1;
                                boolean changed = gapComposer3.changed(function12) | gapComposer3.changedInstance(scheduleCalendarDate2);
                                Object rememberedValue = gapComposer3.rememberedValue();
                                if (changed || rememberedValue == obj4) {
                                    rememberedValue = new CalendarRowKt$$ExternalSyntheticLambda5(function12, scheduleCalendarDate2, 1);
                                    gapComposer3.updateRememberedValue(rememberedValue);
                                }
                                GapComposer gapComposer4 = gapComposer3;
                                CalendarDateItemStyle calendarDateItemStyle5 = calendarDateItemStyle4;
                                CanvasCompatO.CalendarDateItem(layoutWeightElement, scheduleCalendarDate2, areEqual, z, calendarDateItemStyle5, (Function0) rememberedValue, true, gapComposer4, (((i3 >> 6) & 8) << 3) | 12582912, 0);
                                calendarDateItemStyle4 = calendarDateItemStyle5;
                                gapComposer3 = gapComposer4;
                            }
                            i4 = 3;
                            calendarDateItemStyle2 = calendarDateItemStyle4;
                            f = 1.0f;
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(true);
                        int i5 = indexOf;
                        if (i5 < 0 || z3) {
                            gapComposer3.startReplaceGroup(911397095);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(910488950);
                            ((ScheduleCalendarDate) list2.get(i5)).getClass();
                            gapComposer3.startReplaceGroup(910634216);
                            gapComposer3.end(false);
                            long j = calendarDateItemStyle2.selectedBorderColor;
                            State m155animateDpAsStateAjpBEmI = AnimateAsStateKt.m155animateDpAsStateAjpBEmI(Recorder$$ExternalSyntheticOutline2.m(m259getMaxWidthD9Ej5fM, 44.0f, 2.0f, i5 * m259getMaxWidthD9Ej5fM), TargetUtils.sharp$default((zzb) ((Motion) gapComposer3.consume(MotionKt.LocalMotion)).springs.text), null, null, gapComposer3, 0, 12);
                            Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                            int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, matchParentSize);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                            boolean changed2 = gapComposer3.changed(m155animateDpAsStateAjpBEmI);
                            Object rememberedValue2 = gapComposer3.rememberedValue();
                            if (changed2 || rememberedValue2 == obj4) {
                                rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda10(m155animateDpAsStateAjpBEmI, i4);
                                gapComposer3.updateRememberedValue(rememberedValue2);
                            }
                            BoxKt.Box(ImageKt.m178borderxT4_qwU(SizeKt.fillMaxHeight(SizeKt.m290width3ABfNKs(OffsetKt.offset(companion2, (Function1) rememberedValue2), 44.0f), f), f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), gapComposer3, 0);
                            gapComposer3.end(true);
                            gapComposer3.end(false);
                        }
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer, 3072, 6);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalendarRowKt$$ExternalSyntheticLambda6(modifier2, list, scheduleCalendarDate, z, calendarDateItemStyle, function1, z2, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26, types: [int] */
    /* JADX WARN: Type inference failed for: r15v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CalendarDateItem(Modifier modifier, ScheduleCalendarDate scheduleCalendarDate, boolean z, boolean z2, CalendarDateItemStyle calendarDateItemStyle, Function0 function0, boolean z3, Composer composer, int i, int i2) {
        int i3;
        boolean z4;
        CalendarDateItemStyle calendarDateItemStyle2;
        boolean z5;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        boolean z6;
        Color m;
        boolean z7;
        Object rememberedValue;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        CalendarTextStyle calendarTextStyle;
        int i4;
        BiasAlignment biasAlignment;
        NeverEqualPolicy neverEqualPolicy;
        Modifier.Companion companion;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        boolean z8;
        ScheduleCalendarDate scheduleCalendarDate2;
        String str;
        TextStyle textStyle;
        boolean z9;
        GapComposer gapComposer2;
        ?? r15;
        long j;
        ScheduleCalendarDate scheduleCalendarDate3 = scheduleCalendarDate;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(356929228);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer3.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? gapComposer3.changed(scheduleCalendarDate3) : gapComposer3.changedInstance(scheduleCalendarDate3) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer3.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer3.changed(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer3.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer3.changed(calendarDateItemStyle) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer3.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            z4 = z3;
            i3 |= gapComposer3.changed(z4) ? 8388608 : 4194304;
            if (gapComposer3.shouldExecute(i3 & 1, (4793491 & i3) == 4793490)) {
                calendarDateItemStyle2 = calendarDateItemStyle;
                gapComposer3.skipToGroupEnd();
                z5 = z4;
                gapComposer = gapComposer3;
            } else {
                z5 = i5 != 0 ? false : z4;
                if (z && z5) {
                    gapComposer3.startReplaceGroup(-1060003567);
                    gapComposer3.end(false);
                } else {
                    if (z) {
                        scheduleCalendarDate3.getClass();
                    }
                    if (scheduleCalendarDate3.isToday) {
                        calendarDateItemStyle.getClass();
                    }
                    if (z) {
                        gapComposer3.startReplaceGroup(-588374433);
                        gapComposer3.end(false);
                        m = new Color(calendarDateItemStyle.selectedBorderColor);
                    } else if (scheduleCalendarDate3.isSelectable && z2) {
                        gapComposer3.startReplaceGroup(-588370284);
                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            z6 = false;
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            z6 = false;
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        m = Recorder$$ExternalSyntheticOutline1.m(gapComposer3, z6, colors.semantic.background.standard);
                    } else {
                        gapComposer3.startReplaceGroup(-1059586927);
                        gapComposer3.end(false);
                    }
                    z7 = (i3 & 112) != 32 || ((i3 & 64) != 0 && gapComposer3.changedInstance(scheduleCalendarDate3));
                    rememberedValue = gapComposer3.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                    if (!z7 || rememberedValue == neverEqualPolicy2) {
                        rememberedValue = new RewardSlotQueries$$ExternalSyntheticLambda0(scheduleCalendarDate3, 24);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue);
                    BiasAlignment biasAlignment2 = Alignment.Companion.Center;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, clearAndSetSemantics);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier != null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$16);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$17);
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                    gapComposer3.startReplaceGroup(-1437009725);
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier clip = ClipKt.clip(SizeKt.m290width3ABfNKs(companion2, 44.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                    if (m != null) {
                        clip = clip.then(ImageKt.m178borderxT4_qwU(companion2, 1.0f, m.value, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)));
                    }
                    boolean z10 = scheduleCalendarDate3.isSelectable;
                    CalendarTextStyle calendarTextStyle2 = scheduleCalendarDate3.dateNumberTextStyle;
                    int i6 = scheduleCalendarDate3.dayOfMonth;
                    if (z10) {
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy2) {
                            rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                        Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        calendarTextStyle = calendarTextStyle2;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                        i4 = i6;
                        neverEqualPolicy = neverEqualPolicy2;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        z8 = false;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        biasAlignment = biasAlignment2;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        companion = companion2;
                        clip = clip.then(ImageKt.m182clickableO2vRcR0$default(companion2, mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(Color.m675copywmQWz5c$default(0.2f, colors2.semantic.background.prominent, 14), true, RecyclerView.DECELERATION_RATE, null, gapComposer3, 48, 12), false, null, null, function0, 28));
                    } else {
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        calendarTextStyle = calendarTextStyle2;
                        i4 = i6;
                        biasAlignment = biasAlignment2;
                        neverEqualPolicy = neverEqualPolicy2;
                        companion = companion2;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                        z8 = false;
                    }
                    gapComposer3.end(z8);
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(clip, RecyclerView.DECELERATION_RATE, 8.0f, 1);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer3, 48);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m300paddingVpY3zN4$default);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$1, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$13);
                    int i7 = i4;
                    if (i7 == 1) {
                        scheduleCalendarDate2 = scheduleCalendarDate;
                        str = scheduleCalendarDate2.monthAbbreviation.toUpperCase(Locale.ROOT);
                        str.getClass();
                    } else {
                        scheduleCalendarDate2 = scheduleCalendarDate;
                        str = scheduleCalendarDate2.dayAbbreviation;
                    }
                    CalendarTextStyle calendarTextStyle3 = scheduleCalendarDate2.headerTextStyle;
                    CalendarTextStyle calendarTextStyle4 = CalendarTextStyle.DISABLED;
                    Modifier.Companion companion3 = companion;
                    calendarDateItemStyle2 = calendarDateItemStyle;
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, calendarTextStyle3 == calendarTextStyle4 ? calendarDateItemStyle.headerTextColors.disabled : calendarDateItemStyle.headerTextColors.f334default, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).labelXSmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(companion3, 12.0f));
                    int ordinal = calendarTextStyle.ordinal();
                    if (ordinal == 0) {
                        textStyle = calendarDateItemStyle2.dateNumberTextStyles.standard;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        textStyle = calendarDateItemStyle2.dateNumberTextStyles.disabled;
                    }
                    TextStyle textStyle2 = textStyle;
                    long j2 = calendarTextStyle == calendarTextStyle4 ? calendarDateItemStyle2.dateNumberTextColors.disabled : calendarDateItemStyle2.dateNumberTextColors.f334default;
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, companion3);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$1, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$13);
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, j2, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, String.valueOf(i7), (Map) null, (Function1) null, false);
                    GapComposer gapComposer4 = gapComposer3;
                    CalendarDateItemDateNumberTextStyles calendarDateItemDateNumberTextStyles = calendarDateItemStyle2.dateNumberTextStyles;
                    if (Intrinsics.areEqual(calendarDateItemDateNumberTextStyles.standard, calendarDateItemDateNumberTextStyles.disabled)) {
                        z9 = false;
                        gapComposer4.startReplaceGroup(-2021613132);
                        gapComposer4.end(false);
                        gapComposer2 = gapComposer4;
                    } else {
                        gapComposer4.startReplaceGroup(-2021796993);
                        TextStyle textStyle3 = calendarDateItemStyle2.dateNumberTextStyles.standard;
                        Modifier alpha = AlphaKt.alpha(companion3, RecyclerView.DECELERATION_RATE);
                        Object rememberedValue3 = gapComposer4.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new CalendarRowKt$$ExternalSyntheticLambda10(0);
                            gapComposer4.updateRememberedValue(rememberedValue3);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4088, 0L, (Composer) gapComposer4, SemanticsModifierKt.clearAndSetSemantics(alpha, (Function1) rememberedValue3), textStyle3, (TextLineBalancing) null, "0", (Map) null, (Function1) null, false);
                        GapComposer gapComposer5 = gapComposer4;
                        z9 = false;
                        gapComposer5.end(false);
                        gapComposer2 = gapComposer5;
                    }
                    gapComposer2.end(true);
                    scheduleCalendarDate3 = scheduleCalendarDate;
                    DotStyle dotStyle = scheduleCalendarDate3.dotStyle;
                    DotStyle dotStyle2 = DotStyle.NONE;
                    if (dotStyle == dotStyle2) {
                        gapComposer2.startReplaceGroup(-381408205);
                        gapComposer2.end(z9);
                        j = Color.Transparent;
                        r15 = z9;
                    } else if (z && dotStyle != dotStyle2) {
                        gapComposer2.startReplaceGroup(-381404616);
                        gapComposer2.end(z9);
                        j = calendarDateItemStyle2.selectedDotColor;
                        r15 = 0;
                    } else if (dotStyle == DotStyle.DISABLED) {
                        gapComposer2.startReplaceGroup(-381400816);
                        j = Strings.getColors(gapComposer2).semantic.icon.disabled;
                        r15 = 0;
                        gapComposer2.end(false);
                    } else {
                        r15 = 0;
                        gapComposer2.startReplaceGroup(-381398640);
                        j = Strings.getColors(gapComposer2).semantic.text.standard;
                        gapComposer2.end(false);
                    }
                    SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion3, 2.0f));
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(companion3, 4.0f), RoundedCornerShapeKt.CircleShape), j, ColorKt.RectangleShape), gapComposer2, r15);
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                    gapComposer = gapComposer2;
                }
                m = null;
                if ((i3 & 112) != 32) {
                }
                rememberedValue = gapComposer3.rememberedValue();
                NeverEqualPolicy neverEqualPolicy22 = Composer.Companion.Empty;
                if (!z7) {
                }
                rememberedValue = new RewardSlotQueries$$ExternalSyntheticLambda0(scheduleCalendarDate3, 24);
                gapComposer3.updateRememberedValue(rememberedValue);
                Modifier clearAndSetSemantics2 = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue);
                BiasAlignment biasAlignment22 = Alignment.Companion.Center;
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment22, false);
                int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer3, clearAndSetSemantics2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$122 = ComposeUiNode.Companion.Constructor;
                if (applier != null) {
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new CalendarRowKt$$ExternalSyntheticLambda11(modifier, scheduleCalendarDate3, z, z2, calendarDateItemStyle2, function0, z5, i, i2);
                return;
            }
            return;
        }
        z4 = z3;
        if (gapComposer3.shouldExecute(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CalendarRow(Modifier modifier, List list, ScheduleCalendarDate scheduleCalendarDate, int i, boolean z, final boolean z2, CalendarDateItemStyle calendarDateItemStyle, final Function1 function1, Function1 function12, Composer composer, int i2) {
        GapComposer gapComposer;
        boolean z3;
        CalendarDateItemStyle calendarDateItemStyle2;
        CalendarDateItemStyle calendarDateItemStyle3;
        int i3;
        boolean z4;
        DefaultPagerState defaultPagerState;
        List list2;
        boolean z5;
        final ScheduleCalendarDate scheduleCalendarDate2 = scheduleCalendarDate;
        list.getClass();
        function1.getClass();
        function12.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(231588094);
        int i4 = i2 | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(list) ? 32 : 16) | (gapComposer2.changed(scheduleCalendarDate2) ? 256 : 128) | (gapComposer2.changed(i) ? 2048 : 1024) | 35348480 | (gapComposer2.changedInstance(function1) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer2.shouldExecute(i4 & 1, (306783379 & i4) != 306783378)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                calendarDateItemStyle3 = new CalendarDateItemStyle(new CalendarDateItemTextColors(Strings.getColors(gapComposer2).semantic.text.brand, Strings.getColors(gapComposer2).semantic.text.disabled, Strings.getColors(gapComposer2).semantic.text.standard), new CalendarDateItemDateNumberTextStyles(Strings.getTypography(gapComposer2).bodyMedium, Strings.getTypography(gapComposer2).bodyMedium), new CalendarDateItemTextColors(Strings.getColors(gapComposer2).semantic.text.brand, Strings.getColors(gapComposer2).semantic.text.disabled, Strings.getColors(gapComposer2).semantic.text.standard), Strings.getColors(gapComposer2).semantic.text.brand, Strings.getColors(gapComposer2).semantic.background.brand);
                i3 = i4 & (-234881025);
                z4 = true;
            } else {
                gapComposer2.skipToGroupEnd();
                i3 = i4 & (-234881025);
                z4 = z;
                calendarDateItemStyle3 = calendarDateItemStyle;
            }
            final int i5 = i3;
            gapComposer2.endDefaults();
            RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer2.consume(HapticVibratorKt.LocalHapticVibrator);
            Haptics haptics = (Haptics) gapComposer2.consume(HapticsKt.LocalHaptics);
            Object rememberedValue = gapComposer2.rememberedValue();
            Continuation continuation = null;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            boolean changed = gapComposer2.changed(list);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = CollectionsKt.windowed(list, 7, 7, true);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            List list3 = (List) rememberedValue2;
            boolean changedInstance = gapComposer2.changedInstance(list3);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new h2$$ExternalSyntheticLambda0(list3, 9);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(i, (Function0) rememberedValue3, gapComposer2, (i5 >> 9) & 14, 2);
            Integer valueOf = Integer.valueOf(((ParcelableSnapshotMutableIntState) rememberPagerState.scrollPosition.elementTypes).getIntValue());
            boolean changed2 = gapComposer2.changed(rememberPagerState) | gapComposer2.changedInstance(list3);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue4 == neverEqualPolicy) {
                defaultPagerState = rememberPagerState;
                list2 = list3;
                z5 = true;
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1(defaultPagerState, list2, function12, continuation, 21);
                gapComposer2.updateRememberedValue(setNameViewKt$SetName$2$1);
                rememberedValue4 = setNameViewKt$SetName$2$1;
            } else {
                defaultPagerState = rememberPagerState;
                list2 = list3;
                z5 = true;
            }
            Updater.LaunchedEffect(list, valueOf, (Function2) rememberedValue4, gapComposer2);
            boolean changedInstance2 = gapComposer2.changedInstance(realHapticVibrator) | ((i5 & 896) != 256 ? false : z5) | gapComposer2.changed(haptics);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) scheduleCalendarDate, (Object) realHapticVibrator, (Object) haptics, mutableState, (Continuation) null, 1);
                scheduleCalendarDate2 = scheduleCalendarDate;
                gapComposer2.updateRememberedValue(dotGridKt$DotGrid$3$1);
                rememberedValue5 = dotGridKt$DotGrid$3$1;
            }
            Updater.LaunchedEffect(gapComposer2, scheduleCalendarDate2, (Function2) rememberedValue5);
            final boolean z6 = z4;
            final CalendarDateItemStyle calendarDateItemStyle4 = calendarDateItemStyle3;
            final List list4 = list2;
            DefaultPagerState defaultPagerState2 = defaultPagerState;
            gapComposer = gapComposer2;
            PagerKt.m328HorizontalPager8jOkeI(defaultPagerState2, SizeKt.fillMaxWidth(modifier, 1.0f), null, null, 0, RecyclerView.DECELERATION_RATE, null, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(-252269889, new Function4() { // from class: com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    Composer composer2 = (Composer) obj3;
                    ((Integer) obj4).getClass();
                    ((PagerScopeImpl) obj).getClass();
                    List list5 = (List) CollectionsKt.getOrNull(intValue, list4);
                    if (list5 == null) {
                        list5 = EmptyList.INSTANCE;
                    }
                    List list6 = list5;
                    boolean z7 = z2;
                    ScheduleCalendarDate scheduleCalendarDate3 = scheduleCalendarDate2;
                    boolean z8 = z6;
                    CalendarDateItemStyle calendarDateItemStyle5 = calendarDateItemStyle4;
                    int i6 = i5;
                    Function1 function13 = function1;
                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                    if (z7) {
                        GapComposer gapComposer3 = (GapComposer) composer2;
                        gapComposer3.startReplaceGroup(820645760);
                        gapComposer3.startReplaceGroup(821202954);
                        boolean changed3 = gapComposer3.changed(function13);
                        Object rememberedValue6 = gapComposer3.rememberedValue();
                        if (changed3 || rememberedValue6 == neverEqualPolicy2) {
                            rememberedValue6 = new SsnViewKt$$ExternalSyntheticLambda1(15, function13);
                            gapComposer3.updateRememberedValue(rememberedValue6);
                        }
                        CanvasCompatO.AnimatedDateRow(null, list6, scheduleCalendarDate3, z8, calendarDateItemStyle5, (Function1) rememberedValue6, false, gapComposer3, (((i6 >> 6) & 8) << 6) | 12582912);
                        gapComposer3.end(false);
                        gapComposer3.end(false);
                    } else {
                        GapComposer gapComposer4 = (GapComposer) composer2;
                        gapComposer4.startReplaceGroup(821638256);
                        gapComposer4.startReplaceGroup(822187762);
                        boolean changed4 = gapComposer4.changed(function13);
                        Object rememberedValue7 = gapComposer4.rememberedValue();
                        if (changed4 || rememberedValue7 == neverEqualPolicy2) {
                            rememberedValue7 = new SsnViewKt$$ExternalSyntheticLambda1(16, function13);
                            gapComposer4.updateRememberedValue(rememberedValue7);
                        }
                        CanvasCompatO.DateRow(null, list6, scheduleCalendarDate3, z8, calendarDateItemStyle5, (Function1) rememberedValue7, false, gapComposer4, (((i6 >> 6) & 8) << 6) | 12582912);
                        gapComposer4.end(false);
                        gapComposer4.end(false);
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer, 0, 24576, 16380);
            calendarDateItemStyle2 = calendarDateItemStyle4;
            z3 = z6;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            z3 = z;
            calendarDateItemStyle2 = calendarDateItemStyle;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalendarRowKt$$ExternalSyntheticLambda2(modifier, list, scheduleCalendarDate, i, z3, z2, calendarDateItemStyle2, function1, function12, i2);
        }
    }

    public static final void DateRow(Modifier modifier, List list, ScheduleCalendarDate scheduleCalendarDate, boolean z, CalendarDateItemStyle calendarDateItemStyle, Function1 function1, boolean z2, Composer composer, int i) {
        Modifier modifier2;
        Modifier.Companion companion;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-497421464);
        Applier applier = gapComposer.applier;
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(scheduleCalendarDate) : gapComposer.changedInstance(scheduleCalendarDate) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        CalendarDateItemStyle calendarDateItemStyle2 = calendarDateItemStyle;
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(calendarDateItemStyle2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changed(z2) ? 8388608 : 4194304;
        }
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
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
            if (z2) {
                gapComposer.startReplaceGroup(-639012347);
                companion = companion2;
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, 1);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(function0);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
                z3 = true;
            } else {
                companion = companion2;
                gapComposer.startReplaceGroup(-638791193);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ScheduleCalendarDate scheduleCalendarDate2 = (ScheduleCalendarDate) it.next();
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    boolean areEqual = Intrinsics.areEqual(scheduleCalendarDate2, scheduleCalendarDate);
                    boolean changedInstance = ((3670016 & i2) == 1048576) | gapComposer.changedInstance(scheduleCalendarDate2);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new CalendarRowKt$$ExternalSyntheticLambda5(function1, scheduleCalendarDate2, 0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    CalendarDateItem(layoutWeightElement, scheduleCalendarDate2, areEqual, z, calendarDateItemStyle2, (Function0) rememberedValue, false, gapComposer, (((i2 >> 6) & 8) << 3) | (i2 & 7168) | (57344 & i2) | (458752 & i2), 128);
                    calendarDateItemStyle2 = calendarDateItemStyle;
                }
                z3 = true;
                gapComposer.end(false);
            }
            gapComposer.end(z3);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalendarRowKt$$ExternalSyntheticLambda6(modifier2, list, scheduleCalendarDate, z, calendarDateItemStyle, function1, z2, i, 0);
        }
    }

    public static boolean clipOutPath(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static boolean clipOutRect(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static final boolean isRatePlanBusiness(P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings) {
        p2pSettingsManager$P2pSettings.getClass();
        RatePlan ratePlan = p2pSettingsManager$P2pSettings.ratePlan;
        switch (ratePlan == null ? -1 : P2pSettingsManagerKt$WhenMappings.$EnumSwitchMapping$0[ratePlan.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static boolean clipOutRect(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public static boolean clipOutRect(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static boolean clipOutRect(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }
}
