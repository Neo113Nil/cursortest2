package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ICrashTransformer;

/* loaded from: classes.dex */
public final class Bh extends AbstractC0502j6 {

    /* renamed from: d, reason: collision with root package name */
    public final Wn f4221d;

    public Bh(Context context, Wn wn, InterfaceC0477i6 interfaceC0477i6, ICrashTransformer iCrashTransformer) {
        this(wn, interfaceC0477i6, iCrashTransformer, new M9(context));
    }

    public Bh(Wn wn, InterfaceC0477i6 interfaceC0477i6, ICrashTransformer iCrashTransformer, M9 m9) {
        super(interfaceC0477i6, iCrashTransformer, m9);
        this.f4221d = wn;
    }
}
