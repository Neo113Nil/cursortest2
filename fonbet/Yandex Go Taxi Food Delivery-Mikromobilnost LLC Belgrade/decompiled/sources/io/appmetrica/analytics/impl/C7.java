package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* loaded from: classes9.dex */
public final class C7 implements DataSendingRestrictionController {
    public final A7 a;
    public Boolean b;
    public final HashSet c = new HashSet();
    public final HashSet d = new HashSet();

    public C7(A7 a7) {
        this.a = a7;
        this.b = ((B7) a7).a();
    }

    public final synchronized void a(String str, Boolean bool) {
        try {
            if (!Or.a(bool)) {
                if (!this.d.contains(str) && !this.c.contains(str)) {
                }
            }
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.d.add(str);
                this.c.remove(str);
            } else {
                this.c.add(str);
                this.d.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Boolean bool) {
        if (this.b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter(String str) {
        boolean z;
        if (!this.c.contains(str)) {
            z = Boolean.TRUE.equals(this.b);
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(Boolean bool) {
        try {
            if (!Or.a(bool)) {
                if (this.b == null) {
                }
            }
            boolean equals = Boolean.FALSE.equals(bool);
            this.b = Boolean.valueOf(equals);
            ((B7) this.a).a.c(equals);
        } catch (Throwable th) {
            throw th;
        }
    }
}
