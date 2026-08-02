package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class s4 {

    @NotNull
    public static final r4 Companion = new r4();
    public final v4 a;

    public /* synthetic */ s4(int i, v4 v4Var) {
        if (1 == (i & 1)) {
            this.a = v4Var;
        } else {
            u7g.V(i, 1, q4.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4) && Intrinsics.d(this.a, ((s4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GetInAppInfoDto(payload=" + this.a + ')';
    }
}
