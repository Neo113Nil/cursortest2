package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.vi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825vi extends C0571ln {

    /* renamed from: d, reason: collision with root package name */
    public final RunnableC0799ui f7070d;

    /* renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f7071e;

    public C0825vi(X4 x4, Kl kl, ICommonExecutor iCommonExecutor) {
        super(x4, kl);
        this.f7070d = new RunnableC0799ui(this);
        this.f7071e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C0571ln
    public final void a() {
        this.f7071e.remove(this.f7070d);
    }

    @Override // io.appmetrica.analytics.impl.C0571ln
    public final void f() {
        this.f6467b.a();
        C0539kh c0539kh = (C0539kh) ((X4) this.f6466a).f5356k.a();
        if (c0539kh.f6382k.a(c0539kh.f6381j)) {
            String str = c0539kh.f6384m;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(Vd.a((X4) this.f6466a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C0571ln
    public final void g() {
        this.f7071e.executeDelayed(this.f7070d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f6468c.get()) {
            return;
        }
        this.f7071e.remove(this.f7070d);
        if (((C0539kh) ((X4) this.f6466a).f5356k.a()).f6378g > 0) {
            this.f7071e.executeDelayed(this.f7070d, TimeUnit.SECONDS.toMillis(((C0539kh) ((X4) this.f6466a).f5356k.a()).f6378g));
        }
    }
}
