package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();
    public final String a;
    public final q1 b;

    public /* synthetic */ c0(int i, String str, q1 q1Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, a0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = q1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.a, c0Var.a) && Intrinsics.d(this.b, c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Data(text=" + this.a + ", color=" + this.b + ')';
    }
}
