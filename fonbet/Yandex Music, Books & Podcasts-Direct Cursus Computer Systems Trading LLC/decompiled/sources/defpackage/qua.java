package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class qua implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zwa b;

    public /* synthetic */ qua(zwa zwaVar, int i) {
        this.a = i;
        this.b = zwaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.w(jfpVar);
                jfpVar.o(hfp.u, new sa(null, new pua(this.b, 0)));
                break;
            case 1:
                this.b.G();
                break;
            case 2:
                if (((Float) obj).floatValue() == 0.0f) {
                    this.b.N();
                }
                break;
            default:
                vua vuaVar = (vua) obj;
                vuaVar.getClass();
                this.b.a(vuaVar);
                break;
        }
        return Unit.a;
    }
}
