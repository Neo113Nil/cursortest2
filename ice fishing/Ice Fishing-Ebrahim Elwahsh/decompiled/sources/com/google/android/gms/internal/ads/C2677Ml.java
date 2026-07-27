package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ml, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2677Ml implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26372a;

    /* renamed from: b, reason: collision with root package name */
    public final C2881Yl f26373b;

    public /* synthetic */ C2677Ml(C2881Yl c2881Yl, int i) {
        this.f26372a = i;
        this.f26373b = c2881Yl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f26372a) {
            case 0:
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f26373b.f28863v;
                if (interfaceC3858rh == null) {
                    return null;
                }
                return interfaceC3858rh.s();
            case 1:
                InterfaceC3858rh interfaceC3858rh2 = (InterfaceC3858rh) this.f26373b.f28863v;
                if (interfaceC3858rh2 != null) {
                    return interfaceC3858rh2.s();
                }
                return null;
            default:
                return (InterfaceC3858rh) this.f26373b.f28863v;
        }
    }
}
