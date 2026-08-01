package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class D implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f4416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f4417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f4418c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f4419d;

    public D(A a9, A a10, B b9, B b10) {
        this.f4416a = a9;
        this.f4417b = a10;
        this.f4418c = b9;
        this.f4419d = b10;
    }

    public final void onBackCancelled() {
        this.f4419d.invoke();
    }

    public final void onBackInvoked() {
        this.f4418c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        this.f4417b.invoke(new C0450b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        this.f4416a.invoke(new C0450b(backEvent));
    }
}
