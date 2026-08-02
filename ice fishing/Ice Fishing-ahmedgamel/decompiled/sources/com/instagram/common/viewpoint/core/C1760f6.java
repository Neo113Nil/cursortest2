package com.instagram.common.viewpoint.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1760f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C06373r A00;

    public C1760f6(C06373r c06373r) {
        this.A00 = c06373r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C0872Dl(this, i));
    }
}
