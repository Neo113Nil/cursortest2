package com.yandex.passport.sloth.command.data;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();
    public static final arf[] c;
    public final List a;
    public final List b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new com.yandex.passport.internal.push.w0(28)), btf.a(bwfVar, new com.yandex.passport.internal.push.w0(29))};
    }

    public /* synthetic */ d0(int i, List list, List list2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, b0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.a, d0Var.a) && Intrinsics.d(this.b, d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformVibrationData(vibrationPattern=");
        sb.append(this.a);
        sb.append(", vibrationAmplitude=");
        return eta.h(sb, this.b, ')');
    }
}
