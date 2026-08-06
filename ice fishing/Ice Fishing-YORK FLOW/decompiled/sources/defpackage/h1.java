package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class h1 implements android.view.View.OnDragListener, defpackage.tr {
    public final defpackage.vr ZpBGe2uQfcn8;
    public final defpackage.g1 fWTAfUmVKrZq;
    public final defpackage.x7 giKS3J6vZuNy;

    public h1() {
        defpackage.vr vrVar = new defpackage.vr();
        vrVar.w7APNrr0aGRc = 0L;
        this.ZpBGe2uQfcn8 = vrVar;
        this.giKS3J6vZuNy = new defpackage.x7();
        this.fWTAfUmVKrZq = new defpackage.g1(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(android.view.View view, android.view.DragEvent dragEvent) {
        defpackage.k0 k0Var = new defpackage.k0(6, dragEvent);
        int action = dragEvent.getAction();
        defpackage.qp1 qp1Var = defpackage.qp1.WDYagTQQm9ns;
        defpackage.x7 x7Var = this.giKS3J6vZuNy;
        defpackage.vr vrVar = this.ZpBGe2uQfcn8;
        switch (action) {
            case 1:
                defpackage.v31 v31Var = new defpackage.v31();
                defpackage.ur urVar = new defpackage.ur(k0Var, vrVar, v31Var);
                if (urVar.P05cfTpS5W5L(vrVar) == qp1Var) {
                    defpackage.t80.CZa7MwI9IzLd(vrVar, urVar);
                }
                boolean z = v31Var.WDYagTQQm9ns;
                x7Var.getClass();
                defpackage.s7 s7Var = new defpackage.s7(x7Var);
                while (s7Var.hasNext()) {
                    ((defpackage.vr) s7Var.next()).KN4muQto0Nd5();
                }
                break;
            case 2:
                vrVar.jVUAPb5NnIYW(k0Var);
                break;
            case 4:
                defpackage.YjS0G3zEDWNX yjS0G3zEDWNX = new defpackage.YjS0G3zEDWNX(10, k0Var);
                if (yjS0G3zEDWNX.P05cfTpS5W5L(vrVar) == qp1Var) {
                    defpackage.t80.CZa7MwI9IzLd(vrVar, yjS0G3zEDWNX);
                }
                x7Var.clear();
                break;
            case 5:
                vrVar.xbkEJUK1coRZ();
                break;
            case 6:
                vrVar.I9id0xDxCgYV();
                break;
        }
        return false;
    }
}
