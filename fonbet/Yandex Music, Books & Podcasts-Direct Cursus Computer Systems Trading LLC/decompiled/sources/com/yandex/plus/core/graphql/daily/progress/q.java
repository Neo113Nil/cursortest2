package com.yandex.plus.core.graphql.daily.progress;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();
    public final float a;
    public final g b;

    public /* synthetic */ q(int i, float f, g gVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, o.a.getDescriptor());
            throw null;
        }
        this.a = f;
        this.b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.a, qVar.a) == 0 && Intrinsics.d(this.b, qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ColorStop(location=" + this.a + ", hexColor=" + this.b + ')';
    }
}
