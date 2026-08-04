package com.gamericefishpro.space.w7;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.gamericefishpro.space.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final Context a;
    public MediaPlayer b;
    public SoundPool c;
    public final int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.h = true;
        this.i = true;
        this.j = true;
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(4).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).build();
        soundPoolBuild.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: com.gamericefishpro.space.w7.a
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                if (i2 == 0) {
                    this.a.e = true;
                }
            }
        });
        this.d = soundPoolBuild.load(context, R.raw.match, 1);
        this.c = soundPoolBuild;
    }

    public final void a() {
        SoundPool soundPool;
        if (this.h && this.f && this.e && (soundPool = this.c) != null) {
            soundPool.play(this.d, 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    public final void b() {
        MediaPlayer mediaPlayer;
        if (this.f && this.i && this.g && (mediaPlayer = this.b) != null && !mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }
    }

    public final void c() {
        if (this.j && this.f) {
            try {
                int i = Build.VERSION.SDK_INT;
                Context context = this.a;
                Vibrator defaultVibrator = null;
                if (i >= 31) {
                    Object systemService = context.getSystemService("vibrator_manager");
                    VibratorManager vibratorManagerH = com.gamericefishpro.space.p6.a.p(systemService) ? com.gamericefishpro.space.p6.a.h(systemService) : null;
                    if (vibratorManagerH != null) {
                        defaultVibrator = vibratorManagerH.getDefaultVibrator();
                    }
                } else {
                    Object systemService2 = context.getSystemService("vibrator");
                    if (systemService2 instanceof Vibrator) {
                        defaultVibrator = (Vibrator) systemService2;
                    }
                }
                if (defaultVibrator != null) {
                    defaultVibrator.vibrate(VibrationEffect.createOneShot(50L, -1));
                }
            } catch (Exception unused) {
            }
        }
    }
}
