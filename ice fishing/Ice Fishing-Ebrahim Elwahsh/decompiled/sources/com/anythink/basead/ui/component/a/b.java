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
    public final void a(ViewGroup viewGroup, w wVar, x xVar, boolean z8, final b.a aVar) {
        if (this.f10847b != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            int i = layoutParams.width;
            if (i > 0 && i < q.a(viewGroup.getContext(), 240.0f)) {
                layoutParams.width = q.a(viewGroup.getContext(), 296.0f);
                viewGroup.setLayoutParams(layoutParams);
            }
            this.f10847b.setVisibility(0);
            if (!TextUtils.isEmpty(xVar.f14325o.bm())) {
                this.f10847b.setText(xVar.f14325o.bm());
            }
            this.f10847b.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.a.b.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(-100, 13);
                    }
                }
            });
            this.f10847b.setEnabled(false);
        }
        if (this.f10846a != null) {
            if (TextUtils.isEmpty(wVar.D())) {
                this.f10846a.setText(com.anythink.basead.b.e.a(viewGroup.getContext(), wVar));
            } else {
                this.f10846a.setText(wVar.D());
            }
            if (viewGroup.getParent() != null && (viewGroup.getParent() instanceof ViewGroup)) {
                ((ViewGroup) viewGroup.getParent()).setClipChildren(false);
            }
            if (wVar.r() != null) {
                this.f10846a.startAnimation(wVar.r().aH());
            }
            if (aVar != null) {
                this.f10846a.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.a.b.2
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
        this.f10846a = (ScanningAnimButton) viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_cta_button_major", "id"));
        this.f10847b = (ScanningAnimButton) viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_cta_button_minor", "id"));
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final void c(ViewGroup viewGroup) {
    }

    @Override // com.anythink.basead.ui.component.a.a, com.anythink.basead.ui.component.a.d
    public final void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        ScanningAnimButton scanningAnimButton = this.f10847b;
        if (scanningAnimButton != null) {
            scanningAnimButton.setEnabled(true);
            Context context = viewGroup.getContext();
            this.f10847b.setBackgroundResource(q.a(context, "myoffer_splash_bg_rectangle_btn_cta_close_minor_active", k.f19790c));
            this.f10847b.setTextColor(context.getResources().getColor(q.a(context, "color_cta_text", k.f19791d)));
        }
    }
}
