package com.yandex.passport.sloth.data;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 extends r {
    public final com.yandex.passport.sloth.dependencies.e b;
    public final boolean c;
    public final a d;
    public final String e;

    public i0(com.yandex.passport.sloth.dependencies.e eVar, boolean z, a aVar, String str) {
        super(k.Registration);
        this.b = eVar;
        this.c = z;
        this.d = aVar;
        this.e = str;
    }

    @Override // com.yandex.passport.sloth.data.r
    public final com.yandex.passport.sloth.dependencies.e d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        boolean d;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (!Intrinsics.d(this.b, i0Var.b) || this.c != i0Var.c || !Intrinsics.d(this.d, i0Var.d)) {
            return false;
        }
        String str = i0Var.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str == null) {
                d = true;
            }
            d = false;
        } else {
            if (str != null) {
                d = Intrinsics.d(str2, str);
            }
            d = false;
        }
        return d;
    }

    public final int hashCode() {
        int e = k5r.e(this.b.hashCode() * 31, 31, this.c);
        a aVar = this.d;
        int hashCode = (e + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Registration(properties=");
        sb.append(this.b);
        sb.append(", canGoBack=");
        sb.append(this.c);
        sb.append(", accountForProfile=");
        sb.append(this.d);
        sb.append(", customUrl=");
        String str = this.e;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.common.url.b.m(str)));
        sb.append(')');
        return sb.toString();
    }
}
