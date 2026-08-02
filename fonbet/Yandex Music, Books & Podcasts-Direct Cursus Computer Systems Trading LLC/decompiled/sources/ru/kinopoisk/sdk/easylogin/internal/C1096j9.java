package ru.kinopoisk.sdk.easylogin.internal;

import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.j9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1096j9 implements InterfaceC1093j6 {
    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1093j6
    public final void a(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        Timber.INSTANCE.tag(str).d(str2, new Object[0]);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1093j6
    public final void a(@NotNull String str, @NotNull Throwable th) {
        str.getClass();
        th.getClass();
        Timber.INSTANCE.tag(str).e(th);
    }
}
