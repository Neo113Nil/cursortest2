package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3332i4 implements InterfaceC3384j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30995a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30996b;

    /* renamed from: c, reason: collision with root package name */
    public long f30997c;

    /* renamed from: d, reason: collision with root package name */
    public int f30998d;

    /* renamed from: e, reason: collision with root package name */
    public int f30999e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f31000f;

    /* renamed from: g, reason: collision with root package name */
    public Object f31001g;

    public C3332i4() {
        this.f30995a = 1;
        this.f31000f = new Cr(10);
        this.f30997c = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void a(S0 s02, F4 f42) {
        switch (this.f30995a) {
            case 0:
                int i = 0;
                while (true) {
                    InterfaceC3543m1[] interfaceC3543m1Arr = (InterfaceC3543m1[]) this.f31001g;
                    if (i >= interfaceC3543m1Arr.length) {
                        break;
                    } else {
                        E4 e42 = (E4) ((List) this.f31000f).get(i);
                        f42.a();
                        f42.b();
                        InterfaceC3543m1 C8 = s02.C(f42.f24745d, 3);
                        C3299hP c3299hP = new C3299hP();
                        f42.b();
                        c3299hP.f30780a = f42.f24746e;
                        c3299hP.d("video/mp2t");
                        c3299hP.e(com.anythink.basead.exoplayer.k.o.aj);
                        c3299hP.f30795q = Collections.singletonList(e42.f24539b);
                        c3299hP.f30783d = e42.f24538a;
                        C8.e(new DP(c3299hP));
                        interfaceC3543m1Arr[i] = C8;
                        i++;
                    }
                }
            default:
                f42.a();
                f42.b();
                InterfaceC3543m1 C9 = s02.C(f42.f24745d, 5);
                this.f31001g = C9;
                C3299hP c3299hP2 = new C3299hP();
                f42.b();
                c3299hP2.f30780a = f42.f24746e;
                c3299hP2.d("video/mp2t");
                c3299hP2.e(com.anythink.basead.exoplayer.k.o.f8440V);
                C9.e(new DP(c3299hP2));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void b(Cr cr) {
        boolean z3;
        boolean z6;
        switch (this.f30995a) {
            case 0:
                if (this.f30996b) {
                    int i = 0;
                    if (this.f30998d == 2) {
                        if (cr.B() == 0) {
                            z6 = false;
                        } else {
                            if (cr.K() != 32) {
                                this.f30996b = false;
                            }
                            this.f30998d--;
                            z6 = this.f30996b;
                        }
                        if (!z6) {
                        }
                    }
                    if (this.f30998d == 1) {
                        if (cr.B() == 0) {
                            z3 = false;
                        } else {
                            if (cr.K() != 0) {
                                this.f30996b = false;
                            }
                            this.f30998d--;
                            z3 = this.f30996b;
                        }
                        if (!z3) {
                        }
                    }
                    int i6 = cr.f24253b;
                    int B9 = cr.B();
                    while (true) {
                        InterfaceC3543m1[] interfaceC3543m1Arr = (InterfaceC3543m1[]) this.f31001g;
                        if (i >= interfaceC3543m1Arr.length) {
                            this.f30999e += B9;
                            break;
                        } else {
                            InterfaceC3543m1 interfaceC3543m1 = interfaceC3543m1Arr[i];
                            cr.E(i6);
                            interfaceC3543m1.a(B9, cr);
                            i++;
                        }
                    }
                }
                break;
            default:
                ((InterfaceC3543m1) this.f31001g).getClass();
                if (this.f30996b) {
                    int B10 = cr.B();
                    int i9 = this.f30999e;
                    if (i9 < 10) {
                        int min = Math.min(B10, 10 - i9);
                        byte[] bArr = cr.f24252a;
                        int i10 = cr.f24253b;
                        Cr cr2 = (Cr) this.f31000f;
                        System.arraycopy(bArr, i10, cr2.f24252a, this.f30999e, min);
                        if (this.f30999e + min == 10) {
                            cr2.E(0);
                            if (cr2.K() != 73 || cr2.K() != 68 || cr2.K() != 51) {
                                AbstractC2968bG.y("Id3Reader", "Discarding invalid ID3 tag");
                                this.f30996b = false;
                                break;
                            } else {
                                cr2.G(3);
                                this.f30998d = cr2.g() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(B10, this.f30998d - this.f30999e);
                    ((InterfaceC3543m1) this.f31001g).a(min2, cr);
                    this.f30999e += min2;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void c() {
        switch (this.f30995a) {
            case 0:
                this.f30996b = false;
                this.f30997c = com.anythink.basead.exoplayer.b.f6382b;
                break;
            default:
                this.f30996b = false;
                this.f30997c = com.anythink.basead.exoplayer.b.f6382b;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void d(int i, long j6) {
        switch (this.f30995a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f30996b = true;
                    this.f30997c = j6;
                    this.f30999e = 0;
                    this.f30998d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f30996b = true;
                    this.f30997c = j6;
                    this.f30998d = 0;
                    this.f30999e = 0;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void e() {
        int i;
        switch (this.f30995a) {
            case 0:
                if (this.f30996b) {
                    AbstractC2772Sd.H(this.f30997c != com.anythink.basead.exoplayer.b.f6382b);
                    int i6 = 0;
                    while (true) {
                        InterfaceC3543m1[] interfaceC3543m1Arr = (InterfaceC3543m1[]) this.f31001g;
                        if (i6 >= interfaceC3543m1Arr.length) {
                            this.f30996b = false;
                            break;
                        } else {
                            interfaceC3543m1Arr[i6].c(this.f30997c, 1, this.f30999e, 0, null);
                            i6++;
                        }
                    }
                }
                break;
            default:
                ((InterfaceC3543m1) this.f31001g).getClass();
                if (this.f30996b && (i = this.f30998d) != 0 && this.f30999e == i) {
                    AbstractC2772Sd.H(this.f30997c != com.anythink.basead.exoplayer.b.f6382b);
                    ((InterfaceC3543m1) this.f31001g).c(this.f30997c, 1, this.f30998d, 0, null);
                    this.f30996b = false;
                    break;
                }
                break;
        }
    }

    public C3332i4(List list) {
        this.f30995a = 0;
        this.f31000f = list;
        this.f31001g = new InterfaceC3543m1[list.size()];
        this.f30997c = com.anythink.basead.exoplayer.b.f6382b;
    }
}
