package defpackage;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes7.dex */
public final class t271 extends ia71 {
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
        String str = (String) obj;
        CharSequence text = ((TextView) view).getText();
        if (text != null) {
            return String.valueOf(text).equalsIgnoreCase(str);
        }
        return false;
    }

    @Override // defpackage.ia71
    public final void e(View view, Object obj) {
        ((TextView) view).setText((String) obj);
    }
}
