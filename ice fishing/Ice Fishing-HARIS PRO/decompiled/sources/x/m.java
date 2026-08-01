package x;

import androidx.recyclerview.widget.RecyclerView;
import u.AbstractC0357e;

/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public C0371f f4699k;

    /* renamed from: l, reason: collision with root package name */
    public C0366a f4700l;

    @Override // x.InterfaceC0369d
    public final void a(InterfaceC0369d interfaceC0369d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0357e.a(this.j) == 3) {
            w.d dVar = this.f4707b;
            l(dVar.J, dVar.f4532L, 1);
            return;
        }
        C0372g c0372g = this.e;
        if (c0372g.f4687c && !c0372g.j && this.f4709d == 3) {
            w.d dVar2 = this.f4707b;
            int i2 = dVar2.f4578s;
            if (i2 == 2) {
                w.d dVar3 = dVar2.f4540T;
                if (dVar3 != null) {
                    if (dVar3.e.e.j) {
                        c0372g.d((int) ((r5.f4690g * dVar2.f4585z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0372g c0372g2 = dVar2.f4553d.e;
                if (c0372g2.j) {
                    int i3 = dVar2.f4544X;
                    if (i3 == -1) {
                        f2 = c0372g2.f4690g;
                        f3 = dVar2.f4543W;
                    } else if (i3 == 0) {
                        f4 = c0372g2.f4690g * dVar2.f4543W;
                        i = (int) (f4 + 0.5f);
                        c0372g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0372g.d(i);
                    } else {
                        f2 = c0372g2.f4690g;
                        f3 = dVar2.f4543W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0372g.d(i);
                }
            }
        }
        C0371f c0371f = this.f4712h;
        if (c0371f.f4687c) {
            C0371f c0371f2 = this.i;
            if (c0371f2.f4687c) {
                if (c0371f.j && c0371f2.j && c0372g.j) {
                    return;
                }
                if (!c0372g.j && this.f4709d == 3) {
                    w.d dVar4 = this.f4707b;
                    if (dVar4.f4577r == 0 && !dVar4.y()) {
                        C0371f c0371f3 = (C0371f) c0371f.f4693l.get(0);
                        C0371f c0371f4 = (C0371f) c0371f2.f4693l.get(0);
                        int i4 = c0371f3.f4690g + c0371f.f4689f;
                        int i5 = c0371f4.f4690g + c0371f2.f4689f;
                        c0371f.d(i4);
                        c0371f2.d(i5);
                        c0372g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0372g.j && this.f4709d == 3 && this.f4706a == 1 && c0371f.f4693l.size() > 0 && c0371f2.f4693l.size() > 0) {
                    C0371f c0371f5 = (C0371f) c0371f.f4693l.get(0);
                    int i6 = (((C0371f) c0371f2.f4693l.get(0)).f4690g + c0371f2.f4689f) - (c0371f5.f4690g + c0371f.f4689f);
                    int i7 = c0372g.f4694m;
                    if (i6 < i7) {
                        c0372g.d(i6);
                    } else {
                        c0372g.d(i7);
                    }
                }
                if (c0372g.j && c0371f.f4693l.size() > 0 && c0371f2.f4693l.size() > 0) {
                    C0371f c0371f6 = (C0371f) c0371f.f4693l.get(0);
                    C0371f c0371f7 = (C0371f) c0371f2.f4693l.get(0);
                    int i8 = c0371f6.f4690g;
                    int i9 = c0371f.f4689f + i8;
                    int i10 = c0371f7.f4690g;
                    int i11 = c0371f2.f4689f + i10;
                    float f5 = this.f4707b.f4555e0;
                    if (c0371f6 == c0371f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0371f.d((int) ((((i10 - i8) - c0372g.f4690g) * f5) + i8 + 0.5f));
                    c0371f2.d(c0371f.f4690g + c0372g.f4690g);
                }
            }
        }
    }

    @Override // x.o
    public final void d() {
        w.d dVar;
        w.d dVar2;
        w.d dVar3;
        w.d dVar4;
        w.d dVar5 = this.f4707b;
        boolean z2 = dVar5.f4547a;
        C0372g c0372g = this.e;
        if (z2) {
            c0372g.d(dVar5.k());
        }
        boolean z3 = c0372g.j;
        C0371f c0371f = this.i;
        C0371f c0371f2 = this.f4712h;
        if (!z3) {
            w.d dVar6 = this.f4707b;
            this.f4709d = dVar6.f4575p0[1];
            if (dVar6.f4526E) {
                this.f4700l = new C0366a(this);
            }
            int i = this.f4709d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f4707b.f4540T) != null && dVar4.f4575p0[1] == 1) {
                    int k2 = (dVar4.k() - this.f4707b.J.e()) - this.f4707b.f4532L.e();
                    o.b(c0371f2, dVar4.e.f4712h, this.f4707b.J.e());
                    o.b(c0371f, dVar4.e.i, -this.f4707b.f4532L.e());
                    c0372g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0372g.d(this.f4707b.k());
                }
            }
        } else if (this.f4709d == 4 && (dVar2 = (dVar = this.f4707b).f4540T) != null && dVar2.f4575p0[1] == 1) {
            o.b(c0371f2, dVar2.e.f4712h, dVar.J.e());
            o.b(c0371f, dVar2.e.i, -this.f4707b.f4532L.e());
            return;
        }
        boolean z4 = c0372g.j;
        C0371f c0371f3 = this.f4699k;
        if (z4) {
            w.d dVar7 = this.f4707b;
            if (dVar7.f4547a) {
                w.c[] cVarArr = dVar7.f4537Q;
                w.c cVar = cVarArr[2];
                w.c cVar2 = cVar.f4519f;
                if (cVar2 != null && cVarArr[3].f4519f != null) {
                    if (dVar7.y()) {
                        c0371f2.f4689f = this.f4707b.f4537Q[2].e();
                        c0371f.f4689f = -this.f4707b.f4537Q[3].e();
                    } else {
                        C0371f h2 = o.h(this.f4707b.f4537Q[2]);
                        if (h2 != null) {
                            o.b(c0371f2, h2, this.f4707b.f4537Q[2].e());
                        }
                        C0371f h3 = o.h(this.f4707b.f4537Q[3]);
                        if (h3 != null) {
                            o.b(c0371f, h3, -this.f4707b.f4537Q[3].e());
                        }
                        c0371f2.f4686b = true;
                        c0371f.f4686b = true;
                    }
                    w.d dVar8 = this.f4707b;
                    if (dVar8.f4526E) {
                        o.b(c0371f3, c0371f2, dVar8.f4548a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    C0371f h4 = o.h(cVar);
                    if (h4 != null) {
                        o.b(c0371f2, h4, this.f4707b.f4537Q[2].e());
                        o.b(c0371f, c0371f2, c0372g.f4690g);
                        w.d dVar9 = this.f4707b;
                        if (dVar9.f4526E) {
                            o.b(c0371f3, c0371f2, dVar9.f4548a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                w.c cVar3 = cVarArr[3];
                if (cVar3.f4519f != null) {
                    C0371f h5 = o.h(cVar3);
                    if (h5 != null) {
                        o.b(c0371f, h5, -this.f4707b.f4537Q[3].e());
                        o.b(c0371f2, c0371f, -c0372g.f4690g);
                    }
                    w.d dVar10 = this.f4707b;
                    if (dVar10.f4526E) {
                        o.b(c0371f3, c0371f2, dVar10.f4548a0);
                        return;
                    }
                    return;
                }
                w.c cVar4 = cVarArr[4];
                if (cVar4.f4519f != null) {
                    C0371f h6 = o.h(cVar4);
                    if (h6 != null) {
                        o.b(c0371f3, h6, 0);
                        o.b(c0371f2, c0371f3, -this.f4707b.f4548a0);
                        o.b(c0371f, c0371f2, c0372g.f4690g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof w.i) || dVar7.f4540T == null || dVar7.i(7).f4519f != null) {
                    return;
                }
                w.d dVar11 = this.f4707b;
                o.b(c0371f2, dVar11.f4540T.e.f4712h, dVar11.s());
                o.b(c0371f, c0371f2, c0372g.f4690g);
                w.d dVar12 = this.f4707b;
                if (dVar12.f4526E) {
                    o.b(c0371f3, c0371f2, dVar12.f4548a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f4709d != 3) {
            c0372g.b(this);
        } else {
            w.d dVar13 = this.f4707b;
            int i2 = dVar13.f4578s;
            if (i2 == 2) {
                w.d dVar14 = dVar13.f4540T;
                if (dVar14 != null) {
                    C0372g c0372g2 = dVar14.e.e;
                    c0372g.f4693l.add(c0372g2);
                    c0372g2.f4692k.add(c0372g);
                    c0372g.f4686b = true;
                    c0372g.f4692k.add(c0371f2);
                    c0372g.f4692k.add(c0371f);
                }
            } else if (i2 == 3 && !dVar13.y()) {
                w.d dVar15 = this.f4707b;
                if (dVar15.f4577r != 3) {
                    C0372g c0372g3 = dVar15.f4553d.e;
                    c0372g.f4693l.add(c0372g3);
                    c0372g3.f4692k.add(c0372g);
                    c0372g.f4686b = true;
                    c0372g.f4692k.add(c0371f2);
                    c0372g.f4692k.add(c0371f);
                }
            }
        }
        w.d dVar16 = this.f4707b;
        w.c[] cVarArr2 = dVar16.f4537Q;
        w.c cVar5 = cVarArr2[2];
        w.c cVar6 = cVar5.f4519f;
        if (cVar6 != null && cVarArr2[3].f4519f != null) {
            if (dVar16.y()) {
                c0371f2.f4689f = this.f4707b.f4537Q[2].e();
                c0371f.f4689f = -this.f4707b.f4537Q[3].e();
            } else {
                C0371f h7 = o.h(this.f4707b.f4537Q[2]);
                C0371f h8 = o.h(this.f4707b.f4537Q[3]);
                if (h7 != null) {
                    h7.b(this);
                }
                if (h8 != null) {
                    h8.b(this);
                }
                this.j = 4;
            }
            if (this.f4707b.f4526E) {
                c(c0371f3, c0371f2, 1, this.f4700l);
            }
        } else if (cVar6 != null) {
            C0371f h9 = o.h(cVar5);
            if (h9 != null) {
                o.b(c0371f2, h9, this.f4707b.f4537Q[2].e());
                c(c0371f, c0371f2, 1, c0372g);
                if (this.f4707b.f4526E) {
                    c(c0371f3, c0371f2, 1, this.f4700l);
                }
                if (this.f4709d == 3) {
                    w.d dVar17 = this.f4707b;
                    if (dVar17.f4543W > RecyclerView.f2111C0) {
                        k kVar = dVar17.f4553d;
                        if (kVar.f4709d == 3) {
                            kVar.e.f4692k.add(c0372g);
                            c0372g.f4693l.add(this.f4707b.f4553d.e);
                            c0372g.f4685a = this;
                        }
                    }
                }
            }
        } else {
            w.c cVar7 = cVarArr2[3];
            if (cVar7.f4519f != null) {
                C0371f h10 = o.h(cVar7);
                if (h10 != null) {
                    o.b(c0371f, h10, -this.f4707b.f4537Q[3].e());
                    c(c0371f2, c0371f, -1, c0372g);
                    if (this.f4707b.f4526E) {
                        c(c0371f3, c0371f2, 1, this.f4700l);
                    }
                }
            } else {
                w.c cVar8 = cVarArr2[4];
                if (cVar8.f4519f != null) {
                    C0371f h11 = o.h(cVar8);
                    if (h11 != null) {
                        o.b(c0371f3, h11, 0);
                        c(c0371f2, c0371f3, -1, this.f4700l);
                        c(c0371f, c0371f2, 1, c0372g);
                    }
                } else if (!(dVar16 instanceof w.i) && (dVar3 = dVar16.f4540T) != null) {
                    o.b(c0371f2, dVar3.e.f4712h, dVar16.s());
                    c(c0371f, c0371f2, 1, c0372g);
                    if (this.f4707b.f4526E) {
                        c(c0371f3, c0371f2, 1, this.f4700l);
                    }
                    if (this.f4709d == 3) {
                        w.d dVar18 = this.f4707b;
                        if (dVar18.f4543W > RecyclerView.f2111C0) {
                            k kVar2 = dVar18.f4553d;
                            if (kVar2.f4709d == 3) {
                                kVar2.e.f4692k.add(c0372g);
                                c0372g.f4693l.add(this.f4707b.f4553d.e);
                                c0372g.f4685a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0372g.f4693l.size() == 0) {
            c0372g.f4687c = true;
        }
    }

    @Override // x.o
    public final void e() {
        C0371f c0371f = this.f4712h;
        if (c0371f.j) {
            this.f4707b.f4546Z = c0371f.f4690g;
        }
    }

    @Override // x.o
    public final void f() {
        this.f4708c = null;
        this.f4712h.c();
        this.i.c();
        this.f4699k.c();
        this.e.c();
        this.f4711g = false;
    }

    @Override // x.o
    public final boolean k() {
        return this.f4709d != 3 || this.f4707b.f4578s == 0;
    }

    public final void m() {
        this.f4711g = false;
        C0371f c0371f = this.f4712h;
        c0371f.c();
        c0371f.j = false;
        C0371f c0371f2 = this.i;
        c0371f2.c();
        c0371f2.j = false;
        C0371f c0371f3 = this.f4699k;
        c0371f3.c();
        c0371f3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4707b.f4561h0;
    }
}
