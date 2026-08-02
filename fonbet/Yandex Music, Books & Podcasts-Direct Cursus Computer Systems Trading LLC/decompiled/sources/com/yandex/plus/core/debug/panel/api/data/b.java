package com.yandex.plus.core.debug.panel.api.data;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final a a;
    public final String b;

    public b(a aVar, String str) {
        aVar.getClass();
        str.getClass();
        this.a = aVar;
        this.b = str;
        aVar.name();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && Intrinsics.d(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugPanelGeneralInfo(key=");
        sb.append(this.a);
        sb.append(", value=");
        return dfi.i(sb, this.b, ')');
    }
}
