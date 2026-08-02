package defpackage;

import android.content.Context;
import com.yandex.pulse.MeasurementBroadcasterImpl;
import com.yandex.pulse.ProcessCpuMonitoringParams;
import com.yandex.pulse.processcpu.MeasurementTask;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class ysm {
    public final Context a;
    public final Executor b;
    public final ProcessCpuMonitoringParams c;
    public final sfh d;
    public final MeasurementBroadcasterImpl e;
    public final pgs f;
    public final gmf g;
    public final gao h;
    public final sml i;
    public final xsm j;
    public MeasurementTask k;
    public LinkedHashSet l;
    public Map m;
    public Map n;
    public long o;

    public ysm(Context context, sfh sfhVar, Executor executor, ProcessCpuMonitoringParams processCpuMonitoringParams, MeasurementBroadcasterImpl measurementBroadcasterImpl) {
        context.getClass();
        sfhVar.getClass();
        executor.getClass();
        processCpuMonitoringParams.getClass();
        measurementBroadcasterImpl.getClass();
        this.j = new xsm(0, this);
        this.l = new LinkedHashSet();
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.m = e5bVar;
        this.n = e5bVar;
        this.o = -1L;
        this.a = context;
        this.d = sfhVar;
        long j = pgs.d;
        this.f = new pgs(j, 500000L);
        this.g = new gmf(j, 10000000L);
        this.h = new gao(10);
        this.i = new sml(2);
        this.b = executor;
        this.c = processCpuMonitoringParams;
        this.e = measurementBroadcasterImpl;
        Set<String> keySet = processCpuMonitoringParams.processToHistogramBaseName.keySet();
        LinkedHashSet linkedHashSet = this.l;
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add((String) it.next());
        }
    }
}
