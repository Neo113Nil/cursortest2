package com.fillr.browsersdk.interactors;

import com.google.android.gms.maps.model.Marker;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AffiliateInteractor {
    public final HashMap affiliateStatesMap;
    public final HashMap urlRequestMethodsMap;

    public AffiliateInteractor(int i) {
        switch (i) {
            case 1:
                this.urlRequestMethodsMap = new HashMap();
                this.affiliateStatesMap = new HashMap();
                break;
            default:
                this.urlRequestMethodsMap = new HashMap();
                this.affiliateStatesMap = new HashMap();
                break;
        }
    }

    public void remove(Marker marker) {
        HashMap hashMap = this.affiliateStatesMap;
        Object obj = hashMap.get(marker);
        hashMap.remove(marker);
        this.urlRequestMethodsMap.remove(obj);
    }
}
