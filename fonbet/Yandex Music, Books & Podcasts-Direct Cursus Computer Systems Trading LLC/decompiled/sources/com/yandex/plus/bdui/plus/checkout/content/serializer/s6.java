package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class s6 {

    @NotNull
    public static final r6 Companion = new r6();
    public static final arf[] c;
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new y5(5)), btf.a(bwfVar, new y5(6))};
    }

    public /* synthetic */ s6(int i, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, q6.a.getDescriptor());
            throw null;
        }
        this.a = aVar;
        this.b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return Intrinsics.d(this.a, s6Var.a) && Intrinsics.d(this.b, s6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.plus.bdui.action.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionsDto(ok=");
        sb.append(this.a);
        sb.append(", back=");
        return com.appsflyer.internal.k.o(sb, this.b, ')');
    }
}
