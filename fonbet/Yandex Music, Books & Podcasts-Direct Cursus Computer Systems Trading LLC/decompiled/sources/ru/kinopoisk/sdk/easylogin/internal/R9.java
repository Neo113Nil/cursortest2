package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.tvauth.scenario.TvAuthScenarioManagerImpl", f = "TvAuthScenarioManagerImpl.kt", l = {106}, m = "tryOpenTvApp")
/* loaded from: classes5.dex */
public final class R9 extends cg6 {
    public /* synthetic */ Object a;
    public final /* synthetic */ J9 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R9(J9 j9, cg6 cg6Var) {
        super(cg6Var);
        this.b = j9;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
