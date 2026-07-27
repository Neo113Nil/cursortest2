package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class CO {

    /* renamed from: a, reason: collision with root package name */
    public final String f24109a;

    /* renamed from: b, reason: collision with root package name */
    public int f24110b;

    /* renamed from: c, reason: collision with root package name */
    public long f24111c;

    /* renamed from: d, reason: collision with root package name */
    public final C3676oQ f24112d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24113e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ DO f24115g;

    public CO(DO r12, String str, int i, C3676oQ c3676oQ) {
        Objects.requireNonNull(r12);
        this.f24115g = r12;
        this.f24109a = str;
        this.f24110b = i;
        this.f24111c = c3676oQ == null ? -1L : c3676oQ.f32908d;
        if (c3676oQ == null || !c3676oQ.b()) {
            return;
        }
        this.f24112d = c3676oQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r9.a()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(AbstractC3604n8 abstractC3604n8, AbstractC3604n8 abstractC3604n82) {
        C3676oQ c3676oQ;
        int i = this.f24110b;
        if (i < abstractC3604n8.a()) {
            DO r12 = this.f24115g;
            abstractC3604n8.b(i, r12.f24394a, 0L);
            U7 u72 = r12.f24394a;
            for (int i6 = u72.f27902k; i6 <= u72.f27903l; i6++) {
                int e9 = abstractC3604n82.e(abstractC3604n8.f(i6));
                if (e9 != -1) {
                    i = abstractC3604n82.d(e9, r12.f24395b, false).f25867c;
                    break;
                }
            }
            i = -1;
        }
        this.f24110b = i;
        return i != -1 && ((c3676oQ = this.f24112d) == null || abstractC3604n82.e(c3676oQ.f32905a) != -1);
    }

    public final boolean b(C4159xO c4159xO) {
        C3676oQ c3676oQ = c4159xO.f35007d;
        if (c3676oQ == null) {
            return this.f24110b != c4159xO.f35006c;
        }
        long j6 = this.f24111c;
        if (j6 == -1) {
            return false;
        }
        long j9 = c3676oQ.f32908d;
        if (j9 > j6) {
            return true;
        }
        C3676oQ c3676oQ2 = this.f24112d;
        if (c3676oQ2 == null) {
            return false;
        }
        AbstractC3604n8 abstractC3604n8 = c4159xO.f35005b;
        int e9 = abstractC3604n8.e(c3676oQ.f32905a);
        int e10 = abstractC3604n8.e(c3676oQ2.f32905a);
        if (j9 < c3676oQ2.f32908d || e9 < e10) {
            return false;
        }
        if (e9 > e10) {
            return true;
        }
        boolean b9 = c3676oQ.b();
        int i = c3676oQ2.f32906b;
        if (!b9) {
            int i6 = c3676oQ.f32909e;
            return i6 == -1 || i6 > i;
        }
        int i9 = c3676oQ.f32906b;
        if (i9 > i) {
            return true;
        }
        if (i9 == i) {
            return c3676oQ.f32907c > c3676oQ2.f32907c;
        }
        return false;
    }
}
