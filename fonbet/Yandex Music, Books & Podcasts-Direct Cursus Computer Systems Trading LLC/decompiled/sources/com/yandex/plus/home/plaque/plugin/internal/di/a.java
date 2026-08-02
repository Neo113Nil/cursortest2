package com.yandex.plus.home.plaque.plugin.internal.di;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.featureflags.e;
import com.yandex.plus.home.t;
import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class a extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ t l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(t tVar, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = tVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a(this.l, continuation, 0);
            default:
                return new a(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((a) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object d = this.l.d(this);
                    return d == nm6Var ? nm6Var : d;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                t tVar = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (tVar.e(this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(r1.l(((e) tVar.b.q).w));
        }
    }
}
