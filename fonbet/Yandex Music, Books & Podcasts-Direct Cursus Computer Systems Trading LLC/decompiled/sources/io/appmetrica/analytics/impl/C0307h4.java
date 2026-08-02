package io.appmetrica.analytics.impl;

import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.h4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0307h4 implements V8 {
    public final C0278g4 a;
    public final List b;

    public C0307h4(@NotNull C0278g4 c0278g4, @NotNull List<C0278g4> list) {
        this.a = c0278g4;
        this.b = list;
    }

    public static C0307h4 a(C0307h4 c0307h4, C0278g4 c0278g4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            c0278g4 = c0307h4.a;
        }
        if ((i & 2) != 0) {
            list = c0307h4.b;
        }
        c0307h4.getClass();
        return new C0307h4(c0278g4, list);
    }

    @Override // io.appmetrica.analytics.impl.V8
    public final Object b() {
        return this.a;
    }

    @NotNull
    public final C0278g4 c() {
        return this.a;
    }

    @NotNull
    public final List<C0278g4> d() {
        return this.b;
    }

    @NotNull
    public final C0278g4 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0307h4)) {
            return false;
        }
        C0307h4 c0307h4 = (C0307h4) obj;
        return Intrinsics.d(this.a, c0307h4.a) && Intrinsics.d(this.b, c0307h4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ClidsInfo(chosen=");
        sb.append(this.a);
        sb.append(", candidates=");
        return eta.h(sb, this.b, ')');
    }

    @NotNull
    public final C0307h4 a(@NotNull C0278g4 c0278g4, @NotNull List<C0278g4> list) {
        return new C0307h4(c0278g4, list);
    }

    @Override // io.appmetrica.analytics.impl.V8
    @NotNull
    public final List<C0278g4> a() {
        return this.b;
    }
}
