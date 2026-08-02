package com.anythink.basead.exoplayer.h.b;

import android.util.SparseArray;
import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public final class d implements com.anythink.basead.exoplayer.e.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.e.e f8319a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8320b;

    /* renamed from: c, reason: collision with root package name */
    private final m f8321c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<a> f8322d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f8323e;

    /* renamed from: f, reason: collision with root package name */
    private b f8324f;

    /* renamed from: g, reason: collision with root package name */
    private k f8325g;

    /* renamed from: h, reason: collision with root package name */
    private m[] f8326h;

    public interface b {
        com.anythink.basead.exoplayer.e.m a(int i);
    }

    private d(com.anythink.basead.exoplayer.e.e eVar, int i, m mVar) {
        this.f8319a = eVar;
        this.f8320b = i;
        this.f8321c = mVar;
    }

    private k b() {
        return this.f8325g;
    }

    private m[] c() {
        return this.f8326h;
    }

    public final void a(b bVar, long j6) {
        this.f8324f = bVar;
        if (!this.f8323e) {
            this.f8319a.a(this);
            if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
                this.f8319a.a(0L, j6);
            }
            this.f8323e = true;
            return;
        }
        com.anythink.basead.exoplayer.e.e eVar = this.f8319a;
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            j6 = 0;
        }
        eVar.a(0L, j6);
        for (int i = 0; i < this.f8322d.size(); i++) {
            this.f8322d.valueAt(i).a(bVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final void c_() {
        m[] mVarArr = new m[this.f8322d.size()];
        for (int i = 0; i < this.f8322d.size(); i++) {
            mVarArr[i] = this.f8322d.valueAt(i).f8327a;
        }
        this.f8326h = mVarArr;
    }

    public static final class a implements com.anythink.basead.exoplayer.e.m {

        /* renamed from: a, reason: collision with root package name */
        public m f8327a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8328b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8329c;

        /* renamed from: d, reason: collision with root package name */
        private final m f8330d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.basead.exoplayer.e.m f8331e;

        public a(int i, int i4, m mVar) {
            this.f8328b = i;
            this.f8329c = i4;
            this.f8330d = mVar;
        }

        public final void a(b bVar) {
            if (bVar == null) {
                this.f8331e = new com.anythink.basead.exoplayer.e.d();
                return;
            }
            com.anythink.basead.exoplayer.e.m a9 = bVar.a(this.f8329c);
            this.f8331e = a9;
            m mVar = this.f8327a;
            if (mVar != null) {
                a9.a(mVar);
            }
        }

        @Override // com.anythink.basead.exoplayer.e.m
        public final void a(m mVar) {
            m mVar2 = this.f8330d;
            if (mVar2 != null) {
                mVar = mVar.a(mVar2);
            }
            this.f8327a = mVar;
            this.f8331e.a(mVar);
        }

        @Override // com.anythink.basead.exoplayer.e.m
        public final int a(com.anythink.basead.exoplayer.e.f fVar, int i, boolean z6) {
            return this.f8331e.a(fVar, i, z6);
        }

        @Override // com.anythink.basead.exoplayer.e.m
        public final void a(s sVar, int i) {
            this.f8331e.a(sVar, i);
        }

        @Override // com.anythink.basead.exoplayer.e.m
        public final void a(long j6, int i, int i4, int i6, m.a aVar) {
            this.f8331e.a(j6, i, i4, i6, aVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final com.anythink.basead.exoplayer.e.m a(int i, int i4) {
        a aVar = this.f8322d.get(i);
        if (aVar == null) {
            com.anythink.basead.exoplayer.k.a.b(this.f8326h == null);
            aVar = new a(i, i4, i4 == this.f8320b ? this.f8321c : null);
            aVar.a(this.f8324f);
            this.f8322d.put(i, aVar);
        }
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final void a(k kVar) {
        this.f8325g = kVar;
    }
}
