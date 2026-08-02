package ru.kinopoisk.sdk.easylogin.internal;

import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1201r3;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1184q {
    @NotNull
    C1201r3.e getCastErrorType(@NotNull Throwable th);

    @NotNull
    String getErrorMessage(@NotNull Throwable th);

    @NotNull
    String getErrorTitle(@NotNull Throwable th);
}
