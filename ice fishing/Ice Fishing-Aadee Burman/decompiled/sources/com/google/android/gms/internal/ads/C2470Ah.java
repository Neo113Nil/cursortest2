package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ah, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2470Ah implements InterfaceC2708Oh {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23715n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z8 f23716u;

    public /* synthetic */ C2470Ah(Z8 z82, int i) {
        this.f23715n = i;
        this.f23716u = z82;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Oh
    public final void z(String str, int i, String str2, boolean z3) {
        switch (this.f23715n) {
            case 0:
                this.f23716u.d();
                break;
            default:
                Z8 z82 = this.f23716u;
                if (!z3) {
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb.append("Image Web View failed to load. Error code: ");
                    sb.append(i);
                    sb.append(", Description: ");
                    sb.append(str);
                    z82.c(new Zq(1, u1.h.g(sb, ", Failing URL: ", str2)));
                    break;
                } else {
                    z82.d();
                    break;
                }
        }
    }
}
