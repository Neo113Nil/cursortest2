package androidx.lifecycle;

import S7.AbstractC0406y;
import S7.InterfaceC0404w;
import java.io.Closeable;
import z7.InterfaceC5272i;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487e implements Closeable, InterfaceC0404w {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5272i f5161n;

    public C0487e(InterfaceC5272i context) {
        kotlin.jvm.internal.h.e(context, "context");
        this.f5161n = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC0406y.d(this.f5161n, null);
    }

    @Override // S7.InterfaceC0404w
    public final InterfaceC5272i z() {
        return this.f5161n;
    }
}
