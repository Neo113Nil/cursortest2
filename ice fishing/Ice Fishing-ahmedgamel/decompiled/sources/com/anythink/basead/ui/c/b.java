package com.anythink.basead.ui.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.ui.CountDownView;
import com.anythink.basead.ui.GuideToClickView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.d;
import com.anythink.basead.ui.simpleview.SimpleCircleView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: o, reason: collision with root package name */
    private GuideToClickView f11414o;

    /* renamed from: p, reason: collision with root package name */
    private SimpleCircleView f11415p;

    public b(Context context, w wVar, x xVar, c.a aVar, int i, ViewGroup viewGroup) {
        super(context, wVar, xVar, aVar, i, viewGroup);
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.f11415p = new SimpleCircleView(this.f11396a);
        GuideToClickView guideToClickView = new GuideToClickView(this.f11396a);
        this.f11414o = guideToClickView;
        guideToClickView.hideBackground();
        viewGroup.addView(this.f11415p, -1, -1);
        viewGroup.addView(this.f11414o, -1, -1);
        b(this.f11398c.f14954o.aR());
        this.f11414o.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.b.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = b.this;
                c.a aVar = bVar.f11400e;
                if (aVar != null) {
                    aVar.a(14, 26);
                } else {
                    bVar.d();
                }
            }
        });
        d.a aVar = this.f11403h;
        if (aVar != null) {
            aVar.a(true);
        }
    }

    @Override // com.anythink.basead.ui.c.a
    public final void d() {
        super.d();
        GuideToClickView guideToClickView = this.f11414o;
        if (guideToClickView != null) {
            am.a(guideToClickView);
        }
        SimpleCircleView simpleCircleView = this.f11415p;
        if (simpleCircleView != null) {
            am.a(simpleCircleView);
        }
        c();
        CountDownView countDownView = this.f11408n;
        if (countDownView != null) {
            countDownView.refresh(this.f11407m);
            this.f11408n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.b.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a aVar = b.this.f11403h;
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            });
        }
        d.a aVar = this.f11403h;
        if (aVar != null) {
            aVar.a(false);
        }
    }
}
