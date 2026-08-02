package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.tvauth.scenario.TvAuthScenarioManagerImpl", f = "TvAuthScenarioManagerImpl.kt", l = {24, com.yandex.pulse.metrics.o.LOW_ENTROPY_SOURCE_FIELD_NUMBER, com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER}, m = "startAuthorization")
/* loaded from: classes5.dex */
public final class P9 extends cg6 {
    public J9 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ J9 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P9(J9 j9, cg6 cg6Var) {
        super(cg6Var);
        this.d = j9;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
