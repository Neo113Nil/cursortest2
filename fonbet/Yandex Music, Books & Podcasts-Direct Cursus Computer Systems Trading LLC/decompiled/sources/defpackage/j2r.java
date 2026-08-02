package defpackage;

/* loaded from: classes.dex */
public final class j2r extends per {
    public int c;

    public j2r(long j, int i) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.per
    public final void a(per perVar) {
        perVar.getClass();
        this.c = ((j2r) perVar).c;
    }

    @Override // defpackage.per
    public final per b(long j) {
        return new j2r(j, this.c);
    }
}
