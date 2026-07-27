package androidx.lifecycle;

import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import java.io.Closeable;
import v7.InterfaceC5138i;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497e implements Closeable, InterfaceC0397w {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5138i f5273n;

    public C0497e(InterfaceC5138i context) {
        kotlin.jvm.internal.h.e(context, "context");
        this.f5273n = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC0399y.d(this.f5273n, null);
    }

    @Override // O7.InterfaceC0397w
    public final InterfaceC5138i z() {
        return this.f5273n;
    }
}
