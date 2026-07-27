package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.uA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3996uA extends BroadcastReceiver implements InterfaceC3673oA, By {

    /* renamed from: a, reason: collision with root package name */
    public final Context f34547a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f34548b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34549c = true;

    public C3996uA(Context context, ExecutorService executorService) {
        this.f34547a = context;
        this.f34548b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.By
    public final J3.a a() {
        return C3686oN.p(new Vs(11, this), this.f34548b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void b(HashMap hashMap) {
        boolean z8;
        synchronized (this) {
            z8 = this.f34549c;
        }
        hashMap.put("up", Boolean.valueOf(z8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void c(HashMap hashMap) {
        boolean z8;
        synchronized (this) {
            z8 = this.f34549c;
        }
        hashMap.put("up", Boolean.valueOf(z8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void d(HashMap hashMap, Context context, View view) {
        boolean z8;
        synchronized (this) {
            z8 = this.f34549c;
        }
        hashMap.put("up", Boolean.valueOf(z8));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.f34549c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            synchronized (this) {
                this.f34549c = false;
            }
        }
    }
}
