package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Bundle;
import com.anythink.basead.exoplayer.b;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.pj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2385pj implements AnonymousClass24 {
    public static byte[] A0H;
    public static String[] A0I = {"AtN4gZlBq", "c6vG0ZoB350sNCwGTcbmyQxG", "GzjisXMF7MeBETThzgY0McLZmUxvZEHG", "X6Q", "OR9IAwpAbXPQPDykEqLOHO0nD", "OJOMvHQBuYweGyqOlvOJ7Ft7l3L2", "Cgb", "Ei80eZ3oJ"};
    public static final AnonymousClass23<C2385pj> A0J;
    public static final Object A0K;
    public static final C2409q7 A0L;
    public static final Object A0M;
    public static final String A0N;
    public static final String A0O;
    public static final String A0P;
    public static final String A0Q;
    public static final String A0R;
    public static final String A0S;
    public static final String A0T;
    public static final String A0U;
    public static final String A0V;
    public static final String A0W;
    public static final String A0X;
    public static final String A0Y;
    public static final String A0Z;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C2412qA A08;
    public Object A0A;

    @Deprecated
    public Object A0B;
    public boolean A0D;

    @Deprecated
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Object A0C = A0K;
    public C2409q7 A09 = A0L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C2385pj A00(Bundle bundle) {
        C2412qA c2412qA;
        Bundle bundle2 = bundle.getBundle(A0W);
        C2409q7 A6f = bundle2 != null ? C2409q7.A08.A6f(bundle2) : C2409q7.A09;
        long j6 = bundle.getLong(A0Y, b.f7168b);
        long j9 = bundle.getLong(A0Z, b.f7168b);
        long j10 = bundle.getLong(A0P, b.f7168b);
        boolean z6 = bundle.getBoolean(A0T, false);
        boolean z9 = bundle.getBoolean(A0R, false);
        Bundle bundle3 = bundle.getBundle(A0V);
        if (bundle3 != null) {
            c2412qA = C2412qA.A06.A6f(bundle3);
        } else {
            c2412qA = null;
            if (A0I[2].charAt(1) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[6] = "auZ";
            strArr[3] = "aKQ";
        }
        boolean z10 = bundle.getBoolean(A0S, false);
        long j11 = bundle.getLong(A0N, 0L);
        long j12 = bundle.getLong(A0O, b.f7168b);
        int i = bundle.getInt(A0Q, 0);
        int i4 = bundle.getInt(A0U, 0);
        long j13 = bundle.getLong(A0X, 0L);
        C2385pj c2385pj = new C2385pj();
        c2385pj.A07(A0M, A6f, null, j6, j9, j10, z6, z9, c2412qA, j11, j12, i, i4, j13);
        c2385pj.A0F = z10;
        return c2385pj;
    }

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0H = new byte[]{6, 10, 8, 75, 3, 4, 6, 0, 7, 10, 10, 14, 75, 4, 1, 22, 75, 4, 11, 1, 23, 10, 12, 1, 29, 75, 8, 0, 1, 12, 4, 86, 75, 6, 10, 8, 8, 10, 11, 75, 49, 12, 8, 0, 9, 12, 11, 0};
    }

    static {
        A03();
        A0K = new Object();
        A0M = new Object();
        A0L = new C06162u().A03(A02(0, 48, 107)).A00(Uri.EMPTY).A05();
        A0W = C5C.A0h(1);
        A0Y = C5C.A0h(2);
        A0Z = C5C.A0h(3);
        A0P = C5C.A0h(4);
        A0T = C5C.A0h(5);
        A0R = C5C.A0h(6);
        A0V = C5C.A0h(7);
        A0S = C5C.A0h(8);
        A0N = C5C.A0h(9);
        A0O = C5C.A0h(10);
        A0Q = C5C.A0h(11);
        A0U = C5C.A0h(12);
        A0X = C5C.A0h(13);
        A0J = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pk
            @Override // com.instagram.common.viewpoint.core.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                C2385pj A00;
                A00 = C2385pj.A00(bundle);
                return A00;
            }
        };
    }

    public final long A04() {
        return C5C.A0P(this.A02);
    }

    public final long A05() {
        return this.A02;
    }

    public final long A06() {
        return C5C.A0P(this.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r4 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r0 = r7.A03.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r4 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2385pj A07(Object obj, C2409q7 c2409q7, Object obj2, long j6, long j9, long j10, boolean z6, boolean z9, C2412qA c2412qA, long j11, long j12, int i, int i4, long j13) {
        this.A0C = obj;
        this.A09 = c2409q7 != null ? c2409q7 : A0L;
        if (A0I[2].charAt(1) != 'z') {
            throw new RuntimeException();
        }
        A0I[5] = "sHLAwqiYlmMVa087WjDP7yFYW";
        if (c2409q7 != null) {
            AnonymousClass32 anonymousClass32 = c2409q7.A03;
            if (A0I[2].charAt(1) != 'z') {
                A0I[2] = "JzGzHC0FwGnnWhMzWBrJaCXM29VIx9g1";
            } else {
                A0I[5] = "IGwZtC";
            }
            this.A0B = r0;
            this.A0A = obj2;
            this.A06 = j6;
            this.A07 = j9;
            this.A04 = j10;
            this.A0G = z6;
            this.A0D = z9;
            this.A0E = c2412qA == null;
            this.A08 = c2412qA;
            this.A02 = j11;
            this.A03 = j12;
            this.A00 = i;
            this.A01 = i4;
            this.A05 = j13;
            this.A0F = false;
            return this;
        }
        Object obj3 = null;
        this.A0B = obj3;
        this.A0A = obj2;
        this.A06 = j6;
        this.A07 = j9;
        this.A04 = j10;
        this.A0G = z6;
        this.A0D = z9;
        this.A0E = c2412qA == null;
        this.A08 = c2412qA;
        this.A02 = j11;
        this.A03 = j12;
        this.A00 = i;
        this.A01 = i4;
        this.A05 = j13;
        this.A0F = false;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C2385pj c2385pj = (C2385pj) obj;
        if (C5C.A1E(this.A0C, c2385pj.A0C) && C5C.A1E(this.A09, c2385pj.A09) && C5C.A1E(this.A0A, c2385pj.A0A) && C5C.A1E(this.A08, c2385pj.A08) && this.A06 == c2385pj.A06 && this.A07 == c2385pj.A07 && this.A04 == c2385pj.A04 && this.A0G == c2385pj.A0G && this.A0D == c2385pj.A0D && this.A0F == c2385pj.A0F && this.A02 == c2385pj.A02 && this.A03 == c2385pj.A03 && this.A00 == c2385pj.A00 && this.A01 == c2385pj.A01) {
            long j6 = this.A05;
            long j9 = c2385pj.A05;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[6] = "Zdu";
            strArr2[3] = "ITW";
            if (j6 == j9) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((7 * 31) + this.A0C.hashCode()) * 31) + this.A09.hashCode()) * 31) + (this.A0A == null ? 0 : this.A0A.hashCode())) * 31) + (this.A08 != null ? this.A08.hashCode() : 0)) * 31) + ((int) (this.A06 ^ (this.A06 >>> 32)))) * 31) + ((int) (this.A07 ^ (this.A07 >>> 32)))) * 31) + ((int) (this.A04 ^ (this.A04 >>> 32)))) * 31) + (this.A0G ? 1 : 0);
        if (A0I[2].charAt(1) != 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[6] = "6VN";
        strArr[3] = "iNJ";
        return (((((((((((((hashCode * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) (this.A05 ^ (this.A05 >>> 32)));
    }
}
