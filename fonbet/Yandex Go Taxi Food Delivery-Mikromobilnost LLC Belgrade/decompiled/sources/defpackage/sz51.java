package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.widgets.common.AdLabelView;

/* loaded from: classes4.dex */
public final class sz51 implements zo31 {
    public final AdLabelView a;
    public final AppCompatImageView b;
    public final TextView c;

    public sz51(AdLabelView adLabelView, AppCompatImageView appCompatImageView, TextView textView) {
        this.a = adLabelView;
        this.b = appCompatImageView;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
