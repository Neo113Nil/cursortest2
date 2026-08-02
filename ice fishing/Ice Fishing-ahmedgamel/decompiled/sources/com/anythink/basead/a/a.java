package com.anythink.basead.a;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.anythink.basead.exoplayer.k.o;
import l4.d;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6471a = "a";

    /* renamed from: b, reason: collision with root package name */
    private AudioManager f6472b;

    /* renamed from: c, reason: collision with root package name */
    private AudioFocusRequest f6473c;

    public final void a(Context context) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest build;
        this.f6472b = (AudioManager) context.getSystemService(o.f9231b);
        if (Build.VERSION.SDK_INT >= 26) {
            audioAttributes = d.f().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
            acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(false);
            build = acceptsDelayedFocusGain.build();
            this.f6473c = build;
        }
    }

    public final void b() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f6472b.abandonAudioFocusRequest(this.f6473c);
            } else {
                this.f6472b.abandonAudioFocus(null);
            }
        } catch (Exception unused) {
        }
    }

    public final boolean a() {
        int requestAudioFocus;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                requestAudioFocus = this.f6472b.requestAudioFocus(this.f6473c);
            } else {
                requestAudioFocus = this.f6472b.requestAudioFocus(null, 3, 2);
            }
            return requestAudioFocus == 1;
        } catch (Exception unused) {
            return false;
        }
    }
}
