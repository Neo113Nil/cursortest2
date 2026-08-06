package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496j0 {

    /* renamed from: a, reason: collision with root package name */
    public Fc f6234a;

    /* renamed from: b, reason: collision with root package name */
    public long f6235b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6236c;

    /* renamed from: d, reason: collision with root package name */
    public final C0724rl f6237d;

    public C0496j0(String str, long j2, C0724rl c0724rl) {
        this.f6235b = j2;
        try {
            this.f6234a = new Fc(str);
        } catch (Throwable unused) {
            this.f6234a = new Fc();
        }
        this.f6237d = c0724rl;
    }

    public final synchronized void a(Pair pair) {
        if (this.f6237d.b(this.f6234a, (String) pair.first, (String) pair.second)) {
            this.f6236c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f6234a.size() + ". Is changed " + this.f6236c + ". Current revision " + this.f6235b;
    }

    public final synchronized C0471i0 a() {
        try {
            if (this.f6236c) {
                this.f6235b++;
                this.f6236c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C0471i0(AbstractC0430gb.b(this.f6234a), this.f6235b);
    }
}
