package com.yandex.plus.bdui.plus.action.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();
    public static final arf[] b = {btf.a(bwf.b, new s(3))};
    public final List a;

    public /* synthetic */ b0(List list, int i) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            u7g.V(i, 1, z.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.a, ((b0) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return eta.h(new StringBuilder("SendAnalyticsDto(events="), this.a, ')');
    }

    public b0(ArrayList arrayList) {
        this.a = arrayList;
    }
}
