package com.anythink.basead.exoplayer.h.b;

import android.util.SparseArray;
import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public final class d implements com.anythink.basead.exoplayer.e.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.e.e f7533a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7534b;

    /* renamed from: c, reason: collision with root package name */
    private final m f7535c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<a> f7536d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f7537e;

    /* renamed from: f, reason: collision with root package name */
    private b f7538f;

    /* renamed from: g, reason: collision with root package name */
    private k f7539g;

    /* renamed from: h, reason: collision with root package name */
    private m[] f7540h;

    public interface b {
        com.anythink.basead.exoplayer.e.m a(int i);
    }

    private d(com.anythink.basead.exoplayer.e.e eVar, int i, m mVar) {
        this.f7533a = eVar;
        this.f7534b = i;
        this.f7535c = mVar;
    }

    private k b() {
        return this.f7539g;
    }

    private m[] c() {
        return this.f7540h;
    }

    public final void a(b bVar, long j6) {
        this.f7538f = bVar;
        if (!this.f7537e) {
            this.f7533a.a(this);
            if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
                this.f7533a.a(0L, j6);
            }
            this.f7537e = true;
            return;
        }
        com.anythink.basead.exoplayer.e.e eVar = this.f7533a;
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            j6 = 0;
        }
        eVar.a(0L, j6);
        for (int i = 0; i < this.f7536d.size(); i++) {
            this.f7536d.valueAt(i).a(bVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final void c_() {
        m[] mVarArr = new m[this.f7536d.size()];
        for (int i = 0; i < this.f7536d.size(); i++) {
            mVarArr[i] = this.f7536d.valueAt(i).f7541a;
        }
        this.f7540h = mVarArr;
    }

    public static final class a implements com.anythink.basead.exoplayer.e.m {

        /* renamed from: a, reason: collision with root package name */
        public m f7541a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7542b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7543c;

        /* renamed from: d, reason: collision with root package name */
        private final m f7544d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.basead.exoplayer.e.m f7545e;

        public a(int i, int i6, m mVar) {
            this.f7542b = i;
            this.f7543c = i6;
            this.f7544d = mVar;
        }

        public final void a(b bVar) {
            if (bVar == null) {
                this.f7545e = new com.anythink.basead.exoplayer.e.d();
                return;
            }
            com.anythink.basead.exoplayer.e.m a9 = bVar.a(this.f7543c);
            this.f7545e = a9;
            m mVar = this.f7541a;
            if (mVar != null) {
                a9.a(mVar);
            }
        }

        @Override // com.anythink.basead.exoplayer.e.m
        public final void a(m mVar) {
            m mVar2 = this.f7544d;
            if (mVar2 != null) {
                mVar = mVar.a(mVar2);
            }
            this.f7541a = mVar;
            this.f7545e.a(mVar);
        }

        @Override // com.anythink.basead.exoplayer.e.m
        public final int a(com.anythink.basead.exoplayer.e.f fVar, int i, boolean z3) {
            return this.f7545e.a(fVar, i, z3);
        }

        @Override // com.anythink.basead.exoplayer.e.m
        public final void a(s sVar, int i) {
            this.f7545e.a(sVar, i);
        }

        @Override // com.anythink.basead.exoplayer.e.m
        public final void a(long j6, int i, int i6, int i9, m.a aVar) {
            this.f7545e.a(j6, i, i6, i9, aVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final com.anythink.basead.exoplayer.e.m a(int i, int i6) {
        a aVar = this.f7536d.get(i);
        if (aVar == null) {
            com.anythink.basead.exoplayer.k.a.b(this.f7540h == null);
            aVar = new a(i, i6, i6 == this.f7534b ? this.f7535c : null);
            aVar.a(this.f7538f);
            this.f7536d.put(i, aVar);
        }
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final void a(k kVar) {
        this.f7539g = kVar;
    }
}
