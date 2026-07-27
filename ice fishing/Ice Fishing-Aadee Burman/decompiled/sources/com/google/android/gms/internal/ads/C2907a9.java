package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.a9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2907a9 extends PushbackInputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3481ku f29026n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2907a9(C3481ku c3481ku, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        Objects.requireNonNull(c3481ku);
        this.f29026n = c3481ku;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        ((com.bumptech.glide.manager.p) this.f29026n.f31665w).g();
        super.close();
    }
}
