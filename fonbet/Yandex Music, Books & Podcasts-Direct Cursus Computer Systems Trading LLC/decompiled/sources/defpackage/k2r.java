package defpackage;

/* loaded from: classes.dex */
public final class k2r extends per {
    public long c;

    public k2r(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.per
    public final void a(per perVar) {
        perVar.getClass();
        this.c = ((k2r) perVar).c;
    }

    @Override // defpackage.per
    public final per b(long j) {
        return new k2r(j, this.c);
    }
}
