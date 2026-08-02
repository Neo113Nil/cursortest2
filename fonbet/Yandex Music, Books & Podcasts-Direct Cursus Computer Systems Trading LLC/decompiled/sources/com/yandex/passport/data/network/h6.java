package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class h6 {

    @NotNull
    public static final g6 Companion = new g6();
    public final String a;
    public final String b;

    public /* synthetic */ h6(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
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
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        return Intrinsics.d(this.a, h6Var.a) && Intrinsics.d(this.b, h6Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VersionRuleDTO(versionGreaterOrEqual=");
        sb.append(this.a);
        sb.append(", versionEqual=");
        return dfi.i(sb, this.b, ')');
    }
}
