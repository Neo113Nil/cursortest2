package com.squareup.cash.charting.components;

import android.graphics.CornerPathEffect;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.AndroidPathMeasure;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.charting.viewmodels.LineChartViewModel;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda7;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.offers.presenters.OffersAnalyticsKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.util.Strings;
import com.squareup.util.android.StringsKt;
import com.squareup.util.cash.ColorsKt;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public abstract class LineChartKt {
    public static final List LONG_X_AXIS_LABELS;
    public static final List X_AXIS_LABELS;
    public static final List Y_AXIS_LABELS;

    static {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.Line.Point[]{new LineChartViewModel.Line.Point(1.0f, 5.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(2.0f, 50.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(3.0f, 25.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(4.0f, 1.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(5.0f, 15.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(6.0f, 20.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(7.0f, 75.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(8.0f, 80.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(9.0f, 60.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(10.0f, 100.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(11.0f, 90.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(12.0f, 25.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(13.0f, 33.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(14.0f, 40.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(15.0f, RecyclerView.DECELERATION_RATE, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(16.0f, 5.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(17.0f, 10.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(18.0f, 10.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(19.0f, 50.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(20.0f, 90.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)});
        ColorsKt.toColor("#00D64F");
        LineChartViewModel.Line.InterpolationMethod interpolationMethod = LineChartViewModel.Line.InterpolationMethod.LINEAR;
        listOf.getClass();
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.Line.Point[]{new LineChartViewModel.Line.Point(1.0f, 3.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(3.0f, RecyclerView.DECELERATION_RATE, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(5.0f, 42.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(7.0f, 75.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(9.0f, 44.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(11.0f, 22.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(13.0f, 100.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(15.0f, 80.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(17.0f, 33.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), new LineChartViewModel.Line.Point(19.0f, 10.0f, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)});
        ColorsKt.toColor("#FF0000");
        ColorsKt.toColor("#FF0000");
        listOf2.getClass();
        Y_AXIS_LABELS = CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.AxisLabel[]{new LineChartViewModel.AxisLabel("0", RecyclerView.DECELERATION_RATE), new LineChartViewModel.AxisLabel("10", 10.0f), new LineChartViewModel.AxisLabel("25", 25.0f), new LineChartViewModel.AxisLabel("50", 50.0f), new LineChartViewModel.AxisLabel("100", 100.0f)});
        X_AXIS_LABELS = CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.AxisLabel[]{new LineChartViewModel.AxisLabel("2023", 1.0f), new LineChartViewModel.AxisLabel("2024", 10.0f), new LineChartViewModel.AxisLabel("2025", 20.0f)});
        LONG_X_AXIS_LABELS = CollectionsKt__CollectionsKt.listOf((Object[]) new LineChartViewModel.AxisLabel[]{new LineChartViewModel.AxisLabel("January 1, 2022", 1.0f), new LineChartViewModel.AxisLabel("January 1, 2023", 5.0f), new LineChartViewModel.AxisLabel("January 1, 2024", 10.0f), new LineChartViewModel.AxisLabel("January 1, 2025", 15.0f), new LineChartViewModel.AxisLabel("January 1, 2026", 20.0f)});
    }

    /* renamed from: Chart-Yq1gxAc, reason: not valid java name */
    public static final void m3458ChartYq1gxAc(final LineChartViewModel lineChartViewModel, final float f, final ArrayList arrayList, final List list, final float f2, final float f3, final float f4, final float f5, final Modifier modifier, final boolean z, final LineChartSelectionState lineChartSelectionState, Composer composer, final int i) {
        GapComposer gapComposer;
        Float valueOf;
        Float valueOf2;
        float f6;
        int i2;
        int i3;
        int i4;
        Modifier modifier2;
        Modifier modifier3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(335630014);
        int i5 = i | (gapComposer2.changedInstance(lineChartViewModel) ? 4 : 2) | (gapComposer2.changed(f) ? 32 : 16) | (gapComposer2.changedInstance(arrayList) ? 256 : 128) | (gapComposer2.changedInstance(list) ? 2048 : 1024) | (gapComposer2.changed(f2) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(f3) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changed(f4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changed(f5) ? 8388608 : 4194304) | (gapComposer2.changed(modifier) ? 67108864 : 33554432) | (gapComposer2.changed(z) ? PKIFailureInfo.duplicateCertReq : 268435456);
        char c = gapComposer2.changed(lineChartSelectionState) ? (char) 4 : (char) 2;
        if (gapComposer2.shouldExecute(i5 & 1, ((i5 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            int i6 = 1879048192 & i5;
            boolean z2 = i6 == 536870912;
            Object rememberedValue = gapComposer2.rememberedValue();
            float f7 = RecyclerView.DECELERATION_RATE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = AnimatableKt.Animatable(z ? 0.0f : 1.0f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final Animatable animatable = (Animatable) rememberedValue;
            Boolean valueOf3 = Boolean.valueOf(z);
            boolean changedInstance = (i6 == 536870912) | gapComposer2.changedInstance(animatable);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new LineChartKt$Chart$1$1(z, animatable, (Continuation) null, 0);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer2, valueOf3, (Function2) rememberedValue2);
            boolean changed = gapComposer2.changed(lineChartViewModel.lines);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            Object obj = rememberedValue3;
            if (changed || rememberedValue3 == neverEqualPolicy) {
                List list2 = lineChartViewModel.lines;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((LineChartViewModel.Line) it.next()).points, arrayList2);
                }
                gapComposer2.updateRememberedValue(arrayList2);
                obj = arrayList2;
            }
            final List list3 = (List) obj;
            List list4 = list3;
            Iterator it2 = list4.iterator();
            if (it2.hasNext()) {
                float f8 = ((LineChartViewModel.Line.Point) it2.next()).x;
                while (it2.hasNext()) {
                    f8 = Math.min(f8, ((LineChartViewModel.Line.Point) it2.next()).x);
                }
                valueOf = Float.valueOf(f8);
            } else {
                valueOf = null;
            }
            float floatValue = valueOf != null ? valueOf.floatValue() : 0.0f;
            Iterator it3 = list4.iterator();
            if (it3.hasNext()) {
                float f9 = ((LineChartViewModel.Line.Point) it3.next()).x;
                while (it3.hasNext()) {
                    f9 = Math.max(f9, ((LineChartViewModel.Line.Point) it3.next()).x);
                }
                valueOf2 = Float.valueOf(f9);
            } else {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                f7 = valueOf2.floatValue();
            }
            final float f10 = f7;
            final boolean z3 = Strings.getColors(gapComposer2).isLight;
            final long j = Strings.getColors(gapComposer2).semantic.border.subtle;
            final long j2 = Strings.getColors(gapComposer2).semantic.border.prominent;
            final long j3 = Strings.getColors(gapComposer2).semantic.border.subtle;
            final long j4 = Strings.getColors(gapComposer2).semantic.icon.prominent;
            gapComposer2.startReplaceGroup(417945125);
            if (arrayList.isEmpty()) {
                gapComposer2.startReplaceGroup(417939434);
                gapComposer2.end(false);
                f6 = f;
            } else {
                gapComposer2.startReplaceGroup(417940835);
                Strings.getSizes(gapComposer2).getClass();
                DefaultSizes.spacing.getClass();
                gapComposer2.end(false);
                f6 = 8.0f;
            }
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(modifier, f, f, f6, f);
            if (Intrinsics.areEqual(lineChartSelectionState.getSelectionBehavior(), LineChartSelectionState$SelectionBehavior$None.INSTANCE)) {
                i2 = PKIFailureInfo.unsupportedVersion;
                i3 = 16384;
                i4 = 458752;
            } else {
                Float valueOf4 = Float.valueOf(f2);
                i4 = 458752;
                Float valueOf5 = Float.valueOf(f3);
                final float f11 = floatValue;
                boolean changed2 = ((c & 14) == 4) | ((i5 & 57344) == 16384) | ((i5 & 458752) == 131072) | gapComposer2.changed(floatValue) | gapComposer2.changed(f10) | gapComposer2.changedInstance(list3);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue4 == neverEqualPolicy) {
                    modifier3 = m301paddingqDBjuR0;
                    i2 = PKIFailureInfo.unsupportedVersion;
                    i3 = 16384;
                    rememberedValue4 = new PointerInputEventHandler() { // from class: com.squareup.cash.charting.components.LineChartKt$Chart$2$1$1

                        /* renamed from: com.squareup.cash.charting.components.LineChartKt$Chart$2$1$1$1, reason: invalid class name */
                        public final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
                            public final /* synthetic */ List $allPoints;
                            public final /* synthetic */ float $maxPointsX;
                            public final /* synthetic */ float $maxX;
                            public final /* synthetic */ float $minPointsX;
                            public final /* synthetic */ float $minX;
                            public final /* synthetic */ LineChartSelectionState $selectionState;
                            public float F$0;
                            public float F$1;
                            public /* synthetic */ Object L$0;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(float f, float f2, float f3, float f4, LineChartSelectionState lineChartSelectionState, List list, Continuation continuation) {
                                super(2, continuation);
                                this.$minX = f;
                                this.$maxX = f2;
                                this.$minPointsX = f3;
                                this.$maxPointsX = f4;
                                this.$selectionState = lineChartSelectionState;
                                this.$allPoints = list;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$minX, this.$maxX, this.$minPointsX, this.$maxPointsX, this.$selectionState, this.$allPoints, continuation);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ((AnonymousClass1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
                            
                                if (r14 != r2) goto L17;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
                            
                                return r2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:35:0x0044, code lost:
                            
                                if (r3 == r2) goto L16;
                             */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0093 -> B:6:0x0096). Please report as a decompilation issue!!! */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invokeSuspend(Object obj) {
                                Object awaitFirstDown$default;
                                char c;
                                float f;
                                float f2;
                                Object awaitPointerEvent;
                                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i = this.label;
                                List list = this.$allPoints;
                                float f3 = this.$maxPointsX;
                                float f4 = this.$minPointsX;
                                float f5 = this.$maxX;
                                float f6 = this.$minX;
                                int i2 = 2;
                                LineChartSelectionState lineChartSelectionState = this.$selectionState;
                                if (i == 0) {
                                    SafeTrace.throwOnFailure(obj);
                                    this.L$0 = pointerEventHandlerCoroutine;
                                    this.label = 1;
                                    awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine, this, 3);
                                } else {
                                    if (i != 1) {
                                        if (i != 2) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        f2 = this.F$1;
                                        f = this.F$0;
                                        SafeTrace.throwOnFailure(obj);
                                        awaitPointerEvent = obj;
                                        c = ' ';
                                        PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent;
                                        Iterator it = pointerEvent.changes.iterator();
                                        while (it.hasNext()) {
                                            LineChartSelectionState lineChartSelectionState2 = lineChartSelectionState;
                                            float coerceIn = RangesKt___RangesKt.coerceIn(Float.intBitsToFloat((int) (((PointerInputChange) it.next()).position >> c)), RecyclerView.DECELERATION_RATE, (int) (SuspendingPointerInputModifierNodeImpl.this.boundsSize >> c));
                                            float f7 = (int) (SuspendingPointerInputModifierNodeImpl.this.boundsSize >> c);
                                            List list2 = LineChartKt.Y_AXIS_LABELS;
                                            lineChartSelectionState2.selectedPoints$delegate.setValue(LineChartKt.access$findSelectedPoints(RangesKt___RangesKt.coerceIn(CameraState$Type$EnumUnboxingLocalUtility.m(f5, f6, coerceIn / f7, f6), f4, f3), list, lineChartSelectionState2.getSelectionBehavior()));
                                            lineChartSelectionState2.getSelectionBehavior();
                                            lineChartSelectionState = lineChartSelectionState2;
                                        }
                                        LineChartSelectionState lineChartSelectionState3 = lineChartSelectionState;
                                        List list3 = pointerEvent.changes;
                                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                            Iterator it2 = list3.iterator();
                                            while (it2.hasNext()) {
                                                if (((PointerInputChange) it2.next()).pressed) {
                                                    lineChartSelectionState = lineChartSelectionState3;
                                                    i2 = 2;
                                                    this.L$0 = pointerEventHandlerCoroutine;
                                                    this.F$0 = f;
                                                    this.F$1 = f2;
                                                    this.label = i2;
                                                    awaitPointerEvent = pointerEventHandlerCoroutine.awaitPointerEvent(PointerEventPass.Main, this);
                                                }
                                            }
                                        }
                                        lineChartSelectionState3.selectedPoints$delegate.setValue(null);
                                        lineChartSelectionState3.getSelectionBehavior();
                                        return Unit.INSTANCE;
                                    }
                                    SafeTrace.throwOnFailure(obj);
                                    awaitFirstDown$default = obj;
                                }
                                float coerceIn2 = RangesKt___RangesKt.coerceIn(Float.intBitsToFloat((int) (((PointerInputChange) awaitFirstDown$default).position >> 32)), RecyclerView.DECELERATION_RATE, (int) (SuspendingPointerInputModifierNodeImpl.this.boundsSize >> 32));
                                float f8 = (int) (SuspendingPointerInputModifierNodeImpl.this.boundsSize >> 32);
                                List list4 = LineChartKt.Y_AXIS_LABELS;
                                float coerceIn3 = RangesKt___RangesKt.coerceIn(CameraState$Type$EnumUnboxingLocalUtility.m(f5, f6, coerceIn2 / f8, f6), f4, f3);
                                c = ' ';
                                lineChartSelectionState.selectedPoints$delegate.setValue(LineChartKt.access$findSelectedPoints(coerceIn3, list, lineChartSelectionState.getSelectionBehavior()));
                                lineChartSelectionState.getSelectionBehavior();
                                f = coerceIn2;
                                f2 = coerceIn3;
                                this.L$0 = pointerEventHandlerCoroutine;
                                this.F$0 = f;
                                this.F$1 = f2;
                                this.label = i2;
                                awaitPointerEvent = pointerEventHandlerCoroutine.awaitPointerEvent(PointerEventPass.Main, this);
                            }
                        }

                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                            Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(f2, f3, f11, f10, lineChartSelectionState, list3, null), continuation);
                            return awaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitEachGesture : Unit.INSTANCE;
                        }
                    };
                    gapComposer2.updateRememberedValue(rememberedValue4);
                } else {
                    modifier3 = m301paddingqDBjuR0;
                    i2 = PKIFailureInfo.unsupportedVersion;
                    i3 = 16384;
                }
                m301paddingqDBjuR0 = modifier3.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion.$$INSTANCE, valueOf4, valueOf5, (PointerInputEventHandler) rememberedValue4));
            }
            Modifier modifier4 = m301paddingqDBjuR0;
            gapComposer2.end(false);
            boolean changedInstance2 = gapComposer2.changedInstance(list) | gapComposer2.changedInstance(arrayList) | gapComposer2.changed(j) | ((c & 14) == 4) | ((i5 & 57344) == i3) | ((i5 & i4) == i2) | ((i5 & 112) == 32) | gapComposer2.changedInstance(lineChartViewModel) | ((i5 & 3670016) == 1048576) | ((i5 & 29360128) == 8388608) | gapComposer2.changed(z3) | gapComposer2.changedInstance(animatable) | gapComposer2.changed(j3) | gapComposer2.changed(j2) | gapComposer2.changed(j4);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                modifier2 = modifier4;
                Function1 function1 = new Function1() { // from class: com.squareup.cash.charting.components.LineChartKt$$ExternalSyntheticLambda2
                    /* JADX WARN: Removed duplicated region for block: B:157:0x0102  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x015d  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x0324  */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x0328  */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj2) {
                        LineChartSelectionState lineChartSelectionState2;
                        Float f12;
                        GrpcMethod drawContext;
                        long m3999getSizeNHjbRc;
                        long j5;
                        Float f13;
                        Object next;
                        Object next2;
                        float f14;
                        Object next3;
                        LineChartViewModel.Line.Point point;
                        LineChartViewModel lineChartViewModel2 = lineChartViewModel;
                        float f15 = f4;
                        float f16 = f5;
                        boolean z4 = z3;
                        Animatable animatable2 = animatable;
                        long j6 = j3;
                        DrawScope drawScope = (DrawScope) obj2;
                        LineChartSelectionState$SelectionBehavior$None lineChartSelectionState$SelectionBehavior$None = LineChartSelectionState$SelectionBehavior$None.INSTANCE;
                        drawScope.getClass();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            for (Iterator it5 = list.iterator(); it5.hasNext(); it5 = it5) {
                                AxisPlacement axisPlacement = (AxisPlacement) it5.next();
                                drawScope.mo729drawLineNGM6Ib0(j, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(axisPlacement.yOffset) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(axisPlacement.yOffset) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : drawScope.mo236toPx0680j_4(1.0f), (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                                it4 = it4;
                            }
                        }
                        LineChartSelectionState lineChartSelectionState3 = lineChartSelectionState;
                        LineChartSelectionState$SelectionBehavior$None selectionBehavior = lineChartSelectionState3.getSelectionBehavior();
                        boolean areEqual = Intrinsics.areEqual(selectionBehavior, LineChartSelectionState$SelectionBehavior$None.INSTANCE$1);
                        float f17 = f2;
                        float f18 = f3;
                        try {
                            try {
                                try {
                                    if (areEqual) {
                                        List selectedPoints = lineChartSelectionState3.getSelectedPoints();
                                        if (selectedPoints != null && (point = (LineChartViewModel.Line.Point) CollectionsKt.firstOrNull(selectedPoints)) != null) {
                                            lineChartSelectionState2 = lineChartSelectionState3;
                                            float f19 = f18 - f17;
                                            f12 = Float.valueOf(f19 == RecyclerView.DECELERATION_RATE ? 0.0f : ((point.x - f17) / f19) * Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)));
                                            boolean areEqual2 = Intrinsics.areEqual(lineChartSelectionState2.getSelectionBehavior(), lineChartSelectionState$SelectionBehavior$None);
                                            float f20 = f;
                                            float max = areEqual2 ? Math.max(drawScope.mo236toPx0680j_4(f20), drawScope.mo236toPx0680j_4(8.0f)) : drawScope.mo236toPx0680j_4(f20);
                                            float f21 = -max;
                                            float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) + max;
                                            float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) + max;
                                            drawContext = drawScope.getDrawContext();
                                            m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                                            drawContext.getCanvas().save();
                                            ((Extras.Key) drawContext.path).m1435clipRectN_I0leg(f21, f21, intBitsToFloat, intBitsToFloat2, 1);
                                            f13 = f12;
                                            LineChartKt.m3460drawLinesfnh65Uc(drawScope, lineChartViewModel2.lines, f17, f18, f15, f16, z4, ((Number) animatable2.getValue()).floatValue(), f13, j6);
                                            Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                                            if (f13 != null) {
                                                float floatValue2 = f13.floatValue();
                                                drawScope.mo729drawLineNGM6Ib0(j2, (Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : drawScope.mo236toPx0680j_4(1.0f), (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                                                float floatValue3 = f13.floatValue();
                                                List<LineChartViewModel.Line> list5 = lineChartViewModel2.lines;
                                                float m = CameraState$Type$EnumUnboxingLocalUtility.m(f18, f17, floatValue3 / Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)), f17);
                                                for (LineChartViewModel.Line line : list5) {
                                                    if (line.selectionConfig.showHandle) {
                                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                                                        LineChartViewModel.Line.InterpolationMethod interpolationMethod = line.interpolationMethod;
                                                        List list6 = line.points;
                                                        int ordinal = interpolationMethod.ordinal();
                                                        if (ordinal == 0) {
                                                            List list7 = list6;
                                                            ArrayList arrayList3 = new ArrayList();
                                                            for (Object obj3 : list7) {
                                                                if (((LineChartViewModel.Line.Point) obj3).x <= m) {
                                                                    arrayList3.add(obj3);
                                                                }
                                                            }
                                                            Iterator it6 = arrayList3.iterator();
                                                            if (it6.hasNext()) {
                                                                next = it6.next();
                                                                if (it6.hasNext()) {
                                                                    float f22 = ((LineChartViewModel.Line.Point) next).x;
                                                                    do {
                                                                        Object next4 = it6.next();
                                                                        float f23 = ((LineChartViewModel.Line.Point) next4).x;
                                                                        if (Float.compare(f22, f23) < 0) {
                                                                            next = next4;
                                                                            f22 = f23;
                                                                        }
                                                                    } while (it6.hasNext());
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                            LineChartViewModel.Line.Point point2 = (LineChartViewModel.Line.Point) next;
                                                            ArrayList arrayList4 = new ArrayList();
                                                            for (Object obj4 : list7) {
                                                                if (((LineChartViewModel.Line.Point) obj4).x > m) {
                                                                    arrayList4.add(obj4);
                                                                }
                                                            }
                                                            Iterator it7 = arrayList4.iterator();
                                                            if (it7.hasNext()) {
                                                                next2 = it7.next();
                                                                if (it7.hasNext()) {
                                                                    float f24 = ((LineChartViewModel.Line.Point) next2).x;
                                                                    do {
                                                                        Object next5 = it7.next();
                                                                        float f25 = ((LineChartViewModel.Line.Point) next5).x;
                                                                        if (Float.compare(f24, f25) > 0) {
                                                                            next2 = next5;
                                                                            f24 = f25;
                                                                        }
                                                                    } while (it7.hasNext());
                                                                }
                                                            } else {
                                                                next2 = null;
                                                            }
                                                            LineChartViewModel.Line.Point point3 = (LineChartViewModel.Line.Point) next2;
                                                            if (point2 != null && point3 != null) {
                                                                float f26 = point3.x;
                                                                float f27 = point2.x;
                                                                float f28 = f26 - f27;
                                                                float f29 = point2.y;
                                                                f14 = f28 == RecyclerView.DECELERATION_RATE ? f29 : CameraState$Type$EnumUnboxingLocalUtility.m(point3.y, f29, (m - f27) / f28, f29);
                                                            } else if (point3 != null) {
                                                                f14 = point3.y;
                                                            } else {
                                                                if (point2 != null) {
                                                                    f14 = point2.y;
                                                                }
                                                                f14 = f15;
                                                            }
                                                            DrawScope.m738drawCircleVaOC9Bg$default(drawScope, j4, drawScope.mo236toPx0680j_4(8.0f), (Float.floatToRawIntBits(floatValue3) << 32) | (Float.floatToRawIntBits(f16 - f15 == RecyclerView.DECELERATION_RATE ? intBitsToFloat3 / 2.0f : intBitsToFloat3 - (((f14 - f15) / r9) * intBitsToFloat3)) & BodyPartID.bodyIdMax), null, 0, 120);
                                                        } else {
                                                            if (ordinal != 1) {
                                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                return null;
                                                            }
                                                            ArrayList arrayList5 = new ArrayList();
                                                            for (Object obj5 : list6) {
                                                                if (((LineChartViewModel.Line.Point) obj5).x <= m) {
                                                                    arrayList5.add(obj5);
                                                                }
                                                            }
                                                            Iterator it8 = arrayList5.iterator();
                                                            if (it8.hasNext()) {
                                                                next3 = it8.next();
                                                                if (it8.hasNext()) {
                                                                    float f30 = ((LineChartViewModel.Line.Point) next3).x;
                                                                    do {
                                                                        Object next6 = it8.next();
                                                                        float f31 = ((LineChartViewModel.Line.Point) next6).x;
                                                                        if (Float.compare(f30, f31) < 0) {
                                                                            next3 = next6;
                                                                            f30 = f31;
                                                                        }
                                                                    } while (it8.hasNext());
                                                                }
                                                            } else {
                                                                next3 = null;
                                                            }
                                                            LineChartViewModel.Line.Point point4 = (LineChartViewModel.Line.Point) next3;
                                                            if (point4 != null) {
                                                                f14 = point4.y;
                                                                DrawScope.m738drawCircleVaOC9Bg$default(drawScope, j4, drawScope.mo236toPx0680j_4(8.0f), (Float.floatToRawIntBits(floatValue3) << 32) | (Float.floatToRawIntBits(f16 - f15 == RecyclerView.DECELERATION_RATE ? intBitsToFloat3 / 2.0f : intBitsToFloat3 - (((f14 - f15) / r9) * intBitsToFloat3)) & BodyPartID.bodyIdMax), null, 0, 120);
                                                            }
                                                            f14 = f15;
                                                            DrawScope.m738drawCircleVaOC9Bg$default(drawScope, j4, drawScope.mo236toPx0680j_4(8.0f), (Float.floatToRawIntBits(floatValue3) << 32) | (Float.floatToRawIntBits(f16 - f15 == RecyclerView.DECELERATION_RATE ? intBitsToFloat3 / 2.0f : intBitsToFloat3 - (((f14 - f15) / r9) * intBitsToFloat3)) & BodyPartID.bodyIdMax), null, 0, 120);
                                                        }
                                                    }
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        lineChartSelectionState2 = lineChartSelectionState3;
                                    } else {
                                        lineChartSelectionState2 = lineChartSelectionState3;
                                        if (!Intrinsics.areEqual(selectionBehavior, lineChartSelectionState$SelectionBehavior$None)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                    }
                                    LineChartKt.m3460drawLinesfnh65Uc(drawScope, lineChartViewModel2.lines, f17, f18, f15, f16, z4, ((Number) animatable2.getValue()).floatValue(), f13, j6);
                                    Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                                    if (f13 != null) {
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th) {
                                    th = th;
                                    j5 = m3999getSizeNHjbRc;
                                    Recorder$$ExternalSyntheticOutline2.m(drawContext, j5);
                                    throw th;
                                }
                                f13 = f12;
                            } catch (Throwable th2) {
                                th = th2;
                                j5 = m3999getSizeNHjbRc;
                            }
                            ((Extras.Key) drawContext.path).m1435clipRectN_I0leg(f21, f21, intBitsToFloat, intBitsToFloat2, 1);
                        } catch (Throwable th3) {
                            th = th3;
                            j5 = m3999getSizeNHjbRc;
                        }
                        f12 = null;
                        boolean areEqual22 = Intrinsics.areEqual(lineChartSelectionState2.getSelectionBehavior(), lineChartSelectionState$SelectionBehavior$None);
                        float f202 = f;
                        if (areEqual22) {
                        }
                        float f212 = -max;
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) + max;
                        float intBitsToFloat22 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) + max;
                        drawContext = drawScope.getDrawContext();
                        m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                        drawContext.getCanvas().save();
                    }
                };
                gapComposer = gapComposer2;
                gapComposer.updateRememberedValue(function1);
                rememberedValue5 = function1;
            } else {
                modifier2 = modifier4;
                gapComposer = gapComposer2;
            }
            CanvasKt.Canvas(0, gapComposer, modifier2, (Function1) rememberedValue5);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(f, arrayList, list, f2, f3, f4, f5, modifier, z, lineChartSelectionState, i) { // from class: com.squareup.cash.charting.components.LineChartKt$$ExternalSyntheticLambda3
                public final /* synthetic */ float f$1;
                public final /* synthetic */ LineChartSelectionState f$10;
                public final /* synthetic */ ArrayList f$2;
                public final /* synthetic */ List f$3;
                public final /* synthetic */ float f$4;
                public final /* synthetic */ float f$5;
                public final /* synthetic */ float f$6;
                public final /* synthetic */ float f$7;
                public final /* synthetic */ Modifier f$8;
                public final /* synthetic */ boolean f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    LineChartKt.m3458ChartYq1gxAc(LineChartViewModel.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
    
        if ((r30 & 16) != 0) goto L62;
     */
    /* renamed from: LineChart-g1gPW-k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3459LineChartg1gPWk(final LineChartViewModel lineChartViewModel, final float f, final Modifier modifier, final boolean z, long j, final LineChartSelectionState lineChartSelectionState, Composer composer, final int i, final int i2) {
        long j2;
        GapComposer gapComposer;
        float f2;
        int i3;
        lineChartViewModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(367118899);
        int i4 = (i & 6) == 0 ? (gapComposer2.changedInstance(lineChartViewModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= gapComposer2.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j2 = j;
                if (gapComposer2.changed(j2)) {
                    i3 = 16384;
                    i4 |= i3;
                }
            } else {
                j2 = j;
            }
            i3 = PKIFailureInfo.certRevoked;
            i4 |= i3;
        } else {
            j2 = j;
        }
        if ((196608 & i) == 0) {
            i4 |= gapComposer2.changed(lineChartSelectionState) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer2.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j2 = colors.semantic.background.f1047app;
                    i4 &= -57345;
                }
                int i5 = i4;
                long j3 = j2;
                gapComposer2.endDefaults();
                List list = lineChartViewModel.yAxisConfig.labels;
                List list2 = lineChartViewModel.xAxisConfig.labels;
                List list3 = lineChartViewModel.lines;
                List list4 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf(((LineChartViewModel.AxisLabel) it.next()).value));
                }
                Float m4125minOrNull = CollectionsKt.m4125minOrNull((Iterable) arrayList);
                float floatValue = m4125minOrNull != null ? m4125minOrNull.floatValue() : RecyclerView.DECELERATION_RATE;
                Float m4123maxOrNull = CollectionsKt.m4123maxOrNull((Iterable) arrayList);
                float floatValue2 = m4123maxOrNull != null ? m4123maxOrNull.floatValue() : RecyclerView.DECELERATION_RATE;
                List list5 = list3;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((LineChartViewModel.Line) it2.next()).points, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Float.valueOf(((LineChartViewModel.Line.Point) it3.next()).x));
                }
                Float m4125minOrNull2 = CollectionsKt.m4125minOrNull((Iterable) arrayList3);
                final float min = Math.min(floatValue, m4125minOrNull2 != null ? m4125minOrNull2.floatValue() : 0.0f);
                Float m4123maxOrNull2 = CollectionsKt.m4123maxOrNull((Iterable) arrayList3);
                final float max = Math.max(floatValue2, m4123maxOrNull2 != null ? m4123maxOrNull2.floatValue() : 0.0f);
                final ArrayList arrayList4 = new ArrayList();
                for (Object obj : list2) {
                    float f3 = ((LineChartViewModel.AxisLabel) obj).value;
                    if (f3 >= min && f3 <= max) {
                        arrayList4.add(obj);
                    }
                }
                List list6 = list;
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(Float.valueOf(((LineChartViewModel.AxisLabel) it4.next()).value));
                }
                Float m4125minOrNull3 = CollectionsKt.m4125minOrNull((Iterable) arrayList5);
                float floatValue3 = m4125minOrNull3 != null ? m4125minOrNull3.floatValue() : 0.0f;
                Float m4123maxOrNull3 = CollectionsKt.m4123maxOrNull((Iterable) arrayList5);
                float floatValue4 = m4123maxOrNull3 != null ? m4123maxOrNull3.floatValue() : 0.0f;
                ArrayList arrayList6 = new ArrayList();
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((LineChartViewModel.Line) it5.next()).points, arrayList6);
                }
                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    arrayList7.add(Float.valueOf(((LineChartViewModel.Line.Point) it6.next()).y));
                }
                Float m4125minOrNull4 = CollectionsKt.m4125minOrNull((Iterable) arrayList7);
                float min2 = Math.min(floatValue3, m4125minOrNull4 != null ? m4125minOrNull4.floatValue() : 0.0f);
                Float m4123maxOrNull4 = CollectionsKt.m4123maxOrNull((Iterable) arrayList7);
                final float max2 = Math.max(floatValue4, m4123maxOrNull4 != null ? m4123maxOrNull4.floatValue() : 0.0f);
                final ArrayList arrayList8 = new ArrayList();
                for (Object obj2 : list) {
                    float f4 = ((LineChartViewModel.AxisLabel) obj2).value;
                    if (f4 >= min2 && f4 <= max2) {
                        arrayList8.add(obj2);
                    }
                }
                Iterator it7 = list5.iterator();
                if (!it7.hasNext()) {
                    a$$ExternalSyntheticBUOutline0.m();
                    return;
                }
                Dp dp = new Dp(((LineChartViewModel.Line) it7.next()).strokeWidth);
                while (it7.hasNext()) {
                    float f5 = min2;
                    Dp dp2 = new Dp(((LineChartViewModel.Line) it7.next()).strokeWidth);
                    if (dp.compareTo(dp2) < 0) {
                        dp = dp2;
                    }
                    min2 = f5;
                }
                final float f6 = min2;
                float f7 = dp.value / 2.0f;
                Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                boolean changed = gapComposer2.changed(lineChartViewModel);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    float mo236toPx0680j_4 = density.mo236toPx0680j_4(f - (f7 * 2.0f));
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList8, 10));
                    Iterator it8 = arrayList8.iterator();
                    while (it8.hasNext()) {
                        float f8 = f7;
                        LineChartViewModel.AxisLabel axisLabel = (LineChartViewModel.AxisLabel) it8.next();
                        float f9 = max2 - f6;
                        float f10 = f9 == RecyclerView.DECELERATION_RATE ? 0.0f : mo236toPx0680j_4 - (((axisLabel.value - f6) / f9) * mo236toPx0680j_4);
                        float f11 = mo236toPx0680j_4;
                        arrayList9.add(new AxisPlacement(axisLabel.label, f10));
                        f7 = f8;
                        mo236toPx0680j_4 = f11;
                    }
                    f2 = f7;
                    gapComposer2.updateRememberedValue(arrayList9);
                    rememberedValue = arrayList9;
                } else {
                    f2 = f7;
                }
                final List list7 = (List) rememberedValue;
                final float f12 = f2;
                gapComposer = gapComposer2;
                BarChartKt.m3447ChartWithYAxisLyZNIlQ(modifier, f, list7, j3, Expect_jvmKt.rememberComposableLambda(904963394, new Function3() { // from class: com.squareup.cash.charting.components.LineChartKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        float f13;
                        RowScope rowScope = (RowScope) obj3;
                        Composer composer2 = (Composer) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        rowScope.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((GapComposer) composer2).changed(rowScope) ? 4 : 2;
                        }
                        GapComposer gapComposer3 = (GapComposer) composer2;
                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            Modifier weight = rowScope.weight(1.0f, companion, true);
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, weight);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer3.applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), f);
                            LineChartViewModel lineChartViewModel2 = LineChartViewModel.this;
                            float f14 = f12;
                            ArrayList arrayList10 = arrayList8;
                            List list8 = list7;
                            float f15 = min;
                            float f16 = max;
                            LineChartKt.m3458ChartYq1gxAc(lineChartViewModel2, f14, arrayList10, list8, f15, f16, f6, max2, m277height3ABfNKs, z, lineChartSelectionState, gapComposer3, 0);
                            ArrayList arrayList11 = arrayList4;
                            if (arrayList11.isEmpty()) {
                                gapComposer3.startReplaceGroup(1011331094);
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.startReplaceGroup(1010885190);
                                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                                if (arrayList10.isEmpty()) {
                                    gapComposer3.startReplaceGroup(448261048);
                                    gapComposer3.end(false);
                                    f13 = f14;
                                } else {
                                    gapComposer3.startReplaceGroup(448263089);
                                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                    DefaultSizes.spacing.getClass();
                                    gapComposer3.end(false);
                                    f13 = 8.0f;
                                }
                                LineChartKt.XAxisLabels(arrayList11, f15, f16, SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, f14, 10.0f, f13, RecyclerView.DECELERATION_RATE, 8), gapComposer3, 0);
                                gapComposer3.end(false);
                            }
                            gapComposer3.end(true);
                        } else {
                            gapComposer3.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2), gapComposer, ((i5 >> 6) & 14) | 24576 | (i5 & 112) | ((i5 >> 3) & 7168), 0);
                j2 = j3;
            } else {
                gapComposer2.skipToGroupEnd();
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final long j4 = j2;
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.charting.components.LineChartKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    LineChartKt.m3459LineChartg1gPWk(LineChartViewModel.this, f, modifier, z, j4, lineChartSelectionState, (Composer) obj3, Updater.updateChangedFlags(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void XAxisLabels(final ArrayList arrayList, final float f, final float f2, final Modifier modifier, Composer composer, final int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1354098803);
        int i2 = i | (gapComposer.changedInstance(arrayList) ? 4 : 2) | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changed(f2) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        boolean z = true;
        boolean z2 = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            boolean changed = ((i2 & 112) == 32) | gapComposer.changed(8.0f) | ((i2 & 896) == 256) | gapComposer.changedInstance(arrayList);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MeasurePolicy() { // from class: com.squareup.cash.charting.components.LineChartKt$XAxisLabels$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
                        measureScope.getClass();
                        list.getClass();
                        float mo236toPx0680j_4 = measureScope.mo236toPx0680j_4(8.0f);
                        float f3 = f2;
                        float f4 = f;
                        float f5 = f3 - f4;
                        ArrayList arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            float f6 = RecyclerView.DECELERATION_RATE;
                            if (!hasNext) {
                                break;
                            }
                            LineChartViewModel.AxisLabel axisLabel = (LineChartViewModel.AxisLabel) it.next();
                            if (f5 != RecyclerView.DECELERATION_RATE) {
                                f6 = Constraints.m1025getMaxWidthimpl(j) * ((axisLabel.value - f4) / f5);
                            }
                            arrayList3.add(Float.valueOf(f6));
                        }
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        int i3 = 0;
                        while (true) {
                            Integer num = null;
                            if (!it2.hasNext()) {
                                List list2 = list;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                int i4 = 0;
                                for (Object obj : list2) {
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw null;
                                    }
                                    Measurable measurable = (Measurable) obj;
                                    int intValue = ((Number) arrayList4.get(i4)).intValue();
                                    int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
                                    arrayList5.add(measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, intValue > m1025getMaxWidthimpl ? m1025getMaxWidthimpl : intValue, 0, 0, 12)));
                                    i4 = i5;
                                }
                                int m1025getMaxWidthimpl2 = Constraints.m1025getMaxWidthimpl(j);
                                Iterator it3 = arrayList5.iterator();
                                if (it3.hasNext()) {
                                    Integer valueOf = Integer.valueOf(((Placeable) it3.next()).height);
                                    loop3: while (true) {
                                        num = valueOf;
                                        while (it3.hasNext()) {
                                            valueOf = Integer.valueOf(((Placeable) it3.next()).height);
                                            if (num.compareTo(valueOf) < 0) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                return MeasureScope.layout$default(measureScope, m1025getMaxWidthimpl2, num != null ? num.intValue() : 0, new CaptureCheckFaceKt$$ExternalSyntheticLambda7(arrayList5, arrayList3, j, 2));
                            }
                            Object next = it2.next();
                            int i6 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            float floatValue = ((Number) next).floatValue();
                            float floatValue2 = ((((i3 < arrayList3.size() + (-1) ? ((Number) arrayList3.get(i6)).floatValue() : Constraints.m1025getMaxWidthimpl(j)) - floatValue) / 2.0f) + ((floatValue - (i3 > 0 ? ((Number) arrayList3.get(i3 - 1)).floatValue() : 0.0f)) / 2.0f)) - mo236toPx0680j_4;
                            if (floatValue2 < RecyclerView.DECELERATION_RATE) {
                                floatValue2 = 0.0f;
                            }
                            arrayList4.add(Integer.valueOf((int) floatValue2));
                            i3 = i6;
                        }
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
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
            gapComposer.startReplaceGroup(-766541047);
            for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                String str = ((LineChartViewModel.AxisLabel) it.next()).label;
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelXSmall;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z2);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z2);
                }
                Room.m1165Text25TpFw(2, 1, 0, 3, 1769472, 0, 3730, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                z2 = z2;
                z = true;
            }
            gapComposer.end(z2);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(arrayList, f, f2, modifier, i) { // from class: com.squareup.cash.charting.components.LineChartKt$$ExternalSyntheticLambda4
                public final /* synthetic */ ArrayList f$0;
                public final /* synthetic */ float f$1;
                public final /* synthetic */ float f$2;
                public final /* synthetic */ Modifier f$3;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    LineChartKt.XAxisLabels(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final ArrayList access$findSelectedPoints(float f, List list, LineChartSelectionState$SelectionBehavior$None lineChartSelectionState$SelectionBehavior$None) {
        Object next;
        if (!list.isEmpty() && !Intrinsics.areEqual(lineChartSelectionState$SelectionBehavior$None, LineChartSelectionState$SelectionBehavior$None.INSTANCE)) {
            if (!Intrinsics.areEqual(lineChartSelectionState$SelectionBehavior$None, LineChartSelectionState$SelectionBehavior$None.INSTANCE$1)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            List list2 = list;
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    float abs = Math.abs(((LineChartViewModel.Line.Point) next).x - f);
                    do {
                        Object next2 = it.next();
                        float abs2 = Math.abs(((LineChartViewModel.Line.Point) next2).x - f);
                        if (Float.compare(abs, abs2) > 0) {
                            next = next2;
                            abs = abs2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            LineChartViewModel.Line.Point point = (LineChartViewModel.Line.Point) next;
            if (point != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (((LineChartViewModel.Line.Point) obj).x == point.x) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: drawLines-fnh65Uc, reason: not valid java name */
    public static final void m3460drawLinesfnh65Uc(DrawScope drawScope, List list, float f, float f2, float f3, float f4, boolean z, float f5, Float f6, long j) {
        AndroidPath Path;
        DrawScope drawScope2 = drawScope;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LineChartViewModel.Line line = (LineChartViewModel.Line) it.next();
            List list2 = line.points;
            LineChartViewModel.SelectionConfig selectionConfig = line.selectionConfig;
            List<LineChartViewModel.Line.Point> list3 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (LineChartViewModel.Line.Point point : list3) {
                arrayList.add(new Pair(Float.valueOf(Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32)) * ((point.x - f) / (f2 - f))), Float.valueOf(Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - (Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * ((point.y - f3) / (f4 - f3))))));
            }
            Color composeColor = toComposeColor(line.color, z);
            if (composeColor != null) {
                int ordinal = line.interpolationMethod.ordinal();
                int i = 1;
                if (ordinal == 0) {
                    Path = AndroidPath_androidKt.Path();
                    Path.moveTo(((Number) ((Pair) CollectionsKt.first((List) arrayList)).first).floatValue(), ((Number) ((Pair) CollectionsKt.first((List) arrayList)).second).floatValue());
                    int size = arrayList.size();
                    while (i < size) {
                        Path.lineTo(((Number) ((Pair) arrayList.get(i)).first).floatValue(), ((Number) ((Pair) arrayList.get(i)).second).floatValue());
                        i++;
                    }
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    Path = AndroidPath_androidKt.Path();
                    Path.moveTo(((Number) ((Pair) CollectionsKt.first((List) arrayList)).first).floatValue(), ((Number) ((Pair) CollectionsKt.first((List) arrayList)).second).floatValue());
                    int size2 = arrayList.size();
                    while (i < size2) {
                        Path.lineTo(((Number) ((Pair) arrayList.get(i)).first).floatValue(), ((Number) ((Pair) arrayList.get(i - 1)).second).floatValue());
                        Path.lineTo(((Number) ((Pair) arrayList.get(i)).first).floatValue(), ((Number) ((Pair) arrayList.get(i)).second).floatValue());
                        i++;
                    }
                }
                AndroidPathMeasure PathMeasure = OffersAnalyticsKt.PathMeasure();
                PathMeasure.setPath(Path);
                AndroidPath Path2 = AndroidPath_androidKt.Path();
                PathMeasure.getSegment(RecyclerView.DECELERATION_RATE, Math.max(RecyclerView.DECELERATION_RATE, PathMeasure.internalPathMeasure.getLength() * f5), Path2);
                if (f5 < 1.0f) {
                    Path = Path2;
                }
                float mo236toPx0680j_4 = drawScope2.mo236toPx0680j_4(line.strokeWidth);
                float f7 = line.strokeCornerRadius;
                Stroke stroke = new Stroke(mo236toPx0680j_4, RecyclerView.DECELERATION_RATE, 1, 1, Dp.m1036compareTo0680j_4(f7, RecyclerView.DECELERATION_RATE) > 0 ? new AndroidPathEffect(new CornerPathEffect(drawScope2.mo236toPx0680j_4(f7))) : null, 2);
                if (f6 == null) {
                    DrawScope.m745drawPathLG529CI$default(drawScope2, Path, composeColor.value, RecyclerView.DECELERATION_RATE, stroke, 52);
                } else {
                    AndroidPath androidPath = Path;
                    selectionConfig.getClass();
                    DrawScope.m745drawPathLG529CI$default(drawScope, androidPath, j, RecyclerView.DECELERATION_RATE, stroke, 52);
                    float coerceIn = RangesKt___RangesKt.coerceIn(f6.floatValue(), RecyclerView.DECELERATION_RATE, Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)));
                    if (coerceIn <= RecyclerView.DECELERATION_RATE) {
                        continue;
                    } else {
                        Color composeColor2 = toComposeColor(selectionConfig.inSelectionColor, z);
                        if (composeColor2 != null) {
                            composeColor = composeColor2;
                        }
                        long j2 = composeColor.value;
                        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                        GrpcMethod drawContext = drawScope.getDrawContext();
                        long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            ((Extras.Key) drawContext.path).m1435clipRectN_I0leg(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, coerceIn, intBitsToFloat, 1);
                            DrawScope.m745drawPathLG529CI$default(drawScope, androidPath, j2, RecyclerView.DECELERATION_RATE, stroke, 52);
                        } finally {
                            Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                        }
                    }
                }
            }
            drawScope2 = drawScope;
        }
    }

    public static final Color toComposeColor(com.squareup.protos.cash.ui.Color color, boolean z) {
        Color.ModeVariant modeVariant = z ? color.light : color.dark;
        Integer safeParseColor = StringsKt.safeParseColor(modeVariant != null ? modeVariant.srgb : null, null);
        if (safeParseColor != null) {
            return new androidx.compose.ui.graphics.Color(ColorKt.Color(safeParseColor.intValue()));
        }
        return null;
    }
}
