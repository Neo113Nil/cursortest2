package defpackage;

import android.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes3.dex */
public final class bdp extends BaseAdapter {
    public List a = c5b.a;
    public final /* synthetic */ cdp b;

    public bdp(cdp cdpVar) {
        this.b = cdpVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (String) this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = view;
        if (view == null) {
            TextView textView = new TextView(this.b.C, null, R.attr.spinnerDropDownItemStyle);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, bg3.x(48, textView.getResources().getDisplayMetrics())));
            textView.setTextAlignment(5);
            view2 = textView;
        }
        TextView textView2 = (TextView) view2;
        textView2.setText((String) this.a.get(i));
        return textView2;
    }
}
