package com.anythink.basead.a;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.anythink.basead.exoplayer.k.o;
import j4.AbstractC4610d;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5685a = "a";

    /* renamed from: b, reason: collision with root package name */
    private AudioManager f5686b;

    /* renamed from: c, reason: collision with root package name */
    private AudioFocusRequest f5687c;

    public final void a(Context context) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest build;
        this.f5686b = (AudioManager) context.getSystemService(o.f8445b);
        if (Build.VERSION.SDK_INT >= 26) {
            audioAttributes = AbstractC4610d.f().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
            acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(false);
            build = acceptsDelayedFocusGain.build();
            this.f5687c = build;
        }
    }

    public final void b() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f5686b.abandonAudioFocusRequest(this.f5687c);
            } else {
                this.f5686b.abandonAudioFocus(null);
            }
        } catch (Exception unused) {
        }
    }

    public final boolean a() {
        int requestAudioFocus;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                requestAudioFocus = this.f5686b.requestAudioFocus(this.f5687c);
            } else {
                requestAudioFocus = this.f5686b.requestAudioFocus(null, 3, 2);
            }
            return requestAudioFocus == 1;
        } catch (Exception unused) {
            return false;
        }
    }
}
