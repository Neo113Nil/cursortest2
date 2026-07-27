package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.expressad.f.a.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2141lt extends AbstractC0995Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", b.dI, "OXoEHzgO5FTzqO33f", "i"};
    public int A00;
    public C0950Hh A01;
    public C0952Hj A02;
    public C0996Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C0996Jc A02(C06464v c06464v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC0953Hk.A06(c06464v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC0953Hk.A04(c06464v);
            return null;
        }
        C0952Hj c0952Hj = this.A02;
        C0950Hh c0950Hh = this.A01;
        byte[] bArr = new byte[c06464v.A0A()];
        System.arraycopy(c06464v.A0l(), 0, bArr, 0, c06464v.A0A());
        return new C0996Jc(c0952Hj, c0950Hh, bArr, AbstractC0953Hk.A0D(c06464v, c0952Hj.A05), AbstractC0953Hk.A00(r6.length - 1));
    }

    public static String A03(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b9, int i, int i4) {
        return (b9 >> i4) & (p.f8630b >>> (8 - i));
    }

    public static int A01(byte b9, C0996Jc c0996Jc) {
        if (!c0996Jc.A04[A00(b9, c0996Jc.A00, 1)].A03) {
            int modeNumber = c0996Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c0996Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C06464v c06464v, long j9) {
        if (c06464v.A08() < c06464v.A0A() + 4) {
            c06464v.A0i(Arrays.copyOf(c06464v.A0l(), c06464v.A0A() + 4));
        } else {
            c06464v.A0e(c06464v.A0A() + 4);
        }
        byte[] A0l = c06464v.A0l();
        A0l[c06464v.A0A() - 4] = (byte) (j9 & 255);
        A0l[c06464v.A0A() - 3] = (byte) ((j9 >>> 8) & 255);
        A0l[c06464v.A0A() - 2] = (byte) ((j9 >>> 16) & 255);
        A0l[c06464v.A0A() - 1] = (byte) (255 & (j9 >>> 24));
    }

    public static boolean A06(C06464v c06464v) {
        try {
            return AbstractC0953Hk.A0C(1, c06464v, true);
        } catch (C3K unused) {
            return false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0995Jb
    public final long A09(C06464v c06464v) {
        int i = 0;
        if ((c06464v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b9 = c06464v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b9, (C0996Jc) AbstractC06233y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c06464v, i);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0995Jb
    public final void A0A(long j9) {
        super.A0A(j9);
        this.A04 = j9 != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0995Jb
    public final void A0B(boolean z8) {
        super.A0B(z8);
        if (z8) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0995Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C06464v c06464v, long j9, C0994Ja c0994Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC06233y.A01(c0994Ja.A00);
            return false;
        }
        this.A03 = A02(c06464v);
        if (this.A03 == null) {
            return true;
        }
        C0996Jc c0996Jc = this.A03;
        C0952Hj c0952Hj = c0996Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c0952Hj.A09);
        codecInitializationData.add(c0996Jc.A03);
        c0994Ja.A00 = new C05902p().A11(A03(0, 12, 22)).A0a(c0952Hj.A02).A0j(c0952Hj.A00).A0b(c0952Hj.A05).A0m(c0952Hj.A06).A12(codecInitializationData).A0v(AbstractC0953Hk.A02(MetaExoPlayerCustomizedCollections.A02(c0996Jc.A01.A02))).A14();
        return true;
    }
}
