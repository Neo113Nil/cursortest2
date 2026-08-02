package com.anythink.basead.ui.guidetoclickv2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.anythink.basead.ui.GuideToClickView;
import com.anythink.basead.ui.improveclick.c;

/* loaded from: classes.dex */
public class FingerG2CV2View extends BaseG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    GuideToClickView f11651d;

    /* renamed from: e, reason: collision with root package name */
    int f11652e;

    public FingerG2CV2View(Context context) {
        super(context);
        this.f11652e = 501;
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        setGravity(17);
        GuideToClickView guideToClickView = new GuideToClickView(getContext());
        this.f11651d = guideToClickView;
        guideToClickView.setFingerViewMode(this.f11652e);
        addView(this.f11651d, -2, -2);
        setClipChildren(false);
        if (this.f11620c != null) {
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.FingerG2CV2View.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.a aVar = FingerG2CV2View.this.f11620c;
                    if (aVar != null) {
                        aVar.a(11, 20);
                    }
                }
            });
        }
    }

    public void setFingerViewMode(int i) {
        if (i == 503) {
            setBackgroundColor(Color.parseColor("#66000000"));
        }
        this.f11652e = i;
        GuideToClickView guideToClickView = this.f11651d;
        if (guideToClickView != null) {
            guideToClickView.setFingerViewMode(i);
        }
    }
}
