package defpackage;

import com.yandex.passport.api.a1;
import com.yandex.passport.api.b1;
import com.yandex.passport.api.c1;
import com.yandex.passport.api.d1;
import com.yandex.passport.api.e0;
import com.yandex.passport.api.exception.c;
import com.yandex.passport.api.exception.i;
import com.yandex.passport.api.f0;
import com.yandex.passport.api.p;
import com.yandex.passport.api.r;
import com.yandex.passport.api.s;
import com.yandex.passport.api.t;
import com.yandex.passport.api.u;
import com.yandex.passport.api.v;
import com.yandex.passport.api.w;
import com.yandex.passport.api.z0;
import com.yandex.passport.internal.entities.m;
import com.yandex.passport.internal.ui.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wkc extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ x0q l;
    public /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wkc(x0q x0qVar, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.l = x0qVar;
        this.m = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                wkc wkcVar = new wkc(this.l, continuation);
                wkcVar.m = obj;
                return wkcVar;
            case 1:
                return new wkc(this.l, continuation, this.m, 1);
            case 2:
                return new wkc(this.l, continuation, this.m, 2);
            case 3:
                return new wkc(this.l, continuation, this.m, 3);
            case 4:
                return new wkc(this.l, continuation, this.m, 4);
            case 5:
                return new wkc(this.l, continuation, this.m, 5);
            case 6:
                return new wkc(this.l, continuation, this.m, 6);
            case 7:
                return new wkc(this.l, continuation, this.m, 7);
            case 8:
                return new wkc(this.l, continuation, this.m, 8);
            case 9:
                return new wkc(this.l, continuation, this.m, 9);
            case 10:
                return new wkc(this.l, continuation, this.m, 10);
            case 11:
                return new wkc(this.l, continuation, this.m, 11);
            case 12:
                return new wkc(this.l, continuation, this.m, 12);
            case 13:
                return new wkc(this.l, continuation, this.m, 13);
            default:
                return new wkc(this.l, continuation, this.m, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((wkc) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        Object obj2;
        Object t7oVar2;
        Object t7oVar3;
        Object t7oVar4;
        Object t7oVar5;
        int i = this.j;
        s sVar = s.a;
        p pVar = p.a;
        x0q x0qVar = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    wjc wjcVar = new wjc((ltm) this.m, 2);
                    this.k = 1;
                    x0qVar.collect(wjcVar, this);
                    break;
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    z7o z7oVar = new z7o(this.m);
                    this.k = 1;
                    if (x0qVar.emit(z7oVar, this) == nm6Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    z7o z7oVar2 = new z7o(this.m);
                    this.k = 1;
                    if (x0qVar.emit(z7oVar2, this) == nm6Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    Object obj3 = this.m;
                    this.k = 1;
                    if (x0qVar.emit(obj3, this) == nm6Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    v vVar = (v) this.m;
                    if (!Intrinsics.d(vVar, pVar)) {
                        if (!(vVar instanceof r)) {
                            if (!Intrinsics.d(vVar, sVar)) {
                                if (!(vVar instanceof t)) {
                                    if (!(vVar instanceof u)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        r7o r7oVar = z7o.b;
                                        t7oVar = new t7o(new com.yandex.passport.api.exception.t("OpenUrl"));
                                    }
                                } else {
                                    r7o r7oVar2 = z7o.b;
                                    t tVar = (t) vVar;
                                    t7oVar = new m(a.D(tVar.a), tVar.c, tVar.d);
                                }
                            } else {
                                r7o r7oVar3 = z7o.b;
                                t7oVar = new t7o(new c());
                            }
                        } else {
                            r7o r7oVar4 = z7o.b;
                            t7oVar = new t7o(((r) vVar).a);
                        }
                    } else {
                        r7o r7oVar5 = z7o.b;
                        t7oVar = new t7o(new i(3));
                    }
                    z7o z7oVar3 = new z7o(t7oVar);
                    this.k = 1;
                    if (x0qVar.emit(z7oVar3, this) == nm6Var5) {
                        break;
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    Object obj4 = this.m;
                    this.k = 1;
                    if (x0qVar.emit(obj4, this) == nm6Var6) {
                        break;
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    d1 d1Var = (d1) this.m;
                    if (Intrinsics.d(d1Var, z0.a)) {
                        r7o r7oVar6 = z7o.b;
                        obj2 = Boolean.FALSE;
                    } else {
                        if (!(d1Var instanceof a1)) {
                            if (!Intrinsics.d(d1Var, b1.a)) {
                                if (!Intrinsics.d(d1Var, c1.a)) {
                                    b6e.s();
                                    break;
                                } else {
                                    r7o r7oVar7 = z7o.b;
                                    obj2 = Boolean.TRUE;
                                }
                            } else {
                                r7o r7oVar8 = z7o.b;
                                t7oVar2 = new t7o(new c());
                            }
                        } else {
                            r7o r7oVar9 = z7o.b;
                            t7oVar2 = new t7o(((a1) d1Var).a);
                        }
                        obj2 = t7oVar2;
                    }
                    z7o z7oVar4 = new z7o(obj2);
                    this.k = 1;
                    if (x0qVar.emit(z7oVar4, this) == nm6Var7) {
                        break;
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    Object obj5 = this.m;
                    this.k = 1;
                    if (x0qVar.emit(obj5, this) == nm6Var8) {
                        break;
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    v vVar2 = (v) this.m;
                    if (!Intrinsics.d(vVar2, pVar)) {
                        if (!(vVar2 instanceof r)) {
                            if (!Intrinsics.d(vVar2, sVar)) {
                                if (!(vVar2 instanceof t)) {
                                    if (!(vVar2 instanceof u)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        r7o r7oVar10 = z7o.b;
                                        t7oVar3 = new t7o(new com.yandex.passport.api.exception.t("OpenUrl"));
                                    }
                                } else {
                                    t7oVar3 = ((t) vVar2).e;
                                    if (t7oVar3 != null) {
                                        r7o r7oVar11 = z7o.b;
                                    } else {
                                        r7o r7oVar12 = z7o.b;
                                        t7oVar3 = new t7o(new c());
                                    }
                                }
                            } else {
                                r7o r7oVar13 = z7o.b;
                                t7oVar3 = new t7o(new c());
                            }
                        } else {
                            r7o r7oVar14 = z7o.b;
                            t7oVar3 = new t7o(((r) vVar2).a);
                        }
                    } else {
                        r7o r7oVar15 = z7o.b;
                        t7oVar3 = new t7o(new i(3));
                    }
                    z7o z7oVar5 = new z7o(t7oVar3);
                    this.k = 1;
                    if (x0qVar.emit(z7oVar5, this) == nm6Var9) {
                        break;
                    }
                } else if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    Object obj6 = this.m;
                    this.k = 1;
                    if (x0qVar.emit(obj6, this) == nm6Var10) {
                        break;
                    }
                } else if (i11 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    v vVar3 = (v) this.m;
                    if (!Intrinsics.d(vVar3, pVar)) {
                        if (!(vVar3 instanceof r)) {
                            if (!Intrinsics.d(vVar3, sVar)) {
                                if (!(vVar3 instanceof t)) {
                                    if (!(vVar3 instanceof u)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        r7o r7oVar16 = z7o.b;
                                        t7oVar4 = new t7o(new com.yandex.passport.api.exception.t("OpenUrl"));
                                    }
                                } else {
                                    r7o r7oVar17 = z7o.b;
                                    t tVar2 = (t) vVar3;
                                    t7oVar4 = new m(a.D(tVar2.a), tVar2.c, tVar2.d);
                                }
                            } else {
                                r7o r7oVar18 = z7o.b;
                                t7oVar4 = new t7o(new c());
                            }
                        } else {
                            r7o r7oVar19 = z7o.b;
                            t7oVar4 = new t7o(((r) vVar3).a);
                        }
                    } else {
                        r7o r7oVar20 = z7o.b;
                        t7oVar4 = new t7o(new i(3));
                    }
                    z7o z7oVar6 = new z7o(t7oVar4);
                    this.k = 1;
                    if (x0qVar.emit(z7oVar6, this) == nm6Var11) {
                        break;
                    }
                } else if (i12 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    Object obj7 = this.m;
                    this.k = 1;
                    if (x0qVar.emit(obj7, this) == nm6Var12) {
                        break;
                    }
                } else if (i13 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    v vVar4 = (v) this.m;
                    if (!Intrinsics.d(vVar4, pVar)) {
                        if (!(vVar4 instanceof r)) {
                            if (!Intrinsics.d(vVar4, sVar)) {
                                if (!(vVar4 instanceof t)) {
                                    if (!(vVar4 instanceof u)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        r7o r7oVar21 = z7o.b;
                                        t7oVar5 = new t7o(new com.yandex.passport.api.exception.t("OpenUrl"));
                                    }
                                } else {
                                    r7o r7oVar22 = z7o.b;
                                    t tVar3 = (t) vVar4;
                                    t7oVar5 = new w(new m(a.D(tVar3.a), tVar3.c, tVar3.d));
                                }
                            } else {
                                r7o r7oVar23 = z7o.b;
                                t7oVar5 = new t7o(new c());
                            }
                        } else {
                            r7o r7oVar24 = z7o.b;
                            t7oVar5 = new t7o(((r) vVar4).a);
                        }
                    } else {
                        r7o r7oVar25 = z7o.b;
                        t7oVar5 = new t7o(new i(3));
                    }
                    z7o z7oVar7 = new z7o(t7oVar5);
                    this.k = 1;
                    if (x0qVar.emit(z7oVar7, this) == nm6Var13) {
                        break;
                    }
                } else if (i14 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    Object obj8 = this.m;
                    this.k = 1;
                    if (x0qVar.emit(obj8, this) == nm6Var14) {
                        break;
                    }
                } else if (i15 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var15 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    Boolean valueOf = Boolean.valueOf(((f0) this.m) instanceof e0);
                    this.k = 1;
                    if (x0qVar.emit(valueOf, this) == nm6Var15) {
                        break;
                    }
                } else if (i16 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkc(x0q x0qVar, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.l = x0qVar;
    }
}
