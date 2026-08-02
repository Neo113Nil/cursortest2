package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class itu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ltu b;

    public /* synthetic */ itu(ltu ltuVar, int i) {
        this.a = i;
        this.b = ltuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new k4v(this.b.o);
            case 1:
                xdr xdrVar = this.b.u;
                pkb pkbVar = ((cvo) xdrVar.getValue()).e.a;
                String str = ((cvo) xdrVar.getValue()).e.b;
                pkbVar.getClass();
                str.getClass();
                return new thj(pkbVar, str, 1, 1, "");
            default:
                ltu ltuVar = this.b;
                if (!ltuVar.r) {
                    thv thvVar = (thv) ltuVar.e.b.getValue();
                    thvVar.h = null;
                    xdr xdrVar2 = thvVar.i;
                    xdrVar2.getClass();
                    xdrVar2.m(null, ckv.a);
                }
                return Unit.a;
        }
    }
}
