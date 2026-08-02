package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class ds2 implements fqa, yr2, bbf {
    public float A;
    public BlurMaskFilter B;
    public pif C;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final pif d = new pif(1 == true ? 1 : 0, 0);
    public final pif e;
    public final pif f;
    public final pif g;
    public final pif h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final czg o;
    public final iof p;
    public final ime q;
    public final yic r;
    public ds2 s;
    public ds2 t;
    public List u;
    public final ArrayList v;
    public final z6t w;
    public boolean x;
    public boolean y;
    public pif z;

    public ds2(czg czgVar, iof iofVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new pif(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new pif(mode2);
        pif pifVar = new pif(1 == true ? 1 : 0, 0);
        this.g = pifVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        pif pifVar2 = new pif();
        pifVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = pifVar2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = czgVar;
        this.p = iofVar;
        List list = iofVar.h;
        if (iofVar.u == 3) {
            pifVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            pifVar.setXfermode(new PorterDuffXfermode(mode));
        }
        mk0 mk0Var = iofVar.i;
        mk0Var.getClass();
        z6t z6tVar = new z6t(mk0Var);
        this.w = z6tVar;
        z6tVar.b(this);
        if (list != null && !list.isEmpty()) {
            ime imeVar = new ime(list);
            this.q = imeVar;
            Iterator it = ((ArrayList) imeVar.b).iterator();
            while (it.hasNext()) {
                ((cs2) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.q.c).iterator();
            while (it2.hasNext()) {
                cs2 cs2Var = (cs2) it2.next();
                e(cs2Var);
                cs2Var.a(this);
            }
        }
        iof iofVar2 = this.p;
        if (iofVar2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        yic yicVar = new yic(iofVar2.t);
        this.r = yicVar;
        yicVar.b = true;
        yicVar.a(new y6t(3, this));
        boolean z = ((Float) this.r.e()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        e(this.r);
    }

    @Override // defpackage.yr2
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.bbf
    public final void c(abf abfVar, int i, ArrayList arrayList, abf abfVar2) {
        ds2 ds2Var = this.s;
        iof iofVar = this.p;
        if (ds2Var != null) {
            String str = ds2Var.p.c;
            abf abfVar3 = new abf(abfVar2);
            abfVar3.a.add(str);
            if (abfVar.a(i, this.s.p.c)) {
                ds2 ds2Var2 = this.s;
                abf abfVar4 = new abf(abfVar3);
                abfVar4.b = ds2Var2;
                arrayList.add(abfVar4);
            }
            if (abfVar.c(i, this.s.p.c) && abfVar.d(i, iofVar.c)) {
                this.s.o(abfVar, abfVar.b(i, this.s.p.c) + i, arrayList, abfVar3);
            }
        }
        String str2 = iofVar.c;
        String str3 = iofVar.c;
        if (abfVar.c(i, str2)) {
            if (!"__container".equals(str3)) {
                abf abfVar5 = new abf(abfVar2);
                abfVar5.a.add(str3);
                if (abfVar.a(i, str3)) {
                    abf abfVar6 = new abf(abfVar5);
                    abfVar6.b = this;
                    arrayList.add(abfVar6);
                }
                abfVar2 = abfVar5;
            }
            if (abfVar.d(i, str3)) {
                o(abfVar, abfVar.b(i, str3) + i, arrayList, abfVar2);
            }
        }
    }

    @Override // defpackage.fqa
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        h();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((ds2) this.u.get(size)).w.e());
                }
            } else {
                ds2 ds2Var = this.t;
                if (ds2Var != null) {
                    matrix2.preConcat(ds2Var.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void e(cs2 cs2Var) {
        if (cs2Var == null) {
            return;
        }
        this.v.add(cs2Var);
    }

    @Override // defpackage.bbf
    public void f(szg szgVar, Object obj) {
        this.w.c(szgVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0216  */
    @Override // defpackage.fqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas, Matrix matrix, int i, qra qraVar) {
        ime imeVar;
        Path path;
        float f;
        int i2;
        ime imeVar2;
        Path path2;
        RectF rectF;
        Matrix matrix2;
        pif pifVar;
        int D;
        float f2;
        int i3;
        ime imeVar3;
        Path path3;
        Path path4;
        Path path5;
        Integer num;
        if (this.x) {
            iof iofVar = this.p;
            boolean z = iofVar.v;
            int i4 = iofVar.y;
            if (z) {
                return;
            }
            h();
            Matrix matrix3 = this.b;
            matrix3.reset();
            matrix3.set(matrix);
            for (int size = this.u.size() - 1; size >= 0; size--) {
                matrix3.preConcat(((ds2) this.u.get(size)).w.e());
            }
            z6t z6tVar = this.w;
            cs2 cs2Var = z6tVar.p;
            int intValue = (int) ((((i / 255.0f) * ((cs2Var == null || (num = (Integer) cs2Var.e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.s == null && !l() && i4 == 1) {
                matrix3.preConcat(z6tVar.e());
                j(canvas, matrix3, intValue, qraVar);
                m();
                return;
            }
            RectF rectF2 = this.i;
            d(rectF2, matrix3, false);
            if (this.s != null && iofVar.u != 3) {
                RectF rectF3 = this.l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.s.d(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix3.preConcat(z6tVar.e());
            RectF rectF4 = this.k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean l = l();
            ime imeVar4 = this.q;
            Path path6 = this.a;
            if (l) {
                int size2 = ((List) imeVar4.d).size();
                int i5 = 0;
                while (i5 < size2) {
                    qbh qbhVar = (qbh) ((List) imeVar4.d).get(i5);
                    Path path7 = (Path) ((cs2) ((ArrayList) imeVar4.b).get(i5)).e();
                    if (path7 == null) {
                        i2 = size2;
                    } else {
                        path6.set(path7);
                        path6.transform(matrix3);
                        int D2 = ouj.D(qbhVar.a);
                        i2 = size2;
                        if (D2 != 0) {
                            if (D2 != 1) {
                                if (D2 != 2) {
                                    if (D2 == 3) {
                                    }
                                    RectF rectF5 = this.m;
                                    path6.computeBounds(rectF5, false);
                                    if (i5 != 0) {
                                        rectF4.set(rectF5);
                                    } else {
                                        imeVar2 = imeVar4;
                                        path2 = path6;
                                        rectF4.set(Math.min(rectF4.left, rectF5.left), Math.min(rectF4.top, rectF5.top), Math.max(rectF4.right, rectF5.right), Math.max(rectF4.bottom, rectF5.bottom));
                                        i5++;
                                        size2 = i2;
                                        imeVar4 = imeVar2;
                                        path6 = path2;
                                    }
                                }
                            }
                        }
                        if (qbhVar.d) {
                        }
                        RectF rectF52 = this.m;
                        path6.computeBounds(rectF52, false);
                        if (i5 != 0) {
                        }
                    }
                    imeVar2 = imeVar4;
                    path2 = path6;
                    i5++;
                    size2 = i2;
                    imeVar4 = imeVar2;
                    path6 = path2;
                }
                imeVar = imeVar4;
                path = path6;
                if (!rectF2.intersect(rectF4)) {
                    f = 0.0f;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    float width = canvas.getWidth();
                    float height = canvas.getHeight();
                    rectF = this.j;
                    rectF.set(f, f, width, height);
                    matrix2 = this.c;
                    canvas.getMatrix(matrix2);
                    if (!matrix2.isIdentity()) {
                        matrix2.invert(matrix2);
                        matrix2.mapRect(rectF);
                    }
                    if (!rectF2.intersect(rectF)) {
                        rectF2.set(f, f, f, f);
                    }
                    if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                        pif pifVar2 = this.d;
                        pifVar2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                        D = ouj.D(i4);
                        if (D != 1) {
                            f2 = 1.0f;
                            i3 = Build.VERSION.SDK_INT >= 29 ? 25 : 14;
                        } else if (D != 2) {
                            i3 = 16;
                            f2 = 1.0f;
                            if (D != 3) {
                                i3 = D != 4 ? D != 5 ? D != 16 ? 0 : 13 : 18 : 17;
                            }
                        } else {
                            f2 = 1.0f;
                            i3 = 15;
                        }
                        u4k.a(i3, pifVar2);
                        Matrix matrix4 = rvt.a;
                        canvas.saveLayer(rectF2, pifVar2);
                        if (i4 == 2) {
                            i(canvas);
                        } else if (Build.VERSION.SDK_INT < 29) {
                            if (this.C == null) {
                                pif pifVar3 = new pif();
                                this.C = pifVar3;
                                pifVar3.setColor(-1);
                            }
                            imeVar3 = imeVar;
                            path3 = path;
                            canvas.drawRect(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2, this.C);
                            j(canvas, matrix3, intValue, qraVar);
                            if (l()) {
                                Paint paint = this.e;
                                canvas.saveLayer(rectF2, paint);
                                if (Build.VERSION.SDK_INT < 28) {
                                    i(canvas);
                                }
                                int i6 = 0;
                                while (true) {
                                    List list = (List) imeVar3.d;
                                    ArrayList arrayList = (ArrayList) imeVar3.b;
                                    if (i6 >= list.size()) {
                                        break;
                                    }
                                    qbh qbhVar2 = (qbh) list.get(i6);
                                    cs2 cs2Var2 = (cs2) arrayList.get(i6);
                                    cs2 cs2Var3 = (cs2) ((ArrayList) imeVar3.c).get(i6);
                                    int i7 = qbhVar2.a;
                                    boolean z2 = qbhVar2.d;
                                    int D3 = ouj.D(i7);
                                    int i8 = i6;
                                    Paint paint2 = this.f;
                                    if (D3 == 0) {
                                        path4 = path3;
                                        if (z2) {
                                            Matrix matrix5 = rvt.a;
                                            canvas.saveLayer(rectF2, pifVar2);
                                            canvas.drawRect(rectF2, pifVar2);
                                            path4.set((Path) cs2Var2.e());
                                            path4.transform(matrix3);
                                            pifVar2.setAlpha((int) (((Integer) cs2Var3.e()).intValue() * 2.55f));
                                            canvas.drawPath(path4, paint2);
                                            canvas.restore();
                                        } else {
                                            path4.set((Path) cs2Var2.e());
                                            path4.transform(matrix3);
                                            pifVar2.setAlpha((int) (((Integer) cs2Var3.e()).intValue() * 2.55f));
                                            canvas.drawPath(path4, pifVar2);
                                        }
                                    } else if (D3 == 1) {
                                        path4 = path3;
                                        if (i8 == 0) {
                                            pifVar2.setColor(-16777216);
                                            pifVar2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                            canvas.drawRect(rectF2, pifVar2);
                                        }
                                        if (z2) {
                                            Matrix matrix6 = rvt.a;
                                            canvas.saveLayer(rectF2, paint2);
                                            canvas.drawRect(rectF2, pifVar2);
                                            paint2.setAlpha((int) (((Integer) cs2Var3.e()).intValue() * 2.55f));
                                            path4.set((Path) cs2Var2.e());
                                            path4.transform(matrix3);
                                            canvas.drawPath(path4, paint2);
                                            canvas.restore();
                                        } else {
                                            path4.set((Path) cs2Var2.e());
                                            path4.transform(matrix3);
                                            canvas.drawPath(path4, paint2);
                                        }
                                    } else if (D3 == 2) {
                                        if (z2) {
                                            Matrix matrix7 = rvt.a;
                                            canvas.saveLayer(rectF2, paint);
                                            canvas.drawRect(rectF2, pifVar2);
                                            paint2.setAlpha((int) (((Integer) cs2Var3.e()).intValue() * 2.55f));
                                            path5 = path3;
                                            path5.set((Path) cs2Var2.e());
                                            path5.transform(matrix3);
                                            canvas.drawPath(path5, paint2);
                                            canvas.restore();
                                        } else {
                                            path5 = path3;
                                            Matrix matrix8 = rvt.a;
                                            canvas.saveLayer(rectF2, paint);
                                            path5.set((Path) cs2Var2.e());
                                            path5.transform(matrix3);
                                            pifVar2.setAlpha((int) (((Integer) cs2Var3.e()).intValue() * 2.55f));
                                            canvas.drawPath(path5, pifVar2);
                                            canvas.restore();
                                        }
                                        path4 = path5;
                                    } else if (D3 != 3) {
                                        path4 = path3;
                                    } else {
                                        if (!arrayList.isEmpty()) {
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= list.size()) {
                                                    pifVar2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                                    canvas.drawRect(rectF2, pifVar2);
                                                    break;
                                                } else if (((qbh) list.get(i9)).a != 4) {
                                                    break;
                                                } else {
                                                    i9++;
                                                }
                                            }
                                        }
                                        path4 = path3;
                                    }
                                    i6 = i8 + 1;
                                    path3 = path4;
                                }
                                canvas.restore();
                            }
                            if (this.s != null) {
                                canvas.saveLayer(rectF2, this.g);
                                i(canvas);
                                this.s.g(canvas, matrix, i, null);
                                canvas.restore();
                            }
                            canvas.restore();
                        }
                        imeVar3 = imeVar;
                        path3 = path;
                        j(canvas, matrix3, intValue, qraVar);
                        if (l()) {
                        }
                        if (this.s != null) {
                        }
                        canvas.restore();
                    }
                    if (this.y && (pifVar = this.z) != null) {
                        pifVar.setStyle(Paint.Style.STROKE);
                        this.z.setColor(-251901);
                        this.z.setStrokeWidth(4.0f);
                        canvas.drawRect(rectF2, this.z);
                        this.z.setStyle(Paint.Style.FILL);
                        this.z.setColor(1357638635);
                        canvas.drawRect(rectF2, this.z);
                    }
                    m();
                }
                f = 0.0f;
                float width2 = canvas.getWidth();
                float height2 = canvas.getHeight();
                rectF = this.j;
                rectF.set(f, f, width2, height2);
                matrix2 = this.c;
                canvas.getMatrix(matrix2);
                if (!matrix2.isIdentity()) {
                }
                if (!rectF2.intersect(rectF)) {
                }
                if (rectF2.width() >= 1.0f) {
                    pif pifVar22 = this.d;
                    pifVar22.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                    D = ouj.D(i4);
                    if (D != 1) {
                    }
                    u4k.a(i3, pifVar22);
                    Matrix matrix42 = rvt.a;
                    canvas.saveLayer(rectF2, pifVar22);
                    if (i4 == 2) {
                    }
                    imeVar3 = imeVar;
                    path3 = path;
                    j(canvas, matrix3, intValue, qraVar);
                    if (l()) {
                    }
                    if (this.s != null) {
                    }
                    canvas.restore();
                }
                if (this.y) {
                    pifVar.setStyle(Paint.Style.STROKE);
                    this.z.setColor(-251901);
                    this.z.setStrokeWidth(4.0f);
                    canvas.drawRect(rectF2, this.z);
                    this.z.setStyle(Paint.Style.FILL);
                    this.z.setColor(1357638635);
                    canvas.drawRect(rectF2, this.z);
                }
                m();
            }
            imeVar = imeVar4;
            path = path6;
            f = 0.0f;
            float width22 = canvas.getWidth();
            float height22 = canvas.getHeight();
            rectF = this.j;
            rectF.set(f, f, width22, height22);
            matrix2 = this.c;
            canvas.getMatrix(matrix2);
            if (!matrix2.isIdentity()) {
            }
            if (!rectF2.intersect(rectF)) {
            }
            if (rectF2.width() >= 1.0f) {
            }
            if (this.y) {
            }
            m();
        }
    }

    public final void h() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (ds2 ds2Var = this.t; ds2Var != null; ds2Var = ds2Var.t) {
            this.u.add(ds2Var);
        }
    }

    public final void i(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i, qra qraVar);

    public ozw k() {
        return this.p.w;
    }

    public final boolean l() {
        ime imeVar = this.q;
        return (imeVar == null || ((ArrayList) imeVar.b).isEmpty()) ? false : true;
    }

    public final void m() {
        okk okkVar = this.o.a.a;
        String str = this.p.c;
        HashMap hashMap = okkVar.c;
        if (okkVar.a) {
            efh efhVar = (efh) hashMap.get(str);
            if (efhVar == null) {
                efhVar = new efh();
                hashMap.put(str, efhVar);
            }
            int i = efhVar.a + 1;
            efhVar.a = i;
            if (i == Integer.MAX_VALUE) {
                efhVar.a = i / 2;
            }
            if (str.equals("__container")) {
                cz0 cz0Var = okkVar.b;
                cz0Var.getClass();
                ty0 ty0Var = new ty0(cz0Var);
                if (ty0Var.hasNext()) {
                    ty0Var.next().getClass();
                    l1j.f();
                }
            }
        }
    }

    public final void n(cs2 cs2Var) {
        this.v.remove(cs2Var);
    }

    public void p(boolean z) {
        if (z && this.z == null) {
            this.z = new pif();
        }
        this.y = z;
    }

    public void q(float f) {
        z6t z6tVar = this.w;
        cs2 cs2Var = z6tVar.p;
        if (cs2Var != null) {
            cs2Var.i(f);
        }
        cs2 cs2Var2 = z6tVar.v;
        if (cs2Var2 != null) {
            cs2Var2.i(f);
        }
        cs2 cs2Var3 = z6tVar.w;
        if (cs2Var3 != null) {
            cs2Var3.i(f);
        }
        cs2 cs2Var4 = z6tVar.l;
        if (cs2Var4 != null) {
            cs2Var4.i(f);
        }
        cs2 cs2Var5 = z6tVar.m;
        if (cs2Var5 != null) {
            cs2Var5.i(f);
        }
        cs2 cs2Var6 = z6tVar.n;
        if (cs2Var6 != null) {
            cs2Var6.i(f);
        }
        cs2 cs2Var7 = z6tVar.o;
        if (cs2Var7 != null) {
            cs2Var7.i(f);
        }
        yic yicVar = z6tVar.q;
        if (yicVar != null) {
            yicVar.i(f);
        }
        yic yicVar2 = z6tVar.r;
        if (yicVar2 != null) {
            yicVar2.i(f);
        }
        yic yicVar3 = z6tVar.s;
        if (yicVar3 != null) {
            yicVar3.i(f);
        }
        yic yicVar4 = z6tVar.t;
        if (yicVar4 != null) {
            yicVar4.i(f);
        }
        yic yicVar5 = z6tVar.u;
        if (yicVar5 != null) {
            yicVar5.i(f);
        }
        int i = 0;
        ime imeVar = this.q;
        if (imeVar != null) {
            ArrayList arrayList = (ArrayList) imeVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((cs2) arrayList.get(i2)).i(f);
            }
        }
        yic yicVar6 = this.r;
        if (yicVar6 != null) {
            yicVar6.i(f);
        }
        ds2 ds2Var = this.s;
        if (ds2Var != null) {
            ds2Var.q(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((cs2) arrayList2.get(i)).i(f);
            i++;
        }
    }

    @Override // defpackage.lb6
    public final void b(List list, List list2) {
    }

    public void o(abf abfVar, int i, ArrayList arrayList, abf abfVar2) {
    }
}
