package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.tvauth.scenario.TvAuthScenarioManagerImpl", f = "TvAuthScenarioManagerImpl.kt", l = {144, 150}, m = "awaitAuthState")
/* loaded from: classes5.dex */
public final class K9 extends cg6 {
    public J9 a;
    public C1152n9 b;
    public Function1 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ J9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K9(J9 j9, cg6 cg6Var) {
        super(cg6Var);
        this.e = j9;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        J9 j9 = this.e;
        int i = J9.g;
        return j9.a(null, null, this);
    }
}
