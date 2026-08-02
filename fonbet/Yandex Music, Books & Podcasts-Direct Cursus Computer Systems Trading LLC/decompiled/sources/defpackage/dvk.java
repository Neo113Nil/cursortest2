package defpackage;

import android.content.Context;
import com.yandex.passport.common.network.p;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class dvk implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ dvk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.j = obj9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                tuk tukVar = (tuk) this.c;
                e0j e0jVar = (e0j) this.d;
                u9w u9wVar = (u9w) this.e;
                uuk uukVar = (uuk) this.f;
                wuk wukVar = (wuk) this.g;
                lib libVar = (lib) this.h;
                usr usrVar = (usr) this.i;
                z2b z2bVar = (z2b) this.j;
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(Context.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.C(context);
                o18Var.c = hag.I(tuk.class);
                rp7Var.getClass();
                rp7Var.C(tukVar);
                o18Var.c = hag.I(e0j.class);
                rp7Var.getClass();
                rp7Var.C(e0jVar);
                o18Var.c = hag.I(u9w.class);
                rp7Var.getClass();
                rp7Var.C(u9wVar);
                o18Var.c = hag.I(uuk.class);
                rp7Var.getClass();
                rp7Var.C(uukVar);
                o18Var.c = hag.I(wuk.class);
                rp7Var.getClass();
                rp7Var.C(wukVar);
                o18Var.c = hag.I(ivk.class);
                rp7Var.getClass();
                rp7Var.E(new avi(12, usrVar, z2bVar));
                o18Var.c = hag.I(yuk.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(29));
                o18Var.c = hag.I(suk.class);
                rp7Var.getClass();
                rp7Var.D(new evk(0));
                o18Var.c = hag.I(zuk.class);
                rp7Var.getClass();
                rp7Var.D(new evk(1));
                o18Var.c = hag.I(pvk.class);
                rp7Var.getClass();
                rp7Var.E(new evk(2));
                o18Var.c = hag.I(wot.class);
                rp7Var.getClass();
                rp7Var.E(new evk(3));
                o18Var.c = hag.I(lib.class);
                rp7Var.getClass();
                rp7Var.C(libVar);
                break;
            default:
                String str = (String) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f;
                String str6 = (String) this.g;
                List list = (List) this.h;
                String str7 = (String) this.i;
                Map map = (Map) this.j;
                p pVar = (p) obj;
                pVar.getClass();
                pVar.J("/3/authorize/submit");
                pVar.F("Ya-Consumer-Authorization", "OAuth ".concat(str));
                pVar.S("client_id", str2);
                pVar.S("language", str3);
                pVar.S("response_type", str4);
                pVar.S("fingerprint", str5);
                pVar.S(CommonUrlParts.APP_ID, str6);
                list.getClass();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    pVar.S("requested_scopes", (String) it.next());
                }
                pVar.S("redirect_uri", str7);
                pVar.P(map);
                break;
        }
        return Unit.a;
    }
}
