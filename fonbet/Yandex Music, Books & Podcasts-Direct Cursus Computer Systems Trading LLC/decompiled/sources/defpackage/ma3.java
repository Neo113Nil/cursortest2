package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ma3 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ yci e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ ma3(yci yciVar, Function0 function0, tvd tvdVar, iab iabVar, o8w o8wVar, hab habVar, Function0 function02, gvd gvdVar, pbu pbuVar, Function0 function03, dib dibVar, Function0 function04) {
        qo6 qo6Var = qo6.a;
        this.e = yciVar;
        this.b = function0;
        this.g = tvdVar;
        this.h = iabVar;
        this.i = o8wVar;
        this.j = habVar;
        this.c = function02;
        this.k = gvdVar;
        this.l = pbuVar;
        this.d = function03;
        this.m = dibVar;
        this.f = function04;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.i;
        Object obj8 = this.h;
        Object obj9 = this.g;
        Object obj10 = this.f;
        switch (i) {
            case 0:
                tvd tvdVar = (tvd) obj9;
                iab iabVar = (iab) obj8;
                o8w o8wVar = (o8w) obj7;
                hab habVar = (hab) obj6;
                gvd gvdVar = (gvd) obj5;
                qo6 qo6Var = qo6.a;
                pbu pbuVar = (pbu) obj4;
                dib dibVar = (dib) obj3;
                Function0 function0 = (Function0) obj10;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(1 & intValue, (intValue & 3) != 2)) {
                    long j = d85.m;
                    long j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
                    yci d = d.d(this.e, 1.0f);
                    Function0 function02 = this.b;
                    boolean f = oq5Var.f(function02);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (f || K == kjnVar) {
                        K = new ex(4, function02);
                        oq5Var.k0(K);
                    }
                    yci a = a.a(androidx.compose.ui.draw.a.a(d, (Function1) K), "entity_header");
                    Object K2 = oq5Var.K();
                    if (K2 == kjnVar) {
                        K2 = new mz2(6);
                        oq5Var.k0(K2);
                    }
                    q5g.k(nfp.b(a, false, (Function1) K2), null, j, j2, null, 0.0f, ild.C(1301167879, new i11(tvdVar, iabVar, o8wVar, habVar, this.c, gvdVar, pbuVar, this.d, dibVar, function0), oq5Var), oq5Var, 1573248, 50);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                kg5.d((cwk) obj10, (zi6) obj9, (n1g) obj8, this.b, this.c, this.d, (Function1) obj7, (Function1) obj6, (Function1) obj5, (Function1) obj4, this.e, (tbl) obj3, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ma3(cwk cwkVar, zi6 zi6Var, n1g n1gVar, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Function1 function13, Function1 function14, yci yciVar, tbl tblVar, int i) {
        this.f = cwkVar;
        this.g = zi6Var;
        this.h = n1gVar;
        this.b = function0;
        this.c = function02;
        this.d = function03;
        this.i = function1;
        this.j = function12;
        this.k = function13;
        this.l = function14;
        this.e = yciVar;
        this.m = tblVar;
    }
}
