package io.appmetrica.analytics.impl;

import defpackage.b64;
import defpackage.jl40;

/* renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0498l6 {
    public final String a;

    public C0498l6(String str) {
        this.a = str;
    }

    public static C0498l6 a(C0498l6 c0498l6, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c0498l6.a;
        }
        c0498l6.getClass();
        return new C0498l6(str);
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0498l6) && jl40.l(this.a, ((C0498l6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ConstantModuleEntryPointProvider(className="), this.a, ')');
    }

    public final C0498l6 a(String str) {
        return new C0498l6(str);
    }

    public final String a() {
        return this.a;
    }
}
