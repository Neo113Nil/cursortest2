package com.anythink.banner.b;

import android.text.TextUtils;
import com.anythink.banner.a.c;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bv;
import com.anythink.core.d.l;
import com.anythink.core.d.n;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    String f5835a;

    /* renamed from: b, reason: collision with root package name */
    WeakReference<c> f5836b;

    /* renamed from: c, reason: collision with root package name */
    com.anythink.core.common.t.c f5837c;

    /* renamed from: d, reason: collision with root package name */
    CustomBannerAdapter f5838d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5840f = false;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f5839e = new Runnable() { // from class: com.anythink.banner.b.a.1
        @Override // java.lang.Runnable
        public final void run() {
            a.a(a.this);
            a.b(a.this);
        }
    };

    public a(c cVar) {
        this.f5836b = new WeakReference<>(cVar);
    }

    public static /* synthetic */ boolean a(a aVar) {
        aVar.f5840f = false;
        return false;
    }

    private void d() {
        WeakReference<c> weakReference = this.f5836b;
        c cVar = weakReference != null ? weakReference.get() : null;
        if (cVar != null) {
            cVar.timeUpRefreshView();
        } else {
            c();
        }
    }

    public final synchronized void b() {
        CustomBannerAdapter customBannerAdapter;
        bv unitGroupInfo;
        try {
            if (TextUtils.isEmpty(this.f5835a)) {
                return;
            }
            l a9 = n.a(t.b().g()).a(this.f5835a);
            if (this.f5837c != null) {
                c();
            }
            if (a9 != null && a9.ao() == 1) {
                this.f5840f = true;
                long aE = (a9.k() != 2 || (customBannerAdapter = this.f5838d) == null || (unitGroupInfo = customBannerAdapter.getUnitGroupInfo()) == null) ? 0L : unitGroupInfo.aE();
                if (aE <= 0) {
                    aE = a9.ap();
                }
                if (aE <= com.anythink.basead.exoplayer.i.a.f8040f) {
                    aE = 2000;
                }
                com.anythink.core.common.t.c cVar = new com.anythink.core.common.t.c(aE, this.f5839e, false);
                this.f5837c = cVar;
                cVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            com.anythink.core.common.t.c cVar = this.f5837c;
            if (cVar != null) {
                cVar.c();
            }
            this.f5837c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(String str) {
        this.f5835a = str;
    }

    public final boolean a() {
        return this.f5840f;
    }

    public final void a(CustomBannerAdapter customBannerAdapter) {
        this.f5838d = customBannerAdapter;
    }

    public static /* synthetic */ void b(a aVar) {
        WeakReference<c> weakReference = aVar.f5836b;
        c cVar = weakReference != null ? weakReference.get() : null;
        if (cVar != null) {
            cVar.timeUpRefreshView();
        } else {
            aVar.c();
        }
    }
}
