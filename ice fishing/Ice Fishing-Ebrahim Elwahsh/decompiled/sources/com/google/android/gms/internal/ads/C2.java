package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class C2 implements InterfaceC3234g1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24128n = 1;

    /* renamed from: u, reason: collision with root package name */
    public int f24129u;

    /* renamed from: v, reason: collision with root package name */
    public long f24130v;

    /* renamed from: w, reason: collision with root package name */
    public int f24131w;

    public /* synthetic */ C2() {
    }

    public String toString() {
        switch (this.f24128n) {
            case 0:
                String a9 = AbstractC3548lu.a(this.f24129u);
                int length = a9.length();
                long j9 = this.f24130v;
                int length2 = String.valueOf(j9).length();
                int i = this.f24131w;
                StringBuilder sb = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i).length() + 1);
                sb.append("AtomSizeTooSmall{type=");
                sb.append(a9);
                sb.append(", size=");
                sb.append(j9);
                sb.append(", minHeaderSize=");
                sb.append(i);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C2(int i, long j9, int i4) {
        this.f24129u = i;
        this.f24130v = j9;
        this.f24131w = i4;
    }
}
