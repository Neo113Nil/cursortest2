package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor", f = "AndroidTvInteractor.kt", l = {84, 87, 96}, m = "openAppInternal")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1291y extends cg6 {
    public r a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1291y(r rVar, cg6 cg6Var) {
        super(cg6Var);
        this.c = rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((cg6) this);
    }
}
