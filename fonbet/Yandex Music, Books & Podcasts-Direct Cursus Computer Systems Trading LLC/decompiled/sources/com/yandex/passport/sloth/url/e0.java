package com.yandex.passport.sloth.url;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 extends y {
    public final String b;
    public final boolean c;

    public e0(String str, boolean z) {
        str.getClass();
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.b, e0Var.b) && this.c == e0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalUrl(url=");
        com.appsflyer.internal.k.y(sb, this.b, ", cancel=");
        return dfi.j(sb, this.c, ')');
    }
}
