package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class d6t implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6t b;

    public /* synthetic */ d6t(e6t e6tVar, int i) {
        this.a = i;
        this.b = e6tVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        b6t b6tVar;
        switch (this.a) {
            case 0:
                if (((x66) obj).a) {
                    e6t e6tVar = this.b;
                    if (e6tVar.v.a.getValue() instanceof y5t) {
                        e6tVar.H(new x6s(21));
                    }
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                xdr xdrVar = this.b.u;
                do {
                    value = xdrVar.getValue();
                    b6tVar = (b6t) value;
                    if (b6tVar instanceof a6t) {
                        a6t a6tVar = (a6t) b6tVar;
                        p5t p5tVar = a6tVar.a;
                        String str = p5tVar.a;
                        String str2 = p5tVar.b;
                        String str3 = p5tVar.c;
                        qo6 qo6Var = p5tVar.d;
                        d85 d85Var = p5tVar.e;
                        boolean z = p5tVar.g;
                        Float f = p5tVar.h;
                        str2.getClass();
                        p5t p5tVar2 = new p5t(str, str2, str3, qo6Var, d85Var, booleanValue, z, f);
                        List list = a6tVar.b;
                        ybb ybbVar = a6tVar.c;
                        l5t l5tVar = a6tVar.d;
                        boolean z2 = a6tVar.e;
                        ybbVar.getClass();
                        l5tVar.getClass();
                        b6tVar = new a6t(p5tVar2, list, ybbVar, l5tVar, z2);
                    }
                } while (!xdrVar.k(value, b6tVar));
        }
        return Unit.a;
    }
}
