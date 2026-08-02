package defpackage;

/* loaded from: classes5.dex */
public abstract class q1f {
    public final r1f a;

    public q1f(r1f r1fVar) {
        this.a = r1fVar;
    }

    public final z9h a() {
        if (this.a == r1f.f) {
            return (z9h) this;
        }
        return null;
    }

    public final z9h b() {
        z9h a = a();
        r1f r1fVar = r1f.f;
        String U = bkp.U(this.a);
        String U2 = bkp.U(r1fVar);
        mac macVar = new mac(su4.o(f1d.m("Failed to cast JSONItem of kind \"", U, "\" to kind \"", U2, "\", json: \""), bkp.S(this), "\""), (Throwable) null);
        if (a != null) {
            return a;
        }
        throw macVar;
    }

    public final jkr c() {
        r1f r1fVar = r1f.c;
        r1f r1fVar2 = this.a;
        jkr jkrVar = r1fVar2 == r1fVar ? (jkr) this : null;
        mac macVar = new mac(su4.o(f1d.m("Failed to cast JSONItem of kind \"", bkp.U(r1fVar2), "\" to kind \"", bkp.U(r1fVar), "\", json: \""), bkp.S(this), "\""), (Throwable) null);
        if (jkrVar != null) {
            return jkrVar;
        }
        throw macVar;
    }
}
