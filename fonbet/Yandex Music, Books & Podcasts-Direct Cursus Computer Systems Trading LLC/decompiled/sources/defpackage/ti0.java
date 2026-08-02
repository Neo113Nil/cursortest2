package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class ti0 extends uif implements Function1 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti0(Function0 function0, boolean z, yg0 yg0Var, d43 d43Var) {
        super(1);
        this.t = function0;
        this.s = z;
        this.u = yg0Var;
        this.v = d43Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                opf opfVar = (opf) obj;
                opfVar.a();
                ou3 ou3Var = opfVar.a;
                if (((Boolean) ((Function0) this.t).invoke()).booleanValue()) {
                    yg0 yg0Var = (yg0) this.u;
                    d43 d43Var = (d43) this.v;
                    if (this.s) {
                        long y0 = ou3Var.y0();
                        nsh nshVar = ou3Var.b;
                        long B = nshVar.B();
                        nshVar.s().r();
                        try {
                            ((xzi) nshVar.b).f0(-1.0f, 1.0f, y0);
                            ou3Var.d(yg0Var, d43Var);
                        } finally {
                            vz1.A(nshVar, B);
                        }
                    } else {
                        ou3Var.d(yg0Var, d43Var);
                    }
                }
                return Unit.a;
            default:
                oo7 oo7Var = (oo7) obj;
                OkHttpClient okHttpClient = (OkHttpClient) this.v;
                anm anmVar = (anm) this.u;
                qdc qdcVar = (qdc) this.t;
                oo7Var.getClass();
                oo7Var.f = null;
                if (this.s) {
                    hl7 hl7Var = new hl7(false, qdcVar, true, okHttpClient, anmVar, false);
                    oo7Var.c = hl7Var;
                    oo7Var.d = hl7Var;
                } else {
                    t8w t8wVar = (t8w) ((cnm) anmVar).d.getValue();
                    t8wVar.getClass();
                    n3m n3mVar = new n3m(anmVar, okHttpClient, t8wVar, new uq3(true));
                    oo7Var.a = n3mVar;
                    oo7Var.b = n3mVar;
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti0(boolean z, qdc qdcVar, anm anmVar, OkHttpClient okHttpClient) {
        super(1);
        this.s = z;
        this.t = qdcVar;
        this.u = anmVar;
        this.v = okHttpClient;
    }
}
