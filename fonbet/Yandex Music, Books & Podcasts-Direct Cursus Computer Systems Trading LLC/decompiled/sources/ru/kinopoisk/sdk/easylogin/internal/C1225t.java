package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor", f = "AndroidTvInteractor.kt", l = {188}, m = "connectKinopoiskCast")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1225t extends cg6 {
    public r a;
    public String b;
    public r c;
    public /* synthetic */ Object d;
    public final /* synthetic */ r e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225t(r rVar, cg6 cg6Var) {
        super(cg6Var);
        this.e = rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        r rVar = this.e;
        int i = r.o;
        return rVar.a((String) null, this);
    }
}
