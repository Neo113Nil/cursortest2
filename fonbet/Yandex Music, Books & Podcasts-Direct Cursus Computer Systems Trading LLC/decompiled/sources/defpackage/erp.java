package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class erp implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jrp b;

    public /* synthetic */ erp(jrp jrpVar, int i) {
        this.a = i;
        this.b = jrpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new hrp(this.b);
            default:
                return asq.K(this.b.a.f, new qpp(25));
        }
    }
}
