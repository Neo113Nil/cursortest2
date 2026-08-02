package com.yandex.plus.core.kotlin.extensions;

import com.yandex.plus.core.graphql.type.a1;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends kotlin.coroutines.a {
    public static final a1 d = new a1(5);
    public final LinkedHashSet c;

    public b(LinkedHashSet linkedHashSet) {
        super(d);
        this.c = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.c, ((b) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "TryCatchMarker(catchingErrors=" + this.c + ')';
    }
}
