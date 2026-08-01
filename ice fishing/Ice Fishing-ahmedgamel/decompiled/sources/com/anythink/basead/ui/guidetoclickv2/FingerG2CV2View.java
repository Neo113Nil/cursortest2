package com.anythink.basead.ui.guidetoclickv2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.anythink.basead.ui.GuideToClickView;
import com.anythink.basead.ui.improveclick.c;

/* loaded from: classes.dex */
public class FingerG2CV2View extends BaseG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    GuideToClickView f10865d;

    /* renamed from: e, reason: collision with root package name */
    int f10866e;

    public FingerG2CV2View(Context context) {
        super(context);
        this.f10866e = 501;
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i6) {
        setGravity(17);
        GuideToClickView guideToClickView = new GuideToClickView(getContext());
        this.f10865d = guideToClickView;
        guideToClickView.setFingerViewMode(this.f10866e);
        addView(this.f10865d, -2, -2);
        setClipChildren(false);
        if (this.f10834c != null) {
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.FingerG2CV2View.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.a aVar = FingerG2CV2View.this.f10834c;
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
        this.f10866e = i;
        GuideToClickView guideToClickView = this.f10865d;
        if (guideToClickView != null) {
            guideToClickView.setFingerViewMode(i);
        }
    }
}
