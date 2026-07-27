package com.anythink.basead.ui.improveclick;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.GuideToClickView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    GuideToClickView f11308a;

    /* renamed from: b, reason: collision with root package name */
    boolean f11309b = false;

    /* renamed from: c, reason: collision with root package name */
    boolean f11310c = false;

    private void b() {
        GuideToClickView guideToClickView;
        if (this.i == null || (guideToClickView = this.f11308a) == null) {
            return;
        }
        am.a(guideToClickView);
        this.i.addView(this.f11308a, new RelativeLayout.LayoutParams(-1, -1));
    }

    private void c() {
        GuideToClickView guideToClickView = this.f11308a;
        if (guideToClickView != null) {
            guideToClickView.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a() {
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, c.a aVar) {
        super.a(context, wVar, xVar, viewGroup, relativeLayout, view, i, aVar);
        GuideToClickView guideToClickView = new GuideToClickView(this.f11295d);
        this.f11308a = guideToClickView;
        guideToClickView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.e.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.a aVar2 = e.this.f11301k;
                if (aVar2 != null) {
                    aVar2.a(1, 12);
                }
            }
        });
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(int i, Map<String, Object> map) {
        if (i == 103) {
            if (c.a(map) || this.f11299h != 1 || this.f11309b || !this.f11310c || this.f11308a == null) {
                return;
            }
            b();
            return;
        }
        if (i == 113) {
            this.f11309b = true;
            GuideToClickView guideToClickView = this.f11308a;
            if (guideToClickView != null) {
                guideToClickView.setVisibility(8);
                return;
            }
            return;
        }
        if (i != 116) {
            switch (i) {
                case 106:
                    if (this.f11299h == 3 && com.anythink.basead.b.e.b(this.f11296e)) {
                        b();
                        break;
                    }
                    break;
                case 107:
                case 108:
                    this.f11310c = true;
                    break;
            }
            return;
        }
        if (this.f11299h != 3 || com.anythink.basead.b.e.b(this.f11296e)) {
            return;
        }
        b();
    }
}
