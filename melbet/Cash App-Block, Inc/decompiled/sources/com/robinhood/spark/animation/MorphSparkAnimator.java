package com.robinhood.spark.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.util.Pair;
import androidx.compose.material.pullrefresh.ArrowValues;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.robinhood.spark.SparkEventPath;
import com.robinhood.spark.SparkEventPaths;
import com.robinhood.spark.SparkPath;
import com.robinhood.spark.SparkPaths;
import com.robinhood.spark.SparkView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class MorphSparkAnimator extends Animator implements SparkAnimator {
    public HashMap oldPointsBySegment = new HashMap();
    public HashMap oldYPointsByEvent = new HashMap();
    public final boolean animate = true;
    public final ValueAnimator animator = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);

    /* loaded from: classes5.dex */
    public final class PathAnimator implements ValueAnimator.AnimatorUpdateListener {
        public final HashMap eventMappings;
        public final HashMap mapOfNewPointsToOld;
        public final HashMap pointsBySegment;
        public final SparkPaths sparkPaths;
        public final SparkView sparkView;

        public PathAnimator(SparkView sparkView, SparkPaths sparkPaths, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
            this.sparkView = sparkView;
            this.sparkPaths = sparkPaths;
            this.pointsBySegment = hashMap;
            this.eventMappings = hashMap2;
            this.mapOfNewPointsToOld = hashMap3;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (Map.Entry entry : this.pointsBySegment.entrySet()) {
                SparkPath.SparkPathSegment sparkPathSegment = (SparkPath.SparkPathSegment) entry.getKey();
                List list = (List) entry.getValue();
                sparkPathSegment.reset();
                for (int i = 0; i < list.size(); i++) {
                    Pair pair = new Pair(sparkPathSegment, Integer.valueOf(i));
                    PointMapping pointMapping = (PointMapping) this.mapOfNewPointsToOld.get(pair);
                    if (pointMapping == null) {
                        OptionalProvider$$ExternalSyntheticLambda0.m$1(pair, "No mapping from new point to old: ");
                        return;
                    }
                    PointF pointF = pointMapping.other;
                    ArrowValues arrowValues = pointMapping.deltaToOther;
                    float f = arrowValues.endAngle;
                    float f2 = arrowValues.scale;
                    float f3 = (f * floatValue) + pointF.x;
                    float f4 = (f2 * floatValue) + pointF.y;
                    if (i == 0) {
                        sparkPathSegment.moveTo(f3, f4);
                    } else {
                        sparkPathSegment.lineTo(f3, f4);
                    }
                }
            }
            SparkEventPaths sparkEventPaths = new SparkEventPaths();
            for (Map.Entry entry2 : this.eventMappings.entrySet()) {
                SparkEventPath sparkEventPath = (SparkEventPath) entry2.getKey();
                PointMapping pointMapping2 = (PointMapping) entry2.getValue();
                ArrowValues arrowValues2 = pointMapping2.deltaToOther;
                float f5 = arrowValues2.endAngle * floatValue;
                PointF pointF2 = pointMapping2.other;
                sparkEventPaths.paths.add(new SparkEventPath(sparkEventPath.index, f5 + pointF2.x, (arrowValues2.scale * floatValue) + pointF2.y, sparkEventPath.radius, sparkEventPath.pathType));
            }
            this.sparkView.setAnimationPath(this.sparkPaths, sparkEventPaths);
        }
    }

    /* loaded from: classes5.dex */
    public final class PointMapping {
        public final ArrowValues deltaToOther;
        public final PointF other;

        public PointMapping(PointF pointF, ArrowValues arrowValues) {
            this.other = pointF;
            this.deltaToOther = arrowValues;
        }
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        return this.animator.getDuration();
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return this.animator.getStartDelay();
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        return this.animator.isRunning();
    }

    @Override // android.animation.Animator
    public final Animator setDuration(long j) {
        return this.animator.setDuration(j);
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.animator.setInterpolator(timeInterpolator);
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j) {
        this.animator.setStartDelay(j);
    }
}
