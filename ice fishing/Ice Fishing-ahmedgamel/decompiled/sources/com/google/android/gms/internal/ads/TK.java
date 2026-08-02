package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public abstract class TK implements Cloneable {

    /* renamed from: n, reason: collision with root package name */
    public final VK f28503n;

    /* renamed from: u, reason: collision with root package name */
    public VK f28504u;

    public TK(VK vk) {
        this.f28503n = vk;
        if (vk.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f28504u = vk.p();
    }

    public static void l(int i, List list) {
        int size = list.size() - i;
        String d9 = AbstractC5128c.d(size, "Element at index ", " is null.", new StringBuilder(String.valueOf(size).length() + 26));
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(d9);
            }
            list.remove(size2);
        }
    }

    public final void a(byte[] bArr, PK pk) {
        int length = bArr.length;
        h();
        try {
            C4179xL.f35771c.a(this.f28504u.getClass()).f(this.f28504u, bArr, 0, length, new CK(pk));
        } catch (C3318hL e9) {
            throw e9;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final Object clone() {
        TK tk = (TK) this.f28503n.w(5, null);
        tk.f28504u = i();
        return tk;
    }

    public final void h() {
        if (this.f28504u.h()) {
            return;
        }
        VK p9 = this.f28503n.p();
        C4179xL.f35771c.a(p9.getClass()).d(p9, this.f28504u);
        this.f28504u = p9;
    }

    public final VK i() {
        if (!this.f28504u.h()) {
            return this.f28504u;
        }
        this.f28504u.q();
        return this.f28504u;
    }

    public final VK j() {
        VK i = i();
        i.getClass();
        if (VK.x(i, true)) {
            return i;
        }
        throw new KL();
    }

    public final TK k(VK vk) {
        if (this.f28503n.equals(vk)) {
            return this;
        }
        h();
        VK vk2 = this.f28504u;
        C4179xL.f35771c.a(vk2.getClass()).d(vk2, vk);
        return this;
    }
}
