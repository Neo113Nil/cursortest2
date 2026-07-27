package com.anythink.basead.ui.component.a;

import android.graphics.Color;
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
public class c extends a {
    private static boolean a(w wVar, boolean z3) {
        if (wVar == null) {
            return false;
        }
        int aP = wVar.r().aP();
        return aP != 2 ? aP != 3 ? aP == 4 : !z3 : z3;
    }

    @Override // com.anythink.basead.ui.component.a.d
    public void b(ViewGroup viewGroup) {
        LayoutInflater.from(viewGroup.getContext()).inflate(q.a(viewGroup.getContext(), "myoffer_cta_button_layout", "layout"), viewGroup);
        this.f10689a = (ScanningAnimButton) viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_cta_button_major", "id"));
        this.f10690b = (ScanningAnimButton) viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_cta_button_minor", "id"));
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final void c(ViewGroup viewGroup) {
        ScanningAnimButton scanningAnimButton = this.f10690b;
        if (scanningAnimButton != null) {
            scanningAnimButton.setTextColor(Color.parseColor("#FFFFFF"));
            this.f10690b.setBackgroundResource(q.a(viewGroup.getContext(), "myoffer_splash_bg_rectangle_btn_cta_asseblem_minor_white", k.f19632c));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // com.anythink.basead.ui.component.a.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(ViewGroup viewGroup, w wVar, x xVar, final boolean z3, final b.a aVar) {
        boolean z6;
        ScanningAnimButton scanningAnimButton;
        if (wVar != null) {
            int aP = wVar.r().aP();
            if (aP == 2) {
                z6 = z3;
            } else if (aP == 3) {
                z6 = !z3;
            } else if (aP == 4) {
                z6 = true;
            }
            scanningAnimButton = this.f10690b;
            if (scanningAnimButton != null) {
                if (z6) {
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    int i = layoutParams.width;
                    if (i > 0 && i < q.a(viewGroup.getContext(), 240.0f)) {
                        layoutParams.width = q.a(viewGroup.getContext(), 296.0f);
                        viewGroup.setLayoutParams(layoutParams);
                    }
                    this.f10690b.setVisibility(0);
                    if (!TextUtils.isEmpty(xVar.f14168o.aZ())) {
                        this.f10690b.setText(xVar.f14168o.aZ());
                    }
                    if (aVar != null) {
                        this.f10690b.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.a.c.1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                if (z3) {
                                    aVar.a(1, 40);
                                } else {
                                    aVar.a(1, 24);
                                }
                            }
                        });
                    }
                } else {
                    scanningAnimButton.setVisibility(8);
                }
            }
            if (this.f10689a == null) {
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
                if (aVar == null || !z6) {
                    return;
                }
                this.f10689a.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.a.c.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (z3) {
                            aVar.a(1, 41);
                        } else {
                            aVar.a(1, 25);
                        }
                    }
                });
                return;
            }
            return;
        }
        z6 = false;
        scanningAnimButton = this.f10690b;
        if (scanningAnimButton != null) {
        }
        if (this.f10689a == null) {
        }
    }
}
