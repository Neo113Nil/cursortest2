package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class c4 {

    @NotNull
    public static final b4 Companion = new b4();
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;

    public /* synthetic */ c4(int i, String str, String str2, String str3, boolean z) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, a4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return Intrinsics.d(this.a, c4Var.a) && this.b == c4Var.b && Intrinsics.d(this.c, c4Var.c) && Intrinsics.d(this.d, c4Var.d);
    }

    public final int hashCode() {
        int e = k5r.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryUrl(url=");
        sb.append(this.a);
        sb.append(", active=");
        sb.append(this.b);
        sb.append(", data=");
        sb.append(this.c);
        sb.append(", storyId=");
        return dfi.i(sb, this.d, ')');
    }
}
