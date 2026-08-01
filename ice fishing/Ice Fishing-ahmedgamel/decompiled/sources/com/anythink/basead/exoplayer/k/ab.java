package com.anythink.basead.exoplayer.k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class ab implements k {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f8335a;

    public ab(Handler handler) {
        this.f8335a = handler;
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Looper a() {
        return this.f8335a.getLooper();
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final boolean b(int i) {
        return this.f8335a.sendEmptyMessage(i);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Message a(int i) {
        return this.f8335a.obtainMessage(i);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final void b() {
        this.f8335a.removeMessages(2);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Message a(int i, Object obj) {
        return this.f8335a.obtainMessage(i, obj);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Message a(int i, int i6) {
        return this.f8335a.obtainMessage(i, i6, 0);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Message a(int i, int i6, Object obj) {
        return this.f8335a.obtainMessage(0, i, i6, obj);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final boolean a(long j6) {
        return this.f8335a.sendEmptyMessageAtTime(2, j6);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final void a(Object obj) {
        this.f8335a.removeCallbacksAndMessages(obj);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final boolean a(Runnable runnable) {
        return this.f8335a.post(runnable);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final boolean a(Runnable runnable, long j6) {
        return this.f8335a.postDelayed(runnable, j6);
    }
}
