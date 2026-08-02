package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.w4f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class K7 {

    @NotNull
    public final w4f a;

    @NotNull
    public final M1 b;

    public K7(@NotNull w4f w4fVar, @NotNull M1 m1) {
        w4fVar.getClass();
        m1.getClass();
        this.a = w4fVar;
        this.b = m1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K7)) {
            return false;
        }
        K7 k7 = (K7) obj;
        return Intrinsics.d(this.a, k7.a) && Intrinsics.d(this.b, k7.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "RawConfigValue(rawValue=" + this.a + ", meta=" + this.b + ")";
    }
}
