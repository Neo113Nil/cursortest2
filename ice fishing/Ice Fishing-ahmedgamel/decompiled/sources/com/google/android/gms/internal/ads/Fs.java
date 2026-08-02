package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Fs {

    /* renamed from: a, reason: collision with root package name */
    public final int f25644a;

    /* renamed from: b, reason: collision with root package name */
    public int f25645b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25646c;

    /* renamed from: d, reason: collision with root package name */
    public long f25647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4323b f25648e;

    public Fs(C4323b c4323b, int i) {
        Objects.requireNonNull(c4323b);
        this.f25648e = c4323b;
        this.f25644a = i;
    }

    public final void a() {
        C4323b c4323b = this.f25648e;
        int w12 = ((PN) c4323b.f36417a).w1();
        PN pn = (PN) c4323b.f36417a;
        boolean A12 = pn.A1();
        C3235ft c3235ft = (C3235ft) c4323b.f36421e;
        if (!A12 || pn.u1() == 1 || pn.u1() == 4 || w12 == 0 || w12 == 1) {
            if (this.f25646c) {
                c3235ft.d(4);
            }
            this.f25646c = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = this.f25646c;
        int i = this.f25644a;
        if (!z6 || this.f25645b != w12) {
            this.f25646c = true;
            this.f25647d = elapsedRealtime;
            this.f25645b = w12;
            c3235ft.d(4);
            c3235ft.f31231a.sendEmptyMessageDelayed(4, i);
            return;
        }
        if (elapsedRealtime - this.f25647d >= i) {
            Us us = new Us(4, i);
            HN hn = (HN) c4323b.f36419c;
            hn.getClass();
            hn.f26036n.W1(new DN(2, us, 1003));
        }
    }
}
