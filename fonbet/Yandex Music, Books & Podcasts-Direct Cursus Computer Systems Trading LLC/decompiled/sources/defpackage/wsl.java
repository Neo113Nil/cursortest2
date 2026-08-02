package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class wsl extends aur implements Function2 {
    public btl j;
    public String k;
    public String l;
    public long m;
    public int n;
    public int o;
    public int p;
    public final /* synthetic */ btl q;
    public final /* synthetic */ long r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsl(btl btlVar, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.q = btlVar;
        this.r = j;
        this.s = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new wsl(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wsl) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        if (r13 == r0) goto L17;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        btl btlVar;
        long j;
        String str;
        String str2;
        int i;
        int i2;
        nm6 nm6Var = nm6.a;
        int i3 = this.p;
        if (i3 == 0) {
            qgg.h0(obj);
            btlVar = this.q;
            j = this.r;
            str = this.s;
            l18 l18Var = l18.b;
            bdt I = hag.I(frt.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            str2 = ((frt) qdcVar.C(I)).c().a;
            str2.getClass();
            i5h e = btlVar.e();
            this.j = btlVar;
            this.k = str;
            this.l = str2;
            this.m = j;
            i = 0;
            this.n = 0;
            this.o = 0;
            this.p = 1;
            obj = e.b(str2, this);
            if (obj != nm6Var) {
                i2 = 0;
            }
            return nm6Var;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            return new Integer(((Number) obj).intValue());
        }
        i = this.o;
        i2 = this.n;
        j = this.m;
        str2 = this.l;
        str = this.k;
        btlVar = this.j;
        qgg.h0(obj);
        ueo ueoVar = (ueo) obj;
        yw4 yw4Var = new yw4(ueoVar, null, j, str, btlVar, str2);
        this.j = null;
        this.k = null;
        this.l = null;
        this.n = i2;
        this.o = i;
        this.p = 2;
        obj = tyf.N(ueoVar, yw4Var, this);
    }
}
