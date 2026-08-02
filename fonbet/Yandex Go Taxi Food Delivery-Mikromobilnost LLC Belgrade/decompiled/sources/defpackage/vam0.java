package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.lifecycle.v;
import com.yandex.go.scooters.bdui.api.ScootersBduiScreenType;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.yandex.go.scooters.passes.h;
import com.yandex.go.scooters.qr.api.ScootersQrNumberResultSource;
import com.yandex.mobile.drive.scan.ui.b;
import com.yandex.payment.divkit.usecases.t;
import com.ybsdk.core.analytics.generated.delegates.AllCardsEvents$AllCardsSnackbarShownState;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.main.internal.screens.sbpAccount.a;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardFragmentV4;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsShelfView;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.c;
import com.ybsdk.feature.savings.internal.views.SavingsDivCardView;
import com.ybsdk.feature.savings.internal.views.SavingsNoAccountsView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.carplates.ui.services.ScootersCarIndexContainerView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersNewControlPanelView;

/* loaded from: classes13.dex */
public final /* synthetic */ class vam0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vam0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 renderContent$lambda$3;
        List list;
        Object obj2;
        boolean render$lambda$0;
        zy11 render$lambda$5;
        aem0 aem0Var;
        v u;
        Integer num;
        zy11 bindScootersData$lambda$1;
        zy11 bindScootersData$lambda$0;
        zy11 updateState$lambda$0;
        int i = this.a;
        int i2 = 14;
        int i3 = 2;
        char c = 1;
        int i4 = 0;
        Object[] objArr = 0;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                renderContent$lambda$3 = SavingsDashboardFragmentV4.renderContent$lambda$3((SavingsDashboardFragmentV4) obj4, (gcm0) obj3, ((Boolean) obj).booleanValue());
                break;
            case 1:
                String str = (String) obj4;
                c cVar = (c) obj3;
                fbm0 fbm0Var = (fbm0) obj;
                lam0 lam0Var = fbm0Var.d;
                if (lam0Var != null && (list = lam0Var.e) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            List list2 = ((kam0) obj2).g;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (cvu0.s(((gc5) it2.next()).b(), str, false)) {
                                    }
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    kam0 kam0Var = (kam0) obj2;
                    if (kam0Var != null) {
                        List list3 = kam0Var.g;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : list3) {
                            if (!cvu0.s(((gc5) obj5).b(), str, false)) {
                                arrayList.add(obj5);
                            }
                        }
                        break;
                    }
                }
                c.l0(cVar, "shelf is null, but item remove initiated", str);
                break;
            case 2:
                render$lambda$0 = SavingsDivCardView.render$lambda$0((SavingsDivCardView) obj4, (ocm0) obj3, (Uri) obj);
                break;
            case 3:
                n70 n70Var = (n70) obj;
                n70Var.W(new zdk0(17, n70Var, (zls) obj4, (tls) obj3));
                break;
            case 4:
                n70 n70Var2 = (n70) obj4;
                SavingsNoAccountsView savingsNoAccountsView = ((r361) n70Var2.N).b;
                jdm0 jdm0Var = (jdm0) n70Var2.Z();
                savingsNoAccountsView.render(new kdm0(jdm0Var.c, jdm0Var.d, jdm0Var.e, jdm0Var.f, jdm0Var.g, jdm0Var.h));
                ((r361) n70Var2.N).b.setActionListener((bab) obj3);
                break;
            case 5:
                render$lambda$5 = SavingsShelfView.render$lambda$5((SavingsShelfView) obj4, (tdm0) obj3, ((Boolean) obj).booleanValue());
                break;
            case 6:
                dqg dqgVar = (dqg) obj4;
                a aVar = (a) obj3;
                fem0 fem0Var = (fem0) obj;
                lrp0 lrp0Var = lrp0.C;
                if (dqgVar instanceof cqg) {
                    if (fem0Var instanceof dem0) {
                        dx11 dx11Var = ((dem0) fem0Var).a.e;
                        aVar.Z(new iem0(new n0t0(dx11Var.a, dx11Var.b)));
                        rt1.a(aVar.F.c, AllCardsEvents$AllCardsSnackbarShownState.UNLINKED);
                        aVar.Z(new hem0(new Bundle()));
                        break;
                    } else {
                        x4c.g("Incorrect screen order", null, "in unbindAccount() success block", Collections.singletonList(lrp0Var), 2);
                        aem0Var = new aem0(7, null, null, null);
                        break;
                    }
                } else if (!(dqgVar instanceof bqg)) {
                    w511.b();
                    break;
                } else if (fem0Var instanceof dem0) {
                    dx11 dx11Var2 = ((dem0) fem0Var).a.f;
                    aVar.Z(new iem0(new n0t0(dx11Var2.a, dx11Var2.b)));
                    rt1.a(aVar.F.c, AllCardsEvents$AllCardsSnackbarShownState.ERROR_UNLINKING);
                } else {
                    x4c.g("Incorrect screen order", null, "in unbindAccount() failed block", Collections.singletonList(lrp0Var), 2);
                    aem0Var = new aem0(7, null, null, null);
                }
            case 7:
                eu5 eu5Var = (eu5) obj3;
                r8j0 r8j0Var = new r8j0(new wem0((ArrayList) obj4, "", new fu5(g8e.i(Text.Companion, eu5Var.a), new Text.Constant(eu5Var.b), new Text.Constant(eu5Var.c.a), new Text.Constant(eu5Var.d), null), false), objArr == true ? 1 : 0, i2);
                ((vem0) obj).getClass();
                break;
            case 8:
                tem0 tem0Var = ((t) obj4).d;
                o8k0 o8k0Var = new o8k0(26, (luf) obj3, (qim0) obj);
                if (tem0Var.a) {
                    o8k0Var.invoke();
                    break;
                }
                break;
            case 9:
                ((zz40) obj4).a.setValue(new ako((p651) obj3, (p651) obj));
                break;
            case 10:
                b bVar = (b) obj4;
                com.yandex.mobile.drive.scan.ui.c cVar2 = (com.yandex.mobile.drive.scan.ui.c) obj3;
                pdy pdyVar = bVar.q;
                if (pdyVar != null) {
                    tob1.b();
                    ody odyVar = pdyVar.s;
                    ar7 c2 = odyVar == null ? null : odyVar.c();
                    bVar.y = (c2 == null || (u = ((g70) c2).u()) == null || (num = (Integer) u.d()) == null || num.intValue() != 0) ? false : true;
                    tob1.b();
                    ody odyVar2 = pdyVar.s;
                    qp7 b = odyVar2 != null ? odyVar2.b() : null;
                    if (b != null) {
                        ((e70) b).f(bVar.y);
                    }
                    cVar2.e.setBackgroundResource(bVar.y ? m0h0.torch_enabled : m0h0.torch_disabled);
                    break;
                }
                break;
            case 11:
                sco0 sco0Var = (sco0) obj4;
                bgo0 bgo0Var = (bgo0) obj;
                h hVar = bgo0Var.a;
                ScootersPassesFromScreen scootersPassesFromScreen = bgo0Var.b;
                String str2 = bgo0Var.c;
                hVar.T(sco0Var, scootersPassesFromScreen, str2, (String) obj3, new r8c0(hVar, sco0Var, scootersPassesFromScreen, str2, 8));
                break;
            case 12:
                break;
            case 13:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = new g92(i3, zy11Var);
                agd agdVar = (agd) yfdVar;
                agdVar.e = new j01(i4);
                agdVar.g = new androidx.compose.runtime.internal.a(-965321262, new l0(28, (ss9) obj4, (ScootersBduiScreenType) obj3), true);
                break;
            case 14:
                bindScootersData$lambda$1 = ScootersCarIndexContainerView.bindScootersData$lambda$1((Drawable) obj4, (ScootersCarIndexContainerView) obj3, (ImageView) obj);
                break;
            case 15:
                bindScootersData$lambda$0 = ScootersCarIndexContainerView.bindScootersData$lambda$0((Bitmap) obj4, (ScootersCarIndexContainerView) obj3, (ImageView) obj);
                break;
            case 16:
                ((j4o0) obj).x((List) obj4, ((o4o0) ((r0) ((h7n0) obj3).a.a).getValue()).c);
                break;
            case 17:
                fl5 fl5Var = (fl5) obj4;
                zuo0 zuo0Var = (zuo0) obj3;
                fl5Var.A((m950) ((yvf0) fl5Var.J).get(), new zjn0(zuo0Var.m(), (Throwable) obj, Collections.singletonList(zuo0Var.getNumber().a)), new t8n0(fl5Var, zuo0Var, i4));
                break;
            case 18:
                ((com.yandex.go.scooters.utils.data.a) obj4).c.remove((Pair) obj3);
                break;
            case 19:
                fl5 fl5Var2 = (fl5) obj4;
                zuo0 zuo0Var2 = (zuo0) obj3;
                m950 m950Var = (m950) ((yvf0) fl5Var2.G).get();
                zjn0 zjn0Var = new zjn0(zuo0Var2.m(), (Throwable) obj, Collections.singletonList(zuo0Var2.getNumber().a));
                ujn0.a4.getClass();
                fl5Var2.A(m950Var, zjn0Var, tjn0.b);
                break;
            case 20:
                updateState$lambda$0 = ScootersNewControlPanelView.updateState$lambda$0((ScootersNewControlPanelView) obj4, (ahn0) obj3, (kfn0) obj);
                break;
            case 21:
                klo0 klo0Var = (klo0) obj;
                com.yandex.go.scooters.b bVar2 = klo0Var.a;
                com.yandex.go.scooters.b.R(bVar2, (fcj0) obj4, new r8c0(bVar2, klo0Var.b, klo0Var.c, (qpo0) obj3, 9));
                break;
            case 22:
                n5o0 n5o0Var = (n5o0) obj4;
                long longValue = ((Long) obj).longValue();
                n5o0Var.b.getClass();
                czf0.a(longValue, (String) obj3);
                n5o0Var.a.getClass();
                break;
            case 23:
                break;
            case 24:
                deo0 deo0Var = (deo0) obj3;
                d6x d6xVar = (d6x) obj;
                s6x s6xVar = deo0.b;
                Set<Map.Entry> entrySet = ((Map) obj4).entrySet();
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : entrySet) {
                    Object d = xsq0.d((kotlinx.serialization.json.b) entry.getValue());
                    Pair pair = d == null ? null : new Pair(entry.getKey(), d);
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Pair pair2 = (Pair) it3.next();
                    String str3 = (String) pair2.getFirst();
                    Object second = pair2.getSecond();
                    deo0Var.getClass();
                    d6xVar = jason.statham.tools.a.d(d6xVar, deo0.a(str3), jx81.M(second), deo0.b);
                }
                break;
            case 25:
                hfa0 hfa0Var = (hfa0) obj3;
                ((com.yandex.go.scooters.payments.navigation.a) obj4).E.b().g(hfa0Var.b(), "no_feature");
                ((rgo0) obj).j(hfa0Var);
                break;
            case 26:
                ejo0 ejo0Var = (ejo0) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ejo0Var.e.setEnabled(booleanValue);
                ListItemComponent listItemComponent = ejo0Var.c;
                ljo0 ljo0Var = ((com.yandex.go.scooters.photocontrol.camera_ui.take_photo.b) obj3).m;
                listItemComponent.setTitle(booleanValue ? ljo0Var.c : ljo0Var.d);
                listItemComponent.setLeadImage(booleanValue ? ljo0Var.e : ljo0Var.f);
                break;
            case 27:
                r7p0 r7p0Var = (r7p0) obj4;
                ((rpo0) obj).B0(r7p0Var.a, r7p0Var.b.k(), (ScootersQrNumberResultSource) obj3);
                break;
            case 28:
                ru.yandex.taxi.scooters.presentation.route_navigation.b bVar3 = (ru.yandex.taxi.scooters.presentation.route_navigation.b) obj4;
                bVar3.A((m950) bVar3.E.get(), new zjn0(((auo0) obj3).c.m(), (Throwable) obj, (List) null), new ndn0(3, bVar3));
                break;
            default:
                lrm0 lrm0Var = (lrm0) ((pgk0) obj3).b;
                ozo0 ozo0Var = (ozo0) obj;
                ((pzo0) obj4).getClass();
                if (!jl40.l(ozo0Var, mzo0.d)) {
                    if (ozo0Var instanceof nzo0) {
                        lrm0Var.A((m950) lrm0Var.I.get(), new w8p0(new q8p0(((nzo0) ozo0Var).a, false), (com.yandex.go.scooters.mosru.b) null, 6), sy60.Q2);
                    } else if (jl40.l(ozo0Var, mzo0.a)) {
                        lrm0Var.r(new qu(9));
                    } else if (jl40.l(ozo0Var, mzo0.c)) {
                        lrm0Var.r(new tyo0(c == true ? 1 : 0));
                    } else if (!jl40.l(ozo0Var, mzo0.b)) {
                        w511.b();
                        break;
                    } else {
                        lrm0Var.r(new tyo0(i3));
                    }
                }
                break;
        }
        return zy11Var;
    }
}
