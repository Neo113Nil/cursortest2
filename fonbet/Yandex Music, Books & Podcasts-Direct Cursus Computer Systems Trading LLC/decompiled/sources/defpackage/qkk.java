package defpackage;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qkk extends mbo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkk(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        timeUnit.getClass();
        t4w t4wVar = (t4w) this.c;
        long millis = timeUnit.toMillis(j);
        t4wVar.getClass();
        String str = t4w.z;
        if (millis < 900000) {
            jsg.j().o(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j2 = millis < 900000 ? 900000L : millis;
        long j3 = millis < 900000 ? 900000L : millis;
        if (j2 < 900000) {
            jsg.j().o(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        t4wVar.h = j2 >= 900000 ? j2 : 900000L;
        if (j3 < 300000) {
            jsg.j().o(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j3 > t4wVar.h) {
            jsg.j().o(str, "Flex duration greater than interval duration; Changed to " + j2);
        }
        t4wVar.i = yhn.f(j3, 300000L, t4wVar.h);
    }

    @Override // defpackage.mbo
    public final p4w b() {
        if (this.a && ((t4w) this.c).j.d) {
            xq0.x("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        t4w t4wVar = (t4w) this.c;
        if (!t4wVar.q) {
            return new rkk((UUID) this.b, t4wVar, (Set) this.d);
        }
        xq0.x("PeriodicWorkRequests cannot be expedited");
        return null;
    }

    @Override // defpackage.mbo
    public final mbo k() {
        return this;
    }
}
