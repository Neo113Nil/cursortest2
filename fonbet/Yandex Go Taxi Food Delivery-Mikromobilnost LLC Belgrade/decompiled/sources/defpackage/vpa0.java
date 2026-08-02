package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.PersonalInfoView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;

/* loaded from: classes2.dex */
public final class vpa0 implements zo31 {
    public final LinearLayout a;
    public final HeaderView b;
    public final TextView c;
    public final TextView d;
    public final PersonalInfoView e;
    public final ProgressResultView f;
    public final RecyclerView g;
    public final NestedScrollView h;

    public vpa0(LinearLayout linearLayout, HeaderView headerView, TextView textView, TextView textView2, PersonalInfoView personalInfoView, ProgressResultView progressResultView, RecyclerView recyclerView, NestedScrollView nestedScrollView) {
        this.a = linearLayout;
        this.b = headerView;
        this.c = textView;
        this.d = textView2;
        this.e = personalInfoView;
        this.f = progressResultView;
        this.g = recyclerView;
        this.h = nestedScrollView;
    }

    public static vpa0 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(rlh0.paymentsdk_fragment_select, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i = j9h0.header_view;
        HeaderView headerView = (HeaderView) cma1.O(i, inflate);
        if (headerView != null) {
            i = j9h0.paymethod_title;
            TextView textView = (TextView) cma1.O(i, inflate);
            if (textView != null) {
                i = j9h0.personal_info_title;
                TextView textView2 = (TextView) cma1.O(i, inflate);
                if (textView2 != null) {
                    i = j9h0.personal_info_view;
                    PersonalInfoView personalInfoView = (PersonalInfoView) cma1.O(i, inflate);
                    if (personalInfoView != null) {
                        i = j9h0.progress_result_view;
                        ProgressResultView progressResultView = (ProgressResultView) cma1.O(i, inflate);
                        if (progressResultView != null) {
                            i = j9h0.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                            if (recyclerView != null) {
                                i = j9h0.scroll_view;
                                NestedScrollView nestedScrollView = (NestedScrollView) cma1.O(i, inflate);
                                if (nestedScrollView != null) {
                                    return new vpa0(linearLayout, headerView, textView, textView2, personalInfoView, progressResultView, recyclerView, nestedScrollView);
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
