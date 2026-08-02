package com.yandex.plus.pay.ui.core.debug.internal;

import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.s9f;
import defpackage.ze3;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        s9f[] s9fVarArr = c.j;
        dialogInterface.getClass();
        FrameLayout frameLayout = (FrameLayout) ((ze3) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
            BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
            from.getClass();
            from.setState(3);
            from.setSkipCollapsed(true);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.height = -1;
            frameLayout.setLayoutParams(layoutParams);
        }
    }
}
