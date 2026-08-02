package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ern;
import defpackage.u9f;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1288x9;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.y9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1301y9 implements D1<C1288x9.a> {

    @NotNull
    public static final C1301y9 a = new C1301y9();

    @NotNull
    public static final C1288x9.a b;

    static {
        C1288x9.a.INSTANCE.getClass();
        b = C1288x9.a.u;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.D1
    @NotNull
    public final u9f a() {
        return ern.c(C1288x9.a.class);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.D1
    public final C1288x9.a b() {
        return b;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.D1
    @NotNull
    public final String getKey() {
        return "tv_auth_config";
    }
}
