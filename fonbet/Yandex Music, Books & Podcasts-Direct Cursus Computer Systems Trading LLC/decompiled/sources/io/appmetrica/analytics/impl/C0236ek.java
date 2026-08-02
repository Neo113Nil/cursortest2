package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.ek, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0236ek extends AbstractC0137b7 {
    public final AbstractC0157br d;

    public C0236ek(@NonNull Context context, @NonNull AbstractC0157br abstractC0157br, @NonNull InterfaceC0108a7 interfaceC0108a7, ICrashTransformer iCrashTransformer) {
        this(abstractC0157br, interfaceC0108a7, iCrashTransformer, new Ua(context));
    }

    public C0236ek(AbstractC0157br abstractC0157br, InterfaceC0108a7 interfaceC0108a7, ICrashTransformer iCrashTransformer, Ua ua) {
        super(interfaceC0108a7, iCrashTransformer, ua);
        this.d = abstractC0157br;
    }
}
