package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0926y implements O {
    public final V a;
    public final AbstractC0868f b;
    public final AbstractC0868f c;
    public final AbstractC0868f d;
    public final AbstractC0868f e;
    public final O[] f;

    public C0926y(V v, A a, C0929z c0929z, F f, G g) {
        this.a = v;
        this.b = a;
        this.c = c0929z;
        this.d = f;
        this.e = g;
        this.f = new O[]{a, c0929z, g, f};
    }

    public final void a(CellInfo cellInfo, C0888l c0888l) {
        this.a.a(cellInfo, c0888l);
        if (cellInfo instanceof CellInfoGsm) {
            this.b.a((CellInfoGsm) cellInfo, c0888l);
            return;
        }
        if (cellInfo instanceof CellInfoCdma) {
            this.c.a((CellInfoCdma) cellInfo, c0888l);
        } else if (cellInfo instanceof CellInfoLte) {
            this.d.a((CellInfoLte) cellInfo, c0888l);
        } else if (cellInfo instanceof CellInfoWcdma) {
            this.e.a((CellInfoWcdma) cellInfo, c0888l);
        }
    }

    public C0926y() {
        this(new V(), new A(), new C0929z(), new F(), new G());
    }

    @NonNull
    public final InterfaceC0923x a() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.O
    public final void a(@NonNull C0856c c0856c) {
        for (O o : this.f) {
            o.a(c0856c);
        }
    }
}
