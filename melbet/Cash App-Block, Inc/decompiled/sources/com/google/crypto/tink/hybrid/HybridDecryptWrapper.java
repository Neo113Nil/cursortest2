package com.google.crypto.tink.hybrid;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.crypto.tink.internal.PrimitiveWrapper;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.squareup.cash.db.WireAdapter;
import kotlin.reflect.full.KClassifiers;

/* loaded from: classes.dex */
public final class HybridDecryptWrapper implements PrimitiveWrapper {
    public final /* synthetic */ int $r8$classId;
    public static final HybridDecryptWrapper WRAPPER = new HybridDecryptWrapper(0);
    public static final PrimitiveConstructor$1 LEGACY_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(LegacyProtoKey.class, HybridDecrypt.class, new MacWrapper$$ExternalSyntheticLambda0(3));
    public static final HybridDecryptWrapper WRAPPER$1 = new HybridDecryptWrapper(1);
    public static final PrimitiveConstructor$1 LEGACY_PRIMITIVE_CONSTRUCTOR$1 = new PrimitiveConstructor$1(LegacyProtoKey.class, HybridEncrypt.class, new MacWrapper$$ExternalSyntheticLambda0(4));

    public /* synthetic */ HybridDecryptWrapper(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final Class getInputPrimitiveClass() {
        switch (this.$r8$classId) {
            case 0:
                return HybridDecrypt.class;
            default:
                return HybridEncrypt.class;
        }
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final Class getPrimitiveClass() {
        switch (this.$r8$classId) {
            case 0:
                return HybridDecrypt.class;
            default:
                return HybridEncrypt.class;
        }
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final Object wrap(KeysetHandle keysetHandle, PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0) {
        switch (this.$r8$classId) {
            case 0:
                return KClassifiers.create(keysetHandle, primitiveRegistry$$ExternalSyntheticLambda0);
            default:
                keysetHandle.getAnnotationsOrNull();
                KeysetHandle.Entry primary$1 = keysetHandle.getPrimary$1();
                final WireAdapter wireAdapter = new WireAdapter((HybridEncrypt) primitiveRegistry$$ExternalSyntheticLambda0.create(primary$1), primary$1.id);
                return new HybridEncrypt(wireAdapter) { // from class: com.google.crypto.tink.hybrid.internal.WrappedHybridEncrypt$WrappedHybridEncryptImpl
                    public final WireAdapter primary;

                    {
                        this.primary = wireAdapter;
                    }

                    @Override // com.google.crypto.tink.HybridEncrypt
                    public final byte[] encrypt(byte[] bArr) {
                        HybridEncrypt hybridEncrypt = (HybridEncrypt) this.primary.adapter;
                        if (hybridEncrypt != null) {
                            return hybridEncrypt.encrypt(bArr);
                        }
                        a$$ExternalSyntheticBUOutline0.m$6("keyset without primary key");
                        return null;
                    }
                };
        }
    }
}
