package ru.kinopoisk.sdk.easylogin.internal;

import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.h6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1065h6 implements InterfaceC1188q3 {
    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1188q3
    public final void a(@NotNull Throwable th) {
        th.getClass();
        Timber.INSTANCE.tag("ErrorReporter").e(th);
    }
}
