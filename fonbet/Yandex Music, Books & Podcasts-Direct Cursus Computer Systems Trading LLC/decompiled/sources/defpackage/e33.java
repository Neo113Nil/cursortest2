package defpackage;

/* loaded from: classes.dex */
public final class e33 implements cg7 {
    public final ipb a;
    public final bgp b;

    public e33(int i, ipb ipbVar) {
        this.a = ipbVar;
        int i2 = cgp.a;
        this.b = new bgp(i, 0);
    }

    @Override // defpackage.cg7
    public final dg7 a(r3r r3rVar, rwj rwjVar) {
        return new g33(r3rVar.a, rwjVar, this.b, this.a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof e33;
    }

    public final int hashCode() {
        return e33.class.hashCode();
    }
}
