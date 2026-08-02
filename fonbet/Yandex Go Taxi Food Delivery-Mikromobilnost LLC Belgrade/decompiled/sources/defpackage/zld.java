package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class zld implements b70 {
    public static final zld a = new zld();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        mld mldVar = (mld) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(mldVar.a);
        List list = bhx0.a;
        xgx0 xgx0Var = mldVar.b;
        bfxVar.A1("title");
        foe foeVar2 = l80.a;
        bfxVar.r0(xgx0Var.a);
        bfxVar.A1("text");
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, xgx0Var.b);
        bfxVar.A1(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        om60Var.a(bfxVar, cVar, xgx0Var.c);
        bfxVar.A1("additionText");
        om60Var.a(bfxVar, cVar, xgx0Var.d);
        bfxVar.A1("payload");
        wkf wkfVar = ju00.a;
        b70 d = cVar.d(wkfVar);
        if (d instanceof om60) {
            ny61.r("The adapter is already nullable");
            return;
        }
        Map map = xgx0Var.e;
        if (map == null) {
            bfxVar.k2();
        } else {
            d.a(bfxVar, cVar, map);
        }
        bfxVar.A1("image");
        cVar.d(wkfVar).a(bfxVar, cVar, xgx0Var.f);
        bfxVar.A1("offerName");
        cVar.d(rs60.a).a(bfxVar, cVar, xgx0Var.g);
        bfxVar.A1(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX);
        l80.a(ahx0.a).a(bfxVar, cVar, xgx0Var.h);
        bfxVar.A1("backgroundTv");
        ep60 ep60Var = new ep60(ygx0.a, true);
        ugx0 ugx0Var = xgx0Var.i;
        if (ugx0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, ugx0Var);
        }
        bfxVar.A1("storePurchaseInfo");
        ep60 ep60Var2 = new ep60(zgx0.a, true);
        vgx0 vgx0Var = xgx0Var.j;
        if (vgx0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var2.a(bfxVar, cVar, vgx0Var);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new mld(str, bhx0.c(xdxVar, cVar));
    }
}
