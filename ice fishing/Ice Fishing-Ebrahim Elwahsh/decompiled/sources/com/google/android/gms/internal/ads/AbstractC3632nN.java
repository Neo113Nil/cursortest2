package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.nN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3632nN implements Iterator, Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final C4099w5 f32852z = new C4099w5("eof ", 1);

    /* renamed from: n, reason: collision with root package name */
    public AbstractC3776q5 f32853n;

    /* renamed from: u, reason: collision with root package name */
    public C2587Hg f32854u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC3883s5 f32855v = null;

    /* renamed from: w, reason: collision with root package name */
    public long f32856w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f32857x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f32858y = new ArrayList();

    static {
        C3686oN.j(AbstractC3632nN.class);
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3883s5 next() {
        InterfaceC3883s5 a9;
        InterfaceC3883s5 interfaceC3883s5 = this.f32855v;
        if (interfaceC3883s5 != null && interfaceC3883s5 != f32852z) {
            this.f32855v = null;
            return interfaceC3883s5;
        }
        C2587Hg c2587Hg = this.f32854u;
        if (c2587Hg == null || this.f32856w >= this.f32857x) {
            this.f32855v = f32852z;
            throw new NoSuchElementException();
        }
        try {
            synchronized (c2587Hg) {
                this.f32854u.f25379n.position((int) this.f32856w);
                a9 = this.f32853n.a(this.f32854u, this);
                this.f32856w = this.f32854u.b();
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
        InterfaceC3883s5 interfaceC3883s5 = this.f32855v;
        C4099w5 c4099w5 = f32852z;
        if (interfaceC3883s5 == c4099w5) {
            return false;
        }
        if (interfaceC3883s5 != null) {
            return true;
        }
        try {
            this.f32855v = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f32855v = c4099w5;
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
            ArrayList arrayList = this.f32858y;
            if (i >= arrayList.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((InterfaceC3883s5) arrayList.get(i)).toString());
            i++;
        }
    }
}
