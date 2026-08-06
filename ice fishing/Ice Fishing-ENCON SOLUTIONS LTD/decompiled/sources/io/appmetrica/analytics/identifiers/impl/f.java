package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f3959a;

    /* renamed from: b, reason: collision with root package name */
    public final t1.l f3960b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3961c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f3962d;

    public f(e eVar, t1.l lVar, String str, SafePackageManager safePackageManager) {
        this.f3959a = eVar;
        this.f3960b = lVar;
        this.f3961c = str;
        this.f3962d = safePackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context) {
        IBinder iBinder;
        e eVar;
        if (this.f3962d.resolveService(context, this.f3959a.f3956a, 0) == null) {
            throw new l(C1.a.k(new StringBuilder("could not resolve "), this.f3961c, " services"));
        }
        try {
            eVar = this.f3959a;
        } catch (Throwable unused) {
        }
        if (context.bindService(eVar.f3956a, eVar, 1)) {
            e eVar2 = this.f3959a;
            if (eVar2.f3957b == null) {
                synchronized (eVar2.f3958c) {
                    if (eVar2.f3957b == null) {
                        try {
                            eVar2.f3958c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.f3957b;
            if (iBinder == null) {
                return this.f3960b.invoke(iBinder);
            }
            throw new g(C1.a.k(new StringBuilder("could not bind to "), this.f3961c, " services"));
        }
        iBinder = null;
        if (iBinder == null) {
        }
    }

    public final void b(Context context) {
        try {
            this.f3959a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, t1.l lVar, String str) {
        this(new e(intent, str), lVar, str, new SafePackageManager());
    }
}
