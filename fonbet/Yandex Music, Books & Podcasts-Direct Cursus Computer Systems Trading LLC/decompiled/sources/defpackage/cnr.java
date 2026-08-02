package defpackage;

/* loaded from: classes.dex */
public final class cnr {
    public final fnr a;
    public zpf b;
    public final bnr c = new bnr(this, 2);
    public final bnr d = new bnr(this, 0);
    public final bnr e = new bnr(this, 1);

    public cnr(fnr fnrVar) {
        this.a = fnrVar;
    }

    public final zpf a() {
        zpf zpfVar = this.b;
        if (zpfVar != null) {
            return zpfVar;
        }
        xq0.x("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
