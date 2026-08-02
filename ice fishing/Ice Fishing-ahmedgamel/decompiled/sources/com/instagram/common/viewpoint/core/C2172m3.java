package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Pair;
import com.anythink.basead.exoplayer.b;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.facebook.ads.androidx.media3.extractor.mp4.Mp4Extractor;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.m3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2172m3 implements H9, HY {
    public static byte[] A0Q;
    public static String[] A0R = {"uzhMW", "LbToze1ZyMStOzMPMggUyU89k761Fydj", "roznHbdGo", "zeOiwqyw9G80TO", "hwgMtT9WWej", "AZ5CtgA3jsgDmrh", "c4g75mNjYzBkznfgxB8HcDFPfSogi", "Prtl1ARtkjOsoD"};
    public static final HD A0S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0A;
    public long A0B;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0C;
    public C06674v A0D;
    public HA A0E;
    public MotionPhotoMetadata A0F;
    public JE[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final C06674v A0J;
    public final C06674v A0K;
    public final C06674v A0L;
    public final C06674v A0M;
    public final JL A0N;
    public final ArrayDeque<C2183mE> A0O;
    public final List<Metadata.Entry> A0P;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private int A03(InterfaceC2211ms interfaceC2211ms, HV hv) throws IOException {
        int i;
        long A8n = interfaceC2211ms.A8n();
        if (this.A08 == -1) {
            this.A08 = A01(A8n);
            if (this.A08 == -1) {
                return -1;
            }
        }
        JE je = this.A0G[this.A08];
        InterfaceC0967Hd interfaceC0967Hd = je.A01;
        int i4 = je.A00;
        long j6 = je.A04.A06[i4];
        int i6 = je.A04.A05[i4];
        C0968He c0968He = je.A02;
        long j9 = (j6 - A8n) + this.A05;
        if (j9 < 0 || j9 >= 262144) {
            hv.A00 = j6;
            return 1;
        }
        int i9 = je.A03.A02;
        if (A0R[2].length() != 19) {
            A0R[6] = "rX6gisAdcV7LBeXwmOhQV8Eb98OXk";
            if (i9 == 1) {
                j9 += 8;
                if (A0R[6].length() == 29) {
                    String[] strArr = A0R;
                    strArr[3] = "KKgaKTwS1RwNPE";
                    strArr[7] = "5hDvshmtbzc6vz";
                    i6 -= 8;
                }
            }
            interfaceC2211ms.AK3((int) j9);
            if (je.A03.A01 != 0) {
                byte[] A0l = this.A0K.A0l();
                A0l[0] = 0;
                A0l[1] = 0;
                A0l[2] = 0;
                int i10 = je.A03.A01;
                int i11 = 4 - je.A03.A01;
                while (this.A06 < i6) {
                    if (this.A07 == 0) {
                        interfaceC2211ms.readFully(A0l, i11, i10);
                        this.A05 += i10;
                        this.A0K.A0f(0);
                        int A0C = this.A0K.A0C();
                        if (A0C < 0) {
                            throw C3K.A01(A09(48, 18, 118), null);
                        }
                        this.A07 = A0C;
                        this.A0L.A0f(0);
                        interfaceC0967Hd.AIr(this.A0L, 4);
                        this.A06 += 4;
                        i6 += i11;
                    } else {
                        int AIp = interfaceC0967Hd.AIp(interfaceC2211ms, this.A07, false);
                        this.A05 += AIp;
                        this.A06 += AIp;
                        this.A07 -= AIp;
                    }
                }
            } else {
                if (A09(66, 9, 68).equals(je.A03.A07.A0W)) {
                    if (this.A06 == 0) {
                        AbstractC0958Gu.A07(i6, this.A0M);
                        interfaceC0967Hd.AIr(this.A0M, 7);
                        this.A06 += 7;
                    }
                    i6 += 7;
                } else if (c0968He != null) {
                    c0968He.A03(interfaceC2211ms);
                }
                while (this.A06 < i6) {
                    int AIp2 = interfaceC0967Hd.AIp(interfaceC2211ms, i6 - this.A06, false);
                    this.A05 += AIp2;
                    this.A06 += AIp2;
                    this.A07 -= AIp2;
                }
            }
            long j10 = je.A04.A07[i4];
            int i12 = je.A04.A04[i4];
            if (A0R[4].length() == 11) {
                String[] strArr2 = A0R;
                strArr2[5] = "dniiMzQMBKOANx9";
                strArr2[0] = "Fj7cY";
                if (c0968He != null) {
                    i = 0;
                    c0968He.A04(interfaceC0967Hd, j10, i12, i6, 0, null);
                    if (i4 + 1 == je.A04.A01) {
                        c0968He.A05(interfaceC0967Hd, null);
                    }
                } else {
                    i = 0;
                    interfaceC0967Hd.AIu(j10, i12, i6, 0, null);
                }
                je.A00++;
                this.A08 = -1;
                this.A05 = i;
                this.A06 = i;
                this.A07 = i;
                return i;
            }
        }
        throw new RuntimeException();
    }

    public static String A09(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Q, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0Q = new byte[]{-47, 4, -1, -3, -80, 3, -7, 10, -11, -80, -4, -11, 3, 3, -80, 4, -8, -15, -2, -80, -8, -11, -15, -12, -11, 2, -80, -4, -11, -2, -9, 4, -8, -80, -72, 5, -2, 3, 5, 0, 0, -1, 2, 4, -11, -12, -71, -66, 18, 55, c.f17105c, 42, 53, 50, 45, -23, 23, 10, 21, -23, 53, 46, 55, 48, 61, 49, -8, 12, -5, 0, 6, -58, -8, -6, -53, 49, 69, 52, 57, c.f17105c, -1, 68, 66, 69, 53, -3, 56, 52};
    }

    static {
        A0C();
        A0S = new HD() { // from class: com.facebook.ads.redexgen.X.m4
            @Override // com.instagram.common.viewpoint.core.HD
            public final H9[] A5N() {
                return C2172m3.A0M();
            }

            @Override // com.instagram.common.viewpoint.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
    }

    public C2172m3() {
        this(0);
    }

    public C2172m3(int i) {
        this.A0I = i;
        this.A04 = (i & 4) != 0 ? 3 : 0;
        this.A0N = new JL();
        this.A0P = new ArrayList();
        this.A0J = new C06674v(16);
        this.A0O = new ArrayDeque<>();
        this.A0L = new C06674v(HS.A03);
        this.A0K = new C06674v(4);
        this.A0M = new C06674v();
        this.A08 = -1;
        this.A0E = HA.A00;
        this.A0G = new JE[0];
    }

    public static int A00(int i) {
        switch (i) {
            case 1751476579:
                return 2;
            case 1903435808:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[1] = "rbgKKZbH0NS3XFJda55b1nN6iCZjcLPR";
                return 1;
            default:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[4] = "05jGjYjRxbz";
                return 0;
        }
    }

    private int A01(long j6) {
        long j9 = Long.MAX_VALUE;
        int preferredTrackIndex = 1;
        int i = -1;
        long sampleOffset = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        int i4 = 1;
        int trackIndex = -1;
        int i6 = 0;
        while (true) {
            JE[] jeArr = this.A0G;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0R[6] = "Fcko3uaud46cO6nUcug7HhLZFNYBY";
            if (i6 >= jeArr.length) {
                if (j10 == Long.MAX_VALUE || i4 == 0) {
                    return i;
                }
                long j11 = 10485760 + j10;
                if (A0R[1].charAt(1) == 'b') {
                    A0R[1] = "AbIM1W3wiFJMRqsWOI3P0CqvLybO2M00";
                    if (sampleOffset < j11) {
                        return i;
                    }
                } else if (sampleOffset < j11) {
                    return i;
                }
                return trackIndex;
            }
            JE je = this.A0G[i6];
            int i9 = je.A00;
            if (i9 != je.A04.A01) {
                long j12 = je.A04.A06[i9];
                long minAccumulatedBytes = ((long[][]) C5C.A0f(this.A0H))[i6][i9];
                long j13 = j12 - j6;
                int i10 = (j13 < 0 || j13 >= 262144) ? 1 : 0;
                if ((i10 == 0 && preferredTrackIndex != 0) || (i10 == preferredTrackIndex && j13 < j9)) {
                    preferredTrackIndex = i10;
                    j9 = j13;
                    i = i6;
                    if (A0R[6].length() != 29) {
                        String[] strArr2 = A0R;
                        strArr2[5] = "nNk7RawiIyahd9Y";
                        strArr2[0] = "017pL";
                        sampleOffset = minAccumulatedBytes;
                    } else {
                        A0R[1] = "1bC0in6G1ApWSL3PegJBmoVzHl6EE3tw";
                        sampleOffset = minAccumulatedBytes;
                    }
                }
                if (minAccumulatedBytes < j10) {
                    j10 = minAccumulatedBytes;
                    i4 = i10;
                    trackIndex = i6;
                }
            }
            i6++;
        }
    }

    public static int A02(C06674v c06674v) {
        c06674v.A0f(8);
        int majorBrand = A00(c06674v.A0C());
        if (majorBrand != 0) {
            return majorBrand;
        }
        c06674v.A0g(4);
        while (c06674v.A07() > 0) {
            int majorBrand2 = A00(c06674v.A0C());
            if (majorBrand2 != 0) {
                return majorBrand2;
            }
        }
        return 0;
    }

    private int A04(InterfaceC2211ms interfaceC2211ms, HV hv) throws IOException {
        int A07 = this.A0N.A07(interfaceC2211ms, hv, this.A0P);
        if (A07 == 1 && hv.A00 == 0) {
            A0A();
        }
        return A07;
    }

    public static int A05(JR jr, long j6) {
        int A00 = jr.A00(j6);
        if (A00 == -1) {
            return jr.A01(j6);
        }
        return A00;
    }

    public static long A06(JR jr, long j6, long j9) {
        int A05 = A05(jr, j6);
        if (A05 == -1) {
            return j9;
        }
        return Math.min(jr.A06[A05], j9);
    }

    private final HX A07(long j6, int i) {
        long j9;
        long j10;
        int mainTrackIndex;
        if (this.A0G.length == 0) {
            return new HX(HZ.A04);
        }
        long j11 = b.f7168b;
        long j12 = -1;
        int i4 = i != -1 ? i : this.A03;
        if (i4 != -1) {
            JR jr = this.A0G[i4].A04;
            int A05 = A05(jr, j6);
            if (A05 == -1) {
                return new HX(HZ.A04);
            }
            j10 = jr.A07[A05];
            j9 = jr.A06[A05];
            if (A0R[6].length() != 29) {
                throw new RuntimeException();
            }
            A0R[1] = "zbT5rN6sguJCvWwII8HLCHwSkH7sQNQT";
            if (j10 < j6 && A05 < jr.A01 - 1 && (mainTrackIndex = jr.A01(j6)) != -1 && mainTrackIndex != A05) {
                j11 = jr.A07[mainTrackIndex];
                j12 = jr.A06[mainTrackIndex];
            }
        } else {
            j9 = Long.MAX_VALUE;
            if (A0R[4].length() != 11) {
                j10 = j6;
            } else {
                A0R[2] = "SenK5aC";
                j10 = j6;
            }
        }
        if (i == -1) {
            for (int i6 = 0; i6 < this.A0G.length; i6++) {
                if (i6 != this.A03) {
                    JR sampleTable = this.A0G[i6].A04;
                    j9 = A06(sampleTable, j10, j9);
                    if (j11 != b.f7168b) {
                        j12 = A06(sampleTable, j11, j12);
                    }
                }
            }
        }
        HZ hz = new HZ(j10, j9);
        if (j11 == b.f7168b) {
            return new HX(hz);
        }
        return new HX(hz, new HZ(j11, j12));
    }

    public static /* synthetic */ JO A08(JO jo) {
        return jo;
    }

    private void A0A() {
        this.A04 = 0;
        this.A00 = 0;
    }

    private void A0B() {
        if (this.A02 == 2 && (this.A0I & 2) != 0) {
            this.A0E.AKS(0, 4).A6e(new C06112p().A0v(this.A0F == null ? null : new Metadata(this.A0F)).A14());
            this.A0E.A6O();
            this.A0E.AJ7(new C2206mn(b.f7168b));
        }
    }

    private void A0D(long j6) throws C3K {
        while (!this.A0O.isEmpty() && this.A0O.peek().A00 == j6) {
            C2183mE pop = this.A0O.pop();
            if (((AbstractC1009Iu) pop).A00 == 1836019574) {
                A0G(pop);
                this.A0O.clear();
                this.A04 = 2;
            } else if (!this.A0O.isEmpty()) {
                C2183mE containerAtom = this.A0O.peek();
                containerAtom.A08(pop);
            }
        }
        if (this.A04 != 2) {
            A0A();
        }
    }

    private void A0E(long j6) {
        if (this.A01 == 1836086884) {
            this.A0F = new MotionPhotoMetadata(0L, j6, b.f7168b, j6 + this.A00, this.A09 - this.A00);
        }
    }

    private void A0F(InterfaceC2211ms interfaceC2211ms) throws IOException {
        this.A0M.A0d(8);
        interfaceC2211ms.AGt(this.A0M.A0l(), 0, 8);
        J0.A0Q(this.A0M);
        interfaceC2211ms.AK3(this.A0M.A09());
        interfaceC2211ms.AIl();
    }

    /* JADX WARN: Incorrect condition in loop: B:55:0x0138 */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Adding average bitrate calculation logic")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0G(C2183mE c2183mE) throws C3K {
        int i;
        int i4 = -1;
        long j6 = b.f7168b;
        long j9 = b.f7168b;
        long j10 = b.f7168b;
        List<Mp4Extractor.Mp4Track> tracks = new ArrayList<>();
        Metadata udtaMetaMetadata = null;
        Metadata metadata = null;
        boolean z6 = this.A02 == 1;
        HK hk = new HK();
        C2182mD A07 = c2183mE.A07(1969517665);
        if (A07 != null) {
            Pair<Metadata, Metadata> A0A = J0.A0A(A07);
            udtaMetaMetadata = (Metadata) A0A.first;
            metadata = (Metadata) A0A.second;
            if (udtaMetaMetadata != null) {
                hk.A05(udtaMetaMetadata);
            }
        }
        Metadata metadata2 = null;
        C2183mE A06 = c2183mE.A06(1835365473);
        if (A06 != null) {
            metadata2 = J0.A0F(A06);
        }
        List<JR> A0O = J0.A0O(c2183mE, hk, b.f7168b, null, (this.A0I & 1) != 0, z6, new InterfaceC2071kO() { // from class: com.facebook.ads.redexgen.X.m5
            @Override // com.instagram.common.viewpoint.core.InterfaceC2071kO
            public final Object A4B(Object obj) {
                return C2172m3.A08((JO) obj);
            }
        });
        int trackCount = A0O.size();
        for (int i6 = 0; i6 < trackCount; i6++) {
            JR jr = A0O.get(i6);
            int trackCount2 = jr.A01;
            if (trackCount2 == 0) {
                int i9 = A0R[1].charAt(1);
                if (i9 != 98) {
                    throw new RuntimeException();
                }
                A0R[1] = "ibvFTefsgA7pkzOq8AzNcMz9gVb8PR75";
            } else {
                JO track = jr.A03;
                HA ha = this.A0E;
                int trackCount3 = track.A03;
                JE je = new JE(track, jr, ha.AKS(i6, trackCount3));
                long j11 = track.A04 != b.f7168b ? track.A04 : jr.A02;
                j6 = Math.max(j6, j11);
                if (1 == track.A03) {
                    j10 = j11;
                } else if (2 == track.A03) {
                    j9 = j11;
                }
                if (A09(75, 13, 125).equals(track.A07.A0W)) {
                    int i10 = jr.A00;
                    if (A0R[6].length() != 29) {
                        throw new RuntimeException();
                    }
                    A0R[6] = "30Puiqoz9JCJMsN9BhlLDaWtr32u3";
                    i = i10 * 16;
                } else {
                    i = jr.A00 + 30;
                }
                C06112p formatBuilder = track.A07.A07();
                formatBuilder.A0h(i);
                if (track.A03 == 2 && j11 > 0 && jr.A01 > 1) {
                    formatBuilder.A0X(jr.A01 / (j11 / 1000000.0f));
                }
                if (j6 > 0 && jr.A01 > 0) {
                    int i11 = jr.A05.length;
                    if (i11 == jr.A01) {
                        long j12 = 0;
                        for (int i12 = 0; i12 < sampleIndex; i12++) {
                            int sampleIndex = jr.A05[i12];
                            j12 += sampleIndex;
                        }
                        formatBuilder.A0a((int) ((8000000 * j12) / j6));
                    }
                }
                int i13 = track.A03;
                JB.A0D(i13, hk, formatBuilder);
                int i14 = track.A03;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.A0P.isEmpty() ? null : new Metadata(this.A0P);
                JB.A0C(i14, udtaMetaMetadata, metadata2, formatBuilder, metadataArr);
                je.A01.A6e(formatBuilder.A14());
                int i15 = track.A03;
                if (i15 == 2 && i4 == -1) {
                    i4 = tracks.size();
                }
                tracks.add(je);
            }
        }
        this.A03 = i4;
        this.A0B = j6;
        this.A0C = j9;
        this.A0A = j10;
        this.A0G = (JE[]) tracks.toArray(new JE[0]);
        this.A0H = A0N(this.A0G);
        this.A0E.A6O();
        this.A0E.AJ7(this);
    }

    private void A0H(JE je, long j6) {
        JR jr = je.A04;
        int sampleIndex = jr.A00(j6);
        if (sampleIndex == -1) {
            sampleIndex = jr.A01(j6);
        }
        je.A00 = sampleIndex;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[2] = "DxqZc2lJMNLNZhW19Xb8kO";
    }

    public static boolean A0I(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r4 != 1937007471) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r4 == 1668232756) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (r4 == 1953196132) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        if (r4 == 1718909296) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        if (r4 == 1969517665) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        if (r4 == 1801812339) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
    
        if (r4 != 1768715124) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        if (r4 != 1937007471) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0J(int i) {
        if (i != 1835296868 && i != 1836476516) {
            if (A0R[4].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A0R;
            strArr[3] = "UHuXZ9PGVGxrhu";
            strArr[7] = "Sv1JTBT1egKeuo";
            if (i != 1751411826 && i != 1937011556 && i != 1937011827 && i != 1937011571 && i != 1668576371 && i != 1701606260 && i != 1937011555 && i != 1937011578 && i != 1937013298) {
                if (A0R[2].length() != 19) {
                    A0R[6] = "0EWWhWMRQ7MgS85x4CKboIorprSqD";
                }
            }
        }
        return true;
    }

    private boolean A0K(InterfaceC2211ms interfaceC2211ms) throws IOException {
        C2183mE containerAtom;
        if (this.A00 == 0) {
            if (!interfaceC2211ms.AHR(this.A0J.A0l(), 0, 8, true)) {
                A0B();
                return false;
            }
            this.A00 = 8;
            this.A0J.A0f(0);
            this.A09 = this.A0J.A0Q();
            this.A01 = this.A0J.A0C();
        }
        if (this.A09 == 1) {
            if (A0R[2].length() == 19) {
                throw new RuntimeException();
            }
            A0R[2] = "uEfPCG8cZZkUCN4sq";
            interfaceC2211ms.readFully(this.A0J.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A09 = this.A0J.A0R();
        } else if (this.A09 == 0) {
            long A8O = interfaceC2211ms.A8O();
            if (A8O == -1 && (containerAtom = this.A0O.peek()) != null) {
                A8O = containerAtom.A00;
            }
            if (A8O != -1) {
                this.A09 = (A8O - interfaceC2211ms.A8n()) + this.A00;
            }
        }
        if (this.A09 >= this.A00) {
            if (A0I(this.A01)) {
                long A8n = (interfaceC2211ms.A8n() + this.A09) - this.A00;
                if (this.A09 != this.A00 && this.A01 == 1835365473) {
                    A0F(interfaceC2211ms);
                }
                this.A0O.push(new C2183mE(this.A01, A8n));
                if (this.A09 == this.A00) {
                    A0D(A8n);
                } else {
                    A0A();
                }
            } else if (A0J(this.A01)) {
                AbstractC06443y.A08(this.A00 == 8);
                AbstractC06443y.A08(this.A09 <= 2147483647L);
                C06674v c06674v = new C06674v((int) this.A09);
                C06674v atomData = this.A0J;
                System.arraycopy(atomData.A0l(), 0, c06674v.A0l(), 0, 8);
                this.A0D = c06674v;
                this.A04 = 1;
            } else {
                A0E(interfaceC2211ms.A8n() - this.A00);
                this.A0D = null;
                this.A04 = 1;
            }
            return true;
        }
        throw C3K.A00(A09(0, 48, 61));
    }

    private boolean A0L(InterfaceC2211ms interfaceC2211ms, HV hv) throws IOException {
        long j6 = this.A09 - this.A00;
        long atomEndPosition = interfaceC2211ms.A8n() + j6;
        boolean z6 = false;
        C06674v c06674v = this.A0D;
        if (c06674v != null) {
            interfaceC2211ms.readFully(c06674v.A0l(), this.A00, (int) j6);
            if (this.A01 == 1718909296) {
                this.A02 = A02(c06674v);
            } else if (!this.A0O.isEmpty()) {
                this.A0O.peek().A09(new C2182mD(this.A01, c06674v));
            }
        } else if (j6 < 262144) {
            interfaceC2211ms.AK3((int) j6);
        } else {
            long atomPayloadSize = interfaceC2211ms.A8n();
            hv.A00 = atomPayloadSize + j6;
            z6 = true;
        }
        A0D(atomEndPosition);
        return z6 && this.A04 != 2;
    }

    public static /* synthetic */ H9[] A0M() {
        return new H9[]{new C2172m3()};
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long[][] A0N(JE[] jeArr) {
        long[][] jArr = new long[jeArr.length][];
        int[] iArr = new int[jeArr.length];
        long[] jArr2 = new long[jeArr.length];
        boolean[] tracksFinished = new boolean[jeArr.length];
        for (int i = 0; i < jeArr.length; i++) {
            jArr[i] = new long[jeArr[i].A04.A01];
            jArr2[i] = jeArr[i].A04.A07[0];
        }
        long j6 = 0;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[1] = "qbCXFrWy43oBbJoUYfYqc11BUuHVPZxe";
        int i4 = 0;
        while (i4 < jeArr.length) {
            long j9 = Long.MAX_VALUE;
            int i6 = -1;
            for (int minTimeTrackIndex = 0; minTimeTrackIndex < jeArr.length; minTimeTrackIndex++) {
                boolean z6 = tracksFinished[minTimeTrackIndex];
                if (A0R[6].length() != 29) {
                    A0R[2] = "AIMWoJADevTWezna7TxcWd";
                    if (z6) {
                    }
                    if (jArr2[minTimeTrackIndex] > j9) {
                        i6 = minTimeTrackIndex;
                        j9 = jArr2[minTimeTrackIndex];
                    }
                } else {
                    String[] strArr = A0R;
                    strArr[3] = "DkVrMcHnnNdNTj";
                    strArr[7] = "McjqbXJyC3Esle";
                    if (z6) {
                    }
                    if (jArr2[minTimeTrackIndex] > j9) {
                    }
                }
            }
            int i9 = iArr[i6];
            jArr[i6][i9] = j6;
            j6 += jeArr[i6].A04.A05[i9];
            int i10 = i9 + 1;
            iArr[i6] = i10;
            if (i10 < jArr[i6].length) {
                JE je = jeArr[i6];
                if (A0R[1].charAt(1) != 'b') {
                    jArr2[i6] = je.A04.A07[i10];
                } else {
                    String[] strArr2 = A0R;
                    strArr2[5] = "FttiEMkEmxvjjK7";
                    strArr2[0] = "cOA5C";
                    jArr2[i6] = je.A04.A07[i10];
                }
            } else {
                tracksFinished[i6] = true;
                i4++;
            }
        }
        return jArr;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j6) {
        return A07(j6, -1);
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AAC(HA ha) {
        this.A0E = ha;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final int AHL(InterfaceC2211ms interfaceC2211ms, HV hv) throws IOException {
        while (true) {
            switch (this.A04) {
                case 0:
                    if (!A0K(interfaceC2211ms)) {
                        return -1;
                    }
                    break;
                case 1:
                    if (!A0L(interfaceC2211ms, hv)) {
                        break;
                    } else {
                        return 1;
                    }
                case 2:
                    return A03(interfaceC2211ms, hv);
                case 3:
                    return A04(interfaceC2211ms, hv);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AJ6(long j6, long j9) {
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j6 == 0) {
            int i = this.A04;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0R;
            strArr2[3] = "BBO5nGzNDCjhdG";
            strArr2[7] = "Qq9RZt6cBQ724Z";
            if (i != 3) {
                A0A();
                return;
            } else {
                this.A0N.A08();
                this.A0P.clear();
                return;
            }
        }
        for (JE je : this.A0G) {
            A0H(je, j9);
            if (je.A02 != null) {
                je.A02.A02();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final boolean AK5(InterfaceC2211ms interfaceC2211ms) throws IOException {
        return JM.A02(interfaceC2211ms, (this.A0I & 2) != 0);
    }
}
