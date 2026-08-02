package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class m7 {

    @NotNull
    public static final l7 Companion = new l7();
    public static final arf[] k = {btf.a(bwf.b, new y5(12)), null, null, null, null, null, null, null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 i;
    public final c j;

    public /* synthetic */ m7(int i, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var, c cVar) {
        if (1023 != (i & 1023)) {
            u7g.V(i, 1023, k7.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = m1Var;
        this.j = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj;
        return Intrinsics.d(this.a, m7Var.a) && Intrinsics.d(this.b, m7Var.b) && Intrinsics.d(this.c, m7Var.c) && Intrinsics.d(this.d, m7Var.d) && Intrinsics.d(this.e, m7Var.e) && Intrinsics.d(this.f, m7Var.f) && Intrinsics.d(this.g, m7Var.g) && Intrinsics.d(this.h, m7Var.h) && Intrinsics.d(this.i, m7Var.i) && Intrinsics.d(this.j, m7Var.j);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var = this.i;
        int hashCode = (c + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        c cVar = this.j;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "DataDto(benefits=" + this.a + ", buttonText=" + this.b + ", buttonAdditionalText=" + this.c + ", acceptButtonText=" + this.d + ", rejectButtonText=" + this.e + ", mainImageMobile=" + this.f + ", titleText=" + this.g + ", subtitleText=" + this.h + ", legalText=" + this.i + ", user=" + this.j + ')';
    }
}
