package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0476n0 {
    public C0432le a;
    public long b;
    public boolean c;
    public final C0702uo d;

    public C0476n0(String str, long j, C0702uo c0702uo) {
        this.b = j;
        try {
            this.a = new C0432le(str);
        } catch (Throwable unused) {
            this.a = new C0432le();
        }
        this.d = c0702uo;
    }

    public final synchronized C0447m0 a() {
        try {
            if (this.c) {
                this.b++;
                this.c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C0447m0(Fc.c(this.a), this.b);
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
