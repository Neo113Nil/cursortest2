package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0929z extends AbstractC0868f {
    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0868f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(@NonNull CellInfoCdma cellInfoCdma, @NonNull C0888l c0888l) {
        c0888l.a = Integer.valueOf(cellInfoCdma.getCellSignalStrength().getDbm());
        c0888l.i = 2;
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0868f
    public final void c(@NonNull CellInfo cellInfo, @NonNull C0888l c0888l) {
    }

    public final void b(@NonNull CellInfoCdma cellInfoCdma, @NonNull C0888l c0888l) {
    }
}
