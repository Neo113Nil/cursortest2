package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class go {
    public final String a;
    public final eo b;

    public go(String str, eo eoVar) {
        str.getClass();
        this.a = str;
        this.b = eoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        return Intrinsics.d(this.a, goVar.a) && Intrinsics.d(this.b, goVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eo eoVar = this.b;
        return hashCode + (eoVar == null ? 0 : eoVar.hashCode());
    }

    public final String toString() {
        return "StyledTextFragment(__typename=" + this.a + ", onStyledTextProperties=" + this.b + ')';
    }
}
