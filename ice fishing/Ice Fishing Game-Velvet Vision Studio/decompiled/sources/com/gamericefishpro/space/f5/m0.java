package com.gamericefishpro.space.f5;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class m0 extends n0 {
    public final Class k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Serializable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
        if (!type.isEnum()) {
            this.k = type;
            return;
        }
        throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final Object a(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Serializable) bundle.get(key);
    }

    @Override // com.gamericefishpro.space.f5.n0
    public String b() {
        String name = this.k.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final void e(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.k.cast(value);
        bundle.putSerializable(key, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        return Intrinsics.a(this.k, ((m0) obj).k);
    }

    @Override // com.gamericefishpro.space.f5.n0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable d(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int i, Class type) {
        super(false);
        Intrinsics.checkNotNullParameter(type, "type");
        if (Serializable.class.isAssignableFrom(type)) {
            this.k = type;
            return;
        }
        throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
    }
}
