package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.rA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3821rA extends BroadcastReceiver implements InterfaceC3552mA, Ay {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33532a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f33533b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33534c = true;

    public C3821rA(Context context, ExecutorService executorService) {
        this.f33532a = context;
        this.f33533b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final void a(HashMap hashMap) {
        boolean z3;
        synchronized (this) {
            z3 = this.f33534c;
        }
        hashMap.put("up", Boolean.valueOf(z3));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final void b(HashMap hashMap) {
        boolean z3;
        synchronized (this) {
            z3 = this.f33534c;
        }
        hashMap.put("up", Boolean.valueOf(z3));
    }

    @Override // com.google.android.gms.internal.ads.Ay
    public final N3.a c() {
        return QC.o(new Ts(11, this), this.f33533b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final void d(HashMap hashMap, Context context, View view) {
        boolean z3;
        synchronized (this) {
            z3 = this.f33534c;
        }
        hashMap.put("up", Boolean.valueOf(z3));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.f33534c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            synchronized (this) {
                this.f33534c = false;
            }
        }
    }
}
