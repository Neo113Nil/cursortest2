package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import com.yandex.plus.bdui.plus.checkout.content.serializer.y5;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class m implements q {

    @NotNull
    public static final l Companion = new l();
    public static final arf[] e = {null, btf.a(bwf.b, new y5(22)), null, null};
    public final float a;
    public final List b;
    public final x c;
    public final x d;

    public /* synthetic */ m(int i, float f, List list, x xVar, x xVar2) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, k.a.getDescriptor());
            throw null;
        }
        this.a = f;
        this.b = list;
        this.c = xVar;
        this.d = xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.a, mVar.a) == 0 && Intrinsics.d(this.b, mVar.b) && Intrinsics.d(this.c, mVar.c) && Intrinsics.d(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.d(Float.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "RadialGradient(angle=" + this.a + ", colors=" + this.b + ", relativeCenter=" + this.c + ", relativeRadius=" + this.d + ')';
    }
}
