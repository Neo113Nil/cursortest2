package com.gamericefishpro.space.fj;

import com.gamericefishpro.space.ei.g;
import com.gamericefishpro.space.f5.q;
import com.gamericefishpro.space.ph.g0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final com.gamericefishpro.space.mj.a a;
    public final g b;
    public final Function2 c;
    public final b d;
    public List e;

    public a(com.gamericefishpro.space.mj.a scopeQualifier, g primaryType, Function2 definition, b kind, g0 secondaryTypes) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(primaryType, "primaryType");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        this.a = scopeQualifier;
        this.b = primaryType;
        this.c = definition;
        this.d = kind;
        this.e = secondaryTypes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        a aVar = (a) obj;
        return this.b.equals(aVar.b) && Intrinsics.a(this.a, aVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.d);
        sb.append(": '");
        sb.append(com.gamericefishpro.space.qj.a.a(this.b));
        sb.append('\'');
        com.gamericefishpro.space.mj.b bVar = com.gamericefishpro.space.nj.a.e;
        com.gamericefishpro.space.mj.a aVar = this.a;
        if (!Intrinsics.a(aVar, bVar)) {
            sb.append(",scope:");
            sb.append(aVar);
        }
        if (!this.e.isEmpty()) {
            sb.append(",binds:");
            CollectionsKt.z(this.e, sb, ",", new q(4), 60);
        }
        sb.append(']');
        return sb.toString();
    }
}
