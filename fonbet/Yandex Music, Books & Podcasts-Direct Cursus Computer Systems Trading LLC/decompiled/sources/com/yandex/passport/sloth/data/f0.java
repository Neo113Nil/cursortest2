package com.yandex.passport.sloth.data;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 extends r {
    public final com.yandex.passport.sloth.dependencies.e b;
    public final boolean c;

    public f0(com.yandex.passport.sloth.dependencies.e eVar) {
        super(k.Phonish);
        this.b = eVar;
        this.c = true;
    }

    @Override // com.yandex.passport.sloth.data.r
    public final com.yandex.passport.sloth.dependencies.e d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.b, f0Var.b) && this.c == f0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Phonish(properties=");
        sb.append(this.b);
        sb.append(", canGoBack=");
        return dfi.j(sb, this.c, ')');
    }
}
