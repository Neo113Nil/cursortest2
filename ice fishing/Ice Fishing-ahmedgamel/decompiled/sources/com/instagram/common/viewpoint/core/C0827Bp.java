package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Bp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0827Bp<F, T> extends AbstractC2422qK<F> implements Serializable {
    public static byte[] A02;
    public static String[] A03 = {"qP7uN3CTeBtugcvn4iscvs4NawNVw3hj", "uACvKKD4Xh814PQzJz7fno8Y0d2htzTr", "OaGwUL0wruZXrmXuBUYR8eOdlsWVX5jO", "JY9GX7tPgJ", "UJNVJd39Mn7RrVqRZr4HQjubetYZ2pJj", "tP9Bx5HW1SG5GbSCFf4kAQmgB2SyEv9b", "xcsG1NfXHnFrLoKWAotfCT6bqQ3ToZXO", "wDWfKnr2Hnyq67FaxNzVQD5A0FwwfXbW"};
    public static final long serialVersionUID = 0;
    public final InterfaceC2071kO<F, ? extends T> A00;
    public final AbstractC2422qK<T> A01;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[2].charAt(0) == strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            A03[1] = "UOsr4mSSP3XVk2xA78tBNfMlPB0RSTkt";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 5);
            i9++;
        }
    }

    public static void A01() {
        A02 = new byte[]{78, 122, 59, 58, 6, 49, 39, 33, 56, 32, 27, 50, 124};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof C0827Bp)) {
            return false;
        }
        C0827Bp c0827Bp = (C0827Bp) object;
        return this.A00.equals(c0827Bp.A00) && this.A01.equals(c0827Bp.A01);
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.google.common.collect.ByFunctionOrdering<F, T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kO != com.google.common.base.Function<F, ? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<T> */
    public C0827Bp(InterfaceC2071kO<F, ? extends T> function, AbstractC2422qK<T> ordering) {
        this.A00 = (InterfaceC2071kO) AbstractC2090ki.A04(function);
        this.A01 = (AbstractC2422qK) AbstractC2090ki.A04(ordering);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.google.common.collect.ByFunctionOrdering<F, T> */
    @Override // com.instagram.common.viewpoint.core.AbstractC2422qK, java.util.Comparator
    public final int compare(@ParametricNullness F f2, @ParametricNullness F f9) {
        return this.A01.compare(this.A00.A4B(f2), this.A00.A4B(f9));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.google.common.collect.ByFunctionOrdering<F, T> */
    public final int hashCode() {
        return CB.A00(this.A00, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.google.common.collect.ByFunctionOrdering<F, T> */
    public final String toString() {
        return this.A01 + A00(1, 12, 81) + this.A00 + A00(0, 1, 98);
    }
}
