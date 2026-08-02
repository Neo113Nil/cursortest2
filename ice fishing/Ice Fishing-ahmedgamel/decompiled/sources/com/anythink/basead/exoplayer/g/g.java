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
    private static final int f8167n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f8168o = 5;

    /* renamed from: p, reason: collision with root package name */
    private final d f8169p;

    /* renamed from: q, reason: collision with root package name */
    private final f f8170q;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f8171r;

    /* renamed from: s, reason: collision with root package name */
    private final n f8172s;

    /* renamed from: t, reason: collision with root package name */
    private final e f8173t;

    /* renamed from: u, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.g.a[] f8174u;

    /* renamed from: v, reason: collision with root package name */
    private final long[] f8175v;

    /* renamed from: w, reason: collision with root package name */
    private int f8176w;

    /* renamed from: x, reason: collision with root package name */
    private int f8177x;

    /* renamed from: y, reason: collision with root package name */
    private b f8178y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f8179z;

    @Deprecated
    public interface a extends f {
    }

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f8165a);
    }

    private void b(com.anythink.basead.exoplayer.g.a aVar) {
        this.f8170q.a(aVar);
    }

    private void w() {
        Arrays.fill(this.f8174u, (Object) null);
        this.f8176w = 0;
        this.f8177x = 0;
    }

    @Override // com.anythink.basead.exoplayer.z
    public final int a(m mVar) {
        if (this.f8169p.a(mVar)) {
            return com.anythink.basead.exoplayer.a.a((com.anythink.basead.exoplayer.d.g<?>) null, mVar.f9453k) ? 4 : 2;
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
        this.f8178y = null;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean u() {
        return true;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean v() {
        return this.f8179z;
    }

    private g(f fVar, Looper looper, d dVar) {
        super(4);
        this.f8170q = (f) com.anythink.basead.exoplayer.k.a.a(fVar);
        this.f8171r = looper == null ? null : new Handler(looper, this);
        this.f8169p = (d) com.anythink.basead.exoplayer.k.a.a(dVar);
        this.f8172s = new n();
        this.f8173t = new e();
        this.f8174u = new com.anythink.basead.exoplayer.g.a[5];
        this.f8175v = new long[5];
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(m[] mVarArr, long j6) {
        this.f8178y = this.f8169p.b(mVarArr[0]);
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(long j6, boolean z6) {
        w();
        this.f8179z = false;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(long j6, long j9) {
        if (!this.f8179z && this.f8177x < 5) {
            this.f8173t.a();
            if (a(this.f8172s, (com.anythink.basead.exoplayer.c.e) this.f8173t, false) == -4) {
                if (this.f8173t.c()) {
                    this.f8179z = true;
                } else if (!this.f8173t.b()) {
                    e eVar = this.f8173t;
                    eVar.f8166g = this.f8172s.f9469a.f9454l;
                    eVar.h();
                    try {
                        int i = (this.f8176w + this.f8177x) % 5;
                        this.f8174u[i] = this.f8178y.a(this.f8173t);
                        this.f8175v[i] = this.f8173t.f7529f;
                        this.f8177x++;
                    } catch (c e9) {
                        throw com.anythink.basead.exoplayer.g.a(e9, s());
                    }
                }
            }
        }
        if (this.f8177x > 0) {
            long[] jArr = this.f8175v;
            int i4 = this.f8176w;
            if (jArr[i4] <= j6) {
                com.anythink.basead.exoplayer.g.a aVar = this.f8174u[i4];
                Handler handler = this.f8171r;
                if (handler != null) {
                    handler.obtainMessage(0, aVar).sendToTarget();
                } else {
                    b(aVar);
                }
                com.anythink.basead.exoplayer.g.a[] aVarArr = this.f8174u;
                int i6 = this.f8176w;
                aVarArr[i6] = null;
                this.f8176w = (i6 + 1) % 5;
                this.f8177x--;
            }
        }
    }

    private void a(com.anythink.basead.exoplayer.g.a aVar) {
        Handler handler = this.f8171r;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            b(aVar);
        }
    }
}
