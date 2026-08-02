package defpackage;

/* loaded from: classes5.dex */
public final class yis extends huo implements Runnable {
    public final long e;

    public yis(long j, cg6 cg6Var) {
        super(cg6Var, cg6Var.getContext());
        this.e = j;
    }

    @Override // defpackage.a6, defpackage.h3f
    public final String W() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.W());
        sb.append("(timeMillis=");
        return eta.g(sb, this.e, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        y2x.v(this.c);
        t(new wis("Timed out waiting for " + this.e + " ms", this));
    }
}
