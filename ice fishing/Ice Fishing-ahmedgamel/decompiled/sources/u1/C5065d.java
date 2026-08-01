package u1;

import java.security.MessageDigest;
import s1.InterfaceC4970e;

/* renamed from: u1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5065d implements InterfaceC4970e {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4970e f41057b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4970e f41058c;

    public C5065d(InterfaceC4970e interfaceC4970e, InterfaceC4970e interfaceC4970e2) {
        this.f41057b = interfaceC4970e;
        this.f41058c = interfaceC4970e2;
    }

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        this.f41057b.a(messageDigest);
        this.f41058c.a(messageDigest);
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        if (obj instanceof C5065d) {
            C5065d c5065d = (C5065d) obj;
            if (this.f41057b.equals(c5065d.f41057b) && this.f41058c.equals(c5065d.f41058c)) {
                return true;
            }
        }
        return false;
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        return this.f41058c.hashCode() + (this.f41057b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f41057b + ", signature=" + this.f41058c + '}';
    }
}
