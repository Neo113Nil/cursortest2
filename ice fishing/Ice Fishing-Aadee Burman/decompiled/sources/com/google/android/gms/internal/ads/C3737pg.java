package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.pg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3737pg {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f33073a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f33074b;

    /* renamed from: c, reason: collision with root package name */
    public final C2744Qj f33075c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f33076d;

    public C3737pg(C3896se c3896se, Handler handler, C2744Qj c2744Qj) {
        AudioFocusRequest audioFocusRequest;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        this.f33074b = handler;
        this.f33075c = c2744Qj;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            this.f33073a = new C3145eg(c3896se, handler);
        } else {
            this.f33073a = c3896se;
        }
        if (i >= 26) {
            audioAttributes = com.anythink.core.common.n.b.A.i().setAudioAttributes(c2744Qj.a());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(false);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(c3896se, handler);
            acceptsDelayedFocusGain = onAudioFocusChangeListener.setAcceptsDelayedFocusGain(true);
            audioFocusRequest = acceptsDelayedFocusGain.build();
        } else {
            audioFocusRequest = null;
        }
        this.f33076d = audioFocusRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3737pg)) {
            return false;
        }
        C3737pg c3737pg = (C3737pg) obj;
        c3737pg.getClass();
        return Objects.equals(this.f33073a, c3737pg.f33073a) && Objects.equals(this.f33074b, c3737pg.f33074b) && Objects.equals(this.f33075c, c3737pg.f33075c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.f33073a, this.f33074b, this.f33075c, Boolean.FALSE);
    }
}
