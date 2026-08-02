package defpackage;

import android.os.SystemClock;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.paymentlist.domain.converter.b;
import com.yandex.go.payments.paymentlist.domain.converter.i;
import com.yandex.go.payments.paymentlist.domain.k;
import com.yandex.go.payments.paymentlist.navigation.f;
import com.yandex.go.payments_widgets.api.PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction;
import com.yandex.go.payments_widgets.mini.widgets.presentation.a;
import com.yandex.go.payments_widgets.section.payments.d;
import com.yandex.plus.plaquesdk.plaque.NotificationView;
import com.yandex.plus.plaquesdk.plaque.PlaqueView;
import java.util.Map;
import java.util.UUID;
import okhttp3.OkHttpClient;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.logistics.postcard.presentation.g;
import ru.yandex.taxi.plus.sdk.existing_screens.c;

/* loaded from: classes8.dex */
public final /* synthetic */ class t9a0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t9a0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        NotificationView notificationViewLazy$lambda$0;
        String str;
        Map map;
        int i = this.a;
        Object obj = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new b((i) obj2);
            case 1:
                ((k) obj2).y.b.r(new qu(9));
                return zy11.a;
            case 2:
                f fVar = (f) obj2;
                return eg3.g(fVar.H.a, fVar.E, fVar.F).e();
            case 3:
                pme0 pme0Var = (pme0) ((i3y) ((kjz) obj2).b).getValue();
                Object obj3 = pme0Var.d;
                if (obj3 != null) {
                    obj = obj3;
                } else {
                    synchronized (pme0Var) {
                        Object obj4 = pme0Var.d;
                        if (obj4 == null) {
                            String str2 = (String) pme0Var.c.getValue(pme0Var, pme0.f[0]);
                            if (str2.length() != 0) {
                                pme0Var.d = ((xnt) pme0Var.a).c(str2, pme0Var.b);
                                obj = pme0Var.d;
                            }
                        } else {
                            obj = obj4;
                        }
                    }
                }
                if (obj == null) {
                    obj = pme0Var.e;
                }
                return bvf0.c(new vda0((PaymentMethods) obj, SystemClock.elapsedRealtime()));
            case 4:
                d dVar = (d) obj2;
                fla0 fla0Var = dVar.p;
                wgr wgrVar = dVar.i;
                fla0Var.a.getClass();
                return new cla0(wgrVar);
            case 5:
                a aVar = (a) obj2;
                ru.yandex.taxi.analytics.i d = ((j) ((lx4) aVar.f.a)).d("PaymentWidgets.CollapsedWidgets.Tapped");
                d.d(MetaDataField.SCREEN_FIELD, "superapp_main");
                d.m();
                aVar.g.a.g(PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction.SCROLL_TO_SECTION);
                return zy11.a;
            case 6:
                kb20 kb20Var = (kb20) obj2;
                String b = kb20Var.b();
                String a = kb20Var.a();
                if (a == null) {
                    a = "";
                }
                return new fw2(b, a);
            case 7:
                return kotlin.collections.a.M(((PersonalAccount.ComplementAttributes) obj2).c);
            case 8:
                return ((hjb0) obj2).b.a();
            case 9:
                return (jcc0) ((hcc0) obj2).b.get();
            case 10:
                com.yandex.go.payments.superapp.payment.b bVar = ((qcc0) obj2).a;
                u32.a.getClass();
                return bVar.a("places", t32.b, new l90(), uba0.g);
            case 11:
                return b64.p(new StringBuilder("Unexpected end of input: yet to parse '"), ((hhc0) obj2).a, '\'');
            case 12:
                bkc0 bkc0Var = (bkc0) obj2;
                com.yandex.plus.home.plaque.feature.internal.domain.observable.a aVar2 = bkc0Var.a;
                kjz kjzVar = bkc0Var.b;
                com.yandex.plus.home.plaque.feature.internal.domain.interactors.a aVar3 = bkc0Var.c;
                gkc0 gkc0Var = bkc0Var.d;
                com.yandex.plus.home.plaque.feature.internal.domain.interactors.b bVar2 = bkc0Var.e;
                yo40 yo40Var = bkc0Var.f;
                oo2 oo2Var = bkc0Var.j;
                o370 o370Var = bkc0Var.g;
                pgz pgzVar = bkc0Var.k;
                ike ikeVar = bkc0Var.l;
                ((wyj) bkc0Var.m).getClass();
                return new com.yandex.plus.home.plaque.feature.internal.presentation.d(aVar2, kjzVar, aVar3, gkc0Var, bVar2, yo40Var, oo2Var, o370Var, pgzVar, ikeVar, wyj.f, wyj.d);
            case 13:
                notificationViewLazy$lambda$0 = PlaqueView.notificationViewLazy$lambda$0((PlaqueView) obj2);
                return notificationViewLazy$lambda$0;
            case 14:
                return ((exc0) obj2).a.getSharedPreferences("play_install_referrer_prefs", 0);
            case 15:
                ofa0 ofa0Var = (ofa0) obj2;
                return new ls90((v7d0) ofa0Var.a, (qgd0) ofa0Var.b, (jse) ofa0Var.c);
            case 16:
                am2 am2Var = (am2) obj2;
                return new dn((am2) am2Var.a, (c0d0) am2Var.b);
            case 17:
                zv60 zv60Var = (zv60) obj2;
                OkHttpClient.a aVar4 = zv60Var.a;
                if (aVar4 == null) {
                    aVar4 = new OkHttpClient.a();
                }
                aVar4.a(zv60Var.b);
                return new OkHttpClient(aVar4);
            case 18:
                u2d0 u2d0Var = (u2d0) obj2;
                return new jmo(new c(u2d0Var.d), u2d0Var.k, u2d0Var.l);
            case 19:
                return (ru.yandex.taxi.cashback.router.c) ((s3d0) obj2).a.get();
            case 20:
                return Boolean.valueOf(ffx.K(((lkd0) ((nkd0) obj2)).B));
            case 21:
                return (h4j0) obj2;
            case 22:
                com.yandex.plus.pay.internal.di.b bVar3 = (com.yandex.plus.pay.internal.di.b) obj2;
                return new jsu0(bVar3.e, bVar3.j);
            case 23:
                return (v7d0) ((oay0) obj2).invoke();
            case 24:
                return ((com.yandex.plus.home.c) ((p4d0) ((z3d0) ((au50) obj2).b))).c.a.f();
            case 25:
                return new ujd0((qid0) obj2);
            case 26:
                return (sfe0) ((g) obj2).c.get();
            case 27:
                ((by21) obj2).getClass();
                return UUID.randomUUID().toString();
            case 28:
                ((com.yandex.messaging.profile.g) ((p8g) ((v320) obj2)).k.get()).a(null);
                return zy11.a;
            default:
                elf0 elf0Var = (elf0) obj2;
                u1m u1mVar = elf0Var.a;
                int hashCode = ((((u1mVar == null || (map = u1mVar.b) == null) ? 0 : map.hashCode()) * 31) + ((u1mVar == null || (str = u1mVar.a) == null) ? 0 : str.hashCode())) * 31;
                ywl ywlVar = elf0Var.b;
                return Integer.valueOf(hashCode + (ywlVar != null ? ywlVar.hashCode() : 0));
        }
    }
}
