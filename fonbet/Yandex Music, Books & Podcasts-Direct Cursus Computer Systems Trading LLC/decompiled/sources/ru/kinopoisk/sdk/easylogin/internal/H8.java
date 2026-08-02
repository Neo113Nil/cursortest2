package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class H8 implements M1 {

    @NotNull
    public final String b;
    public final int c;

    public H8(@NotNull String str, int i) {
        str.getClass();
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H8)) {
            return false;
        }
        H8 h8 = (H8) obj;
        return Intrinsics.d(this.b, h8.b) && this.c == h8.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + C1292y0.a(this.b, -1012076427, 31);
    }

    @NotNull
    public final String toString() {
        return k5r.l("dataSourceSlug=exps-cache, expName=", this.c, this.b, ", testId=");
    }
}
