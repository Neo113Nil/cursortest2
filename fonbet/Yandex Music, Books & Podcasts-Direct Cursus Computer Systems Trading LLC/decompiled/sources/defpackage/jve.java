package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class jve implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eps b;

    public /* synthetic */ jve(eps epsVar, int i) {
        this.a = i;
        this.b = epsVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                eps epsVar = this.b;
                lve lveVar = (lve) epsVar.d;
                return "not swapped idlePlayer=" + (lveVar != null ? lveVar.a : null) + ", current=" + epsVar.h().a;
            case 1:
                return (o4c) ((cte) this.b.a).invoke();
            default:
                eps epsVar2 = this.b;
                return "current=" + epsVar2.h() + " idle=" + ((lve) epsVar2.d);
        }
    }
}
