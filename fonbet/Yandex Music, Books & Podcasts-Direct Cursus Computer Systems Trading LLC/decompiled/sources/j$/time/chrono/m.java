package j$.time.chrono;

import com.connectsdk.device.ConnectableDevice;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public interface m extends Comparable {
    j$.time.temporal.s C(j$.time.temporal.a aVar);

    List D();

    n F(int i);

    int G(n nVar, int i);

    b K(TemporalAccessor temporalAccessor);

    b P();

    b U(int i, int i2, int i3);

    b W(Map map, j$.time.format.d0 d0Var);

    j X(Instant instant, ZoneId zoneId);

    boolean b0(long j);

    boolean equals(Object obj);

    int hashCode();

    b r(long j);

    String s();

    String toString();

    String w();

    b y(int i, int i2);

    static m t(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        m mVar = (m) temporalAccessor.b(j$.time.temporal.p.b);
        t tVar = t.c;
        if (mVar != null) {
            return mVar;
        }
        Objects.requireNonNull(tVar, "defaultObj");
        return tVar;
    }

    static m of(String str) {
        ConcurrentHashMap concurrentHashMap = a.a;
        Objects.requireNonNull(str, ConnectableDevice.KEY_ID);
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = a.a;
            m mVar = (m) concurrentHashMap2.get(str);
            if (mVar == null) {
                mVar = (m) a.b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(m.class).iterator();
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    if (str.equals(mVar2.s()) || str.equals(mVar2.w())) {
                        return mVar2;
                    }
                }
                j$.time.i.a("Unknown chronology: ".concat(str));
                return null;
            }
            p pVar = p.l;
            pVar.getClass();
            a.E(pVar, "Hijrah-umalqura");
            w wVar = w.c;
            wVar.getClass();
            a.E(wVar, "Japanese");
            b0 b0Var = b0.c;
            b0Var.getClass();
            a.E(b0Var, "Minguo");
            h0 h0Var = h0.c;
            h0Var.getClass();
            a.E(h0Var, "ThaiBuddhist");
            try {
                for (a aVar : Arrays.asList(new a[0])) {
                    if (!aVar.s().equals("ISO")) {
                        a.E(aVar, aVar.s());
                    }
                }
                t tVar = t.c;
                tVar.getClass();
                a.E(tVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    default e Q(TemporalAccessor temporalAccessor) {
        try {
            return K(temporalAccessor).O(j$.time.l.J(temporalAccessor));
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.j] */
    default j x(TemporalAccessor temporalAccessor) {
        try {
            ZoneId u = ZoneId.u(temporalAccessor);
            try {
                temporalAccessor = X(Instant.E(temporalAccessor), u);
                return temporalAccessor;
            } catch (j$.time.b unused) {
                return l.E(u, null, g.u(this, Q(temporalAccessor)));
            }
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }
}
