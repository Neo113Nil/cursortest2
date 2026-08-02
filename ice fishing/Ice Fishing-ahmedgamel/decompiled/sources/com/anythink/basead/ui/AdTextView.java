package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class AdTextView extends TextView {
    public AdTextView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        setBackgroundResource(q.a(context, "myoffer_bg_banner_ad_choice", k.f20419c));
        setTextColor(-1);
        setText(context.getResources().getString(q.a(context, "basead_ad_text", k.f20423g)));
        setTextSize(8.0f);
        setGravity(17);
        setPadding(q.a(context, 3.0f), 0, q.a(context, 3.0f), 0);
    }

    public AdTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public AdTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
