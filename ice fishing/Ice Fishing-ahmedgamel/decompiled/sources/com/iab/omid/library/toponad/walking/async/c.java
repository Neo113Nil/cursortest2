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
    private final BlockingQueue<Runnable> f37093a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f37094b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f37095c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f37096d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f37093a = linkedBlockingQueue;
        this.f37094b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f37095c.poll();
        this.f37096d = poll;
        if (poll != null) {
            poll.a(this.f37094b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f37095c.add(bVar);
        if (this.f37096d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.toponad.walking.async.b.a
    public void a(b bVar) {
        this.f37096d = null;
        a();
    }
}
