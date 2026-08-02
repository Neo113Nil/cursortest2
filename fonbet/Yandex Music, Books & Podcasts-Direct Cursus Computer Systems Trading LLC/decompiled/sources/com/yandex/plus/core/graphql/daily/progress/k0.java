package com.yandex.plus.core.graphql.daily.progress;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class k0 {

    @NotNull
    public static final j0 Companion = new j0();
    public final n a;

    public /* synthetic */ k0(int i, n nVar) {
        if (1 == (i & 1)) {
            this.a = nVar;
        } else {
            u7g.V(i, 1, i0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.a, ((k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProgressResponse(progress=" + this.a + ')';
    }
}
