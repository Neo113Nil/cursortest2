package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class z {

    @NotNull
    public static final y Companion = new y();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ z(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, x.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.a, zVar.a) && Intrinsics.d(this.b, zVar.b) && Intrinsics.d(this.c, zVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataDto(text=");
        sb.append(this.a);
        sb.append(", authButton=");
        sb.append(this.b);
        sb.append(", cancelButton=");
        return dfi.i(sb, this.c, ')');
    }
}
