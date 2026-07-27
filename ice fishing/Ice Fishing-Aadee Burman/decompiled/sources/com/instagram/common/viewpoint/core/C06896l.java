package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.6l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06896l implements Comparable<C06896l> {
    public int A00;
    public long A01;
    public Object A02;
    public final C07077d A03;

    public C06896l(C07077d c07077d) {
        this.A03 = c07077d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C06896l c06896l) {
        if ((this.A02 == null) != (c06896l.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i = this.A00 - c06896l.A00;
        if (i != 0) {
            return i;
        }
        int comparePeriodIndex = C5C.A08(this.A01, c06896l.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i, long j6, Object obj) {
        this.A00 = i;
        this.A01 = j6;
        this.A02 = obj;
    }
}
