package com.yandex.plus.home.dailyquests.feature.internal.mappers;

import com.yandex.passport.internal.core.accounts.h;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.g;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ h l;
    public final /* synthetic */ g m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(h hVar, g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = hVar;
        this.m = gVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a(this.l, this.m, continuation, 0);
            default:
                return new a(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((a) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
                y yVar = this.m.d;
                this.k = 1;
                Object b = h.b(this.l, yVar, this);
                return b == nm6Var ? nm6Var : b;
            default:
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
                y yVar2 = this.m.c;
                this.k = 1;
                Object b2 = h.b(this.l, yVar2, this);
                return b2 == nm6Var2 ? nm6Var2 : b2;
        }
    }
}
