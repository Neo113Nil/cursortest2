package com.yandex.music.shared.wave.domain.commands;

import defpackage.aur;
import defpackage.kr7;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class c extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ kr7 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kr7 kr7Var = (kr7) obj;
        switch (this.j) {
            case 0:
                c cVar = new c(3, 0, (Continuation) obj3);
                cVar.l = kr7Var;
                return cVar.invokeSuspend(Unit.a);
            case 1:
                c cVar2 = new c(3, 1, (Continuation) obj3);
                cVar2.l = kr7Var;
                return cVar2.invokeSuspend(Unit.a);
            case 2:
                c cVar3 = new c(3, 2, (Continuation) obj3);
                cVar3.l = kr7Var;
                return cVar3.invokeSuspend(Unit.a);
            case 3:
                c cVar4 = new c(3, 3, (Continuation) obj3);
                cVar4.l = kr7Var;
                return cVar4.invokeSuspend(Unit.a);
            default:
                c cVar5 = new c(3, 4, (Continuation) obj3);
                cVar5.l = kr7Var;
                return cVar5.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                kr7 kr7Var = this.l;
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
                this.l = null;
                this.k = 1;
                Object f = kr7Var.f(this);
                return f == nm6Var ? nm6Var : f;
            case 1:
                kr7 kr7Var2 = this.l;
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
                this.l = null;
                this.k = 1;
                Object g = kr7Var2.g(this);
                return g == nm6Var2 ? nm6Var2 : g;
            case 2:
                kr7 kr7Var3 = this.l;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                this.l = null;
                this.k = 1;
                Object t = kr7Var3.t(this);
                return t == nm6Var3 ? nm6Var3 : t;
            case 3:
                kr7 kr7Var4 = this.l;
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                this.l = null;
                this.k = 1;
                Object s = kr7Var4.s(this);
                return s == nm6Var4 ? nm6Var4 : s;
            default:
                kr7 kr7Var5 = this.l;
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                this.l = null;
                this.k = 1;
                Object k = kr7Var5.k(this);
                return k == nm6Var5 ? nm6Var5 : k;
        }
    }
}
