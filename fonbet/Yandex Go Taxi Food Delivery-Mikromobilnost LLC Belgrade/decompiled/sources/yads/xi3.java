package yads;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes7.dex */
public final class xi3 implements View.OnClickListener {
    public final TextView a;

    public xi3(TextView textView) {
        this.a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView = this.a;
        if (textView != null) {
            textView.performClick();
        }
    }
}
