package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Log;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8B, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8B implements InterfaceC2356pF {
    public static byte[] A0M;
    public static String[] A0N = {"gtbAICrdQ5OiLd8QtlGJkysA4GOuQAyl", "NB4BeTTq5ijHDPStUBIG2cd4hjVw3Rms", "uuMr3aWTfRr6VJnGuPPVK2CIrmsp3XMP", "Eb6am5ksZvZ5Hz0HFQHbX0NWivmHdCO7", "qnDH", "QayiUw4ouBPhcoxDO7fR8OixzHh3DuJf", "V84YazX1IDZHbq2m95FMlzDl0u9g04ST", "S22pIk311xlkEmMZRooVtOw4dNPxaWRF"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public InterfaceC2356pF A06;
    public C06805i A07;
    public C06805i A08;

    @MetaExoPlayerCustomization
    public ML A09;
    public MZ A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC2356pF A0D;
    public final InterfaceC2356pF A0E;
    public final InterfaceC2356pF A0F;
    public final MP A0G;
    public final MS A0H;
    public final MY A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            byte b9 = copyOfRange[i9];
            if (A0N[4].length() == 12) {
                throw new RuntimeException();
            }
            A0N[4] = "VXYuEglycDYgl";
            copyOfRange[i9] = (byte) ((b9 ^ i6) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0M = new byte[]{25, 59, 57, 50, c.f17105c, 30, 59, 46, 59, 9, 53, 47, 40, 57, c.f17105c, 22, 58, 32, 57, 49, 59, 114, 33, 117, 32, 37, 49, 52, 33, 48, 117, 39, 48, 49, 60, 39, 48, 54, 33, 48, 49, 117, 0, 7, 28, 123, 117, 1, 61, 60, 38, 117, 56, 60, 50, 61, 33, 117, 54, 52, 32, 38, 48, 117, 39, 48, 57, 52, 33, 60, 35, 48, 117, 0, 7, 28, 38, 117, 50, 48, 33, 117, 39, 48, 38, 58, 57, 35, 48, 49, 117, 60, 59, 54, 58, 39, 39, 48, 54, 33, 57, 44, 123, 95, 94, 115, 81, 83, 88, 85, 84, 114, 73, 68, 85, 67, 98, 85, 81, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    @MetaExoPlayerCustomization("usage of fbDataSpecExtension and the check for isInitSegment")
    public final long AGi(C06805i c06805i) throws IOException {
        try {
            String A4l = this.A0I.A4l(c06805i);
            C06805i A09 = c06805i.A04().A08(A4l).A09();
            this.A08 = A09;
            this.A05 = A01(this.A0G, A4l, A09.A06);
            this.A03 = c06805i.A04;
            this.A09 = new ML(c06805i.A07);
            this.A0B = A00(c06805i) != -1;
            boolean z6 = this.A0B;
            if (this.A0B) {
                this.A00 = -1L;
            } else {
                this.A00 = AbstractC1102Mj.A00(this.A0G.A7S(A4l));
                if (this.A00 != -1) {
                    this.A00 -= c06805i.A04;
                    if (this.A00 < 0) {
                        throw new C06735b(AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            }
            boolean z9 = c06805i.A07.A08 <= 0 && c06805i.A07.A07 <= 0;
            if (c06805i.A03 != -1) {
                this.A00 = this.A00 == -1 ? c06805i.A03 : Math.min(this.A00, c06805i.A03);
            }
            if (this.A00 > 0 || this.A00 == -1) {
                A06(A09, false, z9);
            }
            return c06805i.A03 != -1 ? c06805i.A03 : this.A00;
        } catch (Throwable th) {
            A09(th);
            throw th;
        }
    }

    static {
        A05();
    }

    public C8B(MP mp, InterfaceC2356pF interfaceC2356pF, InterfaceC2356pF interfaceC2356pF2, C5W c5w, MY my, int i, AbstractC06253d abstractC06253d, int i4, MS ms) {
        this.A0G = mp;
        this.A0D = interfaceC2356pF2;
        this.A0I = my == null ? MY.A00 : my;
        this.A0J = (i & 1) != 0;
        this.A0L = (i & 2) != 0;
        this.A0K = (i & 4) != 0;
        if (interfaceC2356pF != null) {
            interfaceC2356pF = abstractC06253d != null ? new AH(interfaceC2356pF, abstractC06253d, i4) : interfaceC2356pF;
            this.A0F = interfaceC2356pF;
            this.A0E = c5w != null ? new AF(interfaceC2356pF, c5w) : null;
        } else {
            this.A0F = AI.A02;
            this.A0E = null;
        }
        this.A0H = ms;
    }

    private int A00(C06805i c06805i) {
        if (this.A0L && this.A0C) {
            return 0;
        }
        if (this.A0K && c06805i.A03 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(MP mp, String str, Uri redirectedUri) {
        Uri redirectedUri2 = AbstractC1102Mj.A01(mp.A7S(str));
        return redirectedUri2 != null ? redirectedUri2 : redirectedUri;
    }

    private void A03() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.close();
            this.A07 = null;
            this.A06 = null;
            if (A0N[5].charAt(3) == 'i') {
                String[] strArr = A0N;
                strArr[2] = "vHGwoIowQcJHPzt2zHibHrQYTuNv4ZzT";
                strArr[1] = "k7MJrtNgTHKuOTKhmFADSg5K1rHaIFar";
                if (this.A0A != null) {
                    MP mp = this.A0G;
                    if (A0N[6].charAt(29) == '4') {
                        String[] strArr2 = A0N;
                        strArr2[2] = "npCyc8crYVBLSlKGvChDlZdzdxvHOR7S";
                        strArr2[1] = "yWpl1AKn1flVHx0rOJ2JJIdMQnxjFkRn";
                        mp.AHg(this.A0A);
                        this.A0A = null;
                        return;
                    }
                } else {
                    return;
                }
            }
            throw new RuntimeException();
        } catch (Throwable th) {
            this.A07 = null;
            this.A06 = null;
            if (this.A0A != null) {
                this.A0G.AHg(this.A0A);
                this.A0A = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A7A();
            throw new NullPointerException(A02(103, 17, 44));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        if (r2 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
    
        r21.A00 = r2;
        r2 = r21.A03 + r21.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        if (com.instagram.common.viewpoint.core.C8B.A0N[5].charAt(3) == 'i') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
    
        com.instagram.common.viewpoint.core.C8B.A0N[3] = "iUSWGyHOgLgD9ZjfpDxtLA9tGfi2lrY2";
        com.instagram.common.viewpoint.core.C1104Ml.A00(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
    
        if (r2 != (-1)) goto L39;
     */
    @MetaExoPlayerCustomization("Parameter isInitSegment and all ot is usages. Setting mFbDataSpecExtension in nextDataSpec. Call to maybeUpdateRedirectedUriMetadata at the end")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(C06805i c06805i, boolean z6, boolean z9) throws IOException {
        MZ AKA;
        long j6;
        C06805i A09;
        InterfaceC2356pF interfaceC2356pF;
        long j9;
        Uri uri;
        String str = (String) C5C.A0f(c06805i.A08);
        MN mn = z9 ? MN.A03 : MN.A06;
        if (this.A0B) {
            AKA = null;
        } else if (this.A0J) {
            try {
                AKA = this.A0G.AKA(str, this.A03, this.A00, mn);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            str = str;
            AKA = this.A0G.AKB(str, this.A03, this.A00, mn);
        }
        if (AKA == null) {
            interfaceC2356pF = this.A0F;
            A09 = c06805i.A04().A04(this.A03).A03(this.A00).A07(this.A09).A09();
        } else {
            boolean z10 = AKA.A05;
            String[] strArr = A0N;
            if (strArr[0].charAt(4) == strArr[7].charAt(4)) {
                A0N[5] = "u32inRltH66jjh9yXIb3cYFcwSkjtAHW";
                if (z10) {
                    Uri fromFile = Uri.fromFile((File) C5C.A0f(AKA.A03));
                    long j10 = AKA.A02;
                    long j11 = this.A03 - j10;
                    long j12 = AKA.A01 - j11;
                    if (this.A00 != -1) {
                        j12 = Math.min(j12, this.A00);
                    }
                    A09 = c06805i.A04().A06(fromFile).A05(j10).A04(j11).A03(j12).A07(this.A09).A09();
                    interfaceC2356pF = this.A0D;
                } else {
                    if (AKA.A04()) {
                        j6 = this.A00;
                    } else {
                        j6 = AKA.A01;
                        if (this.A00 != -1) {
                            j6 = Math.min(j6, this.A00);
                        }
                    }
                    A09 = c06805i.A04().A04(this.A03).A03(j6).A07(this.A09).A09();
                    if (this.A0E != null) {
                        interfaceC2356pF = this.A0E;
                    } else {
                        interfaceC2356pF = this.A0F;
                        this.A0G.AHg(AKA);
                        AKA = null;
                    }
                }
            }
            throw new RuntimeException();
        }
        boolean z11 = this.A0B;
        if (A0N[5].charAt(3) == 'i') {
            String[] strArr2 = A0N;
            strArr2[0] = "KvC0Ia1A4x1eGi9X8aRBDgkMlzCJszIJ";
            strArr2[7] = "nNrFIIpUFsn1fqvNydhqNDEn907tEQAg";
            if (!z11 && interfaceC2356pF == this.A0F) {
                j9 = this.A03 + 102400;
            } else {
                j9 = Long.MAX_VALUE;
            }
            this.A01 = j9;
            if (z6) {
                AbstractC06443y.A08(A0A());
                InterfaceC2356pF interfaceC2356pF2 = this.A0F;
                if (A0N[3].charAt(26) == 'u') {
                    Throwable e9 = new RuntimeException();
                    throw e9;
                }
                A0N[5] = "8XoiTPgLcR8ApVu7jrAIE2ygde6TsOz1";
                if (interfaceC2356pF == interfaceC2356pF2) {
                    return;
                }
                try {
                    A03();
                } catch (Throwable th) {
                    if (((MZ) C5C.A0f(AKA)).A03()) {
                        this.A0G.AHg(AKA);
                    }
                    throw th;
                }
            }
            if (AKA != null && AKA.A03()) {
                this.A0A = AKA;
            }
            this.A06 = interfaceC2356pF;
            this.A07 = A09;
            this.A02 = 0L;
            long AGi = interfaceC2356pF.AGi(A09);
            C1104Ml c1104Ml = new C1104Ml();
            if (A09.A03 == -1) {
                if (A0N[4].length() != 12) {
                    A0N[3] = "AihO48tXyqmUqd3oId9EAGnNfKcJ6kuS";
                }
            }
            if (A0C()) {
                this.A05 = interfaceC2356pF.A9P();
                boolean isRedirected = !c06805i.A06.equals(this.A05);
                if (A0N[4].length() != 12) {
                    A0N[4] = "aty3owKlrPhsH";
                    if (isRedirected) {
                        uri = this.A05;
                    } else {
                        uri = null;
                    }
                    C1104Ml.A01(c1104Ml, uri);
                }
            }
            if (A0D()) {
                this.A0G.A4E(str, c1104Ml);
            }
            A08(str, this.A05);
            return;
        }
        throw new RuntimeException();
    }

    private void A07(String str) throws IOException {
        this.A00 = 0L;
        if (A0D()) {
            C1104Ml c1104Ml = new C1104Ml();
            C1104Ml.A00(c1104Ml, this.A03);
            this.A0G.A4E(str, c1104Ml);
        }
    }

    @MetaExoPlayerCustomization
    private void A08(String str, Uri uri) {
        if (!A0D()) {
            return;
        }
        C1104Ml c1104Ml = new C1104Ml();
        if (!uri.equals(this.A05)) {
            Uri uri2 = this.A05;
            if (A0N[6].charAt(29) != '4') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "HwBuIJEC6JIKumxqgSDJ0pUKIwQFYzQv";
            strArr[7] = "1FgFIXgVQckXZ73NbznNhujKeCbi6Slt";
            C1104Ml.A01(c1104Ml, uri2);
        } else {
            C1104Ml.A01(c1104Ml, null);
        }
        try {
            this.A0G.A4E(str, c1104Ml);
        } catch (MM e9) {
            String message = A02(15, 88, 73);
            Log.w(A02(0, 15, 70), message, e9);
        }
    }

    private void A09(Throwable th) {
        if (A0B() || (th instanceof MM)) {
            this.A0C = true;
        }
    }

    private boolean A0A() {
        return this.A06 == this.A0F;
    }

    private boolean A0B() {
        return this.A06 == this.A0D;
    }

    private boolean A0C() {
        return !A0B();
    }

    private boolean A0D() {
        return this.A06 == this.A0E;
    }

    public final MP A0E() {
        return this.A0G;
    }

    public final MY A0F() {
        return this.A0I;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final void A43(InterfaceC06915t interfaceC06915t) {
        AbstractC06443y.A01(interfaceC06915t);
        this.A0D.A43(interfaceC06915t);
        this.A0F.A43(interfaceC06915t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final Map<String, List<String>> A8t() {
        if (A0C()) {
            return this.A0F.A8t();
        }
        return Collections.emptyMap();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final Uri A9P() {
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2356pF
    public final void close() throws IOException {
        this.A08 = null;
        this.A05 = null;
        this.A03 = 0L;
        A04();
        try {
            A03();
        } catch (Throwable e9) {
            A09(e9);
            throw e9;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06002c
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        if (i4 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        C06805i currentDataSpec = (C06805i) AbstractC06443y.A01(this.A08);
        C06805i c06805i = (C06805i) AbstractC06443y.A01(this.A07);
        try {
            if (this.A03 >= this.A01) {
                A06(currentDataSpec, true, false);
            }
            try {
                int bytesRead = ((InterfaceC2356pF) AbstractC06443y.A01(this.A06)).read(bArr, i, i4);
                if (bytesRead != -1) {
                    if (A0B()) {
                        this.A04 += bytesRead;
                    }
                    this.A03 += bytesRead;
                    this.A02 += bytesRead;
                    if (this.A00 != -1) {
                        this.A00 -= bytesRead;
                    }
                } else if (A0C() && (c06805i.A03 == -1 || this.A02 < c06805i.A03)) {
                    A07((String) C5C.A0f(currentDataSpec.A08));
                } else if (this.A00 > 0 || this.A00 == -1) {
                    A03();
                    A06(currentDataSpec, false, false);
                    return read(bArr, i, i4);
                }
                return bytesRead;
            } catch (Throwable th) {
                e = th;
                A09(e);
                throw e;
            }
        } catch (Throwable th2) {
            e = th2;
        }
    }
}
