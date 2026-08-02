package com.squareup.moshi.internal;

import defpackage.avt;
import defpackage.wdg;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class Util$GenericArrayTypeImpl implements GenericArrayType {
    public final Type a;

    public Util$GenericArrayTypeImpl(Type type) {
        this.a = avt.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && wdg.L(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return avt.h(this.a) + "[]";
    }
}
