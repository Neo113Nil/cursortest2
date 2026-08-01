package M1;

import N1.p;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import s1.InterfaceC4970e;

/* loaded from: classes.dex */
public final class a implements InterfaceC4970e {

    /* renamed from: b, reason: collision with root package name */
    public final int f1821b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4970e f1822c;

    public a(int i, InterfaceC4970e interfaceC4970e) {
        this.f1821b = i;
        this.f1822c = interfaceC4970e;
    }

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        this.f1822c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f1821b).array());
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f1821b == aVar.f1821b && this.f1822c.equals(aVar.f1822c)) {
                return true;
            }
        }
        return false;
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        return p.h(this.f1821b, this.f1822c);
    }
}
