package com.anythink.expressad.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class SoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private boolean f22196a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22196a = true;
    }

    public boolean getStatus() {
        return this.f22196a;
    }

    public void setSoundStatus(boolean z3) {
        this.f22196a = z3;
        if (z3) {
            setImageResource(k.a(getContext(), "anythink_reward_sound_open", k.f19632c));
        } else {
            setImageResource(k.a(getContext(), "anythink_reward_sound_close", k.f19632c));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22196a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.f22196a = true;
    }
}
