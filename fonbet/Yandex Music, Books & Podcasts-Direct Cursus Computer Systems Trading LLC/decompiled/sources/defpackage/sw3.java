package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class sw3 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ vw3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sw3(vw3 vw3Var, int i) {
        super(0);
        this.r = i;
        this.s = vw3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ww3 ww3Var;
        switch (this.r) {
            case 0:
                this.s.b();
                break;
            case 1:
                this.s.c();
                break;
            case 2:
                this.s.e.a();
                break;
            default:
                vw3 vw3Var = this.s;
                if (vw3Var.e.c() == null && (ww3Var = vw3Var.i) != null) {
                    ww3Var.invoke(new hne(fbs.CVN));
                }
                vw3.a(vw3Var);
                break;
        }
        return Unit.a;
    }
}
