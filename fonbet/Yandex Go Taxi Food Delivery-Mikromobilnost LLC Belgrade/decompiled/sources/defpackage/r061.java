package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.widgets.common.CircleButtonView;

/* loaded from: classes4.dex */
public final class r061 implements zo31 {
    public final CircleButtonView a;
    public final AppCompatTextView b;
    public final AppCompatImageView c;
    public final AppCompatTextView d;

    public r061(CircleButtonView circleButtonView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2) {
        this.a = circleButtonView;
        this.b = appCompatTextView;
        this.c = appCompatImageView;
        this.d = appCompatTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
