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
public final class u {

    @NotNull
    public static final t Companion = new t();
    public static final arf[] b = {btf.a(bwf.b, new com.yandex.plus.bdui.plus.action.serializer.s(17))};
    public final com.yandex.plus.bdui.action.a a;

    public /* synthetic */ u(int i, com.yandex.plus.bdui.action.a aVar) {
        if (1 == (i & 1)) {
            this.a = aVar;
        } else {
            u7g.V(i, 1, s.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.a, ((u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.appsflyer.internal.k.o(new StringBuilder("ActionsDto(buttonClick="), this.a, ')');
    }
}
