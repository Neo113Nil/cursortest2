package com.anythink.basead.exoplayer.h.b;

import android.util.SparseArray;
import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public final class d implements com.anythink.basead.exoplayer.e.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.e.e f7690a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7691b;

    /* renamed from: c, reason: collision with root package name */
    private final m f7692c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<a> f7693d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f7694e;

    /* renamed from: f, reason: collision with root package name */
    private b f7695f;

    /* renamed from: g, reason: collision with root package name */
    private k f7696g;

    /* renamed from: h, reason: collision with root package name */
    private m[] f7697h;

    public interface b {
        com.anythink.basead.exoplayer.e.m a(int i);
    }

    private d(com.anythink.basead.exoplayer.e.e eVar, int i, m mVar) {
        this.f7690a = eVar;
        this.f7691b = i;
        this.f7692c = mVar;
    }

    private k b() {
        return this.f7696g;
    }

    private m[] c() {
        return this.f7697h;
    }

    public final void a(b bVar, long j9) {
        this.f7695f = bVar;
        if (!this.f7694e) {
            this.f7690a.a(this);
            if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
                this.f7690a.a(0L, j9);
            }
            this.f7694e = true;
            return;
        }
        com.anythink.basead.exoplayer.e.e eVar = this.f7690a;
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            j9 = 0;
        }
        eVar.a(0L, j9);
        for (int i = 0; i < this.f7693d.size(); i++) {
            this.f7693d.valueAt(i).a(bVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final void c_() {
        m[] mVarArr = new m[this.f7693d.size()];
        for (int i = 0; i < this.f7693d.size(); i++) {
            mVarArr[i] = this.f7693d.valueAt(i).f7698a;
        }
        this.f7697h = mVarArr;
    }

    public static final class a implements com.anythink.basead.exoplayer.e.m {

        /* renamed from: a, reason: collision with root package name */
        public m f7698a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7699b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7700c;

        /* renamed from: d, reason: collision with root package name */
        private final m f7701d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.basead.exoplayer.e.m f7702e;

        public a(int i, int i4, m mVar) {
            this.f7699b = i;
            this.f7700c = i4;
            this.f7701d = mVar;
        }

        public final void a(b bVar) {
            if (bVar == null) {
                this.f7702e = new com.anythink.basead.exoplayer.e.d();
                return;
            }
            com.anythink.basead.exoplayer.e.m a9 = bVar.a(this.f7700c);
            this.f7702e = a9;
            m mVar = this.f7698a;
            if (mVar != null) {
                a9.a(mVar);
            }
        }

        @Override // com.anythink.basead.exoplayer.e.m
        public final void a(m mVar) {
            m mVar2 = this.f7701d;
            if (mVar2 != null) {
                mVar = mVar.a(mVar2);
            }
            this.f7698a = mVar;
            this.f7702e.a(mVar);
        }

        @Override // com.anythink.basead.exoplayer.e.m
        public final int a(com.anythink.basead.exoplayer.e.f fVar, int i, boolean z8) {
            return this.f7702e.a(fVar, i, z8);
        }

        @Override // com.anythink.basead.exoplayer.e.m
        public final void a(s sVar, int i) {
            this.f7702e.a(sVar, i);
        }

        @Override // com.anythink.basead.exoplayer.e.m
        public final void a(long j9, int i, int i4, int i9, m.a aVar) {
            this.f7702e.a(j9, i, i4, i9, aVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final com.anythink.basead.exoplayer.e.m a(int i, int i4) {
        a aVar = this.f7693d.get(i);
        if (aVar == null) {
            C0544a.b(this.f7697h == null);
            aVar = new a(i, i4, i4 == this.f7691b ? this.f7692c : null);
            aVar.a(this.f7695f);
            this.f7693d.put(i, aVar);
        }
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final void a(k kVar) {
        this.f7696g = kVar;
    }
}
