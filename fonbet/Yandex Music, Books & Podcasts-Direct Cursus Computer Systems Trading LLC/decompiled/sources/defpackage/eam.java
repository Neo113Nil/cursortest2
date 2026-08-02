package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class eam implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rbm b;
    public final /* synthetic */ jab c;
    public final /* synthetic */ u0s d;

    public /* synthetic */ eam(rbm rbmVar, jab jabVar, u0s u0sVar, int i) {
        this.a = i;
        this.b = rbmVar;
        this.c = jabVar;
        this.d = u0sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.a.i(this.c, this.d);
                break;
            default:
                rbm rbmVar = this.b;
                rbmVar.getClass();
                rmb.a(rbmVar.e.a(this.c, this.d), sjb.Refresh, null, null, 14);
                gcm gcmVar = rbmVar.b;
                gcmVar.getClass();
                x97.y(ot0.F(gcmVar), null, null, new ecm(gcmVar, null, 1), 3);
                break;
        }
        return Unit.a;
    }
}
