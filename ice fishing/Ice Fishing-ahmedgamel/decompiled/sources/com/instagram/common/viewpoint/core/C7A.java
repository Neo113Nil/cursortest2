package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7A, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7A {
    public static byte[] A0E;
    public static String[] A0F = {"qTjlphzGhjtz23pZpbkrfGV3", "gcvQ0aFRAZsVeDDMvPpq9fmBIR43z3dS", "1g2pSH5s64tGUAh3eJ0e3X43Q9jzw3mq", "lB1M4R9KcDs1NZsKBVQ3JQYLP4RbMvTH", "7AgciWFjZyCuzmH359m88XAJrahqi7eF", "Et2BwvNp", "Oz1eJxJHgMWzrYsZQ0zZlFN1YCxGY3CZ", "Iy7o67ktSbvMBIxm3lxnuK7UTKgUaVFx"};
    public C7B A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public C7A A04;
    public C2250nW A05 = C2250nW.A06;
    public C0910Ex A06;
    public final InterfaceC2269np A07;
    public final Object A08;
    public final DT[] A09;
    public final AnonymousClass79 A0A;
    public final AbstractC0909Ew A0B;
    public final InterfaceC07397p[] A0C;
    public final boolean[] A0D;

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{81, 121, 120, 117, 125, 76, 121, 110, 117, 115, 120, 84, 115, 112, 120, 121, 110, 28, 41, 62, 37, 35, 40, 108, 62, 41, 32, 41, 45, c.f17105c, 41, 108, 42, 45, 37, 32, 41, 40, 98};
    }

    static {
        A04();
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old exoplayer method. requires deleting")
    public C7A(InterfaceC07397p[] interfaceC07397pArr, long j6, AbstractC0909Ew abstractC0909Ew, F0 f02, InterfaceC0858Cx interfaceC0858Cx, C7B c7b, C0910Ex c0910Ex) {
        this.A0C = interfaceC07397pArr;
        this.A03 = j6 - c7b.A03;
        this.A0B = abstractC0909Ew;
        this.A08 = AbstractC06443y.A01(c7b.A04.A04);
        this.A00 = c7b;
        this.A06 = c0910Ex;
        this.A09 = new DT[interfaceC07397pArr.length];
        this.A0D = new boolean[interfaceC07397pArr.length];
        this.A0A = new C2330op(this, interfaceC0858Cx);
        this.A07 = A00(c7b.A04, this.A0A, f02, c7b.A03, c7b.A01);
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceList is temporarily changed to MediaSourceAdapter")
    public static InterfaceC2269np A00(C2268no c2268no, AnonymousClass79 anonymousClass79, F0 f02, long j6, long j9) {
        InterfaceC2269np A5W = anonymousClass79.A5W(c2268no, f02, j6);
        if (j9 != b.f7168b) {
            return new C9v(A5W, true, 0L, j9);
        }
        return A5W;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02() {
        if (!A08()) {
            return;
        }
        for (int i = 0; i < i; i++) {
            boolean rendererEnabled = this.A06.A00(i);
            InterfaceC2232nE interfaceC2232nE = this.A06.A04[i];
            if (rendererEnabled && interfaceC2232nE != null) {
                interfaceC2232nE.A5x();
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A03() {
        if (!A08()) {
            return;
        }
        for (int i = 0; i < i; i++) {
            boolean rendererEnabled = this.A06.A00(i);
            InterfaceC2232nE interfaceC2232nE = this.A06.A04[i];
            if (rendererEnabled && interfaceC2232nE != null) {
                interfaceC2232nE.A6K();
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary bridging of MediaSourceList with MediaSourceAdapter")
    public static void A05(AnonymousClass79 anonymousClass79, InterfaceC2269np interfaceC2269np) {
        try {
            if (interfaceC2269np instanceof C9v) {
                anonymousClass79.AHk(((C9v) interfaceC2269np).A05);
            } else {
                anonymousClass79.AHk(interfaceC2269np);
            }
        } catch (RuntimeException e9) {
            AbstractC06524g.A08(A01(0, 17, 10), A01(17, 22, 90), e9);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(DT[] dtArr) {
        for (int i = 0; i < i; i++) {
            if (this.A0C[i].A9N() == -2 && this.A06.A00(i)) {
                dtArr[i] = new C2271nr();
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A07(DT[] dtArr) {
        for (int i = 0; i < i; i++) {
            if (this.A0C[i].A9N() == -2) {
                dtArr[i] = null;
            }
        }
    }

    private boolean A08() {
        return this.A04 == null;
    }

    public final long A09() {
        if (!this.A02) {
            return this.A00.A03;
        }
        long A78 = this.A01 ? this.A07.A78() : Long.MIN_VALUE;
        return A78 == Long.MIN_VALUE ? this.A00.A00 : A78;
    }

    public final long A0A() {
        if (this.A02) {
            return this.A07.A8b();
        }
        return 0L;
    }

    public final long A0B() {
        return this.A03;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"})
    public final long A0C(long j6) {
        return this.A07.A76(j6);
    }

    public final long A0D(long j6) {
        return j6 - A0B();
    }

    public final long A0E(long j6) {
        return A0B() + j6;
    }

    public final long A0F(C0910Ex c0910Ex, long j6, boolean z6) {
        return A0G(c0910Ex, j6, z6, new boolean[this.A0C.length]);
    }

    public final long A0G(C0910Ex c0910Ex, long j6, boolean z6, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z9 = false;
            if (i < c0910Ex.A00) {
                boolean[] zArr2 = this.A0D;
                if (!z6) {
                    boolean A01 = c0910Ex.A01(this.A06, i);
                    if (A0F[5].length() != 8) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0F;
                    strArr[4] = "ZW5cY05fUZ7YDJtoLiROAD1s3u7pqZaY";
                    strArr[3] = "DBvv8TdqbKzS7YgGUgxEKNMIgeBwY4FK";
                    if (A01) {
                        z9 = true;
                    }
                }
                zArr2[i] = z9;
                i++;
            } else {
                A07(this.A09);
                A02();
                this.A06 = c0910Ex;
                A03();
                long AJ9 = this.A07.AJ9(c0910Ex.A04, this.A0D, this.A09, zArr, j6);
                A06(this.A09);
                this.A01 = false;
                for (int i4 = 0; i4 < this.A09.length; i4++) {
                    if (this.A09[i4] != null) {
                        AbstractC06443y.A08(c0910Ex.A00(i4));
                        if (this.A0C[i4].A9N() != -2) {
                            this.A01 = true;
                        }
                    } else {
                        AbstractC06443y.A08(c0910Ex.A04[i4] == null);
                    }
                }
                return AJ9;
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"})
    public final long A0H(boolean z6) {
        if (!z6) {
            return this.A03;
        }
        return this.A00.A03 + this.A03;
    }

    public final C7A A0I() {
        return this.A04;
    }

    public final C2250nW A0J() {
        return this.A05;
    }

    public final C0910Ex A0K() {
        return this.A06;
    }

    public final C0910Ex A0L(float f2, Timeline timeline) throws AD {
        C0910Ex A0b = this.A0B.A0b(this.A0C, A0J(), this.A00.A04, timeline);
        for (InterfaceC2232nE interfaceC2232nE : A0b.A04) {
            if (interfaceC2232nE != null) {
                interfaceC2232nE.AFJ(f2);
            }
        }
        return A0b;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceAdapter to be replaced with MediaSourceList")
    public final void A0M() {
        A02();
        A05(this.A0A, this.A07);
    }

    public final void A0N(float f2, Timeline timeline) throws AD {
        this.A02 = true;
        this.A05 = this.A07.A9M();
        long A0F2 = A0F(A0L(f2, timeline), this.A00.A03, false);
        this.A03 += this.A00.A03 - A0F2;
        this.A00 = this.A00.A00(A0F2);
    }

    public final void A0O(long j6) {
        AbstractC06443y.A08(A08());
        this.A07.A5C(A0D(j6));
    }

    public final void A0P(long j6) {
        AbstractC06443y.A08(A08());
        if (this.A02) {
            this.A07.AHW(A0D(j6));
        }
    }

    public final void A0Q(C7A c7a) {
        if (c7a == this.A04) {
            return;
        }
        A02();
        this.A04 = c7a;
        A03();
    }

    public final boolean A0R() {
        return this.A02 && (!this.A01 || this.A07.A78() == Long.MIN_VALUE);
    }
}
