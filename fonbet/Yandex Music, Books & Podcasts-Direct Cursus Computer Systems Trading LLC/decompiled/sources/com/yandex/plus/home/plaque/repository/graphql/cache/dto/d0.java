package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();
    public static final arf[] e = {null, btf.a(bwf.b, new com.yandex.plus.home.graphql.configuration.a(23)), null, null};
    public final String a;
    public final List b;
    public final String c;
    public final Boolean d;

    public /* synthetic */ d0(int i, String str, List list, String str2, Boolean bool) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, b0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.a, d0Var.a) && Intrinsics.d(this.b, d0Var.b) && Intrinsics.d(this.c, d0Var.c) && Intrinsics.d(this.d, d0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentDescriptionDto(text=");
        sb.append(this.a);
        sb.append(", templates=");
        sb.append(this.b);
        sb.append(", actionText=");
        sb.append(this.c);
        sb.append(", accessibilityEnabled=");
        return com.appsflyer.internal.k.p(sb, this.d, ')');
    }

    public d0(String str, List list, String str2, Boolean bool) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = bool;
    }
}
