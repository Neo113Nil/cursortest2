package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Cc {
    public final boolean a;

    public Cc(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cc) && this.a == ((Cc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return vz1.q("UpdateCodeState(isRequestingCode=", ")", this.a);
    }
}
