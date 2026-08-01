package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Bc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0794Bc extends AbstractC2252ns {
    public final int A00;

    public C0794Bc(int result) {
        super(null);
        this.A00 = result;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2252ns
    public final int A05() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2252ns
    public final AbstractC2252ns A06(int left, int right) {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2252ns
    public final AbstractC2252ns A07(long left, long right) {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2252ns
    public final <T> AbstractC2252ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2252ns
    public final AbstractC2252ns A09(boolean left, boolean right) {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2252ns
    public final AbstractC2252ns A0A(boolean left, boolean right) {
        return this;
    }
}
