package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellIdentityLte;
import android.telephony.CellInfoLte;
import android.telephony.CellSignalStrengthLte;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* loaded from: classes9.dex */
public final class F extends AbstractC0945f {
    public final N1 b;

    public F() {
        this(AndroidUtils.isApiAchieved(28) ? new Q1() : new R1());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0945f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(CellInfoLte cellInfoLte, C0963l c0963l) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        c0963l.i = 4;
        c0963l.e = Integer.valueOf(cellIdentity.getCi());
        c0963l.d = Integer.valueOf(cellIdentity.getTac());
        c0963l.j = Integer.valueOf(cellIdentity.getPci());
        c0963l.a = Integer.valueOf(cellSignalStrength.getDbm());
        c0963l.b = this.b.c(cellIdentity);
        c0963l.c = this.b.a(cellIdentity);
        c0963l.f = this.b.b(cellIdentity);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0945f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(CellInfoLte cellInfoLte, C0963l c0963l) {
        if (AndroidUtils.isApiAchieved(24)) {
            c0963l.o = Integer.valueOf(B.a(cellInfoLte.getCellIdentity()));
        }
        if (AndroidUtils.isApiAchieved(26)) {
            c0963l.l = Integer.valueOf(C.b(cellInfoLte.getCellSignalStrength()));
            c0963l.m = Integer.valueOf(C.c(cellInfoLte.getCellSignalStrength()));
            c0963l.q = Integer.valueOf(C.a(cellInfoLte.getCellSignalStrength()));
        }
        if (AndroidUtils.isApiAchieved(28)) {
            c0963l.p = Integer.valueOf(D.a(cellInfoLte.getCellIdentity()));
        }
        if (AndroidUtils.isApiAchieved(29)) {
            c0963l.n = Integer.valueOf(E.a(cellInfoLte.getCellSignalStrength()));
        }
        c0963l.r = Integer.valueOf(cellInfoLte.getCellSignalStrength().getTimingAdvance());
    }

    public F(N1 n1) {
        this.b = n1;
    }
}
