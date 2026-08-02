package io.appmetrica.analytics.impl;

import defpackage.f1d;
import defpackage.jj4;
import defpackage.k5r;
import defpackage.tlm;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.zq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0847zq implements TempCacheStorage.Entry {
    public final long a;
    public final String b;
    public final long c;
    public final byte[] d;

    public C0847zq(long j, @NotNull String str, long j2, @NotNull byte[] bArr) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0847zq.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            jj4.j("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
            return false;
        }
        C0847zq c0847zq = (C0847zq) obj;
        if (this.a == c0847zq.a && Intrinsics.d(this.b, c0847zq.b) && this.c == c0847zq.c) {
            return Arrays.equals(this.d, c0847zq.d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final byte[] getData() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final String getScope() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + tlm.c(this.c, k5r.c(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TempCacheEntry(id=");
        sb.append(this.a);
        sb.append(", scope='");
        sb.append(this.b);
        sb.append("', timestamp=");
        sb.append(this.c);
        sb.append(", data=array[");
        return f1d.i(sb, this.d.length, "])");
    }
}
