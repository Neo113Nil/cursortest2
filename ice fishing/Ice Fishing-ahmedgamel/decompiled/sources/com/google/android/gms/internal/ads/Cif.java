package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.if, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cif {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3254gB f31832a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f31833b;

    /* renamed from: c, reason: collision with root package name */
    public VN f31834c;

    /* renamed from: d, reason: collision with root package name */
    public C2764Qj f31835d;

    /* renamed from: f, reason: collision with root package name */
    public int f31837f;

    /* renamed from: h, reason: collision with root package name */
    public C3760pg f31839h;

    /* renamed from: g, reason: collision with root package name */
    public float f31838g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f31836e = 0;

    public Cif(Context context, Looper looper, VN vn) {
        this.f31832a = AbstractC3066cl.e(new C2572Fe(context, 0));
        this.f31834c = vn;
        this.f31833b = new Handler(looper);
    }

    public final void a(C2764Qj c2764Qj) {
        if (Objects.equals(this.f31835d, c2764Qj)) {
            return;
        }
        this.f31835d = c2764Qj;
        this.f31837f = c2764Qj == null ? 0 : 1;
    }

    public final int b(int i, boolean z6) {
        int volumeControlStream;
        int requestAudioFocus;
        if (i == 1 || this.f31837f != 1) {
            d();
            e(0);
            return 1;
        }
        int i4 = 3;
        if (!z6) {
            int i6 = this.f31836e;
            if (i6 == 1) {
                return -1;
            }
            if (i6 == 3) {
                return 0;
            }
        } else if (this.f31836e != 2) {
            if (this.f31839h == null) {
                C2764Qj c2764Qj = C2764Qj.f27843b;
                C2764Qj c2764Qj2 = this.f31835d;
                c2764Qj2.getClass();
                C3919se c3919se = new C3919se(this);
                Handler handler = this.f31833b;
                handler.getClass();
                this.f31839h = new C3760pg(c3919se, handler, c2764Qj2);
            }
            AudioManager audioManager = (AudioManager) this.f31832a.mo14c();
            C3760pg c3760pg = this.f31839h;
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 26) {
                Object obj = c3760pg.f33866d;
                obj.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(com.anythink.core.common.n.b.B.l(obj));
            } else {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = c3760pg.f33863a;
                C2764Qj c2764Qj3 = c3760pg.f33865c;
                if (i9 >= 26) {
                    try {
                        volumeControlStream = c2764Qj3.a().getVolumeControlStream();
                        if (volumeControlStream != Integer.MIN_VALUE) {
                            i4 = volumeControlStream;
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                requestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener, i4, 1);
            }
            if (requestAudioFocus == 1 || requestAudioFocus == 2) {
                e(2);
                return 1;
            }
            e(1);
            return -1;
        }
        return 1;
    }

    public final void c() {
        this.f31834c = null;
        d();
        e(0);
    }

    public final void d() {
        int i = this.f31836e;
        if (i == 1 || i == 0 || this.f31839h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f31832a.mo14c();
        C3760pg c3760pg = this.f31839h;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(c3760pg.f33863a);
            return;
        }
        Object obj = c3760pg.f33866d;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(com.anythink.core.common.n.b.B.l(obj));
    }

    public final void e(int i) {
        if (this.f31836e == i) {
            return;
        }
        this.f31836e = i;
        float f2 = i == 4 ? 0.2f : 1.0f;
        if (this.f31838g != f2) {
            this.f31838g = f2;
            VN vn = this.f31834c;
            if (vn != null) {
                vn.f28985z.c(34);
            }
        }
    }

    public final void f(int i) {
        VN vn = this.f31834c;
        if (vn != null) {
            C3235ft c3235ft = vn.f28985z;
            c3235ft.getClass();
            C3127dt g9 = C3235ft.g();
            g9.f30645a = c3235ft.f31231a.obtainMessage(33, i, 0);
            g9.a();
        }
    }
}
