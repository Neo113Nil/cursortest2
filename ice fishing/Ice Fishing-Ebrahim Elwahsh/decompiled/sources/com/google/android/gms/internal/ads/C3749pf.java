package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.pf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3749pf {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3404jB f33418a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f33419b;

    /* renamed from: c, reason: collision with root package name */
    public C3365iO f33420c;

    /* renamed from: d, reason: collision with root package name */
    public C2777Sj f33421d;

    /* renamed from: f, reason: collision with root package name */
    public int f33423f;

    /* renamed from: h, reason: collision with root package name */
    public C3750pg f33425h;

    /* renamed from: g, reason: collision with root package name */
    public float f33424g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f33422e = 0;

    public C3749pf(Context context, Looper looper, C3365iO c3365iO) {
        this.f33418a = AbstractC3035cL.e(new C2602Ie(context, 0));
        this.f33420c = c3365iO;
        this.f33419b = new Handler(looper);
    }

    public final void a(C2777Sj c2777Sj) {
        if (Objects.equals(this.f33421d, c2777Sj)) {
            return;
        }
        this.f33421d = c2777Sj;
        this.f33423f = c2777Sj == null ? 0 : 1;
    }

    public final int b(int i, boolean z8) {
        int volumeControlStream;
        int requestAudioFocus;
        if (i == 1 || this.f33423f != 1) {
            d();
            e(0);
            return 1;
        }
        int i4 = 3;
        if (!z8) {
            int i9 = this.f33422e;
            if (i9 == 1) {
                return -1;
            }
            if (i9 == 3) {
                return 0;
            }
        } else if (this.f33422e != 2) {
            if (this.f33425h == null) {
                C2777Sj c2777Sj = C2777Sj.f27609b;
                C2777Sj c2777Sj2 = this.f33421d;
                c2777Sj2.getClass();
                C4125we c4125we = new C4125we(this);
                Handler handler = this.f33419b;
                handler.getClass();
                this.f33425h = new C3750pg(c4125we, handler, c2777Sj2);
            }
            AudioManager audioManager = (AudioManager) this.f33418a.a();
            C3750pg c3750pg = this.f33425h;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                Object obj = c3750pg.f33429d;
                obj.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(com.anythink.basead.exoplayer.k.A.m(obj));
            } else {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = c3750pg.f33426a;
                C2777Sj c2777Sj3 = c3750pg.f33428c;
                if (i10 >= 26) {
                    try {
                        volumeControlStream = c2777Sj3.a().getVolumeControlStream();
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
        this.f33420c = null;
        d();
        e(0);
    }

    public final void d() {
        int i = this.f33422e;
        if (i == 1 || i == 0 || this.f33425h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f33418a.a();
        C3750pg c3750pg = this.f33425h;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(c3750pg.f33426a);
            return;
        }
        Object obj = c3750pg.f33429d;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(com.anythink.basead.exoplayer.k.A.m(obj));
    }

    public final void e(int i) {
        if (this.f33422e == i) {
            return;
        }
        this.f33422e = i;
        float f6 = i == 4 ? 0.2f : 1.0f;
        if (this.f33424g != f6) {
            this.f33424g = f6;
            C3365iO c3365iO = this.f33420c;
            if (c3365iO != null) {
                c3365iO.f31382z.c(34);
            }
        }
    }

    public final void f(int i) {
        C3365iO c3365iO = this.f33420c;
        if (c3365iO != null) {
            C3709ot c3709ot = c3365iO.f31382z;
            c3709ot.getClass();
            C3333ht g9 = C3709ot.g();
            g9.f31278a = c3709ot.f33230a.obtainMessage(33, i, 0);
            g9.a();
        }
    }
}
