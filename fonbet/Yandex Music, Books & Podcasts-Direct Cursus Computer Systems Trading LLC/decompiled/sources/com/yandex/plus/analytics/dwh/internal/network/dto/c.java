package com.yandex.plus.analytics.dwh.internal.network.dto;

import com.yandex.passport.sloth.command.data.k0;
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
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final arf[] c = {null, btf.a(bwf.b, new k0(11))};
    public final String a;
    public final Map b;

    public /* synthetic */ c(String str, int i, Map map) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && Intrinsics.d(this.b, cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DwhEventRequest(event=");
        sb.append(this.a);
        sb.append(", parameters=");
        return k5r.p(sb, this.b, ')');
    }

    public c(String str, Map map) {
        str.getClass();
        this.a = str;
        this.b = map;
    }
}
