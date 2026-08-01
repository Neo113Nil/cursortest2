package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class E2 implements InterfaceC3329i1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24527n = 1;

    /* renamed from: u, reason: collision with root package name */
    public int f24528u;

    /* renamed from: v, reason: collision with root package name */
    public long f24529v;

    /* renamed from: w, reason: collision with root package name */
    public int f24530w;

    public /* synthetic */ E2() {
    }

    public String toString() {
        switch (this.f24527n) {
            case 0:
                String a9 = AbstractC3159eu.a(this.f24528u);
                int length = a9.length();
                long j6 = this.f24529v;
                int length2 = String.valueOf(j6).length();
                int i = this.f24530w;
                StringBuilder sb = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i).length() + 1);
                sb.append("AtomSizeTooSmall{type=");
                sb.append(a9);
                sb.append(", size=");
                sb.append(j6);
                sb.append(", minHeaderSize=");
                sb.append(i);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public E2(int i, long j6, int i6) {
        this.f24528u = i;
        this.f24529v = j6;
        this.f24530w = i6;
    }
}
