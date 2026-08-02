package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.vhp;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class m2 {

    @NotNull
    public static final l2 Companion = new l2();
    public static final arf[] d;
    public final List a;
    public final List b;
    public final Map c;

    static {
        bwf bwfVar = bwf.b;
        d = new arf[]{btf.a(bwfVar, new k0(11)), btf.a(bwfVar, new k0(12)), btf.a(bwfVar, new k0(13))};
    }

    public /* synthetic */ m2(int i, List list, List list2, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return Intrinsics.d(this.a, m2Var.a) && Intrinsics.d(this.b, m2Var.b) && Intrinsics.d(this.c, m2Var.c);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkExperimentsRequestModel(testIds=");
        sb.append(this.a);
        sb.append(", excludeTestIds=");
        sb.append(this.b);
        sb.append(", params=");
        return k5r.p(sb, this.c, ')');
    }

    public m2(Map map) {
        this.a = null;
        this.b = null;
        this.c = map;
    }
}
