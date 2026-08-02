package com.squareup.moshi.internal;

import defpackage.avt;
import defpackage.e7o;
import defpackage.wdg;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes3.dex */
public final class Util$WildcardTypeImpl implements WildcardType {
    public final Type a;
    public final Type b;

    public Util$WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            e7o.e();
            throw null;
        }
        if (typeArr.length != 1) {
            e7o.e();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            avt.b(typeArr[0]);
            this.b = null;
            this.a = avt.a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        avt.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            e7o.e();
            throw null;
        }
        this.b = avt.a(typeArr2[0]);
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && wdg.L(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : avt.b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super " + avt.h(type);
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + avt.h(type2);
    }
}
