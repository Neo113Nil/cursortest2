package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3355i4 implements InterfaceC3407j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31768a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31769b;

    /* renamed from: c, reason: collision with root package name */
    public long f31770c;

    /* renamed from: d, reason: collision with root package name */
    public int f31771d;

    /* renamed from: e, reason: collision with root package name */
    public int f31772e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f31773f;

    /* renamed from: g, reason: collision with root package name */
    public Object f31774g;

    public C3355i4() {
        this.f31768a = 1;
        this.f31773f = new Cr(10);
        this.f31770c = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void a(S0 s02, F4 f42) {
        switch (this.f31768a) {
            case 0:
                int i = 0;
                while (true) {
                    InterfaceC3566m1[] interfaceC3566m1Arr = (InterfaceC3566m1[]) this.f31774g;
                    if (i >= interfaceC3566m1Arr.length) {
                        break;
                    } else {
                        E4 e42 = (E4) ((List) this.f31773f).get(i);
                        f42.a();
                        f42.b();
                        InterfaceC3566m1 C8 = s02.C(f42.f25501d, 3);
                        C3322hP c3322hP = new C3322hP();
                        f42.b();
                        c3322hP.f31546a = f42.f25502e;
                        c3322hP.d("video/mp2t");
                        c3322hP.e(com.anythink.basead.exoplayer.k.o.aj);
                        c3322hP.f31561q = Collections.singletonList(e42.f25300b);
                        c3322hP.f31549d = e42.f25299a;
                        C8.e(new DP(c3322hP));
                        interfaceC3566m1Arr[i] = C8;
                        i++;
                    }
                }
            default:
                f42.a();
                f42.b();
                InterfaceC3566m1 C9 = s02.C(f42.f25501d, 5);
                this.f31774g = C9;
                C3322hP c3322hP2 = new C3322hP();
                f42.b();
                c3322hP2.f31546a = f42.f25502e;
                c3322hP2.d("video/mp2t");
                c3322hP2.e(com.anythink.basead.exoplayer.k.o.f9226V);
                C9.e(new DP(c3322hP2));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void b(Cr cr) {
        boolean z6;
        boolean z9;
        switch (this.f31768a) {
            case 0:
                if (this.f31769b) {
                    int i = 0;
                    if (this.f31771d == 2) {
                        if (cr.B() == 0) {
                            z9 = false;
                        } else {
                            if (cr.K() != 32) {
                                this.f31769b = false;
                            }
                            this.f31771d--;
                            z9 = this.f31769b;
                        }
                        if (!z9) {
                        }
                    }
                    if (this.f31771d == 1) {
                        if (cr.B() == 0) {
                            z6 = false;
                        } else {
                            if (cr.K() != 0) {
                                this.f31769b = false;
                            }
                            this.f31771d--;
                            z6 = this.f31769b;
                        }
                        if (!z6) {
                        }
                    }
                    int i4 = cr.f24998b;
                    int B3 = cr.B();
                    while (true) {
                        InterfaceC3566m1[] interfaceC3566m1Arr = (InterfaceC3566m1[]) this.f31774g;
                        if (i >= interfaceC3566m1Arr.length) {
                            this.f31772e += B3;
                            break;
                        } else {
                            InterfaceC3566m1 interfaceC3566m1 = interfaceC3566m1Arr[i];
                            cr.E(i4);
                            interfaceC3566m1.a(B3, cr);
                            i++;
                        }
                    }
                }
                break;
            default:
                ((InterfaceC3566m1) this.f31774g).getClass();
                if (this.f31769b) {
                    int B9 = cr.B();
                    int i6 = this.f31772e;
                    if (i6 < 10) {
                        int min = Math.min(B9, 10 - i6);
                        byte[] bArr = cr.f24997a;
                        int i9 = cr.f24998b;
                        Cr cr2 = (Cr) this.f31773f;
                        System.arraycopy(bArr, i9, cr2.f24997a, this.f31772e, min);
                        if (this.f31772e + min == 10) {
                            cr2.E(0);
                            if (cr2.K() != 73 || cr2.K() != 68 || cr2.K() != 51) {
                                AbstractC2991bG.y("Id3Reader", "Discarding invalid ID3 tag");
                                this.f31769b = false;
                                break;
                            } else {
                                cr2.G(3);
                                this.f31771d = cr2.g() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(B9, this.f31771d - this.f31772e);
                    ((InterfaceC3566m1) this.f31774g).a(min2, cr);
                    this.f31772e += min2;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void c() {
        switch (this.f31768a) {
            case 0:
                this.f31769b = false;
                this.f31770c = com.anythink.basead.exoplayer.b.f7168b;
                break;
            default:
                this.f31769b = false;
                this.f31770c = com.anythink.basead.exoplayer.b.f7168b;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void d(int i, long j6) {
        switch (this.f31768a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f31769b = true;
                    this.f31770c = j6;
                    this.f31772e = 0;
                    this.f31771d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f31769b = true;
                    this.f31770c = j6;
                    this.f31771d = 0;
                    this.f31772e = 0;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void e() {
        int i;
        switch (this.f31768a) {
            case 0:
                if (this.f31769b) {
                    AbstractC2792Sd.H(this.f31770c != com.anythink.basead.exoplayer.b.f7168b);
                    int i4 = 0;
                    while (true) {
                        InterfaceC3566m1[] interfaceC3566m1Arr = (InterfaceC3566m1[]) this.f31774g;
                        if (i4 >= interfaceC3566m1Arr.length) {
                            this.f31769b = false;
                            break;
                        } else {
                            interfaceC3566m1Arr[i4].c(this.f31770c, 1, this.f31772e, 0, null);
                            i4++;
                        }
                    }
                }
                break;
            default:
                ((InterfaceC3566m1) this.f31774g).getClass();
                if (this.f31769b && (i = this.f31771d) != 0 && this.f31772e == i) {
                    AbstractC2792Sd.H(this.f31770c != com.anythink.basead.exoplayer.b.f7168b);
                    ((InterfaceC3566m1) this.f31774g).c(this.f31770c, 1, this.f31771d, 0, null);
                    this.f31769b = false;
                    break;
                }
                break;
        }
    }

    public C3355i4(List list) {
        this.f31768a = 0;
        this.f31773f = list;
        this.f31774g = new InterfaceC3566m1[list.size()];
        this.f31770c = com.anythink.basead.exoplayer.b.f7168b;
    }
}
