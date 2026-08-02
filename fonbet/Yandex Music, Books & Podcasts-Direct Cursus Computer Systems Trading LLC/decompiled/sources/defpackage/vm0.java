package defpackage;

/* loaded from: classes.dex */
public final class vm0 implements sdr {
    public final oct a;
    public final x6k b;
    public cn0 c;
    public long d;
    public long e;
    public boolean f;

    public vm0(oct octVar, Object obj, cn0 cn0Var, long j, long j2, boolean z) {
        cn0 cn0Var2;
        this.a = octVar;
        this.b = szf.g0(obj);
        if (cn0Var != null) {
            cn0Var2 = qwp.H(cn0Var);
        } else {
            cn0Var2 = (cn0) octVar.a.invoke(obj);
            cn0Var2.d();
        }
        this.c = cn0Var2;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final Object a() {
        return this.a.b.invoke(this.c);
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        return this.b.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(this.b.getValue());
        sb.append(", velocity=");
        sb.append(a());
        sb.append(", isRunning=");
        sb.append(this.f);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.d);
        sb.append(", finishedTimeNanos=");
        return eta.g(sb, this.e, ')');
    }

    public /* synthetic */ vm0(oct octVar, Object obj, cn0 cn0Var, int i) {
        this(octVar, obj, (i & 4) != 0 ? null : cn0Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
