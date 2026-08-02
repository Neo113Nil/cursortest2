package defpackage;

import android.content.res.Resources;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class u27 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ v27 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u27(v27 v27Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = v27Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new u27(this.l, continuation, 0);
            case 1:
                return new u27(this.l, continuation, 1);
            case 2:
                return new u27(this.l, continuation, 2);
            case 3:
                return new u27(this.l, continuation, 3);
            case 4:
                return new u27(this.l, continuation, 4);
            case 5:
                return new u27(this.l, continuation, 5);
            case 6:
                return new u27(this.l, continuation, 6);
            case 7:
                return new u27(this.l, continuation, 7);
            case 8:
                return new u27(this.l, continuation, 8);
            case 9:
                return new u27(this.l, continuation, 9);
            default:
                return new u27(this.l, continuation, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                ((u27) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
            case 2:
                ((u27) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
            case 4:
                ((u27) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
            case 6:
                ((u27) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return ((u27) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        int i2 = 0;
        int i3 = 4;
        int i4 = 2;
        v27 v27Var = this.l;
        int i5 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i6 = this.k;
                if (i6 != 0) {
                    if (i6 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdr xdrVar = v27Var.y().u;
                t27 t27Var = new t27(v27Var, i2);
                this.k = 1;
                xdrVar.collect(t27Var, this);
                return nm6Var;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar = lyf.d;
                    u27 u27Var = new u27(v27Var, continuation, i2);
                    this.k = 1;
                    if (o8g.K(v27Var, lyfVar, u27Var, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar = v27Var.y().w;
                t27 t27Var2 = new t27(v27Var, i5);
                this.k = 1;
                x0qVar.getClass();
                x0q.m(x0qVar, t27Var2, this);
                return nm6Var3;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar2 = lyf.d;
                    u27 u27Var2 = new u27(v27Var, continuation, i4);
                    this.k = 1;
                    if (o8g.K(v27Var, lyfVar2, u27Var2, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                if (i10 != 0) {
                    if (i10 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar2 = v27Var.y().y;
                t27 t27Var3 = new t27(v27Var, i4);
                this.k = 1;
                x0qVar2.getClass();
                x0q.m(x0qVar2, t27Var3, this);
                return nm6Var5;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar3 = lyf.d;
                    u27 u27Var3 = new u27(v27Var, continuation, i3);
                    this.k = 1;
                    if (o8g.K(v27Var, lyfVar3, u27Var3, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i12 = this.k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdr xdrVar2 = v27Var.y().A;
                t27 t27Var4 = new t27(v27Var, 3);
                this.k = 1;
                xdrVar2.collect(t27Var4, this);
                return nm6Var7;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar4 = lyf.d;
                    u27 u27Var4 = new u27(v27Var, continuation, 6);
                    this.k = 1;
                    if (o8g.K(v27Var, lyfVar4, u27Var4, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 != 0) {
                    if (i14 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                bf bfVar = v27Var.p;
                if (bfVar == null) {
                    Intrinsics.j("actionReceiver");
                    throw null;
                }
                x0q x0qVar3 = bfVar.a;
                t27 t27Var5 = new t27(v27Var, i3);
                this.k = 1;
                x0qVar3.collect(t27Var5, this);
                return nm6Var9;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar5 = lyf.d;
                    u27 u27Var5 = new u27(v27Var, continuation, 8);
                    this.k = 1;
                    if (o8g.K(v27Var, lyfVar5, u27Var5, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    e8w e8wVar = e8w.a;
                    v27Var.requireContext().getClass();
                    Resources.Theme theme = v27Var.requireContext().getTheme();
                    theme.getClass();
                    bfg.E(theme, R.attr.paymentsdk_is_light_theme, true);
                    lom lomVar = v27Var.g;
                    if (lomVar == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    ugk ugkVar = lomVar.a.l().d().a;
                    lom lomVar2 = v27Var.g;
                    if (lomVar2 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    if (!lomVar2.a.m()) {
                        n7w.R(q6c.r);
                    }
                    lom lomVar3 = v27Var.g;
                    if (lomVar3 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    if (!lomVar3.a.m()) {
                        n7w.R(q6c.i);
                    }
                    this.k = 1;
                    e8w.c();
                    if (Unit.a == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                h37 y = v27Var.y();
                cq4 F = ot0.F(y);
                dq7 dq7Var = ca8.a;
                x97.y(F, mn7.d, null, new rc4(y, null, 25), 2);
                return Unit.a;
        }
    }
}
