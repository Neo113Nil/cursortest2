package com.google.crypto.tink.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.internal.PrimitiveRegistry;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class MutablePrimitiveRegistry {
    public static final MutablePrimitiveRegistry globalInstance = new MutablePrimitiveRegistry();
    public final AtomicReference registry;

    public MutablePrimitiveRegistry() {
        PrimitiveRegistry.Builder builder = new PrimitiveRegistry.Builder();
        builder.primitiveConstructorMap = new HashMap();
        builder.primitiveWrapperMap = new HashMap();
        this.registry = new AtomicReference(new PrimitiveRegistry(builder));
    }

    public final synchronized void registerPrimitiveConstructor(PrimitiveConstructor$1 primitiveConstructor$1) {
        PrimitiveRegistry.Builder builder = new PrimitiveRegistry.Builder((PrimitiveRegistry) this.registry.get());
        HashMap hashMap = builder.primitiveConstructorMap;
        if (primitiveConstructor$1 != null) {
            PrimitiveRegistry.PrimitiveConstructorIndex primitiveConstructorIndex = new PrimitiveRegistry.PrimitiveConstructorIndex(primitiveConstructor$1.keyClass, primitiveConstructor$1.primitiveClass);
            if (hashMap.containsKey(primitiveConstructorIndex)) {
                PrimitiveConstructor$1 primitiveConstructor$12 = (PrimitiveConstructor$1) hashMap.get(primitiveConstructorIndex);
                if (!primitiveConstructor$12.equals(primitiveConstructor$1) || primitiveConstructor$1 != primitiveConstructor$12) {
                    MacWrapper$$ExternalSyntheticLambda0.m(primitiveConstructorIndex, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
                }
            } else {
                hashMap.put(primitiveConstructorIndex, primitiveConstructor$1);
            }
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("primitive constructor must be non-null");
        }
        this.registry.set(new PrimitiveRegistry(builder));
    }

    public final synchronized void registerPrimitiveWrapper(PrimitiveWrapper primitiveWrapper) {
        PrimitiveRegistry.Builder builder = new PrimitiveRegistry.Builder((PrimitiveRegistry) this.registry.get());
        HashMap hashMap = builder.primitiveWrapperMap;
        Class primitiveClass = primitiveWrapper.getPrimitiveClass();
        if (hashMap.containsKey(primitiveClass)) {
            PrimitiveWrapper primitiveWrapper2 = (PrimitiveWrapper) hashMap.get(primitiveClass);
            if (!primitiveWrapper2.equals(primitiveWrapper) || !primitiveWrapper.equals(primitiveWrapper2)) {
                throw new GeneralSecurityException(Boxes$$ExternalSyntheticOutline1.m(primitiveClass, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"));
            }
        } else {
            hashMap.put(primitiveClass, primitiveWrapper);
        }
        this.registry.set(new PrimitiveRegistry(builder));
    }
}
