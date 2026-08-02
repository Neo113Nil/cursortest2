package ru.kinopoisk.sdk.easylogin.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.z7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1312z7 {

    @NotNull
    public final Throwable a;

    public C1312z7(@NotNull Throwable th) {
        th.getClass();
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1312z7) && Intrinsics.d(this.a, ((C1312z7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "Error(exception=" + this.a + ")";
    }
}
