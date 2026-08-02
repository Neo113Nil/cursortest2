package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.ads.cs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3073cs implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30382a;

    /* renamed from: b, reason: collision with root package name */
    public final C3383ig f30383b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f30384c;

    public /* synthetic */ C3073cs(Context context, C3383ig c3383ig, int i) {
        this.f30382a = i;
        this.f30384c = context;
        this.f30383b = c3383ig;
    }

    public Intent a() {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.tc)).booleanValue();
        Context context = this.f30384c;
        if (!booleanValue || Build.VERSION.SDK_INT < 33) {
            return context.registerReceiver(null, intentFilter);
        }
        registerReceiver = context.registerReceiver(null, intentFilter, 4);
        return registerReceiver;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        switch (this.f30382a) {
            case 0:
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.xe)).booleanValue()) {
                    return QC.c(new C3126ds(0, null, false));
                }
                ContentResolver contentResolver = this.f30384c.getContentResolver();
                if (contentResolver == null) {
                    return QC.c(new C3126ds(0, null, false));
                }
                return this.f30383b.b(new CallableC3572m7(10, contentResolver));
            case 1:
                return this.f30383b.b(new CallableC3572m7(13, this));
            case 2:
                return this.f30383b.b(new CallableC3572m7(14, this));
            case 3:
                return this.f30383b.b(new CallableC3572m7(16, this));
            case 4:
                return this.f30383b.b(new CallableC3572m7(17, this));
            case 5:
                return this.f30383b.b(new CallableC3572m7(27, this));
            case 6:
                if (!((Boolean) AbstractC2619Ia.f26265b.r()).booleanValue()) {
                    return QC.c(new Qs(-1, -1));
                }
                return this.f30383b.b(new CallableC3572m7(28, this));
            default:
                return this.f30383b.b(new Ts(0, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f30382a) {
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

    public /* synthetic */ C3073cs(C3383ig c3383ig, Context context, int i) {
        this.f30382a = i;
        this.f30383b = c3383ig;
        this.f30384c = context;
    }
}
