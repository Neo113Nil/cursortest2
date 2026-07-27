package com.google.android.gms.internal.ads;

import P2.InterfaceC0372b;
import P2.InterfaceC0373c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p2.AbstractC4827b;

/* loaded from: classes2.dex */
public final class W8 extends AbstractC4827b {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ int f28321W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W8(Context context, Looper looper, int i, InterfaceC0372b interfaceC0372b, InterfaceC0373c interfaceC0373c) {
        super(context, looper, i, interfaceC0372b, interfaceC0373c);
        this.f28321W = 1;
    }

    public boolean A() {
        M2.d[] k9 = k();
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32409x2)).booleanValue()) {
            M2.d dVar = k2.x.f38623c;
            int length = k9 != null ? k9.length : 0;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!P2.w.l(k9[i], dVar)) {
                    i++;
                } else if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // P2.AbstractC0376f, N2.c
    public int j() {
        switch (this.f28321W) {
            case 2:
                return 254730000;
            default:
                return super.j();
        }
    }

    @Override // P2.AbstractC0376f
    public final IInterface p(IBinder iBinder) {
        switch (this.f28321W) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return queryLocalInterface instanceof Y8 ? (Y8) queryLocalInterface : new Y8(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService", 2);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return queryLocalInterface2 instanceof C4056vc ? (C4056vc) queryLocalInterface2 : new C4056vc(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService", 2);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return queryLocalInterface3 instanceof InterfaceC2637Ke ? (InterfaceC2637Ke) queryLocalInterface3 : new C2620Je(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", 2);
        }
    }

    @Override // P2.AbstractC0376f
    public M2.d[] r() {
        switch (this.f28321W) {
            case 0:
                return k2.x.f38624d;
            default:
                return super.r();
        }
    }

    @Override // P2.AbstractC0376f
    public final String v() {
        switch (this.f28321W) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // P2.AbstractC0376f
    public final String w() {
        switch (this.f28321W) {
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
    public W8(Context context, Looper looper, InterfaceC0372b interfaceC0372b, InterfaceC0373c interfaceC0373c, int i) {
        super(r15 == null ? context : r15, looper, 123, interfaceC0372b, interfaceC0373c);
        this.f28321W = i;
        switch (i) {
            case 2:
                int i6 = AbstractC2837We.f28362a;
                Context applicationContext = context.getApplicationContext();
                super(applicationContext != null ? applicationContext : context, looper, 8, interfaceC0372b, interfaceC0373c);
                break;
            default:
                int i9 = AbstractC2837We.f28362a;
                Context applicationContext2 = context.getApplicationContext();
                break;
        }
    }
}
