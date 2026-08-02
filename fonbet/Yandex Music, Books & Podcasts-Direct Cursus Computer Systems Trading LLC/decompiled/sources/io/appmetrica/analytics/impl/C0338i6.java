package io.appmetrica.analytics.impl;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.i6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0338i6 {
    public final String a;

    public C0338i6(@NotNull String str) {
        this.a = str;
    }

    public static C0338i6 a(C0338i6 c0338i6, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c0338i6.a;
        }
        c0338i6.getClass();
        return new C0338i6(str);
    }

    @NotNull
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0338i6) && Intrinsics.d(this.a, ((C0338i6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return dfi.i(new StringBuilder("ConstantModuleEntryPointProvider(className="), this.a, ')');
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final C0338i6 a(@NotNull String str) {
        return new C0338i6(str);
    }
}
