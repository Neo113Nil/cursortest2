package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.eg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3168eg implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f30747a;

    /* renamed from: b, reason: collision with root package name */
    public final C3919se f30748b;

    public C3168eg(C3919se c3919se, Handler handler) {
        this.f30748b = c3919se;
        Looper looper = handler.getLooper();
        String str = AbstractC3182eu.f30782a;
        this.f30747a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        L.a aVar = new L.a(this, i, 6);
        Handler handler = this.f30747a;
        String str = AbstractC3182eu.f30782a;
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                aVar.run();
            } else {
                handler.post(aVar);
            }
        }
    }
}
