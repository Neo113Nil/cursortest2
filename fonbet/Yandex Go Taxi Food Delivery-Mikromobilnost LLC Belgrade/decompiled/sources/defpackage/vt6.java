package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.ScheduledOrder;
import com.yandex.go.taxi.order.models.api.preorder.TollRoads;
import com.yandex.go.taxi.order.models.api.preorder.extraphone.ExtraPhoneContact;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ylw;
import java.util.HashMap;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.intercity.analytics.IntercityPhoneSelectOrigin;
import ru.yandex.taxi.orderpopup.a;
import ru.yandex.taxi.preorder.interactor.AttachGooglePayCardToPreorderInteractor$selectGooglePayCard$$inlined$safeCollectIn$1;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.tollroad.data.RoadRestriction;
import ru.yandex.taxi.preorder.tollroad.data.e;
import ru.yandex.taxi.requirements.models.net.experiment.c;

/* loaded from: classes6.dex */
public final class vt6 implements y880 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ vt6(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ce, code lost:
    
        if (r6 != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c6  */
    @Override // defpackage.y880
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(x880 x880Var) {
        pex0 m;
        String str;
        ylw.d dVar;
        lv90 lv90Var;
        TollRoads tollRoads;
        bc bcVar;
        ag1 ag1Var = null;
        int i = 0;
        switch (this.a) {
            case 0:
                cu6 n = ((md6) this.c).n();
                if (n != null && n != cu6.d && n.b) {
                    ((a) this.b).a(n, new ut6(this, x880Var, 0));
                    break;
                } else {
                    x880Var.n();
                    break;
                }
                break;
            case 1:
                e9w e9wVar = (e9w) ((d9w) this.b);
                if (e9wVar.b() == null && (m = ((k) ((wiq0) this.c)).m()) != null && (str = m.b) != null) {
                    ylw ylwVar = (ylw) e9wVar.b.b();
                    ylw.c a = e9wVar.a(ylwVar, str);
                    if (a != null && (dVar = a.a) != null) {
                        ag1Var = new ag1(d6z.Y(ylwVar, dVar.a), 5);
                    }
                    if (ag1Var != null) {
                        ((xmw) ((y0g) this.d).get()).T(IntercityPhoneSelectOrigin.ORDER_BUTTON);
                        x880Var.o();
                        break;
                    }
                }
                x880Var.n();
                break;
            default:
                ste0 ste0Var = (ste0) this.c;
                pex0 m2 = ((k) ste0Var.e).m();
                wb3 wb3Var = ste0Var.h;
                Preorder preorder = wb3Var.a.a;
                if (m2 == null) {
                    unr0.z(jst.e, "Can't assign offer without selected tariff");
                    preorder.b = null;
                } else {
                    is60 is60Var = m2.J0.b;
                    String a2 = is60Var.a();
                    if (!is60Var.b) {
                        a2 = null;
                    }
                    preorder.b = a2;
                    String a3 = is60Var.a();
                    if (a3.length() == 0) {
                        a3 = null;
                    }
                    preorder.a = a3;
                    wu1 wu1Var = m2.O;
                    if (wu1Var instanceof gid0) {
                        xxc g = wb3Var.b.b.g();
                        String str2 = g != null ? g.a.a : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (g == null || str2.length() == 0) {
                            g8e.A(jst.e, "Can't force plus payment because user has not wallet");
                            lv90Var = null;
                            preorder.w = lv90Var;
                            preorder.a0 = lv90Var == null && (m2.O instanceof yu1);
                        } else {
                            kv90 kv90Var = lv90.Companion;
                            PaymentMethod$Type paymentMethod$Type = g.a.b;
                            String str3 = m2.K;
                            kv90Var.getClass();
                            lv90Var = new lv90(paymentMethod$Type, str2, str3, null);
                            preorder.w = lv90Var;
                            preorder.a0 = lv90Var == null && (m2.O instanceof yu1);
                        }
                    } else {
                        if (wu1Var instanceof yu1) {
                            Alternatives.AlternativePaymentMethod alternativePaymentMethod = ((yu1) wu1Var).b;
                            String str4 = alternativePaymentMethod.b;
                            String str5 = alternativePaymentMethod.a;
                            if (str4 == null || evu0.J(str4) || evu0.J(str5)) {
                                g8e.A(jst.e, "Can't force alt payment because it has no payment method id");
                            } else {
                                PaymentMethod$Type.Companion.getClass();
                                PaymentMethod$Type a4 = b4a0.a(str5);
                                if (a4 != null) {
                                    kv90 kv90Var2 = lv90.Companion;
                                    String str6 = alternativePaymentMethod.b;
                                    kv90Var2.getClass();
                                    lv90Var = new lv90(a4, str6, null, null);
                                    preorder.w = lv90Var;
                                    preorder.a0 = lv90Var == null && (m2.O instanceof yu1);
                                }
                            }
                        }
                        lv90Var = null;
                        preorder.w = lv90Var;
                        preorder.a0 = lv90Var == null && (m2.O instanceof yu1);
                    }
                }
                com.yandex.go.taxi.auction.domain.a aVar = ste0Var.d;
                aVar.b.a.b0 = null;
                fnx0 n2 = ((k) aVar.c).n();
                if (n2 != null) {
                    double d = aVar.a.c(n2.a).b;
                    Double valueOf = Double.valueOf(d);
                    if (!n2.c.J0.b.b || d == 0.0d) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        double doubleValue = valueOf.doubleValue();
                        b1 b1Var = aVar.d.a;
                        b1Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("price", Double.valueOf(doubleValue));
                        HashMap hashMap2 = new HashMap();
                        Regex regex = sho.a;
                        b1Var.a.a(sb2.q("order_commited", hashMap), hashMap, 1, hashMap2);
                        aVar.b.a.b0 = String.valueOf(doubleValue);
                    }
                }
                ste0Var.l.a = ste0Var.b.a();
                ste0Var.b.a.l(ste0Var.g.c());
                djj0 djj0Var = ste0Var.m;
                fnx0 n3 = ((k) djj0Var.b).n();
                c b = djj0Var.e.b();
                if (n3 != null && b.b) {
                    bdj0 c = djj0Var.c.c(n3.c, n3.d, EmptyList.a, b, cdj0.a);
                    if (c.b()) {
                        ScheduledOrder scheduledOrder = djj0Var.a.a.S;
                        scheduledOrder.a = null;
                        scheduledOrder.c = null;
                        scheduledOrder.d = 0;
                    }
                    if (c.a()) {
                        djj0Var.d.f();
                    }
                }
                Preorder preorder2 = ste0Var.b.a;
                q6c0 q6c0Var = ste0Var.n;
                e eVar = (e) q6c0Var.b;
                boolean isEnabled = ((en11) ((opz0) q6c0Var.w).a.getValue()).isEnabled();
                pex0 m3 = ((k) ((wiq0) q6c0Var.c)).m();
                if (!isEnabled || m3 == null || !m3.X) {
                    if (m3 != null) {
                        boolean z = m3.X;
                        eVar.getClass();
                        break;
                    }
                    tollRoads = null;
                    preorder2.d0 = tollRoads;
                    if (ste0Var.f.d(ste0Var.b.c())) {
                        ste0Var.b.a.y = ste0Var.f.g();
                    }
                    ste0Var.p.a.l(null);
                    ste0Var.b.a.M = ste0Var.j.g();
                    ste0Var.j.f();
                    String str7 = ste0Var.b.a.O.a;
                    ste0Var.b.a.N = str7 != null ? ExtraPhoneContact.c : ste0Var.c.c(str7);
                    com.yandex.go.preorder.confirm.a aVar2 = ste0Var.i;
                    hif hifVar = ste0Var.k.a;
                    boolean f = ((r) ste0Var.o).f();
                    ru.yandex.taxi.preorder.source.pickup.a aVar3 = ste0Var.a;
                    zzs zzsVar = aVar3.h;
                    zzs zzsVar2 = aVar3.i;
                    Address g2 = ste0Var.g.g();
                    Address d2 = ste0Var.g.d();
                    String str8 = ste0Var.b.a.a;
                    aVar2.getClass();
                    aVar2.p = new teh(hifVar, f, m2, zzsVar, zzsVar2, g2, d2, str8);
                    bcVar = (bc) this.d;
                    egi egiVar = new egi(x880Var, 2);
                    gyt0 gyt0Var = new gyt0(4, this, x880Var);
                    if (((dqe0) bcVar.b).a.h() != PaymentMethod$Type.GOOGLE_PAY) {
                        ((ney) bcVar.c).b(bcVar, new vb3(i, bcVar));
                        pzt0 pzt0Var = (pzt0) bcVar.x;
                        if (pzt0Var != null && pzt0Var.isActive()) {
                            jst.e.q("Duplicate call of selectGooglePayCard");
                            egiVar.invoke();
                            break;
                        } else {
                            bcVar.x = tje.N((tse) bcVar.a, null, null, new AttachGooglePayCardToPreorderInteractor$selectGooglePayCard$$inlined$safeCollectIn$1(((com.yandex.go.preorder.payments.a) bcVar.w).a(((dqe0) bcVar.b).a), null, gyt0Var, egiVar, egiVar), 3);
                            break;
                        }
                    } else {
                        gyt0Var.invoke();
                        break;
                    }
                }
                tollRoads = new TollRoads(eVar.f(), eVar.a().size() >= 2 && eVar.b() == RoadRestriction.NONE);
                preorder2.d0 = tollRoads;
                if (ste0Var.f.d(ste0Var.b.c())) {
                }
                ste0Var.p.a.l(null);
                ste0Var.b.a.M = ste0Var.j.g();
                ste0Var.j.f();
                String str72 = ste0Var.b.a.O.a;
                ste0Var.b.a.N = str72 != null ? ExtraPhoneContact.c : ste0Var.c.c(str72);
                com.yandex.go.preorder.confirm.a aVar22 = ste0Var.i;
                hif hifVar2 = ste0Var.k.a;
                boolean f2 = ((r) ste0Var.o).f();
                ru.yandex.taxi.preorder.source.pickup.a aVar32 = ste0Var.a;
                zzs zzsVar3 = aVar32.h;
                zzs zzsVar22 = aVar32.i;
                Address g22 = ste0Var.g.g();
                Address d22 = ste0Var.g.d();
                String str82 = ste0Var.b.a.a;
                aVar22.getClass();
                aVar22.p = new teh(hifVar2, f2, m2, zzsVar3, zzsVar22, g22, d22, str82);
                bcVar = (bc) this.d;
                egi egiVar2 = new egi(x880Var, 2);
                gyt0 gyt0Var2 = new gyt0(4, this, x880Var);
                if (((dqe0) bcVar.b).a.h() != PaymentMethod$Type.GOOGLE_PAY) {
                }
                break;
        }
    }
}
