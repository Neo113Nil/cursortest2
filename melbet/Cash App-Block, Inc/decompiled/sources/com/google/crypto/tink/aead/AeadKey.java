package com.google.crypto.tink.aead;

import androidx.room.TransactorKt;
import com.google.crypto.tink.util.Bytes;

/* loaded from: classes.dex */
public abstract class AeadKey extends TransactorKt {
    public abstract Bytes getOutputPrefix();
}
