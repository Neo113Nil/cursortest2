package defpackage;

/* loaded from: classes.dex */
public final class i2r extends per {
    public float c;

    public i2r(long j, float f) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.per
    public final void a(per perVar) {
        perVar.getClass();
        this.c = ((i2r) perVar).c;
    }

    @Override // defpackage.per
    public final per b(long j) {
        return new i2r(j, this.c);
    }
}
