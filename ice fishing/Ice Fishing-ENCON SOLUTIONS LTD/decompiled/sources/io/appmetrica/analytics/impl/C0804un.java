package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.un, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804un implements TempCacheStorage.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f7026a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7027b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7028c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f7029d;

    public C0804un(long j2, String str, long j3, byte[] bArr) {
        this.f7026a = j2;
        this.f7027b = str;
        this.f7028c = j3;
        this.f7029d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0804un.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C0804un c0804un = (C0804un) obj;
        if (this.f7026a == c0804un.f7026a && kotlin.jvm.internal.i.a(this.f7027b, c0804un.f7027b) && this.f7028c == c0804un.f7028c) {
            return Arrays.equals(this.f7029d, c0804un.f7029d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.f7029d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f7026a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.f7027b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f7028c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7029d) + ((Long.hashCode(this.f7028c) + C1.a.e(this.f7027b, Long.hashCode(this.f7026a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "TempCacheEntry(id=" + this.f7026a + ", scope='" + this.f7027b + "', timestamp=" + this.f7028c + ", data=array[" + this.f7029d.length + "])";
    }
}
