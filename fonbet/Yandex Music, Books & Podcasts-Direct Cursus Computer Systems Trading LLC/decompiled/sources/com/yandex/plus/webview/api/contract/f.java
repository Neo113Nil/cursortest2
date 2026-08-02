package com.yandex.plus.webview.api.contract;

import defpackage.k5r;
import defpackage.ouj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements g {
    public final String a;
    public final Object b;
    public final boolean c;

    public f(int i, Object obj, String str, boolean z) {
        z = (i & 4) != 0 ? false : z;
        str.getClass();
        obj.getClass();
        this.a = str;
        this.b = obj;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && Intrinsics.d(this.b, fVar.b) && this.c == fVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Url(key=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", exclusive=");
        return ouj.r(sb, this.c, ", overrideOriginalParam=false)");
    }
}
