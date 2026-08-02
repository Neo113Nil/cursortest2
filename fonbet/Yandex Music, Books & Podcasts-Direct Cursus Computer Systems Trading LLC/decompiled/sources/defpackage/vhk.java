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
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class vhk implements adu {
    public final LinearLayout a;
    public final HeaderView b;
    public final TextView c;
    public final TextView d;
    public final PersonalInfoView e;
    public final ProgressResultView f;
    public final RecyclerView g;
    public final NestedScrollView h;

    public vhk(LinearLayout linearLayout, HeaderView headerView, TextView textView, TextView textView2, PersonalInfoView personalInfoView, ProgressResultView progressResultView, RecyclerView recyclerView, NestedScrollView nestedScrollView) {
        this.a = linearLayout;
        this.b = headerView;
        this.c = textView;
        this.d = textView2;
        this.e = personalInfoView;
        this.f = progressResultView;
        this.g = recyclerView;
        this.h = nestedScrollView;
    }

    public static vhk a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_fragment_select, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i = R.id.header_view;
        HeaderView headerView = (HeaderView) dag.v(R.id.header_view, inflate);
        if (headerView != null) {
            i = R.id.paymethod_title;
            TextView textView = (TextView) dag.v(R.id.paymethod_title, inflate);
            if (textView != null) {
                i = R.id.personal_info_title;
                TextView textView2 = (TextView) dag.v(R.id.personal_info_title, inflate);
                if (textView2 != null) {
                    i = R.id.personal_info_view;
                    PersonalInfoView personalInfoView = (PersonalInfoView) dag.v(R.id.personal_info_view, inflate);
                    if (personalInfoView != null) {
                        i = R.id.progress_result_view;
                        ProgressResultView progressResultView = (ProgressResultView) dag.v(R.id.progress_result_view, inflate);
                        if (progressResultView != null) {
                            i = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) dag.v(R.id.recycler_view, inflate);
                            if (recyclerView != null) {
                                i = R.id.scroll_view;
                                NestedScrollView nestedScrollView = (NestedScrollView) dag.v(R.id.scroll_view, inflate);
                                if (nestedScrollView != null) {
                                    return new vhk(linearLayout, headerView, textView, textView2, personalInfoView, progressResultView, recyclerView, nestedScrollView);
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
