package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class H7 extends P7 {
    public static volatile Long i;

    /* renamed from: k, reason: collision with root package name */
    public static volatile String f25305k;

    /* renamed from: m, reason: collision with root package name */
    public static volatile Long f25307m;

    /* renamed from: o, reason: collision with root package name */
    public static volatile String f25309o;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Long f25311q;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25313h;

    /* renamed from: j, reason: collision with root package name */
    public static final Object f25304j = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f25306l = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f25308n = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f25310p = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final Object f25312r = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H7(C4101w7 c4101w7, String str, String str2, C3830r6 c3830r6, int i4, int i9, int i10) {
        super(c4101w7, str, str2, c3830r6, i4, i9);
        this.f25313h = i10;
    }

    private final void b() {
        C3830r6 c3830r6 = this.f26844d;
        c3830r6.h();
        ((D6) c3830r6.f30000u).H0(-1L);
        c3830r6.h();
        ((D6) c3830r6.f30000u).I0(-1L);
        int[] iArr = (int[]) this.f26845e.invoke(null, this.f26841a.f34929a);
        synchronized (c3830r6) {
            long j9 = iArr[0];
            c3830r6.h();
            ((D6) c3830r6.f30000u).H0(j9);
            long j10 = iArr[1];
            c3830r6.h();
            ((D6) c3830r6.f30000u).I0(j10);
            int i4 = iArr[2];
            if (i4 != Integer.MIN_VALUE) {
                c3830r6.h();
                ((D6) c3830r6.f30000u).Y(i4);
            }
        }
    }

    private final void c() {
        if (f25305k == null) {
            synchronized (f25306l) {
                try {
                    if (f25305k == null) {
                        f25305k = (String) this.f26845e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        C3830r6 c3830r6 = this.f26844d;
        synchronized (c3830r6) {
            String str = f25305k;
            c3830r6.h();
            ((D6) c3830r6.f30000u).g0(str);
        }
    }

    private final void d() {
        if (f25307m == null) {
            synchronized (f25308n) {
                try {
                    if (f25307m == null) {
                        f25307m = (Long) this.f26845e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        C3830r6 c3830r6 = this.f26844d;
        synchronized (c3830r6) {
            long longValue = f25307m.longValue();
            c3830r6.h();
            ((D6) c3830r6.f30000u).Q0(longValue);
        }
    }

    private final void e() {
        C3830r6 c3830r6 = this.f26844d;
        c3830r6.h();
        ((D6) c3830r6.f30000u).E0("E");
        if (f25309o == null) {
            synchronized (f25310p) {
                try {
                    if (f25309o == null) {
                        f25309o = (String) this.f26845e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        C3830r6 c3830r62 = this.f26844d;
        synchronized (c3830r62) {
            String str = f25309o;
            c3830r62.h();
            ((D6) c3830r62.f30000u).E0(str);
        }
    }

    private final void f() {
        Boolean bool = (Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31486L3);
        bool.getClass();
        String str = (String) this.f26845e.invoke(null, this.f26841a.f34929a, bool);
        C3670o7 c3670o7 = new C3670o7(19);
        c3670o7.f33102I = -1L;
        c3670o7.J = -1L;
        HashMap o9 = AbstractC2720Pd.o(str);
        if (o9 != null) {
            c3670o7.f33102I = ((Long) o9.get(0)).longValue();
            c3670o7.J = ((Long) o9.get(1)).longValue();
        }
        C3830r6 c3830r6 = this.f26844d;
        synchronized (c3830r6) {
            long j9 = c3670o7.f33102I;
            c3830r6.h();
            ((D6) c3830r6.f30000u).G0(j9);
            long j10 = c3670o7.J;
            c3830r6.h();
            ((D6) c3830r6.f30000u).Z(j10);
        }
    }

    private final void g() {
        C3830r6 c3830r6 = this.f26844d;
        synchronized (c3830r6) {
            String str = (String) this.f26845e.invoke(null, new Object[0]);
            C3939t7 c3939t7 = new C3939t7(19);
            HashMap o9 = AbstractC2720Pd.o(str);
            if (o9 != null) {
                c3939t7.f34365I = (Long) o9.get(0);
                c3939t7.J = (Long) o9.get(1);
            }
            long longValue = c3939t7.f34365I.longValue();
            c3830r6.h();
            ((D6) c3830r6.f30000u).Q(longValue);
            long longValue2 = c3939t7.J.longValue();
            c3830r6.h();
            ((D6) c3830r6.f30000u).R(longValue2);
        }
    }

    private final void h() {
        if (f25311q == null) {
            synchronized (f25312r) {
                try {
                    if (f25311q == null) {
                        f25311q = (Long) this.f26845e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        C3830r6 c3830r6 = this.f26844d;
        synchronized (c3830r6) {
            long longValue = f25311q.longValue();
            c3830r6.h();
            ((D6) c3830r6.f30000u).D(longValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.P7
    public final void a() {
        switch (this.f25313h) {
            case 0:
                if (i == null) {
                    synchronized (f25304j) {
                        try {
                            if (i == null) {
                                i = (Long) this.f26845e.invoke(null, new Object[0]);
                            }
                        } finally {
                        }
                    }
                }
                C3830r6 c3830r6 = this.f26844d;
                synchronized (c3830r6) {
                    long longValue = i.longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).M(longValue);
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
                String str = (String) this.f26845e.invoke(null, new Object[0]);
                C3830r6 c3830r62 = this.f26844d;
                synchronized (c3830r62) {
                    c3830r62.h();
                    ((D6) c3830r62.f30000u).l0(str);
                }
                return;
            case 6:
                C3830r6 c3830r63 = this.f26844d;
                c3830r63.h();
                ((D6) c3830r63.f30000u).q0(3);
                try {
                    int i4 = 1;
                    if (true == ((Boolean) this.f26845e.invoke(null, this.f26841a.f34929a)).booleanValue()) {
                        i4 = 2;
                    }
                    c3830r63.h();
                    ((D6) c3830r63.f30000u).q0(i4);
                    return;
                } catch (InvocationTargetException e6) {
                    if (!(e6.getTargetException() instanceof Settings.SettingNotFoundException)) {
                        throw e6;
                    }
                    return;
                }
            case 7:
                b();
                return;
            case 8:
                int i9 = true == ((Boolean) this.f26845e.invoke(null, this.f26841a.f34929a)).booleanValue() ? 2 : 1;
                C3830r6 c3830r64 = this.f26844d;
                c3830r64.h();
                ((D6) c3830r64.f30000u).t0(i9);
                return;
            case 9:
                C3830r6 c3830r65 = this.f26844d;
                c3830r65.h();
                ((D6) c3830r65.f30000u).K0(-1L);
                long longValue2 = ((Long) this.f26845e.invoke(null, this.f26841a.f34929a)).longValue();
                c3830r65.h();
                ((D6) c3830r65.f30000u).K0(longValue2);
                return;
            case 10:
                f();
                return;
            case 11:
                C3830r6 c3830r66 = this.f26844d;
                try {
                    int i10 = 1;
                    if (true == ((Boolean) this.f26845e.invoke(null, this.f26841a.f34929a)).booleanValue()) {
                        i10 = 2;
                    }
                    c3830r66.h();
                    ((D6) c3830r66.f30000u).s0(i10);
                    return;
                } catch (InvocationTargetException unused) {
                    c3830r66.h();
                    ((D6) c3830r66.f30000u).s0(3);
                    return;
                }
            case 12:
                g();
                return;
            default:
                C3830r6 c3830r67 = this.f26844d;
                c3830r67.m(3);
                boolean booleanValue = ((Boolean) this.f26845e.invoke(null, this.f26841a.f34929a)).booleanValue();
                synchronized (c3830r67) {
                    try {
                        if (booleanValue) {
                            c3830r67.m(2);
                        } else {
                            c3830r67.m(1);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(C4101w7 c4101w7, C3830r6 c3830r6, int i4, int i9) {
        super(c4101w7, "c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", c3830r6, i4, 44);
        this.f25313h = i9;
        switch (i9) {
            case 2:
                super(c4101w7, "AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", c3830r6, i4, 22);
                break;
            case 3:
                super(c4101w7, "XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", c3830r6, i4, 1);
                break;
            case 4:
                super(c4101w7, "9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", c3830r6, i4, 33);
                break;
            case 5:
                super(c4101w7, "PmZORt2h3FILlRchj3l8QFpH1b4WBi8LAKFq8qXvSXgGWHByOiAJxaqMK9WTkxzB", "Ox3joL3a7fFzYIlEQut3utwsOQDntBqHwHmTdzF1H8c=", c3830r6, i4, 89);
                break;
            case 6:
                super(c4101w7, "2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", c3830r6, i4, 49);
                break;
            case 7:
                super(c4101w7, "m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", c3830r6, i4, 5);
                break;
            case 8:
            default:
                break;
            case 9:
                super(c4101w7, "P28XMQKwxb7t4RJM54Abd563bFUm9uASQiuwtqttjr6XDpyPt/FmHs2sVrWjtmTo", "fagQaENWAKeTH7PQjt5vlJiCBcOZOOnM19vGSn9sDlA=", c3830r6, i4, 12);
                break;
            case 10:
                super(c4101w7, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", c3830r6, i4, 3);
                break;
            case 11:
                super(c4101w7, "sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", c3830r6, i4, 73);
                break;
            case 12:
                super(c4101w7, "Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", c3830r6, i4, 51);
                break;
            case 13:
                super(c4101w7, "GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", c3830r6, i4, 48);
                break;
        }
    }
}
