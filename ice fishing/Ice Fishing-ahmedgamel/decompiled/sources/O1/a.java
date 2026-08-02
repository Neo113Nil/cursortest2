package O1;

import P1.p;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import u1.InterfaceC5066e;

/* loaded from: classes.dex */
public final class a implements InterfaceC5066e {

    /* renamed from: b, reason: collision with root package name */
    public final int f2247b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5066e f2248c;

    public a(int i, InterfaceC5066e interfaceC5066e) {
        this.f2247b = i;
        this.f2248c = interfaceC5066e;
    }

    @Override // u1.InterfaceC5066e
    public final void b(MessageDigest messageDigest) {
        this.f2248c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f2247b).array());
    }

    @Override // u1.InterfaceC5066e
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2247b == aVar.f2247b && this.f2248c.equals(aVar.f2248c)) {
                return true;
            }
        }
        return false;
    }

    @Override // u1.InterfaceC5066e
    public final int hashCode() {
        return p.h(this.f2247b, this.f2248c);
    }
}
