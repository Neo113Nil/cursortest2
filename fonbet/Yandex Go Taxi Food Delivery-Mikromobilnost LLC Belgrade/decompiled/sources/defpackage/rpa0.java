package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.PersonalInfoView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;

/* loaded from: classes2.dex */
public final class rpa0 implements zo31 {
    public final LinearLayout a;
    public final FrameLayout b;
    public final TextView c;
    public final ConstraintLayout d;
    public final HeaderView e;
    public final FrameLayout f;
    public final ImageView g;
    public final TextView h;
    public final ImageView i;
    public final TextView j;
    public final PersonalInfoView k;
    public final ProgressResultView l;
    public final CheckBox m;
    public final ScrollView n;

    public rpa0(LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, ConstraintLayout constraintLayout, HeaderView headerView, FrameLayout frameLayout2, ImageView imageView, TextView textView2, ImageView imageView2, TextView textView3, PersonalInfoView personalInfoView, ProgressResultView progressResultView, CheckBox checkBox, ScrollView scrollView) {
        this.a = linearLayout;
        this.b = frameLayout;
        this.c = textView;
        this.d = constraintLayout;
        this.e = headerView;
        this.f = frameLayout2;
        this.g = imageView;
        this.h = textView2;
        this.i = imageView2;
        this.j = textView3;
        this.k = personalInfoView;
        this.l = progressResultView;
        this.m = checkBox;
        this.n = scrollView;
    }

    public static rpa0 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(rlh0.paymentsdk_fragment_new_bind, viewGroup, false);
        int i = j9h0.card_input_container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = j9h0.charity_label;
            TextView textView = (TextView) cma1.O(i, inflate);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                i = j9h0.content_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
                if (constraintLayout != null) {
                    i = j9h0.header_view;
                    HeaderView headerView = (HeaderView) cma1.O(i, inflate);
                    if (headerView != null) {
                        i = j9h0.nfc_scanner_fragment_layout;
                        FrameLayout frameLayout2 = (FrameLayout) cma1.O(i, inflate);
                        if (frameLayout2 != null) {
                            i = j9h0.paymethod_back_button;
                            ImageView imageView = (ImageView) cma1.O(i, inflate);
                            if (imageView != null) {
                                i = j9h0.paymethod_title;
                                TextView textView2 = (TextView) cma1.O(i, inflate);
                                if (textView2 != null) {
                                    i = j9h0.personal_info_back_button;
                                    ImageView imageView2 = (ImageView) cma1.O(i, inflate);
                                    if (imageView2 != null) {
                                        i = j9h0.personal_info_title;
                                        TextView textView3 = (TextView) cma1.O(i, inflate);
                                        if (textView3 != null) {
                                            i = j9h0.personal_info_view;
                                            PersonalInfoView personalInfoView = (PersonalInfoView) cma1.O(i, inflate);
                                            if (personalInfoView != null) {
                                                i = j9h0.progress_result_view;
                                                ProgressResultView progressResultView = (ProgressResultView) cma1.O(i, inflate);
                                                if (progressResultView != null) {
                                                    i = j9h0.save_checkbox;
                                                    CheckBox checkBox = (CheckBox) cma1.O(i, inflate);
                                                    if (checkBox != null) {
                                                        i = j9h0.scroll_view;
                                                        ScrollView scrollView = (ScrollView) cma1.O(i, inflate);
                                                        if (scrollView != null) {
                                                            return new rpa0(linearLayout, frameLayout, textView, constraintLayout, headerView, frameLayout2, imageView, textView2, imageView2, textView3, personalInfoView, progressResultView, checkBox, scrollView);
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
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
