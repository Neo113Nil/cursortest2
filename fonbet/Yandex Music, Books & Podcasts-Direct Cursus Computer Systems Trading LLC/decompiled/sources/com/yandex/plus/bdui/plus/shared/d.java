package com.yandex.plus.bdui.plus.shared;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();
    public static final arf[] b = {btf.a(bwf.b, new com.yandex.plus.bdui.plus.content.serializer.b(26))};
    public final Map a;

    public /* synthetic */ d(int i, Map map) {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            u7g.V(i, 1, b.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return k5r.p(new StringBuilder("ActionsDto(actions="), this.a, ')');
    }

    public d(Map map) {
        this.a = map;
    }
}
