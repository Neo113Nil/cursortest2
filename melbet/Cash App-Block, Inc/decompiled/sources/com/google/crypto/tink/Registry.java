package com.google.crypto.tink;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.hybrid.HybridPrivateKey;
import com.google.crypto.tink.internal.KeyManagerRegistry;
import com.google.crypto.tink.internal.LegacyKeyManagerImpl;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.prf.Prf;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class Registry {
    static {
        Logger.getLogger(Registry.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(Aead.class);
        hashSet.add(DeterministicAead.class);
        hashSet.add(StreamingAead.class);
        hashSet.add(HybridEncrypt.class);
        hashSet.add(HybridDecrypt.class);
        hashSet.add(Mac.class);
        hashSet.add(Prf.class);
        hashSet.add(PublicKeySign.class);
        hashSet.add(PublicKeyVerify.class);
        Collections.unmodifiableSet(hashSet);
    }

    public static KeyData getPublicKeyData(String str, ByteString byteString) {
        LegacyKeyManagerImpl keyManagerOrThrow = KeyManagerRegistry.GLOBAL_INSTANCE.getKeyManagerOrThrow(str);
        if (!(keyManagerOrThrow instanceof LegacyKeyManagerImpl.LegacyPrivateKeyManagerImpl)) {
            throw new GeneralSecurityException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("manager for key type ", str, " is not a PrivateKeyManager"));
        }
        LegacyKeyManagerImpl.LegacyPrivateKeyManagerImpl legacyPrivateKeyManagerImpl = (LegacyKeyManagerImpl.LegacyPrivateKeyManagerImpl) keyManagerOrThrow;
        ProtoKeySerialization create = ProtoKeySerialization.create(legacyPrivateKeyManagerImpl.typeUrl, byteString, legacyPrivateKeyManagerImpl.keyMaterialType, OutputPrefixType.RAW, null);
        MutableSerializationRegistry mutableSerializationRegistry = MutableSerializationRegistry.GLOBAL_INSTANCE;
        TransactorKt parseKey = mutableSerializationRegistry.parseKey(create);
        if (!(parseKey instanceof HybridPrivateKey)) {
            a$$ExternalSyntheticBUOutline0.m$6("Key not private key");
            return null;
        }
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) mutableSerializationRegistry.serializeKey(((HybridPrivateKey) parseKey).getPublicKey());
        KeyData.Builder newBuilder = KeyData.newBuilder();
        String str2 = protoKeySerialization.typeUrl;
        newBuilder.copyOnWrite();
        KeyData.access$100((KeyData) newBuilder.instance, str2);
        ByteString byteString2 = protoKeySerialization.value;
        newBuilder.copyOnWrite();
        KeyData.access$400((KeyData) newBuilder.instance, byteString2);
        KeyData.KeyMaterialType keyMaterialType = protoKeySerialization.keyMaterialType;
        newBuilder.copyOnWrite();
        KeyData.access$700((KeyData) newBuilder.instance, keyMaterialType);
        return (KeyData) newBuilder.build();
    }
}
