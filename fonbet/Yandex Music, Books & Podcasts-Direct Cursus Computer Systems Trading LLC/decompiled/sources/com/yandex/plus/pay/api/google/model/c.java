package com.yandex.plus.pay.api.google.model;

import com.yandex.plus.home.repository.api.model.webconfig.q;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final arf[] e = {null, btf.a(bwf.b, new q(10)), null, null};
    public final boolean a;
    public final List b;
    public final String c;
    public final boolean d;

    public /* synthetic */ c(int i, String str, List list, boolean z, boolean z2) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, a.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = list;
        this.c = str;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && Intrinsics.d(this.b, cVar.b) && Intrinsics.d(this.c, cVar.c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.c(k5r.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletePurchaseParams(acknowledge=");
        sb.append(this.a);
        sb.append(", products=");
        sb.append(this.b);
        sb.append(", token=");
        sb.append(this.c);
        sb.append(", isSubscription=");
        return dfi.j(sb, this.d, ')');
    }

    public c(String str, boolean z, boolean z2, List list) {
        list.getClass();
        str.getClass();
        this.a = z;
        this.b = list;
        this.c = str;
        this.d = z2;
    }
}
