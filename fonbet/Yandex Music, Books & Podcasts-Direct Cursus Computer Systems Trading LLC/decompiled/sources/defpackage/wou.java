package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class wou extends aur implements Function2 {
    public final /* synthetic */ int j;
    public String k;
    public zzp l;
    public long m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ mmo p;
    public final /* synthetic */ mmo q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wou(mmo mmoVar, Continuation continuation, mmo mmoVar2, int i) {
        super(2, continuation);
        this.j = i;
        this.p = mmoVar;
        this.q = mmoVar2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                wou wouVar = new wou(this.p, continuation, this.q, 0);
                wouVar.o = obj;
                return wouVar;
            default:
                wou wouVar2 = new wou(this.p, continuation, this.q, 1);
                wouVar2.o = obj;
                return wouVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((wou) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        zzp zzpVar;
        long j;
        String str;
        zzp zzpVar2;
        long j2;
        String str2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.n;
                if (i == 0) {
                    qgg.h0(obj);
                    zzp zzpVar3 = (zzp) this.p.e;
                    long a = zzpVar3.a();
                    gs4 gs4Var = (gs4) this.q.d;
                    this.o = null;
                    this.k = "leftoverAwaitTimeMs";
                    this.l = zzpVar3;
                    this.m = a;
                    this.n = 1;
                    if (gs4Var.A(this) == nm6Var) {
                        return nm6Var;
                    }
                    zzpVar = zzpVar3;
                    j = a;
                    str = "leftoverAwaitTimeMs";
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = this.m;
                    zzpVar = this.l;
                    str = this.k;
                    qgg.h0(obj);
                }
                return new w7c(str, zzpVar.a() - j);
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.n;
                if (i2 == 0) {
                    qgg.h0(obj);
                    zzp zzpVar4 = (zzp) this.p.e;
                    long a2 = zzpVar4.a();
                    gs4 gs4Var2 = (gs4) this.q.d;
                    this.o = null;
                    this.k = "leftoverAwaitTimeMs";
                    this.l = zzpVar4;
                    this.m = a2;
                    this.n = 1;
                    if (gs4Var2.A(this) == nm6Var2) {
                        return nm6Var2;
                    }
                    zzpVar2 = zzpVar4;
                    j2 = a2;
                    str2 = "leftoverAwaitTimeMs";
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = this.m;
                    zzpVar2 = this.l;
                    str2 = this.k;
                    qgg.h0(obj);
                }
                return new w7c(str2, zzpVar2.a() - j2);
        }
    }
}
