package defpackage;

import android.content.Context;
import com.yandex.passport.common.network.p;
import com.yandex.plus.bdui.plus.webview.q;
import com.yandex.plus.log.api.b;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j;
import com.yandex.plus.pay.ui.webview.family.domain.a;
import com.yandex.plus.pay.ui.webview.family.ui.c;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class ofr implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ofr(Context context, String str, c cVar, a aVar, com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar2, j jVar, b bVar) {
        this.a = 3;
        this.b = context;
        this.g = str;
        this.c = cVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = jVar;
        this.h = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                hn5 hn5Var = (hn5) this.b;
                ct8 ct8Var = (ct8) this.c;
                qne qneVar = (qne) this.d;
                dzf dzfVar = (dzf) this.e;
                pfr pfrVar = (pfr) this.f;
                String str = (String) this.g;
                sfr sfrVar = (sfr) this.h;
                ((Context) obj).getClass();
                ct8Var.b = new xer(new zs8(3, qneVar));
                gc8 gc8Var = new gc8(new vb8(hn5Var, ct8Var.a(), dzfVar), null, 0, 6, null);
                pfrVar.c.a.a(str, "StaticDivBlockProvider");
                sk3.T(gc8Var, sfrVar.a, new dw8(str), dzfVar, pfrVar.b.a().b());
                return gc8Var;
            case 1:
                x3h x3hVar = (x3h) this.b;
                sdr sdrVar = (sdr) this.c;
                z2h z2hVar = (z2h) this.d;
                b2h b2hVar = (b2h) this.e;
                u6k u6kVar = (u6k) this.f;
                Function1 function1 = (Function1) this.g;
                Function0 function0 = (Function0) this.h;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vuf.Y(vufVar, null, new wn5(new mdn(sdrVar, x3hVar, z2hVar, b2hVar, 7), 214292215, true), 3);
                ArrayList arrayList = x3hVar.a;
                vufVar.Z(arrayList.size(), null, new wyl(arrayList, 5), new wn5(new m83(arrayList, b2hVar, u6kVar, function1, function0, z2hVar, 1), -1091073711, true));
                vuf.Y(vufVar, null, new wn5(new tik(23, x3hVar), -1930165138, true), 3);
                return Unit.a;
            case 2:
                String str2 = (String) this.g;
                String str3 = (String) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                String str6 = (String) this.e;
                String str7 = (String) this.f;
                Map map = (Map) this.h;
                p pVar = (p) obj;
                pVar.getClass();
                pVar.J("/1/external_auth_by_external_token");
                pVar.S("client_id", str2);
                pVar.S("client_secret", str3);
                pVar.S("token", str4);
                pVar.S("provider", str5);
                pVar.S("application", str6);
                pVar.S("scope", str7);
                pVar.P(map);
                return Unit.a;
            default:
                Context context = (Context) this.b;
                String str8 = (String) this.g;
                c cVar = (c) this.c;
                a aVar = (a) this.d;
                com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar2 = (com.yandex.plus.pay.ui.webview.common.diagnostic.a) this.e;
                j jVar = (j) this.f;
                b bVar = (b) this.h;
                q qVar = (q) obj;
                qVar.getClass();
                return new com.yandex.plus.bdui.plus.checkout.webview.contract.a(context, qVar, str8, cVar, aVar, aVar2, jVar, bVar);
        }
    }

    public /* synthetic */ ofr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    public /* synthetic */ ofr(String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.a = 2;
        this.g = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.h = map;
    }
}
