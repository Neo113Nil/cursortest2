package com.yandex.plus.core.graphql.daily.progress;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class h0 {

    @NotNull
    public static final e0 Companion = new e0();
    public static final arf[] i = {btf.a(bwf.b, new s(2)), null, null, null, null, null, null, null};
    public final g0 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;
    public final Boolean h;

    public /* synthetic */ h0(int i2, g0 g0Var, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2) {
        if (1 != (i2 & 1)) {
            u7g.V(i2, 1, d0.a.getDescriptor());
            throw null;
        }
        this.a = g0Var;
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.a == h0Var.a && Intrinsics.d(this.b, h0Var.b) && Intrinsics.d(this.c, h0Var.c) && Intrinsics.d(this.d, h0Var.d) && Intrinsics.d(this.e, h0Var.e) && Intrinsics.d(this.f, h0Var.f) && Intrinsics.d(this.g, h0Var.g) && Intrinsics.d(this.h, h0Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        return hashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressReplacer(type=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", fallbackText=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append(this.e);
        sb.append(", textColor=");
        sb.append(this.f);
        sb.append(", isBold=");
        sb.append(this.g);
        sb.append(", isItalic=");
        return com.appsflyer.internal.k.p(sb, this.h, ')');
    }
}
