package com.yandex.plus.home.dailyquests.repository.rest.prefs;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class t {

    @NotNull
    public static final s Companion = new s();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ t(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, r.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.a, tVar.a) && Intrinsics.d(this.b, tVar.b) && Intrinsics.d(this.c, tVar.c) && Intrinsics.d(this.d, tVar.d) && Intrinsics.d(this.e, tVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.e.hashCode() + k5r.c(k5r.c((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Reward(lightIconUrl=");
        sb.append(this.a);
        sb.append(", darkIconUrl=");
        sb.append(this.b);
        sb.append(", iconUrlPlaceholder=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", contentDescription=");
        return dfi.i(sb, this.e, ')');
    }

    public t(String str, String str2, String str3, String str4, String str5) {
        dfi.s(str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }
}
