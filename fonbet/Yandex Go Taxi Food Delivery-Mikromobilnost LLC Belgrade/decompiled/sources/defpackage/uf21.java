package defpackage;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import kotlinx.serialization.json.b;

/* loaded from: classes2.dex */
public final class uf21 extends fnr0 {
    public final String a;
    public final String b;

    public uf21() {
        super(0);
        this.a = "urbanAds";
        this.b = "UrbanAdsSharedDataParser";
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.a;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.b;
    }

    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        String a;
        String a2;
        String a3;
        b bVar2 = (b) qcx.m(bVar).get("isWhiteInventory");
        boolean z = false;
        boolean parseBoolean = (bVar2 == null || (a3 = qcx.n(bVar2).a()) == null) ? false : Boolean.parseBoolean(a3);
        b bVar3 = (b) qcx.m(bVar).get(UrbanAdsBottomSheetFragment.CORNER_RADIUS);
        int parseInt = (bVar3 == null || (a2 = qcx.n(bVar3).a()) == null) ? 24 : Integer.parseInt(a2);
        b bVar4 = (b) qcx.m(bVar).get(UrbanAdsBottomSheetFragment.SHOW_GRABBER);
        if (bVar4 != null && (a = qcx.n(bVar4).a()) != null) {
            z = Boolean.parseBoolean(a);
        }
        return new tf21(parseBoolean, parseInt, z);
    }
}
