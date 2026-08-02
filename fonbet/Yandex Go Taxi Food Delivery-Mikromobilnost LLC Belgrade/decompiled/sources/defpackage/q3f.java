package defpackage;

/* loaded from: classes13.dex */
public final class q3f implements av31 {
    public final tmr0 a;
    public final tor0 b;
    public String c;

    public q3f(tmr0 tmr0Var, tor0 tor0Var) {
        this.a = tmr0Var;
        this.b = tor0Var;
    }

    @Override // defpackage.av31
    public final String screenName() {
        return "shared_account";
    }

    public final String toString() {
        return "CreateAccountPage{accountName='" + this.c + "', accountType='" + this.a + "'}";
    }
}
