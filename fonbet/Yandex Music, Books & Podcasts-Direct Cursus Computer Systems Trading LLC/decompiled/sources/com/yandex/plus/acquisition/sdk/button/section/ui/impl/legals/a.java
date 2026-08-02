package com.yandex.plus.acquisition.sdk.button.section.ui.impl.legals;

import defpackage.dfi;
import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public final int a;
    public final int b;
    public final String c;

    public a(int i, int i2, String str) {
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && Intrinsics.d(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Span(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", uri=");
        return dfi.i(sb, this.c, ')');
    }
}
