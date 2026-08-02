package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthWcdma;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* loaded from: classes9.dex */
public final class G extends AbstractC0945f {
    public final N1 b;

    public G() {
        this(AndroidUtils.isApiAchieved(28) ? new S1() : new T1());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0945f
    public final void b(CellInfo cellInfo, C0963l c0963l) {
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        c0963l.i = 3;
        c0963l.e = Integer.valueOf(cellIdentity.getCid());
        c0963l.d = Integer.valueOf(cellIdentity.getLac());
        c0963l.j = Integer.valueOf(cellIdentity.getPsc());
        c0963l.a = Integer.valueOf(cellSignalStrength.getDbm());
        c0963l.b = this.b.c(cellIdentity);
        c0963l.c = this.b.a(cellIdentity);
        c0963l.f = this.b.b(cellIdentity);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0945f
    public final void c(CellInfo cellInfo, C0963l c0963l) {
        if (AndroidUtils.isApiAchieved(24)) {
            c0963l.o = Integer.valueOf(B.a(((CellInfoWcdma) cellInfo).getCellIdentity()));
        }
    }

    public G(N1 n1) {
        this.b = n1;
    }
}
