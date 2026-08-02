package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.scooters.passes.active.ScootersActivePassesModalView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.savings.internal.screens.account.view.FundIncomeWidgetView;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsIncomeProgressView;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsShelfView;
import com.ybsdk.feature.savings.internal.views.SavingsCardView;
import com.ybsdk.feature.savings.internal.views.SavingsDivCardView;
import com.ybsdk.feature.savings.internal.views.SavingsNoAccountsView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import ru.yandex.taxi.masstransit.trains.schedule.uicomponents.a;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes3.dex */
public final /* synthetic */ class t1m0 implements wls {
    public final /* synthetic */ int a;

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        View O;
        m561 createPeriodsAdapter$lambda$4;
        zy11 initList$lambda$0$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((u1m0) obj).R.renderLead(((s2x) obj2).c.a);
                return zy11Var;
            case 1:
                return Boolean.valueOf(!jl40.l(((s2x) obj).c.b, ((s2x) obj2).c.b));
            case 2:
                ((u1m0) obj).R.renderBody(((s2x) obj2).c.b);
                return zy11Var;
            case 3:
                return Boolean.valueOf(!jl40.l(((s2x) obj).c.c, ((s2x) obj2).c.c));
            case 4:
                u1m0 u1m0Var = (u1m0) obj;
                s2x s2xVar = (s2x) obj2;
                u1m0Var.R.renderTrail(s2xVar.c.c, new s1m0(u1m0Var, s2xVar.b, 1));
                return zy11Var;
            case 5:
                return Boolean.valueOf(!jl40.l(((s2x) obj).c.d, ((s2x) obj2).c.d));
            case 6:
                u1m0 u1m0Var2 = (u1m0) obj;
                s2x s2xVar2 = (s2x) obj2;
                u1m0Var2.R.setAction(s2xVar2.c.d, new s1m0(u1m0Var2, s2xVar2.b, 0));
                return zy11Var;
            case 7:
                tvc0 tvc0Var = (tvc0) obj2;
                Boolean valueOf = Boolean.valueOf(tvc0Var.a);
                tig0 tig0Var = t2m0.a;
                return scc.c(valueOf, t2m0.a(new mun(tvc0Var.b), gu91.b, (g1m0) obj));
            case 8:
                return Integer.valueOf(((mun) obj2).a);
            case 9:
                return Integer.valueOf(((kgy) obj2).a);
            case 10:
                try0 try0Var = (try0) obj2;
                return scc.c(t2m0.a(new sry0(try0Var.a), gu91.e, (g1m0) obj), Boolean.valueOf(try0Var.b));
            case 11:
                return Integer.valueOf(((sry0) obj2).a);
            case 12:
                View inflate = ((LayoutInflater) obj).inflate(doh0.ybsdk_savings_dashboard_account_cell_item, (ViewGroup) obj2, false);
                if (inflate != null) {
                    SavingsCardView savingsCardView = (SavingsCardView) inflate;
                    return new e561(savingsCardView, savingsCardView);
                }
                ny61.t("rootView");
                return null;
            case 13:
                View inflate2 = ((LayoutInflater) obj).inflate(doh0.ybsdk_savings_widget_close, (ViewGroup) obj2, false);
                if (inflate2 != null) {
                    return new r561((YbButtonView) inflate2);
                }
                ny61.t("rootView");
                return null;
            case 14:
                View inflate3 = ((LayoutInflater) obj).inflate(doh0.ybsdk_savings_widget_interest, (ViewGroup) obj2, false);
                int i2 = tbh0.details;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i2, inflate3);
                if (recyclerView != null && (O = cma1.O((i2 = tbh0.detailsFadingEdge), inflate3)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate3;
                    i2 = tbh0.subtitle;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i2, inflate3);
                    if (appCompatTextView != null) {
                        i2 = tbh0.title;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i2, inflate3);
                        if (appCompatTextView2 != null) {
                            i2 = tbh0.titleBalance;
                            SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i2, inflate3);
                            if (spoilerTextView != null) {
                                return new w561(constraintLayout, recyclerView, O, appCompatTextView, appCompatTextView2, spoilerTextView);
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i2)));
                return null;
            case 15:
                View inflate4 = ((LayoutInflater) obj).inflate(doh0.ybsdk_savings_widget_interest_month, (ViewGroup) obj2, false);
                int i3 = tbh0.label;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) cma1.O(i3, inflate4);
                if (appCompatTextView3 != null) {
                    i3 = tbh0.text;
                    SpoilerTextView spoilerTextView2 = (SpoilerTextView) cma1.O(i3, inflate4);
                    if (spoilerTextView2 != null) {
                        return new x561((LinearLayoutCompat) inflate4, appCompatTextView3, spoilerTextView2);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i3)));
                return null;
            case 16:
                View inflate5 = ((LayoutInflater) obj).inflate(doh0.ybsdk_savings_widget_details, (ViewGroup) obj2, false);
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate5;
                int i4 = tbh0.title;
                AppCompatTextView appCompatTextView4 = (AppCompatTextView) cma1.O(i4, inflate5);
                if (appCompatTextView4 != null) {
                    return new s561(linearLayoutCompat, appCompatTextView4);
                }
                ny61.t("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i4)));
                return null;
            case 17:
                return d261.o((LayoutInflater) obj, (ViewGroup) obj2);
            case 18:
                View inflate6 = ((LayoutInflater) obj).inflate(doh0.ybsdk_savings_widget_document, (ViewGroup) obj2, false);
                int i5 = tbh0.buttonsContainer;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) cma1.O(i5, inflate6);
                if (linearLayoutCompat2 != null) {
                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) inflate6;
                    int i6 = tbh0.title;
                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) cma1.O(i6, inflate6);
                    if (appCompatTextView5 != null) {
                        return new t561(linearLayoutCompat3, linearLayoutCompat2, appCompatTextView5);
                    }
                    i5 = i6;
                }
                ny61.t("Missing required view with ID: ".concat(inflate6.getResources().getResourceName(i5)));
                return null;
            case 19:
                View inflate7 = ((LayoutInflater) obj).inflate(doh0.ybsdk_savings_widget_fund_income, (ViewGroup) obj2, false);
                if (inflate7 != null) {
                    return new u561((FundIncomeWidgetView) inflate7);
                }
                ny61.t("rootView");
                return null;
            case 20:
                View inflate8 = ((LayoutInflater) obj).inflate(doh0.ybsdk_savings_widget_income, (ViewGroup) obj2, false);
                if (inflate8 != null) {
                    return new v561((SavingsIncomeProgressView) inflate8);
                }
                ny61.t("rootView");
                return null;
            case 21:
                View inflate9 = ((LayoutInflater) obj).inflate(doh0.ybsdk_savings_shelf_wrapper, (ViewGroup) obj2, false);
                if (inflate9 != null) {
                    return new o561((SavingsShelfView) inflate9);
                }
                ny61.t("rootView");
                return null;
            case 22:
                return d261.o((LayoutInflater) obj, (ViewGroup) obj2);
            case 23:
                View inflate10 = ((LayoutInflater) obj).inflate(doh0.ybsdk_savings_dashboard_account_div_cell_item, (ViewGroup) obj2, false);
                if (inflate10 != null) {
                    SavingsDivCardView savingsDivCardView = (SavingsDivCardView) inflate10;
                    return new f561(savingsDivCardView, savingsDivCardView);
                }
                ny61.t("rootView");
                return null;
            case 24:
                createPeriodsAdapter$lambda$4 = SavingsIncomeProgressView.createPeriodsAdapter$lambda$4((LayoutInflater) obj, (ViewGroup) obj2);
                return createPeriodsAdapter$lambda$4;
            case 25:
                View inflate11 = ((LayoutInflater) obj).inflate(doh0.ybsdk_no_account_item, (ViewGroup) obj2, false);
                if (inflate11 != null) {
                    SavingsNoAccountsView savingsNoAccountsView = (SavingsNoAccountsView) inflate11;
                    return new r361(savingsNoAccountsView, savingsNoAccountsView);
                }
                ny61.t("rootView");
                return null;
            case 26:
                return a361.o((LayoutInflater) obj, (ViewGroup) obj2);
            case 27:
                View inflate12 = ((LayoutInflater) obj).inflate(mnh0.ybsdk_item_sbp_banks_loading, (ViewGroup) obj2, false);
                int i7 = ebh0.startIcon1;
                if (((SkeletonView) cma1.O(i7, inflate12)) != null) {
                    i7 = ebh0.startIcon2;
                    if (((SkeletonView) cma1.O(i7, inflate12)) != null) {
                        i7 = ebh0.startIcon3;
                        if (((SkeletonView) cma1.O(i7, inflate12)) != null) {
                            i7 = ebh0.startIcon4;
                            if (((SkeletonView) cma1.O(i7, inflate12)) != null) {
                                i7 = ebh0.startIcon5;
                                if (((SkeletonView) cma1.O(i7, inflate12)) != null) {
                                    i7 = ebh0.title1;
                                    if (((SkeletonView) cma1.O(i7, inflate12)) != null) {
                                        i7 = ebh0.title2;
                                        if (((SkeletonView) cma1.O(i7, inflate12)) != null) {
                                            i7 = ebh0.title3;
                                            if (((SkeletonView) cma1.O(i7, inflate12)) != null) {
                                                i7 = ebh0.title4;
                                                if (((SkeletonView) cma1.O(i7, inflate12)) != null) {
                                                    i7 = ebh0.title5;
                                                    if (((SkeletonView) cma1.O(i7, inflate12)) != null) {
                                                        return new wz51((ShimmerFrameLayout) inflate12, 12);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate12.getResources().getResourceName(i7)));
                return null;
            case 28:
                ((Integer) obj2).getClass();
                a.a((fid) obj, vng.O(1));
                return zy11Var;
            default:
                initList$lambda$0$0 = ScootersActivePassesModalView.initList$lambda$0$0((RobotoTextView) obj, (vqm0) obj2);
                return initList$lambda$0$0;
        }
    }

    public /* synthetic */ t1m0(byte b, int i) {
        this.a = i;
    }
}
