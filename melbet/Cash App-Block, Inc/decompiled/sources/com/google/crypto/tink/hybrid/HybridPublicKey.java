package com.google.crypto.tink.hybrid;

import androidx.room.TransactorKt;
import com.google.crypto.tink.util.Bytes;

/* loaded from: classes.dex */
public abstract class HybridPublicKey extends TransactorKt {
    public abstract Bytes getOutputPrefix();
}
