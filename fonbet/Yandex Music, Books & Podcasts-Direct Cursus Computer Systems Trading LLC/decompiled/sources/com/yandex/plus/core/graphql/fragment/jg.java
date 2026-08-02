package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jg {
    public final String a;
    public final String b;
    public final com.yandex.plus.core.graphql.type.q c;

    public jg(String str, String str2, com.yandex.plus.core.graphql.type.q qVar) {
        this.a = str;
        this.b = str2;
        this.c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg)) {
            return false;
        }
        jg jgVar = (jg) obj;
        return Intrinsics.d(this.a, jgVar.a) && Intrinsics.d(this.b, jgVar.b) && this.c == jgVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlaqueLevelElement(widgetId=" + this.a + ", widgetGroupId=" + this.b + ", type=" + this.c + ')';
    }
}
