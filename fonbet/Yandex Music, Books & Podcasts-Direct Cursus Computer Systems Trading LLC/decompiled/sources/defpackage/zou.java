package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class zou extends aur implements Function2 {
    public final /* synthetic */ int j;
    public String k;
    public zzp l;
    public long m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ String p;
    public final /* synthetic */ mmo q;
    public final /* synthetic */ mmo r;
    public final /* synthetic */ sfo s;
    public final /* synthetic */ r7c t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zou(String str, mmo mmoVar, Continuation continuation, mmo mmoVar2, sfo sfoVar, r7c r7cVar, int i) {
        super(2, continuation);
        this.j = i;
        this.p = str;
        this.q = mmoVar;
        this.r = mmoVar2;
        this.s = sfoVar;
        this.t = r7cVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                zou zouVar = new zou(this.p, this.q, continuation, this.r, this.s, this.t, 0);
                zouVar.o = obj;
                return zouVar;
            default:
                zou zouVar2 = new zou(this.p, this.q, continuation, this.r, this.s, this.t, 1);
                zouVar2.o = obj;
                return zouVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((zou) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
                    zzp zzpVar3 = (zzp) this.q.e;
                    long a = zzpVar3.a();
                    sml smlVar = (sml) this.r.b;
                    sfo sfoVar = this.s;
                    String str3 = sfoVar.a;
                    s9p s9pVar = sfoVar.b;
                    this.o = null;
                    String str4 = this.p;
                    this.k = str4;
                    this.l = zzpVar3;
                    this.m = a;
                    this.n = 1;
                    if (smlVar.C(str3, s9pVar, this.t, this) == nm6Var) {
                        return nm6Var;
                    }
                    zzpVar = zzpVar3;
                    j = a;
                    str = str4;
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
                    zzp zzpVar4 = (zzp) this.q.e;
                    long a2 = zzpVar4.a();
                    sml smlVar2 = (sml) this.r.b;
                    sfo sfoVar2 = this.s;
                    String str5 = sfoVar2.a;
                    s9p s9pVar2 = sfoVar2.b;
                    this.o = null;
                    String str6 = this.p;
                    this.k = str6;
                    this.l = zzpVar4;
                    this.m = a2;
                    this.n = 1;
                    if (smlVar2.C(str5, s9pVar2, this.t, this) == nm6Var2) {
                        return nm6Var2;
                    }
                    zzpVar2 = zzpVar4;
                    j2 = a2;
                    str2 = str6;
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
