package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.search.common.presenter.a;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class ysd implements elh {
    public final /* synthetic */ a a;

    public ysd(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.elh
    public final void F7() {
        a aVar = this.a;
        aVar.Z = true;
        aVar.nh();
    }

    @Override // defpackage.elh
    public final void onError() {
        a aVar = this.a;
        aVar.Z = false;
        aVar.nh();
    }

    @Override // defpackage.elh
    public final void tg(int i, Address address) {
        String str;
        vbb vbbVar = this.a.C;
        vbbVar.getClass();
        if (address.getIsFavorite()) {
            PlaceType placeType = address.getPlaceType();
            if (placeType != null) {
                int i2 = lsd.a[placeType.ordinal()];
                if (i2 == 1) {
                    str = "home";
                } else if (i2 == 2) {
                    str = "work";
                }
            }
            str = "favorite";
        } else {
            str = null;
        }
        o61 o61Var = (o61) vbbVar.a;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("adress_type", str);
        }
        hashMap.put("index", valueOf);
        o61Var.a.a("AddressSelectionBubbleTap", hashMap, 1, new HashMap());
    }
}
