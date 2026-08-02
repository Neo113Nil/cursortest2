package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class FeedbackTextView extends AutoResizeTextView {
    public FeedbackTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(q.a(context, "myoffer_bg_feedback_textview", k.f20419c));
    }

    private void a(Context context) {
        setBackgroundResource(q.a(context, "myoffer_bg_feedback_textview", k.f20419c));
    }
}
