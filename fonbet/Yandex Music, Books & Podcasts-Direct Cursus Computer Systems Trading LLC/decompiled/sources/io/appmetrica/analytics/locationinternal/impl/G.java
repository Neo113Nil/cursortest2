package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthWcdma;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* loaded from: classes5.dex */
public final class G extends AbstractC0868f {
    public final N1 b;

    public G() {
        this(AndroidUtils.isApiAchieved(28) ? new S1() : new T1());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0868f
    public final void b(@NonNull CellInfo cellInfo, @NonNull C0888l c0888l) {
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        c0888l.i = 3;
        c0888l.e = Integer.valueOf(cellIdentity.getCid());
        c0888l.d = Integer.valueOf(cellIdentity.getLac());
        c0888l.j = Integer.valueOf(cellIdentity.getPsc());
        c0888l.a = Integer.valueOf(cellSignalStrength.getDbm());
        c0888l.b = this.b.c(cellIdentity);
        c0888l.c = this.b.a(cellIdentity);
        c0888l.f = this.b.b(cellIdentity);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0868f
    public final void c(@NonNull CellInfo cellInfo, @NonNull C0888l c0888l) {
        if (AndroidUtils.isApiAchieved(24)) {
            c0888l.o = Integer.valueOf(B.a(((CellInfoWcdma) cellInfo).getCellIdentity()));
        }
    }

    public G(N1 n1) {
        this.b = n1;
    }
}
