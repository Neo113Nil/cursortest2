package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class hnk extends aur implements Function1 {
    public int j;
    public final /* synthetic */ ueo k;
    public final /* synthetic */ gs4 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ mqs n;
    public String o;
    public gs4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnk(ueo ueoVar, Continuation continuation, gs4 gs4Var, String str, mqs mqsVar) {
        super(1, continuation);
        this.k = ueoVar;
        this.l = gs4Var;
        this.m = str;
        this.n = mqsVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new hnk(this.k, continuation, this.l, this.m, this.n);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((hnk) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c3, code lost:
    
        if (r0 == r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r1.m(r10, r2, r17) != r7) goto L25;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object f;
        int i;
        String str;
        gs4 gs4Var;
        int i2;
        Object a;
        nm6 nm6Var = nm6.a;
        int i3 = this.j;
        mqs mqsVar = this.n;
        String str2 = this.m;
        gs4 gs4Var2 = this.l;
        if (i3 == 0) {
            qgg.h0(obj);
            this.o = str2;
            this.p = gs4Var2;
            this.q = 0;
            this.j = 1;
            f = gs4.f(gs4Var2, str2, this);
            if (f != nm6Var) {
                i = 0;
                str = str2;
                gs4Var = gs4Var2;
            }
            return nm6Var;
        }
        if (i3 == 1) {
            int i4 = this.q;
            gs4 gs4Var3 = this.p;
            str = this.o;
            qgg.h0(obj);
            i = i4;
            gs4Var = gs4Var3;
            f = obj;
        } else if (i3 == 2) {
            i2 = this.q;
            qgg.h0(obj);
            btl btlVar = (btl) gs4Var2.a;
            String str3 = mqsVar.a;
            this.q = i2;
            this.j = 3;
        } else {
            if (i3 != 3) {
                if (i3 == 4) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.q;
            qgg.h0(obj);
            cus cusVar = (cus) gs4Var2.d;
            List c = t75.c(mqsVar.a);
            this.q = i2;
            this.j = 4;
            cusVar.getClass();
            if (c.isEmpty()) {
                a = Unit.a;
            } else {
                ssg.a(3, null, "deleting tracks: " + c, null);
                a = cusVar.a.a(str2, c, this);
                if (a != nm6Var) {
                    a = Unit.a;
                }
            }
        }
        long longValue = ((Number) f).longValue();
        String str4 = mqsVar.a;
        this.o = null;
        this.p = null;
        this.q = i;
        this.j = 2;
        if (gs4Var.T(str, longValue, str4, null, this) != nm6Var) {
            i2 = i;
            btl btlVar2 = (btl) gs4Var2.a;
            String str32 = mqsVar.a;
            this.q = i2;
            this.j = 3;
        }
        return nm6Var;
    }
}
