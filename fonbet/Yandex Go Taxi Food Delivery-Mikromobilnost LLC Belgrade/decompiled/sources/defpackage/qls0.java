package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.ybsdk.core.stories.ChangeStoryReason;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.view.SelectorListView;
import com.ybsdk.widgets.common.SuggestsGroupView;
import com.ybsdk.widgets.common.WidgetView;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import java.util.Collections;
import ru.yandex.taxi.communications.stepsinstructions.components.StepsDashedLine;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes3.dex */
public final /* synthetic */ class qls0 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ qls0(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 changedStoryListener$lambda$0;
        b961 suggestsAdapterDelegate$lambda$1;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                mdb1.c((fid) obj, vng.O(7));
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                py91.b((fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                return Collections.singletonList(Float.valueOf(((c) obj2).f.getFloatValue()));
            case 3:
                ((Integer) obj2).getClass();
                az91.c((fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                az91.a((fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                return new c1t0((ViewGroup) obj2);
            case 6:
                View inflate = ((LayoutInflater) obj).inflate(poh0.ybsdk_layout_snackbar_content, (ViewGroup) obj2, false);
                int i2 = fch0.description;
                TextView textView = (TextView) cma1.O(i2, inflate);
                if (textView != null) {
                    FrameLayout frameLayout = (FrameLayout) inflate;
                    int i3 = fch0.text;
                    TextView textView2 = (TextView) cma1.O(i3, inflate);
                    if (textView2 != null) {
                        return new m361(frameLayout, textView, frameLayout, textView2);
                    }
                    i2 = i3;
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 7:
                lev0 lev0Var = (lev0) obj;
                lev0 lev0Var2 = (lev0) obj2;
                return Boolean.valueOf(jl40.l(lev0Var2.a, lev0Var.a) && lev0Var2.b.a.equals(lev0Var.b.a) && jl40.l(lev0Var2.c, lev0Var.c) && jl40.l(lev0Var2.d, lev0Var.d) && jl40.l(lev0Var2.e, lev0Var.e) && lev0Var2.f == lev0Var.f);
            case 8:
                return Boolean.valueOf(jl40.l(((fnx0) obj).e, ((fnx0) obj2).e));
            case 9:
                View inflate2 = ((LayoutInflater) obj).inflate(qmh0.ybsdk_upgrade_status_widget, (ViewGroup) obj2, false);
                if (inflate2 != null) {
                    WidgetView widgetView = (WidgetView) inflate2;
                    return new oa61(widgetView, widgetView);
                }
                ny61.t("rootView");
                return null;
            case 10:
                View inflate3 = ((LayoutInflater) obj).inflate(ysh0.steps_instructions_title_item, (ViewGroup) obj2, false);
                int i4 = yhh0.title;
                ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i4, inflate3);
                if (listTitleComponent != null) {
                    return new b0b(new obu0((LinearLayout) inflate3, listTitleComponent), 19);
                }
                ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i4)));
                return null;
            case 11:
                View inflate4 = ((LayoutInflater) obj).inflate(ysh0.steps_instruction_item, (ViewGroup) obj2, false);
                int i5 = yhh0.dottedLine;
                StepsDashedLine stepsDashedLine = (StepsDashedLine) cma1.O(i5, inflate4);
                if (stepsDashedLine != null) {
                    i5 = yhh0.icon;
                    GoImageView goImageView = (GoImageView) cma1.O(i5, inflate4);
                    if (goImageView != null) {
                        i5 = yhh0.icon_container;
                        ShimmeringFrameLayout shimmeringFrameLayout = (ShimmeringFrameLayout) cma1.O(i5, inflate4);
                        if (shimmeringFrameLayout != null) {
                            i5 = yhh0.image;
                            RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) cma1.O(i5, inflate4);
                            if (roundedCornersImageView != null) {
                                i5 = yhh0.image_container;
                                ShimmeringFrameLayout shimmeringFrameLayout2 = (ShimmeringFrameLayout) cma1.O(i5, inflate4);
                                if (shimmeringFrameLayout2 != null) {
                                    i5 = yhh0.subtitle;
                                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i5, inflate4);
                                    if (robotoTextView != null) {
                                        i5 = yhh0.title;
                                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i5, inflate4);
                                        if (robotoTextView2 != null) {
                                            return new b0b(new wau0((LinearLayout) inflate4, stepsDashedLine, goImageView, shimmeringFrameLayout, roundedCornersImageView, shimmeringFrameLayout2, robotoTextView, robotoTextView2), 20);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i5)));
                return null;
            case 12:
                View inflate5 = ((LayoutInflater) obj).inflate(uqh0.checkout_stop_selected_item_view, (ViewGroup) obj2, false);
                if (inflate5 != null) {
                    return new chu0(new inb((ListItemComponent) inflate5));
                }
                ny61.t("rootView");
                return null;
            case 13:
                View inflate6 = ((LayoutInflater) obj).inflate(uqh0.checkout_stop_item_view, (ViewGroup) obj2, false);
                if (inflate6 != null) {
                    return new chu0(new hnb((ListItemComponent) inflate6));
                }
                ny61.t("rootView");
                return null;
            case 14:
                changedStoryListener$lambda$0 = StoriesComponentView.changedStoryListener$lambda$0(((Integer) obj).intValue(), (ChangeStoryReason) obj2);
                return changedStoryListener$lambda$0;
            case 15:
                View inflate7 = ((LayoutInflater) obj).inflate(znh0.ybsdk_qr_subscription_item, (ViewGroup) obj2, false);
                int i6 = pbh0.merchantDescription;
                TextView textView3 = (TextView) cma1.O(i6, inflate7);
                if (textView3 != null) {
                    i6 = pbh0.merchantIcon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i6, inflate7);
                    if (appCompatImageView != null) {
                        i6 = pbh0.merchantName;
                        TextView textView4 = (TextView) cma1.O(i6, inflate7);
                        if (textView4 != null) {
                            i6 = pbh0.removeButton;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i6, inflate7);
                            if (appCompatImageView2 != null) {
                                x461 x461Var = new x461((ShimmerFrameLayout) inflate7, textView3, appCompatImageView, textView4, appCompatImageView2);
                                xty0.b(textView4);
                                xty0.b(textView3);
                                appCompatImageView.setClipToOutline(true);
                                return x461Var;
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate7.getResources().getResourceName(i6)));
                return null;
            case 16:
                View inflate8 = ((LayoutInflater) obj).inflate(znh0.ybsdk_qr_subscriptions_list_header, (ViewGroup) obj2, false);
                int i7 = pbh0.headerDescription;
                TextView textView5 = (TextView) cma1.O(i7, inflate8);
                if (textView5 != null) {
                    i7 = pbh0.headerTitle;
                    TextView textView6 = (TextView) cma1.O(i7, inflate8);
                    if (textView6 != null) {
                        return new z461((ConstraintLayout) inflate8, textView5, textView6);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate8.getResources().getResourceName(i7)));
                return null;
            case 17:
                View inflate9 = ((LayoutInflater) obj).inflate(znh0.ybsdk_product_selectors_list, (ViewGroup) obj2, false);
                if (inflate9 != null) {
                    return new k461((SelectorListView) inflate9);
                }
                ny61.t("rootView");
                return null;
            case 18:
                View inflate10 = ((LayoutInflater) obj).inflate(bnh0.ybsdk_select_cashback_header_titile, (ViewGroup) obj2, false);
                int i8 = tah0.cashbackDescription;
                TextView textView7 = (TextView) cma1.O(i8, inflate10);
                if (textView7 != null) {
                    i8 = tah0.cashbackTitle;
                    TextView textView8 = (TextView) cma1.O(i8, inflate10);
                    if (textView8 != null) {
                        return new k861((LinearLayout) inflate10, textView7, textView8);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate10.getResources().getResourceName(i8)));
                return null;
            case 19:
                View inflate11 = ((LayoutInflater) obj).inflate(bnh0.ybsdk_cashback_item, (ViewGroup) obj2, false);
                int i9 = tah0.cashbackItemImage;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i9, inflate11);
                if (appCompatImageView3 != null) {
                    i9 = tah0.checkbox;
                    CheckBoxView checkBoxView = (CheckBoxView) cma1.O(i9, inflate11);
                    if (checkBoxView != null) {
                        i9 = tah0.infoIcon;
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) cma1.O(i9, inflate11);
                        if (appCompatImageView4 != null) {
                            i9 = tah0.percent;
                            TextView textView9 = (TextView) cma1.O(i9, inflate11);
                            if (textView9 != null) {
                                i9 = tah0.title;
                                TextView textView10 = (TextView) cma1.O(i9, inflate11);
                                if (textView10 != null) {
                                    return new p061((ConstraintLayout) inflate11, appCompatImageView3, checkBoxView, appCompatImageView4, textView9, textView10);
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate11.getResources().getResourceName(i9)));
                return null;
            case 20:
                return Boolean.valueOf(!jl40.l(((v2x) obj).c.a, ((v2x) obj2).c.a));
            case 21:
                ((fbv0) obj).R.renderLead(((v2x) obj2).c.a);
                return zy11Var;
            case 22:
                return Boolean.valueOf(!jl40.l(((v2x) obj).c.b, ((v2x) obj2).c.b));
            case 23:
                ((fbv0) obj).R.renderBody(((v2x) obj2).c.b);
                return zy11Var;
            case 24:
                return Boolean.valueOf(!jl40.l(((v2x) obj).c.c, ((v2x) obj2).c.c));
            case 25:
                fbv0 fbv0Var = (fbv0) obj;
                v2x v2xVar = (v2x) obj2;
                fbv0Var.R.renderTrail(v2xVar.c.c, new ebv0(fbv0Var, v2xVar.b, 0));
                return zy11Var;
            case 26:
                return Boolean.valueOf(!jl40.l(((v2x) obj).c.d, ((v2x) obj2).c.d));
            case 27:
                fbv0 fbv0Var2 = (fbv0) obj;
                v2x v2xVar2 = (v2x) obj2;
                fbv0Var2.R.setAction(v2xVar2.c.d, new ebv0(fbv0Var2, v2xVar2.b, 1));
                return zy11Var;
            case 28:
                suggestsAdapterDelegate$lambda$1 = SuggestsGroupView.suggestsAdapterDelegate$lambda$1((LayoutInflater) obj, (ViewGroup) obj2);
                return suggestsAdapterDelegate$lambda$1;
            default:
                return Boolean.valueOf(((fnx0) obj).a((fnx0) obj2));
        }
    }

    public /* synthetic */ qls0(int i, int i2) {
        this.a = i2;
    }
}
