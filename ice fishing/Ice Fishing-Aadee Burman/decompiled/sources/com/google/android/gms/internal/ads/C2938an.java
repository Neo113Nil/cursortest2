package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.an, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2938an implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3878sD f29123b;

    public /* synthetic */ C2938an(C3878sD c3878sD, int i) {
        this.f29122a = i;
        this.f29123b = c3878sD;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final N3.a a(Object obj) {
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
        switch (this.f29122a) {
            case 0:
                if (interfaceC4061vh != null) {
                    return this.f29123b;
                }
                throw new Zq(1, "Retrieve Web View from image ad response failed.");
            default:
                if (interfaceC4061vh == null || interfaceC4061vh.g() == null) {
                    throw new Zq(1, "Retrieve video view in html5 ad response failed.");
                }
                return this.f29123b;
        }
    }
}
