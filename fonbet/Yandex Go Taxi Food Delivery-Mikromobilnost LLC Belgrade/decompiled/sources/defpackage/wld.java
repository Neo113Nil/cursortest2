package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class wld implements b70 {
    public static final wld a = new wld();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        cld cldVar = (cld) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(cldVar.a);
        List list = ve70.a;
        se70 se70Var = cldVar.b;
        bfxVar.A1("title");
        foe foeVar2 = l80.a;
        bfxVar.r0(se70Var.a);
        bfxVar.A1("text");
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, se70Var.b);
        bfxVar.A1(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        om60Var.a(bfxVar, cVar, se70Var.c);
        bfxVar.A1("additionText");
        om60Var.a(bfxVar, cVar, se70Var.d);
        bfxVar.A1("payload");
        wkf wkfVar = ju00.a;
        b70 d = cVar.d(wkfVar);
        if (d instanceof om60) {
            ny61.r("The adapter is already nullable");
            return;
        }
        Map map = se70Var.e;
        if (map == null) {
            bfxVar.k2();
        } else {
            d.a(bfxVar, cVar, map);
        }
        bfxVar.A1("image");
        cVar.d(wkfVar).a(bfxVar, cVar, se70Var.f);
        bfxVar.A1("offerName");
        cVar.d(rs60.a).a(bfxVar, cVar, se70Var.g);
        bfxVar.A1(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX);
        l80.a(ue70.a).a(bfxVar, cVar, se70Var.h);
        bfxVar.A1("backgroundTv");
        ep60 ep60Var = new ep60(te70.a, true);
        qe70 qe70Var = se70Var.i;
        if (qe70Var == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, qe70Var);
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
        return new cld(str, ve70.c(xdxVar, cVar));
    }
}
