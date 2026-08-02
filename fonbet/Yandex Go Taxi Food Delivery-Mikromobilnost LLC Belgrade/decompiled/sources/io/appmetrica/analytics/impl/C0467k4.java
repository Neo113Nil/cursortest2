package io.appmetrica.analytics.impl;

import defpackage.jl40;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.k4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0467k4 implements InterfaceC0299e9 {
    public final Map a;
    public final EnumC0271d9 b;

    public C0467k4(Map<String, String> map, EnumC0271d9 enumC0271d9) {
        this.a = map;
        this.b = enumC0271d9;
    }

    public static C0467k4 a(C0467k4 c0467k4, Map map, EnumC0271d9 enumC0271d9, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c0467k4.a;
        }
        if ((i & 2) != 0) {
            enumC0271d9 = c0467k4.b;
        }
        c0467k4.getClass();
        return new C0467k4(map, enumC0271d9);
    }

    public final Map<String, String> b() {
        return this.a;
    }

    public final EnumC0271d9 c() {
        return this.b;
    }

    public final Map<String, String> d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0467k4)) {
            return false;
        }
        C0467k4 c0467k4 = (C0467k4) obj;
        return jl40.l(this.a, c0467k4.a) && this.b == c0467k4.b;
    }

    public final int hashCode() {
        Map map = this.a;
        return this.b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.a + ", source=" + this.b + ')';
    }

    public final C0467k4 a(Map<String, String> map, EnumC0271d9 enumC0271d9) {
        return new C0467k4(map, enumC0271d9);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0299e9
    public final EnumC0271d9 a() {
        return this.b;
    }
}
