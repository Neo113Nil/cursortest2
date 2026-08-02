package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.nA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3629nA implements InterfaceC3575mA, Ay {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33477a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f33478b;

    /* renamed from: c, reason: collision with root package name */
    public final C4006uA f33479c;

    /* renamed from: d, reason: collision with root package name */
    public final RD f33480d;

    /* renamed from: e, reason: collision with root package name */
    public final C2972ay f33481e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f33482f;

    /* renamed from: g, reason: collision with root package name */
    public P3.a f33483g;

    public C3629nA(Context context, C4006uA c4006uA, C2972ay c2972ay, RD rd) {
        this.f33477a = 0;
        this.f33482f = new AtomicBoolean(false);
        this.f33483g = QC.c("E");
        this.f33478b = context;
        this.f33479c = c4006uA;
        this.f33481e = c2972ay;
        this.f33480d = rd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void a(HashMap hashMap) {
        switch (this.f33477a) {
            case 0:
                e(hashMap);
                break;
            default:
                hashMap.put("gs", this.f33483g);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void b(HashMap hashMap) {
        switch (this.f33477a) {
            case 0:
                e(hashMap);
                break;
            default:
                hashMap.put("gs", this.f33483g);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ay
    public final P3.a c() {
        switch (this.f33477a) {
            case 0:
                if (this.f33482f.getAndSet(true)) {
                    return ND.f27257u;
                }
                return ((C3383ig) this.f33480d).b(new Ts(9, this));
            default:
                if (this.f33482f.getAndSet(true) || !this.f33481e.S()) {
                    return ND.f27257u;
                }
                return ((C3383ig) this.f33480d).a(new RunnableC3830qw(6, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void d(HashMap hashMap, Context context, View view) {
        switch (this.f33477a) {
            case 0:
                e(hashMap);
                break;
            default:
                hashMap.put("gs", this.f33483g);
                break;
        }
    }

    public void e(HashMap hashMap) {
        synchronized (this) {
            hashMap.put(com.anythink.expressad.f.a.b.da, this.f33483g);
        }
    }

    public C3629nA(Context context, C4006uA c4006uA, RD rd, C2972ay c2972ay) {
        this.f33477a = 1;
        this.f33482f = new AtomicBoolean(false);
        this.f33483g = ND.f27257u;
        this.f33478b = context;
        this.f33479c = c4006uA;
        this.f33480d = rd;
        this.f33481e = c2972ay;
    }
}
