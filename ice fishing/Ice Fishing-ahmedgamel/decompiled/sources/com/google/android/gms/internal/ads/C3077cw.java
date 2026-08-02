package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.cw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3077cw extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f30413a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f30414b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f30415c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f30416d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f30417e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f30418f;

    /* renamed from: g, reason: collision with root package name */
    public final C3560lw f30419g;

    public C3077cw(Handler handler, Context context, C3560lw c3560lw) {
        super(handler);
        this.f30416d = new AtomicReference(Float.valueOf(-1.0f));
        this.f30417e = new AtomicBoolean(false);
        this.f30418f = Executors.newSingleThreadExecutor();
        this.f30413a = handler;
        this.f30414b = context;
        this.f30415c = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f9231b);
        this.f30419g = c3560lw;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        if (this.f30417e.getAndSet(true)) {
            return;
        }
        this.f30418f.submit(new RunnableC3493kj(this));
    }
}
