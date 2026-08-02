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
public final class f1 implements v1 {

    @NotNull
    public static final e1 Companion = new e1();
    public static final arf[] e = {null, null, null, btf.a(bwf.b, new b0(19))};
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ f1(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, d1.a.getDescriptor());
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
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Intrinsics.d(this.a, f1Var.a) && Intrinsics.d(this.b, f1Var.b) && Intrinsics.d(this.c, f1Var.c) && Intrinsics.d(this.d, f1Var.d);
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
        StringBuilder sb = new StringBuilder("TreasuryState(trackId=");
        sb.append(this.a);
        sb.append(", traceId=");
        sb.append(this.b);
        sb.append(", state=<private>, exceptions=");
        return eta.h(sb, this.d, ')');
    }

    public f1(String str, List list) {
        this.a = str;
        this.b = null;
        this.c = null;
        this.d = list;
    }
}
