package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.nA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3606nA implements InterfaceC3552mA, Ay {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32699a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f32700b;

    /* renamed from: c, reason: collision with root package name */
    public final C3983uA f32701c;

    /* renamed from: d, reason: collision with root package name */
    public final RD f32702d;

    /* renamed from: e, reason: collision with root package name */
    public final C2949ay f32703e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f32704f;

    /* renamed from: g, reason: collision with root package name */
    public N3.a f32705g;

    public C3606nA(Context context, C3983uA c3983uA, C2949ay c2949ay, RD rd) {
        this.f32699a = 0;
        this.f32704f = new AtomicBoolean(false);
        this.f32705g = QC.c("E");
        this.f32700b = context;
        this.f32701c = c3983uA;
        this.f32703e = c2949ay;
        this.f32702d = rd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final void a(HashMap hashMap) {
        switch (this.f32699a) {
            case 0:
                e(hashMap);
                break;
            default:
                hashMap.put("gs", this.f32705g);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final void b(HashMap hashMap) {
        switch (this.f32699a) {
            case 0:
                e(hashMap);
                break;
            default:
                hashMap.put("gs", this.f32705g);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ay
    public final N3.a c() {
        switch (this.f32699a) {
            case 0:
                if (this.f32704f.getAndSet(true)) {
                    return ND.f26473u;
                }
                return ((C3360ig) this.f32702d).b(new Ts(9, this));
            default:
                if (this.f32704f.getAndSet(true) || !this.f32703e.S()) {
                    return ND.f26473u;
                }
                return ((C3360ig) this.f32702d).a(new RunnableC3807qw(6, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final void d(HashMap hashMap, Context context, View view) {
        switch (this.f32699a) {
            case 0:
                e(hashMap);
                break;
            default:
                hashMap.put("gs", this.f32705g);
                break;
        }
    }

    public void e(HashMap hashMap) {
        synchronized (this) {
            hashMap.put(com.anythink.expressad.f.a.b.da, this.f32705g);
        }
    }

    public C3606nA(Context context, C3983uA c3983uA, RD rd, C2949ay c2949ay) {
        this.f32699a = 1;
        this.f32704f = new AtomicBoolean(false);
        this.f32705g = ND.f26473u;
        this.f32700b = context;
        this.f32701c = c3983uA;
        this.f32702d = rd;
        this.f32703e = c2949ay;
    }
}
