package com.yandex.passport.internal.storage;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();
    public final com.yandex.passport.common.core.f a;
    public final long b;

    public /* synthetic */ p(int i, com.yandex.passport.common.core.f fVar, long j) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, n.a.getDescriptor());
            throw null;
        }
        this.a = fVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return Intrinsics.d(this.a, ((p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public p(com.yandex.passport.common.core.f fVar, long j) {
        fVar.getClass();
        this.a = fVar;
        this.b = j;
    }
}
