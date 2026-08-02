package defpackage;

import com.yandex.pulse.processcpu.MeasurementTask;
import com.yandex.pulse.utils.RunnableScheduler;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class sfh {
    public final ArrayList a = new ArrayList();
    public final RunnableScheduler b = new RunnableScheduler(new dyg(3, this));
    public long c;

    public final void a() {
        RunnableScheduler runnableScheduler = this.b;
        if (runnableScheduler.getIsRunning()) {
            runnableScheduler.stop();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                xsm xsmVar = (xsm) it.next();
                switch (xsmVar.a) {
                    case 0:
                        ysm ysmVar = (ysm) xsmVar.b;
                        MeasurementTask measurementTask = ysmVar.k;
                        if (measurementTask != null) {
                            measurementTask.h.set(true);
                            ysmVar.k = null;
                        }
                        ysmVar.o = -1L;
                        e5b e5bVar = e5b.a;
                        e5bVar.getClass();
                        ysmVar.n = e5bVar;
                        break;
                }
            }
        }
    }
}
