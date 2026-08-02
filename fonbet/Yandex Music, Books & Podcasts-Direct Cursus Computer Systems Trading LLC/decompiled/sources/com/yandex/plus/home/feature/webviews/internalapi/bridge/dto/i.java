package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class i implements v1 {

    @NotNull
    public static final h Companion = new h();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ i(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, g.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.a, iVar.a) && Intrinsics.d(this.b, iVar.b) && Intrinsics.d(this.c, iVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int c = k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return c + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BroadcastEvent(trackId=");
        sb.append(this.a);
        sb.append(", event=");
        sb.append(this.b);
        sb.append(", params=");
        return dfi.i(sb, this.c, ')');
    }

    public i(String str, String str2, String str3) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
