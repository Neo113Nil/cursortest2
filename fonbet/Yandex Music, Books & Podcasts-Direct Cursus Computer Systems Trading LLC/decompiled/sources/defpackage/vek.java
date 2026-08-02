package defpackage;

import com.connectsdk.service.DeviceService;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class vek implements sek {
    public final y60 a;
    public final zb0 b;
    public final wb7 c;
    public final zzp d;
    public final mm6 e;

    public vek(y60 y60Var, zb0 zb0Var, wb7 wb7Var, zzp zzpVar) {
        this.a = y60Var;
        this.b = zb0Var;
        this.c = wb7Var;
        this.d = zzpVar;
        mm6 r = hld.r(ogp.f, dm6.a());
        this.e = r;
        x97.y(r, null, null, new m1i(this, null, 25), 3);
    }

    public static /* synthetic */ void b(vek vekVar, xgr xgrVar, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        vekVar.a(xgrVar, str, null);
    }

    public final void a(xgr xgrVar, String str, List list) {
        long b = this.d.b();
        fzc fzcVar = (fzc) this.b.invoke();
        if (fzcVar.a == null || fzcVar.b) {
            return;
        }
        x97.y(this.e, null, null, new d7e(this, xgrVar, b, fzcVar, str, list, null, 1), 3);
    }

    public final void c(xgr xgrVar, xgr xgrVar2, String str, String str2, List list) {
        LinkedHashMap g = uah.g(new Pair("step", xgrVar.a), new Pair("session_id", str));
        if (xgrVar2 != null) {
            g.put("prev_step", xgrVar2.a);
        }
        if (str2 != null) {
            g.put(DeviceService.KEY_DESC, str2);
        }
        if (list != null) {
            g.put("offerIds", CollectionsKt.X(list, StringUtils.COMMA, null, null, null, 62));
        }
        this.a.a(new y70("funnel_step", g));
    }
}
