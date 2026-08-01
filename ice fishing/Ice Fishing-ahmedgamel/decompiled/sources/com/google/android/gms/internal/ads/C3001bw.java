package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.bw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3001bw extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f29366a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f29367b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f29368c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f29369d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f29370e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f29371f;

    /* renamed from: g, reason: collision with root package name */
    public final C3483kw f29372g;

    public C3001bw(Handler handler, Context context, C3483kw c3483kw) {
        super(handler);
        this.f29369d = new AtomicReference(Float.valueOf(-1.0f));
        this.f29370e = new AtomicBoolean(false);
        this.f29371f = Executors.newSingleThreadExecutor();
        this.f29366a = handler;
        this.f29367b = context;
        this.f29368c = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f8445b);
        this.f29372g = c3483kw;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        if (this.f29370e.getAndSet(true)) {
            return;
        }
        this.f29371f.submit(new RunnableC3470kj(this));
    }
}
