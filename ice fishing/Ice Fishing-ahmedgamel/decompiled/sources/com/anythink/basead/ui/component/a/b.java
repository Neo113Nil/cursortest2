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
    public final void a(ViewGroup viewGroup, w wVar, x xVar, boolean z6, final b.a aVar) {
        if (this.f11476b != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            int i = layoutParams.width;
            if (i > 0 && i < q.a(viewGroup.getContext(), 240.0f)) {
                layoutParams.width = q.a(viewGroup.getContext(), 296.0f);
                viewGroup.setLayoutParams(layoutParams);
            }
            this.f11476b.setVisibility(0);
            if (!TextUtils.isEmpty(xVar.f14954o.bm())) {
                this.f11476b.setText(xVar.f14954o.bm());
            }
            this.f11476b.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.a.b.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(-100, 13);
                    }
                }
            });
            this.f11476b.setEnabled(false);
        }
        if (this.f11475a != null) {
            if (TextUtils.isEmpty(wVar.D())) {
                this.f11475a.setText(com.anythink.basead.b.e.a(viewGroup.getContext(), wVar));
            } else {
                this.f11475a.setText(wVar.D());
            }
            if (viewGroup.getParent() != null && (viewGroup.getParent() instanceof ViewGroup)) {
                ((ViewGroup) viewGroup.getParent()).setClipChildren(false);
            }
            if (wVar.r() != null) {
                this.f11475a.startAnimation(wVar.r().aH());
            }
            if (aVar != null) {
                this.f11475a.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.a.b.2
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
        this.f11475a = (ScanningAnimButton) viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_cta_button_major", "id"));
        this.f11476b = (ScanningAnimButton) viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_cta_button_minor", "id"));
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final void c(ViewGroup viewGroup) {
    }

    @Override // com.anythink.basead.ui.component.a.a, com.anythink.basead.ui.component.a.d
    public final void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        ScanningAnimButton scanningAnimButton = this.f11476b;
        if (scanningAnimButton != null) {
            scanningAnimButton.setEnabled(true);
            Context context = viewGroup.getContext();
            this.f11476b.setBackgroundResource(q.a(context, "myoffer_splash_bg_rectangle_btn_cta_close_minor_active", k.f20419c));
            this.f11476b.setTextColor(context.getResources().getColor(q.a(context, "color_cta_text", k.f20420d)));
        }
    }
}
