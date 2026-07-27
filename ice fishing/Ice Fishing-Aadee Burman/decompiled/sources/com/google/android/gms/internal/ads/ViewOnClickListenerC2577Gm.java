package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Gm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2577Gm implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final C3959tn f25106n;

    /* renamed from: u, reason: collision with root package name */
    public final T2.a f25107u;

    /* renamed from: v, reason: collision with root package name */
    public C2702Ob f25108v;

    /* renamed from: w, reason: collision with root package name */
    public C3088dc f25109w;

    /* renamed from: x, reason: collision with root package name */
    public String f25110x;

    /* renamed from: y, reason: collision with root package name */
    public Long f25111y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference f25112z;

    public ViewOnClickListenerC2577Gm(C3959tn c3959tn, T2.a aVar) {
        this.f25106n = c3959tn;
        this.f25107u = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.f25112z;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f25110x != null && this.f25111y != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f25110x);
            this.f25107u.getClass();
            hashMap.put("time_interval", String.valueOf(System.currentTimeMillis() - this.f25111y.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.f25106n.d(hashMap);
        }
        this.f25110x = null;
        this.f25111y = null;
        WeakReference weakReference2 = this.f25112z;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.f25112z = null;
    }
}
