package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class x3u implements GenericArrayType {
    public final /* synthetic */ int a;
    public final Type b;

    public x3u(int i, Type type) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = type;
                break;
            default:
                Objects.requireNonNull(type);
                this.b = si91.h(type);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof GenericArrayType) && si91.k(this, (GenericArrayType) obj)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof GenericArrayType) && udq0.m(this, (GenericArrayType) obj)) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        switch (this.a) {
        }
        return this.b;
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        Type type = this.b;
        switch (i) {
            case 0:
                return si91.r(type) + "[]";
            default:
                return udq0.T(type) + "[]";
        }
    }
}
