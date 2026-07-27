package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class SplashShakeTextHintView extends ShakeTextHintView {
    public SplashShakeTextHintView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.ShakeTextHintView
    public final int d() {
        return q.a(getContext(), "myoffer_shake_text_hint_splash", "layout");
    }

    public void setTextSize(int i) {
        TextView textView = ((ShakeTextHintView) this).f10272l;
        if (textView != null) {
            textView.setTextSize(1, i);
        }
    }

    public SplashShakeTextHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SplashShakeTextHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SplashShakeTextHintView(Context context, AttributeSet attributeSet, int i, int i6) {
        super(context, attributeSet, i, i6);
    }
}
