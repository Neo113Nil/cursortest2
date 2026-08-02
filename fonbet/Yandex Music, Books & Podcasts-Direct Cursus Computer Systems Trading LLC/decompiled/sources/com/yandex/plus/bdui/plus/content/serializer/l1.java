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
public final class l1 {

    @NotNull
    public static final k1 Companion = new k1();
    public static final arf[] b = {btf.a(bwf.b, new b(16))};
    public final com.yandex.plus.bdui.action.a a;

    public /* synthetic */ l1(int i, com.yandex.plus.bdui.action.a aVar) {
        if (1 == (i & 1)) {
            this.a = aVar;
        } else {
            u7g.V(i, 1, j1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && Intrinsics.d(this.a, ((l1) obj).a);
    }

    public final int hashCode() {
        com.yandex.plus.bdui.action.a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return com.appsflyer.internal.k.o(new StringBuilder("ActionsDto(back="), this.a, ')');
    }
}
