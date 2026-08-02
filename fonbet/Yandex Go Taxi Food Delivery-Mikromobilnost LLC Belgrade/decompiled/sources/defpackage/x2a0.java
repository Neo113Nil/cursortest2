package defpackage;

import android.content.Context;
import androidx.lifecycle.p;
import com.yandex.fintechsdk.data.auth.api.TokenSource;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.entities.ui.BottomSheetMode;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.a;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class x2a0 extends yr31 {
    public final b2w b;
    public final f5g c;

    public x2a0(Context context, p pVar, t7w t7wVar) {
        String uid;
        Long m;
        Object putIfAbsent;
        v2a0 v2a0Var = t7wVar.b;
        Payer payer = t7wVar.e;
        nw70 nw70Var = new nw70(t7wVar);
        b2w b2wVar = new b2w(new a2w(t7wVar.h ? BottomSheetMode.REGULAR : BottomSheetMode.DISABLED, 2));
        this.b = b2wVar;
        String str = v2a0Var.a;
        h5g h5gVar = (h5g) a.n.computeIfAbsent(str, new yu0(17, new bd90(12)));
        AdditionalSettings additionalSettings = t7wVar.a;
        ConcurrentHashMap concurrentHashMap = a.k.a;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = ffx.c(0, 10, null, 5)))) != null) {
            obj = putIfAbsent;
        }
        DefaultEnvironment f = ha91.f(t7wVar.c);
        Merchant merchant = t7wVar.d;
        Region region = Region.RU;
        Scenario scenario = t7wVar.f;
        s3a0 s3a0Var = t7wVar.g;
        lz40 lz40Var = (lz40) a.j.a.get(str);
        lz40Var = lz40Var == null ? ffx.c(0, 0, null, 7) : lz40Var;
        f.getClass();
        region.getClass();
        f5g f5gVar = new f5g(new jxk(), new kh5(), new a8o(), new rqt0(), h5gVar, additionalSettings, v2a0Var, context, pVar, f, b2wVar, merchant, nw70Var, payer, region, scenario, s3a0Var, lz40Var);
        this.c = f5gVar;
        String oauthToken = payer.getOauthToken();
        if (oauthToken == null || (uid = payer.getUid()) == null || (m = bvu0.m(10, uid)) == null) {
            return;
        }
        f5gVar.a().a(new qk3(new ek(oauthToken, m.longValue()), TokenSource.HOST_PASSPORT));
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) f5gVar.getAnalytics()).a(d4p.c);
    }
}
