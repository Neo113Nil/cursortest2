package com.anythink.basead.exoplayer.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.anythink.basead.exoplayer.m;
import com.anythink.basead.exoplayer.n;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends com.anythink.basead.exoplayer.a implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    private static final int f7381n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f7382o = 5;

    /* renamed from: p, reason: collision with root package name */
    private final d f7383p;

    /* renamed from: q, reason: collision with root package name */
    private final f f7384q;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f7385r;

    /* renamed from: s, reason: collision with root package name */
    private final n f7386s;

    /* renamed from: t, reason: collision with root package name */
    private final e f7387t;

    /* renamed from: u, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.g.a[] f7388u;

    /* renamed from: v, reason: collision with root package name */
    private final long[] f7389v;

    /* renamed from: w, reason: collision with root package name */
    private int f7390w;

    /* renamed from: x, reason: collision with root package name */
    private int f7391x;

    /* renamed from: y, reason: collision with root package name */
    private b f7392y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7393z;

    @Deprecated
    public interface a extends f {
    }

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f7379a);
    }

    private void b(com.anythink.basead.exoplayer.g.a aVar) {
        this.f7384q.a(aVar);
    }

    private void w() {
        Arrays.fill(this.f7388u, (Object) null);
        this.f7390w = 0;
        this.f7391x = 0;
    }

    @Override // com.anythink.basead.exoplayer.z
    public final int a(m mVar) {
        if (this.f7383p.a(mVar)) {
            return com.anythink.basead.exoplayer.a.a((com.anythink.basead.exoplayer.d.g<?>) null, mVar.f8667k) ? 4 : 2;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        b((com.anythink.basead.exoplayer.g.a) message.obj);
        return true;
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void p() {
        w();
        this.f7392y = null;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean u() {
        return true;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean v() {
        return this.f7393z;
    }

    private g(f fVar, Looper looper, d dVar) {
        super(4);
        this.f7384q = (f) com.anythink.basead.exoplayer.k.a.a(fVar);
        this.f7385r = looper == null ? null : new Handler(looper, this);
        this.f7383p = (d) com.anythink.basead.exoplayer.k.a.a(dVar);
        this.f7386s = new n();
        this.f7387t = new e();
        this.f7388u = new com.anythink.basead.exoplayer.g.a[5];
        this.f7389v = new long[5];
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(m[] mVarArr, long j6) {
        this.f7392y = this.f7383p.b(mVarArr[0]);
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(long j6, boolean z3) {
        w();
        this.f7393z = false;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(long j6, long j9) {
        if (!this.f7393z && this.f7391x < 5) {
            this.f7387t.a();
            if (a(this.f7386s, (com.anythink.basead.exoplayer.c.e) this.f7387t, false) == -4) {
                if (this.f7387t.c()) {
                    this.f7393z = true;
                } else if (!this.f7387t.b()) {
                    e eVar = this.f7387t;
                    eVar.f7380g = this.f7386s.f8683a.f8668l;
                    eVar.h();
                    try {
                        int i = (this.f7390w + this.f7391x) % 5;
                        this.f7388u[i] = this.f7392y.a(this.f7387t);
                        this.f7389v[i] = this.f7387t.f6743f;
                        this.f7391x++;
                    } catch (c e9) {
                        throw com.anythink.basead.exoplayer.g.a(e9, s());
                    }
                }
            }
        }
        if (this.f7391x > 0) {
            long[] jArr = this.f7389v;
            int i6 = this.f7390w;
            if (jArr[i6] <= j6) {
                com.anythink.basead.exoplayer.g.a aVar = this.f7388u[i6];
                Handler handler = this.f7385r;
                if (handler != null) {
                    handler.obtainMessage(0, aVar).sendToTarget();
                } else {
                    b(aVar);
                }
                com.anythink.basead.exoplayer.g.a[] aVarArr = this.f7388u;
                int i9 = this.f7390w;
                aVarArr[i9] = null;
                this.f7390w = (i9 + 1) % 5;
                this.f7391x--;
            }
        }
    }

    private void a(com.anythink.basead.exoplayer.g.a aVar) {
        Handler handler = this.f7385r;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            b(aVar);
        }
    }
}
