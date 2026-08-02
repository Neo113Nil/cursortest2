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
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final arf[] c;
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(5)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(6))};
    }

    public /* synthetic */ c(int i, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = aVar;
        this.b = aVar2;
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
        StringBuilder sb = new StringBuilder("ActionsDto(success=");
        sb.append(this.a);
        sb.append(", error=");
        return com.appsflyer.internal.k.o(sb, this.b, ')');
    }

    public c(com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.a = aVar;
        this.b = aVar2;
    }
}
