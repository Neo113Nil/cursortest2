package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.tvauth.scenario.TvAuthScenarioManagerImpl", f = "TvAuthScenarioManagerImpl.kt", l = {71, 75}, m = "confirmUserCode")
/* loaded from: classes5.dex */
public final class N9 extends cg6 {
    public J9 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ J9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N9(J9 j9, cg6 cg6Var) {
        super(cg6Var);
        this.c = j9;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
