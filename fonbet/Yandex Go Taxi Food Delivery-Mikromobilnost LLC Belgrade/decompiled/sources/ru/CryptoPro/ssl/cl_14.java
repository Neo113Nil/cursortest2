package ru.CryptoPro.ssl;

import defpackage.ny61;
import defpackage.oyr;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLException;

/* loaded from: classes4.dex */
final class cl_14 {
    public final AbstractCollection a;
    public String[] b;
    public volatile Boolean c;

    public cl_14(String[] strArr) {
        if (strArr == null) {
            ny61.g("CipherSuites may not be null");
            throw null;
        }
        this.a = new ArrayList(strArr.length);
        boolean z = false;
        for (String str : strArr) {
            cl_8 c = cl_8.c(str);
            if (!c.f()) {
                if (!z) {
                    synchronized (cl_14.class) {
                        synchronized (cl_9.class) {
                            cl_9.l.clear();
                        }
                        boolean z2 = cl_73.a;
                        synchronized (cl_73.class) {
                        }
                    }
                    z = true;
                }
                if (!c.f()) {
                    ny61.g(oyr.p("Cannot support ", str, " with currently installed providers"));
                    throw null;
                }
            }
            this.a.add(c);
        }
    }

    public final synchronized String[] a() {
        try {
            if (this.b == null) {
                this.b = new String[this.a.size()];
                Iterator it = this.a.iterator();
                int i = 0;
                while (it.hasNext()) {
                    this.b[i] = ((cl_8) it.next()).a;
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String[]) this.b.clone();
    }

    public boolean g() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((cl_8) it.next()).d()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.a.toString();
    }

    public cl_14(cl_46 cl_46Var) {
        byte[] g = cl_46Var.g();
        if ((g.length & 1) != 0) {
            throw new SSLException("Invalid ClientHello message");
        }
        this.a = new ArrayList(g.length >> 1);
        for (int i = 0; i < g.length; i += 2) {
            this.a.add(cl_8.b(g[i], g[i + 1]));
        }
    }

    public cl_14(AbstractCollection abstractCollection) {
        this.a = abstractCollection;
    }
}
