package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.ads.es, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3169es implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30522a;

    /* renamed from: b, reason: collision with root package name */
    public final C3157eg f30523b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f30524c;

    public /* synthetic */ C3169es(Context context, C3157eg c3157eg, int i) {
        this.f30522a = i;
        this.f30524c = context;
        this.f30523b = c3157eg;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        switch (this.f30522a) {
            case 0:
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.re)).booleanValue()) {
                    return C3686oN.c(new C3224fs(0, null, false));
                }
                ContentResolver contentResolver = this.f30524c.getContentResolver();
                if (contentResolver == null) {
                    return C3686oN.c(new C3224fs(0, null, false));
                }
                return this.f30523b.b(new CallableC3454k7(10, contentResolver));
            case 1:
                return this.f30523b.b(new CallableC3454k7(13, this));
            case 2:
                return this.f30523b.b(new CallableC3454k7(14, this));
            case 3:
                return this.f30523b.b(new CallableC3454k7(16, this));
            case 4:
                return this.f30523b.b(new CallableC3454k7(17, this));
            case 5:
                return this.f30523b.b(new CallableC3454k7(27, this));
            case 6:
                if (!((Boolean) AbstractC2530Ea.f24768b.r()).booleanValue()) {
                    return C3686oN.c(new Ss(-1, -1));
                }
                return this.f30523b.b(new CallableC3454k7(28, this));
            default:
                return this.f30523b.b(new Vs(0, this));
        }
    }

    public Intent b() {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.tc)).booleanValue();
        Context context = this.f30524c;
        if (!booleanValue || Build.VERSION.SDK_INT < 33) {
            return context.registerReceiver(null, intentFilter);
        }
        registerReceiver = context.registerReceiver(null, intentFilter, 4);
        return registerReceiver;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        switch (this.f30522a) {
            case 0:
                return 61;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 18;
            case 4:
                return 57;
            case 5:
                return 37;
            case 6:
                return 59;
            default:
                return 39;
        }
    }

    public /* synthetic */ C3169es(C3157eg c3157eg, Context context, int i) {
        this.f30522a = i;
        this.f30523b = c3157eg;
        this.f30524c = context;
    }
}
