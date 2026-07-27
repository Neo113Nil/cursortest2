package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3540lz implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31869a;

    /* renamed from: b, reason: collision with root package name */
    public final C3351iN f31870b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f31871c;

    /* renamed from: d, reason: collision with root package name */
    public final C3351iN f31872d;

    /* renamed from: e, reason: collision with root package name */
    public final C3243gN f31873e;

    public /* synthetic */ C3540lz(C3351iN c3351iN, C3243gN c3243gN, C3243gN c3243gN2, C3351iN c3351iN2, int i) {
        this.f31869a = i;
        this.f31870b = c3351iN;
        this.f31871c = c3243gN;
        this.f31873e = c3243gN2;
        this.f31872d = c3351iN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f31869a) {
            case 0:
                return new C3486kz((C3979u6) this.f31870b.f31039a, (C3218fz) this.f31871c.f(), (Context) this.f31872d.f31039a, (C3983uA) this.f31873e.f(), 0);
            case 1:
                return new C3594mz((C3979u6) this.f31870b.f31039a, (C3218fz) this.f31871c.f(), (C2949ay) this.f31872d.f31039a, (C3983uA) this.f31873e.f());
            case 2:
                return new C3594mz((C3979u6) this.f31870b.f31039a, (C3218fz) this.f31871c.f(), (Map) this.f31872d.f31039a, (C3983uA) this.f31873e.f());
            case 3:
                return new C3486kz((C3979u6) this.f31870b.f31039a, (C3218fz) this.f31871c.f(), (Context) this.f31872d.f31039a, (C3983uA) this.f31873e.f(), 1);
            case 4:
                return new C3863rz((Context) this.f31870b.f31039a, (C3983uA) this.f31871c.f(), (Xy) this.f31873e.f(), (C2949ay) this.f31872d.f31039a);
            case 5:
                return new C3606nA((Context) this.f31870b.f31039a, (C3983uA) this.f31871c.f(), (C2949ay) this.f31872d.f31039a, (RD) this.f31873e.f());
            default:
                return new C3606nA((Context) this.f31870b.f31039a, (C3983uA) this.f31871c.f(), (RD) this.f31873e.f(), (C2949ay) this.f31872d.f31039a);
        }
    }

    public /* synthetic */ C3540lz(C3351iN c3351iN, C3243gN c3243gN, C3351iN c3351iN2, C3243gN c3243gN2, int i) {
        this.f31869a = i;
        this.f31870b = c3351iN;
        this.f31871c = c3243gN;
        this.f31872d = c3351iN2;
        this.f31873e = c3243gN2;
    }
}
