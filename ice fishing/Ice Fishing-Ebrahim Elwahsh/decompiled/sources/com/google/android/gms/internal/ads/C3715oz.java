package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.oz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3715oz implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33242a;

    /* renamed from: b, reason: collision with root package name */
    public final C4117wN f33243b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f33244c;

    /* renamed from: d, reason: collision with root package name */
    public final C4117wN f33245d;

    /* renamed from: e, reason: collision with root package name */
    public final C4009uN f33246e;

    public /* synthetic */ C3715oz(C4117wN c4117wN, C4009uN c4009uN, C4009uN c4009uN2, C4117wN c4117wN2, int i) {
        this.f33242a = i;
        this.f33243b = c4117wN;
        this.f33244c = c4009uN;
        this.f33246e = c4009uN2;
        this.f33245d = c4117wN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f33242a) {
            case 0:
                return new C3661nz((C3830r6) this.f33243b.f34977a, (C3391iz) this.f33244c.d(), (Context) this.f33245d.f34977a, (C4158xA) this.f33246e.d(), 0);
            case 1:
                return new C3769pz((C3830r6) this.f33243b.f34977a, (C3391iz) this.f33244c.d(), (C3066cy) this.f33245d.f34977a, (C4158xA) this.f33246e.d());
            case 2:
                return new C3769pz((C3830r6) this.f33243b.f34977a, (C3391iz) this.f33244c.d(), (Map) this.f33245d.f34977a, (C4158xA) this.f33246e.d());
            case 3:
                return new C3661nz((C3830r6) this.f33243b.f34977a, (C3391iz) this.f33244c.d(), (Context) this.f33245d.f34977a, (C4158xA) this.f33246e.d(), 1);
            case 4:
                return new C4038uz((Context) this.f33243b.f34977a, (C4158xA) this.f33244c.d(), (Zy) this.f33246e.d(), (C3066cy) this.f33245d.f34977a);
            case 5:
                return new C3727pA((Context) this.f33243b.f34977a, (C4158xA) this.f33244c.d(), (C3066cy) this.f33245d.f34977a, (SD) this.f33246e.d());
            default:
                return new C3727pA((Context) this.f33243b.f34977a, (C4158xA) this.f33244c.d(), (SD) this.f33246e.d(), (C3066cy) this.f33245d.f34977a);
        }
    }

    public /* synthetic */ C3715oz(C4117wN c4117wN, C4009uN c4009uN, C4117wN c4117wN2, C4009uN c4009uN2, int i) {
        this.f33242a = i;
        this.f33243b = c4117wN;
        this.f33244c = c4009uN;
        this.f33245d = c4117wN2;
        this.f33246e = c4009uN2;
    }
}
