package com.anythink.core.common.h;

import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public ATBaseAdAdapter f14035a;

    /* renamed from: b, reason: collision with root package name */
    private Throwable f14036b;

    public p(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f14035a = aTBaseAdAdapter;
    }

    public final String a(String str) {
        Throwable th = this.f14036b;
        if (th != null && !(th instanceof ClassNotFoundException)) {
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message)) {
                return message;
            }
            String message2 = this.f14036b.getCause() != null ? this.f14036b.getCause().getMessage() : "";
            if (!TextUtils.isEmpty(message2)) {
                return message2;
            }
        }
        return str;
    }

    public p(Throwable th) {
        this.f14036b = th;
    }
}
