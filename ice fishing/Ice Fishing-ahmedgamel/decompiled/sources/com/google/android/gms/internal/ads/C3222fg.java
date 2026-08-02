package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.math.BigInteger;
import java.util.HashSet;
import r2.C4906k;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.fg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3222fg implements B8 {

    /* renamed from: u, reason: collision with root package name */
    public final C5140B f31069u;

    /* renamed from: v, reason: collision with root package name */
    public final S0.c f31070v;

    /* renamed from: w, reason: collision with root package name */
    public final C3115dg f31071w;

    /* renamed from: n, reason: collision with root package name */
    public final Object f31068n = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f31072x = new HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final HashSet f31073y = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public boolean f31074z = false;

    public C3222fg(String str, C5140B c5140b) {
        this.f31071w = new C3115dg(str, c5140b);
        this.f31069u = c5140b;
        S0.c cVar = new S0.c(15, false);
        cVar.f2902u = BigInteger.ONE;
        cVar.f2903v = "0";
        this.f31070v = cVar;
    }

    public final void a(C2893Yf c2893Yf) {
        synchronized (this.f31068n) {
            this.f31072x.add(c2893Yf);
        }
    }

    @Override // com.google.android.gms.internal.ads.B8
    public final void e0(boolean z6) {
        long j6;
        int i;
        C4906k.f40186C.f40198k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (z6) {
            C5140B c5140b = this.f31069u;
            c5140b.i();
            synchronized (c5140b.f41599a) {
                j6 = c5140b.f41612o;
            }
            if (currentTimeMillis - j6 > ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32769C1)).longValue()) {
                this.f31071w.f30567d = -1;
            } else {
                C3115dg c3115dg = this.f31071w;
                c5140b.i();
                synchronized (c5140b.f41599a) {
                    i = c5140b.f41614q;
                }
                c3115dg.f30567d = i;
            }
            this.f31074z = true;
            return;
        }
        C5140B c5140b2 = this.f31069u;
        c5140b2.i();
        synchronized (c5140b2.f41599a) {
            try {
                if (c5140b2.f41612o != currentTimeMillis) {
                    c5140b2.f41612o = currentTimeMillis;
                    SharedPreferences.Editor editor = c5140b2.f41605g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", currentTimeMillis);
                        c5140b2.f41605g.apply();
                    }
                    c5140b2.j();
                }
            } finally {
            }
        }
        int i4 = this.f31071w.f30567d;
        c5140b2.i();
        synchronized (c5140b2.f41599a) {
            try {
                if (c5140b2.f41614q == i4) {
                    return;
                }
                c5140b2.f41614q = i4;
                SharedPreferences.Editor editor2 = c5140b2.f41605g;
                if (editor2 != null) {
                    editor2.putInt("request_in_session_count", i4);
                    c5140b2.f41605g.apply();
                }
                c5140b2.j();
            } finally {
            }
        }
    }
}
