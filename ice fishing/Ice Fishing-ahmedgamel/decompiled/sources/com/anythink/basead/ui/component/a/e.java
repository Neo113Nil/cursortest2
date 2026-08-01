package com.anythink.basead.ui.component.a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.anythink.basead.ui.ScanningAnimButton;
import com.anythink.basead.ui.f.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public final class e extends c {
    @Override // com.anythink.basead.ui.component.a.c, com.anythink.basead.ui.component.a.d
    public final void a(ViewGroup viewGroup, w wVar, x xVar, boolean z3, b.a aVar) {
        super.a(viewGroup, wVar, xVar, z3, aVar);
        if (this.f10689a != null) {
            if (TextUtils.isEmpty(wVar.D())) {
                this.f10689a.setText(com.anythink.basead.b.e.a(viewGroup.getContext(), wVar));
            } else {
                this.f10689a.setText(wVar.D());
            }
            if (wVar.r() != null) {
                this.f10689a.startAnimation(wVar.r().aH());
            }
        }
    }

    @Override // com.anythink.basead.ui.component.a.c, com.anythink.basead.ui.component.a.d
    public final void b(ViewGroup viewGroup) {
        LayoutInflater.from(viewGroup.getContext()).inflate(q.a(viewGroup.getContext(), "myoffer_large_cta_button_layout", "layout"), viewGroup);
        this.f10689a = (ScanningAnimButton) viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_cta_button_major", "id"));
    }
}
