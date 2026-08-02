package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.pg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3760pg {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f33863a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f33864b;

    /* renamed from: c, reason: collision with root package name */
    public final C2764Qj f33865c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f33866d;

    public C3760pg(C3919se c3919se, Handler handler, C2764Qj c2764Qj) {
        AudioFocusRequest audioFocusRequest;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        this.f33864b = handler;
        this.f33865c = c2764Qj;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            this.f33863a = new C3168eg(c3919se, handler);
        } else {
            this.f33863a = c3919se;
        }
        if (i >= 26) {
            audioAttributes = com.anythink.core.common.n.b.B.i().setAudioAttributes(c2764Qj.a());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(false);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(c3919se, handler);
            acceptsDelayedFocusGain = onAudioFocusChangeListener.setAcceptsDelayedFocusGain(true);
            audioFocusRequest = acceptsDelayedFocusGain.build();
        } else {
            audioFocusRequest = null;
        }
        this.f33866d = audioFocusRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3760pg)) {
            return false;
        }
        C3760pg c3760pg = (C3760pg) obj;
        c3760pg.getClass();
        return Objects.equals(this.f33863a, c3760pg.f33863a) && Objects.equals(this.f33864b, c3760pg.f33864b) && Objects.equals(this.f33865c, c3760pg.f33865c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.f33863a, this.f33864b, this.f33865c, Boolean.FALSE);
    }
}
