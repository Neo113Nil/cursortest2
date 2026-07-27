package u1;

import java.security.MessageDigest;
import s1.InterfaceC4992e;

/* renamed from: u1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5104d implements InterfaceC4992e {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4992e f41071b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4992e f41072c;

    public C5104d(InterfaceC4992e interfaceC4992e, InterfaceC4992e interfaceC4992e2) {
        this.f41071b = interfaceC4992e;
        this.f41072c = interfaceC4992e2;
    }

    @Override // s1.InterfaceC4992e
    public final void a(MessageDigest messageDigest) {
        this.f41071b.a(messageDigest);
        this.f41072c.a(messageDigest);
    }

    @Override // s1.InterfaceC4992e
    public final boolean equals(Object obj) {
        if (obj instanceof C5104d) {
            C5104d c5104d = (C5104d) obj;
            if (this.f41071b.equals(c5104d.f41071b) && this.f41072c.equals(c5104d.f41072c)) {
                return true;
            }
        }
        return false;
    }

    @Override // s1.InterfaceC4992e
    public final int hashCode() {
        return this.f41072c.hashCode() + (this.f41071b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f41071b + ", signature=" + this.f41072c + '}';
    }
}
