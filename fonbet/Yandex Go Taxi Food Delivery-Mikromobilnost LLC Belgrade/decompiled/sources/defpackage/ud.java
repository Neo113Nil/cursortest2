package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewParent;
import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import com.yandex.go.chargers.data.j;
import com.yandex.go.drive.vertical.interactor.f;
import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.payments.acceptance.domain.c;
import com.yandex.go.payments.api.GooglePayInteractor$GooglePayTokenResult;
import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.ErrorType;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import com.yandex.go.taxi.order.change.source.mvp.d;
import com.yandex.go.taxi.order.feedback.ui.k;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.divkit.bind.BindType;
import com.yandex.payment.divkit.bind.DKBindCardFragment;
import com.yandex.payment.divkit.bind.b;
import com.yandex.payment.divkit.exitscreen.DKExitFragment;
import com.yandex.payment.divkit.results.DKResultFragment;
import com.yandex.payment.divkit.verify.DKVerifyCardFragment;
import com.yandex.xplat.payment.sdk.NewCard;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.fragment.preorder.e;
import ru.yandex.taxi.masstransit.design.Direction;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.order.view.FeedbackMvpView;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class ud implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ud(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b1, code lost:
    
        r0 = r12.extraButtonAction;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0332, code lost:
    
        if (r2 == false) goto L191;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b9  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        sk7 sk7Var;
        ga0 ga0Var;
        Object value;
        Map map;
        h2a h2aVar;
        Object obj2;
        Object obj3;
        Object obj4;
        b viewModel;
        boolean isLoading;
        boolean isLoading2;
        tc5 activityViewModel;
        b viewModel2;
        BindType bindType;
        ViewParent viewParent;
        boolean isLoading3;
        tc5 activityViewModel2;
        tc5 activityViewModel3;
        sls slsVar;
        sls slsVar2;
        stf stfVar;
        sls slsVar3;
        stf stfVar2;
        sls slsVar4;
        tc5 activityViewModel4;
        Object obj5;
        kvf viewModel3;
        boolean isLoading4;
        boolean isLoading5;
        tc5 activityViewModel5;
        Object e8nVar;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    ((c) obj7).k((String) obj6);
                    break;
                }
                break;
            case 1:
                e.a((e) obj7, (pv0) obj, (PositionInitAction) obj6);
                break;
            case 2:
                if (((GooglePayInteractor$GooglePayTokenResult) obj) != GooglePayInteractor$GooglePayTokenResult.SUCCESS) {
                    ((sls) obj6).invoke();
                    break;
                } else {
                    ((sls) obj7).invoke();
                    break;
                }
            case 3:
                InAppCallExperiment inAppCallExperiment = (InAppCallExperiment) obj;
                pk7 pk7Var = (pk7) obj7;
                qk7 qk7Var = (qk7) obj6;
                tk7 tk7Var = qk7Var.C;
                gkv gkvVar = qk7Var.x;
                tk7Var.getClass();
                pdc pdcVar = tk7Var.a;
                String str = gkvVar.a;
                if (str == null) {
                    str = d6z.Y(inAppCallExperiment, inAppCallExperiment.d);
                }
                String str2 = str;
                String str3 = gkvVar.b;
                if (str3 == null) {
                    str3 = d6z.Y(inAppCallExperiment, inAppCallExperiment.e);
                }
                String str4 = str3;
                InAppCallExperiment.CallButton callButton = inAppCallExperiment.g;
                InAppCallExperiment.RememberMyChoice rememberMyChoice = inAppCallExperiment.o;
                InAppCallExperiment.CallButton callButton2 = inAppCallExperiment.h;
                String Y = d6z.Y(inAppCallExperiment, callButton.a);
                String str5 = callButton.b;
                String Y2 = str5 != null ? d6z.Y(inAppCallExperiment, str5) : null;
                if (Y2 == null) {
                    Y2 = "";
                }
                ufu ufuVar = (ufu) pdcVar;
                kdc b = ufuVar.b(callButton.c);
                kdc i2 = ufuVar.i(callButton.d);
                int i3 = 8;
                sk7 sk7Var2 = new sk7(0, Y, Y2, new md6(i3, b, i2));
                String Y3 = d6z.Y(inAppCallExperiment, callButton2.a);
                String str6 = callButton2.b;
                String Y4 = str6 != null ? d6z.Y(inAppCallExperiment, str6) : null;
                ufu ufuVar2 = (ufu) pdcVar;
                sk7 sk7Var3 = new sk7(0, Y3, Y4 != null ? Y4 : "", new md6(i3, ufuVar2.b(callButton2.c), ufuVar2.i(callButton2.d)));
                if (rememberMyChoice != null) {
                    InAppCallExperiment.RememberMyChoice.OrderCardItem orderCardItem = rememberMyChoice.a;
                    String i4 = InAppCallExperiment.i(inAppCallExperiment, orderCardItem != null ? orderCardItem.a : null);
                    if (i4 != null) {
                        sk7Var = sk7Var3;
                        ga0Var = new ga0(i4, InAppCallExperiment.i(inAppCallExperiment, orderCardItem != null ? orderCardItem.b : null), false);
                        pk7Var.render(new bc(str2, str4, sk7Var2, sk7Var, ga0Var));
                        break;
                    }
                }
                sk7Var = sk7Var3;
                ga0Var = null;
                pk7Var.render(new bc(str2, str4, sk7Var2, sk7Var, ga0Var));
            case 4:
                v780 v780Var = (v780) obj;
                nw7 a = ((qw7) obj7).a((String) obj6);
                Object a2 = a != null ? a.a(v780Var, continuation) : zy11Var;
                if (a2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                com.yandex.go.logistics.cargo_flow.route_selector.b.Hg((com.yandex.go.logistics.cargo_flow.route_selector.b) obj7, (a4l0) obj, (List) obj6);
                break;
            case 6:
                ((c09) obj7).x.d((zzs) obj, (hk50) obj6);
                break;
            case 7:
                ChangeSourcePointExperiment changeSourcePointExperiment = (ChangeSourcePointExperiment) obj;
                ((ac9) obj7).updateTitles(changeSourcePointExperiment);
                d dVar = (d) obj6;
                z2e z2eVar = dVar.I;
                dVar.Ng(z2eVar.b, z2eVar.c, changeSourcePointExperiment);
                dVar.H.emit(changeSourcePointExperiment, continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                break;
            case 8:
                Bitmap bitmap = (Bitmap) obj;
                ac9 ac9Var = (ac9) obj7;
                if (bitmap == null) {
                    ac9Var.showDefaultIcon();
                    break;
                } else {
                    yw0 yw0Var = ((ru.yandex.taxi.address.experiment.e) obj6).a;
                    ac9Var.showIcon(yw0Var.b, yw0Var.c, bitmap);
                    break;
                }
            case 9:
                int intValue = ((Number) obj).intValue();
                ft9 ft9Var = (ft9) ((m3u0) obj6).getValue();
                boolean z = ft9Var.c;
                List list = ft9Var.b;
                if (z && !ft9Var.e) {
                    int size = list.size() - 20;
                    if (intValue >= (size >= 1 ? size : 1)) {
                        ((tls) obj7).invoke(new zs9(list.size()));
                        break;
                    }
                }
                break;
            case 10:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj7;
                l8x l8xVar = (l8x) ref$ObjectRef.element;
                if (l8xVar != null) {
                    l8xVar.a(null);
                    ref$ObjectRef.element = null;
                }
                break;
            case 11:
                long longValue = ((Number) obj).longValue();
                String str7 = (String) obj6;
                r0 r0Var = ((j) obj7).b;
                do {
                    value = r0Var.getValue();
                    map = (Map) value;
                    h2aVar = (h2a) map.get(str7);
                    if (h2aVar == null) {
                        h2aVar = new h2a(r9);
                    }
                } while (!r0Var.k(value, kotlin.collections.b.o(map, new Pair(str7, h2a.a(h2aVar, false, Long.valueOf(longValue), 1)))));
            case 12:
                Iterator it = ((rl9) obj).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (jl40.l(((taa) obj2).a(), ((qca) obj6).a)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                taa taaVar = (taa) obj2;
                if ((taaVar != null ? taaVar.b() : null) != ChargersActiveOrderStatus.LEASING) {
                    ((qda) obj7).r(av0.c);
                    break;
                }
                break;
            case 13:
                rxa rxaVar = (rxa) obj;
                sxa sxaVar = (sxa) obj7;
                if (rxaVar == null) {
                    rxaVar = ((txa) obj6).z;
                }
                sxaVar.render(rxaVar);
                break;
            case 14:
                l8x l8xVar2 = (l8x) ((ru.yandex.taxi.checkin.d) obj7).f.get((String) obj6);
                if (l8xVar2 != null && l8xVar2.isActive()) {
                    break;
                }
                break;
            case 15:
                gwc gwcVar = (gwc) obj;
                ((dwc) obj7).z = gwcVar;
                ((awc) obj6).k(gwcVar);
                break;
            case 16:
                float floatValue = ((Number) obj).floatValue();
                tx40 tx40Var = (tx40) obj7;
                tx40 tx40Var2 = (tx40) obj6;
                tx40Var2.setFloatValue(tx40Var2.getFloatValue() + (floatValue - tx40Var.getFloatValue()));
                tx40Var.setFloatValue(floatValue);
                break;
            case 17:
                ((Boolean) obj).booleanValue();
                tx40 tx40Var3 = (tx40) obj6;
                float floatValue2 = tx40Var3.getFloatValue();
                ((tls) obj7).invoke(floatValue2 > 0.0f ? Direction.UP : floatValue2 < 0.0f ? Direction.DOWN : Direction.NOT_CHANGED);
                tx40Var3.setFloatValue(0.0f);
                break;
            case 18:
                SharedPaymentContext sharedPaymentContext = (SharedPaymentContext) obj6;
                ru.yandex.taxi.sharedpayments.c cVar = (ru.yandex.taxi.sharedpayments.c) obj7;
                int i5 = ((r40) obj).a;
                if (i5 != 0) {
                    if (i5 == -1) {
                        y9p y9pVar = ((vnr0) cVar.B).l;
                        String value2 = sharedPaymentContext.getValue();
                        HashMap n = tse0.n(y9pVar);
                        if (value2 != null) {
                            n.put("context", value2);
                        }
                        y9pVar.a.a("FamilyAccount.ForceZalogin.Success", n, 1, new HashMap());
                        break;
                    }
                } else {
                    y9p y9pVar2 = ((vnr0) cVar.B).l;
                    String value3 = sharedPaymentContext.getValue();
                    HashMap n2 = tse0.n(y9pVar2);
                    if (value3 != null) {
                        n2.put("context", value3);
                    }
                    y9pVar2.a.a("FamilyAccount.ForceZalogin.Cancelled", n2, 1, new HashMap());
                    break;
                }
                break;
            case 19:
                Uri uri = (Uri) obj;
                Object obj8 = (tse) obj7;
                DKBindCardFragment dKBindCardFragment = (DKBindCardFragment) obj6;
                if (!jl40.l(uri.getHost(), "continue")) {
                    if (jl40.l(uri.getHost(), "pay") && jl40.l(uri.getScheme(), "payment-sdk")) {
                        isLoading3 = dKBindCardFragment.isLoading();
                        break;
                    }
                    obj3 = null;
                    if (obj3 != null) {
                        viewModel2 = dKBindCardFragment.getViewModel();
                        bindType = dKBindCardFragment.bindType;
                        viewParent = dKBindCardFragment.cardInput;
                        prf prfVar = (prf) viewParent;
                        if (!(bindType instanceof BindType.OnlyBind)) {
                            if (!(bindType instanceof BindType.BindAndPay)) {
                                if (!(bindType instanceof BindType.PreselectBindAndPay)) {
                                    viewModel2.getClass();
                                    yhl.d(bindType, "Unsupported BindType: ");
                                    break;
                                } else {
                                    int i6 = jrf.a[viewModel2.G.ordinal()];
                                    if (i6 != 1) {
                                        int i7 = 2;
                                        if (i6 != 2) {
                                            ny61.r("Illegal card input state");
                                            break;
                                        } else {
                                            viewModel2.C.m(kn8.a);
                                            if (viewModel2.Q) {
                                                NewCard newCard = prfVar.getNewCard();
                                                if (newCard == null) {
                                                    ny61.r("Valid state without correct payment option");
                                                    break;
                                                } else {
                                                    viewModel2.I.invoke(vvb1.v(newCard));
                                                }
                                            } else {
                                                ((yv90) viewModel2.w).j.a(new zgf(i7, viewModel2));
                                            }
                                        }
                                    } else {
                                        prfVar.proceedToCardDetails();
                                    }
                                }
                            } else {
                                rk6 rk6Var = viewModel2.X().n;
                                if (rk6Var != null) {
                                    rk6Var.invoke();
                                }
                            }
                        } else {
                            rk6 rk6Var2 = viewModel2.W().o;
                            if (rk6Var2 != null) {
                                rk6Var2.invoke();
                            }
                        }
                    }
                    if (((jl40.l(uri.getHost(), "close") || !jl40.l(uri.getScheme(), "payment-sdk")) ? null : obj8) != null) {
                        activityViewModel = dKBindCardFragment.getActivityViewModel();
                        activityViewModel.L();
                    }
                    if (jl40.l(uri.getHost(), "back") && jl40.l(uri.getScheme(), "payment-sdk")) {
                        isLoading2 = dKBindCardFragment.isLoading();
                        if (!isLoading2) {
                            obj4 = obj8;
                            if (obj4 != null) {
                                dKBindCardFragment.requireActivity().onBackPressed();
                            }
                            if (jl40.l(uri.getHost(), "checkbox") && jl40.l(uri.getScheme(), "payment-sdk")) {
                                isLoading = dKBindCardFragment.isLoading();
                                if (!isLoading) {
                                    r10 = obj8;
                                }
                            }
                            if (r10 != null) {
                                viewModel = dKBindCardFragment.getViewModel();
                                dy40 dy40Var = viewModel.D;
                                if (((Boolean) dy40Var.d()) != null) {
                                    dy40Var.l(Boolean.valueOf(!r1.booleanValue()));
                                }
                            }
                            break;
                        }
                    }
                    obj4 = null;
                    if (obj4 != null) {
                    }
                    if (jl40.l(uri.getHost(), "checkbox")) {
                        isLoading = dKBindCardFragment.isLoading();
                        if (!isLoading) {
                        }
                    }
                    if (r10 != null) {
                    }
                }
                obj3 = obj8;
                if (obj3 != null) {
                }
                if (((jl40.l(uri.getHost(), "close") || !jl40.l(uri.getScheme(), "payment-sdk")) ? null : obj8) != null) {
                }
                if (jl40.l(uri.getHost(), "back")) {
                    isLoading2 = dKBindCardFragment.isLoading();
                    if (!isLoading2) {
                    }
                }
                obj4 = null;
                if (obj4 != null) {
                }
                if (jl40.l(uri.getHost(), "checkbox")) {
                }
                if (r10 != null) {
                }
                break;
            case 20:
                Uri uri2 = (Uri) obj;
                DKExitFragment dKExitFragment = (DKExitFragment) obj6;
                Object obj9 = (tse) obj7;
                if (((jl40.l(uri2.getHost(), "confirm") && jl40.l(uri2.getScheme(), "payment-sdk")) ? obj9 : null) != null) {
                    activityViewModel3 = dKExitFragment.getActivityViewModel();
                    activityViewModel3.Q();
                }
                if (jl40.l(uri2.getHost(), "decline") && jl40.l(uri2.getScheme(), "payment-sdk")) {
                    r10 = obj9;
                }
                if (r10 != null) {
                    activityViewModel2 = dKExitFragment.getActivityViewModel();
                    ((xc5) activityViewModel2).X();
                    break;
                }
                break;
            case 21:
                Uri uri3 = (Uri) obj;
                DKResultFragment dKResultFragment = (DKResultFragment) obj6;
                Object obj10 = (tse) obj7;
                if (((jl40.l(uri3.getHost(), "close") && jl40.l(uri3.getScheme(), "payment-sdk")) ? obj10 : null) != null) {
                    activityViewModel4 = dKResultFragment.getActivityViewModel();
                    activityViewModel4.L();
                }
                if (((jl40.l(uri3.getHost(), "back") && jl40.l(uri3.getScheme(), "payment-sdk")) ? obj10 : null) != null) {
                    slsVar3 = dKResultFragment.backButtonAction;
                    if (slsVar3 != null) {
                        slsVar4 = dKResultFragment.backButtonAction;
                        if (slsVar4 != null) {
                            slsVar4.invoke();
                        }
                    } else {
                        stfVar2 = dKResultFragment.callbacks;
                        if (stfVar2 == null) {
                            stfVar2 = null;
                        }
                        yr31 l = stfVar2.l();
                        vtf vtfVar = l instanceof vtf ? (vtf) l : null;
                        if (vtfVar != null && !(vtfVar.w instanceof ResultType.Loading)) {
                            dKResultFragment.requireActivity().onBackPressed();
                        }
                    }
                }
                if (((jl40.l(uri3.getHost(), "primary_action") && jl40.l(uri3.getScheme(), "payment-sdk")) ? obj10 : null) != null) {
                    slsVar2 = dKResultFragment.mainButtonAction;
                    if (slsVar2 != null) {
                        slsVar2.invoke();
                    } else {
                        stfVar = dKResultFragment.callbacks;
                        if (stfVar == null) {
                            stfVar = null;
                        }
                        stfVar.finish();
                    }
                }
                if (jl40.l(uri3.getHost(), "secondary_action") && jl40.l(uri3.getScheme(), "payment-sdk")) {
                    r10 = obj10;
                }
                if (r10 != null && slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 22:
                Uri uri4 = (Uri) obj;
                DKVerifyCardFragment dKVerifyCardFragment = (DKVerifyCardFragment) obj6;
                Object obj11 = (tse) obj7;
                if (((jl40.l(uri4.getHost(), "close") && jl40.l(uri4.getScheme(), "payment-sdk")) ? obj11 : null) != null) {
                    activityViewModel5 = dKVerifyCardFragment.getActivityViewModel();
                    activityViewModel5.L();
                }
                if (jl40.l(uri4.getHost(), "back") && jl40.l(uri4.getScheme(), "payment-sdk")) {
                    isLoading5 = dKVerifyCardFragment.isLoading();
                    if (!isLoading5) {
                        obj5 = obj11;
                        if (obj5 != null) {
                            dKVerifyCardFragment.requireActivity().onBackPressed();
                        }
                        if (jl40.l(uri4.getHost(), "checkbox") && jl40.l(uri4.getScheme(), "payment-sdk")) {
                            isLoading4 = dKVerifyCardFragment.isLoading();
                            if (!isLoading4) {
                                r10 = obj11;
                            }
                        }
                        if (r10 != null) {
                            viewModel3 = dKVerifyCardFragment.getViewModel();
                            dy40 dy40Var2 = viewModel3.H;
                            if (((Boolean) dy40Var2.d()) != null) {
                                dy40Var2.l(Boolean.valueOf(!r1.booleanValue()));
                                break;
                            }
                        }
                    }
                }
                obj5 = null;
                if (obj5 != null) {
                }
                if (jl40.l(uri4.getHost(), "checkbox")) {
                    isLoading4 = dKVerifyCardFragment.isLoading();
                    if (!isLoading4) {
                    }
                }
                if (r10 != null) {
                }
                break;
            case 23:
                b8h b8hVar = (b8h) obj;
                if (b8hVar == null) {
                    ((ra9) ((y7h) obj6).y.b).r(new qu(9));
                    break;
                } else {
                    ((x7h) obj7).R8(b8hVar);
                    break;
                }
            case 24:
                lpj lpjVar = (lpj) obj;
                com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.b bVar = (com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.b) obj7;
                kpj kpjVar = lpjVar.b;
                String str8 = kpjVar != null ? kpjVar.b : null;
                bVar.I = ((str8 == null || str8.length() == 0) ? 1 : 0) ^ 1;
                ((cpj) obj6).render(lpjVar);
                if (!bVar.E) {
                    bVar.E = true;
                    xjg xjgVar = bVar.y;
                    boolean z2 = bVar.I;
                    o61 o61Var = (o61) xjgVar.c;
                    r10 = z2 ? ErrorType.NETWORK.getValue() : null;
                    o61Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (r10 != null) {
                        hashMap.put("type_error", r10);
                    }
                    o61Var.a.a("EnterPromoCodeCard.Shown", hashMap, 1, new HashMap());
                    CharSequence charSequence = (CharSequence) bVar.G.getValue();
                    if (charSequence != null && charSequence.length() != 0) {
                        bVar.Kg();
                        break;
                    }
                }
                break;
            case 25:
                fem femVar = (fem) obj;
                ahm ahmVar = (ahm) obj7;
                ahmVar.H = femVar;
                if (((xgm) obj6).isCollapsed() || ahmVar.I == null) {
                    if (!(femVar instanceof t0k)) {
                        if (!(femVar instanceof eem)) {
                            w511.b();
                            break;
                        } else {
                            ahmVar.I = null;
                        }
                    } else {
                        ahmVar.Mg((t0k) femVar);
                    }
                }
                break;
            case 26:
                List list2 = (List) obj;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (jl40.l(((za31) it2.next()).a.a, ((f) obj6).a)) {
                            break;
                        }
                    }
                }
                ((sls) obj7).invoke();
                break;
            case 27:
                o7n o7nVar = (o7n) obj7;
                d8n d8nVar = (d8n) obj;
                if (!(d8nVar instanceof y7n) && !(d8nVar instanceof c8n)) {
                    if (!(d8nVar instanceof z7n) && !(d8nVar instanceof a8n)) {
                        if (!(d8nVar instanceof b8n)) {
                            w511.b();
                            break;
                        } else {
                            ((r7n) o7nVar.y.a).r(new q7n(((b8n) d8nVar).a, 0));
                            break;
                        }
                    } else {
                        e8nVar = f8n.a;
                    }
                } else {
                    e8nVar = new e8n(((avj0) o7nVar.A.a).h(kyh0.error_occurred), ((avj0) o7nVar.A.a).h(kyh0.common_ok));
                }
                ((n7n) obj6).render(e8nVar);
                break;
            case 28:
                ((ru.yandex.taxi.favorites.edit.presenter.d) obj7).Mg();
                ((cgp) obj6).applyThemeType((ThemeType) obj);
                break;
            default:
                k kVar = (k) obj6;
                ((FeedbackMvpView) obj7).setRatingReasonsType((FeedbackStrategy.FeedbackType) obj, kVar.I.w2(kVar.K));
                break;
        }
        return zy11Var;
    }
}
