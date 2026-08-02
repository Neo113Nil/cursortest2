package com.robinhood.spark;

import android.graphics.Path;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphPathType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public final class SparkPath {
    public final InvestingGraphPathType pathType;
    public final LinkedList segments = new LinkedList();
    public SparkPathSegment currentSegment = null;

    public SparkPath(InvestingGraphPathType investingGraphPathType) {
        this.pathType = investingGraphPathType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SparkPath.class != obj.getClass()) {
            return false;
        }
        return this.pathType.equals(((SparkPath) obj).pathType);
    }

    public final int hashCode() {
        return this.pathType.hashCode();
    }

    public final class SparkPathSegment extends Path {
        public final int indexInSparkPath;
        public final InvestingGraphPathType pathType;
        public final LinkedList xPoints;
        public final LinkedList yPoints;

        public SparkPathSegment(SparkPathSegment sparkPathSegment) {
            super(sparkPathSegment);
            LinkedList linkedList = new LinkedList();
            this.xPoints = linkedList;
            LinkedList linkedList2 = new LinkedList();
            this.yPoints = linkedList2;
            this.pathType = sparkPathSegment.pathType;
            this.indexInSparkPath = sparkPathSegment.indexInSparkPath;
            linkedList.addAll(sparkPathSegment.xPoints);
            linkedList2.addAll(sparkPathSegment.yPoints);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SparkPathSegment.class != obj.getClass()) {
                return false;
            }
            SparkPathSegment sparkPathSegment = (SparkPathSegment) obj;
            if (this.indexInSparkPath != sparkPathSegment.indexInSparkPath) {
                return false;
            }
            return this.pathType.equals(sparkPathSegment.pathType);
        }

        public final int hashCode() {
            return (this.pathType.hashCode() * 31) + this.indexInSparkPath;
        }

        @Override // android.graphics.Path
        public final void lineTo(float f, float f2) {
            super.lineTo(f, f2);
            this.xPoints.add(Float.valueOf(f));
            this.yPoints.add(Float.valueOf(f2));
        }

        @Override // android.graphics.Path
        public final void moveTo(float f, float f2) {
            super.moveTo(f, f2);
            this.xPoints.add(Float.valueOf(f));
            this.yPoints.add(Float.valueOf(f2));
        }

        @Override // android.graphics.Path
        public final void reset() {
            super.reset();
            this.xPoints.clear();
            this.yPoints.clear();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SparkPathSegment{xPoints=");
            sb.append(this.xPoints.size());
            sb.append(", yPoints=");
            sb.append(this.yPoints.size());
            sb.append(", pathType=");
            sb.append(this.pathType.getClass().getSimpleName());
            sb.append(", indexInSparkPath=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.indexInSparkPath, '}');
        }

        public SparkPathSegment(InvestingGraphPathType investingGraphPathType, int i) {
            this.xPoints = new LinkedList();
            this.yPoints = new LinkedList();
            this.pathType = investingGraphPathType;
            this.indexInSparkPath = i;
        }
    }
}
