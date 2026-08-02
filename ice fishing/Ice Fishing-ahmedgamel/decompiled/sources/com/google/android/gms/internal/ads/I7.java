package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class I7 extends Q7 {
    public static volatile Long i;

    /* renamed from: k, reason: collision with root package name */
    public static volatile String f26199k;

    /* renamed from: m, reason: collision with root package name */
    public static volatile Long f26201m;

    /* renamed from: o, reason: collision with root package name */
    public static volatile String f26203o;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Long f26205q;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26207h;

    /* renamed from: j, reason: collision with root package name */
    public static final Object f26198j = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f26200l = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f26202n = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f26204p = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final Object f26206r = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I7(C4219y7 c4219y7, String str, String str2, C4002u6 c4002u6, int i4, int i6, int i9) {
        super(c4219y7, str, str2, c4002u6, i4, i6);
        this.f26207h = i9;
    }

    private final void b() {
        C4002u6 c4002u6 = this.f27769d;
        c4002u6.h();
        ((H6) c4002u6.f28504u).H0(-1L);
        c4002u6.h();
        ((H6) c4002u6.f28504u).I0(-1L);
        int[] iArr = (int[]) this.f27770e.invoke(null, this.f27766a.f35881a);
        synchronized (c4002u6) {
            long j6 = iArr[0];
            c4002u6.h();
            ((H6) c4002u6.f28504u).H0(j6);
            long j9 = iArr[1];
            c4002u6.h();
            ((H6) c4002u6.f28504u).I0(j9);
            int i4 = iArr[2];
            if (i4 != Integer.MIN_VALUE) {
                c4002u6.h();
                ((H6) c4002u6.f28504u).Y(i4);
            }
        }
    }

    private final void c() {
        if (f26199k == null) {
            synchronized (f26200l) {
                try {
                    if (f26199k == null) {
                        f26199k = (String) this.f27770e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        C4002u6 c4002u6 = this.f27769d;
        synchronized (c4002u6) {
            String str = f26199k;
            c4002u6.h();
            ((H6) c4002u6.f28504u).g0(str);
        }
    }

    private final void d() {
        if (f26201m == null) {
            synchronized (f26202n) {
                try {
                    if (f26201m == null) {
                        f26201m = (Long) this.f27770e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        C4002u6 c4002u6 = this.f27769d;
        synchronized (c4002u6) {
            long longValue = f26201m.longValue();
            c4002u6.h();
            ((H6) c4002u6.f28504u).Q0(longValue);
        }
    }

    private final void e() {
        C4002u6 c4002u6 = this.f27769d;
        c4002u6.h();
        ((H6) c4002u6.f28504u).E0("E");
        if (f26203o == null) {
            synchronized (f26204p) {
                try {
                    if (f26203o == null) {
                        f26203o = (String) this.f27770e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        C4002u6 c4002u62 = this.f27769d;
        synchronized (c4002u62) {
            String str = f26203o;
            c4002u62.h();
            ((H6) c4002u62.f28504u).E0(str);
        }
    }

    private final void f() {
        Boolean bool = (Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32845L3);
        bool.getClass();
        String str = (String) this.f27770e.invoke(null, this.f27766a.f35881a, bool);
        C3788q7 c3788q7 = new C3788q7(19);
        c3788q7.J = -1L;
        c3788q7.f33982K = -1L;
        HashMap p9 = MA.p(str);
        if (p9 != null) {
            c3788q7.J = ((Long) p9.get(0)).longValue();
            c3788q7.f33982K = ((Long) p9.get(1)).longValue();
        }
        C4002u6 c4002u6 = this.f27769d;
        synchronized (c4002u6) {
            long j6 = c3788q7.J;
            c4002u6.h();
            ((H6) c4002u6.f28504u).G0(j6);
            long j9 = c3788q7.f33982K;
            c4002u6.h();
            ((H6) c4002u6.f28504u).Z(j9);
        }
    }

    private final void g() {
        C4002u6 c4002u6 = this.f27769d;
        synchronized (c4002u6) {
            String str = (String) this.f27770e.invoke(null, new Object[0]);
            C4111w7 c4111w7 = new C4111w7(19);
            HashMap p9 = MA.p(str);
            if (p9 != null) {
                c4111w7.J = (Long) p9.get(0);
                c4111w7.f35569K = (Long) p9.get(1);
            }
            long longValue = c4111w7.J.longValue();
            c4002u6.h();
            ((H6) c4002u6.f28504u).Q(longValue);
            long longValue2 = c4111w7.f35569K.longValue();
            c4002u6.h();
            ((H6) c4002u6.f28504u).R(longValue2);
        }
    }

    private final void h() {
        if (f26205q == null) {
            synchronized (f26206r) {
                try {
                    if (f26205q == null) {
                        f26205q = (Long) this.f27770e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        C4002u6 c4002u6 = this.f27769d;
        synchronized (c4002u6) {
            long longValue = f26205q.longValue();
            c4002u6.h();
            ((H6) c4002u6.f28504u).D(longValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        switch (this.f26207h) {
            case 0:
                if (i == null) {
                    synchronized (f26198j) {
                        try {
                            if (i == null) {
                                i = (Long) this.f27770e.invoke(null, new Object[0]);
                            }
                        } finally {
                        }
                    }
                }
                C4002u6 c4002u6 = this.f27769d;
                synchronized (c4002u6) {
                    long longValue = i.longValue();
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).M(longValue);
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
                String str = (String) this.f27770e.invoke(null, new Object[0]);
                C4002u6 c4002u62 = this.f27769d;
                synchronized (c4002u62) {
                    c4002u62.h();
                    ((H6) c4002u62.f28504u).l0(str);
                }
                return;
            case 6:
                C4002u6 c4002u63 = this.f27769d;
                c4002u63.h();
                ((H6) c4002u63.f28504u).q0(3);
                try {
                    int i4 = 1;
                    if (true == ((Boolean) this.f27770e.invoke(null, this.f27766a.f35881a)).booleanValue()) {
                        i4 = 2;
                    }
                    c4002u63.h();
                    ((H6) c4002u63.f28504u).q0(i4);
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
                int i6 = true == ((Boolean) this.f27770e.invoke(null, this.f27766a.f35881a)).booleanValue() ? 2 : 1;
                C4002u6 c4002u64 = this.f27769d;
                c4002u64.h();
                ((H6) c4002u64.f28504u).t0(i6);
                return;
            case 9:
                C4002u6 c4002u65 = this.f27769d;
                c4002u65.h();
                ((H6) c4002u65.f28504u).K0(-1L);
                long longValue2 = ((Long) this.f27770e.invoke(null, this.f27766a.f35881a)).longValue();
                c4002u65.h();
                ((H6) c4002u65.f28504u).K0(longValue2);
                return;
            case 10:
                f();
                return;
            case 11:
                C4002u6 c4002u66 = this.f27769d;
                try {
                    int i9 = 1;
                    if (true == ((Boolean) this.f27770e.invoke(null, this.f27766a.f35881a)).booleanValue()) {
                        i9 = 2;
                    }
                    c4002u66.h();
                    ((H6) c4002u66.f28504u).s0(i9);
                    return;
                } catch (InvocationTargetException unused) {
                    c4002u66.h();
                    ((H6) c4002u66.f28504u).s0(3);
                    return;
                }
            case 12:
                g();
                return;
            default:
                C4002u6 c4002u67 = this.f27769d;
                c4002u67.m(3);
                boolean booleanValue = ((Boolean) this.f27770e.invoke(null, this.f27766a.f35881a)).booleanValue();
                synchronized (c4002u67) {
                    try {
                        if (booleanValue) {
                            c4002u67.m(2);
                        } else {
                            c4002u67.m(1);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I7(C4219y7 c4219y7, C4002u6 c4002u6, int i4, int i6) {
        super(c4219y7, "c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", c4002u6, i4, 44);
        this.f26207h = i6;
        switch (i6) {
            case 2:
                super(c4219y7, "AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", c4002u6, i4, 22);
                break;
            case 3:
                super(c4219y7, "XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", c4002u6, i4, 1);
                break;
            case 4:
                super(c4219y7, "9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", c4002u6, i4, 33);
                break;
            case 5:
                super(c4219y7, "PmZORt2h3FILlRchj3l8QFpH1b4WBi8LAKFq8qXvSXgGWHByOiAJxaqMK9WTkxzB", "Ox3joL3a7fFzYIlEQut3utwsOQDntBqHwHmTdzF1H8c=", c4002u6, i4, 89);
                break;
            case 6:
                super(c4219y7, "2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", c4002u6, i4, 49);
                break;
            case 7:
                super(c4219y7, "m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", c4002u6, i4, 5);
                break;
            case 8:
            default:
                break;
            case 9:
                super(c4219y7, "P28XMQKwxb7t4RJM54Abd563bFUm9uASQiuwtqttjr6XDpyPt/FmHs2sVrWjtmTo", "fagQaENWAKeTH7PQjt5vlJiCBcOZOOnM19vGSn9sDlA=", c4002u6, i4, 12);
                break;
            case 10:
                super(c4219y7, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", c4002u6, i4, 3);
                break;
            case 11:
                super(c4219y7, "sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", c4002u6, i4, 73);
                break;
            case 12:
                super(c4219y7, "Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", c4002u6, i4, 51);
                break;
            case 13:
                super(c4219y7, "GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", c4002u6, i4, 48);
                break;
        }
    }
}
