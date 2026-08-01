package com.google.android.material.datepicker;

import O.C0046w;
import O.K;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.WeakHashMap;
import k0.b0;

/* loaded from: classes.dex */
public final class n extends b0 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f2540u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f2541v;

    public n(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f2540u = textView;
        WeakHashMap weakHashMap = K.f747a;
        new C0046w(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f2541v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
