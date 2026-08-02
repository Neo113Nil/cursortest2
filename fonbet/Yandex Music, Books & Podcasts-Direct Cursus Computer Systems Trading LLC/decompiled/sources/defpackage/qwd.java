package defpackage;

import io.grpc.util.c;

/* loaded from: classes5.dex */
public final class qwd extends usc {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qwd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.usc, defpackage.wdg
    public zdg K(ime imeVar) {
        switch (this.a) {
            case 0:
                beg begVar = (beg) imeVar.u();
                zdg K = super.K(imeVar);
                if (begVar != null) {
                    return K.u().a.get(ceg.e) == null ? new pwd(K, begVar) : K;
                }
                return K;
            default:
                return super.K(imeVar);
        }
    }

    @Override // defpackage.usc, defpackage.wdg
    public void Z(r76 r76Var, aeg aegVar) {
        switch (this.a) {
            case 1:
                dgi dgiVar = (dgi) this.b;
                c cVar = dgiVar.g;
                if (cVar.g.containsKey(dgiVar.a)) {
                    dgiVar.d = r76Var;
                    dgiVar.e = aegVar;
                    if (!dgiVar.f && !cVar.i) {
                        if (r76Var == r76.d) {
                            dgiVar.b.x();
                        }
                        cVar.C();
                        break;
                    }
                }
                break;
            default:
                super.Z(r76Var, aegVar);
                break;
        }
    }

    @Override // defpackage.usc
    public final wdg b0() {
        switch (this.a) {
            case 0:
                return (wdg) this.b;
            default:
                return ((dgi) this.b).g.h;
        }
    }
}
