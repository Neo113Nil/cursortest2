package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class v3 {

    @NotNull
    public static final u3 Companion = new u3();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final b4 e;
    public final String f;
    public final String g;
    public final c h;

    public /* synthetic */ v3(int i, String str, String str2, String str3, String str4, b4 b4Var, String str5, String str6, c cVar) {
        if (255 != (i & KotlinVersion.MAX_COMPONENT_VALUE)) {
            u7g.V(i, KotlinVersion.MAX_COMPONENT_VALUE, t3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = b4Var;
        this.f = str5;
        this.g = str6;
        this.h = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj;
        return Intrinsics.d(this.a, v3Var.a) && Intrinsics.d(this.b, v3Var.b) && Intrinsics.d(this.c, v3Var.c) && Intrinsics.d(this.d, v3Var.d) && Intrinsics.d(this.e, v3Var.e) && Intrinsics.d(this.f, v3Var.f) && Intrinsics.d(this.g, v3Var.g) && Intrinsics.d(this.h, v3Var.h);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        b4 b4Var = this.e;
        int c2 = k5r.c((c + (b4Var == null ? 0 : b4Var.hashCode())) * 31, 31, this.f);
        String str = this.g;
        int hashCode = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.h;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "DataDto(title=" + this.a + ", subtitle=" + this.b + ", errorCode=" + this.c + ", errorCodeContentDescription=" + this.d + ", expandable=" + this.e + ", primaryButton=" + this.f + ", secondaryButton=" + this.g + ", user=" + this.h + ')';
    }
}
