package defpackage;

import android.content.res.Resources;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class j47 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ l47 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j47(l47 l47Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = l47Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new j47(this.l, continuation, 0);
            case 1:
                return new j47(this.l, continuation, 1);
            case 2:
                return new j47(this.l, continuation, 2);
            case 3:
                return new j47(this.l, continuation, 3);
            case 4:
                return new j47(this.l, continuation, 4);
            case 5:
                return new j47(this.l, continuation, 5);
            case 6:
                return new j47(this.l, continuation, 6);
            case 7:
                return new j47(this.l, continuation, 7);
            case 8:
                return new j47(this.l, continuation, 8);
            case 9:
                return new j47(this.l, continuation, 9);
            case 10:
                return new j47(this.l, continuation, 10);
            case 11:
                return new j47(this.l, continuation, 11);
            case 12:
                return new j47(this.l, continuation, 12);
            case 13:
                return new j47(this.l, continuation, 13);
            case 14:
                return new j47(this.l, continuation, 14);
            case 15:
                return new j47(this.l, continuation, 15);
            default:
                return new j47(this.l, continuation, 16);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                return ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 1:
                ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                return nm6.a;
            case 2:
                return ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 3:
                ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                return nm6.a;
            case 4:
                return ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 5:
                ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                return nm6.a;
            case 6:
                return ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 7:
                ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                return nm6.a;
            case 8:
                return ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 9:
                ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                return nm6.a;
            case 10:
                return ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 11:
                return ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 12:
                return ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 13:
                return ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 14:
                return ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 15:
                ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                return nm6.a;
            default:
                return ((j47) create(mm6Var, continuation)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        int i2 = 3;
        int i3 = 5;
        int i4 = 7;
        l47 l47Var = this.l;
        int i5 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    e8w e8wVar = e8w.a;
                    l47Var.requireContext().getClass();
                    Resources.Theme theme = l47Var.requireContext().getTheme();
                    theme.getClass();
                    bfg.E(theme, R.attr.paymentsdk_is_light_theme, true);
                    sbp sbpVar = l47Var.h;
                    if (sbpVar == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    ugk ugkVar = sbpVar.b.d().a;
                    sbp sbpVar2 = l47Var.h;
                    if (sbpVar2 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    if (!sbpVar2.M()) {
                        n7w.R(q6c.r);
                    }
                    sbp sbpVar3 = l47Var.h;
                    if (sbpVar3 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    if (!sbpVar3.M()) {
                        n7w.R(q6c.i);
                    }
                    this.k = 1;
                    e8w.c();
                    if (Unit.a == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                l47Var.y().D();
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                vdr q = l47Var.y().q();
                k47 k47Var = new k47(l47Var, 0);
                this.k = 1;
                ((xdr) q).collect(k47Var, this);
                return nm6Var2;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar = lyf.d;
                    j47 j47Var = new j47(l47Var, continuation, i5);
                    this.k = 1;
                    if (o8g.K(l47Var, lyfVar, j47Var, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                u0q A = l47Var.y().A();
                k47 k47Var2 = new k47(l47Var, 1);
                this.k = 1;
                x0q x0qVar = (x0q) A;
                x0qVar.getClass();
                x0q.m(x0qVar, k47Var2, this);
                return nm6Var4;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar2 = lyf.d;
                    j47 j47Var2 = new j47(l47Var, continuation, i2);
                    this.k = 1;
                    if (o8g.K(l47Var, lyfVar2, j47Var2, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q r = l47Var.y().r();
                k47 k47Var3 = new k47(l47Var, 2);
                this.k = 1;
                r.collect(k47Var3, this);
                return nm6Var6;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar3 = lyf.d;
                    j47 j47Var3 = new j47(l47Var, continuation, i3);
                    this.k = 1;
                    if (o8g.K(l47Var, lyfVar3, j47Var3, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                vdr x = l47Var.y().x();
                k47 k47Var4 = new k47(l47Var, 3);
                this.k = 1;
                ((xdr) x).collect(k47Var4, this);
                return nm6Var8;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar4 = lyf.d;
                    j47 j47Var4 = new j47(l47Var, continuation, i4);
                    this.k = 1;
                    if (o8g.K(l47Var, lyfVar4, j47Var4, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i15 = this.k;
                if (i15 != 0) {
                    if (i15 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q f = l47Var.y().f();
                k47 k47Var5 = new k47(l47Var, 4);
                this.k = 1;
                f.collect(k47Var5, this);
                return nm6Var10;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar5 = lyf.d;
                    j47 j47Var5 = new j47(l47Var, continuation, 9);
                    this.k = 1;
                    if (o8g.K(l47Var, lyfVar5, j47Var5, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i17 = this.k;
                if (i17 != 0) {
                    if (i17 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                bf bfVar = l47Var.p;
                if (bfVar == null) {
                    Intrinsics.j("actionReceiver");
                    throw null;
                }
                x0q x0qVar2 = bfVar.a;
                k47 k47Var6 = new k47(l47Var, 5);
                this.k = 1;
                x0qVar2.collect(k47Var6, this);
                return nm6Var12;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar6 = lyf.d;
                    j47 j47Var6 = new j47(l47Var, continuation, 11);
                    this.k = 1;
                    if (o8g.K(l47Var, lyfVar6, j47Var6, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    nc4 nc4Var = new nc4(l47Var.y().s(), false);
                    k47 k47Var7 = new k47(l47Var, 6);
                    this.k = 1;
                    if (nc4Var.collect(k47Var7, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar7 = lyf.d;
                    j47 j47Var7 = new j47(l47Var, continuation, 13);
                    this.k = 1;
                    if (o8g.K(l47Var, lyfVar7, j47Var7, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var16 = nm6.a;
                int i21 = this.k;
                if (i21 != 0) {
                    if (i21 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                u0q j = l47Var.y().j();
                k47 k47Var8 = new k47(l47Var, 7);
                this.k = 1;
                x0q x0qVar3 = (x0q) j;
                x0qVar3.getClass();
                x0q.m(x0qVar3, k47Var8, this);
                return nm6Var16;
            default:
                nm6 nm6Var17 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar8 = lyf.d;
                    j47 j47Var8 = new j47(l47Var, continuation, 15);
                    this.k = 1;
                    if (o8g.K(l47Var, lyfVar8, j47Var8, this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
