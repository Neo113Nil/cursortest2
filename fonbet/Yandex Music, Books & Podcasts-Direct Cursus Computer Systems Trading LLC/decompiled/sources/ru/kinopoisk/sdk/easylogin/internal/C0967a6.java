package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ern;
import defpackage.u9f;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.a6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0967a6 implements D1<Z5> {

    @NotNull
    public static final C0967a6 a = new C0967a6();

    @NotNull
    public static final Z5 b;

    static {
        Z5.INSTANCE.getClass();
        b = Z5.b;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.D1
    @NotNull
    public final u9f a() {
        return ern.c(Z5.class);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.D1
    public final Z5 b() {
        return b;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.D1
    @NotNull
    public final String getKey() {
        return "tv_interaction_settings_lg";
    }
}
