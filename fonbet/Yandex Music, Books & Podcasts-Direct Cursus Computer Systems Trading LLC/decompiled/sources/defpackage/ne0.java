package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class ne0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ xqn s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne0(xqn xqnVar, int i) {
        super(1);
        this.r = i;
        this.s = xqnVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        t17 t17Var;
        boolean z;
        switch (this.r) {
            case 0:
                this.s.a = (dpc) obj;
                return Boolean.TRUE;
            case 1:
                if (!((lpo) obj).a() && (t17Var = (t17) this.s.a) != null) {
                    t17Var.g();
                }
                return Unit.a;
            case 2:
                this.s.a = (ksk) obj;
                return Unit.a;
            case 3:
                this.s.a = (ksk) obj;
                return Unit.a;
            case 4:
                j4e j4eVar = (j4e) obj;
                xqn xqnVar = this.s;
                Object obj2 = xqnVar.a;
                if (obj2 == null && j4eVar.q) {
                    xqnVar.a = j4eVar;
                } else if (obj2 != null) {
                    j4eVar.getClass();
                }
                return Boolean.TRUE;
            case 5:
                qaw qawVar = (qaw) obj;
                qawVar.getClass();
                qawVar.a = (OkHttpClient) this.s.a;
                qawVar.b = 1;
                return Unit.a;
            case 6:
                sv7 sv7Var = (w9t) obj;
                if (((xci) sv7Var).a.n) {
                    this.s.a = sv7Var;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                w9t w9tVar = (w9t) obj;
                w9tVar.getClass();
                euf eufVar = ((x9t) w9tVar).o;
                xqn xqnVar2 = this.s;
                List list = (List) xqnVar2.a;
                if (list != null) {
                    list.add(eufVar);
                } else {
                    list = u75.j(eufVar);
                }
                xqnVar2.a = list;
                return v9t.b;
        }
    }
}
