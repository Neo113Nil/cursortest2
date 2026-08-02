package io.appmetrica.analytics.impl;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0496l4 implements InterfaceC0184a9 {
    public final C0467k4 a;
    public final List b;

    public C0496l4(C0467k4 c0467k4, List<C0467k4> list) {
        this.a = c0467k4;
        this.b = list;
    }

    public static C0496l4 a(C0496l4 c0496l4, C0467k4 c0467k4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            c0467k4 = c0496l4.a;
        }
        if ((i & 2) != 0) {
            list = c0496l4.b;
        }
        c0496l4.getClass();
        return new C0496l4(c0467k4, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0184a9
    public final Object b() {
        return this.a;
    }

    public final C0467k4 c() {
        return this.a;
    }

    public final List<C0467k4> d() {
        return this.b;
    }

    public final C0467k4 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0496l4)) {
            return false;
        }
        C0496l4 c0496l4 = (C0496l4) obj;
        return jl40.l(this.a, c0496l4.a) && jl40.l(this.b, c0496l4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClidsInfo(chosen=");
        sb.append(this.a);
        sb.append(", candidates=");
        return unr0.t(sb, this.b, ')');
    }

    public final C0496l4 a(C0467k4 c0467k4, List<C0467k4> list) {
        return new C0496l4(c0467k4, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0184a9
    public final List<C0467k4> a() {
        return this.b;
    }
}
