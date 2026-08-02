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
    String f6464a;

    /* renamed from: b, reason: collision with root package name */
    WeakReference<c> f6465b;

    /* renamed from: c, reason: collision with root package name */
    com.anythink.core.common.t.c f6466c;

    /* renamed from: d, reason: collision with root package name */
    CustomBannerAdapter f6467d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6469f = false;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f6468e = new Runnable() { // from class: com.anythink.banner.b.a.1
        @Override // java.lang.Runnable
        public final void run() {
            a.a(a.this);
            a.b(a.this);
        }
    };

    public a(c cVar) {
        this.f6465b = new WeakReference<>(cVar);
    }

    public static /* synthetic */ boolean a(a aVar) {
        aVar.f6469f = false;
        return false;
    }

    private void d() {
        WeakReference<c> weakReference = this.f6465b;
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
            if (TextUtils.isEmpty(this.f6464a)) {
                return;
            }
            l a9 = n.a(t.b().g()).a(this.f6464a);
            if (this.f6466c != null) {
                c();
            }
            if (a9 != null && a9.ao() == 1) {
                this.f6469f = true;
                long aE = (a9.k() != 2 || (customBannerAdapter = this.f6467d) == null || (unitGroupInfo = customBannerAdapter.getUnitGroupInfo()) == null) ? 0L : unitGroupInfo.aE();
                if (aE <= 0) {
                    aE = a9.ap();
                }
                if (aE <= com.anythink.basead.exoplayer.i.a.f8669f) {
                    aE = 2000;
                }
                com.anythink.core.common.t.c cVar = new com.anythink.core.common.t.c(aE, this.f6468e, false);
                this.f6466c = cVar;
                cVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            com.anythink.core.common.t.c cVar = this.f6466c;
            if (cVar != null) {
                cVar.c();
            }
            this.f6466c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(String str) {
        this.f6464a = str;
    }

    public final boolean a() {
        return this.f6469f;
    }

    public final void a(CustomBannerAdapter customBannerAdapter) {
        this.f6467d = customBannerAdapter;
    }

    public static /* synthetic */ void b(a aVar) {
        WeakReference<c> weakReference = aVar.f6465b;
        c cVar = weakReference != null ? weakReference.get() : null;
        if (cVar != null) {
            cVar.timeUpRefreshView();
        } else {
            aVar.c();
        }
    }
}
