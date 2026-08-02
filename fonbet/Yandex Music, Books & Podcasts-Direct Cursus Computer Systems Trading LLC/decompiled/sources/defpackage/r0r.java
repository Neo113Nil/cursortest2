package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class r0r extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ cr l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0r(cr crVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = crVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r0r(this.l, continuation, 0);
            case 1:
                return new r0r(this.l, continuation, 1);
            case 2:
                return new r0r(this.l, continuation, 2);
            case 3:
                return new r0r(this.l, continuation, 3);
            case 4:
                return new r0r(this.l, continuation, 4);
            case 5:
                return new r0r(this.l, continuation, 5);
            case 6:
                return new r0r(this.l, continuation, 6);
            case 7:
                return new r0r(this.l, continuation, 7);
            case 8:
                return new r0r(this.l, continuation, 8);
            case 9:
                return new r0r(this.l, continuation, 9);
            case 10:
                return new r0r(this.l, continuation, 10);
            default:
                return new r0r(this.l, continuation, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((r0r) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                s5d s5dVar = (s5d) this.l.h;
                this.k = 1;
                Object t = s5dVar.t(this);
                return t == nm6Var ? nm6Var : t;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                s5d s5dVar2 = (s5d) this.l.h;
                this.k = 1;
                Object q = s5dVar2.q(this);
                return q == nm6Var2 ? nm6Var2 : q;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SmartSwapPlayerWrapper", "muteVolume()", null);
                    s5d s5dVar3 = (s5d) this.l.h;
                    this.k = 1;
                    if (s5dVar3.i(this) == nm6Var3) {
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
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SmartSwapPlayerWrapper", "pause()", null);
                    s5d s5dVar4 = (s5d) this.l.h;
                    this.k = 1;
                    if (s5dVar4.b(this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SmartSwapPlayerWrapper", "play()", null);
                    s5d s5dVar5 = (s5d) this.l.h;
                    this.k = 1;
                    if (s5dVar5.n(this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 != 0) {
                    if (i6 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                s5d s5dVar6 = (s5d) this.l.h;
                this.k = 1;
                Object r = s5dVar6.r(this);
                return r == nm6Var6 ? nm6Var6 : r;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ssg.a(3, "SmartSwapPlayerWrapper", "release()", null);
                cr crVar = this.l;
                s5d s5dVar7 = (s5d) crVar.h;
                r5d r5dVar = r5d.a;
                this.k = 1;
                Object m = cr.m(crVar, s5dVar7, r5dVar, true, this);
                return m == nm6Var7 ? nm6Var7 : m;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SmartSwapPlayerWrapper", "replay()", null);
                    s5d s5dVar8 = (s5d) this.l.h;
                    this.k = 1;
                    if (s5dVar8.k(this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SmartSwapPlayerWrapper", "restart", null);
                    s5d s5dVar9 = (s5d) this.l.h;
                    this.k = 1;
                    if (s5dVar9.s(this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SmartSwapPlayerWrapper", "stop()", null);
                    s5d s5dVar10 = (s5d) this.l.h;
                    this.k = 1;
                    if (s5dVar10.p(this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SmartSwapPlayerWrapper", "unmuteVolume()", null);
                    s5d s5dVar11 = (s5d) this.l.h;
                    this.k = 1;
                    if (s5dVar11.m(this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var12 = nm6.a;
                int i12 = this.k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                s5d s5dVar12 = (s5d) this.l.h;
                this.k = 1;
                Object x = s5dVar12.x(this);
                return x == nm6Var12 ? nm6Var12 : x;
        }
    }
}
