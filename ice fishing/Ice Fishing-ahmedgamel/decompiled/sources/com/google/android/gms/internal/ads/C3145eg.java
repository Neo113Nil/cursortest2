package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.eg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3145eg implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f29956a;

    /* renamed from: b, reason: collision with root package name */
    public final C3896se f29957b;

    public C3145eg(C3896se c3896se, Handler handler) {
        this.f29957b = c3896se;
        Looper looper = handler.getLooper();
        String str = AbstractC3159eu.f29993a;
        this.f29956a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        L.a aVar = new L.a(this, i, 6);
        Handler handler = this.f29956a;
        String str = AbstractC3159eu.f29993a;
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
