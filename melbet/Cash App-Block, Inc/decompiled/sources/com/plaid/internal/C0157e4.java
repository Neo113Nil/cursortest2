package com.plaid.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.e4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0157e4 extends X {
    public final String b;
    public final Map<String, String> c;
    public final int d;

    public C0157e4(Map map, String str) {
        str.getClass();
        map.getClass();
        this.b = str;
        this.c = map;
        this.d = 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0157e4)) {
            return false;
        }
        C0157e4 c0157e4 = (C0157e4) obj;
        return Intrinsics.areEqual(this.b, c0157e4.b) && Intrinsics.areEqual(this.c, c0157e4.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "NavigationBreadCrumb(message=" + this.b + ", data=" + this.c + ")";
    }
}
