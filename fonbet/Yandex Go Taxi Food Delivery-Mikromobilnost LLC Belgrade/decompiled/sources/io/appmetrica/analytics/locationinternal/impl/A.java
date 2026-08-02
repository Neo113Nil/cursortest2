package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellIdentityGsm;
import android.telephony.CellInfoGsm;
import android.telephony.CellSignalStrengthGsm;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* loaded from: classes9.dex */
public final class A extends AbstractC0945f {
    public final N1 b;

    public A() {
        this(AndroidUtils.isApiAchieved(28) ? new O1() : new P1());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0945f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(CellInfoGsm cellInfoGsm, C0963l c0963l) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        c0963l.i = 1;
        c0963l.e = Integer.valueOf(cellIdentity.getCid());
        c0963l.d = Integer.valueOf(cellIdentity.getLac());
        c0963l.a = Integer.valueOf(cellSignalStrength.getDbm());
        c0963l.b = this.b.c(cellIdentity);
        c0963l.c = this.b.a(cellIdentity);
        c0963l.f = this.b.b(cellIdentity);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0945f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(CellInfoGsm cellInfoGsm, C0963l c0963l) {
        if (AndroidUtils.isApiAchieved(24)) {
            c0963l.o = Integer.valueOf(cellInfoGsm.getCellIdentity().getArfcn());
        }
    }

    public A(N1 n1) {
        this.b = n1;
    }
}
