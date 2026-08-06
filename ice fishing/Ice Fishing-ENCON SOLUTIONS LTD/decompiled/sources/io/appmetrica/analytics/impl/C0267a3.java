package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0267a3 implements InterfaceC0293b3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5544a;

    public C0267a3(int i2) {
        this.f5544a = i2;
    }

    public static InterfaceC0293b3 a(InterfaceC0293b3... interfaceC0293b3Arr) {
        return new C0267a3(b(interfaceC0293b3Arr));
    }

    public static int b(InterfaceC0293b3... interfaceC0293b3Arr) {
        int i2 = 0;
        for (InterfaceC0293b3 interfaceC0293b3 : interfaceC0293b3Arr) {
            if (interfaceC0293b3 != null) {
                i2 = interfaceC0293b3.getBytesTruncated() + i2;
            }
        }
        return i2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0293b3
    public final int getBytesTruncated() {
        return this.f5544a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f5544a + '}';
    }
}
