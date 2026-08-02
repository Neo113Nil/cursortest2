package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class MuteImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private boolean f10944a;

    public MuteImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10944a = false;
    }

    public void setMute(boolean z6) {
        if (z6) {
            setSelected(true);
        } else {
            setSelected(false);
        }
    }
}
