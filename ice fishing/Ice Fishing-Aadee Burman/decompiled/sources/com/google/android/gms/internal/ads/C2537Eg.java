package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.Eg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2537Eg implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f24637a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3952tg f24638b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24639c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24640d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24641e;

    /* renamed from: f, reason: collision with root package name */
    public float f24642f = 1.0f;

    public C2537Eg(Context context, AbstractC3952tg abstractC3952tg) {
        this.f24637a = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f8445b);
        this.f24638b = abstractC3952tg;
    }

    public final void a() {
        boolean z3 = this.f24640d;
        AbstractC3952tg abstractC3952tg = this.f24638b;
        AudioManager audioManager = this.f24637a;
        if (!z3 || this.f24641e || this.f24642f <= 0.0f) {
            if (this.f24639c) {
                if (audioManager != null) {
                    this.f24639c = audioManager.abandonAudioFocus(this) == 0;
                }
                abstractC3952tg.m();
                return;
            }
            return;
        }
        if (this.f24639c) {
            return;
        }
        if (audioManager != null) {
            this.f24639c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        abstractC3952tg.m();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f24639c = i > 0;
        this.f24638b.m();
    }
}
