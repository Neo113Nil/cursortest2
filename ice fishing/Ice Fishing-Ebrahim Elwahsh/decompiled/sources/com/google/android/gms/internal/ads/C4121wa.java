package com.google.android.gms.internal.ads;

import B2.C0268b;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.wa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4121wa implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34998a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f34999b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f35000c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f35001d;

    /* renamed from: e, reason: collision with root package name */
    public final C4009uN f35002e;

    public /* synthetic */ C4121wa(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, int i) {
        this.f34998a = i;
        this.f34999b = c4009uN;
        this.f35000c = c4009uN2;
        this.f35001d = c4009uN3;
        this.f35002e = c4009uN4;
    }

    public C4067va a() {
        return new C4067va((ScheduledExecutorService) this.f34999b.d(), (B2.E) this.f35000c.d(), (C0268b) this.f35001d.d(), (C3381io) this.f35002e.d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.f34998a) {
            case 0:
                return a();
            default:
                C3617n8 c3617n8 = (C3617n8) this.f34999b.d();
                Executor executor = (Executor) this.f35000c.d();
                Context context = (Context) this.f35001d.d();
                return new C2997bj(executor, new C2844Wi(context, c3617n8), (S2.a) this.f35002e.d());
        }
    }
}
