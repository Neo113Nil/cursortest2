package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jtu implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ltu b;

    public /* synthetic */ jtu(ltu ltuVar, int i) {
        this.a = i;
        this.b = ltuVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        avo avoVar;
        switch (this.a) {
            case 0:
                c4v c4vVar = (c4v) obj;
                xdr xdrVar = this.b.u;
                cvo cvoVar = (cvo) xdrVar.getValue();
                if (!Intrinsics.d(c4vVar, a4v.a)) {
                    if (!(c4vVar instanceof z3v)) {
                        if (!(c4vVar instanceof b4v)) {
                            b6e.s();
                            break;
                        } else {
                            avoVar = ((b4v) c4vVar).a.b.a.j;
                        }
                    } else {
                        avoVar = avo.c;
                    }
                    avo avoVar2 = avoVar;
                    wjb wjbVar = cvoVar.a;
                    hlb hlbVar = cvoVar.b;
                    glb glbVar = cvoVar.c;
                    dvo dvoVar = cvoVar.d;
                    zuo zuoVar = cvoVar.f;
                    wjbVar.getClass();
                    hlbVar.getClass();
                    glbVar.getClass();
                    dvoVar.getClass();
                    avoVar2.getClass();
                    zuoVar.getClass();
                    xdrVar.m(null, new cvo(wjbVar, hlbVar, glbVar, dvoVar, avoVar2, zuoVar));
                    break;
                } else {
                    break;
                }
            case 1:
                v3w.n(!((Boolean) obj).booleanValue(), this.b.a.m, null);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c1v c1vVar = this.b.b;
                if (booleanValue) {
                    ((kj5) ((lj5) c1vVar.b.getValue())).b("wave_screen_filter", new j1p(26));
                } else {
                    ((kj5) ((lj5) c1vVar.b.getValue())).a("wave_screen_filter");
                }
                break;
        }
        return Unit.a;
    }
}
