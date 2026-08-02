package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ql, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2766Ql implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27847a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.s f27848b;

    public /* synthetic */ C2766Ql(S0.s sVar, int i) {
        this.f27847a = i;
        this.f27848b = sVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f27847a) {
            case 0:
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f27848b.f2970v;
                if (interfaceC4084vh == null) {
                    return null;
                }
                return interfaceC4084vh.q();
            case 1:
                InterfaceC4084vh interfaceC4084vh2 = (InterfaceC4084vh) this.f27848b.f2970v;
                if (interfaceC4084vh2 != null) {
                    return interfaceC4084vh2.q();
                }
                return null;
            default:
                return (InterfaceC4084vh) this.f27848b.f2970v;
        }
    }
}
