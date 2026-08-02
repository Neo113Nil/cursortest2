package com.yandex.passport.sloth.command.data;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();
    public final String a;
    public final Float b;
    public final Float c;
    public final Float d;
    public final Float e;
    public final boolean f;

    public /* synthetic */ z0(int i, String str, Float f, Float f2, Float f3, Float f4, boolean z) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, x0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        if ((i & 32) == 0) {
            this.f = true;
        } else {
            this.f = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.d(this.a, z0Var.a) && Intrinsics.d(this.b, z0Var.b) && Intrinsics.d(this.c, z0Var.c) && Intrinsics.d(this.d, z0Var.d) && Intrinsics.d(this.e, z0Var.e) && this.f == z0Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.b;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.c;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.d;
        int hashCode4 = (hashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (f4 != null ? f4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetPopupSizeData(mode=");
        sb.append(this.a);
        sb.append(", cornerRadius=");
        sb.append(this.b);
        sb.append(", horizontalMargins=");
        sb.append(this.c);
        sb.append(", verticalMargins=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.e);
        sb.append(", animate=");
        return dfi.j(sb, this.f, ')');
    }
}
