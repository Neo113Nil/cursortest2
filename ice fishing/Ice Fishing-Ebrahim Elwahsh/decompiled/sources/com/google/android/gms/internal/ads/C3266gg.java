package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.gg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3266gg implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f31032a;

    /* renamed from: b, reason: collision with root package name */
    public final C4125we f31033b;

    public C3266gg(C4125we c4125we, Handler handler) {
        this.f31033b = c4125we;
        Looper looper = handler.getLooper();
        String str = AbstractC3548lu.f32613a;
        this.f31032a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        L.a aVar = new L.a(this, i, 6);
        Handler handler = this.f31032a;
        String str = AbstractC3548lu.f32613a;
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
