package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class pyb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ syb l;
    public final /* synthetic */ z77 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyb(z77 z77Var, syb sybVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.l = sybVar;
        this.n = str;
        this.o = str2;
        this.m = z77Var;
        this.p = str3;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new pyb(this.m, this.l, this.n, this.o, this.p, continuation);
            case 1:
                return new pyb(this.l, this.m, this.n, this.o, this.p, continuation, 1);
            default:
                return new pyb(this.l, this.m, this.n, this.o, this.p, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((pyb) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        Object t7oVar2;
        Throwable th;
        Object t7oVar3;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                try {
                    if (i == 0) {
                        qgg.h0(obj);
                        syb sybVar = this.l;
                        String str = this.n;
                        String str2 = this.o;
                        z77 z77Var = this.m;
                        String str3 = this.p;
                        r7o r7oVar = z7o.b;
                        this.k = 1;
                        obj = syb.b(sybVar, str, str2, z77Var, str3, this);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    t7oVar = (j7a) obj;
                    r7o r7oVar2 = z7o.b;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th2) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th2);
                }
                return new z7o(t7oVar);
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                try {
                    if (i2 == 0) {
                        qgg.h0(obj);
                        syb sybVar2 = this.l;
                        z77 z77Var2 = this.m;
                        String str4 = this.n;
                        String str5 = this.o;
                        String str6 = this.p;
                        r7o r7oVar4 = z7o.b;
                        String i3 = sybVar2.g.i(z77Var2);
                        this.k = 1;
                        obj = syb.c(sybVar2, i3, "com.yandex.plus2.sdk.widget.daily", "sdk-widget-daily", "1.3.2", str4, str5, z77Var2, str6, this);
                        if (obj == nm6Var2) {
                            return nm6Var2;
                        }
                    } else {
                        if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    t7oVar2 = (okg) obj;
                    r7o r7oVar5 = z7o.b;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th3) {
                    r7o r7oVar6 = z7o.b;
                    t7oVar2 = new t7o(th3);
                }
                if (t7oVar2 instanceof t7o) {
                    return null;
                }
                return t7oVar2;
            default:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    syb sybVar3 = this.l;
                    z77 z77Var3 = this.m;
                    String str7 = this.n;
                    String str8 = this.o;
                    String str9 = this.p;
                    try {
                        r7o r7oVar7 = z7o.b;
                        String c = sybVar3.h.c(z77Var3);
                        this.k = 1;
                        try {
                            obj = syb.c(sybVar3, c, "com.yandex.plus2.sdk.widget.daily", "sdk-widget-daily", "1.3.2", str7, str8, z77Var3, str9, this);
                            if (obj == nm6Var3) {
                                return nm6Var3;
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            throw e;
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            r7o r7oVar8 = z7o.b;
                            t7oVar3 = new t7o(th);
                            if (t7oVar3 instanceof t7o) {
                            }
                        }
                    } catch (CancellationException e4) {
                        e = e4;
                        throw e;
                    } catch (Throwable th5) {
                        th = th5;
                        th = th;
                        r7o r7oVar82 = z7o.b;
                        t7oVar3 = new t7o(th);
                        if (t7oVar3 instanceof t7o) {
                        }
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        qgg.h0(obj);
                    } catch (CancellationException e5) {
                        throw e5;
                    } catch (Throwable th6) {
                        th = th6;
                        r7o r7oVar822 = z7o.b;
                        t7oVar3 = new t7o(th);
                        if (t7oVar3 instanceof t7o) {
                        }
                    }
                }
                t7oVar3 = (okg) obj;
                r7o r7oVar9 = z7o.b;
                if (t7oVar3 instanceof t7o) {
                    return t7oVar3;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pyb(syb sybVar, z77 z77Var, String str, String str2, String str3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = sybVar;
        this.m = z77Var;
        this.n = str;
        this.o = str2;
        this.p = str3;
    }
}
