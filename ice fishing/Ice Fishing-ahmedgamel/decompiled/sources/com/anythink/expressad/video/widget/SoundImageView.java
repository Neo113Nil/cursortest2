package com.anythink.expressad.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class SoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private boolean f22983a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22983a = true;
    }

    public boolean getStatus() {
        return this.f22983a;
    }

    public void setSoundStatus(boolean z6) {
        this.f22983a = z6;
        if (z6) {
            setImageResource(k.a(getContext(), "anythink_reward_sound_open", k.f20419c));
        } else {
            setImageResource(k.a(getContext(), "anythink_reward_sound_close", k.f20419c));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22983a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.f22983a = true;
    }
}
