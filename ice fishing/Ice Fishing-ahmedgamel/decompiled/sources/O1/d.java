package O1;

import P1.g;
import java.security.MessageDigest;
import u1.InterfaceC5066e;

/* loaded from: classes.dex */
public final class d implements InterfaceC5066e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f2251b;

    public d(Object obj) {
        g.c(obj, "Argument must not be null");
        this.f2251b = obj;
    }

    @Override // u1.InterfaceC5066e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f2251b.toString().getBytes(InterfaceC5066e.f41005a));
    }

    @Override // u1.InterfaceC5066e
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f2251b.equals(((d) obj).f2251b);
        }
        return false;
    }

    @Override // u1.InterfaceC5066e
    public final int hashCode() {
        return this.f2251b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f2251b + '}';
    }
}
