package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3015bn implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3901sD f30117b;

    public /* synthetic */ C3015bn(C3901sD c3901sD, int i) {
        this.f30116a = i;
        this.f30117b = c3901sD;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final P3.a a(Object obj) {
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
        switch (this.f30116a) {
            case 0:
                if (interfaceC4084vh != null) {
                    return this.f30117b;
                }
                throw new Zq(1, "Retrieve Web View from image ad response failed.");
            default:
                if (interfaceC4084vh == null || interfaceC4084vh.g() == null) {
                    throw new Zq(1, "Retrieve video view in html5 ad response failed.");
                }
                return this.f30117b;
        }
    }
}
