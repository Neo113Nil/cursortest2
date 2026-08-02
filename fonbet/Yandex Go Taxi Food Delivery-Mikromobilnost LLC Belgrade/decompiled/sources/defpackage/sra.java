package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardButtonNameV3;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardCloseReason;
import com.yandex.go.chargers.data.j;
import com.yandex.go.chargers.domain.b;
import com.yandex.go.chargers.qr.api.ChargersQrOpenReason;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;
import com.yandex.go.chargers.station.data.e;
import com.yandex.go.chargers.station.domain.c;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class sra extends ad5 {
    public final yfa A;
    public final g6a B;
    public final j C;
    public final saa D;
    public final tsa E;
    public final String F;
    public final ChargersStationOpenReason G;
    public final io9 H;
    public boolean I;
    public pzt0 J;
    public final c x;
    public final b y;
    public final jra z;

    public sra(c cVar, b bVar, jra jraVar, yfa yfaVar, g6a g6aVar, j jVar, saa saaVar, tsa tsaVar, String str, ChargersStationOpenReason chargersStationOpenReason, io9 io9Var) {
        super(rra.class);
        this.x = cVar;
        this.y = bVar;
        this.z = jraVar;
        this.A = yfaVar;
        this.B = g6aVar;
        this.C = jVar;
        this.D = saaVar;
        this.E = tsaVar;
        this.F = str;
        this.G = chargersStationOpenReason;
        this.H = io9Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.J = null;
        super.Cg();
    }

    public final void Kg(uj9 uj9Var, ChargersAnalytics$ChargersLocationCardButtonNameV3 chargersAnalytics$ChargersLocationCardButtonNameV3) {
        if (uj9Var == null) {
            return;
        }
        boolean equals = uj9Var.equals(jqa.a);
        int i = 14;
        io9 io9Var = this.H;
        jra jraVar = this.z;
        if (equals) {
            jraVar.a(ChargersAnalytics$ChargersLocationCardButtonNameV3.TakeCharger);
            jraVar.b = ChargersAnalytics$ChargersLocationCardCloseReason.TakeCharger;
            ((hsa) io9Var.a).r(new od9(i, ChargersQrOpenReason.STATION_CARD));
            return;
        }
        if (uj9Var instanceof hqa) {
            jraVar.a(ChargersAnalytics$ChargersLocationCardButtonNameV3.ReturnCharger);
            ((hsa) io9Var.a).r(new od9(i, ChargersQrOpenReason.RETURN_CHARGER));
            return;
        }
        if (uj9Var.equals(iqa.a)) {
            jraVar.a(ChargersAnalytics$ChargersLocationCardButtonNameV3.SelectToReturn);
            hsa hsaVar = (hsa) io9Var.a;
            hsaVar.z((m950) hsaVar.S.get(), new fsa(hsaVar));
            return;
        }
        if (uj9Var instanceof gqa) {
            jraVar.a(ChargersAnalytics$ChargersLocationCardButtonNameV3.OpenTariffs);
            rxa rxaVar = ((gqa) uj9Var).a;
            hsa hsaVar2 = (hsa) io9Var.a;
            hsaVar2.A((m950) hsaVar2.J.get(), new yxa(rxaVar), new gsa(hsaVar2));
            return;
        }
        if (uj9Var instanceof fqa) {
            hsa hsaVar3 = (hsa) io9Var.a;
            hsaVar3.z((m950) hsaVar3.R.get(), new uk9(3));
        } else if (uj9Var instanceof ro9) {
            if (chargersAnalytics$ChargersLocationCardButtonNameV3 != null) {
                jraVar.a(chargersAnalytics$ChargersLocationCardButtonNameV3);
            }
            hwa hwaVar = ((ro9) uj9Var).a;
            hsa hsaVar4 = (hsa) io9Var.a;
            hsaVar4.A(hsaVar4.L.a(hsaVar4.F), hwaVar, sy60.Q2);
        }
    }

    public final void Lg(oma omaVar, boolean z) {
        hsa hsaVar = (hsa) this.H.a;
        da0 a = hsaVar.K.a(hsaVar.F);
        String str = omaVar.a;
        hsaVar.A(a, new uma(omaVar.c, omaVar.d, omaVar.b), sy60.Q2);
        jra jraVar = hsaVar.G;
        String str2 = omaVar.a;
        em9 em9Var = jraVar.a;
        em9Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("popup_id", str2);
        em9Var.a.a("Chargers.StationPopup.Shown", hashMap, 1, new HashMap());
        if (z) {
            ((e) this.A.a).a(str2);
        }
    }
}
