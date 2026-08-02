package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();
    public final t a;

    public /* synthetic */ p0(int i, t tVar) {
        if (1 == (i & 1)) {
            this.a = tVar;
        } else {
            u7g.V(i, 1, n0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Intrinsics.d(this.a, ((p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(image=" + this.a + ')';
    }
}
