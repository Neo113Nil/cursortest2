package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class E6 implements DataSendingRestrictionController {

    /* renamed from: a, reason: collision with root package name */
    public final C6 f4344a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f4345b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f4346c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f4347d = new HashSet();

    public E6(C6 c6) {
        this.f4344a = c6;
        this.f4345b = ((D6) c6).a();
    }

    public final synchronized void a(Boolean bool) {
        try {
            if (!AbstractC0572lo.a(bool)) {
                if (this.f4345b == null) {
                }
            }
            boolean equals = Boolean.FALSE.equals(bool);
            this.f4345b = Boolean.valueOf(equals);
            ((D6) this.f4344a).f4280a.c(equals).b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Boolean bool) {
        if (this.f4345b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.f4345b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter(String str) {
        boolean z2;
        if (!this.f4346c.contains(str)) {
            z2 = Boolean.TRUE.equals(this.f4345b);
        }
        return z2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f4345b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.f4347d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(String str, Boolean bool) {
        try {
            if (!AbstractC0572lo.a(bool)) {
                if (!this.f4347d.contains(str) && !this.f4346c.contains(str)) {
                }
            }
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.f4347d.add(str);
                this.f4346c.remove(str);
            } else {
                this.f4346c.add(str);
                this.f4347d.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
