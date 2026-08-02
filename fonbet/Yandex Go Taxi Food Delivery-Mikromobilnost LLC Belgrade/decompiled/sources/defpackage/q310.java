package defpackage;

/* loaded from: classes6.dex */
public final class q310 implements v7p {
    public final /* synthetic */ int a;
    public final mvy b;

    public /* synthetic */ q310(mvy mvyVar, int i) {
        this.a = i;
        this.b = mvyVar;
    }

    public static q310 a(mvy mvyVar) {
        return new q310(mvyVar, 1);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        mvy mvyVar = this.b;
        switch (i) {
            case 0:
                return new p310((n310) mvyVar.get());
            default:
                return new w310((n310) mvyVar.get());
        }
    }
}
