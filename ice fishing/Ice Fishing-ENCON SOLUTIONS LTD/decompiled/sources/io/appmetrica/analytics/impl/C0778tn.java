package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.tn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778tn implements TempCacheStorage {

    /* renamed from: a, reason: collision with root package name */
    public final TempCacheStorage f6958a;

    public C0778tn(Context context, Sm sm, TempCacheStorage tempCacheStorage) {
        this.f6958a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return this.f6958a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j2, byte[] bArr) {
        return this.f6958a.put(str, j2, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j2) {
        this.f6958a.remove(j2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j2) {
        this.f6958a.removeOlderThan(str, j2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final Collection<TempCacheStorage.Entry> get(String str, int i2) {
        return this.f6958a.get(str, i2);
    }
}
