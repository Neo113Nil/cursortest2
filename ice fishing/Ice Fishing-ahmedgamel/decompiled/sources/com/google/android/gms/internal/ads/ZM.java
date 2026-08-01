package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class ZM implements Iterator, Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final C4194y5 f28874z = new C4194y5("eof ", 1);

    /* renamed from: n, reason: collision with root package name */
    public AbstractC3870s5 f28875n;

    /* renamed from: u, reason: collision with root package name */
    public C2656Lg f28876u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC4032v5 f28877v = null;

    /* renamed from: w, reason: collision with root package name */
    public long f28878w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f28879x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f28880y = new ArrayList();

    static {
        C2921aN.l(ZM.class);
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InterfaceC4032v5 next() {
        InterfaceC4032v5 a9;
        InterfaceC4032v5 interfaceC4032v5 = this.f28877v;
        if (interfaceC4032v5 != null && interfaceC4032v5 != f28874z) {
            this.f28877v = null;
            return interfaceC4032v5;
        }
        C2656Lg c2656Lg = this.f28876u;
        if (c2656Lg == null || this.f28878w >= this.f28879x) {
            this.f28877v = f28874z;
            throw new NoSuchElementException();
        }
        try {
            synchronized (c2656Lg) {
                this.f28876u.f26126n.position((int) this.f28878w);
                a9 = this.f28875n.a(this.f28876u, this);
                this.f28878w = this.f28876u.b();
            }
            return a9;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        InterfaceC4032v5 interfaceC4032v5 = this.f28877v;
        C4194y5 c4194y5 = f28874z;
        if (interfaceC4032v5 == c4194y5) {
            return false;
        }
        if (interfaceC4032v5 != null) {
            return true;
        }
        try {
            this.f28877v = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f28877v = c4194y5;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f28880y;
            if (i >= arrayList.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((InterfaceC4032v5) arrayList.get(i)).toString());
            i++;
        }
    }
}
