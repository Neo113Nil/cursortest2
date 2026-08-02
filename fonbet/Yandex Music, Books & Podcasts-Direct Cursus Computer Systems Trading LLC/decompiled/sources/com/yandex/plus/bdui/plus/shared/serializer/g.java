package com.yandex.plus.bdui.plus.shared.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();
    public static final arf[] b = {btf.a(bwf.b, new d(0))};
    public final Map a;

    public /* synthetic */ g(int i, Map map) {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            u7g.V(i, 1, e.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return k5r.p(new StringBuilder("PayloadDto(payload="), this.a, ')');
    }

    public g(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }
}
