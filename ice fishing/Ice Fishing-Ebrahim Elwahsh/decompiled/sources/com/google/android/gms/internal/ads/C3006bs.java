package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.bs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3006bs implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29598a = 1;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4279zN f29599b;

    public /* synthetic */ C3006bs() {
    }

    public static void a(C3006bs c3006bs, InterfaceC4279zN interfaceC4279zN) {
        if (c3006bs.f29599b != null) {
            throw new IllegalStateException();
        }
        c3006bs.f29599b = interfaceC4279zN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f29598a) {
            case 0:
                return new Or(1, (Set) this.f29599b.d());
            default:
                InterfaceC4279zN interfaceC4279zN = this.f29599b;
                if (interfaceC4279zN != null) {
                    return interfaceC4279zN.d();
                }
                throw new IllegalStateException();
        }
    }

    public C3006bs(InterfaceC4279zN interfaceC4279zN) {
        this.f29599b = interfaceC4279zN;
    }
}
