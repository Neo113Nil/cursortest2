package defpackage;

/* loaded from: classes14.dex */
public final class xt1 implements v7p {
    public final /* synthetic */ int a;
    public final yc b;
    public final h0z c;

    public /* synthetic */ xt1(yc ycVar, h0z h0zVar, int i) {
        this.a = i;
        this.b = ycVar;
        this.c = h0zVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        h0z h0zVar = this.c;
        yc ycVar = this.b;
        switch (i) {
            case 0:
                return new wt1((nz2) ycVar.get(), (cr00) h0zVar.get());
            case 1:
                return new gjm((nz2) ycVar.get(), (cr00) h0zVar.get());
            default:
                return new i641((nz2) ycVar.get(), (cr00) h0zVar.get());
        }
    }
}
