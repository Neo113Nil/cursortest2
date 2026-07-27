package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9v, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9v implements InterfaceC2248np, InterfaceC2249nq {
    public static String[] A06 = {"JXRw8dEnvO1Lr4g7cFUS0dvQrSj2gCrD", "hvHNuBxl", "xmWilmV3z2eIIj1", "UUtHfwhImwRJiupXWlBcpFq10hKf2hZ3", "Gjwbiw3zcCnfnivX0C6Z4KLegMayRhyW", "PFLAFIzQgEofbdrT2htWxpP7W2gVOOgi", "405rypbMY6P", "HWuA8Rz9jBHRgd5bymvhijPSyV36G6mN"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC2249nq A03;
    public C2252nt[] A04 = new C2252nt[0];
    public final InterfaceC2248np A05;

    public C9v(InterfaceC2248np interfaceC2248np, boolean z8, long j9, long j10) {
        this.A05 = interfaceC2248np;
        this.A02 = z8 ? j9 : b.f6539b;
        this.A01 = j9;
        this.A00 = j10;
    }

    private C07237u A00(long j9, C07237u c07237u) {
        long toleranceBeforeUs = C5C.A0T(c07237u.A01, 0L, j9 - this.A01);
        long A0T = C5C.A0T(c07237u.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j9);
        if (toleranceBeforeUs == c07237u.A01) {
            long j10 = c07237u.A00;
            if (A06[6].length() != 11) {
                throw new RuntimeException();
            }
            A06[0] = "SySHx2FlEzism2SEaRZKk1Ki9OIwKCgL";
            if (A0T == j10) {
                return c07237u;
            }
        }
        return new C07237u(toleranceBeforeUs, A0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.DW
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ADV(InterfaceC2248np interfaceC2248np) {
        ((InterfaceC2249nq) AbstractC06233y.A01(this.A03)).ADV(this);
    }

    public static boolean A02(long j9, InterfaceC2211nE[] interfaceC2211nEArr) {
        if (j9 != 0) {
            for (InterfaceC2211nE interfaceC2211nE : interfaceC2211nEArr) {
                if (interfaceC2211nE != null) {
                    C2399qI A92 = interfaceC2211nE.A92();
                    if (!C3J.A0G(A92.A0W, A92.A0R)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != b.f6539b;
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j9) {
        this.A05.A4s(j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2248np
    public final boolean A5C(long j9) {
        return this.A05.A5C(j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2248np
    public final void A60(long j9, boolean z8) {
        this.A05.A60(j9, z8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2248np
    public final long A6r(long j9, C07237u c07237u) {
        if (j9 == this.A01) {
            return this.A01;
        }
        return this.A05.A6r(j9, A00(j9, c07237u));
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A76(long j9) {
        return this.A05.A76(j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2248np
    public final long A78() {
        long A78 = this.A05.A78();
        if (A78 == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && A78 >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return A78;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2248np
    public final long A8b() {
        long A8b = this.A05.A8b();
        if (A8b != Long.MIN_VALUE) {
            long nextLoadPositionUs = this.A00;
            if (A06[0].charAt(29) != 'C') {
                throw new RuntimeException();
            }
            A06[0] = "QBPPyRyowan8CCGBQiXIHMf03VOUOCSC";
            if (nextLoadPositionUs == Long.MIN_VALUE || A8b < this.A00) {
                return A8b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2248np
    public final C2229nW A9M() {
        return this.A05.A9M();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2248np
    public final void ACS() throws IOException {
        if (0 == 0) {
            this.A05.ACS();
            return;
        }
        throw null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2249nq
    public final void AFS(InterfaceC2248np interfaceC2248np) {
        if (0 != 0) {
            return;
        }
        ((InterfaceC2249nq) AbstractC06233y.A01(this.A03)).AFS(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2248np
    public final void AH5(InterfaceC2249nq interfaceC2249nq, long j9) {
        this.A03 = interfaceC2249nq;
        this.A05.AH5(this, j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2248np
    public final long AHQ() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = b.f6539b;
            long AHQ = AHQ();
            return AHQ != b.f6539b ? AHQ : childDiscontinuityUs;
        }
        InterfaceC2248np interfaceC2248np = this.A05;
        if (A06[2].length() == 0) {
            throw new RuntimeException();
        }
        A06[6] = "ABWUoGiNBoa";
        long AHQ2 = interfaceC2248np.AHQ();
        if (AHQ2 == b.f6539b) {
            return b.f6539b;
        }
        long discontinuityUs = this.A01;
        boolean z8 = true;
        AbstractC06233y.A08(AHQ2 >= discontinuityUs);
        if (this.A00 != Long.MIN_VALUE) {
            long discontinuityUs2 = this.A00;
            if (AHQ2 > discontinuityUs2) {
                z8 = false;
            }
        }
        AbstractC06233y.A08(z8);
        return AHQ2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2248np
    public final void AHW(long j9) {
        this.A05.AHW(j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2248np
    public final long AJ8(@MetaExoPlayerCustomization long j9, boolean z8) {
        this.A02 = b.f6539b;
        boolean z9 = false;
        for (C2252nt c2252nt : this.A04) {
            if (c2252nt != null) {
                c2252nt.A00();
            }
        }
        long AJ8 = this.A05.AJ8(j9, z8);
        if (AJ8 == j9 || (AJ8 >= this.A01 && (this.A00 == Long.MIN_VALUE || AJ8 <= this.A00))) {
            z9 = true;
        }
        AbstractC06233y.A08(z9);
        return AJ8;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2248np
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long AJ9(InterfaceC2211nE[] interfaceC2211nEArr, boolean[] zArr, DT[] dtArr, boolean[] zArr2, long j9) {
        long j10;
        int i;
        this.A04 = new C2252nt[dtArr.length];
        DT[] dtArr2 = new DT[dtArr.length];
        int i4 = 0;
        while (true) {
            DT dt = null;
            if (i4 >= dtArr.length) {
                break;
            }
            this.A04[i4] = (C2252nt) dtArr[i4];
            DT[] childStreams = this.A04;
            if (childStreams[i4] != null) {
                dt = this.A04[i4].A01;
            }
            dtArr2[i4] = dt;
            i4++;
        }
        long AJ9 = this.A05.AJ9(interfaceC2211nEArr, zArr, dtArr2, zArr2, j9);
        if (A03() && j9 == this.A01) {
            long j11 = this.A01;
            String[] strArr = A06;
            if (strArr[4].charAt(5) == strArr[3].charAt(5)) {
                String[] strArr2 = A06;
                strArr2[7] = "en1LL2zHQFU7eKPWWtw7tqDicZnmZ9l5";
                strArr2[5] = "t66o2OzEfyctLQHjRBlZ897u0IFgDWGZ";
                if (A02(j11, interfaceC2211nEArr)) {
                    j10 = AJ9;
                    this.A02 = j10;
                    AbstractC06233y.A08(AJ9 != j9 || (AJ9 >= this.A01 && (this.A00 == Long.MIN_VALUE || AJ9 <= this.A00)));
                    i = 0;
                    while (true) {
                        int length = dtArr.length;
                        if (A06[1].length() == 30) {
                            String[] strArr3 = A06;
                            strArr3[7] = "DNi9UWzwfCWyYPkB4uGGg0YkPCShAQe6";
                            strArr3[5] = "fAixbEz1F3G47KA6JLUGcT01MO1ZofiJ";
                            if (i >= length) {
                                break;
                            }
                            if (dtArr2[i] != null) {
                                C2252nt[] c2252ntArr = this.A04;
                                String[] strArr4 = A06;
                                if (strArr4[4].charAt(5) != strArr4[3].charAt(5)) {
                                    break;
                                }
                                A06[6] = "ocXNdzhjsFv";
                                c2252ntArr[i] = null;
                            } else {
                                DT[] childStreams2 = this.A04;
                                if (childStreams2[i] != null) {
                                    DT dt2 = this.A04[i].A01;
                                    DT dt3 = dtArr2[i];
                                    if (A06[1].length() != 30) {
                                        String[] strArr5 = A06;
                                        strArr5[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                        strArr5[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                        if (dt2 == dt3) {
                                        }
                                    } else if (dt2 == dt3) {
                                    }
                                }
                                this.A04[i] = new C2252nt(this, dtArr2[i]);
                            }
                            DT[] childStreams3 = this.A04;
                            dtArr[i] = childStreams3[i];
                            i++;
                        } else {
                            if (i >= length) {
                                break;
                            }
                            if (dtArr2[i] != null) {
                            }
                            DT[] childStreams32 = this.A04;
                            dtArr[i] = childStreams32[i];
                            i++;
                        }
                    }
                    return AJ9;
                }
            }
            throw new RuntimeException();
        }
        j10 = b.f6539b;
        this.A02 = j10;
        AbstractC06233y.A08(AJ9 != j9 || (AJ9 >= this.A01 && (this.A00 == Long.MIN_VALUE || AJ9 <= this.A00)));
        i = 0;
        while (true) {
            int length2 = dtArr.length;
            if (A06[1].length() == 30) {
            }
            DT[] childStreams322 = this.A04;
            dtArr[i] = childStreams322[i];
            i++;
        }
        return AJ9;
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z8) {
        this.A05.AJc(z8);
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b9) {
        this.A05.AKb(b9);
    }
}
