package defpackage;

import io.grpc.util.a;
import io.grpc.util.b;
import java.util.List;

/* loaded from: classes5.dex */
public final class znd extends usc {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final /* synthetic */ ceg c;

    public znd(b bVar, wdg wdgVar) {
        this.c = bVar;
        this.b = new qwd(0, wdgVar);
    }

    @Override // defpackage.usc, defpackage.wdg
    public zdg K(ime imeVar) {
        switch (this.a) {
            case 1:
                b bVar = (b) this.c;
                bn7 bn7Var = bVar.g;
                xxj xxjVar = new xxj(bVar, imeVar, (qwd) this.b);
                List list = (List) imeVar.b;
                if (b.z(list) && bn7Var.containsKey(((reb) list.get(0)).a.get(0))) {
                    qxj qxjVar = (qxj) bn7Var.get(((reb) list.get(0)).a.get(0));
                    qxjVar.a(xxjVar);
                    if (qxjVar.d != null) {
                        xxjVar.T();
                    }
                }
                return xxjVar;
            default:
                return super.K(imeVar);
        }
    }

    @Override // defpackage.usc, defpackage.wdg
    public final void Z(r76 r76Var, aeg aegVar) {
        switch (this.a) {
            case 0:
                ceg cegVar = (ceg) this.b;
                a aVar = (a) this.c;
                ceg cegVar2 = aVar.l;
                r76 r76Var2 = r76.b;
                if (cegVar != cegVar2) {
                    if (cegVar == aVar.j) {
                        boolean z = r76Var == r76Var2;
                        aVar.o = z;
                        if (!z && cegVar2 != aVar.g) {
                            aVar.A();
                            break;
                        } else {
                            aVar.h.Z(r76Var, aegVar);
                            break;
                        }
                    }
                } else {
                    o2g.U("there's pending lb while current lb has been out of READY", aVar.o);
                    aVar.m = r76Var;
                    aVar.n = aegVar;
                    if (r76Var == r76Var2) {
                        aVar.A();
                        break;
                    }
                }
                break;
            default:
                ((qwd) this.b).Z(r76Var, new ask(aegVar));
                break;
        }
    }

    @Override // defpackage.usc
    public final wdg b0() {
        switch (this.a) {
            case 0:
                return ((a) this.c).h;
            default:
                return (qwd) this.b;
        }
    }

    public znd(a aVar) {
        this.c = aVar;
    }
}
