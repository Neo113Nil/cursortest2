package defpackage;

import android.content.Context;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.bdui.plus.action.q;
import com.yandex.plus.bdui.plus.analytics.c;
import com.yandex.plus.bdui.plus.checkout.action.d;
import com.yandex.plus.bdui.plus.checkout.action.e;
import com.yandex.plus.bdui.plus.checkout.action.f;
import com.yandex.plus.bdui.plus.checkout.action.g;
import com.yandex.plus.bdui.plus.checkout.o;
import com.yandex.plus.bdui.s;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.log.api.b;
import com.yandex.plus.pay.ui.core.api.domain.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class lub implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ lub(aqi aqiVar, ayn aynVar, gdn gdnVar, Function1 function1, sub subVar, u6k u6kVar, aqi aqiVar2, aqi aqiVar3) {
        this.b = aqiVar;
        this.e = aynVar;
        this.f = gdnVar;
        this.g = function1;
        this.h = subVar;
        this.i = u6kVar;
        this.c = aqiVar2;
        this.d = aqiVar3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                aqi aqiVar = (aqi) this.b;
                ayn aynVar = (ayn) this.e;
                gdn gdnVar = (gdn) this.f;
                Function1 function1 = (Function1) this.g;
                sub subVar = (sub) this.h;
                u6k u6kVar = (u6k) this.i;
                aqi aqiVar2 = (aqi) this.c;
                aqi aqiVar3 = (aqi) this.d;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                List list = (List) aqiVar.getValue();
                vufVar.Z(list.size(), new sea(6, new dcb(24), list), new bl(22, list, false), new wn5(new pub(list, aynVar, gdnVar, aqiVar, function1, subVar, u6kVar, aqiVar2, aqiVar3), -632812321, true));
                return Unit.a;
            default:
                final p pVar = (p) this.b;
                final tf6 tf6Var = (tf6) this.c;
                final b bVar = (b) this.d;
                Context context = (Context) this.e;
                y yVar = (y) this.f;
                a aVar = (a) this.g;
                tf6 tf6Var2 = (tf6) this.h;
                o oVar = (o) this.i;
                ((c) obj).getClass();
                bVar.getClass();
                com.yandex.plus.bdui.plus.a aVar2 = new com.yandex.plus.bdui.plus.a(bVar, 7);
                final int i = 0;
                pyc pycVar = new pyc() { // from class: com.yandex.plus.bdui.plus.checkout.f
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i2 = i;
                        ((s) obj2).getClass();
                        ((Function0) obj3).getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj4).getClass();
                        switch (i2) {
                            case 0:
                                return new com.yandex.plus.bdui.plus.checkout.action.b(pVar, tf6Var, bVar, 0);
                            case 1:
                                return new com.yandex.plus.bdui.plus.checkout.action.b(pVar, tf6Var, bVar, 1);
                            default:
                                return new com.yandex.plus.bdui.plus.checkout.action.b(pVar, tf6Var, bVar, 2);
                        }
                    }
                };
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                com.yandex.plus.bdui.action.b bVar2 = new com.yandex.plus.bdui.action.b("GooglePlayCompletePurchaseAction", aVar2, ern.a(com.yandex.plus.bdui.plus.checkout.action.c.class), pycVar, e5bVar, true);
                final int i2 = 1;
                com.yandex.plus.bdui.action.b bVar3 = new com.yandex.plus.bdui.action.b("GooglePlayPurchaseAction", new com.yandex.plus.bdui.plus.a(bVar, 8), ern.a(d.class), new pyc() { // from class: com.yandex.plus.bdui.plus.checkout.f
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i22 = i2;
                        ((s) obj2).getClass();
                        ((Function0) obj3).getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj4).getClass();
                        switch (i22) {
                            case 0:
                                return new com.yandex.plus.bdui.plus.checkout.action.b(pVar, tf6Var, bVar, 0);
                            case 1:
                                return new com.yandex.plus.bdui.plus.checkout.action.b(pVar, tf6Var, bVar, 1);
                            default:
                                return new com.yandex.plus.bdui.plus.checkout.action.b(pVar, tf6Var, bVar, 2);
                        }
                    }
                }, e5bVar, true);
                final int i3 = 2;
                com.yandex.plus.bdui.action.b bVar4 = new com.yandex.plus.bdui.action.b("GooglePlayRestorePurchasesAction", new com.yandex.plus.bdui.plus.a(bVar, 9), ern.a(e.class), new pyc() { // from class: com.yandex.plus.bdui.plus.checkout.f
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i22 = i3;
                        ((s) obj2).getClass();
                        ((Function0) obj3).getClass();
                        ((com.yandex.plus.bdui.flex.action.b) obj4).getClass();
                        switch (i22) {
                            case 0:
                                return new com.yandex.plus.bdui.plus.checkout.action.b(pVar, tf6Var, bVar, 0);
                            case 1:
                                return new com.yandex.plus.bdui.plus.checkout.action.b(pVar, tf6Var, bVar, 1);
                            default:
                                return new com.yandex.plus.bdui.plus.checkout.action.b(pVar, tf6Var, bVar, 2);
                        }
                    }
                }, e5bVar, true);
                com.yandex.plus.bdui.action.b bVar5 = new com.yandex.plus.bdui.action.b("ShareAction", new com.yandex.plus.bdui.plus.a(bVar, 13), ern.a(g.class), new f6p(22, context, bVar), e5bVar, true);
                yVar.getClass();
                aVar.getClass();
                return xz0.w(new com.yandex.plus.bdui.action.b[]{bVar2, bVar3, bVar4, bVar5, new com.yandex.plus.bdui.action.b("OpenUrlAction", new com.yandex.plus.bdui.plus.a(bVar, 10), ern.a(f.class), new mdn(yVar, aVar, tf6Var2, bVar, 14), e5bVar, true), new com.yandex.plus.bdui.action.b("PlusSharedAction", new com.yandex.plus.bdui.plus.a(bVar, 2), ern.a(q.class), new f6p(21, oVar, bVar), e5bVar, true)});
        }
    }

    public /* synthetic */ lub(p pVar, tf6 tf6Var, b bVar, Context context, y yVar, a aVar, tf6 tf6Var2, o oVar) {
        this.b = pVar;
        this.c = tf6Var;
        this.d = bVar;
        this.e = context;
        this.f = yVar;
        this.g = aVar;
        this.h = tf6Var2;
        this.i = oVar;
    }
}
