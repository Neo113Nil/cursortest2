package defpackage;

/* loaded from: classes10.dex */
public final class qxa0 extends aa51 {
    @Override // defpackage.aa51
    public final ba51 b() {
        if (this.a && this.c.j.d) {
            ny61.g("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        fa51 fa51Var = this.c;
        if (!fa51Var.q) {
            return new rxa0(this.b, fa51Var, this.d);
        }
        ny61.g("PeriodicWorkRequests cannot be expedited");
        return null;
    }

    @Override // defpackage.aa51
    public final aa51 c() {
        return this;
    }
}
