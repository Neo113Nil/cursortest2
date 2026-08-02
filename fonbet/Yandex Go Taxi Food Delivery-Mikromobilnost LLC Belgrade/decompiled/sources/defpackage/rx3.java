package defpackage;

import android.webkit.ValueCallback;
import androidx.compose.foundation.pager.d;
import androidx.compose.ui.semantics.f;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import com.yandex.go.beginners.experiments.BeginnersAuthPostloadExperiment;
import com.yandex.go.beginners.flow.b;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.shortcuts.dto.response.PromoMode;
import com.yandex.mobile.drive.wallet.PaymentMethodType;
import com.yandex.passport.api.d1;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.VisualProperties;
import com.yandex.passport.internal.properties.b0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.z;
import com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesView;
import com.yandex.plus.home.feature.webviews.internal.stories.list.WebStoriesContainer;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$MiniStoryControlType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$StoryNavigationType;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountUnlockMoneyResultResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.presentation.saver.a;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardStateV4$Status;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.c;
import com.ybsdk.feature.settings.api.domain.SettingsItemEntity$Type;
import com.ybsdk.rconfig.configs.SavingsAccountBalanceAnimation;
import defpackage.oz40;
import defpackage.pey;
import defpackage.tje;
import defpackage.tse;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.builders.SetBuilder;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoModalView;

/* loaded from: classes3.dex */
public final /* synthetic */ class rx3 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ rx3(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [com.yandex.passport.internal.ui.challenge.logout.bottomsheet.v, oey] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        PaymentMethod$Type c;
        zy11 lambda$onShowFileChooser$5;
        zy11 storySelected$lambda$5;
        int i = this.a;
        int i2 = 9;
        final int i3 = 3;
        int i4 = 4;
        final int i5 = 2;
        final int i6 = 1;
        Object[] objArr = 0;
        final int i7 = 0;
        zy11 zy11Var = zy11.a;
        final boolean z = this.b;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return qx3.a((qx3) obj3, null, null, null, null, null, null, null, ((qx3) ((a) obj2).X()).h && z, HProv.PP_VERSION_TIMESTAMP);
            case 1:
                b bVar = (b) obj3;
                BeginnersAuthPostloadExperiment beginnersAuthPostloadExperiment = (BeginnersAuthPostloadExperiment) obj2;
                if (!(((Result) obj).getValue() instanceof Result.Failure) || bVar.J) {
                    bVar.getClass();
                    if (beginnersAuthPostloadExperiment.c) {
                        bVar.A((m950) bVar.F.get(), new gk5(beginnersAuthPostloadExperiment), new dl1(i5, bVar));
                    } else {
                        bVar.r(new l75(27));
                    }
                } else if (z) {
                    bVar.r(new l75(28));
                } else {
                    bVar.r(new qu(i2));
                }
                return zy11Var;
            case 2:
                zh zhVar = (zh) obj3;
                sls slsVar = (sls) obj2;
                mnq0 mnq0Var = (mnq0) obj;
                f.l(mnq0Var, zhVar.c);
                Boolean bool = zhVar.a;
                if (bool != null) {
                    f.p(mnq0Var, 2);
                    f.q(mnq0Var, bool.booleanValue());
                } else {
                    f.p(mnq0Var, 0);
                }
                String str = zhVar.b;
                if (str != null && z) {
                    f.f(mnq0Var, str, new jc0(12, slsVar));
                }
                return zy11Var;
            case 3:
                oz40 oz40Var = (oz40) obj3;
                oz40 oz40Var2 = (oz40) obj2;
                hoy0 hoy0Var = (hoy0) obj;
                String str2 = hoy0Var.a.b;
                if (!jl40.l(str2, ((hoy0) oz40Var.getValue()).a.b) && !z) {
                    oz40Var2.setValue(Boolean.FALSE);
                    String upperCase = str2.toUpperCase(Locale.ROOT);
                    int length = str2.length();
                    oz40Var.setValue(hoy0.b(hoy0Var, upperCase, eja1.c(length, length), 4));
                }
                return zy11Var;
            case 4:
                oep0 oep0Var = (oep0) obj3;
                oei oeiVar = (oei) obj2;
                if (z) {
                    ((pep0) oep0Var).f((m950) oeiVar.c.get(), p4i.b, hxx.a);
                }
                return zy11Var;
            case 5:
                lea0 lea0Var = (lea0) obj3;
                String str3 = (String) obj2;
                pem pemVar = (pem) obj;
                if (lea0Var != null && (c = lea0Var.c()) != null) {
                    SetBuilder setBuilder = new SetBuilder();
                    setBuilder.add(new mem(str3, c));
                    if (z) {
                        setBuilder.add(new mem(str3, PaymentMethod$Type.PERSONAL_WALLET));
                    }
                    SetBuilder b = setBuilder.b();
                    zsa zsaVar = pemVar.a;
                    ArrayList arrayList = new ArrayList(tcc.n(b, 10));
                    Iterator it = b.iterator();
                    while (true) {
                        if (((uf00) it).hasNext()) {
                            mem memVar = (mem) ((sf00) it).next();
                            String str4 = memVar.a;
                            int i8 = vma0.a[memVar.b.ordinal()];
                            PaymentMethodType paymentMethodType = (i8 == 1 || i8 == 2) ? PaymentMethodType.CARD : i8 != 3 ? i8 != 4 ? i8 != 5 ? null : PaymentMethodType.CORP_WALLET : PaymentMethodType.PLUS : PaymentMethodType.SBP;
                            if (paymentMethodType != null) {
                                arrayList.add(new lem(str4, paymentMethodType));
                            }
                        } else {
                            Set N0 = kotlin.collections.a.N0(arrayList);
                            zsaVar.r(new qu(i2));
                            ((t8j) zsaVar.F).invoke(N0);
                        }
                    }
                }
                return zy11Var;
            case 6:
                List list = (List) obj2;
                mnq0 mnq0Var2 = (mnq0) obj;
                f.l(mnq0Var2, (String) obj3);
                if (z) {
                    f.p(mnq0Var2, 0);
                }
                if (!list.isEmpty()) {
                    f.m(mnq0Var2, list);
                }
                return zy11Var;
            case 7:
                dur0 dur0Var = (dur0) obj3;
                ltr0 ltr0Var = (ltr0) obj2;
                if (z) {
                    dur0Var.a(((Number) ((m3u0) ltr0Var.f.getValue()).getValue()).floatValue());
                } else {
                    dur0Var.a(0.0f);
                }
                return zy11Var;
            case 8:
                final d dVar = (d) obj3;
                final tse tseVar = (tse) obj2;
                mnq0 mnq0Var3 = (mnq0) obj;
                if (z) {
                    sls slsVar2 = new sls() { // from class: androidx.compose.foundation.pager.c
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i9 = i7;
                            boolean z2 = false;
                            tse tseVar2 = tseVar;
                            d dVar2 = dVar;
                            switch (i9) {
                                case 0:
                                    if (dVar2.e()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (dVar2.b()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (dVar2.e()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (dVar2.b()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    };
                    kgx[] kgxVarArr = f.a;
                    mnq0Var3.a(androidx.compose.ui.semantics.a.y, new ag(null, slsVar2));
                    mnq0Var3.a(androidx.compose.ui.semantics.a.A, new ag(null, new sls() { // from class: androidx.compose.foundation.pager.c
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i9 = i6;
                            boolean z2 = false;
                            tse tseVar2 = tseVar;
                            d dVar2 = dVar;
                            switch (i9) {
                                case 0:
                                    if (dVar2.e()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (dVar2.b()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (dVar2.e()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (dVar2.b()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    }));
                } else {
                    sls slsVar3 = new sls() { // from class: androidx.compose.foundation.pager.c
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i9 = i5;
                            boolean z2 = false;
                            tse tseVar2 = tseVar;
                            d dVar2 = dVar;
                            switch (i9) {
                                case 0:
                                    if (dVar2.e()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (dVar2.b()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (dVar2.e()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (dVar2.b()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    };
                    kgx[] kgxVarArr2 = f.a;
                    mnq0Var3.a(androidx.compose.ui.semantics.a.z, new ag(null, slsVar3));
                    mnq0Var3.a(androidx.compose.ui.semantics.a.B, new ag(null, new sls() { // from class: androidx.compose.foundation.pager.c
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i9 = i3;
                            boolean z2 = false;
                            tse tseVar2 = tseVar;
                            d dVar2 = dVar;
                            switch (i9) {
                                case 0:
                                    if (dVar2.e()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (dVar2.b()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (dVar2.e()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (dVar2.b()) {
                                        tje.N(tseVar2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(dVar2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    }));
                }
                return zy11Var;
            case 9:
                String str5 = (String) obj2;
                VisualProperties visualProperties = ((no90) obj3).g;
                VisualProperties.a aVar = new VisualProperties.a();
                aVar.a(visualProperties);
                aVar.a = z;
                VisualProperties.Companion.getClass();
                LoginProperties.a aVar2 = (LoginProperties.a) ((d1) obj);
                aVar2.k(b0.a(aVar));
                if (str5 != null) {
                    aVar2.R = str5;
                }
                return zy11Var;
            case 10:
                List list2 = (List) obj3;
                tls tlsVar = (tls) obj2;
                u6y u6yVar = (u6y) obj;
                int i9 = 6;
                vld0 vld0Var = z ? new vld0(i9) : null;
                ((m6y) u6yVar).f(list2.size(), vld0Var != null ? new tj(19, vld0Var, list2) : null, new rc0(list2, 10, exd0.a), new androidx.compose.runtime.internal.a(802480018, new zx8(list2, tlsVar, i9), true));
                return zy11Var;
            case 11:
                com.ybsdk.feature.savings.internal.helpers.a aVar3 = (com.ybsdk.feature.savings.internal.helpers.a) obj2;
                x4c.g("Unable to change lock for savings account", (Throwable) obj, "agreementId: " + ((String) obj3) + "; locked: " + z, null, 8);
                Pair pair = z ? new Pair(Integer.valueOf(dzh0.ybsdk_savings_lock_money_snackbar_locking_error_title), Integer.valueOf(dzh0.ybsdk_savings_lock_money_snackbar_locking_error_subtitle)) : new Pair(Integer.valueOf(dzh0.ybsdk_savings_unlock_money_snackbar_removal_failed_title), Integer.valueOf(dzh0.ybsdk_savings_unlock_money_snackbar_removal_failed_subtitle));
                aVar3.d.c(unr0.h(Text.Companion, ((Number) pair.getFirst()).intValue()), new Text.Resource(((Number) pair.getSecond()).intValue()));
                if (!z) {
                    rt1 rt1Var = aVar3.e.f0;
                    SavingsEvents$SavingsAccountUnlockMoneyResultResult savingsEvents$SavingsAccountUnlockMoneyResultResult = SavingsEvents$SavingsAccountUnlockMoneyResultResult.ERROR;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                    linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, savingsEvents$SavingsAccountUnlockMoneyResultResult.getOriginalValue());
                    rt1Var.a.a("savings.account.unlock_money.result", linkedHashMap);
                }
                return zy11Var;
            case 12:
                lam0 lam0Var = (lam0) obj3;
                c cVar = (c) obj2;
                fbm0 fbm0Var = (fbm0) obj;
                boolean isEmpty = lam0Var.c.isEmpty();
                SavingsDashboardStateV4$Status savingsDashboardStateV4$Status = SavingsDashboardStateV4$Status.Content;
                lam0 lam0Var2 = fbm0Var.d;
                cVar.getClass();
                if (lam0Var2 != null) {
                    List list3 = lam0Var2.e;
                    int d = gw00.d(tcc.n(list3, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(d >= 16 ? d : 16);
                    for (Object obj4 : list3) {
                        linkedHashMap2.put(((kam0) obj4).a, obj4);
                    }
                    List<kam0> list4 = lam0Var.e;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                    for (kam0 kam0Var : list4) {
                        kam0 kam0Var2 = (kam0) linkedHashMap2.get(kam0Var.a);
                        if (kam0Var2 != null) {
                            kam0Var = kam0.a(kam0Var, null, kam0Var2.i && !kam0Var.g.isEmpty(), 255);
                        }
                        arrayList2.add(kam0Var);
                    }
                    lam0Var = lam0.a(lam0Var, arrayList2);
                }
                return new fbm0(savingsDashboardStateV4$Status, fbm0Var.b && !isEmpty, ((SavingsAccountBalanceAnimation) ((ndm0) cVar.C).a.d(n4m0.c).getData()).isEnabled() && z && cVar.H.b(), lam0Var, null);
            case 13:
                ((ScootersFinishInfoModalView) obj3).bindFinishInfoTitle((ListItemComponent) obj, z, (imn0) obj2);
                return zy11Var;
            case 14:
                o8r0 o8r0Var = (o8r0) obj2;
                rgs0 a = rgs0.a((rgs0) obj, null, false, null, false, null, new e7r0(((com.ybsdk.feature.card.internal.presentation.singlecard.a) obj3).B.getCardId(), o8r0Var.a, i4), false, 895);
                String str6 = o8r0Var.a;
                hgs0 b2 = a.b();
                int i10 = 14;
                if (b2 == null) {
                    x4c.g("There is no changing card with id and state", null, null, null, 14);
                    return a;
                }
                List<o8r0> list5 = b2.e;
                ArrayList arrayList3 = new ArrayList(tcc.n(list5, 10));
                for (o8r0 o8r0Var2 : list5) {
                    if (o8r0Var2.b == SettingsItemEntity$Type.SWITCH && jl40.l(o8r0Var2.a, str6)) {
                        o8r0Var2 = o8r0.a(o8r0Var2, null, false, this.b, null, 4031);
                    }
                    arrayList3.add(o8r0Var2);
                }
                hgs0 e = cdb1.e(a, arrayList3);
                return e != null ? rgs0.a(a, new r8j0(e, objArr == true ? 1 : 0, i10), false, null, false, null, null, false, 1022) : a;
            case 15:
                String str7 = (String) obj3;
                o0t0 o0t0Var = (o0t0) obj2;
                mnq0 mnq0Var4 = (mnq0) obj;
                if (z) {
                    f.n(mnq0Var4, 0);
                }
                p0t0 p0t0Var = new p0t0(o0t0Var, i7);
                kgx[] kgxVarArr3 = f.a;
                mnq0Var4.a(androidx.compose.ui.semantics.a.v, new ag(null, p0t0Var));
                f.o(mnq0Var4, str7);
                return zy11Var;
            case 16:
                w3j0 w3j0Var = (w3j0) obj;
                w3j0Var.a.put("open_reason", ((v770) obj3).a);
                w3j0Var.a.put("promo_mode", ((PromoMode) obj2).getValue());
                w3j0Var.g("restored_from_cache", z);
                w3j0Var.l();
                return zy11Var;
            case 17:
                nww0 nww0Var = (nww0) obj3;
                sls slsVar4 = (sls) obj2;
                mnq0 mnq0Var5 = (mnq0) obj;
                f.l(mnq0Var5, nww0Var.e);
                if (z) {
                    f.p(mnq0Var5, 0);
                    f.f(mnq0Var5, nww0Var.f, new n7l0(16, slsVar4));
                }
                return zy11Var;
            case 18:
                wj31 wj31Var = (wj31) obj3;
                sls slsVar5 = (sls) obj2;
                mnq0 mnq0Var6 = (mnq0) obj;
                f.s(mnq0Var6, wj31Var.e);
                f.l(mnq0Var6, wj31Var.d);
                if (z) {
                    f.p(mnq0Var6, 0);
                    f.f(mnq0Var6, null, new n7l0(20, slsVar5));
                }
                return zy11Var;
            case 19:
                vj31 vj31Var = (vj31) obj3;
                sls slsVar6 = (sls) obj2;
                mnq0 mnq0Var7 = (mnq0) obj;
                f.s(mnq0Var7, vj31Var.e);
                f.l(mnq0Var7, vj31Var.d);
                if (z) {
                    f.p(mnq0Var7, 0);
                    f.f(mnq0Var7, null, new n7l0(21, slsVar6));
                }
                return zy11Var;
            case 20:
                CompositePaymentIconsView compositePaymentIconsView = (CompositePaymentIconsView) obj;
                compositePaymentIconsView.setTitleVisible(z);
                CompositePaymentIconsView.update$default(compositePaymentIconsView, (m1a0) obj3, (z0a0) ((aj31) obj2).b, true, null, 8, null);
                return zy11Var;
            case 21:
                lambda$onShowFileChooser$5 = ((WebChromeClientProxyApi$WebChromeClientImpl) obj3).lambda$onShowFileChooser$5(z, (ValueCallback) obj2, (bzj0) obj);
                return lambda$onShowFileChooser$5;
            case 22:
                storySelected$lambda$5 = WebStoriesContainer.setStorySelected$lambda$5(z, (InMessage$StoryIsVisibleEvent$StoryNavigationType) obj3, (InMessage$StoryIsVisibleEvent$MiniStoryControlType) obj2, (WebStoriesView) obj);
                return storySelected$lambda$5;
            case 23:
                String str8 = (String) obj3;
                String str9 = (String) obj2;
                mnq0 mnq0Var8 = (mnq0) obj;
                f.q(mnq0Var8, z);
                if (str9 == null) {
                    str9 = "";
                }
                f.l(mnq0Var8, str8 + " " + str9);
                return zy11Var;
            default:
                pey peyVar = (pey) obj3;
                final oz40 oz40Var3 = (oz40) obj2;
                ?? r0 = new q() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.v
                    @Override // androidx.lifecycle.q
                    public final void M1(pey peyVar2, Lifecycle.Event event) {
                        if (a0.a[event.ordinal()] == 1) {
                            oz40 oz40Var4 = oz40Var3;
                            if (((Boolean) oz40Var4.getValue()).booleanValue() || !z) {
                                return;
                            }
                            oz40Var4.setValue(Boolean.TRUE);
                        }
                    }
                };
                peyVar.getLifecycle().a(r0);
                return new z(peyVar, r0);
        }
    }

    public /* synthetic */ rx3(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.w = obj2;
    }

    public /* synthetic */ rx3(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.w = obj2;
    }
}
