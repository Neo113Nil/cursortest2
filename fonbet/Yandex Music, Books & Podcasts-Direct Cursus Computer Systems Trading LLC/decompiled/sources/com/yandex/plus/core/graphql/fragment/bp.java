package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bp {
    public final String a;
    public final ap b;

    public bp(String str, ap apVar) {
        str.getClass();
        this.a = str;
        this.b = apVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp)) {
            return false;
        }
        bp bpVar = (bp) obj;
        return Intrinsics.d(this.a, bpVar.a) && Intrinsics.d(this.b, bpVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ap apVar = this.b;
        return hashCode + (apVar == null ? 0 : apVar.hashCode());
    }

    public final String toString() {
        return "TextIconFragment(__typename=" + this.a + ", onTextIconProperties=" + this.b + ')';
    }
}
