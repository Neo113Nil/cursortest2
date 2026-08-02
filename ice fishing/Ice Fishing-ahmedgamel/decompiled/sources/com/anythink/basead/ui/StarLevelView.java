package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class StarLevelView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    Context f11180a;

    public StarLevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f11180a = context;
    }

    public void setState(boolean z6) {
        if (z6) {
            setImageResource(q.a(getContext(), "myoffer_splash_star", k.f20419c));
        } else {
            setImageResource(q.a(getContext(), "myoffer_splash_star_gray", k.f20419c));
        }
    }

    public StarLevelView(Context context) {
        this(context, null);
        this.f11180a = context;
    }

    public StarLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11180a = context;
    }
}
