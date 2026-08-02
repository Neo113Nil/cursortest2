package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0423l5 implements V4 {
    public final Context a;
    public final C0510o5 b;
    public final ResultReceiver c;

    public C0423l5(@NonNull Context context, @NonNull C0510o5 c0510o5, @NonNull C0279g5 c0279g5) {
        this.a = context;
        this.b = c0510o5;
        this.c = c0279g5.c;
        c0510o5.a(this);
    }

    @Override // io.appmetrica.analytics.impl.V4
    public final void a(@NonNull H6 h6, @NonNull C0279g5 c0279g5) {
        this.b.a(c0279g5.b);
        this.b.a(h6, this);
    }

    @NonNull
    public final C0510o5 b() {
        return this.b;
    }

    @NonNull
    public final Context c() {
        return this.a;
    }

    @NonNull
    public final ResultReceiver d() {
        return this.c;
    }

    public final void a(@NonNull I4 i4) {
        ResultReceiverC0685u7.a(this.c, i4);
    }

    @Override // io.appmetrica.analytics.impl.V4
    public final void a() {
        this.b.b(this);
    }
}
