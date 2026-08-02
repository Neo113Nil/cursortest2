package ru.kinopoisk.sdk.easylogin.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public interface Dc {
    void trackBackClick();

    void trackCloseClick();

    void trackError(@NotNull String str);

    void trackError(@NotNull Throwable th);

    void trackShowed();
}
