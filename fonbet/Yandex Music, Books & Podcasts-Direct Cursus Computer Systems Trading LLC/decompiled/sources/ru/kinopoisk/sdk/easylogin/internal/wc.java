package ru.kinopoisk.sdk.easylogin.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class wc {

    @NotNull
    public final Vb a;

    @NotNull
    public final yc b;
    public final Integer c;

    public wc(@NotNull Vb vb, @NotNull yc ycVar, Integer num) {
        vb.getClass();
        ycVar.getClass();
        this.a = vb;
        this.b = ycVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc)) {
            return false;
        }
        wc wcVar = (wc) obj;
        return Intrinsics.d(this.a, wcVar.a) && Intrinsics.d(this.b, wcVar.b) && Intrinsics.d(this.c, wcVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public final String toString() {
        return "UiKitThemeParameters(colors=" + this.a + ", typography=" + this.b + ", logoResource=" + this.c + ")";
    }
}
