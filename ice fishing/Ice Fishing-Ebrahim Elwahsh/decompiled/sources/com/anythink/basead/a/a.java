package com.anythink.basead.a;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.anythink.basead.exoplayer.k.o;
import j1.AbstractC4588a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5842a = "a";

    /* renamed from: b, reason: collision with root package name */
    private AudioManager f5843b;

    /* renamed from: c, reason: collision with root package name */
    private AudioFocusRequest f5844c;

    public final void a(Context context) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest build;
        this.f5843b = (AudioManager) context.getSystemService(o.f8602b);
        if (Build.VERSION.SDK_INT >= 26) {
            audioAttributes = AbstractC4588a.e().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
            acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(false);
            build = acceptsDelayedFocusGain.build();
            this.f5844c = build;
        }
    }

    public final void b() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f5843b.abandonAudioFocusRequest(this.f5844c);
            } else {
                this.f5843b.abandonAudioFocus(null);
            }
        } catch (Exception unused) {
        }
    }

    public final boolean a() {
        int requestAudioFocus;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                requestAudioFocus = this.f5843b.requestAudioFocus(this.f5844c);
            } else {
                requestAudioFocus = this.f5843b.requestAudioFocus(null, 3, 2);
            }
            return requestAudioFocus == 1;
        } catch (Exception unused) {
            return false;
        }
    }
}
