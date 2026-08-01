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
    private GuideToClickView f10628o;

    /* renamed from: p, reason: collision with root package name */
    private SimpleCircleView f10629p;

    public b(Context context, w wVar, x xVar, c.a aVar, int i, ViewGroup viewGroup) {
        super(context, wVar, xVar, aVar, i, viewGroup);
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.f10629p = new SimpleCircleView(this.f10610a);
        GuideToClickView guideToClickView = new GuideToClickView(this.f10610a);
        this.f10628o = guideToClickView;
        guideToClickView.hideBackground();
        viewGroup.addView(this.f10629p, -1, -1);
        viewGroup.addView(this.f10628o, -1, -1);
        b(this.f10612c.f14168o.aR());
        this.f10628o.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.b.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = b.this;
                c.a aVar = bVar.f10614e;
                if (aVar != null) {
                    aVar.a(14, 26);
                } else {
                    bVar.d();
                }
            }
        });
        d.a aVar = this.f10617h;
        if (aVar != null) {
            aVar.a(true);
        }
    }

    @Override // com.anythink.basead.ui.c.a
    public final void d() {
        super.d();
        GuideToClickView guideToClickView = this.f10628o;
        if (guideToClickView != null) {
            am.a(guideToClickView);
        }
        SimpleCircleView simpleCircleView = this.f10629p;
        if (simpleCircleView != null) {
            am.a(simpleCircleView);
        }
        c();
        CountDownView countDownView = this.f10622n;
        if (countDownView != null) {
            countDownView.refresh(this.f10621m);
            this.f10622n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.b.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a aVar = b.this.f10617h;
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            });
        }
        d.a aVar = this.f10617h;
        if (aVar != null) {
            aVar.a(false);
        }
    }
}
