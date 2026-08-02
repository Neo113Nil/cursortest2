package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.rA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3844rA extends BroadcastReceiver implements InterfaceC3575mA, Ay {

    /* renamed from: a, reason: collision with root package name */
    public final Context f34300a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f34301b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34302c = true;

    public C3844rA(Context context, ExecutorService executorService) {
        this.f34300a = context;
        this.f34301b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void a(HashMap hashMap) {
        boolean z6;
        synchronized (this) {
            z6 = this.f34302c;
        }
        hashMap.put("up", Boolean.valueOf(z6));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void b(HashMap hashMap) {
        boolean z6;
        synchronized (this) {
            z6 = this.f34302c;
        }
        hashMap.put("up", Boolean.valueOf(z6));
    }

    @Override // com.google.android.gms.internal.ads.Ay
    public final P3.a c() {
        return QC.o(new Ts(11, this), this.f34301b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void d(HashMap hashMap, Context context, View view) {
        boolean z6;
        synchronized (this) {
            z6 = this.f34302c;
        }
        hashMap.put("up", Boolean.valueOf(z6));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.f34302c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            synchronized (this) {
                this.f34302c = false;
            }
        }
    }
}
