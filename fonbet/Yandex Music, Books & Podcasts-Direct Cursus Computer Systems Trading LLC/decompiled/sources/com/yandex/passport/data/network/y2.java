package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class y2 {

    @NotNull
    public static final x2 Companion = new x2();
    public static final arf[] d;
    public final String a;
    public final HashMap b;
    public final HashMap c;

    static {
        bwf bwfVar = bwf.b;
        d = new arf[]{null, btf.a(bwfVar, new com.yandex.passport.api.exception.l(20)), btf.a(bwfVar, new com.yandex.passport.api.exception.l(21))};
    }

    public /* synthetic */ y2(int i, String str, HashMap hashMap, HashMap hashMap2) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, w2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return Intrinsics.d(this.a, y2Var.a) && Intrinsics.d(this.b, y2Var.b) && Intrinsics.d(this.c, y2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BadgeSpecification(name=" + this.a + ", strings=" + this.b + ", icons=" + this.c + ')';
    }
}
