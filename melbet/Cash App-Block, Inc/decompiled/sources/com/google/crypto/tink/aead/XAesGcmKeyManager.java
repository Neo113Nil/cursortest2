package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda2;

/* loaded from: classes.dex */
public abstract class XAesGcmKeyManager {
    public static final HmacKeyManager$$ExternalSyntheticLambda2 KEY_CREATOR = new HmacKeyManager$$ExternalSyntheticLambda2(8);
    public static final PrimitiveConstructor$1 X_AES_GCM_PRIMITVE_CONSTRUCTOR = new PrimitiveConstructor$1(XAesGcmKey.class, Aead.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(16));
}
