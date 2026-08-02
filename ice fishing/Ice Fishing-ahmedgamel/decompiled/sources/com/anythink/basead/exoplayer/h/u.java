package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class u implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final r[] f8604a;

    /* renamed from: c, reason: collision with root package name */
    private final h f8606c;

    /* renamed from: e, reason: collision with root package name */
    private r.a f8608e;

    /* renamed from: f, reason: collision with root package name */
    private af f8609f;

    /* renamed from: g, reason: collision with root package name */
    private r[] f8610g;

    /* renamed from: h, reason: collision with root package name */
    private z f8611h;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<r> f8607d = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<y, Integer> f8605b = new IdentityHashMap<>();

    public u(h hVar, r... rVarArr) {
        this.f8606c = hVar;
        this.f8604a = rVarArr;
        this.f8611h = hVar.a(new z[0]);
    }

    private void f() {
        this.f8608e.a((r.a) this);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j6) {
        this.f8608e = aVar;
        Collections.addAll(this.f8607d, this.f8604a);
        for (r rVar : this.f8604a) {
            rVar.a(this, j6);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
        this.f8611h.a_(j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f8609f;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        if (this.f8607d.isEmpty()) {
            return this.f8611h.c(j6);
        }
        int size = this.f8607d.size();
        for (int i = 0; i < size; i++) {
            this.f8607d.get(i).c(j6);
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        return this.f8611h.d();
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        return this.f8611h.e();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j6) {
        long b9 = this.f8610g[0].b(j6);
        int i = 1;
        while (true) {
            r[] rVarArr = this.f8610g;
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
        for (r rVar : this.f8604a) {
            rVar.a();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        long c9 = this.f8604a[0].c();
        int i = 1;
        while (true) {
            r[] rVarArr = this.f8604a;
            if (i >= rVarArr.length) {
                if (c9 != com.anythink.basead.exoplayer.b.f7168b) {
                    for (r rVar : this.f8610g) {
                        if (rVar != this.f8604a[0] && rVar.b(c9) != c9) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                }
                return c9;
            }
            if (rVarArr[i].c() != com.anythink.basead.exoplayer.b.f7168b) {
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
            iArr[i] = yVar == null ? -1 : this.f8605b.get(yVar).intValue();
            iArr2[i] = -1;
            com.anythink.basead.exoplayer.i.f fVar = fVarArr2[i];
            if (fVar != null) {
                ae f2 = fVar.f();
                int i4 = 0;
                while (true) {
                    r[] rVarArr = this.f8604a;
                    if (i4 >= rVarArr.length) {
                        break;
                    }
                    if (rVarArr[i4].b().a(f2) != -1) {
                        iArr2[i] = i4;
                        break;
                    }
                    i4++;
                }
            }
        }
        this.f8605b.clear();
        int length = fVarArr2.length;
        y[] yVarArr2 = new y[length];
        y[] yVarArr3 = new y[fVarArr2.length];
        com.anythink.basead.exoplayer.i.f[] fVarArr3 = new com.anythink.basead.exoplayer.i.f[fVarArr2.length];
        ArrayList arrayList = new ArrayList(this.f8604a.length);
        long j9 = j6;
        int i6 = 0;
        while (i6 < this.f8604a.length) {
            for (int i9 = 0; i9 < fVarArr2.length; i9++) {
                com.anythink.basead.exoplayer.i.f fVar2 = null;
                yVarArr3[i9] = iArr[i9] == i6 ? yVarArr[i9] : null;
                if (iArr2[i9] == i6) {
                    fVar2 = fVarArr2[i9];
                }
                fVarArr3[i9] = fVar2;
            }
            int i10 = i6;
            long a9 = this.f8604a[i6].a(fVarArr3, zArr, yVarArr3, zArr2, j9);
            if (i10 == 0) {
                j9 = a9;
            } else if (a9 != j9) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            int i11 = 0;
            boolean z6 = false;
            while (i11 < fVarArr2.length) {
                if (iArr2[i11] == i10) {
                    com.anythink.basead.exoplayer.k.a.b(yVarArr3[i11] != null);
                    yVarArr2[i11] = yVarArr3[i11];
                    this.f8605b.put(yVarArr3[i11], Integer.valueOf(i10));
                    z6 = true;
                } else if (iArr[i11] == i10) {
                    com.anythink.basead.exoplayer.k.a.b(yVarArr3[i11] == null);
                }
                i11++;
                fVarArr2 = fVarArr;
            }
            if (z6) {
                arrayList.add(this.f8604a[i10]);
            }
            i6 = i10 + 1;
            fVarArr2 = fVarArr;
        }
        System.arraycopy(yVarArr2, 0, yVarArr, 0, length);
        r[] rVarArr2 = new r[arrayList.size()];
        this.f8610g = rVarArr2;
        arrayList.toArray(rVarArr2);
        this.f8611h = this.f8606c.a(this.f8610g);
        return j9;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j6, boolean z6) {
        for (r rVar : this.f8610g) {
            rVar.a(j6, z6);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j6, com.anythink.basead.exoplayer.ac acVar) {
        return this.f8610g[0].a(j6, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(r rVar) {
        this.f8607d.remove(rVar);
        if (this.f8607d.isEmpty()) {
            int i = 0;
            for (r rVar2 : this.f8604a) {
                i += rVar2.b().f8302b;
            }
            ae[] aeVarArr = new ae[i];
            int i4 = 0;
            for (r rVar3 : this.f8604a) {
                af b9 = rVar3.b();
                int i6 = b9.f8302b;
                int i9 = 0;
                while (i9 < i6) {
                    aeVarArr[i4] = b9.a(i9);
                    i9++;
                    i4++;
                }
            }
            this.f8609f = new af(aeVarArr);
            this.f8608e.a((r) this);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.f8608e.a((r.a) this);
    }
}
