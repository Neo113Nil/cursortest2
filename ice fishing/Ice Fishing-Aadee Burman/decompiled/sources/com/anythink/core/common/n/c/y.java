package com.anythink.core.common.n.c;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f15929a = Charset.forName("UTF-8");

    private y() {
    }

    public static int a(int i) {
        return ((i & com.anythink.basead.exoplayer.k.p.f8473b) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static long a(long j6) {
        return ((j6 & 255) << 56) | (((-72057594037927936L) & j6) >>> 56) | ((71776119061217280L & j6) >>> 40) | ((280375465082880L & j6) >>> 24) | ((1095216660480L & j6) >>> 8) | ((4278190080L & j6) << 8) | ((16711680 & j6) << 24) | ((65280 & j6) << 40);
    }

    public static short a(short s9) {
        return (short) (((s9 & 255) << 8) | ((65280 & s9) >>> 8));
    }

    public static void a(long j6, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j6 || j6 - j9 < j10) {
            throw new ArrayIndexOutOfBoundsException("size=" + j6 + " offset=" + j9 + " byteCount=" + j10);
        }
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i6, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (bArr[i10 + i] != bArr2[i10 + i6]) {
                return false;
            }
        }
        return true;
    }

    public static void a(Throwable th) {
        throw th;
    }

    private static <T extends Throwable> void b(Throwable th) {
        throw th;
    }
}
