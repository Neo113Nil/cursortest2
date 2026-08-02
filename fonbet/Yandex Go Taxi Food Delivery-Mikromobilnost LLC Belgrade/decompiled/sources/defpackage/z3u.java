package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class z3u implements WildcardType {
    public final /* synthetic */ int a;
    public final Type b;
    public final Type c;

    public z3u(Type[] typeArr, Type[] typeArr2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                if (typeArr2.length > 1) {
                    w511.q();
                    throw null;
                }
                if (typeArr.length != 1) {
                    w511.q();
                    throw null;
                }
                if (typeArr2.length != 1) {
                    typeArr[0].getClass();
                    udq0.j(typeArr[0]);
                    this.c = null;
                    this.b = typeArr[0];
                    return;
                }
                typeArr2[0].getClass();
                udq0.j(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    w511.q();
                    throw null;
                }
                this.c = typeArr2[0];
                this.b = Object.class;
                return;
            default:
                if (typeArr2.length > 1) {
                    ny61.g("At most one lower bound is supported");
                    throw null;
                }
                if (typeArr.length != 1) {
                    ny61.g("Exactly one upper bound must be specified");
                    throw null;
                }
                if (typeArr2.length != 1) {
                    Objects.requireNonNull(typeArr[0]);
                    si91.i(typeArr[0]);
                    this.c = null;
                    this.b = si91.h(typeArr[0]);
                    return;
                }
                Objects.requireNonNull(typeArr2[0]);
                si91.i(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    ny61.g("When lower bound is specified, upper bound must be Object");
                    throw null;
                }
                this.c = si91.h(typeArr2[0]);
                this.b = Object.class;
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof WildcardType) && si91.k(this, (WildcardType) obj)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof WildcardType) && udq0.m(this, (WildcardType) obj)) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        int i = this.a;
        Type type = this.c;
        switch (i) {
            case 0:
                return type != null ? new Type[]{type} : si91.a;
            default:
                return type != null ? new Type[]{type} : udq0.c;
        }
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        int i = this.a;
        Type type = this.b;
        switch (i) {
            case 0:
                return new Type[]{type};
            default:
                return new Type[]{type};
        }
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = this.a;
        Type type = this.b;
        Type type2 = this.c;
        switch (i) {
            case 0:
                hashCode = type2 != null ? type2.hashCode() + 31 : 1;
                hashCode2 = type.hashCode();
                break;
            default:
                hashCode = type2 != null ? type2.hashCode() + 31 : 1;
                hashCode2 = type.hashCode();
                break;
        }
        return (hashCode2 + 31) ^ hashCode;
    }

    public final String toString() {
        int i = this.a;
        Type type = this.c;
        Type type2 = this.b;
        switch (i) {
            case 0:
                if (type != null) {
                    return "? super " + si91.r(type);
                }
                if (type2 == Object.class) {
                    return "?";
                }
                return "? extends " + si91.r(type2);
            default:
                if (type != null) {
                    return "? super " + udq0.T(type);
                }
                if (type2 == Object.class) {
                    return "?";
                }
                return "? extends " + udq0.T(type2);
        }
    }
}
