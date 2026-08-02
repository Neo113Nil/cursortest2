package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class fm9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm9(kyk kykVar, boolean z) {
        super(1);
        this.r = 2;
        this.s = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        boolean z = false;
        boolean z2 = this.s;
        switch (i) {
            case 0:
                k79 k79Var = (k79) obj;
                jc8 jc8Var = k79Var.a;
                xzb xzbVar = k79Var.b;
                dp8 d = jc8Var.d();
                List l = d.l();
                if ((l != null ? l.contains(nw9.STATE_CHANGE) : true) && (r5 = d.getId()) != null) {
                    if (!z2) {
                        sq8 E = d.E();
                        fw9 fw9Var = E != null ? new fw9(E) : null;
                        un8 D = d.D();
                        ew9 ew9Var = D != null ? new ew9(D, 2) : null;
                        if (fw9Var != null || ew9Var != null) {
                            break;
                        }
                    } else {
                        un8 A = d.A();
                        if (A != null) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                zco zcoVar = (zco) obj;
                if (!z2 && Boolean.TRUE.booleanValue()) {
                    z = true;
                }
                zcoVar.c(z);
                break;
            default:
                o0l o0lVar = (o0l) obj;
                o0lVar.getClass();
                o0lVar.b = 0L;
                o0lVar.c = null;
                o0lVar.f = Boolean.valueOf(z2);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fm9(int i, boolean z) {
        super(1);
        this.r = i;
        this.s = z;
    }
}
