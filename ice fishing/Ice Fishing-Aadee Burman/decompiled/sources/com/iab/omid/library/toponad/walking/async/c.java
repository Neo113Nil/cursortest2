package com.iab.omid.library.toponad.walking.async;

import com.iab.omid.library.toponad.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f36326a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f36327b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f36328c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f36329d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f36326a = linkedBlockingQueue;
        this.f36327b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f36328c.poll();
        this.f36329d = poll;
        if (poll != null) {
            poll.a(this.f36327b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f36328c.add(bVar);
        if (this.f36329d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.toponad.walking.async.b.a
    public void a(b bVar) {
        this.f36329d = null;
        a();
    }
}
