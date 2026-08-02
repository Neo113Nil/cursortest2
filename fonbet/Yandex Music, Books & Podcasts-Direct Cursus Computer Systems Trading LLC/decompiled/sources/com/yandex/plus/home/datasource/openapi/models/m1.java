package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class m1 implements c5 {

    @NotNull
    public static final l1 Companion = new l1();
    public static final arf[] d = {btf.a(bwf.b, new k0(3)), null, null};
    public final b5 a;
    public final String b;
    public final int c;

    public /* synthetic */ m1(int i, b5 b5Var, String str, int i2) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, k1.a.getDescriptor());
            throw null;
        }
        this.a = b5Var;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.a == m1Var.a && Intrinsics.d(this.b, m1Var.b) && this.c == m1Var.c;
    }

    @Override // com.yandex.plus.home.datasource.openapi.models.c5
    public final b5 getPosition() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkCounterNotificationModel(position=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", count=");
        return vz1.r(sb, this.c, ')');
    }
}
