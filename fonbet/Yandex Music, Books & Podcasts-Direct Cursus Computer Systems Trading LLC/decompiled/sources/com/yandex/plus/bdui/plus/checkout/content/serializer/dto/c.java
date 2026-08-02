package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();
    public final p a;
    public final double b;

    public /* synthetic */ c(int i, p pVar, double d) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = pVar;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && Double.compare(this.b, cVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorGradientStop(color=");
        sb.append(this.a);
        sb.append(", location=");
        return k5r.n(sb, this.b, ')');
    }
}
