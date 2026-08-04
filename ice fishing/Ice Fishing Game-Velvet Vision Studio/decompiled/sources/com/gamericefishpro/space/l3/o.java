package com.gamericefishpro.space.l3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements d {
    public int a;
    public com.gamericefishpro.space.k3.d b;
    public l c;
    public int d;
    public final g e = new g(this);
    public int f = 0;
    public boolean g = false;
    public final f h = new f(this);
    public final f i = new f(this);
    public int j = 1;

    public o(com.gamericefishpro.space.k3.d dVar) {
        this.b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.l.add(fVar2);
        fVar.f = i;
        fVar2.k.add(fVar);
    }

    public static f h(com.gamericefishpro.space.k3.c cVar) {
        com.gamericefishpro.space.k3.c cVar2 = cVar.f;
        if (cVar2 == null) {
            return null;
        }
        com.gamericefishpro.space.k3.d dVar = cVar2.d;
        int iB = com.gamericefishpro.space.i3.e.b(cVar2.e);
        if (iB == 1) {
            return dVar.d.h;
        }
        if (iB == 2) {
            return dVar.e.h;
        }
        if (iB == 3) {
            return dVar.d.i;
        }
        if (iB == 4) {
            return dVar.e.i;
        }
        if (iB != 5) {
            return null;
        }
        return dVar.e.k;
    }

    public static f i(com.gamericefishpro.space.k3.c cVar, int i) {
        com.gamericefishpro.space.k3.c cVar2 = cVar.f;
        if (cVar2 == null) {
            return null;
        }
        com.gamericefishpro.space.k3.d dVar = cVar2.d;
        o oVar = i == 0 ? dVar.d : dVar.e;
        int iB = com.gamericefishpro.space.i3.e.b(cVar2.e);
        if (iB == 1 || iB == 2) {
            return oVar.h;
        }
        if (iB == 3 || iB == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        if (i2 == 0) {
            com.gamericefishpro.space.k3.d dVar = this.b;
            int i3 = dVar.u;
            int iMax = Math.max(dVar.t, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            com.gamericefishpro.space.k3.d dVar2 = this.b;
            int i4 = dVar2.x;
            int iMax2 = Math.max(dVar2.w, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        g gVar = this.e;
        if (gVar.j) {
            return gVar.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(com.gamericefishpro.space.k3.c cVar, com.gamericefishpro.space.k3.c cVar2, int i) {
        g gVar;
        float f;
        int i2;
        f fVarH = h(cVar);
        f fVarH2 = h(cVar2);
        if (fVarH.j && fVarH2.j) {
            int iE = cVar.e() + fVarH.g;
            int iE2 = fVarH2.g - cVar2.e();
            int i3 = iE2 - iE;
            g gVar2 = this.e;
            if (!gVar2.j && this.d == 3) {
                int i4 = this.a;
                if (i4 == 0) {
                    gVar2.d(g(i3, i));
                } else if (i4 == 1) {
                    gVar2.d(Math.min(g(gVar2.m, i), i3));
                } else if (i4 == 2) {
                    com.gamericefishpro.space.k3.d dVar = this.b;
                    com.gamericefishpro.space.k3.d dVar2 = dVar.S;
                    if (dVar2 != null) {
                        g gVar3 = (i == 0 ? dVar2.d : dVar2.e).e;
                        if (gVar3.j) {
                            gVar2.d(g((int) ((gVar3.g * (i == 0 ? dVar.v : dVar.y)) + 0.5f), i));
                        }
                    }
                } else if (i4 == 3) {
                    com.gamericefishpro.space.k3.d dVar3 = this.b;
                    o oVar = dVar3.d;
                    if (oVar.d == 3 && oVar.a == 3) {
                        m mVar = dVar3.e;
                        if (mVar.d != 3 || mVar.a != 3) {
                            if (i == 0) {
                                oVar = dVar3.e;
                            }
                            gVar = oVar.e;
                            if (gVar.j) {
                                f = dVar3.V;
                                if (i == 1) {
                                    i2 = (int) ((gVar.g / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * gVar.g) + 0.5f);
                                }
                                gVar2.d(i2);
                            }
                        }
                    } else {
                        if (i == 0) {
                            oVar = dVar3.e;
                        }
                        gVar = oVar.e;
                        if (gVar.j) {
                            f = dVar3.V;
                            if (i == 1) {
                                i2 = (int) ((gVar.g / f) + 0.5f);
                            } else {
                                i2 = (int) ((f * gVar.g) + 0.5f);
                            }
                            gVar2.d(i2);
                        }
                    }
                }
            }
            if (gVar2.j) {
                int i5 = gVar2.g;
                f fVar = this.i;
                f fVar2 = this.h;
                if (i5 == i3) {
                    fVar2.d(iE);
                    fVar.d(iE2);
                    return;
                }
                com.gamericefishpro.space.k3.d dVar4 = this.b;
                float f2 = i == 0 ? dVar4.c0 : dVar4.d0;
                if (fVarH == fVarH2) {
                    iE = fVarH.g;
                    iE2 = fVarH2.g;
                    f2 = 0.5f;
                }
                fVar2.d((int) ((((iE2 - iE) - i5) * f2) + iE + 0.5f));
                fVar.d(fVar2.g + gVar2.g);
            }
        }
    }
}
