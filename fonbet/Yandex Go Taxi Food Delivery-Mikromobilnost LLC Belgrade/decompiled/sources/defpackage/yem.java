package defpackage;

import android.net.Uri;
import java.util.Map;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class yem implements v1g0 {
    public final wnt a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;

    public yem(wnt wntVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4) {
        this.a = wntVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = h3yVar4;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        wnt wntVar = this.a;
        i5p d = r85.d(wntVar, map);
        String str = (String) map.get("title");
        String str2 = (String) map.get("body");
        String str3 = (String) map.get("notification_group");
        if (d == null || !jl40.l(d.i, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY) || str2 == null || str2.length() == 0) {
            return false;
        }
        String str4 = (String) map.get("local_channel_id");
        if (str4 == null) {
            r85.e(this.d, map);
            return true;
        }
        xk60 xk60Var = (xk60) this.c.get();
        f fVar = (f) this.b.get();
        ddm ddmVar = ddm.b;
        ((pux0) ((o3h) this.e.get())).getClass();
        String str5 = pux0.c;
        ddm ddmVar2 = ddm.b;
        Uri.Builder authority = new Uri.Builder().scheme(str5).authority(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY);
        authority.appendQueryParameter("from-push", String.valueOf(ddmVar.a));
        xk60Var.n(o501.D(fVar.a(authority.build()), str, str2, str4, map, null, 96), r85.a(wntVar, map), str3);
        return true;
    }
}
