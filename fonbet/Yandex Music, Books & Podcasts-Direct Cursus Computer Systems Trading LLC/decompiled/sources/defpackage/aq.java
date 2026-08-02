package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class aq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6k b;

    public /* synthetic */ aq(u6k u6kVar, int i) {
        this.a = i;
        this.b = u6kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                cds cdsVar = (cds) obj;
                cdsVar.getClass();
                this.b.i(cdsVar.b.f);
                return Unit.a;
            case 1:
                wof wofVar = (wof) obj;
                wofVar.getClass();
                this.b.i((int) (wofVar.j() & 4294967295L));
                return Unit.a;
            case 2:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.r(jfpVar, this.b.h() == 0);
                return Unit.a;
            case 3:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.r(jfpVar2, this.b.h() == 1);
                return Unit.a;
            case 4:
                this.b.i((int) (((hqe) obj).a & 4294967295L));
                return Unit.a;
            case 5:
                cds cdsVar2 = (cds) obj;
                cdsVar2.getClass();
                this.b.i(cdsVar2.b.f);
                return Unit.a;
            case 6:
                this.b.i((int) (((hqe) obj).a >> 32));
                return Unit.a;
            default:
                ((jx7) obj).getClass();
                return new wpe(xv.t(this.b.h(), 0));
        }
    }
}
