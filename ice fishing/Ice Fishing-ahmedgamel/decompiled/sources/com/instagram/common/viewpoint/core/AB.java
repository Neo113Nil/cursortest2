package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.anythink.basead.exoplayer.b;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomizations;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: assets/audience_network/classes2.dex */
public final class AB implements Handler.Callback, InterfaceC2270nq, InterfaceC0908Ev, InterfaceC0857Cw, C6P, InterfaceC07257b {
    public static byte[] A0x;
    public static String[] A0y = {"EvYOBb0fNCsu7OcAaOZNwoEPwn2", "8jIqnMhTOhQ3fU", "vmW", "edZR1F4oYcKYyzs7tUfX3dHGMGqqrKBY", "TI8UsWNSVk9Jh7srInWeHwVEqkc209d4", "AVB8fiMNMM9Dy8Zuh880FwllBoFt5PF1", "1mkHXRje2n0Pvvw2j", "LF2w13BN71krhrKRtprOb2x3jYcy1FYO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A06;
    public C07076j A07;
    public C07116n A08;
    public C7Z A0A;

    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public InterfaceC2329oo A0B;
    public C07447u A0C;
    public InterfaceC0858Cx A0D;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0K;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public InterfaceC2329oo[] A0W;
    public final long A0Y;
    public final long A0Z;
    public final Handler A0a;
    public final HandlerThread A0b;
    public final C2387pl A0c;
    public final C2385pj A0d;
    public final AnonymousClass45 A0e;
    public final C4X A0f;
    public final C2337ow A0g;
    public final C07106m A0h;
    public final AnonymousClass74 A0i;
    public final C2325ok A0k;
    public final AbstractC0909Ew A0l;
    public final C0910Ex A0m;
    public final F6 A0n;
    public final C07769g A0o;
    public final ArrayList<C07096l> A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final InterfaceC2329oo[] A0v;
    public final InterfaceC07397p[] A0w;
    public long A05 = b.f7168b;

    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public EnumC1986ir A0E = EnumC1986ir.A09;

    @MetaExoPlayerCustomization("D63737392: Added for negative testing")
    public boolean A0J = false;

    @MetaExoPlayerCustomization("D63737392: Added for negative testing")
    public C7W A09 = null;

    @MetaExoPlayerCustomization("D63737392: Added for negative testing")
    public boolean A0L = false;

    @MetaExoPlayerCustomization("D71523094: Added for negative testing")
    public Integer A0F = null;
    public final C7E A0j = new C7E();

    @MetaExoPlayerCustomization
    public final int A0X = A00();

    public static String A0D(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0x, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            byte b9 = copyOfRange[i9];
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[2] = "wOV";
            strArr[6] = "lGv9KfQpa0xBFnWlu";
            copyOfRange[i9] = (byte) ((b9 - i6) - 57);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x037e, code lost:
    
        if (r3 == 1) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0380, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0393, code lost:
    
        if (r3 == 1) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03ab, code lost:
    
        r24.A0R = r24.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03bb, code lost:
    
        if (com.instagram.common.viewpoint.core.AB.A0y[5].charAt(1) == 'q') goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03bd, code lost:
    
        r2 = com.instagram.common.viewpoint.core.AB.A0y;
        r2[4] = "Uyz0TdICBPSSMiRUHh3H6S4m2yqjGOAg";
        r2[3] = "3B1Lhsj2yRloVQBWBzqqqLZ9kauiXzuH";
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03cb, code lost:
    
        if (r24.A0B == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03d4, code lost:
    
        if (r24.A0B.A9N() != 1) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03d6, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03d7, code lost:
    
        A0W(2, r8);
        A0O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x044b, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        if (r7 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
    
        if (r24.A0A.A0C == (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        r16 = com.instagram.common.viewpoint.core.C2Y.A01(r24.A0A.A0C - r24.A0A.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
    
        if (com.instagram.common.viewpoint.core.AB.A0y[7].charAt(12) == '2') goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
    
        com.instagram.common.viewpoint.core.AB.A0y[5] = "BlhxJ9uFvDlxNeph5MIqggmIWIv4QApO";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f2, code lost:
    
        if (r16 <= 1000) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0210, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01bc, code lost:
    
        if (r7 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01dc, code lost:
    
        if (r24.A0H != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01de, code lost:
    
        r8 = r9.A9p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ef, code lost:
    
        if (com.instagram.common.viewpoint.core.AB.A0y[7].charAt(12) == '2') goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01f1, code lost:
    
        com.instagram.common.viewpoint.core.AB.A0y[5] = "gun24np1Fz9ULZxkMCl3omnFVmny067U";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01f8, code lost:
    
        if (r8 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0216, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fa, code lost:
    
        r9.AJN();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0201, code lost:
    
        if (r24.A0H != false) goto L82;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 25
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f7  */
    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0F() throws AD, IOException {
        String[] strArr;
        long AKe = this.A0e.AKe();
        A0P();
        if (!this.A0j.A0N()) {
            A0I();
            A0a(AKe, 10L);
            return;
        }
        C7A A0F = this.A0j.A0F();
        C7A A0G = this.A0j.A0G();
        AnonymousClass54.A02(A0D(353, 10, 65));
        A0Q();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        A0F.A07.A60(this.A0A.A0C - this.A0Y, this.A0r);
        boolean z6 = false;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = this.A0W.length > 1;
        InterfaceC2329oo[] interfaceC2329ooArr = this.A0W;
        int length = interfaceC2329ooArr.length;
        int i = 0;
        while (true) {
            String A0D = A0D(223, 35, 31);
            String A0D2 = A0D(0, 21, 22);
            if (i < length) {
                InterfaceC2329oo interfaceC2329oo = interfaceC2329ooArr[i];
                interfaceC2329oo.AIX(this.A06, elapsedRealtime);
                if (A0G.A00.A05) {
                    boolean z12 = this.A0O;
                    if (A0y[0].length() == 16) {
                        break;
                    }
                    String[] strArr2 = A0y;
                    strArr2[4] = "S4Fyq0ZfVTRLxRTM4wwKz81RK4qT5SRq";
                    strArr2[3] = "dt9NVxX1YAgTPnpY37Axx0Ou68rzEGgN";
                    if (z12) {
                        if (!interfaceC2329oo.A9p()) {
                            boolean z13 = this.A0H;
                            if (A0y[0].length() != 16) {
                                A0y[5] = "eiShONRNAduVJjGMnbACFBBBapCf3AHm";
                            } else {
                                String[] strArr3 = A0y;
                                strArr3[4] = "JgPz5rm3gJhJD0DUOH89UMmPp4ssm19B";
                                strArr3[3] = "EHDY1dQAFQsMAYBzgGAEpHtmXIGNI89a";
                            }
                        }
                        interfaceC2329oo.AJN();
                    } else if (A0y[5].charAt(1) != 'q') {
                        String[] strArr4 = A0y;
                        strArr4[4] = "usLdHWXdVdc1eYm8Xo8iItMQczfdPoTF";
                        strArr4[3] = "jdYe6RXL6unoORbHA5yicze0YAqR3j0n";
                    }
                }
                if (!(interfaceC2329oo instanceof C05731b)) {
                    z11 = z11 && interfaceC2329oo.AAP();
                }
                z9 = z9 && interfaceC2329oo.AAP();
                boolean z14 = interfaceC2329oo.AAe() || interfaceC2329oo.AAP() || A17(interfaceC2329oo);
                if (!z14) {
                    z6 = true;
                    try {
                        interfaceC2329oo.ACU();
                    } catch (C2346p5 e9) {
                        if (!e9.getClass().equals(C2346p5.class)) {
                            throw e9;
                        }
                        if (!this.A0N) {
                            throw e9;
                        }
                        if (this.A05 == b.f7168b) {
                            Log.w(A0D2, A0D + e9.getMessage());
                            this.A05 = System.currentTimeMillis();
                            if (this.A0q) {
                                this.A0a.obtainMessage(4, e9).sendToTarget();
                            }
                        } else if (System.currentTimeMillis() - this.A05 > this.A0Z) {
                            throw e9;
                        }
                    }
                    this.A0B = interfaceC2329oo;
                    if (A0y[7].charAt(12) == '2') {
                        break;
                    } else {
                        A0y[5] = "qlbqZn2WmIl9Oup3QtCZToOsAISM7SD4";
                    }
                }
                z10 = z10 && z14;
                i++;
            } else {
                if (!z10) {
                    A0I();
                }
                if (this.A0Q && z11 && !z9) {
                    for (InterfaceC2329oo interfaceC2329oo2 : this.A0W) {
                        if (interfaceC2329oo2 instanceof C05731b) {
                            interfaceC2329oo2.AIX(9223372036854775806L, 9223372036854775806L);
                            z9 = interfaceC2329oo2.AAP();
                        }
                    }
                }
                long j6 = A0F.A00.A00;
                boolean z15 = false;
                if (z9 && (j6 == b.f7168b || j6 <= this.A0A.A0C)) {
                    C7B c7b = A0F.A00;
                    String[] strArr5 = A0y;
                    if (strArr5[2].length() == strArr5[6].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0y;
                    strArr6[2] = "uQd";
                    strArr6[6] = "zdLpoimG1uHaXVEOP";
                    if (c7b.A05) {
                        A0V(4);
                        A0O();
                        if (this.A0A.A00 == 2) {
                            for (InterfaceC2329oo interfaceC2329oo3 : this.A0W) {
                                z6 = true;
                                try {
                                    interfaceC2329oo3.ACU();
                                } catch (C2346p5 e10) {
                                    if (!e10.getClass().equals(C2346p5.class)) {
                                        throw e10;
                                    }
                                    boolean z16 = this.A0N;
                                    if (A0y[1].length() != 31) {
                                        A0y[0] = "ROTBjRrt9pmtd4l9PrsJpq4cigEOLmNk";
                                        if (!z16) {
                                            throw e10;
                                        }
                                        if (this.A05 == b.f7168b) {
                                            long currentTimeMillis = System.currentTimeMillis() - this.A05;
                                            long j9 = this.A0Z;
                                            if (A0y[5].charAt(1) != 'q') {
                                                A0y[1] = "nYRcp";
                                                if (currentTimeMillis <= j9) {
                                                }
                                            } else {
                                                A0y[0] = "0hUy";
                                                if (currentTimeMillis <= j9) {
                                                }
                                            }
                                            throw e10;
                                        }
                                        Log.w(A0D2, A0D + e10.getMessage());
                                        this.A05 = System.currentTimeMillis();
                                        if (this.A0q) {
                                            this.A0a.obtainMessage(4, e10).sendToTarget();
                                        }
                                    } else {
                                        if (!z16) {
                                            throw e10;
                                        }
                                        if (this.A05 == b.f7168b) {
                                        }
                                    }
                                }
                            }
                        }
                        boolean z17 = this.A0P;
                        strArr = A0y;
                        if (strArr[4].charAt(1) != strArr[3].charAt(1)) {
                            A0y[0] = "CfnO3oWhmhBZYFdKQQ3";
                            if ((z17 && this.A0A.A00 == 3) || this.A0A.A00 == 2) {
                                A0a(AKe, this.A0X);
                            } else if (this.A0W.length == 0 || this.A0A.A00 == 4) {
                                this.A0f.AIT(2);
                            } else {
                                A0a(AKe, 1000L);
                            }
                            if (!z6) {
                                this.A05 = b.f7168b;
                            }
                            AnonymousClass54.A00();
                            return;
                        }
                    }
                }
                if (this.A0A.A00 == 2 && A19(z10)) {
                    if (this.A0J && !this.A0L) {
                        this.A0L = true;
                        this.A0F = A0B();
                        if (this.A0F != null && this.A0F.intValue() > 0) {
                            A0a(AKe, this.A0F.intValue());
                            return;
                        }
                    }
                    if (this.A0B != null) {
                        int A9N = this.A0B.A9N();
                        if (A0y[5].charAt(1) != 'q') {
                            A0y[1] = "FUTTGuZgInj0HgAB4TKGqFNOnZ8TLHiw";
                        }
                    }
                    A0t(this.A0E, z15);
                    if (this.A0P) {
                        A0N();
                    }
                    this.A0B = null;
                } else if (this.A0A.A00 == 3) {
                    if (this.A0W.length == 0) {
                    }
                }
                if (this.A0A.A00 == 2) {
                }
                boolean z172 = this.A0P;
                strArr = A0y;
                if (strArr[4].charAt(1) != strArr[3].charAt(1)) {
                }
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0P() throws AD, IOException {
        if (this.A0D == null) {
            return;
        }
        if (this.A02 > 0) {
            this.A0D.ACT();
            return;
        }
        A0J();
        C7A A0E = this.A0j.A0E();
        if (A0E != null && !A0E.A0R()) {
            boolean z6 = this.A0A.A0A;
            if (A0y[1].length() != 31) {
                A0y[5] = "JakbFE5sCqyiHPWhcmq5QKrahWaBlD8R";
                if (!z6) {
                    A0w(false);
                }
            }
            throw new RuntimeException();
        }
        A0y(false);
        if (this.A0j.A0N()) {
            C7A A0F = this.A0j.A0F();
            C7A A0G = this.A0j.A0G();
            boolean z9 = false;
            while (this.A0P && A0F != A0G && this.A06 >= A0F.A0I().A0H(this.A0K)) {
                if (z9) {
                    A0H();
                }
                int i = A0F.A00.A07 ? 0 : 3;
                C7A c7a = A0F;
                A0F = this.A0j.A0B();
                A0g(c7a);
                C7Z c7z = this.A0A;
                C2268no c2268no = A0F.A00.A04;
                long j6 = A0F.A00.A03;
                if (A0y[7].charAt(12) == '2') {
                    throw new RuntimeException();
                }
                String[] strArr = A0y;
                strArr[4] = "OGZbExKcucXIKKZQBdHGOATJ9dYdrwhN";
                strArr[3] = "TJxPjvISq11gHqp4fguKhlEOGAavfVmH";
                this.A0A = c7z.A06(c2268no, j6, A0F.A00.A02, A01());
                this.A0h.A04(i);
                A0Q();
                z9 = true;
            }
            C7B c7b = A0G.A00;
            String[] strArr2 = A0y;
            if (strArr2[4].charAt(1) != strArr2[3].charAt(1)) {
                A0y[7] = "WHxPanRASNJPtq4bnE3dJm5Kco7OvEcN";
                if (c7b.A05) {
                    for (int i4 = 0; i4 < this.A0v.length; i4++) {
                        InterfaceC2329oo interfaceC2329oo = this.A0v[i4];
                        DT dt = A0G.A09[i4];
                        if (dt != null && interfaceC2329oo.A9D() == dt && interfaceC2329oo.A9p()) {
                            interfaceC2329oo.AJN();
                        }
                    }
                    return;
                }
                if (A0G.A0I() == null) {
                    return;
                }
                C7A A0I = A0G.A0I();
                String[] strArr3 = A0y;
                if (strArr3[4].charAt(1) != strArr3[3].charAt(1)) {
                    A0y[7] = "aMxVvZtAQBe9jxU0Z4NX1LXmsoJEfXr7";
                    if (A0I.A02) {
                        for (int i6 = 0; i6 < this.A0v.length; i6++) {
                            InterfaceC2329oo interfaceC2329oo2 = this.A0v[i6];
                            DT dt2 = A0G.A09[i6];
                            if (interfaceC2329oo2.A9D() != dt2) {
                                return;
                            }
                            if (dt2 != null && !interfaceC2329oo2.A9p()) {
                                return;
                            }
                        }
                        C0910Ex A0K = A0G.A0K();
                        C7A A0C = this.A0j.A0C();
                        C0910Ex A0K2 = A0C.A0K();
                        boolean z10 = A0C.A07.AHQ() != b.f7168b;
                        for (int i9 = 0; i9 < this.A0v.length; i9++) {
                            InterfaceC2329oo interfaceC2329oo3 = this.A0v[i9];
                            if (A0K.A00(i9)) {
                                if (z10) {
                                    interfaceC2329oo3.AJN();
                                } else {
                                    boolean AAN = interfaceC2329oo3.AAN();
                                    if (A0y[0].length() != 16) {
                                        A0y[1] = "9mAYXkFxI0mZazBGslnkswropOC4T";
                                        if (AAN) {
                                            continue;
                                        }
                                        InterfaceC2232nE interfaceC2232nE = A0K2.A04[i9];
                                        boolean A00 = A0K2.A00(i9);
                                        boolean z11 = this.A0w[i9].A9N() != -2;
                                        C07427s c07427s = A0K.A03[i9];
                                        C07427s c07427s2 = A0K2.A03[i9];
                                        if (A0y[1].length() != 31) {
                                            throw new RuntimeException();
                                        }
                                        A0y[1] = "R6UwS9N6ly40SGlMhcEQ765TyuQep";
                                        if (A00 && c07427s2.equals(c07427s) && !z11) {
                                            C2420qI[] A1A = A1A(interfaceC2232nE);
                                            Log.e(A0D(0, 21, 22), A0D(392, 13, 67));
                                            interfaceC2329oo3.AIa(A1A, A0C.A09[i9], A0C.A0H(this.A0K), A0C.A0B());
                                        } else {
                                            interfaceC2329oo3.AJN();
                                        }
                                    } else {
                                        A0y[0] = "RavyRccOc8FddTyMpAZEZ";
                                        if (AAN) {
                                            continue;
                                        }
                                        InterfaceC2232nE interfaceC2232nE2 = A0K2.A04[i9];
                                        boolean A002 = A0K2.A00(i9);
                                        if (this.A0w[i9].A9N() != -2) {
                                        }
                                        C07427s c07427s3 = A0K.A03[i9];
                                        C07427s c07427s22 = A0K2.A03[i9];
                                        if (A0y[1].length() != 31) {
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            throw new RuntimeException();
        }
    }

    public static void A0R() {
        A0x = new byte[]{-108, -57, -66, -97, -69, -80, -56, -76, -63, -104, -68, -65, -69, -104, -67, -61, -76, -63, -67, -80, -69, -15, 36, 27, -4, 24, 13, 37, 17, 30, -11, 25, 28, 24, -11, 26, 32, 17, 30, 26, 13, 24, -26, -12, 13, 26, 16, 24, 17, 30, -87, -57, -50, -49, -46, -55, -50, -57, c.f17103a, -51, -59, -45, -45, -63, -57, -59, -45, c.f17103a, -45, -59, -50, -44, c.f17103a, -63, -58, -44, -59, -46, c.f17103a, -46, -59, -52, -59, -63, -45, -59, -114, -107, -70, -64, -79, -66, -70, -83, -72, 108, -66, -63, -70, -64, -75, -71, -79, 108, -79, -66, -66, -69, -66, 122, -54, -26, -37, -13, -36, -37, -35, -27, -102, -33, -20, -20, -23, -20, -88, -114, -86, -97, -73, -96, -97, -95, -87, -114, -83, -79, -89, -78, -89, -83, -84, -117, -79, 120, 94, 99, -94, 106, 94, -96, -77, -92, -92, -93, -80, -93, -94, -126, -77, -80, -97, -78, -89, -83, -84, -117, -79, 120, 94, 99, -94, 106, 94, -84, -93, -74, -78, -118, -83, -97, -94, -114, -83, -79, -89, -78, -89, -83, -84, -117, -79, 120, 94, 99, -94, -76, -48, -42, -45, -60, -58, -127, -58, -45, -45, -48, -45, -113, -72, -39, -44, -43, -123, -53, -58, -50, -47, -54, -55, -109, -78, -97, -91, -84, -67, -59, -56, -57, -54, -71, -54, -63, -60, -47, 120, -63, -65, -58, -57, -54, -63, -58, -65, 120, -53, -52, -54, -67, -71, -59, 120, -67, -54, -54, -57, -54, -110, 120, -108, -78, -71, -87, -82, -89, 96, -76, -81, 96, -77, -91, -82, -92, 96, -83, -91, -77, -77, -95, -89, -91, 96, -81, -82, 96, -95, 96, -92, -91, -95, -92, 96, -76, -88, -78, -91, -95, -92, 110, 5, 30, 21, 40, 32, 21, 19, 36, 21, 20, -48, 21, 34, 34, 31, 34, -48, 20, 21, 28, 25, 38, 21, 34, 25, 30, 23, -48, 29, 21, 35, 35, 17, 23, 21, -48, 31, 30, -48, 21, 40, 36, 21, 34, 30, 17, 28, -48, 36, 24, 34, 21, 17, 20, -34, -34, -23, -51, -23, -25, -33, -47, -23, -20, -27, 37, 29, 28, 33, 25, 8, 29, 42, 33, 39, 28, 1, 28, -70, -81, -68, -77, -71, -82, -102, -71, -67, -77, -66, -77, -71, -72, -97, -67, -18, -31, -20, -24, -35, -33, -31, -49, -16, -18, -31, -35, -23};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0231, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0233, code lost:
    
        r14.A0A = r14.A0A.A06(r3, A06(r3, r1), r10, A01());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0244, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0245, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0250, code lost:
    
        r9 = r14.A0j;
        r3 = r14.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025f, code lost:
    
        if (com.instagram.common.viewpoint.core.AB.A0y[1].length() == 31) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0261, code lost:
    
        r6 = com.instagram.common.viewpoint.core.AB.A0y;
        r6[4] = "30gHr5wufVP7jVH5IRZCDYCZy2V5u0Zf";
        r6[3] = "xPVmpg9j3VPOmOyowbQUJ4kDfZKAMzov";
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0271, code lost:
    
        if (r9.A0Q(r5, r8, r3) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0273, code lost:
    
        A0x(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0276, code lost:
    
        A0v(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0279, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027f, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024d, code lost:
    
        if (r8.A00() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0219, code lost:
    
        if (r8.A00() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021b, code lost:
    
        r3 = r14.A0j.A0K(r5, java.lang.Integer.valueOf(r4), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0229, code lost:
    
        if (r3.equals(r8) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022f, code lost:
    
        if (r3.A00() == false) goto L91;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0e(C07086k c07086k) throws AD {
        C2268no c2268no;
        if (c07086k.A01 != this.A0D) {
            return;
        }
        Timeline timeline = this.A0A.A03;
        Timeline timeline2 = c07086k.A00;
        this.A0A = this.A0A.A04(timeline2);
        A0M();
        if (this.A02 > 0) {
            this.A0h.A03(this.A02);
            this.A02 = 0;
            if (this.A08 != null) {
                Pair<Object, Long> A09 = A09(this.A08, true);
                this.A08 = null;
                if (A09 == null) {
                    A0G();
                    return;
                }
                Object obj = A09.first;
                long longValue = ((Long) A09.second).longValue();
                C2268no A0K = this.A0j.A0K(timeline2, obj, longValue);
                this.A0A = this.A0A.A06(A0K, A0K.A00() ? 0L : longValue, longValue, this.A0A.A0D);
                return;
            }
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[2] = "O4I";
            strArr[6] = "ahZa31gq0LeVPqA4e";
            if (0 != 0) {
                throw new NullPointerException(A0D(376, 16, 17));
            }
            if (this.A0A.A02 == b.f7168b) {
                if (timeline2.A0N()) {
                    A0G();
                    return;
                }
                Pair<Object, Long> A08 = A08(timeline2, timeline2.A0B(this.A0V), b.f7168b);
                Object obj2 = A08.first;
                long longValue2 = ((Long) A08.second).longValue();
                C2268no A0K2 = this.A0j.A0K(timeline2, obj2, longValue2);
                C7Z c7z = this.A0A;
                String[] strArr2 = A0y;
                if (strArr2[2].length() == strArr2[6].length()) {
                    throw new RuntimeException();
                }
                A0y[0] = "JR6dPBbFHW2aBR0iQ91GP51A";
                this.A0A = c7z.A06(A0K2, A0K2.A00() ? 0L : longValue2, longValue2, this.A0A.A0D);
                return;
            }
            return;
        }
        Object obj3 = this.A0A.A05.A04;
        long j6 = this.A0A.A01;
        if (timeline.A0N()) {
            if (timeline2.A0N()) {
                return;
            }
            C2268no A0K3 = this.A0j.A0K(timeline2, obj3, j6);
            this.A0A = this.A0A.A06(A0K3, A0K3.A00() ? 0L : j6, j6, this.A0A.A0D);
            return;
        }
        C7A A0D = this.A0j.A0D();
        Object obj4 = A0D == null ? this.A0A.A05.A04 : A0D.A08;
        int A0A = timeline2.A0A(obj4);
        if (A0A == -1) {
            Object A0C = A0C(obj4, timeline, timeline2);
            if (A0C == null) {
                A0G();
                return;
            }
            Pair<Object, Long> A082 = A08(timeline2, timeline2.A0J(A0C, this.A0c).A00, b.f7168b);
            Object obj5 = A082.first;
            long longValue3 = ((Long) A082.second).longValue();
            C2268no A0K4 = this.A0j.A0K(timeline2, obj5, longValue3);
            if (A0D != null) {
                while (A0D.A0I() != null) {
                    A0D = A0D.A0I();
                    if (A0D.A00.A04.equals(A0K4)) {
                        C7E c7e = this.A0j;
                        String[] strArr3 = A0y;
                        if (strArr3[4].charAt(1) != strArr3[3].charAt(1)) {
                            A0y[0] = "lm8nmDAIswUHpj0OrSP7ctv";
                            A0D.A00 = c7e.A0I(timeline2, A0D.A00);
                        } else {
                            A0D.A00 = c7e.A0I(timeline2, A0D.A00);
                        }
                    }
                }
            }
            long A06 = A06(A0K4, A0K4.A00() ? 0L : longValue3);
            C7Z c7z2 = this.A0A;
            long A01 = A01();
            String[] strArr4 = A0y;
            if (strArr4[4].charAt(1) == strArr4[3].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0y;
            strArr5[2] = "HJD";
            strArr5[6] = "HIUAzKTwmQi0tOVOF";
            this.A0A = c7z2.A06(A0K4, A06, longValue3, A01);
            return;
        }
        C7Z c7z3 = this.A0A;
        String[] strArr6 = A0y;
        if (strArr6[4].charAt(1) != strArr6[3].charAt(1)) {
            String[] strArr7 = A0y;
            strArr7[4] = "QYIV2IuM2tD6Cg4Dd0tvfiQK4IQ6icHf";
            strArr7[3] = "hXYkHU7O6zP410ynmzMqamHjkcWcTxII";
            c2268no = c7z3.A05;
        } else {
            c2268no = c7z3.A05;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0f(C07116n c07116n) throws AD {
        long longValue;
        C2268no A0K;
        long longValue2;
        boolean z6;
        this.A0h.A03(1);
        Pair<Object, Long> A09 = A09(c07116n, true);
        if (A09 == null) {
            A0K = A0A();
            longValue2 = b.f7168b;
            longValue = b.f7168b;
            z6 = true;
        } else {
            Object obj = A09.first;
            longValue = ((Long) A09.second).longValue();
            A0K = this.A0j.A0K(this.A0A.A03, obj, longValue);
            if (A0K.A00()) {
                longValue2 = 0;
                z6 = true;
            } else {
                longValue2 = ((Long) A09.second).longValue();
                z6 = c07116n.A01 == b.f7168b;
            }
        }
        try {
            try {
                if (this.A0D != null && this.A02 <= 0) {
                    try {
                        if (longValue2 == b.f7168b) {
                            A0V(4);
                            A13(false, true, false);
                        } else {
                            long j6 = longValue2;
                            if (A0K.equals(this.A0A.A05)) {
                                C7A A0F = this.A0j.A0F();
                                if (A0F != null && j6 != 0) {
                                    j6 = A0F.A07.A6r(j6, this.A0C);
                                }
                                if (C2Y.A01(j6) == C2Y.A01(this.A0A.A0C)) {
                                    this.A0A = this.A0A.A06(A0K, this.A0A.A0C, longValue, A01());
                                    if (z6) {
                                        this.A0h.A04(2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            long A06 = A06(A0K, j6);
                            z6 |= longValue2 != A06;
                            longValue2 = A06;
                        }
                        this.A0A = this.A0A.A06(A0K, longValue2, longValue, A01());
                        if (z6) {
                            return;
                        }
                        this.A0h.A04(2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        this.A0A = this.A0A.A06(A0K, longValue2, longValue, A01());
                        if (z6) {
                            this.A0h.A04(2);
                        }
                        throw th;
                    }
                }
                this.A08 = c07116n;
                this.A07 = null;
                this.A0A = this.A0A.A06(A0K, longValue2, longValue, A01());
                if (z6) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static {
        A0R();
    }

    public AB(InterfaceC2329oo[] interfaceC2329ooArr, AbstractC0909Ew abstractC0909Ew, C0910Ex c0910Ex, AnonymousClass74 anonymousClass74, F6 f62, boolean z6, int i, boolean z9, Handler handler, AnonymousClass45 anonymousClass45, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, long j6, boolean z16, int i4, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, C8O c8o) {
        this.A0v = interfaceC2329ooArr;
        this.A0l = abstractC0909Ew;
        this.A0m = c0910Ex;
        this.A0i = anonymousClass74;
        this.A0n = f62;
        this.A0P = z6;
        this.A03 = i;
        this.A0V = z9;
        this.A0a = handler;
        this.A0e = anonymousClass45;
        this.A0U = z10;
        this.A0H = z11;
        this.A0G = z12;
        this.A0M = z13;
        this.A0I = z14;
        this.A0T = z15;
        this.A0Z = j6;
        this.A0q = z16;
        this.A00 = i4;
        this.A0u = z18;
        this.A0s = z17;
        this.A0O = z19;
        this.A0Q = z20;
        this.A0K = z21;
        this.A0t = z22;
        this.A0N = j6 > 0;
        this.A0Y = anonymousClass74.A70(c8o);
        this.A0r = anonymousClass74.AIn(c8o);
        this.A0C = C07447u.A03;
        this.A0A = new C7Z(Timeline.A02, b.f7168b, C2250nW.A06, c0910Ex);
        this.A0h = new C07106m();
        this.A0w = new InterfaceC07397p[interfaceC2329ooArr.length];
        for (int i6 = 0; i6 < interfaceC2329ooArr.length; i6++) {
            interfaceC2329ooArr[i6].AA9(i6, c8o);
            this.A0w[i6] = interfaceC2329ooArr[i6].A7D();
        }
        this.A0g = new C2337ow(this, anonymousClass45);
        this.A0k = new C2325ok(anonymousClass45);
        this.A0o = z18 ? new C07769g(anonymousClass45) : null;
        this.A0p = new ArrayList<>();
        this.A0W = new InterfaceC2329oo[0];
        this.A0d = new C2385pj();
        this.A0c = new C2387pl();
        abstractC0909Ew.A02(this, f62);
        this.A0b = new HandlerThread(A0D(21, 29, 115), -16);
        this.A0b.start();
        this.A0f = anonymousClass45.A5P(this.A0b.getLooper(), this);
    }

    @MetaExoPlayerCustomization
    private int A00() {
        int exoplayerThreadPollingIntervalMs = MetaExoPlayerUpgradeConfig.A00(EnumC2021jY.A04);
        if (exoplayerThreadPollingIntervalMs > 0) {
            return exoplayerThreadPollingIntervalMs;
        }
        return 10;
    }

    private long A01() {
        return A04(this.A0A.A0B);
    }

    private final long A02() {
        long loadingPeriodStartPositionUs;
        C7A A0E = this.A0j.A0E();
        if (A0E == null) {
            loadingPeriodStartPositionUs = 0;
        } else {
            loadingPeriodStartPositionUs = A05(A0E);
        }
        if (A0E == null || loadingPeriodStartPositionUs == b.f7168b) {
            return 0L;
        }
        return A0E.A0C(loadingPeriodStartPositionUs);
    }

    private final long A03() {
        long A0C;
        C7A A0F = this.A0j.A0F();
        if (A0F == null) {
            A0C = 0;
        } else {
            A0C = A0F.A0C(A0F.A0D(this.A06));
        }
        return A0C + A02();
    }

    private long A04(long j6) {
        C7A A0E = this.A0j.A0E();
        if (A0E == null) {
            return 0L;
        }
        return j6 - A0E.A0D(this.A06);
    }

    private final long A05(C7A c7a) {
        long j6 = Long.MAX_VALUE;
        DT[] dtArr = c7a.A09;
        for (int i = 0; i < dtArr.length; i++) {
            if (dtArr[i] instanceof DU) {
                long periodStartPositionUs = ((DU) dtArr[i]).A89();
                j6 = Math.min(j6, periodStartPositionUs);
            }
        }
        return j6 == Long.MAX_VALUE ? b.f7168b : j6;
    }

    private long A06(C2268no c2268no, long j6) throws AD {
        return A07(false, c2268no, j6, this.A0j.A0F() != this.A0j.A0G());
    }

    private long A07(boolean z6, C2268no c2268no, long j6, boolean z9) throws AD {
        A0O();
        this.A0R = false;
        A0V(2);
        C7A A0F = this.A0j.A0F();
        C7A c7a = A0F;
        while (true) {
            if (c7a == null) {
                break;
            }
            if (A18(c2268no, j6, c7a)) {
                this.A0j.A0S(c7a);
                break;
            }
            c7a = this.A0j.A0B();
        }
        if (A0F != c7a || z9) {
            for (InterfaceC2329oo interfaceC2329oo : this.A0W) {
                A0l(interfaceC2329oo);
            }
            this.A0W = new InterfaceC2329oo[0];
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[4] = "70t8rv27mnV5UL6KHl8v284ienTbIO4o";
            strArr[3] = "4hBvGCC7ZdKRW68bijyzpqxjpy9h3CGi";
            A0F = null;
        }
        if (c7a != null) {
            A0g(A0F);
            if (c7a.A01) {
                j6 = c7a.A07.AJ8(j6, z6);
                c7a.A07.A60(j6 - this.A0Y, this.A0r);
            }
            A0Y(j6);
            A0w(this.A0G);
        } else {
            this.A0j.A0M(true);
            A0Y(j6);
        }
        A0v(false);
        this.A0f.AJA(2);
        return j6;
    }

    private Pair<Object, Long> A08(Timeline timeline, int i, long j6) {
        return timeline.A0D(this.A0d, this.A0c, i, j6);
    }

    private Pair<Object, Long> A09(C07116n c07116n, boolean z6) {
        Timeline timeline = this.A0A.A03;
        Timeline timeline2 = c07116n.A02;
        if (timeline.A0N()) {
            return null;
        }
        if (timeline2.A0N()) {
            timeline2 = timeline;
        }
        try {
            Pair<Object, Long> periodPosition = timeline2.A0E(this.A0d, this.A0c, c07116n.A00, c07116n.A01);
            if (timeline == timeline2) {
                return periodPosition;
            }
            int A0A = timeline.A0A(periodPosition.first);
            if (A0A != -1) {
                return periodPosition;
            }
            if (!z6 || A0C(periodPosition.first, timeline2, timeline) == null) {
                return null;
            }
            return A08(timeline, timeline.A0H(A0A, this.A0c).A00, b.f7168b);
        } catch (IndexOutOfBoundsException unused) {
            throw new C06122q(timeline, c07116n.A00, c07116n.A01);
        }
    }

    private C2268no A0A() {
        Timeline timeline = this.A0A.A03;
        if (timeline.A0N()) {
            return C7Z.A0E;
        }
        return new C2268no(timeline.A0M(timeline.A0K(timeline.A0B(this.A0V), this.A0d).A00));
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D71523094: Added for negative testing")
    private final Integer A0B() {
        C7V playbackLatencyConfig;
        if (this.A09 == null || (playbackLatencyConfig = this.A09.A02()) == null) {
            String[] strArr = A0y;
            if (strArr[2].length() != strArr[6].length()) {
                A0y[7] = "1rqbEBrQgQNr61xUccdMybR9UEwvq3L8";
                return null;
            }
        } else {
            int A00 = playbackLatencyConfig.A00();
            if (A0y[0].length() != 16) {
                String[] strArr2 = A0y;
                strArr2[2] = "KUZ";
                strArr2[6] = "wQAKuizVIm50S6vdz";
                return Integer.valueOf(A00);
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object A0C(Object obj, Timeline timeline, Timeline timeline2) {
        int A0A = timeline.A0A(obj);
        int i = -1;
        int maxIterations = timeline.A06();
        for (int newPeriodIndex = 0; newPeriodIndex < maxIterations && i == -1 && (A0A = timeline.A09(A0A, this.A0c, this.A0d, this.A03, this.A0V)) != -1; newPeriodIndex++) {
            i = timeline2.A0A(timeline.A0M(A0A));
        }
        return timeline2.A0M(i);
    }

    private void A0E() {
        C7A A0E = this.A0j.A0E();
        if (A0E == null) {
            return;
        }
        A0E.A07.A4s(A0E.A0D(this.A06));
    }

    private void A0G() {
        A0V(4);
        A13(false, true, false);
    }

    private void A0H() {
        int i;
        boolean z6;
        int i4;
        if (this.A0h.A06(this.A0A)) {
            Handler handler = this.A0a;
            i = this.A0h.A01;
            z6 = this.A0h.A03;
            if (z6) {
                i4 = this.A0h.A00;
            } else {
                i4 = -1;
            }
            handler.obtainMessage(0, i, i4, this.A0A).sendToTarget();
            this.A0h.A05(this.A0A);
        }
    }

    private void A0I() throws IOException {
        C7A A0E = this.A0j.A0E();
        C7A readingPeriodHolder = this.A0j.A0G();
        if (A0E != null && !A0E.A02) {
            if (readingPeriodHolder != null) {
                C7A loadingPeriodHolder = readingPeriodHolder.A0I();
                if (loadingPeriodHolder != A0E) {
                    return;
                }
            }
            for (InterfaceC2329oo interfaceC2329oo : this.A0W) {
                if (!interfaceC2329oo.A9p()) {
                    return;
                }
            }
            A0E.A07.ACS();
        }
    }

    private void A0J() throws IOException {
        this.A0j.A0L(this.A06);
        if (this.A0j.A0O()) {
            C7B A0H = this.A0j.A0H(this.A06, this.A0A);
            if (A0H == null) {
                this.A0D.ACT();
                return;
            }
            this.A0j.A0J(this.A0w, this.A0t ? 60000000L : 0L, this.A0l, this.A0i.A6v(), this.A0D, A0H, this.A0m).AH5(this, A0H.A03);
            A0y(true);
            A0v(false);
        }
    }

    private void A0K() {
        A13(true, true, true);
        this.A0i.AFc(C8O.A03);
        A0V(1);
        this.A0b.quit();
        synchronized (this) {
            this.A0S = true;
            notifyAll();
        }
    }

    private void A0L() throws AD {
        boolean z6;
        if (!this.A0j.A0N()) {
            return;
        }
        float f2 = this.A0g.A8m().A01;
        C7A periodHolder = this.A0j.A0G();
        boolean z9 = true;
        for (C7A A0F = this.A0j.A0F(); A0F != null && A0F.A02; A0F = A0F.A0I()) {
            C0910Ex A0L = A0F.A0L(f2, this.A0A.A03);
            if (A0L != null) {
                if (z9) {
                    C7A A0F2 = this.A0j.A0F();
                    boolean A0S = this.A0j.A0S(A0F2);
                    boolean[] zArr = new boolean[this.A0v.length];
                    long A0G = A0F2.A0G(A0L, this.A0A.A0C, A0S, zArr);
                    if (this.A0A.A00 != 4 && A0G != this.A0A.A0C) {
                        this.A0A = this.A0A.A06(this.A0A.A05, A0G, this.A0A.A01, A01());
                        this.A0h.A04(4);
                        A0Y(A0G);
                    }
                    int i = 0;
                    boolean[] zArr2 = new boolean[this.A0v.length];
                    for (int i4 = 0; i4 < this.A0v.length; i4++) {
                        InterfaceC2329oo interfaceC2329oo = this.A0v[i4];
                        zArr2[i4] = interfaceC2329oo.A9A() != 0;
                        DT dt = A0F2.A09[i4];
                        if (dt != null) {
                            i++;
                        }
                        if (zArr2[i4]) {
                            DT A9D = interfaceC2329oo.A9D();
                            if (A0y[7].charAt(12) == '2') {
                                throw new RuntimeException();
                            }
                            A0y[1] = "PyyQ9suxdi7C";
                            if (dt != A9D) {
                                A0l(interfaceC2329oo);
                            } else if (zArr[i4]) {
                                interfaceC2329oo.AIm(this.A06);
                            }
                        }
                    }
                    this.A0A = this.A0A.A07(A0F2.A0J(), A0F2.A0K());
                    A14(zArr2, i);
                    z6 = false;
                } else {
                    this.A0j.A0S(A0F);
                    if (A0F.A02) {
                        z6 = false;
                        A0F.A0F(A0L, Math.max(A0F.A00.A03, A0F.A0D(this.A06)), false);
                    } else {
                        z6 = false;
                    }
                }
                A0v(true);
                if (this.A0A.A00 != 4) {
                    A0w(z6);
                    A0Q();
                    this.A0f.AJA(2);
                    return;
                }
                return;
            }
            if (A0F == periodHolder) {
                z9 = false;
            }
        }
    }

    private void A0M() {
        for (int size = this.A0p.size() - 1; size >= 0; size--) {
            if (!A16(this.A0p.get(size))) {
                this.A0p.get(size).A03.A0A(false);
                this.A0p.remove(size);
            }
        }
        Collections.sort(this.A0p);
    }

    private void A0N() throws AD {
        this.A0R = false;
        this.A0g.A05();
        this.A0k.A00();
        if (this.A0u) {
            this.A0o.A00();
        }
        for (InterfaceC2329oo interfaceC2329oo : this.A0W) {
            interfaceC2329oo.start();
        }
    }

    private void A0O() throws AD {
        this.A0g.A06();
        this.A0k.A01();
        if (this.A0u) {
            this.A0o.A01();
        }
        for (InterfaceC2329oo interfaceC2329oo : this.A0W) {
            A0m(interfaceC2329oo);
        }
    }

    private void A0Q() throws AD {
        if (!this.A0j.A0N()) {
            return;
        }
        C7A A0F = this.A0j.A0F();
        long AHQ = A0F.A07.AHQ();
        if (AHQ != b.f7168b) {
            A0Y(AHQ);
            if (AHQ != this.A0A.A0C) {
                this.A0A = this.A0A.A06(this.A0A.A05, AHQ, this.A0A.A01, A01());
                this.A0h.A04(4);
            }
        } else {
            C2337ow c2337ow = this.A0g;
            C7A playingPeriodHolder = this.A0j.A0G();
            this.A06 = c2337ow.A04(A0F != playingPeriodHolder);
            long A0D = A0F.A0D(this.A06);
            A0Z(this.A0A.A0C, A0D);
            this.A0A.A0C = A0D;
        }
        C7A playingPeriodHolder2 = this.A0j.A0E();
        this.A0A.A0B = playingPeriodHolder2.A09();
        this.A0A.A0D = A01();
        this.A0A.A0D = A0F.A0C(this.A0A.A0C);
    }

    private void A0S(byte b9) {
        C7A A0E = this.A0j.A0E();
        if (A0E != null && this.A0U) {
            A0E.A07.AKb(b9);
        }
    }

    private void A0T(float f2) {
        for (C7A A0D = this.A0j.A0D(); A0D != null && A0D.A02; A0D = A0D.A0I()) {
            for (InterfaceC2232nE interfaceC2232nE : A0D.A0K().A04) {
                if (interfaceC2232nE != null) {
                    interfaceC2232nE.AFJ(f2);
                }
            }
        }
    }

    private void A0U(int i) throws AD {
        this.A03 = i;
        if (!this.A0j.A0P(this.A0A.A03, i)) {
            if (A0y[0].length() == 16) {
                throw new RuntimeException();
            }
            A0y[5] = "F0pbcDG7mrKSFF2ySsjJdp1en5xQxzay";
            A0x(true);
        }
        A0v(false);
    }

    private void A0V(int i) {
        if (this.A0A.A00 != i) {
            this.A0A = this.A0A.A01(i);
            if (i == 2) {
                this.A04 = System.currentTimeMillis();
            } else {
                this.A04 = -1L;
            }
        }
    }

    private void A0W(int i, boolean z6) {
        if (this.A0A.A00 != i) {
            C7Z A03 = this.A0A.A03(i, z6);
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            A0y[1] = "pTubBuiOOGTe";
            this.A0A = A03;
            if (i == 2) {
                this.A04 = System.currentTimeMillis();
            } else {
                this.A04 = -1L;
            }
        }
    }

    private void A0X(int i, boolean playing, int i4) throws AD {
        C7A A0F = this.A0j.A0F();
        InterfaceC2329oo interfaceC2329oo = this.A0v[i];
        this.A0W[i4] = interfaceC2329oo;
        if (interfaceC2329oo.A9A() == 0) {
            C7A A0G = this.A0j.A0G();
            C7A playingPeriodHolder = this.A0j.A0F();
            boolean z6 = A0G == playingPeriodHolder;
            C07427s c07427s = A0F.A0K().A03[i];
            C2420qI[] A1A = A1A(A0F.A0K().A04[i]);
            boolean z9 = this.A0P && this.A0A.A00 == 3;
            interfaceC2329oo.A6L(c07427s, A1A, A0F.A09[i], this.A06, !playing && z9, z6, A0G.A0H(this.A0K), A0F.A0B());
            this.A0g.A09(interfaceC2329oo);
            if (z9) {
                interfaceC2329oo.start();
            }
        }
    }

    private void A0Y(long j6) throws AD {
        long A0E;
        if (this.A0j.A0N()) {
            A0E = this.A0j.A0F().A0E(j6);
        } else {
            A0E = (this.A0t ? 60000000 : 0) + j6;
        }
        this.A06 = A0E;
        this.A0g.A07(this.A06);
        for (InterfaceC2329oo interfaceC2329oo : this.A0W) {
            long j9 = this.A06;
            String[] strArr = A0y;
            if (strArr[2].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0y[5] = "3LWS1la82nevxXslk8B3HGv7gilut34u";
            interfaceC2329oo.AIm(j9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cb, code lost:
    
        if (r5 >= r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        r5 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (com.instagram.common.viewpoint.core.AB.A0y[7].charAt(12) == '2') goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        com.instagram.common.viewpoint.core.AB.A0y[7] = "Pqus3FB2V0wQm49ac7wvllFxwdLgqwrG";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        if (r5 != r4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00eb, code lost:
    
        if (r3.A01 > r8) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0114, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ed, code lost:
    
        r0 = r7.A01;
        r7.A01 = r0 + 1;
        r1 = r7.A01;
        r0 = r7.A0p.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fb, code lost:
    
        if (r1 >= r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0108, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00fd, code lost:
    
        r1 = r7.A0p;
        r0 = r7.A01;
        r3 = r1.get(r0);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x010a, code lost:
    
        if (r5 >= r4) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0Z(long j6, long j9) throws AD {
        C07096l c07096l;
        C07096l nextInfo;
        if (this.A0p.isEmpty() || this.A0A.A05.A00()) {
            return;
        }
        C7Z c7z = this.A0A;
        if (A0y[0].length() != 16) {
            String[] strArr = A0y;
            strArr[4] = "N4EB4VnnGuurJLGLQe09RRoMwim7ZTwR";
            strArr[3] = "el7QB6NOzA9v772mMpBH3ujflXdKxCpX";
            if (c7z.A02 == j6) {
                j6--;
            }
            int A0A = this.A0A.A03.A0A(this.A0A.A05.A04);
            int currentPeriodIndex = this.A01;
            if (currentPeriodIndex > 0) {
                ArrayList<C07096l> arrayList = this.A0p;
                int currentPeriodIndex2 = this.A01;
                int i = currentPeriodIndex2 - 1;
                if (A0y[1].length() != 31) {
                    String[] strArr2 = A0y;
                    strArr2[2] = "q3c";
                    strArr2[6] = "HlTr3zIzL5MxTNWEN";
                    c07096l = arrayList.get(i);
                }
            } else {
                c07096l = null;
            }
            while (c07096l != null && (c07096l.A00 > A0A || (c07096l.A00 == A0A && c07096l.A01 > j6))) {
                int currentPeriodIndex3 = this.A01;
                this.A01 = currentPeriodIndex3 - 1;
                int currentPeriodIndex4 = this.A01;
                if (currentPeriodIndex4 > 0) {
                    ArrayList<C07096l> arrayList2 = this.A0p;
                    int currentPeriodIndex5 = this.A01;
                    c07096l = arrayList2.get(currentPeriodIndex5 - 1);
                } else {
                    c07096l = null;
                }
            }
            int i4 = this.A01;
            int currentPeriodIndex6 = this.A0p.size();
            if (i4 < currentPeriodIndex6) {
                ArrayList<C07096l> arrayList3 = this.A0p;
                int currentPeriodIndex7 = this.A01;
                nextInfo = arrayList3.get(currentPeriodIndex7);
            } else {
                nextInfo = null;
            }
            while (nextInfo != null && nextInfo.A02 != null) {
                int i6 = nextInfo.A00;
                if (A0y[5].charAt(1) != 'q') {
                    A0y[1] = "urcr7rEa5cce4ZESz6";
                }
            }
            while (nextInfo != null) {
                Object obj = nextInfo.A02;
                if (A0y[1].length() != 31) {
                    String[] strArr3 = A0y;
                    strArr3[2] = "ENU";
                    strArr3[6] = "SOUOSvSypycWuSHSN";
                    if (obj == null) {
                        return;
                    }
                    int currentPeriodIndex8 = nextInfo.A00;
                    if (currentPeriodIndex8 == A0A && nextInfo.A01 > j6 && nextInfo.A01 <= j9) {
                        A0j(nextInfo.A03);
                        if (nextInfo.A03.A0B() || nextInfo.A03.A0D()) {
                            ArrayList<C07096l> arrayList4 = this.A0p;
                            int currentPeriodIndex9 = this.A01;
                            arrayList4.remove(currentPeriodIndex9);
                        } else {
                            int currentPeriodIndex10 = this.A01;
                            this.A01 = currentPeriodIndex10 + 1;
                        }
                        int i9 = this.A01;
                        int currentPeriodIndex11 = this.A0p.size();
                        if (i9 < currentPeriodIndex11) {
                            ArrayList<C07096l> arrayList5 = this.A0p;
                            int currentPeriodIndex12 = this.A01;
                            C07096l nextInfo2 = arrayList5.get(currentPeriodIndex12);
                            nextInfo = nextInfo2;
                        } else {
                            nextInfo = null;
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0a(long j6, long j9) {
        this.A0f.AIT(2);
        this.A0f.AJB(2, j6 + j9);
    }

    private void A0b(C2399px c2399px) {
        this.A0g.AJd(c2399px);
        if (this.A0o != null) {
            this.A0o.AJd(c2399px);
        }
        if (this.A0k != null) {
            this.A0k.AJd(c2399px);
        }
    }

    private void A0c(C07076j c07076j) throws AD {
        throw new NullPointerException(A0D(376, 16, 17));
    }

    private void A0d(C07076j c07076j, boolean z6) throws AD {
        this.A0h.A03(1);
        throw new NullPointerException(A0D(363, 13, a.f22515R));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r8.A00(r6) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r7.AAN() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r7.A9D() != r10.A09[r6]) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        A0l(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r8.A00(r6) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0g(C7A c7a) throws AD {
        C7A A0F = this.A0j.A0F();
        if (A0F == null || c7a == A0F) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0v.length];
        String[] strArr = A0y;
        String str = strArr[4];
        String str2 = strArr[3];
        int enabledRendererCount = str.charAt(1);
        if (enabledRendererCount == str2.charAt(1)) {
            throw new RuntimeException();
        }
        A0y[0] = "";
        int i4 = 0;
        while (i4 < this.A0v.length) {
            InterfaceC2329oo interfaceC2329oo = this.A0v[i4];
            zArr[i4] = interfaceC2329oo.A9A() != 0;
            if (A0F.A0K().A00(i4)) {
                i++;
            }
            if (zArr[i4]) {
                C0910Ex A0K = A0F.A0K();
                int enabledRendererCount2 = A0y[5].charAt(1);
                if (enabledRendererCount2 != 113) {
                    String[] strArr2 = A0y;
                    strArr2[4] = "5yNp1I7g7IY9vjHrSpd0TTAHnxoP5q4N";
                    strArr2[3] = "spEmpaFlzQc3LcHeWE04rIrq6t30lchN";
                }
            }
            i4++;
        }
        this.A0A = this.A0A.A07(A0F.A0J(), A0F.A0K());
        A14(zArr, i);
    }

    private void A0h(C07277d c07277d) throws AD {
        if (c07277d.A0D()) {
            return;
        }
        try {
            c07277d.A05().A9i(c07277d.A01(), c07277d.A09());
        } finally {
            c07277d.A0A(true);
        }
    }

    private void A0i(C07277d c07277d) throws AD {
        if (c07277d.A02() == b.f7168b) {
            A0j(c07277d);
            return;
        }
        if (this.A0D == null || this.A02 > 0) {
            this.A0p.add(new C07096l(c07277d));
            return;
        }
        C07096l c07096l = new C07096l(c07277d);
        if (A16(c07096l)) {
            this.A0p.add(c07096l);
            Collections.sort(this.A0p);
        } else {
            c07277d.A0A(false);
        }
    }

    private void A0j(C07277d c07277d) throws AD {
        if (c07277d.A03() == this.A0f.A8R()) {
            A0h(c07277d);
            if (this.A0A.A00 == 3 || this.A0A.A00 == 2) {
                this.A0f.AJA(2);
                return;
            }
            return;
        }
        this.A0f.ACj(15, c07277d).A02();
    }

    private void A0k(final C07277d c07277d) {
        Looper A03 = c07277d.A03();
        if (!A03.getThread().isAlive()) {
            Log.w(A0D(220, 3, 37), A0D(258, 40, 7));
            c07277d.A0A(false);
        } else {
            this.A0e.A5P(A03, null).A03(new Runnable() { // from class: com.facebook.ads.redexgen.X.6h
                @Override // java.lang.Runnable
                public final void run() {
                    AB.this.A1E(c07277d);
                }
            });
        }
    }

    private void A0l(InterfaceC2329oo interfaceC2329oo) throws AD {
        this.A0g.A08(interfaceC2329oo);
        A0m(interfaceC2329oo);
        interfaceC2329oo.A5x();
    }

    private void A0m(InterfaceC2329oo interfaceC2329oo) throws AD {
        if (interfaceC2329oo.A9A() == 2) {
            interfaceC2329oo.stop();
        }
    }

    private void A0n(C07447u c07447u) {
        this.A0C = c07447u;
    }

    private void A0o(InterfaceC2269np interfaceC2269np) {
        if (!this.A0j.A0T(interfaceC2269np)) {
            return;
        }
        this.A0j.A0L(this.A06);
        A0w(false);
    }

    private void A0p(InterfaceC2269np interfaceC2269np) throws AD {
        byte b9;
        if (!this.A0j.A0T(interfaceC2269np)) {
            return;
        }
        C7A A0E = this.A0j.A0E();
        A0E.A0N(this.A0g.A8m().A01, this.A0A.A03);
        A0s(A0E.A0J(), A0E.A0K());
        if (!this.A0j.A0N()) {
            C7A loadingPeriodHolder = this.A0j.A0B();
            A0Y(loadingPeriodHolder.A00.A03);
            A0g(null);
        }
        if (this.A0M || this.A0P) {
            b9 = 0;
        } else {
            b9 = 2;
        }
        A0S(b9);
        A10(this.A0P);
        if (A0y[7].charAt(12) == '2') {
            throw new RuntimeException();
        }
        A0y[5] = "0JHOWU68jltYXS7XBlXTYuPeT3LWkLA2";
        A0w(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.DW
    /* renamed from: A0q, reason: merged with bridge method [inline-methods] */
    public final void ADV(InterfaceC2269np interfaceC2269np) {
        this.A0f.ACj(10, interfaceC2269np).A02();
    }

    private void A0r(InterfaceC0858Cx interfaceC0858Cx, boolean z6, boolean z9) {
        this.A02++;
        A13(true, z6, z9);
        this.A0i.AFR(C8O.A03);
        this.A0D = interfaceC0858Cx;
        A0V(2);
        interfaceC0858Cx.AH7(this, null);
        this.A0f.AJA(2);
    }

    private void A0s(C2250nW c2250nW, C0910Ex c0910Ex) {
        this.A0i.AGF(new AnonymousClass73(C8O.A03, this.A0A.A03, this.A0A.A04, this.A0A.A0C, A01(), this.A0g.A8m().A01, this.A0P, this.A0R, b.f7168b, this.A04), c2250nW, c0910Ex.A04);
    }

    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    private void A0t(EnumC1986ir enumC1986ir, boolean z6) {
        if (this.A0A.A00 != 3) {
            this.A0A = this.A0A.A02(3, enumC1986ir, z6);
            this.A04 = -1L;
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D63737392: Added for negative testing")
    private void A0u(String str) {
        boolean z6 = false;
        if (str == null) {
            this.A0J = false;
            this.A09 = null;
            return;
        }
        if (str != null && str.length() > 0) {
            z6 = true;
        }
        this.A0J = z6;
        this.A09 = new C7W(str);
    }

    private void A0v(boolean z6) {
        C2268no c2268no;
        C7A A0E = this.A0j.A0E();
        if (A0E == null) {
            C7Z c7z = this.A0A;
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[2] = "b0w";
            strArr[6] = "WyMJg745VdMbfing6";
            c2268no = c7z.A05;
        } else {
            c2268no = A0E.A00.A04;
        }
        C2268no loadingMediaPeriodId = this.A0A.A04;
        boolean loadingMediaPeriodChanged = !loadingMediaPeriodId.equals(c2268no);
        if (loadingMediaPeriodChanged) {
            this.A0A = this.A0A.A05(c2268no);
        }
        if ((loadingMediaPeriodChanged || z6) && A0E != null && A0E.A02) {
            A0s(A0E.A0J(), A0E.A0K());
        }
    }

    @MetaExoPlayerCustomization("Customized Buffered Duration MS D23157182")
    private void A0w(boolean z6) {
        long A0C;
        C7A A0E = this.A0j.A0E();
        long A0A = A0E.A0A();
        if (A0A == Long.MIN_VALUE) {
            A0y(false);
            return;
        }
        long A0D = A0E.A0D(this.A06);
        if (!this.A0s || A0E == this.A0j.A0F() || this.A0j.A0F() == null) {
            A0C = A0E.A0C(A0D);
            if (this.A0O) {
                for (C7A A0F = this.A0j.A0F(); A0F != null && A0F != A0E; A0F = A0F.A0I()) {
                    long nextLoadPositionUs = this.A06;
                    A0C += A0F.A0C(A0F.A0D(nextLoadPositionUs));
                }
            }
        } else {
            A0C = A02();
        }
        Timeline timeline = this.A0A.A03;
        C2268no c2268no = A0E.A00.A04;
        float f2 = this.A0g.A8m().A01;
        boolean z9 = this.A0P || z6;
        boolean z10 = this.A0R;
        long nextLoadPositionUs2 = this.A04;
        boolean AJv = this.A0i.AJv(new AnonymousClass73(null, timeline, c2268no, A0D, A0C, f2, z9, z10, b.f7168b, nextLoadPositionUs2));
        if (this.A0T && this.A0P && this.A0R && !AJv && this.A0A.A00 == 2) {
            Long valueOf = Long.valueOf(A0D / 1000);
            Long valueOf2 = Long.valueOf(A0C / 1000);
            Long valueOf3 = Long.valueOf(A0A / 1000);
            String[] strArr = A0y;
            if (strArr[4].charAt(1) == strArr[3].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0y;
            strArr2[2] = "Frr";
            strArr2[6] = "mfKzHFhLmxUYLc6Gx";
            this.A0a.obtainMessage(5, C5C.A0n(A0D(125, 70, 5), valueOf, valueOf2, valueOf3)).sendToTarget();
            this.A0T = false;
        }
        A0y(AJv);
        if (AJv) {
            A0E.A0O(this.A06);
        }
    }

    private void A0x(boolean z6) throws AD {
        C2268no c2268no = this.A0j.A0F().A00.A04;
        long A07 = A07(false, c2268no, this.A0A.A0C, true);
        if (A07 != this.A0A.A0C) {
            this.A0A = this.A0A.A06(c2268no, A07, this.A0A.A01, A01());
            if (z6) {
                C07106m c07106m = this.A0h;
                String[] strArr = A0y;
                if (strArr[4].charAt(1) == strArr[3].charAt(1)) {
                    throw new RuntimeException();
                }
                A0y[5] = "dnthUoDEzHvBWSE2tp3YAJwgKJx1FOWZ";
                c07106m.A04(4);
            }
        }
    }

    private void A0y(boolean z6) {
        if (this.A0A.A0A != z6) {
            this.A0A = this.A0A.A08(z6);
        }
    }

    private void A0z(boolean z6) throws AD {
        try {
            this.A0R = false;
            this.A0P = z6;
            A10(z6);
            if (!z6) {
                A0O();
                A0Q();
                A0S((byte) 2);
                if (this.A0I) {
                    A0E();
                }
            } else {
                A0S((byte) 0);
                if (this.A0A.A00 != 3) {
                    if (this.A0A.A00 == 2) {
                        this.A0f.AJA(2);
                    }
                } else {
                    A0N();
                    this.A0f.AJA(2);
                }
            }
        } finally {
            this.A0a.obtainMessage(3, Boolean.valueOf(z6)).sendToTarget();
        }
    }

    @MetaExoPlayerCustomization("D19875605 Prevent further error loading once pausing video")
    private void A10(boolean z6) {
        C7A loadingPeriod = this.A0j.A0E();
        if (loadingPeriod == null) {
            return;
        }
        loadingPeriod.A07.AJc(z6);
    }

    private void A11(boolean z6) throws AD {
        this.A0V = z6;
        if (!this.A0j.A0R(this.A0A.A03, z6)) {
            A0x(true);
        }
        A0v(false);
    }

    private void A12(boolean z6, boolean z9) {
        A13(true, z6, z6);
        this.A0h.A03(this.A02 + (z9 ? 1 : 0));
        this.A02 = 0;
        this.A0i.AG6(C8O.A03);
        A0V(1);
    }

    private void A13(boolean z6, boolean z9, boolean z10) {
        long j6;
        C2250nW c2250nW;
        C0910Ex c0910Ex;
        this.A0f.AIT(2);
        this.A0R = false;
        this.A0g.A06();
        this.A0k.A01();
        if (this.A0u) {
            this.A0o.A01();
        }
        this.A06 = this.A0t ? 60000000L : 0L;
        for (InterfaceC2329oo interfaceC2329oo : this.A0W) {
            try {
                A0l(interfaceC2329oo);
            } catch (AD | RuntimeException e9) {
                Log.e(A0D(0, 21, 22), A0D(BaseATView.a.f10557G, 12, 44), e9);
            }
        }
        this.A0W = new InterfaceC2329oo[0];
        this.A0j.A0M(!z9);
        A0y(false);
        if (z9) {
            this.A08 = null;
        }
        if (z10) {
            Iterator<C07096l> it = this.A0p.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0p.clear();
            this.A01 = 0;
        }
        C2268no A0A = z9 ? A0A() : this.A0A.A05;
        long j9 = b.f7168b;
        if (z9) {
            j6 = -9223372036854775807L;
        } else {
            C7Z c7z = this.A0A;
            if (A0y[5].charAt(1) != 'q') {
                String[] strArr = A0y;
                strArr[4] = "7gx390g1msf1u5QKnR2KjvR4WQmRx8YK";
                strArr[3] = "VlC7tbQkEF507tv73u1W2v85d7ApXXNM";
                j6 = c7z.A0C;
            } else {
                A0y[5] = "C79IK8sPJjEkg2u4SoGimfUAaE3F5yew";
                j6 = c7z.A0C;
            }
        }
        if (!z9) {
            C7Z c7z2 = this.A0A;
            if (A0y[5].charAt(1) == 'q') {
                throw new RuntimeException();
            }
            String[] strArr2 = A0y;
            strArr2[2] = "uSR";
            strArr2[6] = "FwoZ6mA9qzJ4hrvJt";
            j9 = c7z2.A01;
        }
        Timeline timeline = z10 ? Timeline.A02 : this.A0A.A03;
        int i = this.A0A.A00;
        if (z10) {
            c2250nW = C2250nW.A06;
        } else {
            C7Z c7z3 = this.A0A;
            if (A0y[7].charAt(12) == '2') {
                throw new RuntimeException();
            }
            A0y[5] = "yizxhFEcEwEbIh7DB6ScCbr86G64zHmf";
            c2250nW = c7z3.A06;
        }
        if (z10) {
            c0910Ex = this.A0m;
        } else {
            c0910Ex = this.A0A.A07;
        }
        this.A0A = new C7Z(timeline, A0A, j6, j9, i, false, c2250nW, c0910Ex, A0A, j6, 0L, j6);
        if (z6 && this.A0D != null) {
            this.A0D.AHl(this);
            this.A0D = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A14(boolean[] zArr, int i) throws AD {
        this.A0W = new InterfaceC2329oo[i];
        int enabledRendererCount = 0;
        C7A A0F = this.A0j.A0F();
        for (int i4 = 0; i4 < enabledRendererCount; i4++) {
            if (A0F.A0K().A00(i4)) {
                A0X(i4, zArr[i4], enabledRendererCount);
                enabledRendererCount++;
            }
        }
    }

    private boolean A15() {
        C7A playingPeriodHolder = this.A0j.A0F();
        C7A A0I = playingPeriodHolder.A0I();
        long j6 = playingPeriodHolder.A00.A00;
        return j6 == b.f7168b || this.A0A.A0C < j6 || (A0I != null && (A0I.A02 || A0I.A00.A04.A00()));
    }

    private boolean A16(C07096l c07096l) {
        if (c07096l.A02 == null) {
            Pair<Object, Long> A09 = A09(new C07116n(c07096l.A03.A04(), c07096l.A03.A00(), C2Y.A00(c07096l.A03.A02())), false);
            if (A09 == null) {
                return false;
            }
            int A0A = this.A0A.A03.A0A(A09.first);
            if (A0y[5].charAt(1) != 'q') {
                A0y[5] = "NfGCtpMsHKBVYsn3O7a8Zqq9gxyOlhFa";
                c07096l.A01(A0A, ((Long) A09.second).longValue(), A09.first);
                return true;
            }
            throw new RuntimeException();
        }
        int A0A2 = this.A0A.A03.A0A(c07096l.A02);
        if (A0A2 == -1) {
            return false;
        }
        c07096l.A00 = A0A2;
        return true;
    }

    private boolean A17(InterfaceC2329oo interfaceC2329oo) {
        C7A A0G = this.A0j.A0G();
        C7A readingPeriodHolder = A0G.A0I();
        if (readingPeriodHolder != null) {
            C7A readingPeriodHolder2 = A0G.A0I();
            if (readingPeriodHolder2.A02 && interfaceC2329oo.A9p()) {
                return true;
            }
        }
        return false;
    }

    private boolean A18(C2268no c2268no, long j6, C7A c7a) {
        if (!c2268no.equals(c7a.A00.A04)) {
            return false;
        }
        boolean z6 = c7a.A02;
        if (A0y[1].length() == 31) {
            throw new RuntimeException();
        }
        A0y[1] = "z9";
        if (z6) {
            this.A0A.A03.A0J(this.A0A.A05.A04, this.A0c);
            int A07 = this.A0c.A07(j6);
            if (A07 != -1) {
                long A0D = this.A0c.A0D(A07);
                C7B c7b = c7a.A00;
                if (A0y[5].charAt(1) == 'q') {
                    A0y[5] = "RcBDfVPYXZ1IWswHj8kiKJAUw6BsFYM7";
                    if (A0D == c7b.A01) {
                        return true;
                    }
                    return false;
                }
                String[] strArr = A0y;
                strArr[4] = "w6QknFDGuvwfcqywG7nwGfdAAoNokq6y";
                strArr[3] = "I5j8Ais0ITqpKL2oROmKoI7QN1W2GqI7";
                if (A0D == c7b.A01) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    @MetaExoPlayerCustomizations({@MetaExoPlayerCustomization("Customized Buffered Duration MS D23157182"), @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A19(boolean z6) {
        boolean z9;
        long A0C;
        boolean z10;
        if (this.A0W.length == 0) {
            return A15();
        }
        if (!z6) {
            if (this.A0B != null) {
                this.A0E = this.A0B.A99();
            }
            return false;
        }
        if (!this.A0A.A0A) {
            return true;
        }
        C7A A0E = this.A0j.A0E();
        if (A0E.A0R()) {
            C7B c7b = A0E.A00;
            if (A0y[7].charAt(12) == '2') {
                throw new RuntimeException();
            }
            A0y[5] = "JVFQROlQoWGuZTJ8G1Kf7NjovTqMHrup";
            if (c7b.A05) {
                z9 = true;
                if (this.A0s || this.A0j.A0F() == this.A0j.A0E() || this.A0j.A0F() == null) {
                    A0C = A0E.A0C(A0E.A0D(this.A06));
                } else {
                    A0C = A03();
                }
                z10 = !z9 || this.A0i.AJy(A0C, this.A0g.A8m().A01, this.A0R, this.A00 <= 0 && (this.A04 > 0L ? 1 : (this.A04 == 0L ? 0 : -1)) > 0 && ((System.currentTimeMillis() - this.A04) > ((long) this.A00) ? 1 : ((System.currentTimeMillis() - this.A04) == ((long) this.A00) ? 0 : -1)) < 0, b.f7168b);
                if (!z10) {
                    this.A0E = EnumC1986ir.A04;
                }
                return z10;
            }
        }
        z9 = false;
        if (this.A0s) {
        }
        A0C = A0E.A0C(A0E.A0D(this.A06));
        if (z9) {
        }
        if (!z10) {
        }
        return z10;
    }

    public static C2420qI[] A1A(InterfaceC0903Eq interfaceC0903Eq) {
        int length = interfaceC0903Eq != null ? interfaceC0903Eq.length() : 0;
        C2420qI[] c2420qIArr = new C2420qI[length];
        for (int i = 0; i < length; i++) {
            c2420qIArr[i] = interfaceC0903Eq.A8B(i);
        }
        return c2420qIArr;
    }

    public final Looper A1B() {
        return this.A0b.getLooper();
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void A1C() {
        if (this.A0S) {
            return;
        }
        this.A0f.AJA(7);
        boolean z6 = false;
        while (!wasInterrupted) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z6 = true;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public final void A1D(Timeline timeline, int i, long j6) {
        this.A0f.ACj(3, new C07116n(timeline, i, j6)).A02();
    }

    public final /* synthetic */ void A1E(C07277d c07277d) {
        try {
            A0h(c07277d);
        } catch (AD e9) {
            Log.e(A0D(0, 21, 22), A0D(com.anythink.expressad.foundation.g.a.bb, 55, 119), e9);
            throw new RuntimeException(e9);
        }
    }

    public final void A1F(InterfaceC0858Cx interfaceC0858Cx, boolean z6, boolean z9) {
        this.A0f.ACi(0, z6 ? 1 : 0, z9 ? 1 : 0, interfaceC0858Cx).A02();
    }

    public final void A1G(boolean z6) {
        this.A0f.ACh(1, z6 ? 1 : 0, 0).A02();
    }

    public final void A1H(boolean z6) {
        this.A0f.ACh(6, z6 ? 1 : 0, 0).A02();
    }

    @Override // com.instagram.common.viewpoint.core.C6P
    public final void AFI(C2399px c2399px) {
        this.A0a.obtainMessage(1, c2399px).sendToTarget();
        A0T(c2399px.A01);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2270nq
    public final void AFS(InterfaceC2269np interfaceC2269np) {
        this.A0f.ACj(9, interfaceC2269np).A02();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0857Cw
    public final void AG1(InterfaceC0858Cx interfaceC0858Cx, Timeline timeline) {
        this.A0f.ACj(8, new C07086k(interfaceC0858Cx, timeline)).A02();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0908Ev
    public final void AGD() {
        this.A0f.AJA(11);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07257b
    public final synchronized void AJC(C07277d c07277d) {
        if (this.A0S) {
            Log.w(A0D(0, 21, 22), A0D(50, 37, 39));
            c07277d.A0A(false);
        } else {
            this.A0f.ACj(14, c07277d).A02();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A0D = A0D(0, 21, 22);
        try {
        } catch (AD e9) {
            Log.e(A0D, A0D(110, 15, 65), e9);
            A12(false, false);
            this.A0a.obtainMessage(2, e9).sendToTarget();
            A0H();
        } catch (IOException e10) {
            Log.e(A0D, A0D(195, 13, 40), e10);
            A12(false, false);
            this.A0a.obtainMessage(2, AD.A01(e10, 2000)).sendToTarget();
            A0H();
        } catch (RuntimeException e11) {
            Log.e(A0D, A0D(87, 23, 19), e11);
            A12(false, false);
            this.A0a.obtainMessage(2, AD.A02(e11)).sendToTarget();
            A0H();
        }
        switch (message.what) {
            case 0:
                A0r((InterfaceC0858Cx) message.obj, message.arg1 != 0, message.arg2 != 0);
                A0H();
                return true;
            case 1:
                A0z(message.arg1 != 0);
                A0H();
                return true;
            case 2:
                A0F();
                A0H();
                return true;
            case 3:
                A0f((C07116n) message.obj);
                A0H();
                return true;
            case 4:
                A0b((C2399px) message.obj);
                A0H();
                return true;
            case 5:
                A0n((C07447u) message.obj);
                A0H();
                return true;
            case 6:
                A12(message.arg1 != 0, true);
                A0H();
                return true;
            case 7:
                A0K();
                return true;
            case 8:
                A0e((C07086k) message.obj);
                A0H();
                return true;
            case 9:
                A0p((InterfaceC2269np) message.obj);
                A0H();
                return true;
            case 10:
                A0o((InterfaceC2269np) message.obj);
                A0H();
                return true;
            case 11:
                A0L();
                A0H();
                return true;
            case 12:
                A0U(message.arg1);
                A0H();
                return true;
            case 13:
                A11(message.arg1 != 0);
                A0H();
                return true;
            case 14:
                A0i((C07277d) message.obj);
                A0H();
                return true;
            case 15:
                A0k((C07277d) message.obj);
                A0H();
                return true;
            case 16:
                A0H();
                return true;
            case 17:
                A0d(null, false);
                throw null;
            case 18:
                A0c(null);
                throw null;
            case 19:
                A0u((String) message.obj);
                A0H();
                return true;
            default:
                return false;
        }
    }
}
