package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.cast.lg.interaction.LgTvInteractor", f = "LgTvInteractor.kt", l = {97, 97}, m = "openAppInternal")
/* loaded from: classes5.dex */
public final class W5 extends cg6 {
    public O5 a;
    public O5 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ O5 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W5(O5 o5, cg6 cg6Var) {
        super(cg6Var);
        this.d = o5;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((cg6) this);
    }
}
