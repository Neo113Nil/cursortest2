package defpackage;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a2f extends z1f {
    public final mvc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2f(w1f w1fVar, View view, Window window) {
        super(w1fVar, view, window);
        window.getClass();
        ArrayList arrayList = this.d;
        arrayList.getClass();
        mvc mvcVar = new mvc(arrayList);
        mvcVar.f = 0L;
        mvcVar.g = 0L;
        this.m = mvcVar;
    }

    @Override // defpackage.y1f
    public final long a(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(13);
    }

    @Override // defpackage.y1f
    public final lvc b(long j, long j2, FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        this.h = j + metric;
        xdh xdhVar = this.c.a;
        if (xdhVar != null) {
            xdhVar.j(this.d);
        }
        boolean z = metric > j2;
        long metric2 = frameMetrics.getMetric(8);
        long metric3 = frameMetrics.getMetric(7) + (metric2 - frameMetrics.getMetric(12));
        long metric4 = metric2 - frameMetrics.getMetric(13);
        mvc mvcVar = this.m;
        mvcVar.b = j;
        mvcVar.c = metric;
        mvcVar.d = z;
        mvcVar.e = metric3;
        mvcVar.f = metric2;
        mvcVar.g = metric4;
        return mvcVar;
    }
}
