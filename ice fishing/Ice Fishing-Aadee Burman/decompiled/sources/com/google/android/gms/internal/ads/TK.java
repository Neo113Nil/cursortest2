package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class TK implements Cloneable {

    /* renamed from: n, reason: collision with root package name */
    public final VK f27720n;

    /* renamed from: u, reason: collision with root package name */
    public VK f27721u;

    public TK(VK vk) {
        this.f27720n = vk;
        if (vk.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f27721u = vk.p();
    }

    public static void l(int i, List list) {
        int size = list.size() - i;
        String d2 = u1.h.d(size, "Element at index ", " is null.", new StringBuilder(String.valueOf(size).length() + 26));
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(d2);
            }
            list.remove(size2);
        }
    }

    public final void a(byte[] bArr, PK pk) {
        int length = bArr.length;
        h();
        try {
            C4156xL.f34990c.a(this.f27721u.getClass()).f(this.f27721u, bArr, 0, length, new CK(pk));
        } catch (C3295hL e9) {
            throw e9;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final Object clone() {
        TK tk = (TK) this.f27720n.w(5, null);
        tk.f27721u = i();
        return tk;
    }

    public final void h() {
        if (this.f27721u.h()) {
            return;
        }
        VK p9 = this.f27720n.p();
        C4156xL.f34990c.a(p9.getClass()).d(p9, this.f27721u);
        this.f27721u = p9;
    }

    public final VK i() {
        if (!this.f27721u.h()) {
            return this.f27721u;
        }
        this.f27721u.q();
        return this.f27721u;
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
        if (this.f27720n.equals(vk)) {
            return this;
        }
        h();
        VK vk2 = this.f27721u;
        C4156xL.f34990c.a(vk2.getClass()).d(vk2, vk);
        return this;
    }
}
