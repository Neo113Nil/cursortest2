package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes9.dex */
public final class j implements b {
    public final f a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j() {
        this(new f(r1, i.a, "huawei"));
        Intent intent;
        intent = k.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [io.appmetrica.analytics.identifiers.impl.f] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // io.appmetrica.analytics.identifiers.impl.b
    public final c a(Context context) {
        c cVar;
        try {
            try {
                try {
                    try {
                        m mVar = (m) ((o) this.a.a(context));
                        cVar = new c(IdentifierStatus.OK, new a("huawei", mVar.a(), Boolean.valueOf(mVar.b())), null, 4);
                        this = this.a;
                    } catch (g e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "unknown exception during binding huawei services";
                        }
                        cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message);
                        this = this.a;
                    }
                } finally {
                    this.b(context);
                }
                this.b(context);
            } catch (Throwable th) {
                try {
                    this.a.b(context);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        return cVar;
    }

    public j(f fVar) {
        this.a = fVar;
    }
}
