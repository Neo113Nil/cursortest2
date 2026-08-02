package com.yandex.passport.data.network;

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
/* loaded from: classes4.dex */
public final class n2 {

    @NotNull
    public static final m2 Companion = new m2();
    public static final arf[] b = {btf.a(bwf.b, new com.yandex.passport.api.exception.l(17))};
    public final List a;

    public /* synthetic */ n2(List list, int i) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            u7g.V(i, 1, l2.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2) && Intrinsics.d(this.a, ((n2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return eta.h(new StringBuilder("Passport(flags="), this.a, ')');
    }
}
