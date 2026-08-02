package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.ybsdk.widgets.common.WidgetView;

/* loaded from: classes4.dex */
public final class ya61 implements zo31 {
    public final WidgetView a;
    public final TextView b;
    public final View c;
    public final ImageView d;
    public final ViewSwitcher e;

    public ya61(WidgetView widgetView, TextView textView, View view, ImageView imageView, ViewSwitcher viewSwitcher) {
        this.a = widgetView;
        this.b = textView;
        this.c = view;
        this.d = imageView;
        this.e = viewSwitcher;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
