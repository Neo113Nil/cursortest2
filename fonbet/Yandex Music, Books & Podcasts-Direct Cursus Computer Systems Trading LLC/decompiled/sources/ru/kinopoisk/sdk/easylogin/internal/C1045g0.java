package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.irn;
import defpackage.jch;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.BuildConfig;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1045g0 {
    public C1045g0() {
        Regex regex = (Regex) C1059h0.a.getValue();
        irn irnVar = Regex.b;
        jch b = regex.b(BuildConfig.VERSION_NAME);
        if (b != null) {
            b.getValue();
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C1045g0);
    }

    public final int hashCode() {
        return Long.hashCode(190538L) + 1844400479;
    }

    @NotNull
    public final String toString() {
        return "BuildPackageProvider(packageName=ru.kinopoisk.sdk.easylogin, readableVersionName=0.0.13, versionCode=190538)";
    }
}
