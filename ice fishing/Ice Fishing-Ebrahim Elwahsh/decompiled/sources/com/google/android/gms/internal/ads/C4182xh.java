package com.google.android.gms.internal.ads;

import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.xh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4182xh implements InterfaceC2639Kh {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35221n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ W8 f35222u;

    public /* synthetic */ C4182xh(W8 w82, int i) {
        this.f35221n = i;
        this.f35222u = w82;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2639Kh
    public final void k(String str, int i, String str2, boolean z8) {
        switch (this.f35221n) {
            case 0:
                this.f35222u.d();
                break;
            default:
                W8 w82 = this.f35222u;
                if (!z8) {
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb.append("Image Web View failed to load. Error code: ");
                    sb.append(i);
                    sb.append(", Description: ");
                    sb.append(str);
                    w82.b(new C3059cr(1, AbstractC5051n.g(sb, ", Failing URL: ", str2)));
                    break;
                } else {
                    w82.d();
                    break;
                }
        }
    }
}
