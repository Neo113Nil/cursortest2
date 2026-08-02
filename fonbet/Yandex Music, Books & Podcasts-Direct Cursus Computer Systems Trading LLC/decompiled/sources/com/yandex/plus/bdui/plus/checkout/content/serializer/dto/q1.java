package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import com.yandex.plus.bdui.plus.checkout.content.serializer.y5;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class q1 {

    @NotNull
    public static final p1 Companion = new p1();
    public static final arf[] c;
    public final q a;
    public final q b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new y5(24)), btf.a(bwfVar, new y5(25))};
    }

    public /* synthetic */ q1(int i, q qVar, q qVar2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, o1.a.getDescriptor());
            throw null;
        }
        this.a = qVar;
        this.b = qVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Intrinsics.d(this.a, q1Var.a) && Intrinsics.d(this.b, q1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ThemedColorDto(dark=" + this.a + ", light=" + this.b + ')';
    }
}
