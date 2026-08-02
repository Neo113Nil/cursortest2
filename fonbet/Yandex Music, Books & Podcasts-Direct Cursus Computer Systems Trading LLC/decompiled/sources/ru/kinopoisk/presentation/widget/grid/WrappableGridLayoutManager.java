package ru.kinopoisk.presentation.widget.grid;

import android.view.View;
import android.view.ViewGroup;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.amh;
import defpackage.kpn;
import defpackage.zon;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/presentation/widget/grid/WrappableGridLayoutManager;", "Lru/kinopoisk/presentation/widget/grid/BaseGridLayoutManager;", "android_ui_uikit_mobilelegacy"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public class WrappableGridLayoutManager extends BaseGridLayoutManager {
    @Override // defpackage.yon
    public final void G0(amh amhVar, kpn kpnVar, int i, int i2) {
        amhVar.getClass();
        kpnVar.getClass();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            this.b.setMeasuredDimension(size, size2);
            return;
        }
        if (a0() <= 0) {
            if (mode != 1073741824) {
                size = 0;
            }
            if (mode2 != 1073741824) {
                size2 = 0;
            }
            this.b.setMeasuredDimension(size, size2);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        View d = amhVar.d(0);
        d.getClass();
        ViewGroup.LayoutParams layoutParams = d.getLayoutParams();
        layoutParams.getClass();
        zon zonVar = (zon) layoutParams;
        w(null, d);
        d.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, d0() + c0(), ((ViewGroup.MarginLayoutParams) zonVar).width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, b0() + e0(), ((ViewGroup.MarginLayoutParams) zonVar).height));
        d.getMeasuredWidth();
        throw null;
    }
}
