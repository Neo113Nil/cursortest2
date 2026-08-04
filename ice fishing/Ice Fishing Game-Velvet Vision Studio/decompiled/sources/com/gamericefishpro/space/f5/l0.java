package com.gamericefishpro.space.f5;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends n0 {
    public final Class k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Serializable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
        try {
            this.k = Class.forName("[L" + type.getName() + ';');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final Object a(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Serializable[]) bundle.get(key);
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final String b() {
        String name = this.k.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final Object d(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // com.gamericefishpro.space.f5.n0
    public final void e(Bundle bundle, String key, Object obj) {
        ?? r4 = (Serializable[]) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.k.cast(r4);
        bundle.putSerializable(key, r4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l0.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.a(this.k, ((l0) obj).k);
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final boolean f(Object obj, Object obj2) {
        return com.gamericefishpro.space.ph.t.a((Serializable[]) obj, (Serializable[]) obj2);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }
}
