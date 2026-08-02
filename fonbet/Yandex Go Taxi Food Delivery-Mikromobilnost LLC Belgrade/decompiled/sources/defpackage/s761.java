package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.OperationProgressView;

/* loaded from: classes3.dex */
public final class s761 implements zo31 {
    public final ConstraintLayout a;

    public s761(ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    public static s761 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(boh0.ybsdk_screen_redirect_url, viewGroup, false);
        int i = rbh0.progress_text;
        if (((TextView) cma1.O(i, inflate)) != null) {
            i = rbh0.progress_view;
            if (((OperationProgressView) cma1.O(i, inflate)) != null) {
                return new s761((ConstraintLayout) inflate);
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
