package x;

import java.util.ArrayList;
import u.AbstractC0357e;

/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f4696k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f2) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f2) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f2) + 0.5f);
        int i9 = (int) ((i6 / f2) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // x.InterfaceC0369d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0369d interfaceC0369d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0357e.a(this.j) == 3) {
            w.d dVar = this.f4707b;
            l(dVar.f4530I, dVar.f4531K, 0);
            return;
        }
        C0372g c0372g = this.e;
        boolean z2 = c0372g.j;
        C0371f c0371f = this.f4712h;
        C0371f c0371f2 = this.i;
        if (!z2 && this.f4709d == 3) {
            w.d dVar2 = this.f4707b;
            int i2 = dVar2.f4577r;
            if (i2 == 2) {
                w.d dVar3 = dVar2.f4540T;
                if (dVar3 != null) {
                    if (dVar3.f4553d.e.j) {
                        c0372g.d((int) ((r3.f4690g * dVar2.f4582w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = dVar2.f4578s;
                if (i3 == 0 || i3 == 3) {
                    m mVar = dVar2.e;
                    C0371f c0371f3 = mVar.f4712h;
                    C0371f c0371f4 = mVar.i;
                    boolean z3 = dVar2.f4530I.f4519f != null;
                    boolean z4 = dVar2.J.f4519f != null;
                    boolean z5 = dVar2.f4531K.f4519f != null;
                    boolean z6 = dVar2.f4532L.f4519f != null;
                    int i4 = dVar2.f4544X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = dVar2.f4543W;
                        boolean z7 = c0371f3.j;
                        int[] iArr = f4696k;
                        if (z7 && c0371f4.j) {
                            if (c0371f.f4687c && c0371f2.f4687c) {
                                m(iArr, ((C0371f) c0371f.f4693l.get(0)).f4690g + c0371f.f4689f, ((C0371f) c0371f2.f4693l.get(0)).f4690g - c0371f2.f4689f, c0371f3.f4690g + c0371f3.f4689f, c0371f4.f4690g - c0371f4.f4689f, f5, i4);
                                c0372g.d(iArr[0]);
                                this.f4707b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0371f.j;
                        ArrayList arrayList = c0371f3.f4693l;
                        if (z8 && c0371f2.j) {
                            if (!c0371f3.f4687c || !c0371f4.f4687c) {
                                return;
                            }
                            m(iArr, c0371f.f4690g + c0371f.f4689f, c0371f2.f4690g - c0371f2.f4689f, ((C0371f) arrayList.get(0)).f4690g + c0371f3.f4689f, ((C0371f) c0371f4.f4693l.get(0)).f4690g - c0371f4.f4689f, f5, i4);
                            c0372g.d(iArr[0]);
                            this.f4707b.e.e.d(iArr[1]);
                        }
                        if (!c0371f.f4687c || !c0371f2.f4687c || !c0371f3.f4687c || !c0371f4.f4687c) {
                            return;
                        }
                        m(iArr, ((C0371f) c0371f.f4693l.get(0)).f4690g + c0371f.f4689f, ((C0371f) c0371f2.f4693l.get(0)).f4690g - c0371f2.f4689f, ((C0371f) arrayList.get(0)).f4690g + c0371f3.f4689f, ((C0371f) c0371f4.f4693l.get(0)).f4690g - c0371f4.f4689f, f5, i4);
                        c0372g.d(iArr[0]);
                        this.f4707b.e.e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0371f.f4687c || !c0371f2.f4687c) {
                            return;
                        }
                        float f6 = dVar2.f4543W;
                        int i5 = ((C0371f) c0371f.f4693l.get(0)).f4690g + c0371f.f4689f;
                        int i6 = ((C0371f) c0371f2.f4693l.get(0)).f4690g - c0371f2.f4689f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0372g.d(g2);
                            this.f4707b.e.e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0372g.d(g4);
                            this.f4707b.e.e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0371f3.f4687c || !c0371f4.f4687c) {
                            return;
                        }
                        float f7 = dVar2.f4543W;
                        int i9 = ((C0371f) c0371f3.f4693l.get(0)).f4690g + c0371f3.f4689f;
                        int i10 = ((C0371f) c0371f4.f4693l.get(0)).f4690g - c0371f4.f4689f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0372g.d(g7);
                                this.f4707b.e.e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0372g.d(g9);
                        this.f4707b.e.e.d(g8);
                    }
                } else {
                    int i13 = dVar2.f4544X;
                    if (i13 == -1) {
                        f2 = dVar2.e.e.f4690g;
                        f3 = dVar2.f4543W;
                    } else if (i13 == 0) {
                        f4 = dVar2.e.e.f4690g / dVar2.f4543W;
                        i = (int) (f4 + 0.5f);
                        c0372g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0372g.d(i);
                    } else {
                        f2 = dVar2.e.e.f4690g;
                        f3 = dVar2.f4543W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0372g.d(i);
                }
            }
        }
        if (c0371f.f4687c && c0371f2.f4687c) {
            if (c0371f.j && c0371f2.j && c0372g.j) {
                return;
            }
            if (!c0372g.j && this.f4709d == 3) {
                w.d dVar4 = this.f4707b;
                if (dVar4.f4577r == 0 && !dVar4.x()) {
                    C0371f c0371f5 = (C0371f) c0371f.f4693l.get(0);
                    C0371f c0371f6 = (C0371f) c0371f2.f4693l.get(0);
                    int i14 = c0371f5.f4690g + c0371f.f4689f;
                    int i15 = c0371f6.f4690g + c0371f2.f4689f;
                    c0371f.d(i14);
                    c0371f2.d(i15);
                    c0372g.d(i15 - i14);
                    return;
                }
            }
            if (!c0372g.j && this.f4709d == 3 && this.f4706a == 1 && c0371f.f4693l.size() > 0 && c0371f2.f4693l.size() > 0) {
                int min = Math.min((((C0371f) c0371f2.f4693l.get(0)).f4690g + c0371f2.f4689f) - (((C0371f) c0371f.f4693l.get(0)).f4690g + c0371f.f4689f), c0372g.f4694m);
                w.d dVar5 = this.f4707b;
                int i16 = dVar5.f4581v;
                int max = Math.max(dVar5.f4580u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0372g.d(max);
            }
            if (c0372g.j) {
                C0371f c0371f7 = (C0371f) c0371f.f4693l.get(0);
                C0371f c0371f8 = (C0371f) c0371f2.f4693l.get(0);
                int i17 = c0371f7.f4690g;
                int i18 = c0371f.f4689f + i17;
                int i19 = c0371f8.f4690g;
                int i20 = c0371f2.f4689f + i19;
                float f8 = this.f4707b.f4554d0;
                if (c0371f7 == c0371f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0371f.d((int) ((((i19 - i17) - c0372g.f4690g) * f8) + i17 + 0.5f));
                c0371f2.d(c0371f.f4690g + c0372g.f4690g);
            }
        }
    }

    @Override // x.o
    public final void d() {
        w.d dVar;
        w.d dVar2;
        int i;
        w.d dVar3;
        w.d dVar4;
        int i2;
        w.d dVar5 = this.f4707b;
        boolean z2 = dVar5.f4547a;
        C0372g c0372g = this.e;
        if (z2) {
            c0372g.d(dVar5.q());
        }
        boolean z3 = c0372g.j;
        C0371f c0371f = this.i;
        C0371f c0371f2 = this.f4712h;
        if (!z3) {
            w.d dVar6 = this.f4707b;
            int i3 = dVar6.f4575p0[0];
            this.f4709d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (dVar4 = dVar6.f4540T) != null && ((i2 = dVar4.f4575p0[0]) == 1 || i2 == 4)) {
                    int q2 = (dVar4.q() - this.f4707b.f4530I.e()) - this.f4707b.f4531K.e();
                    o.b(c0371f2, dVar4.f4553d.f4712h, this.f4707b.f4530I.e());
                    o.b(c0371f, dVar4.f4553d.i, -this.f4707b.f4531K.e());
                    c0372g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0372g.d(dVar6.q());
                }
            }
        } else if (this.f4709d == 4 && (dVar2 = (dVar = this.f4707b).f4540T) != null && ((i = dVar2.f4575p0[0]) == 1 || i == 4)) {
            o.b(c0371f2, dVar2.f4553d.f4712h, dVar.f4530I.e());
            o.b(c0371f, dVar2.f4553d.i, -this.f4707b.f4531K.e());
            return;
        }
        if (c0372g.j) {
            w.d dVar7 = this.f4707b;
            if (dVar7.f4547a) {
                w.c[] cVarArr = dVar7.f4537Q;
                w.c cVar = cVarArr[0];
                w.c cVar2 = cVar.f4519f;
                if (cVar2 != null && cVarArr[1].f4519f != null) {
                    if (dVar7.x()) {
                        c0371f2.f4689f = this.f4707b.f4537Q[0].e();
                        c0371f.f4689f = -this.f4707b.f4537Q[1].e();
                        return;
                    }
                    C0371f h2 = o.h(this.f4707b.f4537Q[0]);
                    if (h2 != null) {
                        o.b(c0371f2, h2, this.f4707b.f4537Q[0].e());
                    }
                    C0371f h3 = o.h(this.f4707b.f4537Q[1]);
                    if (h3 != null) {
                        o.b(c0371f, h3, -this.f4707b.f4537Q[1].e());
                    }
                    c0371f2.f4686b = true;
                    c0371f.f4686b = true;
                    return;
                }
                if (cVar2 != null) {
                    C0371f h4 = o.h(cVar);
                    if (h4 != null) {
                        o.b(c0371f2, h4, this.f4707b.f4537Q[0].e());
                        o.b(c0371f, c0371f2, c0372g.f4690g);
                        return;
                    }
                    return;
                }
                w.c cVar3 = cVarArr[1];
                if (cVar3.f4519f != null) {
                    C0371f h5 = o.h(cVar3);
                    if (h5 != null) {
                        o.b(c0371f, h5, -this.f4707b.f4537Q[1].e());
                        o.b(c0371f2, c0371f, -c0372g.f4690g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof w.i) || dVar7.f4540T == null || dVar7.i(7).f4519f != null) {
                    return;
                }
                w.d dVar8 = this.f4707b;
                o.b(c0371f2, dVar8.f4540T.f4553d.f4712h, dVar8.r());
                o.b(c0371f, c0371f2, c0372g.f4690g);
                return;
            }
        }
        if (this.f4709d == 3) {
            w.d dVar9 = this.f4707b;
            int i4 = dVar9.f4577r;
            if (i4 == 2) {
                w.d dVar10 = dVar9.f4540T;
                if (dVar10 != null) {
                    C0372g c0372g2 = dVar10.e.e;
                    c0372g.f4693l.add(c0372g2);
                    c0372g2.f4692k.add(c0372g);
                    c0372g.f4686b = true;
                    c0372g.f4692k.add(c0371f2);
                    c0372g.f4692k.add(c0371f);
                }
            } else if (i4 == 3) {
                if (dVar9.f4578s == 3) {
                    c0371f2.f4685a = this;
                    c0371f.f4685a = this;
                    m mVar = dVar9.e;
                    mVar.f4712h.f4685a = this;
                    mVar.i.f4685a = this;
                    c0372g.f4685a = this;
                    if (dVar9.y()) {
                        c0372g.f4693l.add(this.f4707b.e.e);
                        this.f4707b.e.e.f4692k.add(c0372g);
                        m mVar2 = this.f4707b.e;
                        mVar2.e.f4685a = this;
                        c0372g.f4693l.add(mVar2.f4712h);
                        c0372g.f4693l.add(this.f4707b.e.i);
                        this.f4707b.e.f4712h.f4692k.add(c0372g);
                        this.f4707b.e.i.f4692k.add(c0372g);
                    } else if (this.f4707b.x()) {
                        this.f4707b.e.e.f4693l.add(c0372g);
                        c0372g.f4692k.add(this.f4707b.e.e);
                    } else {
                        this.f4707b.e.e.f4693l.add(c0372g);
                    }
                } else {
                    C0372g c0372g3 = dVar9.e.e;
                    c0372g.f4693l.add(c0372g3);
                    c0372g3.f4692k.add(c0372g);
                    this.f4707b.e.f4712h.f4692k.add(c0372g);
                    this.f4707b.e.i.f4692k.add(c0372g);
                    c0372g.f4686b = true;
                    c0372g.f4692k.add(c0371f2);
                    c0372g.f4692k.add(c0371f);
                    c0371f2.f4693l.add(c0372g);
                    c0371f.f4693l.add(c0372g);
                }
            }
        }
        w.d dVar11 = this.f4707b;
        w.c[] cVarArr2 = dVar11.f4537Q;
        w.c cVar4 = cVarArr2[0];
        w.c cVar5 = cVar4.f4519f;
        if (cVar5 != null && cVarArr2[1].f4519f != null) {
            if (dVar11.x()) {
                c0371f2.f4689f = this.f4707b.f4537Q[0].e();
                c0371f.f4689f = -this.f4707b.f4537Q[1].e();
                return;
            }
            C0371f h6 = o.h(this.f4707b.f4537Q[0]);
            C0371f h7 = o.h(this.f4707b.f4537Q[1]);
            if (h6 != null) {
                h6.b(this);
            }
            if (h7 != null) {
                h7.b(this);
            }
            this.j = 4;
            return;
        }
        if (cVar5 != null) {
            C0371f h8 = o.h(cVar4);
            if (h8 != null) {
                o.b(c0371f2, h8, this.f4707b.f4537Q[0].e());
                c(c0371f, c0371f2, 1, c0372g);
                return;
            }
            return;
        }
        w.c cVar6 = cVarArr2[1];
        if (cVar6.f4519f != null) {
            C0371f h9 = o.h(cVar6);
            if (h9 != null) {
                o.b(c0371f, h9, -this.f4707b.f4537Q[1].e());
                c(c0371f2, c0371f, -1, c0372g);
                return;
            }
            return;
        }
        if ((dVar11 instanceof w.i) || (dVar3 = dVar11.f4540T) == null) {
            return;
        }
        o.b(c0371f2, dVar3.f4553d.f4712h, dVar11.r());
        c(c0371f, c0371f2, 1, c0372g);
    }

    @Override // x.o
    public final void e() {
        C0371f c0371f = this.f4712h;
        if (c0371f.j) {
            this.f4707b.f4545Y = c0371f.f4690g;
        }
    }

    @Override // x.o
    public final void f() {
        this.f4708c = null;
        this.f4712h.c();
        this.i.c();
        this.e.c();
        this.f4711g = false;
    }

    @Override // x.o
    public final boolean k() {
        return this.f4709d != 3 || this.f4707b.f4577r == 0;
    }

    public final void n() {
        this.f4711g = false;
        C0371f c0371f = this.f4712h;
        c0371f.c();
        c0371f.j = false;
        C0371f c0371f2 = this.i;
        c0371f2.c();
        c0371f2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4707b.f4561h0;
    }
}
