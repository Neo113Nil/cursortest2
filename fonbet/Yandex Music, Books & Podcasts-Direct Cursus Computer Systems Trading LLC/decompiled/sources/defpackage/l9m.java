package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class l9m extends aur implements Function1 {
    public xqn j;
    public Object k;
    public iz7 l;
    public String m;
    public xqn n;
    public int o;
    public final /* synthetic */ iz7 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ z77 t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9m(iz7 iz7Var, boolean z, String str, String str2, z77 z77Var, String str3, String str4, Continuation continuation) {
        super(1, continuation);
        this.p = iz7Var;
        this.q = z;
        this.r = str;
        this.s = str2;
        this.t = z77Var;
        this.u = str3;
        this.v = str4;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new l9m(this.p, this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((l9m) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xqn i;
        iz7 iz7Var;
        xqn xqnVar;
        oqi oqiVar;
        String str;
        l9m l9mVar;
        xqn xqnVar2;
        xqn xqnVar3;
        xqn xqnVar4;
        iz7 iz7Var2 = this.p;
        oqi oqiVar2 = (qqi) iz7Var2.k;
        nm6 nm6Var = nm6.a;
        int i2 = this.o;
        String str2 = this.v;
        try {
            if (i2 == 0) {
                i = hrg.i(obj);
                this.j = i;
                this.k = oqiVar2;
                this.l = iz7Var2;
                this.m = str2;
                this.n = i;
                this.o = 1;
                if (oqiVar2.a(this) == nm6Var) {
                    return nm6Var;
                }
                iz7Var = iz7Var2;
                xqnVar = i;
                oqiVar = oqiVar2;
                str = str2;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = this.m;
                        iz7Var2 = this.l;
                        oqiVar2 = (oqi) this.k;
                        xqnVar4 = this.j;
                        qgg.h0(obj);
                        try {
                            oqiVar2.b(null);
                            return ovn.K((bmg) xqnVar4.a);
                        } finally {
                        }
                    }
                    xqnVar3 = (xqn) this.k;
                    xqnVar2 = this.j;
                    qgg.h0(obj);
                    l9mVar = this;
                    xqnVar3.a = obj;
                    l9mVar.j = xqnVar2;
                    l9mVar.k = oqiVar2;
                    l9mVar.l = iz7Var2;
                    l9mVar.m = str2;
                    l9mVar.o = 3;
                    if (oqiVar2.a(this) != nm6Var) {
                        xqnVar4 = xqnVar2;
                        oqiVar2.b(null);
                        return ovn.K((bmg) xqnVar4.a);
                    }
                    return nm6Var;
                }
                i = this.n;
                str = this.m;
                iz7Var = this.l;
                oqiVar = (oqi) this.k;
                xqn xqnVar5 = this.j;
                qgg.h0(obj);
                xqnVar = xqnVar5;
            }
            bmg bmgVar = (bmg) ((e0h) iz7Var.j).get(str);
            oqiVar2.b(null);
            i.a = bmgVar;
            Object obj2 = xqnVar.a;
            if (obj2 != null) {
                return ovn.K((bmg) obj2);
            }
            this.j = xqnVar;
            this.k = xqnVar;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = 2;
            l9mVar = this;
            Object c = iz7.c(iz7Var2, this.q, this.r, this.s, this.t, this.u, l9mVar);
            if (c != nm6Var) {
                xqnVar2 = xqnVar;
                obj = c;
                xqnVar3 = xqnVar2;
                xqnVar3.a = obj;
                l9mVar.j = xqnVar2;
                l9mVar.k = oqiVar2;
                l9mVar.l = iz7Var2;
                l9mVar.m = str2;
                l9mVar.o = 3;
                if (oqiVar2.a(this) != nm6Var) {
                }
            }
            return nm6Var;
        } finally {
        }
    }
}
