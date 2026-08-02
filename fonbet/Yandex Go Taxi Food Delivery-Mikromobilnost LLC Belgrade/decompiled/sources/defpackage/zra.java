package defpackage;

import com.yandex.go.chargers.order.ChargersOrderStationOpenReason;
import com.yandex.go.chargers.qr.api.ChargersQrOpenReason;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;

/* loaded from: classes12.dex */
public final class zra implements zca {
    public final /* synthetic */ csa a;
    public final /* synthetic */ hr9 b;

    public zra(csa csaVar, hr9 hr9Var) {
        this.a = csaVar;
        this.b = hr9Var;
    }

    @Override // defpackage.zca
    public final void K0() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.zca
    public final void M() {
        this.a.P(this.b, ChargersStationOpenReason.BackFromCamera);
    }

    @Override // defpackage.zca
    public final void O0(tsa tsaVar, ChargersOrderStationOpenReason chargersOrderStationOpenReason) {
        ChargersStationOpenReason chargersStationOpenReason;
        String str = this.b.b;
        int i = yra.a[chargersOrderStationOpenReason.ordinal()];
        if (i == 1) {
            chargersStationOpenReason = ChargersStationOpenReason.Map;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            chargersStationOpenReason = ChargersStationOpenReason.DiscountsAndPromocodes;
        }
        this.a.P(new hr9(tsaVar, chargersStationOpenReason, str), chargersStationOpenReason);
    }

    @Override // defpackage.zca
    public final void R() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.P(this.b, ChargersStationOpenReason.BackFromCamera);
    }

    @Override // defpackage.zca
    public final void e1() {
        ChargersQrOpenReason chargersQrOpenReason = ChargersQrOpenReason.STATION_CARD;
        csa csaVar = this.a;
        csaVar.D((m950) csaVar.D.get(), new noa(chargersQrOpenReason), new cp9(csaVar, this.b, 3));
    }

    @Override // defpackage.zca
    public final void i() {
        this.a.r(new qu(9));
    }
}
