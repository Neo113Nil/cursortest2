package com.google.crypto.tink.mac;

import androidx.room.TransactorKt;
import com.google.crypto.tink.util.Bytes;

/* loaded from: classes.dex */
public abstract class MacKey extends TransactorKt {
    public abstract Bytes getOutputPrefix();
}
