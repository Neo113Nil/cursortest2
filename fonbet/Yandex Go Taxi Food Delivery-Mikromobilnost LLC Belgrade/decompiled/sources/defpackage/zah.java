package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes11.dex */
public final class zah implements zo31 {
    public final /* synthetic */ int a;
    public final ConstraintLayout b;
    public final Button c;

    public /* synthetic */ zah(ConstraintLayout constraintLayout, Button button, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.c = button;
    }

    public static zah p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(slh0.default_error_view, viewGroup, false);
        int i2 = rgh0.feedsdk_errorActionButton;
        Button button = (Button) cma1.O(i2, inflate);
        if (button != null) {
            i2 = rgh0.feedsdk_errorImage;
            if (((ImageView) cma1.O(i2, inflate)) != null) {
                i2 = rgh0.feedsdk_errorSubtitle;
                if (((TextView) cma1.O(i2, inflate)) != null) {
                    i2 = rgh0.feedsdk_errorTitle;
                    if (((TextView) cma1.O(i2, inflate)) != null) {
                        return new zah((ConstraintLayout) inflate, button, i);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }

    public ConstraintLayout o() {
        return this.b;
    }
}
