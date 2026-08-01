package com.google.android.gms.internal.ads;

import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.se, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3896se implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cif f33981a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final /* synthetic */ void onAudioFocusChange(int i) {
        Cif cif = this.f33981a;
        cif.getClass();
        if (i == -3 || i == -2) {
            if (i != -2) {
                cif.e(4);
                return;
            } else {
                cif.f(0);
                cif.e(3);
                return;
            }
        }
        if (i == -1) {
            cif.f(-1);
            cif.d();
            cif.e(1);
        } else if (i != 1) {
            com.anythink.basead.exoplayer.f.f.q(i, "Unknown focus change type: ", "AudioFocusManager", new StringBuilder(String.valueOf(i).length() + 27));
        } else {
            cif.e(2);
            cif.f(1);
        }
    }
}
