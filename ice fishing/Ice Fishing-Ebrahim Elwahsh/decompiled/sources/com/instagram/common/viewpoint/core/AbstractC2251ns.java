package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2251ns {
    public static final AbstractC2251ns A00 = new C0795Be();
    public static final AbstractC2251ns A02 = new C0793Bc(-1);
    public static final AbstractC2251ns A01 = new C0793Bc(1);

    public abstract int A05();

    public abstract AbstractC2251ns A06(int left, int right);

    public abstract AbstractC2251ns A07(long left, long right);

    public abstract <T> AbstractC2251ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC2251ns A09(boolean left, boolean right);

    public abstract AbstractC2251ns A0A(boolean left, boolean right);

    public AbstractC2251ns() {
    }

    public /* synthetic */ AbstractC2251ns(C0795Be c0795Be) {
        this();
    }

    public static AbstractC2251ns A01() {
        return A00;
    }
}
