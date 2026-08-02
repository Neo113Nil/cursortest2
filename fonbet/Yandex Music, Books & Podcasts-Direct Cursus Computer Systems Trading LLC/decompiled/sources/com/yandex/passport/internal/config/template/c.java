package com.yandex.passport.internal.config.template;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();
    public final f a;
    public final f b;

    public /* synthetic */ c(int i, f fVar, f fVar2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = fVar;
        this.b = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && Intrinsics.d(this.b, cVar.b);
    }

    public final int hashCode() {
        f fVar = this.a;
        int hashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        f fVar2 = this.b;
        return hashCode + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    public final String toString() {
        return "UrlTemplateConfigCacheV1(updateTokenWithMasterUrl=" + this.a + ", switchMemberUrl=" + this.b + ')';
    }

    public c(f fVar, f fVar2) {
        this.a = fVar;
        this.b = fVar2;
    }
}
