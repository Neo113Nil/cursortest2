package com.yandex.plus.home;

import defpackage.aur;
import defpackage.fr4;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class o extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ t l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(t tVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = tVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new o(this.l, continuation, 0);
            case 1:
                return new o(this.l, continuation, 1);
            case 2:
                return new o(this.l, continuation, 2);
            case 3:
                return new o(this.l, continuation, 3);
            case 4:
                return new o(this.l, continuation, 4);
            case 5:
                return new o(this.l, continuation, 5);
            case 6:
                return new o(this.l, continuation, 6);
            case 7:
                return new o(this.l, continuation, 7);
            case 8:
                return new o(this.l, continuation, 8);
            case 9:
                return new o(this.l, continuation, 9);
            default:
                return new o(this.l, continuation, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((o) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.graphql.plusstate.f b = this.l.f.b();
                    this.k = 1;
                    if (b.b() == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.graphql.panel.g gVar = (com.yandex.plus.home.graphql.panel.g) this.l.f.i.getValue();
                    this.k = 1;
                    if (gVar.c() == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.graphql.user.e eVar = (com.yandex.plus.home.graphql.user.e) this.l.f.j.getValue();
                    this.k = 1;
                    if (eVar.a() == nm6Var4) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.experiments.impl.providers.h a = this.l.f.a();
                    this.k = 1;
                    Object j0 = x97.y(a.a, a.b, null, new fr4(a, (Continuation) null, 13), 2).j0(this);
                    if (j0 != nm6Var5) {
                        j0 = Unit.a;
                    }
                    if (j0 == nm6Var5) {
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.graphql.plusstate.f b2 = this.l.f.b();
                    this.k = 1;
                    if (b2.b() == nm6Var6) {
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.graphql.user.e eVar2 = (com.yandex.plus.home.graphql.user.e) this.l.f.j.getValue();
                    this.k = 1;
                    if (eVar2.a() == nm6Var7) {
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.graphql.panel.g gVar2 = (com.yandex.plus.home.graphql.panel.g) this.l.f.i.getValue();
                    this.k = 1;
                    if (gVar2.c() == nm6Var8) {
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.graphql.configuration.j jVar = (com.yandex.plus.home.graphql.configuration.j) this.l.f.u.getValue();
                    this.k = 1;
                    Object j02 = x97.y(jVar.e, jVar.f, null, new fr4(jVar, (Continuation) null, 15), 2).j0(this);
                    if (j02 != nm6Var9) {
                        j02 = Unit.a;
                    }
                    if (j02 == nm6Var9) {
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.experiments.impl.providers.h a2 = this.l.f.a();
                    this.k = 1;
                    if (a2.e(this) == nm6Var10) {
                    }
                } else if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                }
                break;
            default:
                nm6 nm6Var11 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.graphql.configuration.j jVar2 = (com.yandex.plus.home.graphql.configuration.j) this.l.f.u.getValue();
                    this.k = 1;
                    if (jVar2.b(this) == nm6Var11) {
                    }
                } else if (i11 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                }
                break;
        }
        return Unit.a;
    }
}
