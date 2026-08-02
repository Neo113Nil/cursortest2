package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class CO {

    /* renamed from: a, reason: collision with root package name */
    public final String f24872a;

    /* renamed from: b, reason: collision with root package name */
    public int f24873b;

    /* renamed from: c, reason: collision with root package name */
    public long f24874c;

    /* renamed from: d, reason: collision with root package name */
    public final C3860rQ f24875d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24876e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ DO f24878g;

    public CO(DO r1, String str, int i, C3860rQ c3860rQ) {
        Objects.requireNonNull(r1);
        this.f24878g = r1;
        this.f24872a = str;
        this.f24873b = i;
        this.f24874c = c3860rQ == null ? -1L : c3860rQ.f34409d;
        if (c3860rQ == null || !c3860rQ.b()) {
            return;
        }
        this.f24875d = c3860rQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r9.a()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(AbstractC3627n8 abstractC3627n8, AbstractC3627n8 abstractC3627n82) {
        C3860rQ c3860rQ;
        int i = this.f24873b;
        if (i < abstractC3627n8.a()) {
            DO r1 = this.f24878g;
            abstractC3627n8.b(i, r1.f25139a, 0L);
            U7 u72 = r1.f25139a;
            for (int i4 = u72.f28699k; i4 <= u72.f28700l; i4++) {
                int e9 = abstractC3627n82.e(abstractC3627n8.f(i4));
                if (e9 != -1) {
                    i = abstractC3627n82.d(e9, r1.f25140b, false).f26619c;
                    break;
                }
            }
            i = -1;
        }
        this.f24873b = i;
        return i != -1 && ((c3860rQ = this.f24875d) == null || abstractC3627n82.e(c3860rQ.f34406a) != -1);
    }

    public final boolean b(C4182xO c4182xO) {
        C3860rQ c3860rQ = c4182xO.f35788d;
        if (c3860rQ == null) {
            return this.f24873b != c4182xO.f35787c;
        }
        long j6 = this.f24874c;
        if (j6 == -1) {
            return false;
        }
        long j9 = c3860rQ.f34409d;
        if (j9 > j6) {
            return true;
        }
        C3860rQ c3860rQ2 = this.f24875d;
        if (c3860rQ2 == null) {
            return false;
        }
        AbstractC3627n8 abstractC3627n8 = c4182xO.f35786b;
        int e9 = abstractC3627n8.e(c3860rQ.f34406a);
        int e10 = abstractC3627n8.e(c3860rQ2.f34406a);
        if (j9 < c3860rQ2.f34409d || e9 < e10) {
            return false;
        }
        if (e9 > e10) {
            return true;
        }
        boolean b9 = c3860rQ.b();
        int i = c3860rQ2.f34407b;
        if (!b9) {
            int i4 = c3860rQ.f34410e;
            return i4 == -1 || i4 > i;
        }
        int i6 = c3860rQ.f34407b;
        if (i6 > i) {
            return true;
        }
        if (i6 == i) {
            return c3860rQ.f34408c > c3860rQ2.f34408c;
        }
        return false;
    }
}
