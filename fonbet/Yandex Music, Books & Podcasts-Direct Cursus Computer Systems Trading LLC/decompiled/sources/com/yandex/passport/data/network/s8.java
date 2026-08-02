package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class s8 {

    @NotNull
    public static final r8 Companion = new r8();
    public static final arf[] b = {btf.a(bwf.b, new k5(14))};
    public final Map a;

    public /* synthetic */ s8(int i, Map map) {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            u7g.V(i, 1, q8.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8) && Intrinsics.d(this.a, ((s8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k5r.p(new StringBuilder("Result(payload="), this.a, ')');
    }
}
