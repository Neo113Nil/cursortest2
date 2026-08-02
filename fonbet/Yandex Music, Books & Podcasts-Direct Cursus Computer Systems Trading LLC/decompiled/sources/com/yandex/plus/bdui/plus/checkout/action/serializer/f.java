package com.yandex.plus.bdui.plus.checkout.action.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();
    public final i a;
    public final c b;

    public /* synthetic */ f(int i, i iVar, c cVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, d.a.getDescriptor());
            throw null;
        }
        this.a = iVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && Intrinsics.d(this.b, fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CompleteDto(data=" + this.a + ", actions=" + this.b + ')';
    }

    public f(i iVar, c cVar) {
        this.a = iVar;
        this.b = cVar;
    }
}
