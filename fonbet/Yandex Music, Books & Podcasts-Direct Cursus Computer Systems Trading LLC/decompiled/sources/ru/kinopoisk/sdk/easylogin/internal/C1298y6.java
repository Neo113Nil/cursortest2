package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.tvauth.mock.MockTvInteractor", f = "MockTvInteractor.kt", l = {82}, m = "openAppInternal")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.y6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1298y6 extends cg6 {
    public C1272w6 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1272w6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1298y6(C1272w6 c1272w6, cg6 cg6Var) {
        super(cg6Var);
        this.c = c1272w6;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((cg6) this);
    }
}
