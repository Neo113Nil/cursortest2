package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class r60 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ cr l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ z77 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r60(cr crVar, String str, String str2, String str3, z77 z77Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = crVar;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.p = z77Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r60(this.l, this.m, this.n, this.o, this.p, continuation, 0);
            case 1:
                return new r60(this.l, this.m, this.n, this.o, this.p, continuation, 1);
            default:
                return new r60(this.l, this.m, this.n, this.o, this.p, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((r60) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                try {
                    if (i == 0) {
                        qgg.h0(obj);
                        cr crVar = this.l;
                        String str = this.m;
                        String str2 = this.n;
                        String str3 = this.o;
                        z77 z77Var = this.p;
                        r7o r7oVar = z7o.b;
                        this.k = 1;
                        if (cr.n(crVar, str, str2, str3, z77Var, this) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    r7o r7oVar2 = z7o.b;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    r7o r7oVar3 = z7o.b;
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                try {
                    if (i2 == 0) {
                        qgg.h0(obj);
                        cr crVar2 = this.l;
                        String str4 = this.m;
                        String str5 = this.n;
                        String str6 = this.o;
                        z77 z77Var2 = this.p;
                        r7o r7oVar4 = z7o.b;
                        this.k = 1;
                        if (cr.p(crVar2, str4, str5, str6, z77Var2, this) == nm6Var2) {
                            return nm6Var2;
                        }
                    } else {
                        if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    r7o r7oVar5 = z7o.b;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable unused2) {
                    r7o r7oVar6 = z7o.b;
                }
                return Unit.a;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (cr.n(this.l, this.m, this.n, this.o, this.p, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
