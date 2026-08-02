package com.anythink.expressad.foundation.g.j;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private String f20368b;

    /* renamed from: c, reason: collision with root package name */
    private MediaPlayer f20369c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f20370d;

    /* renamed from: f, reason: collision with root package name */
    private volatile MediaPlayer.OnPreparedListener f20372f;

    /* renamed from: a, reason: collision with root package name */
    Object f20367a = new Object();

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f20371e = false;

    public static /* synthetic */ boolean a(a aVar) {
        aVar.f20371e = true;
        return true;
    }

    private String c() {
        return this.f20368b;
    }

    private MediaPlayer d() {
        return this.f20369c;
    }

    private void a(MediaPlayer mediaPlayer, String str) {
        this.f20369c = mediaPlayer;
        this.f20368b = str;
        this.f20370d = true;
        this.f20369c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.anythink.expressad.foundation.g.j.a.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                synchronized (a.this.f20367a) {
                    try {
                        a.a(a.this);
                        if (a.this.f20372f != null) {
                            a.this.f20372f.onPrepared(mediaPlayer2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        try {
            this.f20369c.prepareAsync();
        } catch (Throwable unused) {
        }
    }

    private boolean b() {
        boolean z6;
        synchronized (this.f20367a) {
            z6 = this.f20371e;
        }
        return z6;
    }

    private boolean a() {
        boolean z6;
        synchronized (this.f20367a) {
            z6 = this.f20370d;
        }
        return z6;
    }

    private void a(MediaPlayer.OnPreparedListener onPreparedListener) {
        synchronized (this.f20367a) {
            this.f20372f = onPreparedListener;
        }
    }
}
