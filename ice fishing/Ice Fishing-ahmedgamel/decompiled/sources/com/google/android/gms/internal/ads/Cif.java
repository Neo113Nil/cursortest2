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
    public final InterfaceC3231gB f31061a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f31062b;

    /* renamed from: c, reason: collision with root package name */
    public VN f31063c;

    /* renamed from: d, reason: collision with root package name */
    public C2744Qj f31064d;

    /* renamed from: f, reason: collision with root package name */
    public int f31066f;

    /* renamed from: h, reason: collision with root package name */
    public C3737pg f31068h;

    /* renamed from: g, reason: collision with root package name */
    public float f31067g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f31065e = 0;

    public Cif(Context context, Looper looper, VN vn) {
        this.f31061a = AbstractC3043cl.e(new C2552Fe(context, 0));
        this.f31063c = vn;
        this.f31062b = new Handler(looper);
    }

    public final void a(C2744Qj c2744Qj) {
        if (Objects.equals(this.f31064d, c2744Qj)) {
            return;
        }
        this.f31064d = c2744Qj;
        this.f31066f = c2744Qj == null ? 0 : 1;
    }

    public final int b(int i, boolean z3) {
        int volumeControlStream;
        int requestAudioFocus;
        if (i == 1 || this.f31066f != 1) {
            d();
            e(0);
            return 1;
        }
        int i6 = 3;
        if (!z3) {
            int i9 = this.f31065e;
            if (i9 == 1) {
                return -1;
            }
            if (i9 == 3) {
                return 0;
            }
        } else if (this.f31065e != 2) {
            if (this.f31068h == null) {
                C2744Qj c2744Qj = C2744Qj.f27058b;
                C2744Qj c2744Qj2 = this.f31064d;
                c2744Qj2.getClass();
                C3896se c3896se = new C3896se(this);
                Handler handler = this.f31062b;
                handler.getClass();
                this.f31068h = new C3737pg(c3896se, handler, c2744Qj2);
            }
            AudioManager audioManager = (AudioManager) this.f31061a.mo15c();
            C3737pg c3737pg = this.f31068h;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                Object obj = c3737pg.f33076d;
                obj.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(com.anythink.core.common.n.b.A.l(obj));
            } else {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = c3737pg.f33073a;
                C2744Qj c2744Qj3 = c3737pg.f33075c;
                if (i10 >= 26) {
                    try {
                        volumeControlStream = c2744Qj3.a().getVolumeControlStream();
                        if (volumeControlStream != Integer.MIN_VALUE) {
                            i6 = volumeControlStream;
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                requestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener, i6, 1);
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
        this.f31063c = null;
        d();
        e(0);
    }

    public final void d() {
        int i = this.f31065e;
        if (i == 1 || i == 0 || this.f31068h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f31061a.mo15c();
        C3737pg c3737pg = this.f31068h;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(c3737pg.f33073a);
            return;
        }
        Object obj = c3737pg.f33076d;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(com.anythink.core.common.n.b.A.l(obj));
    }

    public final void e(int i) {
        if (this.f31065e == i) {
            return;
        }
        this.f31065e = i;
        float f3 = i == 4 ? 0.2f : 1.0f;
        if (this.f31067g != f3) {
            this.f31067g = f3;
            VN vn = this.f31063c;
            if (vn != null) {
                vn.f28189z.c(34);
            }
        }
    }

    public final void f(int i) {
        VN vn = this.f31063c;
        if (vn != null) {
            C3212ft c3212ft = vn.f28189z;
            c3212ft.getClass();
            C3104dt g4 = C3212ft.g();
            g4.f29857a = c3212ft.f30468a.obtainMessage(33, i, 0);
            g4.a();
        }
    }
}
