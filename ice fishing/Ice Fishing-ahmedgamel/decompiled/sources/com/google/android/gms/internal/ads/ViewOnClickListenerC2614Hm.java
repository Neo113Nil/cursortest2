package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Hm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2614Hm implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final C4036un f26107n;

    /* renamed from: u, reason: collision with root package name */
    public final V2.a f26108u;

    /* renamed from: v, reason: collision with root package name */
    public C2722Ob f26109v;

    /* renamed from: w, reason: collision with root package name */
    public C3111dc f26110w;

    /* renamed from: x, reason: collision with root package name */
    public String f26111x;

    /* renamed from: y, reason: collision with root package name */
    public Long f26112y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference f26113z;

    public ViewOnClickListenerC2614Hm(C4036un c4036un, V2.a aVar) {
        this.f26107n = c4036un;
        this.f26108u = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.f26113z;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f26111x != null && this.f26112y != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f26111x);
            this.f26108u.getClass();
            hashMap.put("time_interval", String.valueOf(System.currentTimeMillis() - this.f26112y.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.f26107n.d(hashMap);
        }
        this.f26111x = null;
        this.f26112y = null;
        WeakReference weakReference2 = this.f26113z;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.f26113z = null;
    }
}
