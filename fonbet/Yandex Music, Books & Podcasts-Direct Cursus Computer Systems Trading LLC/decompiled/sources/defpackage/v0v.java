package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class v0v implements ab0 {
    public final /* synthetic */ ab0 a;
    public final /* synthetic */ aqi b;

    public v0v(ab0 ab0Var, aqi aqiVar) {
        this.a = ab0Var;
        this.b = aqiVar;
    }

    @Override // defpackage.ab0
    public final apo a(Function1 function1) {
        function1.getClass();
        apo a = this.a.a(function1);
        f5r f5rVar = new f5r(21, a);
        wes wesVar = new wes(25, a, this.b);
        apo apoVar = bpo.a;
        return new apo(0, f5rVar, wesVar);
    }

    @Override // defpackage.ab0
    public final ya0 e(Function1 function1) {
        d44 d44Var = d44.a;
        function1.getClass();
        ya0 e = this.a.e(function1);
        Function1 function12 = (Function1) this.b.getValue();
        if (function12 != null) {
            function12.invoke(e);
        }
        return e;
    }
}
