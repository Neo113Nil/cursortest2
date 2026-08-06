package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Hl {

    /* renamed from: a, reason: collision with root package name */
    public final C0662pa f4485a = new C0662pa();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4486b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public C0415fm f4487c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Fl f4488d = new Fl(this);

    public static final Hl a() {
        return Gl.f4442a;
    }

    public final Am a(Context context, Q4 q4, Zl zl) {
        Am am = (Am) this.f4486b.get(q4.f4950a);
        boolean z2 = true;
        if (am == null) {
            synchronized (this.f4486b) {
                try {
                    am = (Am) this.f4486b.get(q4.f4950a);
                    if (am == null) {
                        am = new Am(new Bm(context, q4.f4950a, zl, this.f4488d));
                        am.f();
                        this.f4486b.put(q4.f4950a, am);
                        z2 = false;
                    }
                } finally {
                }
            }
        }
        if (z2) {
            am.a(zl);
        }
        return am;
    }

    public final void a(Q4 q4, Ql ql) {
        synchronized (this.f4486b) {
            try {
                this.f4485a.a(q4.f4950a, ql);
                C0415fm c0415fm = this.f4487c;
                if (c0415fm != null) {
                    ql.a(c0415fm);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
