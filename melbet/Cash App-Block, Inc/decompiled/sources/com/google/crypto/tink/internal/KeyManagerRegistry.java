package com.google.crypto.tink.internal;

import bo.app.re$$ExternalSyntheticOutline0;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class KeyManagerRegistry {
    public static final KeyManagerRegistry GLOBAL_INSTANCE;
    public static final Logger logger = Logger.getLogger(KeyManagerRegistry.class.getName());
    public ConcurrentHashMap keyManagerMap;
    public ConcurrentHashMap newKeyAllowedMap;

    static {
        KeyManagerRegistry keyManagerRegistry = new KeyManagerRegistry();
        keyManagerRegistry.keyManagerMap = new ConcurrentHashMap();
        keyManagerRegistry.newKeyAllowedMap = new ConcurrentHashMap();
        GLOBAL_INSTANCE = keyManagerRegistry;
    }

    public final LegacyKeyManagerImpl getKeyManager(Class cls, String str) {
        LegacyKeyManagerImpl keyManagerOrThrow = getKeyManagerOrThrow(str);
        if (keyManagerOrThrow.primitiveClass.equals(cls)) {
            return keyManagerOrThrow;
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(keyManagerOrThrow.getClass());
        Class cls2 = keyManagerOrThrow.primitiveClass;
        sb.append(", which only supports: ");
        sb.append(cls2);
        throw new GeneralSecurityException(sb.toString());
    }

    public final synchronized LegacyKeyManagerImpl getKeyManagerOrThrow(String str) {
        if (!this.keyManagerMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (LegacyKeyManagerImpl) this.keyManagerMap.get(str);
    }

    public final synchronized void insertKeyManager(LegacyKeyManagerImpl legacyKeyManagerImpl, boolean z) {
        try {
            String str = legacyKeyManagerImpl.typeUrl;
            if (z && this.newKeyAllowedMap.containsKey(str) && !((Boolean) this.newKeyAllowedMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            LegacyKeyManagerImpl legacyKeyManagerImpl2 = (LegacyKeyManagerImpl) this.keyManagerMap.get(str);
            if (legacyKeyManagerImpl2 != null && !legacyKeyManagerImpl2.getClass().equals(legacyKeyManagerImpl.getClass())) {
                logger.warning("Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + legacyKeyManagerImpl2.getClass().getName() + ", cannot be re-registered with " + legacyKeyManagerImpl.getClass().getName());
            }
            this.keyManagerMap.putIfAbsent(str, legacyKeyManagerImpl);
            this.newKeyAllowedMap.put(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void registerKeyManager(LegacyKeyManagerImpl legacyKeyManagerImpl, boolean z) {
        registerKeyManagerWithFipsCompatibility(legacyKeyManagerImpl, 1, z);
    }

    public final synchronized void registerKeyManagerWithFipsCompatibility(LegacyKeyManagerImpl legacyKeyManagerImpl, int i, boolean z) {
        if (!(i != 1 ? re$$ExternalSyntheticOutline0._isCompatible$1(i) : re$$ExternalSyntheticOutline0._isCompatible(i))) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        insertKeyManager(legacyKeyManagerImpl, z);
    }
}
