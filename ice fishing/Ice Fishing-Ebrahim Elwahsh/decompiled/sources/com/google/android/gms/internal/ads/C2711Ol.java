package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Ol, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2711Ol implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26754a;

    /* renamed from: b, reason: collision with root package name */
    public final C2881Yl f26755b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f26756c;

    public /* synthetic */ C2711Ol(C2881Yl c2881Yl, C4009uN c4009uN, int i) {
        this.f26754a = i;
        this.f26755b = c2881Yl;
        this.f26756c = c4009uN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f26754a) {
            case 0:
                Set r9 = this.f26755b.r((C3216fk) this.f26756c.d());
                AbstractC3137eE.h(r9);
                return r9;
            default:
                return new C2473Al(new C3537lj(1, (InterfaceC3858rh) this.f26755b.f28863v), (Executor) this.f26756c.d());
        }
    }
}
