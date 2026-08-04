package com.gamericefishpro.space.f5;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends n0 {
    public final Class k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
            this.k = type;
            return;
        }
        throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final Object a(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.get(key);
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
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final void e(Bundle bundle, String key, Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.k.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(key, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(key, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k0.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.a(this.k, ((k0) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }
}
