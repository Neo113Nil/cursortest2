package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785u4 implements InterfaceC0397f4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6966a;

    /* renamed from: b, reason: collision with root package name */
    public final C0863x4 f6967b;

    /* renamed from: c, reason: collision with root package name */
    public final ResultReceiver f6968c;

    public C0785u4(Context context, C0863x4 c0863x4, C0656p4 c0656p4) {
        this.f6966a = context;
        this.f6967b = c0863x4;
        this.f6968c = c0656p4.f6722c;
        c0863x4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0397f4
    public final void a(P5 p5, C0656p4 c0656p4) {
        this.f6967b.a(c0656p4.f6721b);
        this.f6967b.a(p5, this);
    }

    public final C0863x4 b() {
        return this.f6967b;
    }

    public final Context c() {
        return this.f6966a;
    }

    public final ResultReceiver d() {
        return this.f6968c;
    }

    public final void a(S3 s3) {
        B6.a(this.f6968c, s3);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0397f4
    public final void a() {
        this.f6967b.b(this);
    }
}
