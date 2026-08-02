package com.google.crypto.tink.internal;

import androidx.room.TransactorKt;
import com.google.android.gms.common.api.internal.zaaa;
import com.google.crypto.tink.aead.XAesGcmKey$$ExternalSyntheticBUOutline0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PrimitiveRegistry {
    public final HashMap primitiveConstructorMap;
    public final HashMap primitiveWrapperMap;

    public final class Builder {
        public HashMap primitiveConstructorMap;
        public HashMap primitiveWrapperMap;

        public Builder(PrimitiveRegistry primitiveRegistry) {
            this.primitiveConstructorMap = new HashMap(primitiveRegistry.primitiveConstructorMap);
            this.primitiveWrapperMap = new HashMap(primitiveRegistry.primitiveWrapperMap);
        }

        public void add(Enum r2, Object obj) {
            this.primitiveConstructorMap.put(r2, obj);
            this.primitiveWrapperMap.put(obj, r2);
        }

        public zaaa build() {
            return new zaaa(Collections.unmodifiableMap(this.primitiveConstructorMap), Collections.unmodifiableMap(this.primitiveWrapperMap));
        }
    }

    public final class PrimitiveConstructorIndex {
        public final Class keyClass;
        public final Class primitiveClass;

        public PrimitiveConstructorIndex(Class cls, Class cls2) {
            this.keyClass = cls;
            this.primitiveClass = cls2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PrimitiveConstructorIndex)) {
                return false;
            }
            PrimitiveConstructorIndex primitiveConstructorIndex = (PrimitiveConstructorIndex) obj;
            return primitiveConstructorIndex.keyClass.equals(this.keyClass) && primitiveConstructorIndex.primitiveClass.equals(this.primitiveClass);
        }

        public final int hashCode() {
            return Objects.hash(this.keyClass, this.primitiveClass);
        }

        public final String toString() {
            return this.keyClass.getSimpleName() + " with primitive type: " + this.primitiveClass.getSimpleName();
        }
    }

    public PrimitiveRegistry(Builder builder) {
        this.primitiveConstructorMap = new HashMap(builder.primitiveConstructorMap);
        this.primitiveWrapperMap = new HashMap(builder.primitiveWrapperMap);
    }

    public final Object getPrimitiveWithoutReparsing(TransactorKt transactorKt, Class cls) {
        PrimitiveConstructorIndex primitiveConstructorIndex = new PrimitiveConstructorIndex(transactorKt.getClass(), cls);
        HashMap hashMap = this.primitiveConstructorMap;
        if (hashMap.containsKey(primitiveConstructorIndex)) {
            return ((PrimitiveConstructor$1) hashMap.get(primitiveConstructorIndex)).val$function.constructPrimitive(transactorKt);
        }
        XAesGcmKey$$ExternalSyntheticBUOutline0.m("No PrimitiveConstructor for ", primitiveConstructorIndex, " available, see https://developers.google.com/tink/faq/registration_errors");
        return null;
    }
}
