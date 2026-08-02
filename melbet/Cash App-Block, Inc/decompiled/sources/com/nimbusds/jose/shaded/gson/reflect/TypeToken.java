package com.nimbusds.jose.shaded.gson.reflect;

import com.nimbusds.jose.shaded.gson.internal.GsonTypes;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class TypeToken {
    public final int hashCode;
    public final Class rawType;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1030type;

    public TypeToken(Type type2) {
        Objects.requireNonNull(type2);
        Type canonicalize = GsonTypes.canonicalize(type2);
        this.f1030type = canonicalize;
        this.rawType = GsonTypes.getRawType(canonicalize);
        this.hashCode = canonicalize.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return GsonTypes.equals(this.f1030type, ((TypeToken) obj).f1030type);
        }
        return false;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return GsonTypes.typeToString(this.f1030type);
    }
}
