package com.yandex.plus.bdui.plus.checkout.action.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final arf[] d;
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.action.a c;

    static {
        bwf bwfVar = bwf.b;
        d = new arf[]{btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(7)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(8)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(9))};
    }

    public /* synthetic */ l(int i, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, j.a.getDescriptor());
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.a, lVar.a) && Intrinsics.d(this.b, lVar.b) && Intrinsics.d(this.c, lVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.appsflyer.internal.k.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionsDto(success=");
        sb.append(this.a);
        sb.append(", cancel=");
        sb.append(this.b);
        sb.append(", error=");
        return com.appsflyer.internal.k.o(sb, this.c, ')');
    }
}
