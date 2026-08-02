package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellIdentityGsm;
import android.telephony.CellInfoGsm;
import android.telephony.CellSignalStrengthGsm;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* loaded from: classes5.dex */
public final class A extends AbstractC0868f {
    public final N1 b;

    public A() {
        this(AndroidUtils.isApiAchieved(28) ? new O1() : new P1());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0868f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(@NonNull CellInfoGsm cellInfoGsm, @NonNull C0888l c0888l) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        c0888l.i = 1;
        c0888l.e = Integer.valueOf(cellIdentity.getCid());
        c0888l.d = Integer.valueOf(cellIdentity.getLac());
        c0888l.a = Integer.valueOf(cellSignalStrength.getDbm());
        c0888l.b = this.b.c(cellIdentity);
        c0888l.c = this.b.a(cellIdentity);
        c0888l.f = this.b.b(cellIdentity);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0868f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(@NonNull CellInfoGsm cellInfoGsm, @NonNull C0888l c0888l) {
        if (AndroidUtils.isApiAchieved(24)) {
            c0888l.o = Integer.valueOf(cellInfoGsm.getCellIdentity().getArfcn());
        }
    }

    public A(N1 n1) {
        this.b = n1;
    }
}
