package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ern;
import defpackage.u9f;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.u8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1248u8 implements D1<C1234t8> {

    @NotNull
    public static final C1248u8 a = new C1248u8();

    @NotNull
    public static final C1234t8 b;

    static {
        C1234t8.INSTANCE.getClass();
        b = C1234t8.b;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.D1
    @NotNull
    public final u9f a() {
        return ern.c(C1234t8.class);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.D1
    public final C1234t8 b() {
        return b;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.D1
    @NotNull
    public final String getKey() {
        return "tv_interaction_settings_samsung";
    }
}
