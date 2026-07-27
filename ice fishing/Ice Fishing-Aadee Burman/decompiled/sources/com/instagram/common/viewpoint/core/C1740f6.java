package com.instagram.common.viewpoint.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1740f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C06173r A00;

    public C1740f6(C06173r c06173r) {
        this.A00 = c06173r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C0852Dl(this, i));
    }
}
