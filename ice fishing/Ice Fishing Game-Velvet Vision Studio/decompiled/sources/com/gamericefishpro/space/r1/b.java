package com.gamericefishpro.space.r1;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import com.gamericefishpro.space.b2.d0;
import com.gamericefishpro.space.b2.p;
import com.gamericefishpro.space.o1.b0;
import com.gamericefishpro.space.o1.c0;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.r8.m;
import com.gamericefishpro.space.t.i0;
import com.gamericefishpro.space.t.q0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final d a;
    public Outline f;
    public float j;
    public o k;
    public com.gamericefishpro.space.o1.h l;
    public com.gamericefishpro.space.o1.h m;
    public boolean n;
    public com.gamericefishpro.space.q1.b o;
    public m p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public com.gamericefishpro.space.c3.c b = com.gamericefishpro.space.q1.c.a;
    public com.gamericefishpro.space.c3.l c = com.gamericefishpro.space.c3.l.d;
    public com.gamericefishpro.space.ei.l d = a.e;
    public final d0 e = new d0(24, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final p r = new p();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Intrinsics.a(lowerCase, "robolectric");
    }

    public b(d dVar) {
        this.a = dVar;
        dVar.v(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            d dVar = this.a;
            if (z || dVar.I() > 0.0f) {
                com.gamericefishpro.space.o1.h hVar = this.l;
                if (hVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = hVar instanceof com.gamericefishpro.space.o1.h;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    hVar.a.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || hVar.a.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(hVar.a);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(hVar.a);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = hVar;
                    if (outline != null) {
                        outline.setAlpha(dVar.a());
                        outline2 = outline;
                    }
                    dVar.m(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.w) {
                        dVar.v(false);
                        dVar.r();
                    } else {
                        dVar.v(this.w);
                    }
                } else {
                    dVar.v(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jQ = com.gamericefishpro.space.d9.h.Q(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jQ = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jQ >> 32);
                    int i5 = (int) (jQ & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(dVar.a());
                    dVar.m(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                dVar.v(false);
                dVar.m(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[LOOP:0: B:14:0x0027->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[EDGE_INSN: B:29:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:14:0x0027->B:24:0x005e], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            p pVar = this.r;
            b bVar = (b) pVar.b;
            if (bVar != null) {
                bVar.e();
                pVar.b = null;
            }
            i0 i0Var = (i0) pVar.d;
            if (i0Var != null) {
                Object[] objArr = i0Var.b;
                long[] jArr = i0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ((b) objArr[(i << 3) + i3]).e();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                i0Var.b();
            }
            this.a.r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008f A[LOOP:0: B:20:0x0058->B:30:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[EDGE_INSN: B:34:0x0092->B:31:0x0092 BREAK  A[LOOP:0: B:20:0x0058->B:30:0x008f], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function1] */
    public final void c(com.gamericefishpro.space.q1.d dVar) {
        p pVar = this.r;
        pVar.c = (b) pVar.b;
        i0 elements = (i0) pVar.d;
        if (elements != null && elements.h()) {
            i0 i0Var = (i0) pVar.e;
            if (i0Var == null) {
                i0 i0Var2 = q0.a;
                i0Var = new i0();
                pVar.e = i0Var;
            }
            Intrinsics.checkNotNullParameter(elements, "elements");
            i0Var.j(elements);
            elements.b();
        }
        pVar.a = true;
        this.d.invoke(dVar);
        pVar.a = false;
        b bVar = (b) pVar.c;
        if (bVar != null) {
            bVar.e();
        }
        i0 i0Var3 = (i0) pVar.e;
        if (i0Var3 == null || !i0Var3.h()) {
            return;
        }
        Object[] objArr = i0Var3.b;
        long[] jArr = i0Var3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((b) objArr[(i << 3) + i3]).e();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        i0Var3.b();
    }

    public final o d() {
        o c0Var;
        o oVar = this.k;
        com.gamericefishpro.space.o1.h hVar = this.l;
        if (oVar != null) {
            return oVar;
        }
        if (hVar != null) {
            b0 b0Var = new b0(hVar);
            this.k = b0Var;
            return b0Var;
        }
        long jQ = com.gamericefishpro.space.d9.h.Q(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jQ = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jQ >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jQ & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            c0Var = new com.gamericefishpro.space.o1.d0(com.gamericefishpro.space.u6.f.f(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            c0Var = new c0(new com.gamericefishpro.space.n1.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = c0Var;
        return c0Var;
    }

    public final void e() {
        this.q--;
        b();
    }

    public final void f(long j, long j2, float f) {
        if (com.gamericefishpro.space.n1.b.b(this.h, j) && com.gamericefishpro.space.n1.e.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
