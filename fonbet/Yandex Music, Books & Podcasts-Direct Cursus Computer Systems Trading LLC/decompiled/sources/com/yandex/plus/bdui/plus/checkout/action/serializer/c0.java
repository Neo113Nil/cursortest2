package com.yandex.plus.bdui.plus.checkout.action.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();
    public final z a;

    public /* synthetic */ c0(int i, z zVar) {
        if (1 == (i & 1)) {
            this.a = zVar;
        } else {
            u7g.V(i, 1, a0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.a, ((c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RestorePurchasesDto(actions=" + this.a + ')';
    }
}
