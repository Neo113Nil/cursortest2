package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.a9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2930a9 extends PushbackInputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3504ku f29796n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2930a9(C3504ku c3504ku, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        Objects.requireNonNull(c3504ku);
        this.f29796n = c3504ku;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        ((com.bumptech.glide.manager.o) this.f29796n.f32447w).g();
        super.close();
    }
}
