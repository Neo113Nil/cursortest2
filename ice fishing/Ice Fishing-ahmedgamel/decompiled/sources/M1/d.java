package M1;

import N1.g;
import java.security.MessageDigest;
import s1.InterfaceC4970e;

/* loaded from: classes.dex */
public final class d implements InterfaceC4970e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1825b;

    public d(Object obj) {
        g.c(obj, "Argument must not be null");
        this.f1825b = obj;
    }

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f1825b.toString().getBytes(InterfaceC4970e.f40451a));
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f1825b.equals(((d) obj).f1825b);
        }
        return false;
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        return this.f1825b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f1825b + '}';
    }
}
