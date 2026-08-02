package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class jdi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ List c;
    public final /* synthetic */ sdr d;

    public /* synthetic */ jdi(float f, List list, sdr sdrVar, int i) {
        this.a = i;
        this.b = f;
        this.c = list;
        this.d = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                return np3Var.b(new jdi(np3Var.getDensity() * this.b, this.c, this.d, 1));
            default:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                float d = nmq.d(opfVar.a.e());
                float f = this.b;
                float f2 = hrg.f((Number) this.d.getValue(), d + f, -f);
                jpa.A0(opfVar, new o6g(this.c, null, swf.i(f2, 0.0f), swf.i(f2 + f, 0.0f), 0), 0L, 0L, 0.0f, null, null, 5, 62);
                return Unit.a;
        }
    }
}
