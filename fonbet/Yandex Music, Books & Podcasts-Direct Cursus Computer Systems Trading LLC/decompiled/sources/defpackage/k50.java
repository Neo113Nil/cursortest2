package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class k50 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public k50(int i, i2u i2uVar, y8u y8uVar, i2u i2uVar2, i2u i2uVar3) {
        this.a = 2;
        this.e = i;
        this.f = i2uVar;
        this.b = y8uVar;
        this.c = i2uVar2;
        this.d = i2uVar3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        int i2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                a60 a60Var = (a60) obj4;
                rr3 rr3Var = ((sr3) obj).b;
                a60Var.getClass();
                xdr xdrVar = a60Var.b.q;
                xdrVar.getClass();
                xdrVar.m(null, rr3Var);
                x97.y((mm6) obj2, null, null, new j50((fvf) obj3, i2, (Continuation) null, 0), 3);
                break;
            case 1:
                rja rjaVar = (rja) obj4;
                rr3 rr3Var2 = ((sr3) obj).b;
                rjaVar.getClass();
                xdr xdrVar2 = rjaVar.c.i;
                xdrVar2.getClass();
                xdrVar2.m(null, rr3Var2);
                x97.y((mm6) obj2, null, null, new j50((fvf) obj3, i2, (Continuation) null, 1), 3);
                break;
            default:
                i2u i2uVar = (i2u) obj4;
                i2u i2uVar2 = (i2u) obj3;
                float f = w8u.a;
                if (((i2u) obj2).a() == null) {
                    if (i2 < w8u.f(i2uVar2)) {
                        i2uVar.d.setValue(new a2u(null));
                    } else if (i2 > w8u.f(i2uVar2)) {
                        i2uVar.d.setValue(new b2u(null));
                    } else {
                        ((y8u) obj).j();
                    }
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ k50(Object obj, sr3 sr3Var, mm6 mm6Var, fvf fvfVar, int i, int i2) {
        this.a = i2;
        this.f = obj;
        this.b = sr3Var;
        this.c = mm6Var;
        this.d = fvfVar;
        this.e = i;
    }
}
