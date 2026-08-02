package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1001y implements O {
    public final V a;
    public final AbstractC0945f b;
    public final AbstractC0945f c;
    public final AbstractC0945f d;
    public final AbstractC0945f e;
    public final O[] f;

    public C1001y(V v, A a, C1004z c1004z, F f, G g) {
        this.a = v;
        this.b = a;
        this.c = c1004z;
        this.d = f;
        this.e = g;
        this.f = new O[]{a, c1004z, g, f};
    }

    public final void a(CellInfo cellInfo, C0963l c0963l) {
        this.a.a(cellInfo, c0963l);
        if (cellInfo instanceof CellInfoGsm) {
            this.b.a((CellInfoGsm) cellInfo, c0963l);
            return;
        }
        if (cellInfo instanceof CellInfoCdma) {
            this.c.a((CellInfoCdma) cellInfo, c0963l);
        } else if (cellInfo instanceof CellInfoLte) {
            this.d.a((CellInfoLte) cellInfo, c0963l);
        } else if (cellInfo instanceof CellInfoWcdma) {
            this.e.a((CellInfoWcdma) cellInfo, c0963l);
        }
    }

    public C1001y() {
        this(new V(), new A(), new C1004z(), new F(), new G());
    }

    public final InterfaceC0998x a() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.O
    public final void a(C0933c c0933c) {
        for (O o : this.f) {
            o.a(c0933c);
        }
    }
}
