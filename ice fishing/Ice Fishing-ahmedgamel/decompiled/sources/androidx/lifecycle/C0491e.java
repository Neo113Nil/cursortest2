package androidx.lifecycle;

import S7.AbstractC0410y;
import S7.InterfaceC0408w;
import java.io.Closeable;
import z7.InterfaceC5245i;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491e implements Closeable, InterfaceC0408w {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5245i f5128n;

    public C0491e(InterfaceC5245i context) {
        kotlin.jvm.internal.h.e(context, "context");
        this.f5128n = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC0410y.d(this.f5128n, null);
    }

    @Override // S7.InterfaceC0408w
    public final InterfaceC5245i z() {
        return this.f5128n;
    }
}
