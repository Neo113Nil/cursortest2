package com.yandex.plus.core.graphql.gradient;

import com.yandex.plus.core.graphql.daily.progress.s;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class j extends k {

    @NotNull
    public static final i Companion = new i();
    public static final arf[] e = {btf.a(bwf.b, new s(6)), null, null};
    public final List b;
    public final n c;
    public final n d;

    public /* synthetic */ j(int i, List list, n nVar, n nVar2) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, h.a.getDescriptor());
            throw null;
        }
        this.b = list;
        this.c = nVar;
        this.d = nVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.b, jVar.b) && Intrinsics.d(this.c, jVar.c) && Intrinsics.d(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RadialGradientResponse(colors=" + this.b + ", radius=" + this.c + ", center=" + this.d + ')';
    }
}
