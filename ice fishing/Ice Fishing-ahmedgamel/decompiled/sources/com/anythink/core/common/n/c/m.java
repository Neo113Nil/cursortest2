package com.anythink.core.common.n.c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class m implements w {

    /* renamed from: a, reason: collision with root package name */
    private final e f16673a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f16674b;

    /* renamed from: c, reason: collision with root package name */
    private int f16675c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16676d;

    private m(w wVar, Inflater inflater) {
        this(n.a(wVar), inflater);
    }

    private boolean b() {
        if (!this.f16674b.needsInput()) {
            return false;
        }
        c();
        if (this.f16674b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f16673a.g()) {
            return true;
        }
        s sVar = this.f16673a.c().f16633b;
        int i = sVar.f16703e;
        int i4 = sVar.f16702d;
        int i6 = i - i4;
        this.f16675c = i6;
        this.f16674b.setInput(sVar.f16701c, i4, i6);
        return false;
    }

    private void c() {
        int i = this.f16675c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f16674b.getRemaining();
        this.f16675c -= remaining;
        this.f16673a.i(remaining);
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f16673a.a();
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j6) {
        boolean z6;
        if (j6 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
        }
        if (this.f16676d) {
            throw new IllegalStateException("closed");
        }
        if (j6 == 0) {
            return 0L;
        }
        do {
            z6 = false;
            if (this.f16674b.needsInput()) {
                c();
                if (this.f16674b.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                if (this.f16673a.g()) {
                    z6 = true;
                } else {
                    s sVar = this.f16673a.c().f16633b;
                    int i = sVar.f16703e;
                    int i4 = sVar.f16702d;
                    int i6 = i - i4;
                    this.f16675c = i6;
                    this.f16674b.setInput(sVar.f16701c, i4, i6);
                }
            }
            try {
                s g9 = cVar.g(1);
                int inflate = this.f16674b.inflate(g9.f16701c, g9.f16703e, (int) Math.min(j6, 8192 - g9.f16703e));
                if (inflate > 0) {
                    g9.f16703e += inflate;
                    long j9 = inflate;
                    cVar.f16634c += j9;
                    return j9;
                }
                if (!this.f16674b.finished() && !this.f16674b.needsDictionary()) {
                }
                c();
                if (g9.f16702d != g9.f16703e) {
                    return -1L;
                }
                cVar.f16633b = g9.c();
                t.a(g9);
                return -1L;
            } catch (DataFormatException e9) {
                throw new IOException(e9);
            }
        } while (!z6);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16676d) {
            return;
        }
        this.f16674b.end();
        this.f16676d = true;
        this.f16673a.close();
    }

    public m(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f16673a = eVar;
        this.f16674b = inflater;
    }
}
