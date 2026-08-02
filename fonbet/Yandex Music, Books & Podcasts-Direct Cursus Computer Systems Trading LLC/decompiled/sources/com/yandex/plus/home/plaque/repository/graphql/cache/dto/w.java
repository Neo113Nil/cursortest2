package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.btf;
import defpackage.bwf;
import defpackage.t9f;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class w implements x {

    @NotNull
    public static final w INSTANCE = new w();
    public static final /* synthetic */ Object a = btf.a(bwf.b, new com.yandex.plus.home.graphql.configuration.a(17));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w);
    }

    public final int hashCode() {
        return 387550650;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @NotNull
    public final t9f serializer() {
        return (t9f) a.getValue();
    }

    public final String toString() {
        return "Transparent";
    }
}
