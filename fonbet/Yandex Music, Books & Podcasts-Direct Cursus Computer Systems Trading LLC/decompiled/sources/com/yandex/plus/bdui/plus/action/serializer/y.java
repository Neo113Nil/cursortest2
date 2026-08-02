package com.yandex.plus.bdui.plus.action.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class y {

    @NotNull
    public static final x Companion = new x();
    public static final arf[] e = {null, null, null, btf.a(bwf.b, new s(2))};
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ y(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, w.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.a, yVar.a) && Intrinsics.d(this.b, yVar.b) && Intrinsics.d(this.c, yVar.c) && Intrinsics.d(this.d, yVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int c = k5r.c(k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        List list = this.d;
        return c + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventDto(idempotencyKey=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", params=");
        return eta.h(sb, this.d, ')');
    }

    public y(String str, String str2, String str3, List list) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }
}
