package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* loaded from: classes.dex */
public class B8 implements StateSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final StateSerializer f4194a;

    /* renamed from: b, reason: collision with root package name */
    public final AESEncrypter f4195b;

    public B8(StateSerializer<Object> stateSerializer, AESEncrypter aESEncrypter) {
        this.f4194a = stateSerializer;
        this.f4195b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return this.f4194a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final byte[] toByteArray(Object obj) {
        try {
            return this.f4195b.encrypt(this.f4194a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object toState(byte[] bArr) {
        try {
            return this.f4194a.toState(this.f4195b.decrypt(bArr));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
