package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.dw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3118dw extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f30255a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f30256b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f30257c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f30258d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f30259e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f30260f;

    /* renamed from: g, reason: collision with root package name */
    public final C3604mw f30261g;

    public C3118dw(Handler handler, Context context, C3604mw c3604mw) {
        super(handler);
        this.f30258d = new AtomicReference(Float.valueOf(-1.0f));
        this.f30259e = new AtomicBoolean(false);
        this.f30260f = Executors.newSingleThreadExecutor();
        this.f30255a = handler;
        this.f30256b = context;
        this.f30257c = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f8602b);
        this.f30261g = c3604mw;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        if (this.f30259e.getAndSet(true)) {
            return;
        }
        this.f30260f.submit(new RunnableC3376ij(this));
    }
}
