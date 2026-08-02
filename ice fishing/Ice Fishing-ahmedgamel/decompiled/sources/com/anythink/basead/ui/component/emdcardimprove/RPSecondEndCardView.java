package com.anythink.basead.ui.component.emdcardimprove;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.ScanningAnimButton;
import com.anythink.basead.ui.a.a.e;
import com.anythink.basead.ui.f.b;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class RPSecondEndCardView extends SecondEndCardView {
    private e i;

    public RPSecondEndCardView(Context context) {
        super(context);
    }

    private void d() {
        e eVar = this.i;
        if (eVar != null) {
            eVar.b();
        }
    }

    private void e() {
        e eVar = this.i;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView
    public final void a() {
        super.a();
        RoundImageView roundImageView = this.f11528b;
        if (roundImageView != null) {
            roundImageView.setRadiusInDip(12);
        }
    }

    @Override // com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView
    public final void b() {
        RelativeLayout relativeLayout = this.f11527a;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.emdcardimprove.RPSecondEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a aVar = RPSecondEndCardView.this.f11533g;
                    if (aVar != null) {
                        aVar.a(15, 33);
                    }
                }
            });
        }
        ScanningAnimButton scanningAnimButton = this.f11532f;
        if (scanningAnimButton != null) {
            scanningAnimButton.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.emdcardimprove.RPSecondEndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a aVar = RPSecondEndCardView.this.f11533g;
                    if (aVar != null) {
                        aVar.a(15, 34);
                    }
                }
            });
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.emdcardimprove.RPSecondEndCardView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.a aVar = RPSecondEndCardView.this.f11533g;
                if (aVar != null) {
                    aVar.a(15, 35);
                }
            }
        });
    }

    @Override // com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView
    public final int c() {
        return q.a(getContext(), "myoffer_endcard_improve_rp_second_endcard", "layout");
    }

    @Override // com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ScanningAnimButton scanningAnimButton = this.f11532f;
        if (scanningAnimButton != null) {
            e eVar = this.i;
            if (eVar != null) {
                eVar.d();
            }
            e eVar2 = new e(scanningAnimButton);
            this.i = eVar2;
            eVar2.a();
        }
    }

    @Override // com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            e eVar = this.i;
            if (eVar != null) {
                eVar.c();
                return;
            }
            return;
        }
        e eVar2 = this.i;
        if (eVar2 != null) {
            eVar2.b();
        }
    }

    public void stopAnimation() {
        e eVar = this.i;
        if (eVar != null) {
            eVar.d();
            this.i = null;
        }
    }

    public RPSecondEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RPSecondEndCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void a(View view) {
        if (view == null) {
            return;
        }
        e eVar = this.i;
        if (eVar != null) {
            eVar.d();
        }
        e eVar2 = new e(view);
        this.i = eVar2;
        eVar2.a();
    }
}
