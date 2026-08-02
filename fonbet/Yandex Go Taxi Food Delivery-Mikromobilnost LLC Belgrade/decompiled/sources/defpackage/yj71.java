package defpackage;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes7.dex */
public final class yj71 extends ia71 {
    @Override // defpackage.ia71
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        textView.setVisibility(8);
        textView.setOnClickListener(null);
        textView.setOnTouchListener(null);
        textView.setSelected(false);
    }

    @Override // defpackage.ia71
    public final boolean c(View view, Object obj) {
        ig61 ig61Var = (ig61) obj;
        CharSequence text = ((TextView) view).getText();
        if (text != null) {
            return String.valueOf(text).equalsIgnoreCase(ig61Var.a);
        }
        return false;
    }

    @Override // defpackage.ia71
    public final void e(View view, Object obj) {
        ((TextView) view).setText(((ig61) obj).a);
    }
}
