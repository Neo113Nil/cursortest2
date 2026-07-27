package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.Bg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2485Bg implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f24053a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3804qg f24054b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24055c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24056d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24057e;

    /* renamed from: f, reason: collision with root package name */
    public float f24058f = 1.0f;

    public C2485Bg(Context context, AbstractC3804qg abstractC3804qg) {
        this.f24053a = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f8602b);
        this.f24054b = abstractC3804qg;
    }

    public final void a() {
        boolean z8 = this.f24056d;
        AbstractC3804qg abstractC3804qg = this.f24054b;
        AudioManager audioManager = this.f24053a;
        if (!z8 || this.f24057e || this.f24058f <= 0.0f) {
            if (this.f24055c) {
                if (audioManager != null) {
                    this.f24055c = audioManager.abandonAudioFocus(this) == 0;
                }
                abstractC3804qg.n();
                return;
            }
            return;
        }
        if (this.f24055c) {
            return;
        }
        if (audioManager != null) {
            this.f24055c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        abstractC3804qg.n();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f24055c = i > 0;
        this.f24054b.n();
    }
}
