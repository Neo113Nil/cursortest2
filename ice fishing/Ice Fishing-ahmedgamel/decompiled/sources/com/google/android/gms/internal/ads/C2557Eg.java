package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.Eg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2557Eg implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f25390a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3975tg f25391b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25392c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25393d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25394e;

    /* renamed from: f, reason: collision with root package name */
    public float f25395f = 1.0f;

    public C2557Eg(Context context, AbstractC3975tg abstractC3975tg) {
        this.f25390a = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f9231b);
        this.f25391b = abstractC3975tg;
    }

    public final void a() {
        boolean z6 = this.f25393d;
        AbstractC3975tg abstractC3975tg = this.f25391b;
        AudioManager audioManager = this.f25390a;
        if (!z6 || this.f25394e || this.f25395f <= 0.0f) {
            if (this.f25392c) {
                if (audioManager != null) {
                    this.f25392c = audioManager.abandonAudioFocus(this) == 0;
                }
                abstractC3975tg.m();
                return;
            }
            return;
        }
        if (this.f25392c) {
            return;
        }
        if (audioManager != null) {
            this.f25392c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        abstractC3975tg.m();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f25392c = i > 0;
        this.f25391b.m();
    }
}
