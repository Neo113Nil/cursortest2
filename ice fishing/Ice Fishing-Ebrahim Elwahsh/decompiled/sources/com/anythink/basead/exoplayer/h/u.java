package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.k.C0544a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class u implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final r[] f7975a;

    /* renamed from: c, reason: collision with root package name */
    private final h f7977c;

    /* renamed from: e, reason: collision with root package name */
    private r.a f7979e;

    /* renamed from: f, reason: collision with root package name */
    private af f7980f;

    /* renamed from: g, reason: collision with root package name */
    private r[] f7981g;

    /* renamed from: h, reason: collision with root package name */
    private z f7982h;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<r> f7978d = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<y, Integer> f7976b = new IdentityHashMap<>();

    public u(h hVar, r... rVarArr) {
        this.f7977c = hVar;
        this.f7975a = rVarArr;
        this.f7982h = hVar.a(new z[0]);
    }

    private void f() {
        this.f7979e.a((r.a) this);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j9) {
        this.f7979e = aVar;
        Collections.addAll(this.f7978d, this.f7975a);
        for (r rVar : this.f7975a) {
            rVar.a(this, j9);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j9) {
        this.f7982h.a_(j9);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f7980f;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j9) {
        if (this.f7978d.isEmpty()) {
            return this.f7982h.c(j9);
        }
        int size = this.f7978d.size();
        for (int i = 0; i < size; i++) {
            this.f7978d.get(i).c(j9);
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        return this.f7982h.d();
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        return this.f7982h.e();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j9) {
        long b9 = this.f7981g[0].b(j9);
        int i = 1;
        while (true) {
            r[] rVarArr = this.f7981g;
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
        for (r rVar : this.f7975a) {
            rVar.a();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        long c4 = this.f7975a[0].c();
        int i = 1;
        while (true) {
            r[] rVarArr = this.f7975a;
            if (i >= rVarArr.length) {
                if (c4 != com.anythink.basead.exoplayer.b.f6539b) {
                    for (r rVar : this.f7981g) {
                        if (rVar != this.f7975a[0] && rVar.b(c4) != c4) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                }
                return c4;
            }
            if (rVarArr[i].c() != com.anythink.basead.exoplayer.b.f6539b) {
                throw new IllegalStateException("Child reported discontinuity.");
            }
            i++;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j9) {
        com.anythink.basead.exoplayer.i.f[] fVarArr2 = fVarArr;
        int[] iArr = new int[fVarArr2.length];
        int[] iArr2 = new int[fVarArr2.length];
        for (int i = 0; i < fVarArr2.length; i++) {
            y yVar = yVarArr[i];
            iArr[i] = yVar == null ? -1 : this.f7976b.get(yVar).intValue();
            iArr2[i] = -1;
            com.anythink.basead.exoplayer.i.f fVar = fVarArr2[i];
            if (fVar != null) {
                ae f6 = fVar.f();
                int i4 = 0;
                while (true) {
                    r[] rVarArr = this.f7975a;
                    if (i4 >= rVarArr.length) {
                        break;
                    }
                    if (rVarArr[i4].b().a(f6) != -1) {
                        iArr2[i] = i4;
                        break;
                    }
                    i4++;
                }
            }
        }
        this.f7976b.clear();
        int length = fVarArr2.length;
        y[] yVarArr2 = new y[length];
        y[] yVarArr3 = new y[fVarArr2.length];
        com.anythink.basead.exoplayer.i.f[] fVarArr3 = new com.anythink.basead.exoplayer.i.f[fVarArr2.length];
        ArrayList arrayList = new ArrayList(this.f7975a.length);
        long j10 = j9;
        int i9 = 0;
        while (i9 < this.f7975a.length) {
            for (int i10 = 0; i10 < fVarArr2.length; i10++) {
                com.anythink.basead.exoplayer.i.f fVar2 = null;
                yVarArr3[i10] = iArr[i10] == i9 ? yVarArr[i10] : null;
                if (iArr2[i10] == i9) {
                    fVar2 = fVarArr2[i10];
                }
                fVarArr3[i10] = fVar2;
            }
            int i11 = i9;
            long a9 = this.f7975a[i9].a(fVarArr3, zArr, yVarArr3, zArr2, j10);
            if (i11 == 0) {
                j10 = a9;
            } else if (a9 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            int i12 = 0;
            boolean z8 = false;
            while (i12 < fVarArr2.length) {
                if (iArr2[i12] == i11) {
                    C0544a.b(yVarArr3[i12] != null);
                    yVarArr2[i12] = yVarArr3[i12];
                    this.f7976b.put(yVarArr3[i12], Integer.valueOf(i11));
                    z8 = true;
                } else if (iArr[i12] == i11) {
                    C0544a.b(yVarArr3[i12] == null);
                }
                i12++;
                fVarArr2 = fVarArr;
            }
            if (z8) {
                arrayList.add(this.f7975a[i11]);
            }
            i9 = i11 + 1;
            fVarArr2 = fVarArr;
        }
        System.arraycopy(yVarArr2, 0, yVarArr, 0, length);
        r[] rVarArr2 = new r[arrayList.size()];
        this.f7981g = rVarArr2;
        arrayList.toArray(rVarArr2);
        this.f7982h = this.f7977c.a(this.f7981g);
        return j10;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j9, boolean z8) {
        for (r rVar : this.f7981g) {
            rVar.a(j9, z8);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j9, com.anythink.basead.exoplayer.ac acVar) {
        return this.f7981g[0].a(j9, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(r rVar) {
        this.f7978d.remove(rVar);
        if (this.f7978d.isEmpty()) {
            int i = 0;
            for (r rVar2 : this.f7975a) {
                i += rVar2.b().f7673b;
            }
            ae[] aeVarArr = new ae[i];
            int i4 = 0;
            for (r rVar3 : this.f7975a) {
                af b9 = rVar3.b();
                int i9 = b9.f7673b;
                int i10 = 0;
                while (i10 < i9) {
                    aeVarArr[i4] = b9.a(i10);
                    i10++;
                    i4++;
                }
            }
            this.f7980f = new af(aeVarArr);
            this.f7979e.a((r) this);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.f7979e.a((r.a) this);
    }
}
