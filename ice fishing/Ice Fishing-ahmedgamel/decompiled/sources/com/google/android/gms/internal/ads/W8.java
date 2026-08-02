package com.google.android.gms.internal.ads;

import R2.InterfaceC0376b;
import R2.InterfaceC0377c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import r2.AbstractC4897b;

/* loaded from: classes2.dex */
public final class W8 extends AbstractC4897b {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ int f29119W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W8(Context context, Looper looper, int i, InterfaceC0376b interfaceC0376b, InterfaceC0377c interfaceC0377c) {
        super(context, looper, i, interfaceC0376b, interfaceC0377c);
        this.f29119W = 1;
    }

    public boolean A() {
        O2.d[] j6 = j();
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue()) {
            O2.d dVar = m2.x.f39412c;
            int length = j6 != null ? j6.length : 0;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!R2.w.l(j6[i], dVar)) {
                    i++;
                } else if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // R2.AbstractC0380f, P2.c
    public int i() {
        switch (this.f29119W) {
            case 2:
                return 254730000;
            default:
                return super.i();
        }
    }

    @Override // R2.AbstractC0380f
    public final IInterface p(IBinder iBinder) {
        switch (this.f29119W) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return queryLocalInterface instanceof Y8 ? (Y8) queryLocalInterface : new Y8(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService", 1);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return queryLocalInterface2 instanceof C4079vc ? (C4079vc) queryLocalInterface2 : new C4079vc(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService", 1);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return queryLocalInterface3 instanceof InterfaceC2657Ke ? (InterfaceC2657Ke) queryLocalInterface3 : new C2640Je(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", 1);
        }
    }

    @Override // R2.AbstractC0380f
    public O2.d[] r() {
        switch (this.f29119W) {
            case 0:
                return m2.x.f39413d;
            default:
                return super.r();
        }
    }

    @Override // R2.AbstractC0380f
    public final String v() {
        switch (this.f29119W) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // R2.AbstractC0380f
    public final String w() {
        switch (this.f29119W) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public W8(Context context, Looper looper, InterfaceC0376b interfaceC0376b, InterfaceC0377c interfaceC0377c, int i) {
        super(r15 == null ? context : r15, looper, 123, interfaceC0376b, interfaceC0377c);
        this.f29119W = i;
        switch (i) {
            case 2:
                int i4 = AbstractC2860We.f29161a;
                Context applicationContext = context.getApplicationContext();
                super(applicationContext != null ? applicationContext : context, looper, 8, interfaceC0376b, interfaceC0377c);
                break;
            default:
                int i6 = AbstractC2860We.f29161a;
                Context applicationContext2 = context.getApplicationContext();
                break;
        }
    }
}
