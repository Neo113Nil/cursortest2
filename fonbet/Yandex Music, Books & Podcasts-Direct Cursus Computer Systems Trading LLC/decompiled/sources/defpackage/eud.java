package defpackage;

/* loaded from: classes3.dex */
public final class eud implements fud {
    public long a;
    public long b;
    public long c;
    public final Object d;

    public eud(int i) {
        switch (i) {
            case 1:
                soi soiVar = vpe.a;
                this.d = new soi();
                this.a = -1L;
                this.b = 0L;
                this.c = 0L;
                break;
            default:
                long j = d85.d;
                this.a = j;
                this.d = new bud((int) j);
                this.b = j;
                this.c = j;
                break;
        }
    }

    @Override // defpackage.fud
    public long a() {
        return this.b;
    }

    @Override // defpackage.fud
    public long b() {
        return this.c;
    }

    @Override // defpackage.fud
    public dud c() {
        return (bud) this.d;
    }

    @Override // defpackage.fud
    public long e() {
        return this.a;
    }

    @Override // defpackage.fud
    public void d() {
    }
}
