package w1;

import java.security.MessageDigest;
import u1.InterfaceC5066e;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5136d implements InterfaceC5066e {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5066e f41440b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5066e f41441c;

    public C5136d(InterfaceC5066e interfaceC5066e, InterfaceC5066e interfaceC5066e2) {
        this.f41440b = interfaceC5066e;
        this.f41441c = interfaceC5066e2;
    }

    @Override // u1.InterfaceC5066e
    public final void b(MessageDigest messageDigest) {
        this.f41440b.b(messageDigest);
        this.f41441c.b(messageDigest);
    }

    @Override // u1.InterfaceC5066e
    public final boolean equals(Object obj) {
        if (obj instanceof C5136d) {
            C5136d c5136d = (C5136d) obj;
            if (this.f41440b.equals(c5136d.f41440b) && this.f41441c.equals(c5136d.f41441c)) {
                return true;
            }
        }
        return false;
    }

    @Override // u1.InterfaceC5066e
    public final int hashCode() {
        return this.f41441c.hashCode() + (this.f41440b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f41440b + ", signature=" + this.f41441c + '}';
    }
}
