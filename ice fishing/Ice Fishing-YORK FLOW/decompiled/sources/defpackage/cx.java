package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class cx implements defpackage.dc1 {
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public final defpackage.y10 fWTAfUmVKrZq;
    public final java.lang.Object giKS3J6vZuNy;

    public /* synthetic */ cx(java.lang.Object obj, defpackage.y10 y10Var, int i) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = obj;
        this.fWTAfUmVKrZq = y10Var;
    }

    @Override // defpackage.dc1
    public final java.util.Iterator iterator() {
        switch (this.ZpBGe2uQfcn8) {
            case 0:
                return new defpackage.bx(this);
            default:
                return new defpackage.l30(this);
        }
    }
}
