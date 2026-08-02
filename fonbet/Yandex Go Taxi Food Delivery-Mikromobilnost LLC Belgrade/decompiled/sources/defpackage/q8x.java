package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.cargo_form.send_event.impl.job.a;

/* loaded from: classes5.dex */
public final class q8x {
    public final Map a;

    public q8x(Map map) {
        this.a = map;
    }

    public final Object a(m8x m8xVar, Continuation continuation) {
        Map map = m8xVar.a;
        Object obj = map.get("job_tag");
        if (obj == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No job tag found");
            jgz.a.h("JobExecutorImpl");
            jgz.d(illegalArgumentException, "Nullable job tag provided", new Object[0]);
            return new n8x(illegalArgumentException);
        }
        a aVar = (a) this.a.get(obj);
        if (aVar == null) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(qv10.o("Unknown job tag: ", obj));
            jgz.a.h("JobExecutorImpl");
            jgz.d(illegalArgumentException2, "No job found for tag: " + obj, new Object[0]);
            return new n8x(illegalArgumentException2);
        }
        jgz.a.h("JobExecutorImpl");
        jgz.a("Starting work with tag " + obj + " execution", new Object[0]);
        return aVar.a(map, (ContinuationImpl) continuation);
    }
}
