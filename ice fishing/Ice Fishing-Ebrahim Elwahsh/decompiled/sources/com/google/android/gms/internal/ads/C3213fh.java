package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.fh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3213fh {

    /* renamed from: a, reason: collision with root package name */
    public final C3675oC f30746a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f30747b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f30748c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f30749d;

    public C3213fh(C3675oC c3675oC) {
        this.f30746a = c3675oC;
        C3751ph c3751ph = C3751ph.f33430e;
        this.f30749d = false;
    }

    public final C3751ph a(C3751ph c3751ph) {
        if (c3751ph.equals(C3751ph.f33430e)) {
            throw new C2894Zh("Unhandled input format:", c3751ph);
        }
        int i = 0;
        while (true) {
            C3675oC c3675oC = this.f30746a;
            if (i >= c3675oC.f33117w) {
                return c3751ph;
            }
            InterfaceC3050ci interfaceC3050ci = (InterfaceC3050ci) c3675oC.get(i);
            C3751ph b9 = interfaceC3050ci.b(c3751ph);
            if (interfaceC3050ci.i()) {
                PA.T(!b9.equals(r0));
                c3751ph = b9;
            }
            i++;
        }
    }

    public final boolean b() {
        return !this.f30747b.isEmpty();
    }

    public final boolean c() {
        return this.f30749d && ((InterfaceC3050ci) this.f30747b.get(e())).e() && !this.f30748c[e()].hasRemaining();
    }

    public final void d(ByteBuffer byteBuffer) {
        boolean z8;
        do {
            int i = 0;
            z8 = false;
            while (i <= e()) {
                if (!this.f30748c[i].hasRemaining()) {
                    ArrayList arrayList = this.f30747b;
                    InterfaceC3050ci interfaceC3050ci = (InterfaceC3050ci) arrayList.get(i);
                    if (!interfaceC3050ci.e()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f30748c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC3050ci.f29732a;
                        long remaining = byteBuffer2.remaining();
                        interfaceC3050ci.a(byteBuffer2);
                        this.f30748c[i] = interfaceC3050ci.f();
                        boolean z9 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.f30748c[i].hasRemaining()) {
                            z9 = false;
                        }
                        z8 |= z9;
                    } else if (!this.f30748c[i].hasRemaining() && i < e()) {
                        ((InterfaceC3050ci) arrayList.get(i + 1)).c();
                    }
                }
                i++;
            }
        } while (z8);
    }

    public final int e() {
        return this.f30748c.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3213fh) {
            C3675oC c3675oC = this.f30746a;
            int i = c3675oC.f33117w;
            C3675oC c3675oC2 = ((C3213fh) obj).f30746a;
            if (i == c3675oC2.f33117w) {
                for (int i4 = 0; i4 < c3675oC.f33117w; i4++) {
                    if (c3675oC.get(i4) == c3675oC2.get(i4)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f30746a.hashCode();
    }
}
