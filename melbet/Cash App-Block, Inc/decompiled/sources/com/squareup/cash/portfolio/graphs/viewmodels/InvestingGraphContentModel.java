package com.squareup.cash.portfolio.graphs.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.LongRange;

/* loaded from: classes6.dex */
public abstract class InvestingGraphContentModel {

    public final class Error extends InvestingGraphContentModel {
        public static final Error INSTANCE = new Error();
        public static final EmptyList points;
        public static final EmptyList smoothedPoints;

        static {
            EmptyList emptyList = EmptyList.INSTANCE;
            points = emptyList;
            smoothedPoints = emptyList;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final TextGeometricTransformKt getAccentColor() {
            return null;
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final float getGraphWidth() {
            return RecyclerView.DECELERATION_RATE;
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final List getPoints() {
            return points;
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final List getSmoothedPoints() {
            return smoothedPoints;
        }

        public final int hashCode() {
            return -610954439;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LineDashEffect {
        public static final /* synthetic */ LineDashEffect[] $VALUES;
        public static final LineDashEffect SOLID;
        public static final LineDashEffect SOLID_GRAY;

        static {
            LineDashEffect lineDashEffect = new LineDashEffect("SOLID", 0);
            SOLID = lineDashEffect;
            LineDashEffect lineDashEffect2 = new LineDashEffect("SOLID_GRAY", 1);
            SOLID_GRAY = lineDashEffect2;
            $VALUES = new LineDashEffect[]{lineDashEffect, lineDashEffect2, new LineDashEffect("DASH", 2), new LineDashEffect("NONE", 3)};
        }

        public static LineDashEffect valueOf(String str) {
            return (LineDashEffect) Enum.valueOf(LineDashEffect.class, str);
        }

        public static LineDashEffect[] values() {
            return (LineDashEffect[]) $VALUES.clone();
        }
    }

    public final class NonComparableStringProvider {
        public final Function0 provider;

        public NonComparableStringProvider(Function0 function0) {
            this.provider = function0;
        }

        public final boolean equals(Object obj) {
            return obj instanceof NonComparableStringProvider;
        }

        public final int hashCode() {
            return 0;
        }
    }

    public final class Point {
        public final LineDashEffect effectFromPreviousPoint;
        public final NonComparableStringProvider scrubTextProvider;
        public final PointTreatment treatment;
        public final float x;
        public final float y;

        public Point(float f, float f2, LineDashEffect lineDashEffect, PointTreatment pointTreatment, NonComparableStringProvider nonComparableStringProvider) {
            this.x = f;
            this.y = f2;
            this.effectFromPreviousPoint = lineDashEffect;
            this.treatment = pointTreatment;
            this.scrubTextProvider = nonComparableStringProvider;
        }

        public static Point copy$default(Point point, float f, float f2, int i) {
            if ((i & 1) != 0) {
                f = point.x;
            }
            float f3 = f;
            if ((i & 2) != 0) {
                f2 = point.y;
            }
            LineDashEffect lineDashEffect = point.effectFromPreviousPoint;
            PointTreatment pointTreatment = point.treatment;
            NonComparableStringProvider nonComparableStringProvider = point.scrubTextProvider;
            point.getClass();
            return new Point(f3, f2, lineDashEffect, pointTreatment, nonComparableStringProvider);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Point)) {
                return false;
            }
            Point point = (Point) obj;
            return Float.compare(this.x, point.x) == 0 && Float.compare(this.y, point.y) == 0 && this.effectFromPreviousPoint == point.effectFromPreviousPoint && this.treatment == point.treatment && this.scrubTextProvider.equals(point.scrubTextProvider);
        }

        public final float getY() {
            return this.y;
        }

        public final int hashCode() {
            return (this.treatment.hashCode() + ((this.effectFromPreviousPoint.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.y, Float.hashCode(this.x) * 31, 31)) * 31)) * 31;
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Point(x=", this.x, ", y=", this.y, ", effectFromPreviousPoint=");
            m.append(this.effectFromPreviousPoint);
            m.append(", treatment=");
            m.append(this.treatment);
            m.append(", scrubTextProvider=");
            m.append(this.scrubTextProvider);
            m.append(")");
            return m.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PointTreatment {
        public static final /* synthetic */ PointTreatment[] $VALUES;
        public static final PointTreatment DOT;
        public static final PointTreatment NONE;

        static {
            PointTreatment pointTreatment = new PointTreatment("DOT", 0);
            DOT = pointTreatment;
            PointTreatment pointTreatment2 = new PointTreatment("NONE", 1);
            NONE = pointTreatment2;
            $VALUES = new PointTreatment[]{pointTreatment, pointTreatment2};
        }

        public static PointTreatment valueOf(String str) {
            return (PointTreatment) Enum.valueOf(PointTreatment.class, str);
        }

        public static PointTreatment[] values() {
            return (PointTreatment[]) $VALUES.clone();
        }
    }

    public abstract TextGeometricTransformKt getAccentColor();

    public abstract float getGraphWidth();

    public LongRange getMinimumHeightRange() {
        return null;
    }

    public abstract List getPoints();

    public abstract List getSmoothedPoints();

    public final class Loading extends InvestingGraphContentModel {
        public final TextGeometricTransformKt accentColor;
        public final float graphWidth;
        public final LongRange minimumHeightRange;
        public final List points;
        public final List smoothedPoints;

        public Loading(List list, List list2, float f, LongRange longRange, TextGeometricTransformKt textGeometricTransformKt) {
            list.getClass();
            list2.getClass();
            this.points = list;
            this.smoothedPoints = list2;
            this.graphWidth = f;
            this.minimumHeightRange = longRange;
            this.accentColor = textGeometricTransformKt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return Intrinsics.areEqual(this.points, loading.points) && Intrinsics.areEqual(this.smoothedPoints, loading.smoothedPoints) && Float.compare(this.graphWidth, loading.graphWidth) == 0 && Intrinsics.areEqual(this.minimumHeightRange, loading.minimumHeightRange) && Intrinsics.areEqual(this.accentColor, loading.accentColor);
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final TextGeometricTransformKt getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final float getGraphWidth() {
            return this.graphWidth;
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final LongRange getMinimumHeightRange() {
            return this.minimumHeightRange;
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final List getPoints() {
            return this.points;
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final List getSmoothedPoints() {
            return this.smoothedPoints;
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.graphWidth, Recorder$$ExternalSyntheticOutline2.m(this.points.hashCode() * 31, 31, this.smoothedPoints), 31);
            LongRange longRange = this.minimumHeightRange;
            int hashCode = (m + (longRange == null ? 0 : longRange.hashCode())) * 31;
            TextGeometricTransformKt textGeometricTransformKt = this.accentColor;
            return hashCode + (textGeometricTransformKt != null ? textGeometricTransformKt.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("Loading(points=", ", smoothedPoints=", ", graphWidth=", this.points, this.smoothedPoints);
            m.append(this.graphWidth);
            m.append(", minimumHeightRange=");
            m.append(this.minimumHeightRange);
            m.append(", accentColor=");
            m.append(this.accentColor);
            m.append(")");
            return m.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Loading(TextGeometricTransformKt textGeometricTransformKt, int i) {
            this(r1, r1, RecyclerView.DECELERATION_RATE, null, (i & 16) != 0 ? null : textGeometricTransformKt);
            EmptyList emptyList = EmptyList.INSTANCE;
        }
    }

    public final class Loaded extends InvestingGraphContentModel {
        public final TextGeometricTransformKt accentColor;
        public final Float baselineY;
        public final Long firstTickY;
        public final Integer forceScrubIndex;
        public final float graphWidth;
        public final Long lastTickY;
        public final LongRange minimumHeightRange;
        public final List points;
        public final List smoothedPoints;

        public Loaded(List list, List list2, float f, TextGeometricTransformKt textGeometricTransformKt, LongRange longRange, Integer num, Float f2, Long l, Long l2) {
            list.getClass();
            list2.getClass();
            textGeometricTransformKt.getClass();
            this.points = list;
            this.smoothedPoints = list2;
            this.graphWidth = f;
            this.accentColor = textGeometricTransformKt;
            this.minimumHeightRange = longRange;
            this.forceScrubIndex = num;
            this.baselineY = f2;
            this.firstTickY = l;
            this.lastTickY = l2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r12v2, types: [androidx.compose.ui.text.style.TextGeometricTransformKt] */
        public static Loaded copy$default(Loaded loaded, ArrayList arrayList, InvestingGraphContentModel$AccentColorType$UptoDateData investingGraphContentModel$AccentColorType$UptoDateData, int i) {
            ArrayList arrayList2 = arrayList;
            if ((i & 1) != 0) {
                arrayList2 = loaded.points;
            }
            ArrayList arrayList3 = arrayList2;
            List list = loaded.smoothedPoints;
            float f = loaded.graphWidth;
            InvestingGraphContentModel$AccentColorType$UptoDateData investingGraphContentModel$AccentColorType$UptoDateData2 = investingGraphContentModel$AccentColorType$UptoDateData;
            if ((i & 8) != 0) {
                investingGraphContentModel$AccentColorType$UptoDateData2 = loaded.accentColor;
            }
            InvestingGraphContentModel$AccentColorType$UptoDateData investingGraphContentModel$AccentColorType$UptoDateData3 = investingGraphContentModel$AccentColorType$UptoDateData2;
            LongRange longRange = loaded.minimumHeightRange;
            Integer num = loaded.forceScrubIndex;
            Float f2 = loaded.baselineY;
            Long l = loaded.firstTickY;
            Long l2 = loaded.lastTickY;
            loaded.getClass();
            arrayList3.getClass();
            list.getClass();
            investingGraphContentModel$AccentColorType$UptoDateData3.getClass();
            return new Loaded(arrayList3, list, f, investingGraphContentModel$AccentColorType$UptoDateData3, longRange, num, f2, l, l2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.points, loaded.points) && Intrinsics.areEqual(this.smoothedPoints, loaded.smoothedPoints) && Float.compare(this.graphWidth, loaded.graphWidth) == 0 && Intrinsics.areEqual(this.accentColor, loaded.accentColor) && Intrinsics.areEqual(this.minimumHeightRange, loaded.minimumHeightRange) && Intrinsics.areEqual(this.forceScrubIndex, loaded.forceScrubIndex) && Intrinsics.areEqual((Object) this.baselineY, (Object) loaded.baselineY) && Intrinsics.areEqual(this.firstTickY, loaded.firstTickY) && Intrinsics.areEqual(this.lastTickY, loaded.lastTickY);
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final TextGeometricTransformKt getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final float getGraphWidth() {
            return this.graphWidth;
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final LongRange getMinimumHeightRange() {
            return this.minimumHeightRange;
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final List getPoints() {
            return this.points;
        }

        @Override // com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel
        public final List getSmoothedPoints() {
            return this.smoothedPoints;
        }

        public final int hashCode() {
            int hashCode = (this.accentColor.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.graphWidth, Recorder$$ExternalSyntheticOutline2.m(this.points.hashCode() * 31, 31, this.smoothedPoints), 31)) * 31;
            LongRange longRange = this.minimumHeightRange;
            int hashCode2 = (hashCode + (longRange == null ? 0 : longRange.hashCode())) * 31;
            Integer num = this.forceScrubIndex;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Float f = this.baselineY;
            int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
            Long l = this.firstTickY;
            int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.lastTickY;
            return hashCode5 + (l2 != null ? l2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("Loaded(points=", ", smoothedPoints=", ", graphWidth=", this.points, this.smoothedPoints);
            m.append(this.graphWidth);
            m.append(", accentColor=");
            m.append(this.accentColor);
            m.append(", minimumHeightRange=");
            m.append(this.minimumHeightRange);
            m.append(", forceScrubIndex=");
            m.append(this.forceScrubIndex);
            m.append(", baselineY=");
            m.append(this.baselineY);
            m.append(", firstTickY=");
            m.append(this.firstTickY);
            m.append(", lastTickY=");
            return Thread$State$EnumUnboxingLocalUtility.m(m, this.lastTickY, ")");
        }

        public final boolean trendDirectionIsPositive() {
            Long l;
            Long l2 = this.firstTickY;
            if (l2 != null && (l = this.lastTickY) != null) {
                return l.longValue() >= l2.longValue();
            }
            List list = this.points;
            Point point = (Point) CollectionsKt.firstOrNull(list);
            Point point2 = (Point) CollectionsKt.lastOrNull(list);
            if (point == null || point2 == null) {
                return true;
            }
            int size = list.size();
            float f = point2.y;
            return size > 1 ? f >= point.y : f >= RecyclerView.DECELERATION_RATE;
        }

        public /* synthetic */ Loaded(List list, List list2, float f, TextGeometricTransformKt textGeometricTransformKt, LongRange longRange, Integer num, Float f2, Long l, Long l2, int i) {
            this(list, list2, f, textGeometricTransformKt, (i & 16) != 0 ? null : longRange, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : f2, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : l2);
        }
    }
}
