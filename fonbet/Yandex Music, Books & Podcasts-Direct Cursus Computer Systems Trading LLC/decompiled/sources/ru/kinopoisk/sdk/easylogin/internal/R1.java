package ru.kinopoisk.sdk.easylogin.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public interface R1 {
    void trackAppInstalledShowed();

    void trackBackClick();

    void trackCloseClick();

    void trackError(@NotNull String str);

    void trackError(@NotNull Throwable th);

    void trackShowed();
}
