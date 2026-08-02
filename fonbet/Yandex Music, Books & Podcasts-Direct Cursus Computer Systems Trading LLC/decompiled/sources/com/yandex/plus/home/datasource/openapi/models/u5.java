package com.yandex.plus.home.datasource.openapi.models;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class u5 {

    @NotNull
    public static final t5 Companion = new t5();
    public final String a;
    public final String b;

    public /* synthetic */ u5(int i, String str, String str2) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, s5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return Intrinsics.d(this.a, u5Var.a) && Intrinsics.d(this.b, u5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkPlaqueSeenRequestModel(feedbackToken=");
        sb.append(this.a);
        sb.append(", seenContext=");
        return dfi.i(sb, this.b, ')');
    }

    public u5(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }
}
