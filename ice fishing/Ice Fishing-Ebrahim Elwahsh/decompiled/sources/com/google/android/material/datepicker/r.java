package com.google.android.material.datepicker;

import O.G;
import O.X;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.WeakHashMap;
import t0.AbstractC5032P;

/* loaded from: classes2.dex */
public final class r extends AbstractC5032P {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f36176t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f36177u;

    public r(LinearLayout linearLayout, boolean z8) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(C5284R.id.month_title);
        this.f36176t = textView;
        WeakHashMap weakHashMap = X.f2240a;
        new G(C5284R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(textView, Boolean.TRUE);
        this.f36177u = (MaterialCalendarGridView) linearLayout.findViewById(C5284R.id.month_grid);
        if (z8) {
            return;
        }
        textView.setVisibility(8);
    }
}
