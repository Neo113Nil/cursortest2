package com.yandex.plus.home.common.network;

import androidx.core.app.n0;
import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends n0 {
    public final int b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i, String str) {
        super((Object) null);
        str.getClass();
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.b == gVar.b && Intrinsics.d(this.c, gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Unauthorized(code=");
        sb.append(this.b);
        sb.append(", message=");
        return dfi.i(sb, this.c, ')');
    }
}
