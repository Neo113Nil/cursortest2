package com.squareup.cash.common.composeui;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.common.composeui.SegmentedCircleDrawScope;
import com.squareup.cash.common.viewmodels.CircleSegment;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.views.ComposeDecoratedAllocation;
import com.squareup.cash.paychecks.views.ComposeDecoratedAllocationGroup;
import com.squareup.cash.paychecks.views.SingleComposeDecoratedAllocation;
import com.squareup.cash.paychecks.views.SpacedAllocationSegment;
import com.squareup.cash.paychecks.views.SpacedAllocationSegmentsProperties;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class SegmentedCircleKt$SegmentedCircle$$inlined$SegmentedCircle$1 implements Function1 {
    public final /* synthetic */ SegmentedCircleConfig $config;
    public final /* synthetic */ float $handleInnerCircleRadius;
    public final /* synthetic */ float $handleOuterCircleRadius;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SegmentedCircleInteractableState $segmentedCircleInteractableState;
    public final /* synthetic */ ArrayList $segments$inlined;

    public /* synthetic */ SegmentedCircleKt$SegmentedCircle$$inlined$SegmentedCircle$1(SegmentedCircleConfig segmentedCircleConfig, SegmentedCircleInteractableState segmentedCircleInteractableState, float f, float f2, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.$config = segmentedCircleConfig;
        this.$segmentedCircleInteractableState = segmentedCircleInteractableState;
        this.$handleOuterCircleRadius = f;
        this.$handleInnerCircleRadius = f2;
        this.$segments$inlined = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        SegmentedCircleDrawScope segmentedCircleDrawScope;
        Iterator it;
        boolean z;
        SegmentedCircleDrawScope segmentedCircleDrawScope2;
        int i = this.$r8$classId;
        ArrayList arrayList = this.$segments$inlined;
        switch (i) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                SegmentedCircleConfig segmentedCircleConfig = this.$config;
                float strokeWidth = VisibleKt.strokeWidth(segmentedCircleConfig.strokeThickness, Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)));
                float strokeWidth2 = VisibleKt.strokeWidth(segmentedCircleConfig.backgroundStrokeThickness, Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)));
                long floatToRawIntBits = (Float.floatToRawIntBits(r10) << 32) | (Float.floatToRawIntBits(r10) & BodyPartID.bodyIdMax);
                float f = strokeWidth * 1.33f * 2.0f;
                long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f) & BodyPartID.bodyIdMax);
                long floatToRawIntBits3 = (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(r3) & BodyPartID.bodyIdMax);
                float f2 = (strokeWidth / 2.0f) * 2.0f;
                long floatToRawIntBits4 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f2) & BodyPartID.bodyIdMax);
                DrawScope.m743drawOvalnJ9OG0$default(drawScope, segmentedCircleConfig.backgroundColor, floatToRawIntBits, floatToRawIntBits2, Fill.INSTANCE, 104);
                DrawScope.m743drawOvalnJ9OG0$default(drawScope, segmentedCircleConfig.segmentsBackgroundColor, floatToRawIntBits3, floatToRawIntBits4, new Stroke(strokeWidth2, RecyclerView.DECELERATION_RATE, 0, 0, null, 30), 104);
                SegmentedCircleDrawScope segmentedCircleDrawScope3 = new SegmentedCircleDrawScope(drawScope, strokeWidth, floatToRawIntBits3, floatToRawIntBits4, segmentedCircleConfig, this.$segmentedCircleInteractableState, this.$handleOuterCircleRadius, this.$handleInnerCircleRadius);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((CircleSegment) obj3).percent != RecyclerView.DECELERATION_RATE) {
                        arrayList2.add(obj3);
                    }
                }
                CircleSegment circleSegment = (CircleSegment) CollectionsKt.singleOrNull((List) arrayList2);
                float gapBetweenSegments = (circleSegment != null ? circleSegment.percent : Float.MIN_VALUE) >= 1.0f ? RecyclerView.DECELERATION_RATE : segmentedCircleDrawScope3.getGapBetweenSegments();
                Iterator it2 = arrayList2.iterator();
                double d = 0.0d;
                while (it2.hasNext()) {
                    d += Math.min((((CircleSegment) it2.next()).percent * 360.0f) - gapBetweenSegments, 0.0d);
                }
                float f3 = 1.0f - ((-((float) d)) / 360.0f);
                Iterator it3 = arrayList2.iterator();
                float f4 = RecyclerView.DECELERATION_RATE;
                while (it3.hasNext()) {
                    CircleSegment circleSegment2 = (CircleSegment) it3.next();
                    float f5 = circleSegment2.percent * 360.0f * f3;
                    segmentedCircleDrawScope3.m3479drawSegmentArcAgEwaKs(((gapBetweenSegments / 2.0f) + f4) - 90.0f, Math.max(f5 - gapBetweenSegments, RecyclerView.DECELERATION_RATE), 1, circleSegment2.color);
                    f4 += f5;
                }
                segmentedCircleConfig.debugSettings.getClass();
                return Unit.INSTANCE;
            default:
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                SegmentedCircleConfig segmentedCircleConfig2 = this.$config;
                float strokeWidth3 = VisibleKt.strokeWidth(segmentedCircleConfig2.strokeThickness, Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32)));
                float strokeWidth4 = VisibleKt.strokeWidth(segmentedCircleConfig2.backgroundStrokeThickness, Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32)));
                long floatToRawIntBits5 = (Float.floatToRawIntBits(r10) << 32) | (Float.floatToRawIntBits(r10) & BodyPartID.bodyIdMax);
                float f6 = strokeWidth3 * 1.33f * 2.0f;
                long floatToRawIntBits6 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32)) - f6) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f6) & BodyPartID.bodyIdMax);
                long floatToRawIntBits7 = (Float.floatToRawIntBits(r8) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(r8) << 32);
                float f7 = (strokeWidth3 / 2.0f) * 2.0f;
                long floatToRawIntBits8 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32)) - f7) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f7) & BodyPartID.bodyIdMax);
                DrawScope.m743drawOvalnJ9OG0$default(drawScope2, segmentedCircleConfig2.backgroundColor, floatToRawIntBits5, floatToRawIntBits6, Fill.INSTANCE, 104);
                DrawScope.m743drawOvalnJ9OG0$default(drawScope2, segmentedCircleConfig2.segmentsBackgroundColor, floatToRawIntBits7, floatToRawIntBits8, new Stroke(strokeWidth4, RecyclerView.DECELERATION_RATE, 0, 0, null, 30), 104);
                float f8 = this.$handleInnerCircleRadius;
                SegmentedCircleInteractableState segmentedCircleInteractableState = this.$segmentedCircleInteractableState;
                float f9 = this.$handleOuterCircleRadius;
                SegmentedCircleDrawScope segmentedCircleDrawScope4 = new SegmentedCircleDrawScope(drawScope2, strokeWidth3, floatToRawIntBits7, floatToRawIntBits8, segmentedCircleConfig2, segmentedCircleInteractableState, f9, f8);
                boolean z2 = true;
                float gapBetweenSegments2 = arrayList.size() == 1 ? RecyclerView.DECELERATION_RATE : segmentedCircleDrawScope4.getGapBetweenSegments();
                float m641getMaxDimensionimpl = (((f9 * 2.0f) / (Size.m641getMaxDimensionimpl(drawScope2.mo753getSizeNHjbRc()) / 2.0f)) * 57.295776f) + gapBetweenSegments2;
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj2 = it4.next();
                        if (((ComposeDecoratedAllocation) obj2).getTreatment() instanceof DistributionWheelViewModel.Allocation.Treatment.InteractableSelected) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ComposeDecoratedAllocation composeDecoratedAllocation = (ComposeDecoratedAllocation) obj2;
                boolean z3 = (composeDecoratedAllocation != null ? (composeDecoratedAllocation.getPercentage() * 360.0f) * 1.0f : RecyclerView.DECELERATION_RATE) < m641getMaxDimensionimpl;
                Iterator it5 = arrayList.iterator();
                double d2 = 0.0d;
                while (it5.hasNext()) {
                    d2 += ((ComposeDecoratedAllocation) it5.next()).getTreatment() instanceof DistributionWheelViewModel.Allocation.Treatment.InteractableSelected ? Math.min(((r7.getPercentage() * 360.0f) * 1.0f) - m641getMaxDimensionimpl, RecyclerView.DECELERATION_RATE) : Math.min(((r7.getPercentage() * 360.0f) * 1.0f) - gapBetweenSegments2, RecyclerView.DECELERATION_RATE);
                }
                SpacedAllocationSegmentsProperties spacedAllocationSegmentsProperties = new SpacedAllocationSegmentsProperties(composeDecoratedAllocation, gapBetweenSegments2, m641getMaxDimensionimpl, z3, 1.0f - (((-1.0f) * ((float) d2)) / 360.0f));
                int i2 = 10;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(new SpacedAllocationSegment((ComposeDecoratedAllocation) it6.next(), spacedAllocationSegmentsProperties));
                }
                Iterator it7 = arrayList3.iterator();
                float f10 = RecyclerView.DECELERATION_RATE;
                int i3 = 0;
                while (it7.hasNext()) {
                    Object next = it7.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    SpacedAllocationSegment spacedAllocationSegment = (SpacedAllocationSegment) next;
                    float f11 = spacedAllocationSegment.gap;
                    boolean z4 = spacedAllocationSegment.selected;
                    float f12 = (f11 / 2.0f) + f10;
                    ComposeDecoratedAllocation composeDecoratedAllocation2 = spacedAllocationSegment.allocation;
                    boolean z5 = composeDecoratedAllocation2 instanceof ComposeDecoratedAllocationGroup;
                    DrawScope drawScope3 = segmentedCircleDrawScope4.$$delegate_0;
                    if (z5) {
                        ComposeDecoratedAllocationGroup composeDecoratedAllocationGroup = (ComposeDecoratedAllocationGroup) composeDecoratedAllocation2;
                        ArrayList arrayList4 = composeDecoratedAllocationGroup.allocations;
                        float f13 = composeDecoratedAllocationGroup.percentage;
                        z = z2;
                        float f14 = spacedAllocationSegment.sweepAngle;
                        int size = arrayList4.size() - 1;
                        float f15 = spacedAllocationSegment.segmentProperties.gapBetweenSegments / 6.0f;
                        float f16 = f14 - (size * f15);
                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, i2));
                        int i5 = 0;
                        for (Object obj4 : arrayList4) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            SingleComposeDecoratedAllocation singleComposeDecoratedAllocation = (SingleComposeDecoratedAllocation) obj4;
                            float f17 = RecyclerView.DECELERATION_RATE;
                            if (f13 == RecyclerView.DECELERATION_RATE) {
                                segmentedCircleDrawScope2 = segmentedCircleDrawScope4;
                            } else {
                                segmentedCircleDrawScope2 = segmentedCircleDrawScope4;
                                f17 = Math.max(RecyclerView.DECELERATION_RATE, (singleComposeDecoratedAllocation.percentage * f16) / f13);
                            }
                            int i7 = i5;
                            Iterator it8 = it7;
                            float f18 = f16;
                            SegmentedCircleDrawScope.SegmentDrawingSpec segmentDrawingSpec = new SegmentedCircleDrawScope.SegmentDrawingSpec(f12, f17, singleComposeDecoratedAllocation.color);
                            f12 += f17 + (i7 == arrayList4.size() + (-1) ? RecyclerView.DECELERATION_RATE : f15);
                            arrayList5.add(segmentDrawingSpec);
                            i5 = i6;
                            it7 = it8;
                            f16 = f18;
                            segmentedCircleDrawScope4 = segmentedCircleDrawScope2;
                        }
                        segmentedCircleDrawScope = segmentedCircleDrawScope4;
                        it = it7;
                        int saveLayer = AndroidCanvas_androidKt.getNativeCanvas(drawScope3.getDrawContext().getCanvas()).saveLayer(null, null);
                        Iterator it9 = arrayList5.iterator();
                        int i8 = 0;
                        while (it9.hasNext()) {
                            Object next2 = it9.next();
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            SegmentedCircleDrawScope.SegmentDrawingSpec segmentDrawingSpec2 = (SegmentedCircleDrawScope.SegmentDrawingSpec) next2;
                            if (z4 && i8 == arrayList5.size() - 1) {
                                segmentedCircleDrawScope.m3480drawSelectedSegmentArcGxzWYVk(segmentDrawingSpec2.startDegrees - 90.0f, segmentDrawingSpec2.angle, segmentDrawingSpec2.color, 0, null);
                            } else {
                                if (i8 == 0) {
                                    segmentedCircleDrawScope.m3479drawSegmentArcAgEwaKs(segmentDrawingSpec2.startDegrees - 90.0f, RecyclerView.DECELERATION_RATE, 1, segmentDrawingSpec2.color);
                                }
                                segmentedCircleDrawScope.m3479drawSegmentArcAgEwaKs(segmentDrawingSpec2.startDegrees - 90.0f, segmentDrawingSpec2.angle, 0, segmentDrawingSpec2.color);
                            }
                            i8 = i9;
                        }
                        AndroidCanvas_androidKt.getNativeCanvas(drawScope3.getDrawContext().getCanvas()).restoreToCount(saveLayer);
                    } else {
                        segmentedCircleDrawScope = segmentedCircleDrawScope4;
                        it = it7;
                        z = z2;
                        if (!(composeDecoratedAllocation2 instanceof SingleComposeDecoratedAllocation)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        float f19 = spacedAllocationSegment.sweepAngle;
                        long j = ((SingleComposeDecoratedAllocation) composeDecoratedAllocation2).color;
                        if (z4) {
                            segmentedCircleDrawScope.m3480drawSelectedSegmentArcGxzWYVk(f12 - 90.0f, f19, j, 1, new DrawingCheckpoint(AndroidCanvas_androidKt.getNativeCanvas(drawScope3.getDrawContext().getCanvas()).saveLayer(null, null)));
                        } else {
                            segmentedCircleDrawScope.m3479drawSegmentArcAgEwaKs(f12 - 90.0f, f19, 1, j);
                        }
                    }
                    f10 += spacedAllocationSegment.angle;
                    z2 = z;
                    i3 = i4;
                    it7 = it;
                    segmentedCircleDrawScope4 = segmentedCircleDrawScope;
                    i2 = 10;
                }
                segmentedCircleConfig2.debugSettings.getClass();
                return Unit.INSTANCE;
        }
    }
}
