package defpackage;

import com.yandex.go.chargers.e;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;

/* loaded from: classes12.dex */
public final class zoa implements nj9 {
    public final s2a a;
    public final /* synthetic */ e b;

    public zoa(e eVar, s2a s2aVar) {
        this.b = eVar;
        this.a = s2aVar;
    }

    @Override // defpackage.nj9
    public final void a(psa psaVar) {
        this.b.Z(this.a, psaVar.a, ChargersStationOpenReason.Map);
    }
}
