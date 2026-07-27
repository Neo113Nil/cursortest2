package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1030Kk implements Comparable<C1030Kk> {
    public final int A00;
    public final C1021Kb A01;

    public C1030Kk(int i, C1021Kb c1021Kb) {
        this.A00 = i;
        this.A01 = c1021Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1030Kk c1030Kk) {
        return Integer.compare(this.A00, c1030Kk.A00);
    }
}
