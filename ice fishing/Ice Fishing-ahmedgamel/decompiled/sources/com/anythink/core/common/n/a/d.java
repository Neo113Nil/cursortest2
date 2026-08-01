package com.anythink.core.common.n.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public abstract class d implements i {

    /* renamed from: a, reason: collision with root package name */
    protected final long f14792a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f14793b;

    /* renamed from: e, reason: collision with root package name */
    private final int f14794e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14795f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Queue<Runnable> f14796a = new ConcurrentLinkedQueue();

        private void a(Runnable runnable) {
            this.f14796a.add(runnable);
        }

        private void a() {
            for (Runnable runnable : this.f14796a) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    private d(String str) {
        this(str, (byte) 0);
    }

    public abstract e a(a aVar, String str, String str2, int i);

    @Override // com.anythink.core.common.n.a.i
    public final l[] a(h hVar) {
        String str = hVar.f14818a;
        int i = this.f14794e;
        if (TextUtils.isEmpty(this.f14795f)) {
            throw new IllegalArgumentException("server can not empty");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("host can not empty");
        }
        List<l> a9 = a(new a(), this.f14795f, str, i).a();
        if (a9 == null || a9.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (l lVar : a9) {
            if (lVar.a() || lVar.f14847h == 5 || lVar.b() || lVar.f14847h == this.f14794e) {
                arrayList.add(lVar);
            }
        }
        return (l[]) arrayList.toArray(new l[0]);
    }

    private d(String str, byte b9) {
        this(str, 53, 500L);
    }

    public d(String str, int i, long j6) {
        this(str, i, j6, 1);
    }

    public d(String str, int i, long j6, int i6) {
        this.f14795f = str;
        this.f14793b = i;
        this.f14792a = j6 <= 0 ? 500L : j6;
        this.f14794e = i6;
    }

    @Override // com.anythink.core.common.n.a.i
    public final f a() {
        return new f(this.f14795f, this.f14793b, this.f14792a);
    }

    private e a(String str) {
        int i = this.f14794e;
        if (!TextUtils.isEmpty(this.f14795f)) {
            if (str != null && !str.isEmpty()) {
                return a(new a(), this.f14795f, str, i);
            }
            throw new IllegalArgumentException("host can not empty");
        }
        throw new IllegalArgumentException("server can not empty");
    }

    private e a(String str, int i) {
        if (!TextUtils.isEmpty(this.f14795f)) {
            if (str != null && !str.isEmpty()) {
                return a(new a(), this.f14795f, str, i);
            }
            throw new IllegalArgumentException("host can not empty");
        }
        throw new IllegalArgumentException("server can not empty");
    }
}
