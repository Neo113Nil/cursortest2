package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor", f = "AndroidTvInteractor.kt", l = {266}, m = "ensureAppIsAccessible")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1252v extends cg6 {
    public /* synthetic */ Object a;
    public final /* synthetic */ r b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1252v(r rVar, cg6 cg6Var) {
        super(cg6Var);
        this.b = rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        r rVar = this.b;
        int i = r.o;
        return rVar.b(this);
    }
}
