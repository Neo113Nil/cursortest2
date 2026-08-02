package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class knk extends aur implements Function2 {
    public gs4 j;
    public mqs k;
    public String l;
    public long m;
    public int n;
    public int o;
    public int p;
    public final /* synthetic */ gs4 q;
    public final /* synthetic */ mqs r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knk(gs4 gs4Var, mqs mqsVar, long j, Continuation continuation) {
        super(2, continuation);
        this.q = gs4Var;
        this.r = mqsVar;
        this.s = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new knk(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((knk) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        if (defpackage.tyf.N(r5, r4, r12) == r0) goto L17;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        gs4 gs4Var;
        mqs mqsVar;
        long j;
        String str;
        int i;
        int i2;
        nm6 nm6Var = nm6.a;
        int i3 = this.p;
        if (i3 == 0) {
            qgg.h0(obj);
            gs4Var = this.q;
            mqsVar = this.r;
            j = this.s;
            l18 l18Var = l18.b;
            bdt I = hag.I(frt.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            str = ((frt) qdcVar.C(I)).c().a;
            str.getClass();
            i5h x = gs4Var.x();
            this.j = gs4Var;
            this.k = mqsVar;
            this.l = str;
            this.m = j;
            i = 0;
            this.n = 0;
            this.o = 0;
            this.p = 1;
            obj = x.b(str, this);
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
            return Unit.a;
        }
        i = this.o;
        i2 = this.n;
        j = this.m;
        str = this.l;
        mqsVar = this.k;
        gs4Var = this.j;
        qgg.h0(obj);
        ueo ueoVar = (ueo) obj;
        wlg wlgVar = new wlg(ueoVar, (Continuation) null, gs4Var, str, mqsVar, j);
        this.j = null;
        this.k = null;
        this.l = null;
        this.n = i2;
        this.o = i;
        this.p = 2;
    }
}
