package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.vdr;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public interface F1 {

    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        Uninitialized,
        /* JADX INFO: Fake field, exist only in values array */
        Updating,
        Snapshot
    }

    @NotNull
    vdr getStateFlow();

    @NotNull
    <T> K1<T> getValue(@NotNull D1<T> d1);
}
