package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1031Kk implements Comparable<C1031Kk> {
    public final int A00;
    public final C1022Kb A01;

    public C1031Kk(int i, C1022Kb c1022Kb) {
        this.A00 = i;
        this.A01 = c1022Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1031Kk c1031Kk) {
        return Integer.compare(this.A00, c1031Kk.A00);
    }
}
