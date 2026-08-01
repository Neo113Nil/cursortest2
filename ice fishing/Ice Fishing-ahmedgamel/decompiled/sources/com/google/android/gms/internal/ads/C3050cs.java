package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.ads.cs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3050cs implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29612a;

    /* renamed from: b, reason: collision with root package name */
    public final C3360ig f29613b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f29614c;

    public /* synthetic */ C3050cs(Context context, C3360ig c3360ig, int i) {
        this.f29612a = i;
        this.f29614c = context;
        this.f29613b = c3360ig;
    }

    public Intent a() {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.tc)).booleanValue();
        Context context = this.f29614c;
        if (!booleanValue || Build.VERSION.SDK_INT < 33) {
            return context.registerReceiver(null, intentFilter);
        }
        registerReceiver = context.registerReceiver(null, intentFilter, 4);
        return registerReceiver;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        switch (this.f29612a) {
            case 0:
                if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.xe)).booleanValue()) {
                    return QC.c(new C3103ds(0, null, false));
                }
                ContentResolver contentResolver = this.f29614c.getContentResolver();
                if (contentResolver == null) {
                    return QC.c(new C3103ds(0, null, false));
                }
                return this.f29613b.b(new CallableC3549m7(10, contentResolver));
            case 1:
                return this.f29613b.b(new CallableC3549m7(13, this));
            case 2:
                return this.f29613b.b(new CallableC3549m7(14, this));
            case 3:
                return this.f29613b.b(new CallableC3549m7(16, this));
            case 4:
                return this.f29613b.b(new CallableC3549m7(17, this));
            case 5:
                return this.f29613b.b(new CallableC3549m7(27, this));
            case 6:
                if (!((Boolean) AbstractC2599Ia.f25516b.r()).booleanValue()) {
                    return QC.c(new Qs(-1, -1));
                }
                return this.f29613b.b(new CallableC3549m7(28, this));
            default:
                return this.f29613b.b(new Ts(0, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f29612a) {
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

    public /* synthetic */ C3050cs(C3360ig c3360ig, Context context, int i) {
        this.f29612a = i;
        this.f29613b = c3360ig;
        this.f29614c = context;
    }
}
