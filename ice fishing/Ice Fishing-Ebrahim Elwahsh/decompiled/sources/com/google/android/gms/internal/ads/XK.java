package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class XK extends YD {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f28631c = AbstractC3036cM.f29699d;

    /* renamed from: b, reason: collision with root package name */
    public C2478Aq f28632b;

    public static int j(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int k(long j9) {
        return (640 - (Long.numberOfLeadingZeros(j9) * 9)) >>> 6;
    }

    public abstract void A(int i);

    public abstract void B(int i);

    public abstract void C(long j9);

    public abstract void D(long j9);

    public abstract void E(String str);

    public abstract int F();

    public final void l() {
        if (F() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (F() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void m(int i, int i4);

    public abstract void n(int i, int i4);

    public abstract void o(int i, int i4);

    public abstract void p(int i, int i4);

    public abstract void q(int i, long j9);

    public abstract void r(int i, long j9);

    public abstract void s(int i, boolean z8);

    public abstract void t(int i, String str);

    public abstract void u(int i, SK sk);

    public abstract void v(SK sk);

    public abstract void w(int i, byte[] bArr);

    public abstract void x(IK ik);

    public abstract void y(byte b9);

    public abstract void z(int i);
}
