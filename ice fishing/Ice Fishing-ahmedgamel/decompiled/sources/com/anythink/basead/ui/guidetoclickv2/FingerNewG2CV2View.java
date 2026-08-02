package com.anythink.basead.ui.guidetoclickv2;

import android.content.Context;
import android.view.View;
import com.anythink.basead.ui.GuideToClickV2View;
import com.anythink.basead.ui.improveclick.c;

/* loaded from: classes.dex */
public class FingerNewG2CV2View extends BaseG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    GuideToClickV2View f11654d;

    public FingerNewG2CV2View(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        setGravity(17);
        GuideToClickV2View guideToClickV2View = new GuideToClickV2View(getContext());
        this.f11654d = guideToClickV2View;
        guideToClickV2View.setFingerViewType(i);
        addView(this.f11654d, -1, -1);
        setClipChildren(false);
        if (this.f11620c != null) {
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.FingerNewG2CV2View.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.a aVar = FingerNewG2CV2View.this.f11620c;
                    if (aVar != null) {
                        aVar.a(11, 47);
                    }
                }
            });
        }
    }
}
