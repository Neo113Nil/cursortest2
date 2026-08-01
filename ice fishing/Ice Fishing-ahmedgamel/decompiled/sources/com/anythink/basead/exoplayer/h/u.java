package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class u implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final r[] f7818a;

    /* renamed from: c, reason: collision with root package name */
    private final h f7820c;

    /* renamed from: e, reason: collision with root package name */
    private r.a f7822e;

    /* renamed from: f, reason: collision with root package name */
    private af f7823f;

    /* renamed from: g, reason: collision with root package name */
    private r[] f7824g;

    /* renamed from: h, reason: collision with root package name */
    private z f7825h;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<r> f7821d = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<y, Integer> f7819b = new IdentityHashMap<>();

    public u(h hVar, r... rVarArr) {
        this.f7820c = hVar;
        this.f7818a = rVarArr;
        this.f7825h = hVar.a(new z[0]);
    }

    private void f() {
        this.f7822e.a((r.a) this);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j6) {
        this.f7822e = aVar;
        Collections.addAll(this.f7821d, this.f7818a);
        for (r rVar : this.f7818a) {
            rVar.a(this, j6);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
        this.f7825h.a_(j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f7823f;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        if (this.f7821d.isEmpty()) {
            return this.f7825h.c(j6);
        }
        int size = this.f7821d.size();
        for (int i = 0; i < size; i++) {
            this.f7821d.get(i).c(j6);
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        return this.f7825h.d();
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        return this.f7825h.e();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j6) {
        long b9 = this.f7824g[0].b(j6);
        int i = 1;
        while (true) {
            r[] rVarArr = this.f7824g;
            if (i >= rVarArr.length) {
                return b9;
            }
            if (rVarArr[i].b(b9) != b9) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
        for (r rVar : this.f7818a) {
            rVar.a();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        long c9 = this.f7818a[0].c();
        int i = 1;
        while (true) {
            r[] rVarArr = this.f7818a;
            if (i >= rVarArr.length) {
                if (c9 != com.anythink.basead.exoplayer.b.f6382b) {
                    for (r rVar : this.f7824g) {
                        if (rVar != this.f7818a[0] && rVar.b(c9) != c9) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                }
                return c9;
            }
            if (rVarArr[i].c() != com.anythink.basead.exoplayer.b.f6382b) {
                throw new IllegalStateException("Child reported discontinuity.");
            }
            i++;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j6) {
        com.anythink.basead.exoplayer.i.f[] fVarArr2 = fVarArr;
        int[] iArr = new int[fVarArr2.length];
        int[] iArr2 = new int[fVarArr2.length];
        for (int i = 0; i < fVarArr2.length; i++) {
            y yVar = yVarArr[i];
            iArr[i] = yVar == null ? -1 : this.f7819b.get(yVar).intValue();
            iArr2[i] = -1;
            com.anythink.basead.exoplayer.i.f fVar = fVarArr2[i];
            if (fVar != null) {
                ae f3 = fVar.f();
                int i6 = 0;
                while (true) {
                    r[] rVarArr = this.f7818a;
                    if (i6 >= rVarArr.length) {
                        break;
                    }
                    if (rVarArr[i6].b().a(f3) != -1) {
                        iArr2[i] = i6;
                        break;
                    }
                    i6++;
                }
            }
        }
        this.f7819b.clear();
        int length = fVarArr2.length;
        y[] yVarArr2 = new y[length];
        y[] yVarArr3 = new y[fVarArr2.length];
        com.anythink.basead.exoplayer.i.f[] fVarArr3 = new com.anythink.basead.exoplayer.i.f[fVarArr2.length];
        ArrayList arrayList = new ArrayList(this.f7818a.length);
        long j9 = j6;
        int i9 = 0;
        while (i9 < this.f7818a.length) {
            for (int i10 = 0; i10 < fVarArr2.length; i10++) {
                com.anythink.basead.exoplayer.i.f fVar2 = null;
                yVarArr3[i10] = iArr[i10] == i9 ? yVarArr[i10] : null;
                if (iArr2[i10] == i9) {
                    fVar2 = fVarArr2[i10];
                }
                fVarArr3[i10] = fVar2;
            }
            int i11 = i9;
            long a9 = this.f7818a[i9].a(fVarArr3, zArr, yVarArr3, zArr2, j9);
            if (i11 == 0) {
                j9 = a9;
            } else if (a9 != j9) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            int i12 = 0;
            boolean z3 = false;
            while (i12 < fVarArr2.length) {
                if (iArr2[i12] == i11) {
                    com.anythink.basead.exoplayer.k.a.b(yVarArr3[i12] != null);
                    yVarArr2[i12] = yVarArr3[i12];
                    this.f7819b.put(yVarArr3[i12], Integer.valueOf(i11));
                    z3 = true;
                } else if (iArr[i12] == i11) {
                    com.anythink.basead.exoplayer.k.a.b(yVarArr3[i12] == null);
                }
                i12++;
                fVarArr2 = fVarArr;
            }
            if (z3) {
                arrayList.add(this.f7818a[i11]);
            }
            i9 = i11 + 1;
            fVarArr2 = fVarArr;
        }
        System.arraycopy(yVarArr2, 0, yVarArr, 0, length);
        r[] rVarArr2 = new r[arrayList.size()];
        this.f7824g = rVarArr2;
        arrayList.toArray(rVarArr2);
        this.f7825h = this.f7820c.a(this.f7824g);
        return j9;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j6, boolean z3) {
        for (r rVar : this.f7824g) {
            rVar.a(j6, z3);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j6, com.anythink.basead.exoplayer.ac acVar) {
        return this.f7824g[0].a(j6, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(r rVar) {
        this.f7821d.remove(rVar);
        if (this.f7821d.isEmpty()) {
            int i = 0;
            for (r rVar2 : this.f7818a) {
                i += rVar2.b().f7516b;
            }
            ae[] aeVarArr = new ae[i];
            int i6 = 0;
            for (r rVar3 : this.f7818a) {
                af b9 = rVar3.b();
                int i9 = b9.f7516b;
                int i10 = 0;
                while (i10 < i9) {
                    aeVarArr[i6] = b9.a(i10);
                    i10++;
                    i6++;
                }
            }
            this.f7823f = new af(aeVarArr);
            this.f7822e.a((r) this);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.f7822e.a((r.a) this);
    }
}
