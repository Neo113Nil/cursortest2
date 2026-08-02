package com.yandex.plus.core.graphql;

import com.yandex.plus.core.graphql.fragment.pl;

/* loaded from: classes4.dex */
public final class f2 {
    public final String a;
    public final pl b;

    public f2(String str, pl plVar) {
        this.a = str;
        this.b = plVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return this.a.equals(f2Var.a) && this.b.equals(f2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Configuration(__typename=" + this.a + ", popupConfigurationFragment=" + this.b + ')';
    }
}
