package com.google.android.material.datepicker;

import O.G;
import O.X;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.WeakHashMap;
import t0.AbstractC5000P;

/* loaded from: classes2.dex */
public final class q extends AbstractC5000P {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f36779t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f36780u;

    public q(LinearLayout linearLayout, boolean z6) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(C5248R.id.month_title);
        this.f36779t = textView;
        WeakHashMap weakHashMap = X.f2142a;
        new G(C5248R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(textView, Boolean.TRUE);
        this.f36780u = (MaterialCalendarGridView) linearLayout.findViewById(C5248R.id.month_grid);
        if (z6) {
            return;
        }
        textView.setVisibility(8);
    }
}
