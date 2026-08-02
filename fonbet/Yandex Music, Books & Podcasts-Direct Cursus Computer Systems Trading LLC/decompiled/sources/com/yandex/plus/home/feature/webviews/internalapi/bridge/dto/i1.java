package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class i1 implements v1 {

    @NotNull
    public static final h1 Companion = new h1();
    public static final arf[] e = {null, null, null, btf.a(bwf.b, new b0(20))};
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ i1(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, g1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Intrinsics.d(this.a, i1Var.a) && Intrinsics.d(this.b, i1Var.b) && Intrinsics.d(this.c, i1Var.c) && Intrinsics.d(this.d, i1Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.d;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TreasuryStateResponse(trackId=");
        sb.append(this.a);
        sb.append(", traceId=");
        sb.append(this.b);
        sb.append(", state=<private>, exceptions=");
        return eta.h(sb, this.d, ')');
    }

    public i1(String str, List list) {
        this.a = str;
        this.b = null;
        this.c = null;
        this.d = list;
    }
}
