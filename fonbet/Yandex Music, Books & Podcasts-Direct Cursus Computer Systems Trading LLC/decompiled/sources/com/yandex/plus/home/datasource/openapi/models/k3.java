package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.net.URI;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class k3 implements c5 {

    @NotNull
    public static final j3 Companion = new j3();
    public static final arf[] d = {btf.a(bwf.b, new k0(14)), null, null};
    public final b5 a;
    public final String b;
    public final URI c;

    public /* synthetic */ k3(int i, b5 b5Var, String str, URI uri) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, i3.a.getDescriptor());
            throw null;
        }
        this.a = b5Var;
        this.b = str;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return this.a == k3Var.a && Intrinsics.d(this.b, k3Var.b) && Intrinsics.d(this.c, k3Var.c);
    }

    @Override // com.yandex.plus.home.datasource.openapi.models.c5
    public final b5 getPosition() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "NetworkIconNotificationModel(position=" + this.a + ", type=" + this.b + ", url=" + this.c + ')';
    }
}
