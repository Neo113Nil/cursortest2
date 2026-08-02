package com.instagram.common.viewpoint.core;

import com.anythink.core.common.w;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public final class B2<T> extends AbstractC2422qK<T> implements Serializable {
    public static byte[] A01;
    public static String[] A02 = {"TYphIuCeMUBPtejfiFOUwjFxcT4QBTq", "8HYxpO9zw1uGMW", "bftleM0W", "QbbbyMJUXm1d4Xd", "2naIPdaT", "exbXjeCkSw", w.f17699a, "Nm7"};
    public static final long serialVersionUID = 0;
    public final AbstractC2422qK<? super T> A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-30, 38, 25, 42, 25, 38, 39, 25, -36, -35};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<? super T> */
    public B2(AbstractC2422qK<? super T> forwardOrder) {
        this.A00 = (AbstractC2422qK) AbstractC2090ki.A04(forwardOrder);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    @Override // com.instagram.common.viewpoint.core.AbstractC2422qK
    public final <S extends T> AbstractC2422qK<S> A06() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    @Override // com.instagram.common.viewpoint.core.AbstractC2422qK, java.util.Comparator
    public final int compare(@ParametricNullness T a9, @ParametricNullness T b9) {
        return this.A00.compare(b9, a9);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object object) {
        if (object != this) {
            if (object instanceof B2) {
                return this.A00.equals(((B2) object).A00);
            }
            return false;
        }
        String[] strArr = A02;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[2] = "3jzErf5H";
        strArr2[4] = "YYoE6Ooa";
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    public final int hashCode() {
        return -this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B2 != com.google.common.collect.ReverseOrdering<T> */
    public final String toString() {
        return this.A00 + A00(0, 10, 125);
    }
}
