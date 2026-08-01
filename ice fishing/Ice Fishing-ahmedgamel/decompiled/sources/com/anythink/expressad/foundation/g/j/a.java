package com.anythink.expressad.foundation.g.j;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private String f19581b;

    /* renamed from: c, reason: collision with root package name */
    private MediaPlayer f19582c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f19583d;

    /* renamed from: f, reason: collision with root package name */
    private volatile MediaPlayer.OnPreparedListener f19585f;

    /* renamed from: a, reason: collision with root package name */
    Object f19580a = new Object();

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f19584e = false;

    public static /* synthetic */ boolean a(a aVar) {
        aVar.f19584e = true;
        return true;
    }

    private String c() {
        return this.f19581b;
    }

    private MediaPlayer d() {
        return this.f19582c;
    }

    private void a(MediaPlayer mediaPlayer, String str) {
        this.f19582c = mediaPlayer;
        this.f19581b = str;
        this.f19583d = true;
        this.f19582c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.anythink.expressad.foundation.g.j.a.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                synchronized (a.this.f19580a) {
                    try {
                        a.a(a.this);
                        if (a.this.f19585f != null) {
                            a.this.f19585f.onPrepared(mediaPlayer2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        try {
            this.f19582c.prepareAsync();
        } catch (Throwable unused) {
        }
    }

    private boolean b() {
        boolean z3;
        synchronized (this.f19580a) {
            z3 = this.f19584e;
        }
        return z3;
    }

    private boolean a() {
        boolean z3;
        synchronized (this.f19580a) {
            z3 = this.f19583d;
        }
        return z3;
    }

    private void a(MediaPlayer.OnPreparedListener onPreparedListener) {
        synchronized (this.f19580a) {
            this.f19585f = onPreparedListener;
        }
    }
}
