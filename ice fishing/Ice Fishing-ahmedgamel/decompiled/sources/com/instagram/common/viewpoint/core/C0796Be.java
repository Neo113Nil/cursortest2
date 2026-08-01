package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0796Be extends AbstractC2252ns {
    public C0796Be() {
        super(null);
    }

    private final AbstractC2252ns A00(int result) {
        AbstractC2252ns abstractC2252ns;
        AbstractC2252ns abstractC2252ns2;
        AbstractC2252ns abstractC2252ns3;
        if (result < 0) {
            abstractC2252ns3 = AbstractC2252ns.A02;
            return abstractC2252ns3;
        }
        if (result > 0) {
            abstractC2252ns2 = AbstractC2252ns.A01;
            return abstractC2252ns2;
        }
        abstractC2252ns = AbstractC2252ns.A00;
        return abstractC2252ns;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2252ns
    public final int A05() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2252ns
    public final AbstractC2252ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2252ns
    public final AbstractC2252ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2252ns
    public final <T> AbstractC2252ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2252ns
    public final AbstractC2252ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2252ns
    public final AbstractC2252ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
