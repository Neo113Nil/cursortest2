package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class g implements q {

    @NotNull
    public static final f Companion = new f();
    public final p a;
    public final String b;

    public /* synthetic */ g(int i, p pVar, String str) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, e.a.getDescriptor());
            throw null;
        }
        this.a = pVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.a, gVar.a) && Intrinsics.d(this.b, gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Design(fallback=");
        sb.append(this.a);
        sb.append(", name=");
        return dfi.i(sb, this.b, ')');
    }
}
