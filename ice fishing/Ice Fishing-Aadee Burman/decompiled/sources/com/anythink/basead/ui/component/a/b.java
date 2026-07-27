package com.anythink.basead.ui.component.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.ui.ScanningAnimButton;
import com.anythink.basead.ui.f.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class b extends a {
    @Override // com.anythink.basead.ui.component.a.d
    public final void a(ViewGroup viewGroup, w wVar, x xVar, boolean z3, final b.a aVar) {
        if (this.f10690b != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            int i = layoutParams.width;
            if (i > 0 && i < q.a(viewGroup.getContext(), 240.0f)) {
                layoutParams.width = q.a(viewGroup.getContext(), 296.0f);
                viewGroup.setLayoutParams(layoutParams);
            }
            this.f10690b.setVisibility(0);
            if (!TextUtils.isEmpty(xVar.f14168o.bm())) {
                this.f10690b.setText(xVar.f14168o.bm());
            }
            this.f10690b.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.a.b.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(-100, 13);
                    }
                }
            });
            this.f10690b.setEnabled(false);
        }
        if (this.f10689a != null) {
            if (TextUtils.isEmpty(wVar.D())) {
                this.f10689a.setText(com.anythink.basead.b.e.a(viewGroup.getContext(), wVar));
            } else {
                this.f10689a.setText(wVar.D());
            }
            if (viewGroup.getParent() != null && (viewGroup.getParent() instanceof ViewGroup)) {
                ((ViewGroup) viewGroup.getParent()).setClipChildren(false);
            }
            if (wVar.r() != null) {
                this.f10689a.startAnimation(wVar.r().aH());
            }
            if (aVar != null) {
                this.f10689a.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.a.b.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        aVar.a(1, 1);
                    }
                });
            }
        }
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final void b(ViewGroup viewGroup) {
        LayoutInflater.from(viewGroup.getContext()).inflate(q.a(viewGroup.getContext(), "myoffer_close_cta_button_layout", "layout"), viewGroup);
        this.f10689a = (ScanningAnimButton) viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_cta_button_major", "id"));
        this.f10690b = (ScanningAnimButton) viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_cta_button_minor", "id"));
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final void c(ViewGroup viewGroup) {
    }

    @Override // com.anythink.basead.ui.component.a.a, com.anythink.basead.ui.component.a.d
    public final void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        ScanningAnimButton scanningAnimButton = this.f10690b;
        if (scanningAnimButton != null) {
            scanningAnimButton.setEnabled(true);
            Context context = viewGroup.getContext();
            this.f10690b.setBackgroundResource(q.a(context, "myoffer_splash_bg_rectangle_btn_cta_close_minor_active", k.f19632c));
            this.f10690b.setTextColor(context.getResources().getColor(q.a(context, "color_cta_text", k.f19633d)));
        }
    }
}
