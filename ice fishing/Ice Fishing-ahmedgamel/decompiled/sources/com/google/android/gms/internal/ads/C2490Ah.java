package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ah, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2490Ah implements InterfaceC2728Oh {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24497n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z8 f24498u;

    public /* synthetic */ C2490Ah(Z8 z82, int i) {
        this.f24497n = i;
        this.f24498u = z82;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2728Oh
    public final void C(String str, int i, String str2, boolean z6) {
        switch (this.f24497n) {
            case 0:
                this.f24498u.d();
                break;
            default:
                Z8 z82 = this.f24498u;
                if (!z6) {
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb.append("Image Web View failed to load. Error code: ");
                    sb.append(i);
                    sb.append(", Description: ");
                    sb.append(str);
                    z82.c(new Zq(1, Wv.i(sb, ", Failing URL: ", str2)));
                    break;
                } else {
                    z82.d();
                    break;
                }
        }
    }
}
