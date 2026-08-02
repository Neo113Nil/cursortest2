package com.anythink.network.directly;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.f.e;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.network.adx.AdxATInterstitialAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class DirectlyATInterstitialAdapter extends AdxATInterstitialAdapter {
    public void fixDirectlyInterstitial() {
        w d9;
        e eVar = this.f23806b;
        if (eVar == null || (d9 = eVar.d()) == null) {
            return;
        }
        d9.g(this.f23807c);
        bj bjVar = (bj) d9;
        if (bjVar.aJ() == 5 && this.f23807c == 2) {
            bjVar.t(3);
        }
    }

    @Override // com.anythink.network.adx.AdxATInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "Directly";
    }

    @Override // com.anythink.network.adx.AdxATInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Object obj;
        this.f23807c = 2;
        if (map.containsKey("unit_type") && (obj = map.get("unit_type")) != null) {
            int parseInt = Integer.parseInt(obj.toString());
            this.f23807c = parseInt;
            this.f23807c = parseInt != 0 ? 1 : 2;
        }
        super.loadCustomNetworkAd(context, map, map2);
    }

    @Override // com.anythink.network.adx.AdxATInterstitialAdapter, com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        fixDirectlyInterstitial();
        super.show(activity);
    }
}
