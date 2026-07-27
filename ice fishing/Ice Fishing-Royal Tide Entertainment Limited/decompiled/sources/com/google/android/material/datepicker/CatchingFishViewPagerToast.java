package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.catchingfish.fishcatcherpro.R;
import java.util.WeakHashMap;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishFABMVVMWidget;
import kotlin.text.CatchingFishPayPalCardView;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerToast extends CatchingFishPayPalCardView {
    public final TextView CatchingFishCoroutineFlow;
    public final MaterialCalendarGridView CatchingFishDaggerHiltFAB;

    public CatchingFishViewPagerToast(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.CatchingFishCoroutineFlow = textView;
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        new CatchingFishFABMVVMWidget(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).CatchingFishWorkManager(textView, Boolean.TRUE);
        this.CatchingFishDaggerHiltFAB = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
