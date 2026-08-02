package com.datadog.android.core.internal.persistence.tlvformat;

import com.datadog.android.api.InternalLogger;

/* loaded from: classes10.dex */
public final class TLVBlock {
    public final byte[] data;

    /* renamed from: type, reason: collision with root package name */
    public final TLVBlockType f947type;

    public TLVBlock(TLVBlockType tLVBlockType, byte[] bArr, InternalLogger internalLogger) {
        tLVBlockType.getClass();
        bArr.getClass();
        internalLogger.getClass();
        this.f947type = tLVBlockType;
        this.data = bArr;
    }
}
