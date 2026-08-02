package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.qgg;
import defpackage.ssa;
import defpackage.we7;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.yd5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@we7(c = "ru.kinopoisk.tvauth.scenario.TvAuthScenarioManagerImpl$awaitAuthState$authProcessState$2", f = "TvAuthScenarioManagerImpl.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class M9 extends aur implements Function2<Throwable, Continuation<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ J9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M9(J9 j9, Continuation<? super M9> continuation) {
        super(2, continuation);
        this.b = j9;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new M9(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new M9(this.b, (Continuation) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            C1288x9 c1288x9 = this.b.c;
            c1288x9.getClass();
            msa msaVar = nsa.b;
            long N = yd5.N(c1288x9.a().o, ssa.MILLISECONDS);
            this.a = 1;
            if (y2x.p(N, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Boolean.TRUE;
    }
}
