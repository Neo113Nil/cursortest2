package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0599ok extends AbstractC0297e7 {
    public final AbstractC0779ur d;

    public C0599ok(Context context, AbstractC0779ur abstractC0779ur, InterfaceC0269d7 interfaceC0269d7, ICrashTransformer iCrashTransformer) {
        this(abstractC0779ur, interfaceC0269d7, iCrashTransformer, new C0244cb(context));
    }

    public C0599ok(AbstractC0779ur abstractC0779ur, InterfaceC0269d7 interfaceC0269d7, ICrashTransformer iCrashTransformer, C0244cb c0244cb) {
        super(interfaceC0269d7, iCrashTransformer, c0244cb);
        this.d = abstractC0779ur;
    }
}
