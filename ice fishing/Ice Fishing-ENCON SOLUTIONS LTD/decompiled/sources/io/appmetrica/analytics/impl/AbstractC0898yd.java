package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0898yd extends Xe implements InterfaceC0802ul {
    public AbstractC0898yd(Ha ha, String str) {
        super(ha, str);
    }

    public final String c(String str, String str2) {
        return this.f5393a.getString(f(str), str2);
    }

    public final InterfaceC0802ul d(String str, String str2) {
        return (InterfaceC0802ul) b(f(str), str2);
    }

    public final boolean e(String str) {
        return this.f5393a.a(f(str));
    }

    public abstract String f(String str);

    public InterfaceC0802ul g(String str) {
        return (InterfaceC0802ul) d(f(str));
    }

    public AbstractC0898yd(Ha ha) {
        this(ha, null);
    }

    public final InterfaceC0802ul d(String str, int i2) {
        return (InterfaceC0802ul) b(f(str), i2);
    }

    public final int c(String str, int i2) {
        return this.f5393a.getInt(f(str), i2);
    }

    public final InterfaceC0802ul d(String str, long j2) {
        return (InterfaceC0802ul) b(f(str), j2);
    }

    public final InterfaceC0802ul d(String str, boolean z2) {
        return (InterfaceC0802ul) b(f(str), z2);
    }

    public final long c(String str, long j2) {
        return this.f5393a.getLong(f(str), j2);
    }

    public final boolean c(String str, boolean z2) {
        return this.f5393a.getBoolean(f(str), z2);
    }
}
