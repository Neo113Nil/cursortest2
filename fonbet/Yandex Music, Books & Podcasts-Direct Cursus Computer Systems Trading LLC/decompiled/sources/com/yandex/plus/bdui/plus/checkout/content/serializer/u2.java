package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class u2 {

    @NotNull
    public static final t2 Companion = new t2();
    public static final arf[] i = {null, null, null, btf.a(bwf.b, new q0(8)), null, null, null, null};
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t a;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 b;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 c;
    public final List d;
    public final String e;
    public final String f;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 g;
    public final c h;

    public /* synthetic */ u2(int i2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2, List list, String str, String str2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3, c cVar) {
        if (255 != (i2 & KotlinVersion.MAX_COMPONENT_VALUE)) {
            u7g.V(i2, KotlinVersion.MAX_COMPONENT_VALUE, s2.a.getDescriptor());
            throw null;
        }
        this.a = tVar;
        this.b = m1Var;
        this.c = m1Var2;
        this.d = list;
        this.e = str;
        this.f = str2;
        this.g = m1Var3;
        this.h = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return Intrinsics.d(this.a, u2Var.a) && Intrinsics.d(this.b, u2Var.b) && Intrinsics.d(this.c, u2Var.c) && Intrinsics.d(this.d, u2Var.d) && Intrinsics.d(this.e, u2Var.e) && Intrinsics.d(this.f, u2Var.f) && Intrinsics.d(this.g, u2Var.g) && Intrinsics.d(this.h, u2Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var = this.c;
        int c = k5r.c(k5r.c(k5r.d((hashCode + (m1Var == null ? 0 : m1Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2 = this.g;
        int hashCode2 = (c + (m1Var2 == null ? 0 : m1Var2.hashCode())) * 31;
        c cVar = this.h;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "DataDto(backgroundImage=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", assets=" + this.d + ", acceptButtonText=" + this.e + ", rejectButtonText=" + this.f + ", footerText=" + this.g + ", user=" + this.h + ')';
    }
}
