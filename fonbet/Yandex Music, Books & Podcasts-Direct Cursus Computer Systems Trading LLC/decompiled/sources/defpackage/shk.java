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
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class shk implements adu {
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

    public shk(LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, ConstraintLayout constraintLayout, HeaderView headerView, FrameLayout frameLayout2, ImageView imageView, TextView textView2, ImageView imageView2, TextView textView3, PersonalInfoView personalInfoView, ProgressResultView progressResultView, CheckBox checkBox, ScrollView scrollView) {
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

    public static shk a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_fragment_new_bind, viewGroup, false);
        int i = R.id.card_input_container;
        FrameLayout frameLayout = (FrameLayout) dag.v(R.id.card_input_container, inflate);
        if (frameLayout != null) {
            i = R.id.charity_label;
            TextView textView = (TextView) dag.v(R.id.charity_label, inflate);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                i = R.id.content_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) dag.v(R.id.content_layout, inflate);
                if (constraintLayout != null) {
                    i = R.id.header_view;
                    HeaderView headerView = (HeaderView) dag.v(R.id.header_view, inflate);
                    if (headerView != null) {
                        i = R.id.nfc_scanner_fragment_layout;
                        FrameLayout frameLayout2 = (FrameLayout) dag.v(R.id.nfc_scanner_fragment_layout, inflate);
                        if (frameLayout2 != null) {
                            i = R.id.paymethod_back_button;
                            ImageView imageView = (ImageView) dag.v(R.id.paymethod_back_button, inflate);
                            if (imageView != null) {
                                i = R.id.paymethod_title;
                                TextView textView2 = (TextView) dag.v(R.id.paymethod_title, inflate);
                                if (textView2 != null) {
                                    i = R.id.personal_info_back_button;
                                    ImageView imageView2 = (ImageView) dag.v(R.id.personal_info_back_button, inflate);
                                    if (imageView2 != null) {
                                        i = R.id.personal_info_title;
                                        TextView textView3 = (TextView) dag.v(R.id.personal_info_title, inflate);
                                        if (textView3 != null) {
                                            i = R.id.personal_info_view;
                                            PersonalInfoView personalInfoView = (PersonalInfoView) dag.v(R.id.personal_info_view, inflate);
                                            if (personalInfoView != null) {
                                                i = R.id.progress_result_view;
                                                ProgressResultView progressResultView = (ProgressResultView) dag.v(R.id.progress_result_view, inflate);
                                                if (progressResultView != null) {
                                                    i = R.id.save_checkbox;
                                                    CheckBox checkBox = (CheckBox) dag.v(R.id.save_checkbox, inflate);
                                                    if (checkBox != null) {
                                                        i = R.id.scroll_view;
                                                        ScrollView scrollView = (ScrollView) dag.v(R.id.scroll_view, inflate);
                                                        if (scrollView != null) {
                                                            return new shk(linearLayout, frameLayout, textView, constraintLayout, headerView, frameLayout2, imageView, textView2, imageView2, textView3, personalInfoView, progressResultView, checkBox, scrollView);
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
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
