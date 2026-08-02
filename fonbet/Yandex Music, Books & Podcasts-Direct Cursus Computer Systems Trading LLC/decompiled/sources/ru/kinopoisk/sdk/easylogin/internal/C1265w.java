package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.we7;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;

@we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor", f = "AndroidTvInteractor.kt", l = {127, 128, 134}, m = "executeWithResult")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1265w<T> extends cg6 {
    public r a;
    public C1004d1 b;
    public Type c;
    public /* synthetic */ Object d;
    public final /* synthetic */ r e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265w(r rVar, cg6 cg6Var) {
        super(cg6Var);
        this.e = rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((C1004d1) null, (Type) null, this);
    }
}
