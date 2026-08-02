package com.robinhood.spark;

import android.graphics.Path;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphPathType;

/* loaded from: classes4.dex */
public final class SparkEventPath {
    public final int index;
    public final Path path;
    public final InvestingGraphPathType pathType;
    public final float radius;
    public final float x;
    public final float y;

    public SparkEventPath(SparkEventPath sparkEventPath) {
        this.index = sparkEventPath.index;
        this.x = sparkEventPath.x;
        this.y = sparkEventPath.y;
        this.radius = sparkEventPath.radius;
        this.path = new Path(sparkEventPath.path);
        this.pathType = sparkEventPath.pathType;
    }

    public SparkEventPath(int i, float f, float f2, float f3, InvestingGraphPathType investingGraphPathType) {
        this.index = i;
        this.x = f;
        this.y = f2;
        this.radius = f3;
        this.pathType = investingGraphPathType;
        Path path = new Path();
        this.path = path;
        path.moveTo(f, f2);
        path.addCircle(f, f2, f3, Path.Direction.CW);
        path.close();
    }
}
