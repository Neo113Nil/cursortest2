package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class E2 implements InterfaceC3352i1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25288n = 1;

    /* renamed from: u, reason: collision with root package name */
    public int f25289u;

    /* renamed from: v, reason: collision with root package name */
    public long f25290v;

    /* renamed from: w, reason: collision with root package name */
    public int f25291w;

    public /* synthetic */ E2() {
    }

    public String toString() {
        switch (this.f25288n) {
            case 0:
                String a9 = AbstractC3182eu.a(this.f25289u);
                int length = a9.length();
                long j6 = this.f25290v;
                int length2 = String.valueOf(j6).length();
                int i = this.f25291w;
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

    public E2(int i, long j6, int i4) {
        this.f25289u = i;
        this.f25290v = j6;
        this.f25291w = i4;
    }
}
