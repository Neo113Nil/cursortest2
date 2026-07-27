package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class LP {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static LN A02(InterfaceC2191ms interfaceC2191ms) throws IOException {
        byte[] bArr;
        C06474v c06474v = new C06474v(16);
        LO A03 = A03(1718449184, interfaceC2191ms, c06474v);
        AbstractC06243y.A08(A03.A01 >= 16);
        interfaceC2191ms.AGt(c06474v.A0l(), 0, 16);
        c06474v.A0f(0);
        int A0G = c06474v.A0G();
        int A0G2 = c06474v.A0G();
        int A0F = c06474v.A0F();
        int A0F2 = c06474v.A0F();
        int A0G3 = c06474v.A0G();
        int A0G4 = c06474v.A0G();
        int i = ((int) A03.A01) - 16;
        if (i > 0) {
            bArr = new byte[i];
            interfaceC2191ms.AGt(bArr, 0, i);
        } else {
            bArr = C5C.A07;
        }
        interfaceC2191ms.AK3((int) (interfaceC2191ms.A8i() - interfaceC2191ms.A8n()));
        return new LN(A0G, A0G2, A0F, A0F2, A0G3, A0G4, bArr);
    }

    public static String A04(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{59, 16, 13, 22, 19, 88, 17, 11, 88, 12, 23, 23, 88, 20, 25, 10, 31, 29, 88, 80, 6, 74, c.f16318c, 58, 83, 81, 88, 12, 23, 88, 11, 19, 17, 8, 67, 88, 17, 28, 66, 88, 45, 3, 10, 11, 22, 13, 10, 3, 68, 17, 10, 15, 10, 11, 19, 10, 68, 51, 37, 50, 68, 7, 12, 17, 10, 15, 94, 68, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, 28, 90, 83, 78, 81, 28, 72, 69, 76, 89, 6, 28, 105, 95, 72, 118, 91, 95, 90, 91, 76, 108, 91, 95, 90, 91, 76};
    }

    static {
        A05();
    }

    public static long A00(InterfaceC2191ms interfaceC2191ms) throws IOException {
        C06474v c06474v = new C06474v(8);
        LO chunkHeader = LO.A00(interfaceC2191ms, c06474v);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC2191ms.AIl();
            return -1L;
        }
        interfaceC2191ms.A47(8);
        c06474v.A0f(0);
        interfaceC2191ms.AGt(c06474v.A0l(), 0, 8);
        long sampleDataSize = c06474v.A0N();
        interfaceC2191ms.AK3(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC2191ms interfaceC2191ms) throws IOException {
        interfaceC2191ms.AIl();
        LO A03 = A03(1684108385, interfaceC2191ms, new C06474v(8));
        interfaceC2191ms.AK3(8);
        return Pair.create(Long.valueOf(interfaceC2191ms.A8n()), Long.valueOf(A03.A01));
    }

    public static LO A03(int i, InterfaceC2191ms interfaceC2191ms, C06474v c06474v) throws IOException {
        LO A002 = LO.A00(interfaceC2191ms, c06474v);
        while (A002.A00 != i) {
            AbstractC06324g.A07(A04(91, 15, 125), A04(40, 28, 39) + A002.A00);
            long j6 = A002.A01 + 8;
            if (j6 <= 2147483647L) {
                interfaceC2191ms.AK3((int) j6);
                A002 = LO.A00(interfaceC2191ms, c06474v);
            } else {
                throw C3K.A00(A04(0, 40, 59) + A002.A00);
            }
        }
        return A002;
    }

    public static boolean A06(InterfaceC2191ms interfaceC2191ms) throws IOException {
        C06474v c06474v = new C06474v(8);
        LO A002 = LO.A00(interfaceC2191ms, c06474v);
        if (A002.A00 != 1380533830) {
            int i = A002.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i != 1380333108) {
                return false;
            }
        }
        interfaceC2191ms.AGt(c06474v.A0l(), 0, 4);
        c06474v.A0f(0);
        int A0C = c06474v.A0C();
        if (A0C != 1463899717) {
            AbstractC06324g.A05(A04(91, 15, 125), A04(68, 23, a.f21728R) + A0C);
            return false;
        }
        return true;
    }
}
