package com.yandex.passport.sloth.command.data;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();
    public static final arf[] b = {btf.a(bwf.b, new com.yandex.passport.internal.push.w0(26))};
    public final List a;

    public /* synthetic */ o(List list, int i) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return eta.h(new StringBuilder("GetCustomEulaStringsData(keys="), this.a, ')');
    }
}
