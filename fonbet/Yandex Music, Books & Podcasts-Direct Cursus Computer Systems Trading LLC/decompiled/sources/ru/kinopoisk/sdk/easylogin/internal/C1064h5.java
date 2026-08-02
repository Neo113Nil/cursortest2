package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.dfi;
import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.h5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1064h5 {
    public final int a;
    public final int b;
    public final Integer c;

    public C1064h5(int i, int i2, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1064h5)) {
            return false;
        }
        C1064h5 c1064h5 = (C1064h5) obj;
        return this.a == c1064h5.a && this.b == c1064h5.b && Intrinsics.d(this.c, c1064h5.c);
    }

    public final int hashCode() {
        int a = f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        return a + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        Integer num = this.c;
        StringBuilder l = dfi.l("InstructionItem(index=", i, i2, ", textRes=", ", imageRes=");
        l.append(num);
        l.append(")");
        return l.toString();
    }
}
