package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0816Be extends AbstractC2272ns {
    public C0816Be() {
        super(null);
    }

    private final AbstractC2272ns A00(int result) {
        AbstractC2272ns abstractC2272ns;
        AbstractC2272ns abstractC2272ns2;
        AbstractC2272ns abstractC2272ns3;
        if (result < 0) {
            abstractC2272ns3 = AbstractC2272ns.A02;
            return abstractC2272ns3;
        }
        if (result > 0) {
            abstractC2272ns2 = AbstractC2272ns.A01;
            return abstractC2272ns2;
        }
        abstractC2272ns = AbstractC2272ns.A00;
        return abstractC2272ns;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2272ns
    public final int A05() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2272ns
    public final AbstractC2272ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2272ns
    public final AbstractC2272ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2272ns
    public final <T> AbstractC2272ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2272ns
    public final AbstractC2272ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2272ns
    public final AbstractC2272ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
