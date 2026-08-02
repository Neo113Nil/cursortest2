package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import defpackage.w4f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();
    public final String a;
    public final w4f b;

    public /* synthetic */ m0(int i, String str, w4f w4fVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, k0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = w4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.a, m0Var.a) && Intrinsics.d(this.b, m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LayoutParamDto(type=" + this.a + ", value=" + this.b + ')';
    }
}
