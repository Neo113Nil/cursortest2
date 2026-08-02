package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class rud implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ cvd b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ yci f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ d85 h;

    public /* synthetic */ rud(cvd cvdVar, Function1 function1, Function0 function0, Function0 function02, yci yciVar, boolean z, d85 d85Var, int i) {
        this.b = cvdVar;
        this.c = function1;
        this.d = function0;
        this.e = function02;
        this.f = yciVar;
        this.g = z;
        this.h = d85Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    quj.u(0, this.h, oq5Var, this.b, this.f, this.d, this.e, this.c, this.g);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                quj.p(rvf.R(1), this.h, (hq5) obj, this.b, this.f, this.d, this.e, this.c, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                quj.u(rvf.R(1), this.h, (hq5) obj, this.b, this.f, this.d, this.e, this.c, this.g);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rud(cvd cvdVar, boolean z, d85 d85Var, Function1 function1, Function0 function0, Function0 function02, yci yciVar) {
        this.b = cvdVar;
        this.g = z;
        this.h = d85Var;
        this.c = function1;
        this.d = function0;
        this.e = function02;
        this.f = yciVar;
    }

    public /* synthetic */ rud(cvd cvdVar, boolean z, d85 d85Var, Function1 function1, Function0 function0, Function0 function02, yci yciVar, int i) {
        this.b = cvdVar;
        this.g = z;
        this.h = d85Var;
        this.c = function1;
        this.d = function0;
        this.e = function02;
        this.f = yciVar;
    }
}
