package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r {
    public final String a;
    public final q b;

    public r(String str, q qVar) {
        str.getClass();
        this.a = str;
        this.b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.a, rVar.a) && Intrinsics.d(this.b, rVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q qVar = this.b;
        return hashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    public final String toString() {
        return "AttributedTextItemFragment(__typename=" + this.a + ", onTextProperties=" + this.b + ')';
    }
}
