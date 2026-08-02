package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0608p0 {
    public Ae a;
    public long b;
    public boolean c;
    public final Po d;

    public C0608p0(String str, long j, Po po) {
        this.b = j;
        try {
            this.a = new Ae(str);
        } catch (Throwable unused) {
            this.a = new Ae();
        }
        this.d = po;
    }

    public final synchronized C0579o0 a() {
        try {
            if (this.c) {
                this.b++;
                this.c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C0579o0(Vc.c(this.a), this.b);
    }

    public final synchronized String toString() {
        return "Map size " + this.a.size() + ". Is changed " + this.c + ". Current revision " + this.b;
    }

    public final synchronized void a(Pair pair) {
        if (this.d.b(this.a, (String) pair.first, (String) pair.second)) {
            this.c = true;
        }
    }
}
