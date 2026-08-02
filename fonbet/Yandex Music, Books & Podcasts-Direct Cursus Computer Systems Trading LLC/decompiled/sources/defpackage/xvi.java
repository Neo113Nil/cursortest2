package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class xvi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3r b;

    public /* synthetic */ xvi(f3r f3rVar, int i) {
        this.a = i;
        this.b = f3rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                jpa.A0(jpaVar, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.a;
            default:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                return np3Var.a(new xvi(this.b, 0));
        }
    }
}
