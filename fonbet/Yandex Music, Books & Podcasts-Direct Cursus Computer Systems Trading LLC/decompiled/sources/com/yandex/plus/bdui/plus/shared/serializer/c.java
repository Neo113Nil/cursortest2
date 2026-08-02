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
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final arf[] b = {btf.a(bwf.b, new com.yandex.plus.bdui.plus.content.serializer.b(29))};
    public final Map a;

    public /* synthetic */ c(int i, Map map) {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            u7g.V(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return k5r.p(new StringBuilder("AnalyticsDto(analytics="), this.a, ')');
    }

    public c(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }
}
