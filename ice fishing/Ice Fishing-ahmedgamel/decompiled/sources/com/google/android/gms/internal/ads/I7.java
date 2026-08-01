package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class I7 extends Q7 {
    public static volatile Long i;

    /* renamed from: k, reason: collision with root package name */
    public static volatile String f25456k;

    /* renamed from: m, reason: collision with root package name */
    public static volatile Long f25458m;

    /* renamed from: o, reason: collision with root package name */
    public static volatile String f25460o;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Long f25462q;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25464h;

    /* renamed from: j, reason: collision with root package name */
    public static final Object f25455j = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f25457l = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f25459n = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f25461p = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final Object f25463r = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I7(C4196y7 c4196y7, String str, String str2, C3979u6 c3979u6, int i6, int i9, int i10) {
        super(c4196y7, str, str2, c3979u6, i6, i9);
        this.f25464h = i10;
    }

    private final void b() {
        C3979u6 c3979u6 = this.f26982d;
        c3979u6.h();
        ((H6) c3979u6.f27721u).H0(-1L);
        c3979u6.h();
        ((H6) c3979u6.f27721u).I0(-1L);
        int[] iArr = (int[]) this.f26983e.invoke(null, this.f26979a.f35095a);
        synchronized (c3979u6) {
            long j6 = iArr[0];
            c3979u6.h();
            ((H6) c3979u6.f27721u).H0(j6);
            long j9 = iArr[1];
            c3979u6.h();
            ((H6) c3979u6.f27721u).I0(j9);
            int i6 = iArr[2];
            if (i6 != Integer.MIN_VALUE) {
                c3979u6.h();
                ((H6) c3979u6.f27721u).Y(i6);
            }
        }
    }

    private final void c() {
        if (f25456k == null) {
            synchronized (f25457l) {
                try {
                    if (f25456k == null) {
                        f25456k = (String) this.f26983e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        C3979u6 c3979u6 = this.f26982d;
        synchronized (c3979u6) {
            String str = f25456k;
            c3979u6.h();
            ((H6) c3979u6.f27721u).g0(str);
        }
    }

    private final void d() {
        if (f25458m == null) {
            synchronized (f25459n) {
                try {
                    if (f25458m == null) {
                        f25458m = (Long) this.f26983e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        C3979u6 c3979u6 = this.f26982d;
        synchronized (c3979u6) {
            long longValue = f25458m.longValue();
            c3979u6.h();
            ((H6) c3979u6.f27721u).Q0(longValue);
        }
    }

    private final void e() {
        C3979u6 c3979u6 = this.f26982d;
        c3979u6.h();
        ((H6) c3979u6.f27721u).E0("E");
        if (f25460o == null) {
            synchronized (f25461p) {
                try {
                    if (f25460o == null) {
                        f25460o = (String) this.f26983e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        C3979u6 c3979u62 = this.f26982d;
        synchronized (c3979u62) {
            String str = f25460o;
            c3979u62.h();
            ((H6) c3979u62.f27721u).E0(str);
        }
    }

    private final void f() {
        Boolean bool = (Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32066L3);
        bool.getClass();
        String str = (String) this.f26983e.invoke(null, this.f26979a.f35095a, bool);
        C3765q7 c3765q7 = new C3765q7(19);
        c3765q7.J = -1L;
        c3765q7.f33198K = -1L;
        HashMap p9 = MA.p(str);
        if (p9 != null) {
            c3765q7.J = ((Long) p9.get(0)).longValue();
            c3765q7.f33198K = ((Long) p9.get(1)).longValue();
        }
        C3979u6 c3979u6 = this.f26982d;
        synchronized (c3979u6) {
            long j6 = c3765q7.J;
            c3979u6.h();
            ((H6) c3979u6.f27721u).G0(j6);
            long j9 = c3765q7.f33198K;
            c3979u6.h();
            ((H6) c3979u6.f27721u).Z(j9);
        }
    }

    private final void g() {
        C3979u6 c3979u6 = this.f26982d;
        synchronized (c3979u6) {
            String str = (String) this.f26983e.invoke(null, new Object[0]);
            C4088w7 c4088w7 = new C4088w7(19);
            HashMap p9 = MA.p(str);
            if (p9 != null) {
                c4088w7.J = (Long) p9.get(0);
                c4088w7.f34800K = (Long) p9.get(1);
            }
            long longValue = c4088w7.J.longValue();
            c3979u6.h();
            ((H6) c3979u6.f27721u).Q(longValue);
            long longValue2 = c4088w7.f34800K.longValue();
            c3979u6.h();
            ((H6) c3979u6.f27721u).R(longValue2);
        }
    }

    private final void h() {
        if (f25462q == null) {
            synchronized (f25463r) {
                try {
                    if (f25462q == null) {
                        f25462q = (Long) this.f26983e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        C3979u6 c3979u6 = this.f26982d;
        synchronized (c3979u6) {
            long longValue = f25462q.longValue();
            c3979u6.h();
            ((H6) c3979u6.f27721u).D(longValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        switch (this.f25464h) {
            case 0:
                if (i == null) {
                    synchronized (f25455j) {
                        try {
                            if (i == null) {
                                i = (Long) this.f26983e.invoke(null, new Object[0]);
                            }
                        } finally {
                        }
                    }
                }
                C3979u6 c3979u6 = this.f26982d;
                synchronized (c3979u6) {
                    long longValue = i.longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).M(longValue);
                }
                return;
            case 1:
                c();
                return;
            case 2:
                d();
                return;
            case 3:
                e();
                return;
            case 4:
                h();
                return;
            case 5:
                String str = (String) this.f26983e.invoke(null, new Object[0]);
                C3979u6 c3979u62 = this.f26982d;
                synchronized (c3979u62) {
                    c3979u62.h();
                    ((H6) c3979u62.f27721u).l0(str);
                }
                return;
            case 6:
                C3979u6 c3979u63 = this.f26982d;
                c3979u63.h();
                ((H6) c3979u63.f27721u).q0(3);
                try {
                    int i6 = 1;
                    if (true == ((Boolean) this.f26983e.invoke(null, this.f26979a.f35095a)).booleanValue()) {
                        i6 = 2;
                    }
                    c3979u63.h();
                    ((H6) c3979u63.f27721u).q0(i6);
                    return;
                } catch (InvocationTargetException e9) {
                    if (!(e9.getTargetException() instanceof Settings.SettingNotFoundException)) {
                        throw e9;
                    }
                    return;
                }
            case 7:
                b();
                return;
            case 8:
                int i9 = true == ((Boolean) this.f26983e.invoke(null, this.f26979a.f35095a)).booleanValue() ? 2 : 1;
                C3979u6 c3979u64 = this.f26982d;
                c3979u64.h();
                ((H6) c3979u64.f27721u).t0(i9);
                return;
            case 9:
                C3979u6 c3979u65 = this.f26982d;
                c3979u65.h();
                ((H6) c3979u65.f27721u).K0(-1L);
                long longValue2 = ((Long) this.f26983e.invoke(null, this.f26979a.f35095a)).longValue();
                c3979u65.h();
                ((H6) c3979u65.f27721u).K0(longValue2);
                return;
            case 10:
                f();
                return;
            case 11:
                C3979u6 c3979u66 = this.f26982d;
                try {
                    int i10 = 1;
                    if (true == ((Boolean) this.f26983e.invoke(null, this.f26979a.f35095a)).booleanValue()) {
                        i10 = 2;
                    }
                    c3979u66.h();
                    ((H6) c3979u66.f27721u).s0(i10);
                    return;
                } catch (InvocationTargetException unused) {
                    c3979u66.h();
                    ((H6) c3979u66.f27721u).s0(3);
                    return;
                }
            case 12:
                g();
                return;
            default:
                C3979u6 c3979u67 = this.f26982d;
                c3979u67.m(3);
                boolean booleanValue = ((Boolean) this.f26983e.invoke(null, this.f26979a.f35095a)).booleanValue();
                synchronized (c3979u67) {
                    try {
                        if (booleanValue) {
                            c3979u67.m(2);
                        } else {
                            c3979u67.m(1);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I7(C4196y7 c4196y7, C3979u6 c3979u6, int i6, int i9) {
        super(c4196y7, "c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", c3979u6, i6, 44);
        this.f25464h = i9;
        switch (i9) {
            case 2:
                super(c4196y7, "AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", c3979u6, i6, 22);
                break;
            case 3:
                super(c4196y7, "XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", c3979u6, i6, 1);
                break;
            case 4:
                super(c4196y7, "9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", c3979u6, i6, 33);
                break;
            case 5:
                super(c4196y7, "PmZORt2h3FILlRchj3l8QFpH1b4WBi8LAKFq8qXvSXgGWHByOiAJxaqMK9WTkxzB", "Ox3joL3a7fFzYIlEQut3utwsOQDntBqHwHmTdzF1H8c=", c3979u6, i6, 89);
                break;
            case 6:
                super(c4196y7, "2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", c3979u6, i6, 49);
                break;
            case 7:
                super(c4196y7, "m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", c3979u6, i6, 5);
                break;
            case 8:
            default:
                break;
            case 9:
                super(c4196y7, "P28XMQKwxb7t4RJM54Abd563bFUm9uASQiuwtqttjr6XDpyPt/FmHs2sVrWjtmTo", "fagQaENWAKeTH7PQjt5vlJiCBcOZOOnM19vGSn9sDlA=", c3979u6, i6, 12);
                break;
            case 10:
                super(c4196y7, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", c3979u6, i6, 3);
                break;
            case 11:
                super(c4196y7, "sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", c3979u6, i6, 73);
                break;
            case 12:
                super(c4196y7, "Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", c3979u6, i6, 51);
                break;
            case 13:
                super(c4196y7, "GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", c3979u6, i6, 48);
                break;
        }
    }
}
