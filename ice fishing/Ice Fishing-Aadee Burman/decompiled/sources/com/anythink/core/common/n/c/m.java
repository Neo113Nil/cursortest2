package com.anythink.core.common.n.c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class m implements w {

    /* renamed from: a, reason: collision with root package name */
    private final e f15886a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f15887b;

    /* renamed from: c, reason: collision with root package name */
    private int f15888c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15889d;

    private m(w wVar, Inflater inflater) {
        this(n.a(wVar), inflater);
    }

    private boolean b() {
        if (!this.f15887b.needsInput()) {
            return false;
        }
        c();
        if (this.f15887b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f15886a.g()) {
            return true;
        }
        s sVar = this.f15886a.c().f15846b;
        int i = sVar.f15916e;
        int i6 = sVar.f15915d;
        int i9 = i - i6;
        this.f15888c = i9;
        this.f15887b.setInput(sVar.f15914c, i6, i9);
        return false;
    }

    private void c() {
        int i = this.f15888c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f15887b.getRemaining();
        this.f15888c -= remaining;
        this.f15886a.i(remaining);
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f15886a.a();
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j6) {
        boolean z3;
        if (j6 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
        }
        if (this.f15889d) {
            throw new IllegalStateException("closed");
        }
        if (j6 == 0) {
            return 0L;
        }
        do {
            z3 = false;
            if (this.f15887b.needsInput()) {
                c();
                if (this.f15887b.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                if (this.f15886a.g()) {
                    z3 = true;
                } else {
                    s sVar = this.f15886a.c().f15846b;
                    int i = sVar.f15916e;
                    int i6 = sVar.f15915d;
                    int i9 = i - i6;
                    this.f15888c = i9;
                    this.f15887b.setInput(sVar.f15914c, i6, i9);
                }
            }
            try {
                s g4 = cVar.g(1);
                int inflate = this.f15887b.inflate(g4.f15914c, g4.f15916e, (int) Math.min(j6, 8192 - g4.f15916e));
                if (inflate > 0) {
                    g4.f15916e += inflate;
                    long j9 = inflate;
                    cVar.f15847c += j9;
                    return j9;
                }
                if (!this.f15887b.finished() && !this.f15887b.needsDictionary()) {
                }
                c();
                if (g4.f15915d != g4.f15916e) {
                    return -1L;
                }
                cVar.f15846b = g4.c();
                t.a(g4);
                return -1L;
            } catch (DataFormatException e9) {
                throw new IOException(e9);
            }
        } while (!z3);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15889d) {
            return;
        }
        this.f15887b.end();
        this.f15889d = true;
        this.f15886a.close();
    }

    public m(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f15886a = eVar;
        this.f15887b = inflater;
    }
}
