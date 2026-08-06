package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706r3 implements T7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6806a;

    /* renamed from: b, reason: collision with root package name */
    public final S7 f6807b;

    public C0706r3(Map<String, String> map, S7 s7) {
        this.f6806a = map;
        this.f6807b = s7;
    }

    public final C0706r3 a(Map<String, String> map, S7 s7) {
        return new C0706r3(map, s7);
    }

    public final Map<String, String> b() {
        return this.f6806a;
    }

    public final S7 c() {
        return this.f6807b;
    }

    public final Map<String, String> d() {
        return this.f6806a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0706r3)) {
            return false;
        }
        C0706r3 c0706r3 = (C0706r3) obj;
        return kotlin.jvm.internal.i.a(this.f6806a, c0706r3.f6806a) && this.f6807b == c0706r3.f6807b;
    }

    public final int hashCode() {
        Map map = this.f6806a;
        return this.f6807b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.f6806a + ", source=" + this.f6807b + ')';
    }

    public static C0706r3 a(C0706r3 c0706r3, Map map, S7 s7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = c0706r3.f6806a;
        }
        if ((i2 & 2) != 0) {
            s7 = c0706r3.f6807b;
        }
        c0706r3.getClass();
        return new C0706r3(map, s7);
    }

    @Override // io.appmetrica.analytics.impl.T7
    public final S7 a() {
        return this.f6807b;
    }
}
