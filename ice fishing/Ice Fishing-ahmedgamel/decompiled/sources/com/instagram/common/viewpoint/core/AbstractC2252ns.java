package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2252ns {
    public static final AbstractC2252ns A00 = new C0796Be();
    public static final AbstractC2252ns A02 = new C0794Bc(-1);
    public static final AbstractC2252ns A01 = new C0794Bc(1);

    public abstract int A05();

    public abstract AbstractC2252ns A06(int left, int right);

    public abstract AbstractC2252ns A07(long left, long right);

    public abstract <T> AbstractC2252ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC2252ns A09(boolean left, boolean right);

    public abstract AbstractC2252ns A0A(boolean left, boolean right);

    public AbstractC2252ns() {
    }

    public /* synthetic */ AbstractC2252ns(C0796Be c0796Be) {
        this();
    }

    public static AbstractC2252ns A01() {
        return A00;
    }
}
