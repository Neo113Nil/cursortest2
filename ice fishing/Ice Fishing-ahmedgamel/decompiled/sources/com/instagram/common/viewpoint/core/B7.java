package com.instagram.common.viewpoint.core;

import android.os.SystemClock;
import com.anythink.basead.exoplayer.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public final class B7 {
    public static byte[] A06;
    public static String[] A07 = {"eoBlep8s1FBIN6Rt", "z5PVad8lFvymSbVcRUVN6mCVOAyUTpZZ", "CSzRbjHFCczJ9I", "vibjkM4Umklha9WpeyLj2yq757BqeZSZ", "UWrS", "", "nE8lp", "HlO2gnmnWOpwEq19Q9DE2Hcik4TJ8nc9"};
    public static final B7 A08;

    @Nullable
    public MediaCodecPoolTracker A01;

    @Nullable
    public Boolean A02;
    public volatile Map<String, Set<B0>> A04 = new HashMap();
    public final B6 A03 = new B6(this);
    public int A00 = 0;
    public volatile long A05 = -1;

    public static String A05(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A06 = new byte[]{-63, -71, -56, -75, -126, -72, -75, -54, -123, -72, -126, -75, -54, -123, -126, -72, -71, -73, -61, -72, -71, -58};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0C(boolean z6, C2016jQ c2016jQ, EnumC2013jL enumC2013jL, String str, B0 b02) {
        if (A0I(z6, c2016jQ) && A0G(str, c2016jQ)) {
            boolean z9 = true;
            synchronized (this) {
                if (this.A00 < c2016jQ.A07) {
                    Set<B0> set = this.A04.get(str);
                    if (set == null) {
                        set = A06();
                        this.A04.put(str, set);
                    }
                    if (set.contains(b02)) {
                        z9 = false;
                    } else if (((z6 && c2016jQ.A0N) || (!z6 && c2016jQ.A0M)) && set.size() < c2016jQ.A06) {
                        set.add(b02);
                        this.A00++;
                        z9 = false;
                    }
                }
                if (!z9) {
                    try {
                        try {
                            this.A05 = SystemClock.elapsedRealtime();
                            b02.reset();
                            A03().A09(enumC2013jL, b02.hashCode());
                            return;
                        } catch (IllegalStateException unused) {
                            A0B(str, b02);
                        }
                    } finally {
                        this.A05 = -1L;
                    }
                }
            }
        }
        try {
            if (!c2016jQ.A0R || (!z6 && !c2016jQ.A0Q)) {
                b02.stop();
            }
        } finally {
            A03().A08(enumC2013jL, b02.hashCode());
            b02.AHb();
            A03().A07(enumC2013jL, b02.hashCode());
        }
    }

    static {
        A08();
        A08 = new B7();
    }

    private B0 A01(boolean z6, C2016jQ c2016jQ, EnumC2013jL enumC2013jL, String str) throws MediaCodecInitializationException {
        B0 A03;
        if (A0I(z6, c2016jQ) && A0G(str, c2016jQ)) {
            synchronized (this) {
                Set<B0> set = this.A04.get(str);
                if (set != null && !set.isEmpty()) {
                    this.A00--;
                    Iterator<B0> it = set.iterator();
                    B0 ret = it.next();
                    it.remove();
                    A03().A0A(z6, str, enumC2013jL, ret.hashCode());
                    return ret;
                }
            }
        }
        try {
            C2011jJ A05 = A03().A05(z6, str, enumC2013jL);
            A03 = this.A03.A03(z6, str);
            A03().A06(A05, A03.hashCode());
            return A03;
        } catch (Exception e9) {
            throw new MediaCodecInitializationException(str, e9);
        }
    }

    public static B7 A02() {
        B7 b72 = A08;
        String[] strArr = A07;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "gdX1n";
        strArr2[4] = "uqN6";
        return b72;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaCodecPoolTracker A03() {
        if (this.A01 != null) {
            return this.A01;
        }
        return NoOpMediaCodecPoolTracker.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<B0> A06() {
        if (this.A02 != null && this.A02.booleanValue()) {
            return new CopyOnWriteArraySet();
        }
        return new HashSet();
    }

    private void A09(MediaCodecPoolTracker mediaCodecPoolTracker) {
        if (this.A01 == null) {
            this.A01 = mediaCodecPoolTracker;
        }
    }

    private void A0A(C2016jQ c2016jQ) {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(c2016jQ.A0S);
                    if (this.A02.booleanValue()) {
                        this.A04 = new ConcurrentHashMap();
                    }
                }
            }
        }
    }

    private void A0B(String str, B0 b02) {
        Set<B0> set = this.A04.get(str);
        if (set != null && set.remove(b02)) {
            int i = this.A00;
            String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[1].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "FxBrmOrzGAHEl951IE67fieu752sH0JZ";
            strArr2[1] = "QwM4isUBZzXVsf3PyxWpFGvjBfZOcOMZ";
            this.A00 = i - 1;
        }
    }

    public static boolean A0E(String str) {
        return str.equals(A05(0, 22, 10));
    }

    public static boolean A0G(String str, C2016jQ c2016jQ) {
        if (A0E(str) && c2016jQ.A0C) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(boolean z6, C2016jQ c2016jQ) {
        if (c2016jQ.A0E && this.A05 != -1 && SystemClock.elapsedRealtime() - this.A05 > f.f7973a) {
            return false;
        }
        return A0J(z6, c2016jQ);
    }

    public static boolean A0J(boolean z6, C2016jQ c2016jQ) {
        return (z6 && c2016jQ.A0N) || (!z6 && c2016jQ.A0M);
    }

    public final B0 A0K(boolean z6, C2016jQ c2016jQ, MediaCodecPoolTracker mediaCodecPoolTracker, EnumC2013jL enumC2013jL, String str) throws MediaCodecInitializationException {
        B0 A02;
        A09(mediaCodecPoolTracker);
        A0A(c2016jQ);
        if (c2016jQ.A0K) {
            A02 = this.A03.A02(z6, c2016jQ, enumC2013jL, str);
            String[] strArr = A07;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "ttyEUrXfsAwEm9Eniby4AXTGkmRMb34Z";
            strArr2[1] = "BAFCEyHtTeugEvQpUcdazZ0OUcRhptwZ";
            return A02;
        }
        return A01(z6, c2016jQ, enumC2013jL, str);
    }

    public final void A0L(boolean z6, C2016jQ c2016jQ, MediaCodecPoolTracker mediaCodecPoolTracker, EnumC2013jL enumC2013jL, String str, B0 b02) {
        A09(mediaCodecPoolTracker);
        if (c2016jQ.A0K) {
            this.A03.A0A(z6, c2016jQ, enumC2013jL, str, b02);
        } else {
            A0C(z6, c2016jQ, enumC2013jL, str, b02);
        }
    }
}
