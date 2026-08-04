package com.gamericefishpro.space.f5;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends n0 {
    public final Class k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Parcelable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
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
        return (Parcelable[]) bundle.get(key);
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

    @Override // com.gamericefishpro.space.f5.n0
    public final void e(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.k.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j0.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.a(this.k, ((j0) obj).k);
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final boolean f(Object obj, Object obj2) {
        return com.gamericefishpro.space.ph.t.a((Parcelable[]) obj, (Parcelable[]) obj2);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }
}
