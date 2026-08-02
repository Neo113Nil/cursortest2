package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class en {
    public final String a;
    public final fn b;
    public final String c;

    public en(String str, fn fnVar, String str2) {
        this.a = str;
        this.b = fnVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en)) {
            return false;
        }
        en enVar = (en) obj;
        return this.a.equals(enVar.a) && this.b.equals(enVar.b) && Intrinsics.d(this.c, enVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Background(color=");
        sb.append(this.a);
        sb.append(", colors=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        return dfi.i(sb, this.c, ')');
    }
}
