package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cloudwebrtc.webrtc.audio.AudioSwitchManager;
import com.yandex.go.design.compose.loading.b;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.requirements.comment.summary.ui.v3.ui.a;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.messenger.websdk.api.Cancelable;
import com.yandex.payment.sdk.ui.payment.sbp.BankAppsAdapter;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView;
import com.ybsdk.feature.cashback.impl.views.OpenCashbackSelectorButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import java.io.Closeable;
import java.util.List;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.plus.design.view.GradientGlyphValueView;
import ru.yandex.taxi.preorder.summary.tariffpage.data.BadgeViewHolder$updateImageOnAttachStateChanged$1;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes3.dex */
public final /* synthetic */ class zbd implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ zbd(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 lambda$new$0;
        c061 createMonthAdapter$lambda$7;
        zy11 onViewAttachedToWindow$lambda$0;
        zy11 onBankClick$lambda$0;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                acd acdVar = acd.a;
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    b.a(ljs0.c, cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
                } else {
                    btsVar.Y();
                }
                return zy11.a;
            case 1:
                ((Integer) obj2).getClass();
                a.g((fid) obj, vng.O(1));
                return zy11.a;
            case 2:
                View inflate = ((LayoutInflater) obj).inflate(vmh0.ybsdk_item_about, (ViewGroup) obj2, false);
                FrameLayout frameLayout = (FrameLayout) inflate;
                int i = oah0.forward_icon;
                if (((AppCompatImageView) cma1.O(i, inflate)) != null) {
                    i = oah0.name;
                    TextView textView = (TextView) cma1.O(i, inflate);
                    if (textView != null) {
                        return new t161(frameLayout, frameLayout, textView);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                return null;
            case 3:
                return Boolean.valueOf(((TaxiOrder) obj).h.getB() == ((TaxiOrder) obj2).h.getB());
            case 4:
                View inflate2 = ((LayoutInflater) obj).inflate(bnh0.ybsdk_button_select_categories, (ViewGroup) obj2, false);
                if (inflate2 != null) {
                    return new k061((OpenCashbackSelectorButtonView) inflate2);
                }
                ny61.t("rootView");
                return null;
            case 5:
                View inflate3 = ((LayoutInflater) obj).inflate(bnh0.ybsdk_active_cashback_item, (ViewGroup) obj2, false);
                int i2 = tah0.cashbackItemImage;
                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, inflate3);
                if (appCompatImageView != null) {
                    i2 = tah0.infoIcon;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i2, inflate3);
                    if (appCompatImageView2 != null) {
                        i2 = tah0.percent;
                        TextView textView2 = (TextView) cma1.O(i2, inflate3);
                        if (textView2 != null) {
                            i2 = tah0.title;
                            TextView textView3 = (TextView) cma1.O(i2, inflate3);
                            if (textView3 != null) {
                                return new rz51((ConstraintLayout) inflate3, appCompatImageView, appCompatImageView2, textView2, textView3);
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i2)));
                return null;
            case 6:
                return d261.o((LayoutInflater) obj, (ViewGroup) obj2);
            case 7:
                ((Integer) obj).intValue();
                return ((m5f) obj2).a;
            case 8:
                return Boolean.valueOf(((d0l0) obj).b.size() <= 1 && ((d0l0) obj2).b.size() <= 1);
            case 9:
                return zy11.a;
            case 10:
                ((Integer) obj2).getClass();
                joa1.a((fid) obj, vng.O(1));
                return zy11.a;
            case 11:
                ((Integer) obj2).getClass();
                dn1.c((fid) obj, vng.O(1));
                return zy11.a;
            case 12:
                ((Integer) obj2).getClass();
                com.yandex.go.ai_widget.ui.a.h((fid) obj, vng.O(1));
                return zy11.a;
            case 13:
                ((Boolean) obj2).getClass();
                return zy11.a;
            case 14:
                View inflate4 = ((LayoutInflater) obj).inflate(uqh0.alert_view_holder, (ViewGroup) obj2, false);
                int i3 = reh0.icon;
                GoImageView goImageView = (GoImageView) cma1.O(i3, inflate4);
                if (goImageView != null) {
                    i3 = reh0.line_layout;
                    GoView goView = (GoView) cma1.O(i3, inflate4);
                    if (goView != null) {
                        i3 = reh0.title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate4);
                        if (robotoTextView != null) {
                            pr1 pr1Var = new pr1(new vr1((LinearLayout) inflate4, goImageView, goView, robotoTextView), objArr == true ? 1 : 0);
                            aiy aiyVar = aiy.a;
                            pr1Var.T = aiyVar;
                            pr1Var.U = aiyVar;
                            pr1Var.V = new dpu(goView, null);
                            return pr1Var;
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i3)));
                return null;
            case 15:
                gz1 gz1Var = (gz1) obj;
                gz1 gz1Var2 = (gz1) obj2;
                return Boolean.valueOf(jl40.l(gz1Var.c, gz1Var2.c) && gz1Var.e == gz1Var2.e);
            case 16:
                ((Integer) obj2).getClass();
                msa1.m((fid) obj, vng.O(1));
                return zy11.a;
            case 17:
                return Boolean.valueOf(((fnx0) obj).a((fnx0) obj2));
            case 18:
                lambda$new$0 = AudioSwitchManager.lambda$new$0((List) obj, (hf3) obj2);
                return lambda$new$0;
            case 19:
                ((Cancelable) obj2).cancel();
                return zy11.a;
            case 20:
                ((Closeable) obj2).close();
                return zy11.a;
            case 21:
                View inflate5 = ((LayoutInflater) obj).inflate(noh0.ybsdk_auto_pull_item, (ViewGroup) obj2, false);
                int i4 = cch0.autoPullRemoveButton;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i4, inflate5);
                if (appCompatImageView3 != null) {
                    i4 = cch0.autoPullSourceImage;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) cma1.O(i4, inflate5);
                    if (appCompatImageView4 != null) {
                        i4 = cch0.autoPullSourceName;
                        TextView textView4 = (TextView) cma1.O(i4, inflate5);
                        if (textView4 != null) {
                            uz51 uz51Var = new uz51((ShimmerFrameLayout) inflate5, appCompatImageView3, appCompatImageView4, textView4);
                            xty0.b(textView4);
                            appCompatImageView4.setClipToOutline(true);
                            return uz51Var;
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i4)));
                return null;
            case 22:
                View inflate6 = ((LayoutInflater) obj).inflate(noh0.ybsdk_auto_pull_header, (ViewGroup) obj2, false);
                int i5 = cch0.autoPullDescription;
                TextView textView5 = (TextView) cma1.O(i5, inflate6);
                if (textView5 != null) {
                    i5 = cch0.autoPullTitle;
                    TextView textView6 = (TextView) cma1.O(i5, inflate6);
                    if (textView6 != null) {
                        return new tz51((ConstraintLayout) inflate6, textView5, textView6);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate6.getResources().getResourceName(i5)));
                return null;
            case 23:
                createMonthAdapter$lambda$7 = AutoTopupSummaryView.createMonthAdapter$lambda$7((LayoutInflater) obj, (ViewGroup) obj2);
                return createMonthAdapter$lambda$7;
            case 24:
                onViewAttachedToWindow$lambda$0 = BadgeViewHolder$updateImageOnAttachStateChanged$1.onViewAttachedToWindow$lambda$0((GradientGlyphValueView) obj, (Drawable) obj2);
                return onViewAttachedToWindow$lambda$0;
            case 25:
                View inflate7 = ((LayoutInflater) obj).inflate(uqh0.badge_with_subtitle, (ViewGroup) obj2, false);
                int i6 = reh0.badge;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i6, inflate7);
                if (robotoTextView2 != null) {
                    i6 = reh0.lead;
                    GoView goView2 = (GoView) cma1.O(i6, inflate7);
                    if (goView2 != null) {
                        i6 = reh0.subtitle;
                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i6, inflate7);
                        if (robotoTextView3 != null) {
                            GoLinearLayout goLinearLayout = (GoLinearLayout) inflate7;
                            pr1 pr1Var2 = new pr1(new rn4(goLinearLayout, robotoTextView2, goView2, robotoTextView3), r4 ? 1 : 0);
                            aiy aiyVar2 = aiy.a;
                            pr1Var2.T = aiyVar2;
                            pr1Var2.U = aiyVar2;
                            pr1Var2.V = new dpu(goView2, null);
                            fh4.g(robotoTextView3);
                            goLinearLayout.setClickable(false);
                            return pr1Var2;
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate7.getResources().getResourceName(i6)));
                return null;
            case 26:
                View inflate8 = ((LayoutInflater) obj).inflate(yrh0.surge_info_content_balance_item, (ViewGroup) obj2, false);
                if (inflate8 != null) {
                    return new lo4(new kqw0((ListItemComponent) inflate8));
                }
                ny61.t("rootView");
                return null;
            case 27:
                onBankClick$lambda$0 = BankAppsAdapter.onBankClick$lambda$0((String) obj, ((Integer) obj2).intValue());
                return onBankClick$lambda$0;
            case 28:
                View inflate9 = ((LayoutInflater) obj).inflate(uqh0.mt_begin_ground_section_view, (ViewGroup) obj2, false);
                int i7 = reh0.center_layout;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i7, inflate9);
                if (linearLayout != null) {
                    i7 = reh0.icon;
                    GoImageView goImageView2 = (GoImageView) cma1.O(i7, inflate9);
                    if (goImageView2 != null) {
                        i7 = reh0.icon_layout;
                        FrameLayout frameLayout2 = (FrameLayout) cma1.O(i7, inflate9);
                        if (frameLayout2 != null) {
                            i7 = reh0.subtitle;
                            RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i7, inflate9);
                            if (robotoTextView4 != null) {
                                i7 = reh0.time;
                                RobotoTextView robotoTextView5 = (RobotoTextView) cma1.O(i7, inflate9);
                                if (robotoTextView5 != null) {
                                    i7 = reh0.title;
                                    RobotoTextView robotoTextView6 = (RobotoTextView) cma1.O(i7, inflate9);
                                    if (robotoTextView6 != null) {
                                        return new gj5(new yc30((ConstraintLayout) inflate9, linearLayout, goImageView2, frameLayout2, robotoTextView4, robotoTextView5, robotoTextView6));
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate9.getResources().getResourceName(i7)));
                return null;
            default:
                ((Integer) obj2).getClass();
                h6u0.f((fid) obj, vng.O(1));
                return zy11.a;
        }
    }

    public /* synthetic */ zbd(int i, int i2) {
        this.a = i2;
    }
}
