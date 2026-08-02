package com.yandex.plus.webview.api.contract;

import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements g {
    public final String a;
    public final Object b;

    public e(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.a, eVar.a) && Intrinsics.d(this.b, eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(key=");
        sb.append(this.a);
        sb.append(", value=");
        return f1d.j(sb, this.b, ')');
    }
}
