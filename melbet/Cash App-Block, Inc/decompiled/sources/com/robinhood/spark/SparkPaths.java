package com.robinhood.spark;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.robinhood.spark.SparkPath;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphPathType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public final class SparkPaths {
    public final HashMap paths = new HashMap();

    public SparkPaths(SparkPaths sparkPaths) {
        for (InvestingGraphPathType investingGraphPathType : sparkPaths.paths.keySet()) {
            HashMap hashMap = this.paths;
            SparkPath sparkPath = (SparkPath) sparkPaths.paths.get(investingGraphPathType);
            SparkPath sparkPath2 = new SparkPath(sparkPath.pathType);
            SparkPath.SparkPathSegment sparkPathSegment = null;
            for (SparkPath.SparkPathSegment sparkPathSegment2 : sparkPath.segments) {
                SparkPath.SparkPathSegment sparkPathSegment3 = new SparkPath.SparkPathSegment(sparkPathSegment2);
                sparkPath2.segments.add(sparkPathSegment3);
                if (sparkPathSegment2.equals(sparkPath.currentSegment)) {
                    sparkPathSegment = sparkPathSegment3;
                }
            }
            sparkPath2.currentSegment = sparkPathSegment;
            hashMap.put(investingGraphPathType, sparkPath2);
        }
    }

    public final void endPathSegment(InvestingGraphPathType investingGraphPathType, Float f, int i) {
        SparkPath sparkPath = (SparkPath) this.paths.get(investingGraphPathType);
        if (sparkPath == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Trying to end path segment, but no such path exists");
            return;
        }
        SparkPath.SparkPathSegment sparkPathSegment = sparkPath.currentSegment;
        if (sparkPathSegment == null) {
            a$$ExternalSyntheticBUOutline0.m$1("trying to end segment, but no segment exists");
            return;
        }
        LinkedList linkedList = sparkPathSegment.xPoints;
        if (f != null && !linkedList.isEmpty()) {
            float floatValue = ((Float) linkedList.get(0)).floatValue();
            sparkPathSegment.lineTo(((Float) linkedList.get(linkedList.size() - 1)).floatValue(), f.floatValue());
            sparkPathSegment.lineTo(i + floatValue, f.floatValue());
            sparkPathSegment.close();
        }
        sparkPath.segments.add(sparkPath.currentSegment);
        sparkPath.currentSegment = null;
    }

    public final void reset() {
        HashMap hashMap = this.paths;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            SparkPath sparkPath = (SparkPath) hashMap.get((InvestingGraphPathType) it.next());
            LinkedList linkedList = sparkPath.segments;
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                ((SparkPath.SparkPathSegment) it2.next()).reset();
            }
            linkedList.clear();
            SparkPath.SparkPathSegment sparkPathSegment = sparkPath.currentSegment;
            if (sparkPathSegment != null) {
                sparkPathSegment.reset();
            }
        }
    }

    public final void startPathSegment(InvestingGraphPathType investingGraphPathType, float f, float f2) {
        HashMap hashMap = this.paths;
        SparkPath sparkPath = (SparkPath) hashMap.get(investingGraphPathType);
        if (sparkPath == null) {
            sparkPath = new SparkPath(investingGraphPathType);
            hashMap.put(investingGraphPathType, sparkPath);
        }
        if (sparkPath.currentSegment != null) {
            a$$ExternalSyntheticBUOutline0.m$1("trying to start segment but a segment already exists");
            return;
        }
        SparkPath.SparkPathSegment sparkPathSegment = new SparkPath.SparkPathSegment(sparkPath.pathType, sparkPath.segments.size());
        sparkPath.currentSegment = sparkPathSegment;
        sparkPathSegment.moveTo(f, f2);
    }

    public SparkPaths() {
    }
}
