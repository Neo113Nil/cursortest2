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
    public static final C4217y5 f29654z = new C4217y5("eof ", 1);

    /* renamed from: n, reason: collision with root package name */
    public AbstractC3893s5 f29655n;

    /* renamed from: u, reason: collision with root package name */
    public C2676Lg f29656u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC4055v5 f29657v = null;

    /* renamed from: w, reason: collision with root package name */
    public long f29658w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f29659x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f29660y = new ArrayList();

    static {
        C2944aN.l(ZM.class);
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InterfaceC4055v5 next() {
        InterfaceC4055v5 a9;
        InterfaceC4055v5 interfaceC4055v5 = this.f29657v;
        if (interfaceC4055v5 != null && interfaceC4055v5 != f29654z) {
            this.f29657v = null;
            return interfaceC4055v5;
        }
        C2676Lg c2676Lg = this.f29656u;
        if (c2676Lg == null || this.f29658w >= this.f29659x) {
            this.f29657v = f29654z;
            throw new NoSuchElementException();
        }
        try {
            synchronized (c2676Lg) {
                this.f29656u.f26923n.position((int) this.f29658w);
                a9 = this.f29655n.a(this.f29656u, this);
                this.f29658w = this.f29656u.b();
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
        InterfaceC4055v5 interfaceC4055v5 = this.f29657v;
        C4217y5 c4217y5 = f29654z;
        if (interfaceC4055v5 == c4217y5) {
            return false;
        }
        if (interfaceC4055v5 != null) {
            return true;
        }
        try {
            this.f29657v = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f29657v = c4217y5;
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
            ArrayList arrayList = this.f29660y;
            if (i >= arrayList.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((InterfaceC4055v5) arrayList.get(i)).toString());
            i++;
        }
    }
}
