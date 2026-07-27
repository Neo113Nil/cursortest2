package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Em, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2542Em implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final C4026un f24813n;

    /* renamed from: u, reason: collision with root package name */
    public final S2.a f24814u;

    /* renamed from: v, reason: collision with root package name */
    public C2633Kb f24815v;

    /* renamed from: w, reason: collision with root package name */
    public C2871Yb f24816w;

    /* renamed from: x, reason: collision with root package name */
    public String f24817x;

    /* renamed from: y, reason: collision with root package name */
    public Long f24818y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference f24819z;

    public ViewOnClickListenerC2542Em(C4026un c4026un, S2.a aVar) {
        this.f24813n = c4026un;
        this.f24814u = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.f24819z;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f24817x != null && this.f24818y != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f24817x);
            this.f24814u.getClass();
            hashMap.put("time_interval", String.valueOf(System.currentTimeMillis() - this.f24818y.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.f24813n.d(hashMap);
        }
        this.f24817x = null;
        this.f24818y = null;
        WeakReference weakReference2 = this.f24819z;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.f24819z = null;
    }
}
