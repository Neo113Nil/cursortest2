package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class b6 {

    @NotNull
    public static final a6 Companion = new a6();
    public final String a;
    public final String b;

    public /* synthetic */ b6(int i, String str, String str2) {
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
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return Intrinsics.d(this.a, b6Var.a) && Intrinsics.d(this.b, b6Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLConfigEntryDTO(path=");
        sb.append(this.a);
        sb.append(", params=");
        return dfi.i(sb, this.b, ')');
    }
}
