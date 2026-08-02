package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1004z extends AbstractC0945f {
    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0945f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(CellInfoCdma cellInfoCdma, C0963l c0963l) {
        c0963l.a = Integer.valueOf(cellInfoCdma.getCellSignalStrength().getDbm());
        c0963l.i = 2;
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0945f
    public final void c(CellInfo cellInfo, C0963l c0963l) {
    }

    public final void b(CellInfoCdma cellInfoCdma, C0963l c0963l) {
    }
}
