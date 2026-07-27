package M1;

import N1.p;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import s1.InterfaceC4992e;

/* loaded from: classes.dex */
public final class a implements InterfaceC4992e {

    /* renamed from: b, reason: collision with root package name */
    public final int f1875b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4992e f1876c;

    public a(int i, InterfaceC4992e interfaceC4992e) {
        this.f1875b = i;
        this.f1876c = interfaceC4992e;
    }

    @Override // s1.InterfaceC4992e
    public final void a(MessageDigest messageDigest) {
        this.f1876c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f1875b).array());
    }

    @Override // s1.InterfaceC4992e
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f1875b == aVar.f1875b && this.f1876c.equals(aVar.f1876c)) {
                return true;
            }
        }
        return false;
    }

    @Override // s1.InterfaceC4992e
    public final int hashCode() {
        return p.h(this.f1875b, this.f1876c);
    }
}
