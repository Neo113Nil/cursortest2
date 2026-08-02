package defpackage;

import com.yandex.go.settings.analytics.MenuDontCallAnalytics$Enabled;
import com.yandex.go.settings.analytics.MenuDontShowPromoPushesAnalytics$Enabled;
import com.yandex.go.settings.analytics.MenuDontSmsAnalytics$Enabled;
import com.yandex.go.settings.analytics.MenuTrafficAnalytics$Enabled;
import com.yandex.go.settings.hidephoneinfo.experiments.InAppOnlySettingsToggleExperiment;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.HashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class uar0 implements xyw0, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ wbr0 b;

    public /* synthetic */ uar0(wbr0 wbr0Var, int i) {
        this.a = i;
        this.b = wbr0Var;
    }

    @Override // defpackage.xyw0
    public final void a(boolean z) {
        int i = this.a;
        final int i2 = 0;
        final wbr0 wbr0Var = this.b;
        final int i3 = 1;
        switch (i) {
            case 0:
                as21 as21Var = wbr0Var.L;
                if (as21Var.a("FIELD_DONT_SHOW_PROMO_PUSHES", false) != z) {
                    as21Var.e("FIELD_DONT_SHOW_PROMO_PUSHES", z);
                    hk10 hk10Var = wbr0Var.C;
                    MenuDontShowPromoPushesAnalytics$Enabled menuDontShowPromoPushesAnalytics$Enabled = z ? MenuDontShowPromoPushesAnalytics$Enabled.On : MenuDontShowPromoPushesAnalytics$Enabled.Off;
                    hk10Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (menuDontShowPromoPushesAnalytics$Enabled != null) {
                        hashMap.put(BackendConfig.Restrictions.ENABLED, menuDontShowPromoPushesAnalytics$Enabled.getEventValue());
                    }
                    hk10Var.a.a("menu.dont_show_promo_pushes", hashMap, 1, new HashMap());
                    break;
                }
                break;
            case 1:
                if (wbr0Var.J.update(z)) {
                    ik10 ik10Var = wbr0Var.B;
                    MenuDontSmsAnalytics$Enabled menuDontSmsAnalytics$Enabled = z ? MenuDontSmsAnalytics$Enabled.On : MenuDontSmsAnalytics$Enabled.Off;
                    ik10Var.getClass();
                    HashMap hashMap2 = new HashMap();
                    if (menuDontSmsAnalytics$Enabled != null) {
                        hashMap2.put(BackendConfig.Restrictions.ENABLED, menuDontSmsAnalytics$Enabled.getEventValue());
                    }
                    ik10Var.a.a("menu.dont_sms", hashMap2, 1, new HashMap());
                    break;
                }
                break;
            case 2:
                if (wbr0Var.K.update(z)) {
                    fk10 fk10Var = wbr0Var.A;
                    MenuDontCallAnalytics$Enabled menuDontCallAnalytics$Enabled = z ? MenuDontCallAnalytics$Enabled.On : MenuDontCallAnalytics$Enabled.Off;
                    fk10Var.getClass();
                    HashMap hashMap3 = new HashMap();
                    if (menuDontCallAnalytics$Enabled != null) {
                        hashMap3.put(BackendConfig.Restrictions.ENABLED, menuDontCallAnalytics$Enabled.getEventValue());
                    }
                    fk10Var.a.a("menu.dont_call", hashMap3, 1, new HashMap());
                    break;
                }
                break;
            case 3:
                jer0 jer0Var = wbr0Var.U;
                boolean booleanValue = ((Boolean) jer0Var.c.getValue()).booleanValue();
                if (z && !booleanValue) {
                    jer0Var.b(true);
                    wbr0Var.x.f((InAppOnlySettingsToggleExperiment) wbr0Var.R.a.b(), new sls() { // from class: ubr0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i4 = i2;
                            zy11 zy11Var = zy11.a;
                            wbr0 wbr0Var2 = wbr0Var;
                            switch (i4) {
                                case 0:
                                    q6r0 q6r0Var = wbr0Var2.D;
                                    q6r0Var.getClass();
                                    q6r0Var.a.a("Settings.HidePhoneConfirmModal.ConfirmButton.Tapped", new HashMap(), 1, new HashMap());
                                    wbr0Var2.U.a(true);
                                    break;
                                default:
                                    q6r0 q6r0Var2 = wbr0Var2.D;
                                    q6r0Var2.getClass();
                                    q6r0Var2.a.a("Settings.HidePhoneConfirmModal.ForceClosed", new HashMap(), 1, new HashMap());
                                    wbr0Var2.U.b(false);
                                    break;
                            }
                            return zy11Var;
                        }
                    }, new sls() { // from class: ubr0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i4 = i3;
                            zy11 zy11Var = zy11.a;
                            wbr0 wbr0Var2 = wbr0Var;
                            switch (i4) {
                                case 0:
                                    q6r0 q6r0Var = wbr0Var2.D;
                                    q6r0Var.getClass();
                                    q6r0Var.a.a("Settings.HidePhoneConfirmModal.ConfirmButton.Tapped", new HashMap(), 1, new HashMap());
                                    wbr0Var2.U.a(true);
                                    break;
                                default:
                                    q6r0 q6r0Var2 = wbr0Var2.D;
                                    q6r0Var2.getClass();
                                    q6r0Var2.a.a("Settings.HidePhoneConfirmModal.ForceClosed", new HashMap(), 1, new HashMap());
                                    wbr0Var2.U.b(false);
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                    break;
                } else {
                    jer0Var.a(z);
                    break;
                }
            case 4:
                if (wbr0Var.L.a("FIELD_TRAFFICS_ON", false) != z) {
                    in10 in10Var = wbr0Var.z;
                    MenuTrafficAnalytics$Enabled menuTrafficAnalytics$Enabled = z ? MenuTrafficAnalytics$Enabled.On : MenuTrafficAnalytics$Enabled.Off;
                    in10Var.getClass();
                    HashMap hashMap4 = new HashMap();
                    if (menuTrafficAnalytics$Enabled != null) {
                        hashMap4.put(BackendConfig.Restrictions.ENABLED, menuTrafficAnalytics$Enabled.getEventValue());
                    }
                    in10Var.a.a("menu.traffic", hashMap4, 1, new HashMap());
                }
                kt00 kt00Var = wbr0Var.P;
                kt00Var.a.e("FIELD_TRAFFICS_ON", z);
                kt00Var.a();
                break;
            case 5:
                q6r0 q6r0Var = wbr0Var.D;
                q6r0Var.getClass();
                HashMap hashMap5 = new HashMap();
                q6r0Var.a.a("Settings.HapticSwitch.Tapped", hashMap5, 1, x4e.r(z, hashMap5, BackendConfig.Restrictions.ENABLED));
                wbr0Var.M.a.e("FILED_SPLASH_HAPTIC_ENABLED", z);
                break;
            default:
                aba0 aba0Var = wbr0Var.N;
                qv10.B(z, aba0Var.b, null);
                aba0Var.a.e("FIELD_HIDE_BALANCE", z);
                r7r0 r7r0Var = wbr0Var.E;
                r7r0Var.getClass();
                r7r0Var.a.a("SettingsDidSwitchYandexBankBalanceVisibility", new HashMap(), 1, new HashMap());
                if (!z) {
                    aba0Var.b(false);
                    break;
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof xyw0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof xyw0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof xyw0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof xyw0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof xyw0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof xyw0) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof xyw0) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(1, this.b, wbr0.class, "onPromoPushesSwitchChanged", "onPromoPushesSwitchChanged(Z)V", 0);
            case 1:
                return new FunctionReferenceImpl(1, this.b, wbr0.class, "onDontSmsSwitchChanged", "onDontSmsSwitchChanged(Z)V", 0);
            case 2:
                return new FunctionReferenceImpl(1, this.b, wbr0.class, "onDontCallSwitchChanged", "onDontCallSwitchChanged(Z)V", 0);
            case 3:
                return new FunctionReferenceImpl(1, this.b, wbr0.class, "onInAppOnlySwitchChanged", "onInAppOnlySwitchChanged(Z)V", 0);
            case 4:
                return new FunctionReferenceImpl(1, this.b, wbr0.class, "onTrafficSwitchChanged", "onTrafficSwitchChanged(Z)V", 0);
            case 5:
                return new FunctionReferenceImpl(1, this.b, wbr0.class, "onHapticToggled", "onHapticToggled(Z)V", 0);
            default:
                return new FunctionReferenceImpl(1, this.b, wbr0.class, "onHideBalanceToggled", "onHideBalanceToggled(Z)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
