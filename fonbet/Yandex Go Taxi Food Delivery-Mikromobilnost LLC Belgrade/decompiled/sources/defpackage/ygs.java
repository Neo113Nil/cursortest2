package defpackage;

import android.content.Context;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.sbp.domain.analytics.SbpBindingAnalytics$Button;
import com.yandex.go.superapp.discovery.map.impl.ui.search.SuperAppDiscoveryMapSearchModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.search.a;
import com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories.c;
import com.yandex.go.superapp.discovery.map.impl.ui.search.f;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.widget.dialog.Toggleable;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class ygs extends m230 {
    public final /* synthetic */ int E;
    public final w030 F;
    public final boolean G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ygs(w030 w030Var, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        super(null);
        this.E = i;
        this.F = w030Var;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = obj4;
        this.L = obj5;
        this.M = obj6;
        this.N = obj7;
        this.O = obj8;
        this.P = obj9;
        this.G = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
        }
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return this.G;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        rg7 rg7Var;
        rg7 rg7Var2;
        int i = this.E;
        Object obj2 = this.I;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                final ghs ghsVar = (ghs) obj;
                Context context = (Context) obj3;
                oz01 oz01Var = (oz01) this.J;
                vrh vrhVar = (vrh) this.O;
                zuj0 zuj0Var = (zuj0) obj2;
                Object obj4 = null;
                if (ghsVar instanceof ahs) {
                    ahs ahsVar = (ahs) ghsVar;
                    kw kwVar = ahsVar.d;
                    PaymentMethods g = ((fga0) this.M).b.g();
                    if (kwVar != null) {
                        qnh qnhVar = (qnh) this.P;
                        fl8 fl8Var = ahsVar.c;
                        qnhVar.getClass();
                        List<Card> list = g.a.a;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (Card card : list) {
                                if (((syw) qnhVar.a).a(card) || jl40.l(card.b, fl8Var.a)) {
                                }
                            }
                        }
                        rg7Var = new rg7(kwVar.a, kwVar.b, kwVar.c);
                    }
                    avj0 avj0Var = (avj0) zuj0Var;
                    rg7Var2 = new rg7(avj0Var.h(kyh0.delete_card_dialog_title), vrhVar.b(), avj0Var.h(kyh0.delete_card_dialog_confirm));
                    rg7Var = rg7Var2;
                } else if (ghsVar instanceof dhs) {
                    rg7Var = new rg7(oz01Var.a(kyh0.unbind_sbp_token_title), vrhVar.e(), ((avj0) zuj0Var).h(kyh0.common_remove));
                } else {
                    if (ghsVar instanceof bhs) {
                        avj0 avj0Var2 = (avj0) zuj0Var;
                        rg7Var2 = new rg7(avj0Var2.h(kyh0.unbind_mbank_account_title), vrhVar.c(), avj0Var2.h(kyh0.common_remove));
                    } else if (ghsVar instanceof fhs) {
                        avj0 avj0Var3 = (avj0) zuj0Var;
                        rg7Var2 = new rg7(avj0Var3.h(kyh0.unbind_yape_token_title), vrhVar.d(), avj0Var3.h(kyh0.common_remove));
                    } else if (ghsVar instanceof chs) {
                        avj0 avj0Var4 = (avj0) zuj0Var;
                        rg7Var2 = new rg7(avj0Var4.h(kyh0.unbind_nequi_token_title), vrhVar.a(), avj0Var4.h(kyh0.common_remove));
                    } else if (ghsVar instanceof ehs) {
                        rg7Var = new rg7(oz01Var.a(kyh0.unbind_sbp_token_title), oz01Var.a(kyh0.unbind_sbp_token_description), ((avj0) zuj0Var).h(kyh0.common_remove));
                    } else {
                        if (!(ghsVar instanceof zgs)) {
                            w511.b();
                            return null;
                        }
                        rg7Var = new rg7(context.getString(kyh0.loyalty_notification_switch_loyalty), context.getString(kyh0.loyalty_notification_switch_loyalty_explanation), context.getString(kyh0.loyalty_program_logout));
                    }
                    rg7Var = rg7Var2;
                }
                ymu ymuVar = new ymu(9, context, obj4);
                final int i2 = 0;
                q1c q1cVar = new q1c(context.getString(kyh0.delete_card_dialog_cancel), new Runnable(this) { // from class: xgs
                    public final /* synthetic */ ygs b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        ghs ghsVar2 = ghsVar;
                        ygs ygsVar = this.b;
                        switch (i3) {
                            case 0:
                                if (!(ghsVar2 instanceof ahs)) {
                                    if (!(ghsVar2 instanceof bhs)) {
                                        if (!(ghsVar2 instanceof dhs)) {
                                            if (!(ghsVar2 instanceof fhs)) {
                                                if (!(ghsVar2 instanceof chs)) {
                                                    if (!(ghsVar2 instanceof ehs)) {
                                                        if (!(ghsVar2 instanceof zgs)) {
                                                            w511.b();
                                                            break;
                                                        } else {
                                                            String name = ((zgs) ghsVar2).d.getName();
                                                            u8w u8wVar = (u8w) ((c1x0) ygsVar.N).a;
                                                            u8wVar.getClass();
                                                            HashMap hashMap = new HashMap();
                                                            hashMap.put("loyalty_program", name);
                                                            u8wVar.a.a("LoyaltyProgram.ExitConfirmationScreen.Tapped.Cancel", hashMap, 1, new HashMap());
                                                        }
                                                    } else {
                                                        ygsVar.T(ghsVar2, "cancelled");
                                                    }
                                                } else {
                                                    ygsVar.T(ghsVar2, "cancelled");
                                                }
                                            } else {
                                                ygsVar.T(ghsVar2, "cancelled");
                                            }
                                        } else {
                                            dfm0 dfm0Var = (dfm0) ygsVar.K;
                                            String str = ((dhs) ghsVar2).c.d;
                                            SbpBindingAnalytics$Button sbpBindingAnalytics$Button = SbpBindingAnalytics$Button.LEAVE;
                                            i d = ((j) dfm0Var.a).d("DeleteSBP.Modal.Tapped");
                                            d.d("choosen_bank", str);
                                            d.d("button_tapped", sbpBindingAnalytics$Button.getButtonName());
                                            d.m();
                                        }
                                    } else {
                                        ygsVar.T(ghsVar2, "cancelled");
                                    }
                                } else {
                                    ygsVar.T(ghsVar2, "cancelled");
                                }
                                ygsVar.r(new qu(9));
                                break;
                            default:
                                if (!(ghsVar2 instanceof ahs)) {
                                    if (!(ghsVar2 instanceof bhs)) {
                                        if (!(ghsVar2 instanceof dhs)) {
                                            if (!(ghsVar2 instanceof fhs)) {
                                                if (!(ghsVar2 instanceof chs)) {
                                                    if (!(ghsVar2 instanceof ehs)) {
                                                        if (!(ghsVar2 instanceof zgs)) {
                                                            w511.b();
                                                            break;
                                                        } else {
                                                            String name2 = ((zgs) ghsVar2).d.getName();
                                                            u8w u8wVar2 = (u8w) ((c1x0) ygsVar.N).a;
                                                            u8wVar2.getClass();
                                                            HashMap hashMap2 = new HashMap();
                                                            hashMap2.put("loyalty_program", name2);
                                                            u8wVar2.a.a("LoyaltyProgram.ExitConfirmationScreen.Tapped.LogOut", hashMap2, 1, new HashMap());
                                                        }
                                                    } else {
                                                        ygsVar.T(ghsVar2, "confirmed");
                                                    }
                                                } else {
                                                    ygsVar.T(ghsVar2, "confirmed");
                                                }
                                            } else {
                                                ygsVar.T(ghsVar2, "confirmed");
                                            }
                                        } else {
                                            dfm0 dfm0Var2 = (dfm0) ygsVar.K;
                                            String str2 = ((dhs) ghsVar2).c.d;
                                            SbpBindingAnalytics$Button sbpBindingAnalytics$Button2 = SbpBindingAnalytics$Button.DELETE;
                                            i d2 = ((j) dfm0Var2.a).d("DeleteSBP.Modal.Tapped");
                                            d2.d("choosen_bank", str2);
                                            d2.d("button_tapped", sbpBindingAnalytics$Button2.getButtonName());
                                            d2.m();
                                        }
                                    } else {
                                        ygsVar.T(ghsVar2, "confirmed");
                                    }
                                } else {
                                    ygsVar.T(ghsVar2, "confirmed");
                                }
                                ygsVar.r(new xvq(25));
                                break;
                        }
                    }
                });
                final int i3 = 1;
                return ymuVar.m(new hr1(Toggleable.ON, null, null, rg7Var.a, rg7Var.b, q1cVar, new q1c(rg7Var.c, new Runnable(this) { // from class: xgs
                    public final /* synthetic */ ygs b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        ghs ghsVar2 = ghsVar;
                        ygs ygsVar = this.b;
                        switch (i32) {
                            case 0:
                                if (!(ghsVar2 instanceof ahs)) {
                                    if (!(ghsVar2 instanceof bhs)) {
                                        if (!(ghsVar2 instanceof dhs)) {
                                            if (!(ghsVar2 instanceof fhs)) {
                                                if (!(ghsVar2 instanceof chs)) {
                                                    if (!(ghsVar2 instanceof ehs)) {
                                                        if (!(ghsVar2 instanceof zgs)) {
                                                            w511.b();
                                                            break;
                                                        } else {
                                                            String name = ((zgs) ghsVar2).d.getName();
                                                            u8w u8wVar = (u8w) ((c1x0) ygsVar.N).a;
                                                            u8wVar.getClass();
                                                            HashMap hashMap = new HashMap();
                                                            hashMap.put("loyalty_program", name);
                                                            u8wVar.a.a("LoyaltyProgram.ExitConfirmationScreen.Tapped.Cancel", hashMap, 1, new HashMap());
                                                        }
                                                    } else {
                                                        ygsVar.T(ghsVar2, "cancelled");
                                                    }
                                                } else {
                                                    ygsVar.T(ghsVar2, "cancelled");
                                                }
                                            } else {
                                                ygsVar.T(ghsVar2, "cancelled");
                                            }
                                        } else {
                                            dfm0 dfm0Var = (dfm0) ygsVar.K;
                                            String str = ((dhs) ghsVar2).c.d;
                                            SbpBindingAnalytics$Button sbpBindingAnalytics$Button = SbpBindingAnalytics$Button.LEAVE;
                                            i d = ((j) dfm0Var.a).d("DeleteSBP.Modal.Tapped");
                                            d.d("choosen_bank", str);
                                            d.d("button_tapped", sbpBindingAnalytics$Button.getButtonName());
                                            d.m();
                                        }
                                    } else {
                                        ygsVar.T(ghsVar2, "cancelled");
                                    }
                                } else {
                                    ygsVar.T(ghsVar2, "cancelled");
                                }
                                ygsVar.r(new qu(9));
                                break;
                            default:
                                if (!(ghsVar2 instanceof ahs)) {
                                    if (!(ghsVar2 instanceof bhs)) {
                                        if (!(ghsVar2 instanceof dhs)) {
                                            if (!(ghsVar2 instanceof fhs)) {
                                                if (!(ghsVar2 instanceof chs)) {
                                                    if (!(ghsVar2 instanceof ehs)) {
                                                        if (!(ghsVar2 instanceof zgs)) {
                                                            w511.b();
                                                            break;
                                                        } else {
                                                            String name2 = ((zgs) ghsVar2).d.getName();
                                                            u8w u8wVar2 = (u8w) ((c1x0) ygsVar.N).a;
                                                            u8wVar2.getClass();
                                                            HashMap hashMap2 = new HashMap();
                                                            hashMap2.put("loyalty_program", name2);
                                                            u8wVar2.a.a("LoyaltyProgram.ExitConfirmationScreen.Tapped.LogOut", hashMap2, 1, new HashMap());
                                                        }
                                                    } else {
                                                        ygsVar.T(ghsVar2, "confirmed");
                                                    }
                                                } else {
                                                    ygsVar.T(ghsVar2, "confirmed");
                                                }
                                            } else {
                                                ygsVar.T(ghsVar2, "confirmed");
                                            }
                                        } else {
                                            dfm0 dfm0Var2 = (dfm0) ygsVar.K;
                                            String str2 = ((dhs) ghsVar2).c.d;
                                            SbpBindingAnalytics$Button sbpBindingAnalytics$Button2 = SbpBindingAnalytics$Button.DELETE;
                                            i d2 = ((j) dfm0Var2.a).d("DeleteSBP.Modal.Tapped");
                                            d2.d("choosen_bank", str2);
                                            d2.d("button_tapped", sbpBindingAnalytics$Button2.getButtonName());
                                            d2.m();
                                        }
                                    } else {
                                        ygsVar.T(ghsVar2, "confirmed");
                                    }
                                } else {
                                    ygsVar.T(ghsVar2, "confirmed");
                                }
                                ygsVar.r(new xvq(25));
                                break;
                        }
                    }
                }), new sxo(19, this, ghsVar), null, 262));
            default:
                ((wvv0) obj).getClass();
                h2b1 h2b1Var = h2b1.S;
                jhu0 jhu0Var = new jhu0(this);
                sbm0 sbm0Var = ((qxv0) obj2).a;
                f fVar = new f(jhu0Var, (b) ((xvf0) sbm0Var.a).get(), (zuj0) ((xvf0) sbm0Var.b).get(), (pwy0) ((xvf0) sbm0Var.c).get(), (c) ((xvf0) sbm0Var.d).get(), (a) ((y2s0) sbm0Var.e).get(), (rvv0) ((xvf0) sbm0Var.f).get(), (stv0) ((xvf0) sbm0Var.g).get(), (en30) ((jag) sbm0Var.h).get(), (ah00) ((xvf0) sbm0Var.i).get());
                vx0 vx0Var = ((hxv0) obj3).a;
                return new SuperAppDiscoveryMapSearchModalView((e) vx0Var.a.get(), (tt2) vx0Var.b.get(), (Context) vx0Var.c.get(), fVar, h2b1Var);
        }
    }

    public void T(ghs ghsVar, String str) {
        ((g9a0) this.L).e(xe91.i(ghsVar.b), str, ghsVar.a.c().getCode());
    }
}
