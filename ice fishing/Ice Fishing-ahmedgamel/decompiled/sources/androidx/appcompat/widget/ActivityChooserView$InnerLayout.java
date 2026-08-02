package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import l4.g;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f4538n = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g r9 = g.r(context, attributeSet, f4538n);
        setBackgroundDrawable(r9.i(0));
        r9.t();
    }
}
