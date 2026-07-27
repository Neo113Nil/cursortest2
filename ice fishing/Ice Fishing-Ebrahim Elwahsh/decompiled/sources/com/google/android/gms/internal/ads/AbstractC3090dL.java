package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.dL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3090dL implements Cloneable {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC3199fL f29999n;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC3199fL f30000u;

    public AbstractC3090dL(AbstractC3199fL abstractC3199fL) {
        this.f29999n = abstractC3199fL;
        if (abstractC3199fL.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f30000u = abstractC3199fL.p();
    }

    public static void l(int i, List list) {
        int size = list.size() - i;
        String d2 = AbstractC5051n.d(size, "Element at index ", " is null.", new StringBuilder(String.valueOf(size).length() + 26));
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(d2);
            }
            list.remove(size2);
        }
    }

    public final void a(byte[] bArr, YK yk) {
        int length = bArr.length;
        h();
        try {
            IL.f25547c.a(this.f30000u.getClass()).d(this.f30000u, bArr, 0, length, new LK(yk));
        } catch (C3845rL e6) {
            throw e6;
        } catch (IOException e9) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
        } catch (IndexOutOfBoundsException unused) {
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final Object clone() {
        AbstractC3090dL abstractC3090dL = (AbstractC3090dL) this.f29999n.w(5, null);
        abstractC3090dL.f30000u = i();
        return abstractC3090dL;
    }

    public final void h() {
        if (this.f30000u.h()) {
            return;
        }
        AbstractC3199fL p6 = this.f29999n.p();
        IL.f25547c.a(p6.getClass()).e(p6, this.f30000u);
        this.f30000u = p6;
    }

    public final AbstractC3199fL i() {
        if (!this.f30000u.h()) {
            return this.f30000u;
        }
        this.f30000u.q();
        return this.f30000u;
    }

    public final AbstractC3199fL j() {
        AbstractC3199fL i = i();
        i.getClass();
        if (AbstractC3199fL.x(i, true)) {
            return i;
        }
        throw new WL();
    }

    public final AbstractC3090dL k(AbstractC3199fL abstractC3199fL) {
        if (this.f29999n.equals(abstractC3199fL)) {
            return this;
        }
        h();
        AbstractC3199fL abstractC3199fL2 = this.f30000u;
        IL.f25547c.a(abstractC3199fL2.getClass()).e(abstractC3199fL2, abstractC3199fL);
        return this;
    }
}
