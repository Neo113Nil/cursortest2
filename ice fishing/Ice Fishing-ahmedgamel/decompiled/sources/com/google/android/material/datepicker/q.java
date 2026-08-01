package com.google.android.material.datepicker;

import O.G;
import O.X;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.icefishing.icefishingbigwin.C5275R;
import java.util.WeakHashMap;
import t0.AbstractC5003S;

/* loaded from: classes2.dex */
public final class q extends AbstractC5003S {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f36011t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f36012u;

    public q(LinearLayout linearLayout, boolean z3) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(C5275R.id.month_title);
        this.f36011t = textView;
        WeakHashMap weakHashMap = X.f2054a;
        new G(C5275R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(textView, Boolean.TRUE);
        this.f36012u = (MaterialCalendarGridView) linearLayout.findViewById(C5275R.id.month_grid);
        if (z3) {
            return;
        }
        textView.setVisibility(8);
    }
}
