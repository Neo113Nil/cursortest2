package com.yandex.plus.core.graphql.daily.progress;

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
public final class k {

    @NotNull
    public static final j Companion = new j();
    public static final arf[] b = {btf.a(bwf.b, new com.yandex.plus.bdui.plus.shared.serializer.d(27))};
    public final List a;

    public /* synthetic */ k(List list, int i) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            u7g.V(i, 1, i.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return eta.h(new StringBuilder("ProgressColorResponse(value="), this.a, ')');
    }
}
