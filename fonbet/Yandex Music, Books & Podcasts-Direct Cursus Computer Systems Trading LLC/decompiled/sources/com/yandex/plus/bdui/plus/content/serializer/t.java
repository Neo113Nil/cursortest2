package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class t {

    @NotNull
    public static final s Companion = new s();
    public static final arf[] d;
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.action.a c;

    static {
        bwf bwfVar = bwf.b;
        d = new arf[]{btf.a(bwfVar, new b(1)), btf.a(bwfVar, new b(2)), btf.a(bwfVar, new b(3))};
    }

    public /* synthetic */ t(int i, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, r.a.getDescriptor());
            throw null;
        }
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.a, tVar.a) && Intrinsics.d(this.b, tVar.b) && Intrinsics.d(this.c, tVar.c);
    }

    public final int hashCode() {
        int e = com.appsflyer.internal.k.e(this.b, this.a.hashCode() * 31, 31);
        com.yandex.plus.bdui.action.a aVar = this.c;
        return e + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionsDto(auth=");
        sb.append(this.a);
        sb.append(", cancel=");
        sb.append(this.b);
        sb.append(", back=");
        return com.appsflyer.internal.k.o(sb, this.c, ')');
    }
}
