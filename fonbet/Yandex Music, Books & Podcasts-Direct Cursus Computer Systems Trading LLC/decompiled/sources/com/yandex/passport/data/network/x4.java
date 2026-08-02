package com.yandex.passport.data.network;

import defpackage.u7g;
import defpackage.vhp;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class x4 {

    @NotNull
    public static final w4 Companion = new w4();
    public final String a;
    public final LinkedHashMap b;

    public /* synthetic */ x4(int i, String str, LinkedHashMap linkedHashMap) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, v4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = new LinkedHashMap();
        } else {
            this.b = linkedHashMap;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj;
        return Intrinsics.d(this.a, x4Var.a) && Intrinsics.d(this.b, x4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoLoginAppParametersDTO(appId=" + this.a + ", extraParams=" + this.b + ')';
    }
}
