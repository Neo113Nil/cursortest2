package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.g4;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class d0 {

    @NotNull
    public static final u Companion = new u();
    public static final arf[] i = {null, btf.a(bwf.b, new g4(16)), null, null, null, null, null, null};
    public final String a;
    public final c0 b;
    public final String c;
    public final String d;
    public final x e;
    public final x f;
    public final x g;
    public final boolean h;

    public /* synthetic */ d0(int i2, String str, c0 c0Var, String str2, String str3, x xVar, x xVar2, x xVar3, boolean z) {
        if (255 != (i2 & KotlinVersion.MAX_COMPONENT_VALUE)) {
            u7g.V(i2, KotlinVersion.MAX_COMPONENT_VALUE, t.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = c0Var;
        this.c = str2;
        this.d = str3;
        this.e = xVar;
        this.f = xVar2;
        this.g = xVar3;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.a, d0Var.a) && this.b == d0Var.b && Intrinsics.d(this.c, d0Var.c) && Intrinsics.d(this.d, d0Var.d) && Intrinsics.d(this.e, d0Var.e) && Intrinsics.d(this.f, d0Var.f) && Intrinsics.d(this.g, d0Var.g) && this.h == d0Var.h;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        x xVar = this.f;
        int hashCode4 = (hashCode3 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        x xVar2 = this.g;
        return Boolean.hashCode(this.h) + ((hashCode4 + (xVar2 != null ? xVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Details(id=");
        sb.append(this.a);
        sb.append(", productType=");
        sb.append(this.b);
        sb.append(", offerText=");
        sb.append(this.c);
        sb.append(", offerSubText=");
        sb.append(this.d);
        sb.append(", commonPeriod=");
        sb.append(this.e);
        sb.append(", trialPeriod=");
        sb.append(this.f);
        sb.append(", introPeriod=");
        sb.append(this.g);
        sb.append(", family=");
        return dfi.j(sb, this.h, ')');
    }
}
