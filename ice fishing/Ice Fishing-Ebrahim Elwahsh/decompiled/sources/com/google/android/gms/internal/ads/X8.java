package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class X8 extends PushbackInputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3602mu f28616n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X8(C3602mu c3602mu, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        Objects.requireNonNull(c3602mu);
        this.f28616n = c3602mu;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        ((com.bumptech.glide.manager.o) this.f28616n.f32776w).g();
        super.close();
    }
}
