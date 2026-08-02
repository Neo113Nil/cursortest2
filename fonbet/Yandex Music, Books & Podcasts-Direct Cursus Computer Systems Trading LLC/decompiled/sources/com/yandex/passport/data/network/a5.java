package com.yandex.passport.data.network;

import defpackage.u7g;
import defpackage.vhp;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class a5 {

    @NotNull
    public static final z4 Companion = new z4();
    public final String a;
    public final LinkedHashMap b;

    public /* synthetic */ a5(int i, String str, LinkedHashMap linkedHashMap) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, y4.a.getDescriptor());
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
        if (!(obj instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj;
        return Intrinsics.d(this.a, a5Var.a) && Intrinsics.d(this.b, a5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoLoginClientIdParametersDTO(clientId=" + this.a + ", extraParams=" + this.b + ')';
    }
}
