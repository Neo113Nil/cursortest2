package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class sxg extends uif implements Function1 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Context B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ aqi D;
    public final /* synthetic */ Rect r;
    public final /* synthetic */ jd6 s;
    public final /* synthetic */ g40 t;
    public final /* synthetic */ Matrix u;
    public final /* synthetic */ czg v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ wwn x;
    public final /* synthetic */ ayg y;
    public final /* synthetic */ dzg z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxg(Rect rect, jd6 jd6Var, g40 g40Var, Matrix matrix, czg czgVar, boolean z, wwn wwnVar, ayg aygVar, dzg dzgVar, boolean z2, Context context, Function0 function0, aqi aqiVar) {
        super(1);
        this.r = rect;
        this.s = jd6Var;
        this.t = g40Var;
        this.u = matrix;
        this.v = czgVar;
        this.w = z;
        this.x = wwnVar;
        this.y = aygVar;
        this.z = dzgVar;
        this.A = z2;
        this.B = context;
        this.C = function0;
        this.D = aqiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0404, code lost:
    
        if (r11.M != r9.e()) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0406, code lost:
    
        r5.execute(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x042a, code lost:
    
        if (r11.M != r9.e()) goto L157;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        jpa jpaVar = (jpa) obj;
        jpaVar.getClass();
        mu3 s = jpaVar.q0().s();
        Rect rect = this.r;
        long i = a4g.i(rect.width(), rect.height());
        long p = nt0.p(eeh.b(nmq.d(jpaVar.e())), eeh.b(nmq.b(jpaVar.e())));
        long f = this.s.f(i, jpaVar.e());
        long a = this.t.a(nt0.p((int) (sso.a(f) * nmq.d(i)), (int) (sso.b(f) * nmq.b(i))), p, jpaVar.getLayoutDirection());
        Matrix matrix = this.u;
        matrix.reset();
        matrix.preTranslate((int) (a >> 32), (int) (a & 4294967295L));
        matrix.preScale(sso.a(f), sso.b(f));
        czg czgVar = this.v;
        HashSet hashSet = (HashSet) czgVar.l.a;
        boolean z = this.w;
        fzg fzgVar = fzg.a;
        boolean add = z ? hashSet.add(fzgVar) : hashSet.remove(fzgVar);
        if (czgVar.a != null && add) {
            czgVar.c();
        }
        czgVar.e = false;
        czgVar.v = this.x;
        czgVar.e();
        pt1 pt1Var = pt1.a;
        czgVar.L = pt1Var;
        czgVar.r(this.y);
        if (czgVar.j != null) {
            czgVar.j = null;
            czgVar.invalidateSelf();
        }
        aqi aqiVar = this.D;
        dzg dzgVar = (dzg) aqiVar.getValue();
        dzg dzgVar2 = this.z;
        if (dzgVar2 != dzgVar) {
            dzg dzgVar3 = (dzg) aqiVar.getValue();
            if (dzgVar3 != null) {
                Iterator it = dzgVar3.a.iterator();
                while (it.hasNext()) {
                    czgVar.a(((ezg) it.next()).a, 1, null);
                }
                Iterator it2 = dzgVar3.b.iterator();
                while (it2.hasNext()) {
                    czgVar.a(((ezg) it2.next()).a, 1, null);
                }
                Iterator it3 = dzgVar3.c.iterator();
                while (it3.hasNext()) {
                    czgVar.a(((ezg) it3.next()).a, 1, null);
                }
                Iterator it4 = dzgVar3.d.iterator();
                while (it4.hasNext()) {
                    czgVar.a(((ezg) it4.next()).a, 1, null);
                }
                Iterator it5 = dzgVar3.e.iterator();
                while (it5.hasNext()) {
                    czgVar.a(((ezg) it5.next()).a, 1, null);
                }
                Iterator it6 = dzgVar3.f.iterator();
                while (it6.hasNext()) {
                    czgVar.a(((ezg) it6.next()).a, 1, null);
                }
                Iterator it7 = dzgVar3.g.iterator();
                while (it7.hasNext()) {
                    czgVar.a(((ezg) it7.next()).a, 1, null);
                }
                Iterator it8 = dzgVar3.h.iterator();
                while (it8.hasNext()) {
                    czgVar.a(((ezg) it8.next()).a, 1, null);
                }
                Iterator it9 = dzgVar3.i.iterator();
                while (it9.hasNext()) {
                    czgVar.a(((ezg) it9.next()).a, 1, null);
                }
                Iterator it10 = dzgVar3.j.iterator();
                while (it10.hasNext()) {
                    czgVar.a(((ezg) it10.next()).a, 1, null);
                }
            }
            if (dzgVar2 != null) {
                for (ezg ezgVar : dzgVar2.a) {
                    czgVar.a(ezgVar.a, 1, new sra(1, ezgVar.b));
                }
                for (ezg ezgVar2 : dzgVar2.b) {
                    czgVar.a(ezgVar2.a, 1, new sra(1, ezgVar2.b));
                }
                for (ezg ezgVar3 : dzgVar2.c) {
                    czgVar.a(ezgVar3.a, 1, new sra(1, ezgVar3.b));
                }
                for (ezg ezgVar4 : dzgVar2.d) {
                    czgVar.a(ezgVar4.a, 1, new sra(1, ezgVar4.b));
                }
                for (ezg ezgVar5 : dzgVar2.e) {
                    czgVar.a(ezgVar5.a, 1, new sra(1, ezgVar5.b));
                }
                for (ezg ezgVar6 : dzgVar2.f) {
                    czgVar.a(ezgVar6.a, 1, new sra(1, ezgVar6.b));
                }
                for (ezg ezgVar7 : dzgVar2.g) {
                    czgVar.a(ezgVar7.a, 1, new sra(1, ezgVar7.b));
                }
                for (ezg ezgVar8 : dzgVar2.h) {
                    czgVar.a(ezgVar8.a, 1, new sra(1, ezgVar8.b));
                }
                for (ezg ezgVar9 : dzgVar2.i) {
                    czgVar.a(ezgVar9.a, 1, new sra(1, ezgVar9.b));
                }
                for (ezg ezgVar10 : dzgVar2.j) {
                    czgVar.a(ezgVar10.a, 1, new sra(1, ezgVar10.b));
                }
            }
            aqiVar.setValue(dzgVar2);
        }
        if (czgVar.r) {
            czgVar.r = false;
            xr5 xr5Var = czgVar.o;
            if (xr5Var != null) {
                xr5Var.p(false);
            }
        }
        czgVar.s = false;
        czgVar.t = true;
        czgVar.m = false;
        boolean z2 = czgVar.n;
        boolean z3 = this.A;
        if (z3 != z2) {
            czgVar.n = z3;
            xr5 xr5Var2 = czgVar.o;
            if (xr5Var2 != null) {
                xr5Var2.N = z3;
            }
            czgVar.invalidateSelf();
        }
        if (czgVar.u) {
            czgVar.u = false;
            czgVar.invalidateSelf();
        }
        Iterator it11 = czg.A0.iterator();
        dbh dbhVar = null;
        while (it11.hasNext()) {
            dbhVar = czgVar.a.d((String) it11.next());
            if (dbhVar != null) {
                break;
            }
        }
        if (czgVar.b(this.B) || dbhVar == null) {
            czgVar.B(((Number) this.C.invoke()).floatValue());
        } else {
            czgVar.B(dbhVar.b);
        }
        czgVar.setBounds(0, 0, rect.width(), rect.height());
        Canvas a2 = vd0.a(s);
        yyg yygVar = czgVar.w0;
        ThreadPoolExecutor threadPoolExecutor = czg.B0;
        rzg rzgVar = czgVar.b;
        Semaphore semaphore = czgVar.Y;
        xr5 xr5Var3 = czgVar.o;
        ayg aygVar = czgVar.a;
        if (xr5Var3 != null && aygVar != null) {
            pt1 pt1Var2 = czgVar.L;
            if (pt1Var2 != null) {
                pt1Var = pt1Var2;
            }
            boolean z4 = pt1Var == pt1.b;
            if (z4) {
                try {
                    semaphore.acquire();
                    if (czgVar.C()) {
                        czgVar.B(rzgVar.e());
                    }
                } catch (InterruptedException unused) {
                    if (z4) {
                        semaphore.release();
                    }
                } catch (Throwable th) {
                    if (z4) {
                        semaphore.release();
                        if (xr5Var3.M != rzgVar.e()) {
                            threadPoolExecutor.execute(yygVar);
                        }
                    }
                    throw th;
                }
            }
            boolean z5 = czgVar.e;
            int i2 = czgVar.p;
            boolean z6 = czgVar.w;
            if (z5) {
                try {
                    if (z6) {
                        a2.save();
                        a2.concat(matrix);
                        czgVar.o(a2, xr5Var3);
                        a2.restore();
                    } else {
                        xr5Var3.g(a2, matrix, i2, null);
                    }
                } catch (Throwable unused2) {
                    psg.a.getClass();
                }
            } else if (z6) {
                a2.save();
                a2.concat(matrix);
                czgVar.o(a2, xr5Var3);
                a2.restore();
            } else {
                xr5Var3.g(a2, matrix, i2, null);
            }
            czgVar.K = false;
            if (z4) {
                semaphore.release();
            }
        }
        return Unit.a;
    }
}
