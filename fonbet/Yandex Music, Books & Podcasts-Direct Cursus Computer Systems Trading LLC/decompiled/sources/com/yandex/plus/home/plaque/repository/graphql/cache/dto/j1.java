package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class j1 implements k1 {

    @NotNull
    public static final i1 Companion = new i1();
    public static final arf[] i = {null, btf.a(bwf.b, new h0(6)), null, null, null, null, null, null};
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;

    public /* synthetic */ j1(int i2, String str, List list, String str2, String str3, String str4, Integer num, String str5, String str6) {
        if (255 != (i2 & KotlinVersion.MAX_COMPONENT_VALUE)) {
            u7g.V(i2, KotlinVersion.MAX_COMPONENT_VALUE, h1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return Intrinsics.d(this.a, j1Var.a) && Intrinsics.d(this.b, j1Var.b) && Intrinsics.d(this.c, j1Var.c) && Intrinsics.d(this.d, j1Var.d) && Intrinsics.d(this.e, j1Var.e) && Intrinsics.d(this.f, j1Var.f) && Intrinsics.d(this.g, j1Var.g) && Intrinsics.d(this.h, j1Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(text=");
        sb.append(this.a);
        sb.append(", textDecoration=");
        sb.append(this.b);
        sb.append(", color=");
        sb.append(this.c);
        sb.append(", metaColor=");
        sb.append(this.d);
        sb.append(", metaStyle=");
        sb.append(this.e);
        sb.append(", fontSize=");
        sb.append(this.f);
        sb.append(", fontStyle=");
        sb.append(this.g);
        sb.append(", fontWeight=");
        return dfi.i(sb, this.h, ')');
    }

    public j1(String str, List list, String str2, String str3, String str4, Integer num, String str5, String str6) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = str5;
        this.h = str6;
    }
}
