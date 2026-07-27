package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class ShakeTextHintWhiteView extends ShakeTextHintView {
    public ShakeTextHintWhiteView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.ShakeTextHintView
    public final int d() {
        return q.a(getContext(), "myoffer_shake_text_hint_white", "layout");
    }

    public ShakeTextHintWhiteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeTextHintWhiteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
