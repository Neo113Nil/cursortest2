package io.appmetrica.analytics.impl;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes9.dex */
public final class We {
    public final String a;
    public final boolean b;

    public We(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof We)) {
            return false;
        }
        We we = (We) obj;
        return jl40.l(this.a, we.a) && this.b == we.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModuleStatus(moduleName=");
        sb.append(this.a);
        sb.append(", loaded=");
        return unr0.u(sb, this.b, ')');
    }
}
