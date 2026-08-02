package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellIdentityLte;
import android.telephony.CellInfoLte;
import android.telephony.CellSignalStrengthLte;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* loaded from: classes5.dex */
public final class F extends AbstractC0868f {
    public final N1 b;

    public F() {
        this(AndroidUtils.isApiAchieved(28) ? new Q1() : new R1());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0868f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(@NonNull CellInfoLte cellInfoLte, @NonNull C0888l c0888l) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        c0888l.i = 4;
        c0888l.e = Integer.valueOf(cellIdentity.getCi());
        c0888l.d = Integer.valueOf(cellIdentity.getTac());
        c0888l.j = Integer.valueOf(cellIdentity.getPci());
        c0888l.a = Integer.valueOf(cellSignalStrength.getDbm());
        c0888l.b = this.b.c(cellIdentity);
        c0888l.c = this.b.a(cellIdentity);
        c0888l.f = this.b.b(cellIdentity);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0868f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(@NonNull CellInfoLte cellInfoLte, @NonNull C0888l c0888l) {
        if (AndroidUtils.isApiAchieved(24)) {
            c0888l.o = Integer.valueOf(B.a(cellInfoLte.getCellIdentity()));
        }
        if (AndroidUtils.isApiAchieved(26)) {
            c0888l.l = Integer.valueOf(C.b(cellInfoLte.getCellSignalStrength()));
            c0888l.m = Integer.valueOf(C.c(cellInfoLte.getCellSignalStrength()));
            c0888l.q = Integer.valueOf(C.a(cellInfoLte.getCellSignalStrength()));
        }
        if (AndroidUtils.isApiAchieved(28)) {
            c0888l.p = Integer.valueOf(D.a(cellInfoLte.getCellIdentity()));
        }
        if (AndroidUtils.isApiAchieved(29)) {
            c0888l.n = Integer.valueOf(E.a(cellInfoLte.getCellSignalStrength()));
        }
        c0888l.r = Integer.valueOf(cellInfoLte.getCellSignalStrength().getTimingAdvance());
    }

    public F(N1 n1) {
        this.b = n1;
    }
}
