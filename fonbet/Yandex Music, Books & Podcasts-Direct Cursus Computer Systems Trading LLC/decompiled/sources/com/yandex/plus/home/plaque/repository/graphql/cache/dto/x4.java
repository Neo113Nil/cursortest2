package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.btf;
import defpackage.bwf;
import defpackage.t9f;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class x4 implements y4 {

    @NotNull
    public static final x4 INSTANCE = new x4();
    public static final /* synthetic */ Object a = btf.a(bwf.b, new w4(0));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x4);
    }

    public final int hashCode() {
        return -733093548;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @NotNull
    public final t9f serializer() {
        return (t9f) a.getValue();
    }

    public final String toString() {
        return "HalfHeight";
    }
}
