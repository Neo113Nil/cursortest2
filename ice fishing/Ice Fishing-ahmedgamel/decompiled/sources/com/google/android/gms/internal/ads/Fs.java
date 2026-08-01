package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Fs {

    /* renamed from: a, reason: collision with root package name */
    public final int f24854a;

    /* renamed from: b, reason: collision with root package name */
    public int f24855b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24856c;

    /* renamed from: d, reason: collision with root package name */
    public long f24857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4300b f24858e;

    public Fs(C4300b c4300b, int i) {
        Objects.requireNonNull(c4300b);
        this.f24858e = c4300b;
        this.f24854a = i;
    }

    public final void a() {
        C4300b c4300b = this.f24858e;
        int w12 = ((PN) c4300b.f35648a).w1();
        PN pn = (PN) c4300b.f35648a;
        boolean A12 = pn.A1();
        C3212ft c3212ft = (C3212ft) c4300b.f35652e;
        if (!A12 || pn.u1() == 1 || pn.u1() == 4 || w12 == 0 || w12 == 1) {
            if (this.f24856c) {
                c3212ft.d(4);
            }
            this.f24856c = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = this.f24856c;
        int i = this.f24854a;
        if (!z3 || this.f24855b != w12) {
            this.f24856c = true;
            this.f24857d = elapsedRealtime;
            this.f24855b = w12;
            c3212ft.d(4);
            c3212ft.f30468a.sendEmptyMessageDelayed(4, i);
            return;
        }
        if (elapsedRealtime - this.f24857d >= i) {
            Us us = new Us(4, i);
            HN hn = (HN) c4300b.f35650c;
            hn.getClass();
            hn.f25264n.W1(new DN(2, us, 1003));
        }
    }
}
