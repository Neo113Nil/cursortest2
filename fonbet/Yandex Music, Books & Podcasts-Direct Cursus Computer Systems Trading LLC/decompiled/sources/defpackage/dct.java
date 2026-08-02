package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class dct implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mct b;

    public /* synthetic */ dct(mct mctVar, int i) {
        this.a = i;
        this.b = mctVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                sm0 sm0Var = (sm0) obj;
                sm0Var.getClass();
                this.b.b(((Number) sm0Var.e.getValue()).floatValue());
                break;
            case 1:
                this.b.d.setValue(new cma(kct.a + ((cma) obj).a));
                break;
            case 2:
                float f = (int) (((hqe) obj).a & 4294967295L);
                mct mctVar = this.b;
                mctVar.c.h(f - mctVar.e.e());
                break;
            default:
                float floatValue = ((Float) obj).floatValue();
                mct mctVar2 = this.b;
                mctVar2.b(mctVar2.e.e() + floatValue);
                break;
        }
        return Unit.a;
    }
}
