package j$.time.temporal;

import java.util.Objects;

/* loaded from: classes2.dex */
public interface TemporalAccessor {
    boolean f(o oVar);

    long g(o oVar);

    default s k(o oVar) {
        if (!(oVar instanceof a)) {
            Objects.requireNonNull(oVar, "field");
            return oVar.E(this);
        }
        if (f(oVar)) {
            return ((a) oVar).b;
        }
        throw new r(j$.time.c.a("Unsupported field: ", oVar));
    }

    default int e(o oVar) {
        s k = k(oVar);
        if (!k.d()) {
            throw new r("Invalid field " + oVar + " for get() method, use getLong() instead");
        }
        long g = g(oVar);
        if (k.e(g)) {
            return (int) g;
        }
        throw new j$.time.b("Invalid value for " + oVar + " (valid values " + k + "): " + g);
    }

    default Object b(j$.time.f fVar) {
        if (fVar == p.a || fVar == p.b || fVar == p.c) {
            return null;
        }
        return fVar.j(this);
    }
}
