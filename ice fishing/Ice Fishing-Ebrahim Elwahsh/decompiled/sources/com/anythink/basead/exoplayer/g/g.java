package com.anythink.basead.exoplayer.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.m;
import com.anythink.basead.exoplayer.n;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends com.anythink.basead.exoplayer.a implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    private static final int f7538n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f7539o = 5;

    /* renamed from: p, reason: collision with root package name */
    private final d f7540p;

    /* renamed from: q, reason: collision with root package name */
    private final f f7541q;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f7542r;

    /* renamed from: s, reason: collision with root package name */
    private final n f7543s;

    /* renamed from: t, reason: collision with root package name */
    private final e f7544t;

    /* renamed from: u, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.g.a[] f7545u;

    /* renamed from: v, reason: collision with root package name */
    private final long[] f7546v;

    /* renamed from: w, reason: collision with root package name */
    private int f7547w;

    /* renamed from: x, reason: collision with root package name */
    private int f7548x;

    /* renamed from: y, reason: collision with root package name */
    private b f7549y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7550z;

    @Deprecated
    public interface a extends f {
    }

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f7536a);
    }

    private void b(com.anythink.basead.exoplayer.g.a aVar) {
        this.f7541q.a(aVar);
    }

    private void w() {
        Arrays.fill(this.f7545u, (Object) null);
        this.f7547w = 0;
        this.f7548x = 0;
    }

    @Override // com.anythink.basead.exoplayer.z
    public final int a(m mVar) {
        if (this.f7540p.a(mVar)) {
            return com.anythink.basead.exoplayer.a.a((com.anythink.basead.exoplayer.d.g<?>) null, mVar.f8824k) ? 4 : 2;
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
        this.f7549y = null;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean u() {
        return true;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean v() {
        return this.f7550z;
    }

    private g(f fVar, Looper looper, d dVar) {
        super(4);
        this.f7541q = (f) C0544a.a(fVar);
        this.f7542r = looper == null ? null : new Handler(looper, this);
        this.f7540p = (d) C0544a.a(dVar);
        this.f7543s = new n();
        this.f7544t = new e();
        this.f7545u = new com.anythink.basead.exoplayer.g.a[5];
        this.f7546v = new long[5];
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(m[] mVarArr, long j9) {
        this.f7549y = this.f7540p.b(mVarArr[0]);
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(long j9, boolean z8) {
        w();
        this.f7550z = false;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(long j9, long j10) {
        if (!this.f7550z && this.f7548x < 5) {
            this.f7544t.a();
            if (a(this.f7543s, (com.anythink.basead.exoplayer.c.e) this.f7544t, false) == -4) {
                if (this.f7544t.c()) {
                    this.f7550z = true;
                } else if (!this.f7544t.b()) {
                    e eVar = this.f7544t;
                    eVar.f7537g = this.f7543s.f8840a.f8825l;
                    eVar.h();
                    try {
                        int i = (this.f7547w + this.f7548x) % 5;
                        this.f7545u[i] = this.f7549y.a(this.f7544t);
                        this.f7546v[i] = this.f7544t.f6900f;
                        this.f7548x++;
                    } catch (c e6) {
                        throw com.anythink.basead.exoplayer.g.a(e6, s());
                    }
                }
            }
        }
        if (this.f7548x > 0) {
            long[] jArr = this.f7546v;
            int i4 = this.f7547w;
            if (jArr[i4] <= j9) {
                com.anythink.basead.exoplayer.g.a aVar = this.f7545u[i4];
                Handler handler = this.f7542r;
                if (handler != null) {
                    handler.obtainMessage(0, aVar).sendToTarget();
                } else {
                    b(aVar);
                }
                com.anythink.basead.exoplayer.g.a[] aVarArr = this.f7545u;
                int i9 = this.f7547w;
                aVarArr[i9] = null;
                this.f7547w = (i9 + 1) % 5;
                this.f7548x--;
            }
        }
    }

    private void a(com.anythink.basead.exoplayer.g.a aVar) {
        Handler handler = this.f7542r;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            b(aVar);
        }
    }
}
