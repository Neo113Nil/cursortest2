package ru.yandex.taxi.audio;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import defpackage.cf3;

/* loaded from: classes7.dex */
public final class a {
    public final AudioManager a;
    public final cf3 b;
    public boolean c;
    public AudioFocusRequest d;
    public boolean e;

    public a(AudioManager audioManager, cf3 cf3Var) {
        this.a = audioManager;
        this.b = cf3Var;
    }

    public final void a() {
        this.b.setVolume(0.0f);
        AudioFocusRequest audioFocusRequest = this.d;
        if (audioFocusRequest == null) {
            return;
        }
        this.c = false;
        this.a.abandonAudioFocusRequest(audioFocusRequest);
        this.d = null;
    }

    public final void b() {
        if (this.c) {
            return;
        }
        AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: ru.yandex.taxi.audio.AudioController$AudioFocusChangeListener
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int focusChange) {
                if (focusChange == -2) {
                    a.this.b.setVolume(0.0f);
                    return;
                }
                if (focusChange == -1) {
                    a.this.a();
                } else {
                    if (focusChange != 1) {
                        return;
                    }
                    a aVar = a.this;
                    if (aVar.e) {
                        aVar.c = true;
                    }
                    aVar.b.setVolume(1.0f);
                }
            }
        }).build();
        this.d = build;
        int requestAudioFocus = this.a.requestAudioFocus(build);
        if (requestAudioFocus == 1) {
            this.c = true;
            this.b.setVolume(1.0f);
        } else {
            if (requestAudioFocus != 2) {
                return;
            }
            this.e = true;
        }
    }
}
