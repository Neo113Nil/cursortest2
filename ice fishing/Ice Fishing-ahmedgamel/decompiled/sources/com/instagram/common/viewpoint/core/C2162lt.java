package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.expressad.f.a.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2162lt extends AbstractC1016Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", b.dI, "OXoEHzgO5FTzqO33f", "i"};
    public int A00;
    public C0971Hh A01;
    public C0973Hj A02;
    public C1017Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C1017Jc A02(C06674v c06674v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC0974Hk.A06(c06674v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC0974Hk.A04(c06674v);
            return null;
        }
        C0973Hj c0973Hj = this.A02;
        C0971Hh c0971Hh = this.A01;
        byte[] bArr = new byte[c06674v.A0A()];
        System.arraycopy(c06674v.A0l(), 0, bArr, 0, c06674v.A0A());
        return new C1017Jc(c0973Hj, c0971Hh, bArr, AbstractC0974Hk.A0D(c06674v, c0973Hj.A05), AbstractC0974Hk.A00(r6.length - 1));
    }

    public static String A03(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 29);
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
        return (b9 >> i4) & (p.f9259b >>> (8 - i));
    }

    public static int A01(byte b9, C1017Jc c1017Jc) {
        if (!c1017Jc.A04[A00(b9, c1017Jc.A00, 1)].A03) {
            int modeNumber = c1017Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c1017Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C06674v c06674v, long j6) {
        if (c06674v.A08() < c06674v.A0A() + 4) {
            c06674v.A0i(Arrays.copyOf(c06674v.A0l(), c06674v.A0A() + 4));
        } else {
            c06674v.A0e(c06674v.A0A() + 4);
        }
        byte[] A0l = c06674v.A0l();
        A0l[c06674v.A0A() - 4] = (byte) (j6 & 255);
        A0l[c06674v.A0A() - 3] = (byte) ((j6 >>> 8) & 255);
        A0l[c06674v.A0A() - 2] = (byte) ((j6 >>> 16) & 255);
        A0l[c06674v.A0A() - 1] = (byte) (255 & (j6 >>> 24));
    }

    public static boolean A06(C06674v c06674v) {
        try {
            return AbstractC0974Hk.A0C(1, c06674v, true);
        } catch (C3K unused) {
            return false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1016Jb
    public final long A09(C06674v c06674v) {
        int i = 0;
        if ((c06674v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b9 = c06674v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b9, (C1017Jc) AbstractC06443y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c06674v, i);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1016Jb
    public final void A0A(long j6) {
        super.A0A(j6);
        this.A04 = j6 != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1016Jb
    public final void A0B(boolean z6) {
        super.A0B(z6);
        if (z6) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1016Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C06674v c06674v, long j6, C1015Ja c1015Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC06443y.A01(c1015Ja.A00);
            return false;
        }
        this.A03 = A02(c06674v);
        if (this.A03 == null) {
            return true;
        }
        C1017Jc c1017Jc = this.A03;
        C0973Hj c0973Hj = c1017Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c0973Hj.A09);
        codecInitializationData.add(c1017Jc.A03);
        c1015Ja.A00 = new C06112p().A11(A03(0, 12, 22)).A0a(c0973Hj.A02).A0j(c0973Hj.A00).A0b(c0973Hj.A05).A0m(c0973Hj.A06).A12(codecInitializationData).A0v(AbstractC0974Hk.A02(MetaExoPlayerCustomizedCollections.A02(c1017Jc.A01.A02))).A14();
        return true;
    }
}
