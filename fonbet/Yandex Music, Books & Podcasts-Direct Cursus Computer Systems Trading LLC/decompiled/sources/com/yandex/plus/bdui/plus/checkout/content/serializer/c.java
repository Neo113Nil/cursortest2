package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.dfi;
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
    public final String a;
    public final boolean b;
    public final String c;

    public /* synthetic */ c(int i, String str, String str2, boolean z) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && this.b == cVar.b && Intrinsics.d(this.c, cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserDto(avatarUrl=");
        sb.append(this.a);
        sb.append(", hasPlus=");
        sb.append(this.b);
        sb.append(", login=");
        return dfi.i(sb, this.c, ')');
    }
}
