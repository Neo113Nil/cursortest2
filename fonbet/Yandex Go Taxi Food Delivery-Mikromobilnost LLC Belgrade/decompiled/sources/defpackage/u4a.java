package defpackage;

import com.yandex.go.chargers.offer.ChargersOfferStationOpenReason;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class u4a implements a9a {
    public final /* synthetic */ zsa a;
    public final /* synthetic */ ArrayList b;

    public u4a(zsa zsaVar, ArrayList arrayList) {
        this.a = zsaVar;
        this.b = arrayList;
    }

    @Override // defpackage.a9a
    public final void J(String str) {
        this.a.r(new h0(str, 29));
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.P(this.b);
    }

    @Override // defpackage.a9a
    public final void m0(tsa tsaVar, ChargersOfferStationOpenReason chargersOfferStationOpenReason) {
        this.a.r(new ps9(tsaVar, 3));
    }
}
