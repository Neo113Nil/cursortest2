package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class t {

    @NotNull
    public static final s Companion = new s();
    public final String a;
    public final String b;

    public /* synthetic */ t(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, r.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.a, tVar.a) && Intrinsics.d(this.b, tVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDto(light=");
        sb.append(this.a);
        sb.append(", dark=");
        return dfi.i(sb, this.b, ')');
    }
}
