package com.gamericefishpro.space.p5;

import android.content.res.AssetManager;
import android.os.Build;
import android.view.ViewConfiguration;
import com.gamericefishpro.space.b2.e0;
import com.gamericefishpro.space.b2.m;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.ei.x;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.pi.t1;
import com.gamericefishpro.space.ri.k;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.z.f0;
import com.gamericefishpro.space.z.h1;
import com.gamericefishpro.space.z.j1;
import com.gamericefishpro.space.z.o0;
import com.gamericefishpro.space.z.o1;
import com.gamericefishpro.space.z.p0;
import com.gamericefishpro.space.z.q0;
import com.gamericefishpro.space.z.q1;
import com.gamericefishpro.space.z.r0;
import com.gamericefishpro.space.z.s0;
import com.gamericefishpro.space.z.t0;
import com.gamericefishpro.space.z.u0;
import com.gamericefishpro.space.z.v0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Serializable d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;

    public a(q1 q1Var, u uVar, com.gamericefishpro.space.b1.g gVar, com.gamericefishpro.space.c3.c cVar) {
        this.b = q1Var;
        this.c = uVar;
        this.d = gVar;
        this.e = cVar;
        this.f = com.gamericefishpro.space.hj.c.a(Integer.MAX_VALUE, 6, null);
        this.h = new com.gamericefishpro.space.u6.e(17);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0139, code lost:
    
        if (kotlin.Unit.a == r10) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, q1 q1Var, p0 p0Var, float f, float f2, com.gamericefishpro.space.vh.c cVar) {
        q0 q0Var;
        x xVar;
        float f3;
        q1 q1Var2;
        aVar.getClass();
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i = q0Var.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                q0Var.y = i - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(aVar, cVar);
            }
        } else {
            q0Var = new q0(aVar, cVar);
        }
        q0 q0Var2 = q0Var;
        Object obj = q0Var2.v;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i2 = q0Var2.y;
        if (i2 != 0) {
            if (i2 == 1) {
                f3 = q0Var2.i;
                xVar = q0Var2.e;
                q1Var2 = q0Var2.d;
                com.gamericefishpro.space.wa.b.P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        a0 a0Var = new a0();
        a0Var.d = p0Var;
        aVar.h(p0Var);
        p0 p0VarG = g((com.gamericefishpro.space.ri.e) aVar.f);
        if (p0VarG != null) {
            aVar.h(p0VarG);
            a0Var.d = ((p0) a0Var.d).a(p0VarG);
        }
        x xVar2 = new x();
        float fG = q1Var.g(q1Var.e(((p0) a0Var.d).a));
        xVar2.d = fG;
        if (o0.a(fG)) {
            return Unit.a;
        }
        a0 a0Var2 = new a0();
        a0Var2.d = com.gamericefishpro.space.w.c.b(30, 0.0f);
        r0 r0Var = new r0(xVar2, a0Var2, a0Var, f, aVar, f2, q1Var, null);
        q0Var2.d = q1Var;
        q0Var2.e = xVar2;
        q0Var2.i = f2;
        q0Var2.y = 1;
        if (aVar.i(q1Var, r0Var, q0Var2) != obj2) {
            xVar = xVar2;
            f3 = f2;
            q1Var2 = q1Var;
        }
        return obj2;
        com.gamericefishpro.space.u6.e eVar = (com.gamericefishpro.space.u6.e) aVar.h;
        long j = y3.j(((com.gamericefishpro.space.c2.e) eVar.b).b(Float.MAX_VALUE), ((com.gamericefishpro.space.c2.e) eVar.c).b(Float.MAX_VALUE));
        if (j == 0) {
            float fD = q1Var2.d(Math.signum(xVar.d)) * Math.min(Math.abs(xVar.d) / 100, f3) * 1000;
            if (fD == 0.0f) {
                j = 0;
            } else {
                j = q1Var2.d == v0.e ? y3.j(fD, 0.0f) : y3.j(0.0f, fD);
            }
        }
        com.gamericefishpro.space.b1.g gVar = (com.gamericefishpro.space.b1.g) aVar.d;
        q0Var2.d = null;
        q0Var2.e = null;
        q0Var2.y = 2;
        j1 j1Var = (j1) gVar.d;
        com.gamericefishpro.space.pi.a0.u(j1Var.d0.c(), null, new h1(j1Var, j, null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object b(a aVar, a0 a0Var, x xVar, q1 q1Var, a0 a0Var2, long j, com.gamericefishpro.space.vh.c cVar) throws Throwable {
        s0 s0Var;
        q1 q1Var2;
        a0 a0Var3;
        a0 a0Var4;
        x xVar2;
        boolean z;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i = s0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                s0Var.z = i - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(cVar);
            }
        } else {
            s0Var = new s0(cVar);
        }
        Object objF = s0Var.y;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = s0Var.z;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objF);
            if (j < 0) {
                return Boolean.FALSE;
            }
            e0 e0Var = new e0(aVar, null, 17);
            s0Var.d = aVar;
            s0Var.e = a0Var;
            s0Var.i = xVar;
            q1Var2 = q1Var;
            s0Var.v = q1Var2;
            a0Var3 = a0Var2;
            s0Var.w = a0Var3;
            s0Var.z = 1;
            objF = com.gamericefishpro.space.pi.a0.F(j, e0Var, s0Var);
            if (objF == aVar2) {
                return aVar2;
            }
            a0Var4 = a0Var;
            xVar2 = xVar;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0 a0Var5 = s0Var.w;
            q1 q1Var3 = s0Var.v;
            xVar2 = s0Var.i;
            a0Var4 = s0Var.e;
            a aVar3 = s0Var.d;
            com.gamericefishpro.space.wa.b.P(objF);
            a0Var3 = a0Var5;
            q1Var2 = q1Var3;
            aVar = aVar3;
        }
        p0 p0Var = (p0) objF;
        if (p0Var != null) {
            boolean z2 = ((p0) a0Var4.d).c;
            long j2 = p0Var.a;
            a0Var4.d = new p0(j2, p0Var.b, z2);
            xVar2.d = q1Var2.i(q1Var2.e(j2));
            a0Var3.d = com.gamericefishpro.space.w.c.b(30, 0.0f);
            aVar.h(p0Var);
            z = !o0.a(xVar2.d);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static p0 g(com.gamericefishpro.space.ri.e eVar) {
        p0 p0Var = null;
        f0 block = new f0(new com.gamericefishpro.space.a3.b(22, eVar), null);
        Intrinsics.checkNotNullParameter(block, "block");
        com.gamericefishpro.space.li.f fVarA = com.gamericefishpro.space.li.h.a(block);
        while (fVarA.hasNext()) {
            p0 p0VarA = (p0) fVarA.next();
            if (p0Var != null) {
                p0VarA = p0Var.a(p0VarA);
            }
            p0Var = p0VarA;
        }
        return p0Var;
    }

    public float c(o1 o1Var, float f) {
        q1 q1Var = (q1) this.b;
        long jH = q1Var.h(q1Var.d(f));
        q1 q1Var2 = o1Var.a;
        return q1Var.g(q1Var.e(q1Var2.c(q1Var2.k, jH, 1)));
    }

    public boolean d(com.gamericefishpro.space.b2.h hVar) {
        long j;
        u uVar = (u) this.c;
        com.gamericefishpro.space.c3.c cVar = (com.gamericefishpro.space.c3.c) this.e;
        ViewConfiguration viewConfiguration = (ViewConfiguration) uVar.e;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : cVar.r(64));
        float f2 = -(i > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : cVar.r(64));
        List list = hVar.a;
        com.gamericefishpro.space.n1.b bVar = new com.gamericefishpro.space.n1.b(0L);
        int size = list.size();
        boolean zC = false;
        int i2 = 0;
        while (true) {
            j = bVar.a;
            if (i2 >= size) {
                break;
            }
            bVar = new com.gamericefishpro.space.n1.b(com.gamericefishpro.space.n1.b.e(j, ((m) list.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        q1 q1Var = (q1) this.b;
        float fI = q1Var.i(q1Var.e(jFloatToRawIntBits));
        if (fI != 0.0f) {
            zC = fI > 0.0f ? q1Var.a.c() : q1Var.a.a();
        }
        return zC ? !(((com.gamericefishpro.space.ri.e) this.f).k(new p0(jFloatToRawIntBits, ((m) CollectionsKt.w(hVar.a)).b, false)) instanceof k) : this.a;
    }

    public FileInputStream e(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public void f(int i, Serializable serializable) {
        ((Executor) this.b).execute(new com.gamericefishpro.space.d.i(i, 2, this, serializable));
    }

    public void h(p0 p0Var) {
        com.gamericefishpro.space.u6.e eVar = (com.gamericefishpro.space.u6.e) this.h;
        long j = p0Var.b;
        long j2 = p0Var.a;
        ((com.gamericefishpro.space.c2.e) eVar.b).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((com.gamericefishpro.space.c2.e) eVar.c).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(q1 q1Var, r0 r0Var, com.gamericefishpro.space.vh.c cVar) {
        u0 frame;
        if (cVar instanceof u0) {
            frame = (u0) cVar;
            int i = frame.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.i = i - Integer.MIN_VALUE;
            } else {
                frame = new u0(this, cVar);
            }
        } else {
            frame = new u0(this, cVar);
        }
        Object obj = frame.d;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = frame.i;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            this.a = true;
            t0 t0Var = new t0(q1Var, r0Var, null, 1);
            frame.i = 1;
            t1 t1Var = new t1(frame.getContext(), frame, 0);
            Object objF = com.gamericefishpro.space.b9.a.F(t1Var, t1Var, t0Var);
            if (objF == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
        }
        this.a = false;
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public a(AssetManager assetManager, Executor executor, c cVar, String str, File file) {
        ?? r1;
        this.a = false;
        this.b = executor;
        this.c = cVar;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            r1 = d.d;
        } else {
            switch (i) {
                case 26:
                    r1 = d.g;
                    break;
                case 27:
                    r1 = d.f;
                    break;
                case 28:
                case 29:
                case 30:
                    r1 = d.e;
                    break;
                default:
                    r1 = 0;
                    break;
            }
        }
        this.d = r1;
    }
}
