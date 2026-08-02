package com.yandex.plus.core.graphql.daily.progress;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class d extends h {

    @NotNull
    public static final c Companion = new c();
    public static final arf[] c = {btf.a(bwf.b, new com.yandex.plus.bdui.plus.shared.serializer.d(26))};
    public final c0 b;

    public /* synthetic */ d(int i, c0 c0Var) {
        if (1 == (i & 1)) {
            this.b = c0Var;
        } else {
            u7g.V(i, 1, b.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.b, ((d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Gradient(gradient=" + this.b + ')';
    }
}
