package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.sbp.SbpOperation;
import com.yandex.payment.divkit.bind.BindType;
import com.yandex.payment.divkit.bind.DKBindCardFragment;
import com.yandex.payment.divkit.results.DKResultFragment;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.BoundSbpToken;
import com.yandex.payment.sdk.core.data.CardValidationConfig;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.core.data.PaymentSettings;
import com.yandex.payment.sdk.core.data.PersonalInfo;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.model.data.PersonalInfoVisibility;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.common.WebViewFragment;
import com.yandex.payment.sdk.ui.common.YB2FAObservingWebViewFragment;
import com.yandex.payment.sdk.ui.common.c;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.payment.sdk.ui.payment.newbind.NewBindFragment;
import com.yandex.payment.sdk.ui.payment.sbp.BindSbpActivity;
import com.yandex.payment.sdk.ui.payment.sbp.SbpFragment;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import com.yandex.xplat.payment.sdk.NewCard;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class zbq0 implements ybq0, c560, xcy, igm0, ye51, nmo, arf, stf, z89 {
    public PersonalInfo A;
    public wga0 B;
    public boolean C;
    public final BaseActivity a;
    public final wy4 b;
    public final ay90 c;
    public final sls w;
    public final sls x;
    public final ddf y;
    public final boolean z;

    public zbq0(BaseActivity baseActivity, wy4 wy4Var, ay90 ay90Var, sls slsVar, sls slsVar2, ddf ddfVar, boolean z) {
        this.a = baseActivity;
        this.b = wy4Var;
        this.c = ay90Var;
        this.w = slsVar;
        this.x = slsVar2;
        this.y = ddfVar;
        this.z = z;
        pwf pwfVar = (pwf) wy4Var;
        this.A = new PersonalInfo(pwfVar.e().getFirstName(), pwfVar.e().getLastName(), pwfVar.e().getPhone(), pwfVar.e().getEmail());
    }

    @Override // defpackage.nrf
    public final uv90 A() {
        return this.B;
    }

    @Override // defpackage.vw90
    public final void B(sls slsVar) {
        ((PaymentButtonView) this.x.invoke()).setOnClickListener(new xbg0(7, slsVar));
    }

    @Override // defpackage.nrf
    public final void C() {
        BaseActivity baseActivity = this.a;
        PaymentActivity paymentActivity = baseActivity instanceof PaymentActivity ? (PaymentActivity) baseActivity : null;
        if (paymentActivity != null) {
            paymentActivity.hideActivityViews$paymentsdk_release();
        }
    }

    @Override // defpackage.xcy
    public final ddy E() {
        return new ddy();
    }

    @Override // defpackage.nrf
    public final px90 F() {
        return ((pwf) this.b).g();
    }

    public final void G() {
        Object obj = dgo.a;
        pwf pwfVar = (pwf) this.b;
        ev5 a = dgo.a(pwfVar.b());
        if (a != null) {
            a.a(vvb1.J);
        }
        oy90 oy90Var = (oy90) ((qwf) this.c).c.get();
        if (oy90Var.l) {
            uv90 uv90Var = oy90Var.j;
            if (uv90Var == null) {
                uv90Var = null;
            }
            wga0 wga0Var = (wga0) uv90Var;
            wga0Var.b.a();
            wga0Var.i.invoke();
        }
        ((yv90) pwfVar.f()).j.c();
        this.a.finishWithResult$paymentsdk_release();
    }

    public final oy90 H() {
        return (oy90) ((qwf) this.c).c.get();
    }

    public final NewCard I() {
        BaseActivity baseActivity = this.a;
        PreselectActivity preselectActivity = baseActivity instanceof PreselectActivity ? (PreselectActivity) baseActivity : null;
        jhq0 selectedMethod = preselectActivity != null ? preselectActivity.getSelectedMethod() : null;
        ihq0 ihq0Var = selectedMethod instanceof ihq0 ? (ihq0) selectedMethod : null;
        if (ihq0Var != null) {
            return ihq0Var.b;
        }
        return null;
    }

    public final zry0 J() {
        xry0 xry0Var = yry0.a;
        return tnb1.f(yry0.a);
    }

    public final void K() {
        this.a.removeFragment$paymentsdk_release(j9h0.challenge_fragment);
    }

    public final void L() {
        int i = j9h0.loading_fragment_container;
        BaseActivity baseActivity = this.a;
        baseActivity.removeFragment$paymentsdk_release(i);
        baseActivity.hideLoading$paymentsdk_release();
    }

    public final void M(int i, BoundSbpToken boundSbpToken) {
        Object obj = dgo.a;
        ev5 a = dgo.a(((pwf) this.b).b());
        if (a != null) {
            a.a(h2b1.L);
        }
        this.a.applyProcessResultSuccess$paymentsdk_release(new c(this, new kyj0(Integer.valueOf(i)), boundSbpToken));
    }

    public final void N(PaymentKitError paymentKitError) {
        Object obj = dgo.a;
        ev5 a = dgo.a(((pwf) this.b).b());
        if (a != null) {
            a.a(new f0a0(paymentKitError));
        }
        this.a.applyProcessResultError$paymentsdk_release(paymentKitError, new c(this, new hyj0(paymentKitError), null));
    }

    public final void O(boolean z) {
        Fragment fragment;
        BaseActivity baseActivity = this.a;
        if (!z) {
            baseActivity.popFragmentBackStack$paymentsdk_release();
        }
        new xsf();
        AccessibilityManager accessibilityManager = (AccessibilityManager) baseActivity.getApplicationContext().getSystemService("accessibility");
        boolean e = apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG);
        wy4 wy4Var = this.b;
        if (e && apa1.e(FeatureFlag.DIV_KIT_BIND_FLAG)) {
            boolean isAuthorized = ((pwf) wy4Var).e().isAuthorized();
            boolean z2 = apa1.e(FeatureFlag.ENABLE_NFC_FLAG) && !accessibilityManager.isEnabled();
            boolean e2 = apa1.e(FeatureFlag.ENABLE_CARD_SCANNER_FLAG);
            DKBindCardFragment.Companion.getClass();
            Fragment dKBindCardFragment = new DKBindCardFragment();
            dKBindCardFragment.setArguments(wwg.g(new Pair("ARG_BIND_TYPE", new BindType.BindAndPay(z2, false, z, isAuthorized, e2, 2, null))));
            fragment = dKBindCardFragment;
        } else {
            e560 e560Var = NewBindFragment.Companion;
            pwf pwfVar = (pwf) wy4Var;
            boolean isAuthorized2 = pwfVar.e().isAuthorized();
            PersonalInfoVisibility personalInfoVisibility = (PersonalInfoVisibility) pwfVar.p.get();
            PaymentSettings g = this.B.g();
            boolean showCharityLabel = pwfVar.a().getShowCharityLabel();
            e560Var.getClass();
            Fragment newBindFragment = new NewBindFragment();
            newBindFragment.setArguments(wwg.g(new Pair("ARG_IS_BACK_BUTTON_ENABLED", Boolean.valueOf(z)), new Pair("ARG_SHOULD_SHOW_SAVE_CARD", Boolean.valueOf(isAuthorized2)), new Pair("ARG_PERSONAL_INFO_VISIBILITY", personalInfoVisibility), new Pair("ARG_PAYMENT_SETTINGS", g), new Pair("ARG_SHOW_CHARITY_LABEL", Boolean.valueOf(showCharityLabel))));
            fragment = newBindFragment;
        }
        BaseActivity.replaceFragment$paymentsdk_release$default(this.a, fragment, true, 0, 4, null);
        L();
    }

    public final void P(Fragment fragment, boolean z) {
        BaseActivity.replaceFragment$paymentsdk_release$default(this.a, fragment, false, z ? j9h0.fragment_container : j9h0.challenge_fragment, 2, null);
        this.a.showChallenge$paymentsdk_release();
        n(false);
        L();
    }

    public final void Q(DKResultFragment dKResultFragment) {
        BaseActivity baseActivity = this.a;
        baseActivity.showLoading$paymentsdk_release();
        if (baseActivity instanceof PaymentActivity) {
            ((PaymentActivity) baseActivity).showLoadingFragment$paymentsdk_release(dKResultFragment);
        } else if (baseActivity instanceof PreselectActivity) {
            ((PreselectActivity) baseActivity).showLoadingFragment$paymentsdk_release(dKResultFragment);
        } else if (baseActivity instanceof BindSbpActivity) {
            ((BindSbpActivity) baseActivity).showLoadingFragment$paymentsdk_release(dKResultFragment);
        }
    }

    public final boolean R(Intent intent) {
        try {
            this.a.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            rwo eventReporter = getEventReporter();
            qv90.a.getClass();
            ((y22) eventReporter).a(sv90.o0("Couldn't find SPB activity: " + e));
            return false;
        } catch (Exception e2) {
            rwo eventReporter2 = getEventReporter();
            qv90.a.getClass();
            ((y22) eventReporter2).a(sv90.o0("Failed to start SPB activity: " + e2));
            return false;
        }
    }

    public final void S(String str, SbpOperation sbpOperation, boolean z) {
        Fragment f = new xsf().f(str, sbpOperation, z);
        if (!apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) || !apa1.e(FeatureFlag.DIV_KIT_SBP_FLAG)) {
            f = null;
        }
        if (f == null) {
            SbpFragment.Companion.getClass();
            f = rgm0.a(str, sbpOperation, z);
            L();
        }
        BaseActivity.replaceFragment$paymentsdk_release$default(this.a, f, z, 0, 4, null);
    }

    @Override // defpackage.xcy
    public final tc5 a() {
        BaseActivity baseActivity = this.a;
        if (baseActivity instanceof PreselectActivity) {
            return ((PreselectActivity) baseActivity).getActivityViewModel();
        }
        if (baseActivity instanceof PaymentActivity) {
            return ((PaymentActivity) baseActivity).getActivityViewModel();
        }
        if (baseActivity instanceof BindSbpActivity) {
            return ((BindSbpActivity) baseActivity).getActivityViewModel();
        }
        w511.j("Activity ", baseActivity, " not provide activity view model");
        return null;
    }

    @Override // defpackage.xcy
    public final Object b(Fragment fragment, Class cls) {
        return ((y8h) ((p7u) dpb1.c(fragment)).componentDispatcher()).b(cls);
    }

    @Override // defpackage.arf
    public final void c(BoundCard boundCard) {
    }

    @Override // defpackage.ts90
    public final void d(String str, List list) {
        if (apa1.e(FeatureFlag.WEBVIEW_CACHE) && this.C) {
            return;
        }
        xe51 xe51Var = YB2FAObservingWebViewFragment.Companion;
        b88 card3DSWebViewDelegateFactory = ((eyf0) this.y.b).getCard3DSWebViewDelegateFactory();
        PaymentSdkEnvironment paymentSdkEnvironment = ((pwf) this.b).d().a;
        xe51Var.getClass();
        YB2FAObservingWebViewFragment yB2FAObservingWebViewFragment = new YB2FAObservingWebViewFragment(card3DSWebViewDelegateFactory);
        WebViewFragment.Companion.getClass();
        yB2FAObservingWebViewFragment.setArguments(eq41.b(str, paymentSdkEnvironment, list, true, false));
        BaseActivity.replaceFragment$paymentsdk_release$default(this.a, yB2FAObservingWebViewFragment, false, j9h0.challenge_fragment, 2, null);
        this.a.showChallenge$paymentsdk_release();
        L();
    }

    @Override // defpackage.arf
    public final void e(PaymentKitError paymentKitError) {
    }

    @Override // defpackage.ts90
    public final void f() {
        this.a.removeFragment$paymentsdk_release(j9h0.challenge_fragment);
    }

    @Override // defpackage.stf
    public final void finish() {
        this.a.finishWithResult$paymentsdk_release();
    }

    @Override // defpackage.nrf
    public final boolean g() {
        return apa1.e(FeatureFlag.NO_CVV_MIR_PAY) && ((yv90) ox21.b(((pwf) this.b).f())).e();
    }

    @Override // defpackage.x760
    public final rwo getEventReporter() {
        return ((pwf) this.b).c();
    }

    @Override // defpackage.arf
    public final void h(rf8 rf8Var) {
    }

    @Override // defpackage.nrf
    public final int i() {
        cvy0 cvy0Var = ckt.a;
        return ckt.a(this.a.getBaseContext());
    }

    @Override // defpackage.ts90
    public final void j(String str) {
        d(str, EmptyList.a);
    }

    @Override // defpackage.nrf
    public final vv90 k() {
        return ((pwf) this.b).f();
    }

    @Override // defpackage.stf
    public final yr31 l() {
        return this.a.getResultViewModel();
    }

    @Override // defpackage.ts90
    public final void m() {
        Object obj = dgo.a;
        ev5 a = dgo.a(((pwf) this.b).b());
        if (a != null) {
            a.a(wfz.L);
        }
    }

    @Override // defpackage.vw90
    public final void n(boolean z) {
        ((PaymentButtonView) this.x.invoke()).setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.nrf
    public final CardValidationConfig o() {
        return ((pwf) this.b).a().getCardValidationConfig();
    }

    @Override // defpackage.xcy
    public final void p(boolean z) {
        TextView textView = (TextView) this.w.invoke();
        if (evu0.J(textView.getText())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // defpackage.ts90
    public final void q(PaymentKitError paymentKitError) {
        Object obj = dgo.a;
        ev5 a = dgo.a(((pwf) this.b).b());
        if (a != null) {
            a.a(new f0a0(paymentKitError));
        }
        this.a.applyProcessResultError$paymentsdk_release(paymentKitError, new c(this, new hyj0(paymentKitError), null));
    }

    @Override // defpackage.ts90
    public final void r(int i) {
        Object obj = dgo.a;
        ev5 a = dgo.a(((pwf) this.b).b());
        if (a != null) {
            a.a(h2b1.L);
        }
        this.a.applyProcessResultSuccess$paymentsdk_release(new c(this, new kyj0(Integer.valueOf(i)), null));
    }

    @Override // defpackage.nrf
    public final boolean s() {
        BaseActivity baseActivity = this.a;
        ViewBindingActivityImpl viewBindingActivityImpl = baseActivity instanceof ViewBindingActivityImpl ? (ViewBindingActivityImpl) baseActivity : null;
        return n891.o(viewBindingActivityImpl != null ? Boolean.valueOf(viewBindingActivityImpl.getDebrandingFlag$paymentsdk_release()) : null);
    }

    @Override // defpackage.xcy
    public final void t() {
        ((PaymentButtonView) this.x.invoke()).setVisibility(8);
    }

    @Override // defpackage.vw90
    public final void u(String str, String str2, String str3) {
        ((PaymentButtonView) this.x.invoke()).setText(str, str2, null);
    }

    @Override // defpackage.vw90
    public final void v(lx90 lx90Var) {
        ((PaymentButtonView) this.x.invoke()).setState(lx90Var);
    }

    @Override // defpackage.nmo
    public final wmo w() {
        return new wmo();
    }

    @Override // defpackage.nrf
    public final pv5 x() {
        return new pv5();
    }

    @Override // defpackage.nrf
    public final boolean y() {
        return apa1.e(FeatureFlag.NO_CVV_MIR_BINDING) && apa1.e(FeatureFlag.BINDING_PSP_FLAG);
    }

    @Override // defpackage.nrf
    public final void z(TextRes textRes, Integer num) {
        BaseActivity baseActivity = this.a;
        if (baseActivity instanceof PaymentActivity) {
            ((PaymentActivity) baseActivity).showSnackBar$paymentsdk_release(textRes, null, null);
        } else if (baseActivity instanceof PreselectActivity) {
            ((PreselectActivity) baseActivity).showSnackBar$paymentsdk_release(textRes, null, null);
        }
    }
}
