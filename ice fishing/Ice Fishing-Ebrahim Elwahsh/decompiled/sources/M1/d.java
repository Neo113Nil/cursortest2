package M1;

import N1.g;
import java.security.MessageDigest;
import s1.InterfaceC4992e;

/* loaded from: classes.dex */
public final class d implements InterfaceC4992e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1879b;

    public d(Object obj) {
        g.c(obj, "Argument must not be null");
        this.f1879b = obj;
    }

    @Override // s1.InterfaceC4992e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f1879b.toString().getBytes(InterfaceC4992e.f40420a));
    }

    @Override // s1.InterfaceC4992e
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f1879b.equals(((d) obj).f1879b);
        }
        return false;
    }

    @Override // s1.InterfaceC4992e
    public final int hashCode() {
        return this.f1879b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f1879b + '}';
    }
}
