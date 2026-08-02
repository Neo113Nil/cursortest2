package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class D implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f4384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f4385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f4386c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f4387d;

    public D(A a9, A a10, B b9, B b10) {
        this.f4384a = a9;
        this.f4385b = a10;
        this.f4386c = b9;
        this.f4387d = b10;
    }

    public final void onBackCancelled() {
        this.f4387d.invoke();
    }

    public final void onBackInvoked() {
        this.f4386c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        this.f4385b.invoke(new C0454b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        this.f4384a.invoke(new C0454b(backEvent));
    }
}
