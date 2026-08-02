package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1051Kk implements Comparable<C1051Kk> {
    public final int A00;
    public final C1042Kb A01;

    public C1051Kk(int i, C1042Kb c1042Kb) {
        this.A00 = i;
        this.A01 = c1042Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1051Kk c1051Kk) {
        return Integer.compare(this.A00, c1051Kk.A00);
    }
}
