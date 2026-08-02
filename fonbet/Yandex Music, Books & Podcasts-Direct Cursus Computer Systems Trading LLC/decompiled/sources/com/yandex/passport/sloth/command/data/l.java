package com.yandex.passport.sloth.command.data;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final arf[] c = {btf.a(bwf.b, new com.yandex.passport.internal.push.w0(25)), null};
    public final String a;
    public final String b;

    public /* synthetic */ l(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, j.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.a, lVar.a) && Intrinsics.d(this.b, lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishWithUrlData(url=");
        com.appsflyer.internal.k.y(sb, this.a, ", purpose=");
        return dfi.i(sb, this.b, ')');
    }
}
