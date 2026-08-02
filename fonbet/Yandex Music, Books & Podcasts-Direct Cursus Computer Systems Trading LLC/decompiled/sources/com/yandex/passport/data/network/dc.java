package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class dc {

    @NotNull
    public static final cc Companion = new cc();
    public static final arf[] c = {null, btf.a(bwf.b, new k5(16))};
    public final String a;
    public final String b;

    public /* synthetic */ dc(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, bc.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        return Intrinsics.d(this.a, dcVar.a) && Intrinsics.d(this.b, dcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Result(status=" + this.a + ", avatarUrl=" + ((Object) com.yandex.passport.common.url.b.m(this.b)) + ')';
    }
}
