package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.f1d;
import defpackage.w4f;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.y3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1295y3 {

    @NotNull
    public final String a;
    public final int b;

    @NotNull
    public final Map<String, w4f> c;

    /* JADX WARN: Multi-variable type inference failed */
    public C1295y3(@NotNull String str, int i, @NotNull Map<String, ? extends w4f> map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = i;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1295y3)) {
            return false;
        }
        C1295y3 c1295y3 = (C1295y3) obj;
        return Intrinsics.d(this.a, c1295y3.a) && this.b == c1295y3.b && Intrinsics.d(this.c, c1295y3.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.a;
        int i = this.b;
        Map<String, w4f> map = this.c;
        StringBuilder l = f1d.l(i, "Experiment(name=", str, ", testId=", ", values=");
        l.append(map);
        l.append(")");
        return l.toString();
    }
}
