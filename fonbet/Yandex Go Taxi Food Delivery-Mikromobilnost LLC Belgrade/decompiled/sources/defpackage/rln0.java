package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewBottomRounded$1;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;

/* loaded from: classes6.dex */
public final class rln0 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;

    public rln0(Context context, List list) {
        this.a = list;
        this.b = qje.t(xng0.bgMain, context);
        this.c = context.getResources().getDimensionPixelSize(usg0.round_section_radius);
        this.d = tje.u(6, context);
    }

    public final void a(View view, boolean z, boolean z2) {
        view.setBackgroundColor(this.b);
        int i = this.c;
        if (z && z2) {
            view.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(i));
            view.setClipToOutline(true);
        } else if (z) {
            view.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(i));
            view.setClipToOutline(true);
        } else if (z2) {
            view.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewBottomRounded$1(i));
            view.setClipToOutline(true);
        } else {
            view.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(0));
            view.setClipToOutline(true);
        }
    }

    public final void b() {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((View) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        View view = (View) a.P(arrayList);
        xw31.E(view, null, 0, null, null);
        if (arrayList.size() == 1) {
            a(view, true, false);
            return;
        }
        View view2 = (View) a.Z(arrayList);
        int f = scc.f(arrayList);
        for (int i = 1; i < f; i++) {
            View view3 = (View) arrayList.get(i);
            xw31.E(view3, null, Integer.valueOf(this.d), null, null);
            a(view3, true, true);
        }
        a(view, true, true);
        a((View) arrayList.get(arrayList.size() - 2), true, false);
        a(view2, false, false);
        xw31.E(view2, null, 0, null, null);
    }
}
