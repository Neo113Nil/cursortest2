package f1;

import S0.s;
import X0.D;
import X0.v;
import a1.AbstractC0421e;
import a1.InterfaceC0417a;
import a1.q;
import a1.r;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.anythink.basead.exoplayer.k.p;
import g1.C4524d;
import j1.C4589b;
import j1.C4594g;
import j1.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import u.AbstractC5088e;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4490a implements Z0.e, InterfaceC0417a, c1.f {

    /* renamed from: A, reason: collision with root package name */
    public float f37552A;

    /* renamed from: B, reason: collision with root package name */
    public BlurMaskFilter f37553B;

    /* renamed from: C, reason: collision with root package name */
    public Y0.a f37554C;

    /* renamed from: a, reason: collision with root package name */
    public final Path f37555a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f37556b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f37557c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final Y0.a f37558d = new Y0.a(1, 0);

    /* renamed from: e, reason: collision with root package name */
    public final Y0.a f37559e;

    /* renamed from: f, reason: collision with root package name */
    public final Y0.a f37560f;

    /* renamed from: g, reason: collision with root package name */
    public final Y0.a f37561g;

    /* renamed from: h, reason: collision with root package name */
    public final Y0.a f37562h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f37563j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f37564k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f37565l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f37566m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f37567n;

    /* renamed from: o, reason: collision with root package name */
    public final v f37568o;

    /* renamed from: p, reason: collision with root package name */
    public final C4493d f37569p;

    /* renamed from: q, reason: collision with root package name */
    public final Y2.e f37570q;

    /* renamed from: r, reason: collision with root package name */
    public final a1.i f37571r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC4490a f37572s;

    /* renamed from: t, reason: collision with root package name */
    public AbstractC4490a f37573t;

    /* renamed from: u, reason: collision with root package name */
    public List f37574u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f37575v;

    /* renamed from: w, reason: collision with root package name */
    public final r f37576w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f37577x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f37578y;

    /* renamed from: z, reason: collision with root package name */
    public Y0.a f37579z;

    public AbstractC4490a(v vVar, C4493d c4493d) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f37559e = new Y0.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f37560f = new Y0.a(mode2);
        Y0.a aVar = new Y0.a(1, 0);
        this.f37561g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        Y0.a aVar2 = new Y0.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f37562h = aVar2;
        this.i = new RectF();
        this.f37563j = new RectF();
        this.f37564k = new RectF();
        this.f37565l = new RectF();
        this.f37566m = new RectF();
        this.f37567n = new Matrix();
        this.f37575v = new ArrayList();
        this.f37577x = true;
        this.f37552A = 0.0f;
        this.f37568o = vVar;
        this.f37569p = c4493d;
        if (c4493d.f37617u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        d1.d dVar = c4493d.i;
        dVar.getClass();
        r rVar = new r(dVar);
        this.f37576w = rVar;
        rVar.b(this);
        List list = c4493d.f37605h;
        if (list != null && !list.isEmpty()) {
            Y2.e eVar = new Y2.e(list);
            this.f37570q = eVar;
            Iterator it = ((ArrayList) eVar.f3963u).iterator();
            while (it.hasNext()) {
                ((AbstractC0421e) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.f37570q.f3964v).iterator();
            while (it2.hasNext()) {
                AbstractC0421e abstractC0421e = (AbstractC0421e) it2.next();
                e(abstractC0421e);
                abstractC0421e.a(this);
            }
        }
        C4493d c4493d2 = this.f37569p;
        if (c4493d2.f37616t.isEmpty()) {
            if (true != this.f37577x) {
                this.f37577x = true;
                this.f37568o.invalidateSelf();
                return;
            }
            return;
        }
        a1.i iVar = new a1.i(c4493d2.f37616t);
        this.f37571r = iVar;
        iVar.f4303b = true;
        iVar.a(new q(3, this));
        boolean z8 = ((Float) this.f37571r.e()).floatValue() == 1.0f;
        if (z8 != this.f37577x) {
            this.f37577x = z8;
            this.f37568o.invalidateSelf();
        }
        e(this.f37571r);
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        this.f37568o.invalidateSelf();
    }

    @Override // c1.f
    public void c(ColorFilter colorFilter, s sVar) {
        this.f37576w.c(colorFilter, sVar);
    }

    @Override // Z0.e
    public void d(RectF rectF, Matrix matrix, boolean z8) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f37567n;
        matrix2.set(matrix);
        if (z8) {
            List list = this.f37574u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((AbstractC4490a) this.f37574u.get(size)).f37576w.e());
                }
            } else {
                AbstractC4490a abstractC4490a = this.f37573t;
                if (abstractC4490a != null) {
                    matrix2.preConcat(abstractC4490a.f37576w.e());
                }
            }
        }
        matrix2.preConcat(this.f37576w.e());
    }

    public final void e(AbstractC0421e abstractC0421e) {
        if (abstractC0421e == null) {
            return;
        }
        this.f37575v.add(abstractC0421e);
    }

    @Override // c1.f
    public final void f(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        AbstractC4490a abstractC4490a = this.f37572s;
        C4493d c4493d = this.f37569p;
        if (abstractC4490a != null) {
            String str = abstractC4490a.f37569p.f37600c;
            c1.e eVar3 = new c1.e(eVar2);
            eVar3.f5679a.add(str);
            if (eVar.a(i, this.f37572s.f37569p.f37600c)) {
                AbstractC4490a abstractC4490a2 = this.f37572s;
                c1.e eVar4 = new c1.e(eVar3);
                eVar4.f5680b = abstractC4490a2;
                arrayList.add(eVar4);
            }
            if (eVar.c(i, this.f37572s.f37569p.f37600c) && eVar.d(i, c4493d.f37600c)) {
                this.f37572s.p(eVar, eVar.b(i, this.f37572s.f37569p.f37600c) + i, arrayList, eVar3);
            }
        }
        if (eVar.c(i, c4493d.f37600c)) {
            String str2 = c4493d.f37600c;
            if (!"__container".equals(str2)) {
                c1.e eVar5 = new c1.e(eVar2);
                eVar5.f5679a.add(str2);
                if (eVar.a(i, str2)) {
                    c1.e eVar6 = new c1.e(eVar5);
                    eVar6.f5680b = this;
                    arrayList.add(eVar6);
                }
                eVar2 = eVar5;
            }
            if (eVar.d(i, str2)) {
                p(eVar, eVar.b(i, str2) + i, arrayList, eVar2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0220  */
    @Override // Z0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Canvas canvas, Matrix matrix, int i, C4589b c4589b) {
        Y2.e eVar;
        Path path;
        float f6;
        int i4;
        Path path2;
        RectF rectF;
        Matrix matrix2;
        Y0.a aVar;
        Y2.e eVar2;
        Path path3;
        Path path4;
        Integer num;
        if (this.f37577x) {
            C4493d c4493d = this.f37569p;
            if (c4493d.f37618v) {
                return;
            }
            i();
            Matrix matrix3 = this.f37556b;
            matrix3.reset();
            matrix3.set(matrix);
            for (int size = this.f37574u.size() - 1; size >= 0; size--) {
                matrix3.preConcat(((AbstractC4490a) this.f37574u.get(size)).f37576w.e());
            }
            r rVar = this.f37576w;
            AbstractC0421e abstractC0421e = rVar.f4354p;
            int intValue = (int) ((((i / 255.0f) * ((abstractC0421e == null || (num = (Integer) abstractC0421e.e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            boolean z8 = this.f37572s != null;
            int i9 = c4493d.f37621y;
            if (!z8 && !m() && i9 == 1) {
                matrix3.preConcat(rVar.e());
                k(canvas, matrix3, intValue, c4589b);
                n();
                return;
            }
            RectF rectF2 = this.i;
            d(rectF2, matrix3, false);
            if (this.f37572s != null && c4493d.f37617u != 3) {
                RectF rectF3 = this.f37565l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f37572s.d(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix3.preConcat(rVar.e());
            RectF rectF4 = this.f37564k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean m8 = m();
            Path path5 = this.f37555a;
            Y2.e eVar3 = this.f37570q;
            if (m8) {
                int size2 = ((List) eVar3.f3965w).size();
                int i10 = 0;
                while (i10 < size2) {
                    e1.f fVar = (e1.f) ((List) eVar3.f3965w).get(i10);
                    Path path6 = (Path) ((AbstractC0421e) ((ArrayList) eVar3.f3963u).get(i10)).e();
                    if (path6 == null) {
                        eVar = eVar3;
                    } else {
                        path5.set(path6);
                        path5.transform(matrix3);
                        int d2 = AbstractC5088e.d(fVar.f37262a);
                        eVar = eVar3;
                        if (d2 != 0) {
                            if (d2 != 1) {
                                if (d2 != 2) {
                                    if (d2 == 3) {
                                    }
                                    RectF rectF5 = this.f37566m;
                                    path5.computeBounds(rectF5, false);
                                    if (i10 != 0) {
                                        rectF4.set(rectF5);
                                    } else {
                                        i4 = size2;
                                        path2 = path5;
                                        rectF4.set(Math.min(rectF4.left, rectF5.left), Math.min(rectF4.top, rectF5.top), Math.max(rectF4.right, rectF5.right), Math.max(rectF4.bottom, rectF5.bottom));
                                        i10++;
                                        eVar3 = eVar;
                                        size2 = i4;
                                        path5 = path2;
                                    }
                                }
                            }
                        }
                        if (fVar.f37265d) {
                        }
                        RectF rectF52 = this.f37566m;
                        path5.computeBounds(rectF52, false);
                        if (i10 != 0) {
                        }
                    }
                    i4 = size2;
                    path2 = path5;
                    i10++;
                    eVar3 = eVar;
                    size2 = i4;
                    path5 = path2;
                }
                eVar = eVar3;
                path = path5;
                if (!rectF2.intersect(rectF4)) {
                    f6 = 0.0f;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    rectF = this.f37563j;
                    rectF.set(f6, f6, canvas.getWidth(), canvas.getHeight());
                    matrix2 = this.f37557c;
                    canvas.getMatrix(matrix2);
                    if (!matrix2.isIdentity()) {
                        matrix2.invert(matrix2);
                        matrix2.mapRect(rectF);
                    }
                    if (!rectF2.intersect(rectF)) {
                        rectF2.set(f6, f6, f6, f6);
                    }
                    if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                        Y0.a aVar2 = this.f37558d;
                        aVar2.setAlpha(p.f8630b);
                        int d3 = AbstractC5088e.d(i9);
                        G.h.a(aVar2, d3 == 1 ? d3 != 2 ? d3 != 3 ? d3 != 4 ? d3 != 5 ? d3 != 16 ? null : G.a.f1142n : G.a.f1147y : G.a.f1146x : G.a.f1145w : G.a.f1144v : Build.VERSION.SDK_INT >= 29 ? G.a.f1148z : G.a.f1143u);
                        Matrix matrix4 = j.f38533a;
                        canvas.saveLayer(rectF2, aVar2);
                        if (i9 == 2) {
                            j(canvas);
                        } else if (Build.VERSION.SDK_INT < 29) {
                            if (this.f37554C == null) {
                                Y0.a aVar3 = new Y0.a();
                                this.f37554C = aVar3;
                                aVar3.setColor(-1);
                            }
                            eVar2 = eVar;
                            path3 = path;
                            canvas.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.f37554C);
                            k(canvas, matrix3, intValue, c4589b);
                            if (m()) {
                                Paint paint = this.f37559e;
                                canvas.saveLayer(rectF2, paint);
                                if (Build.VERSION.SDK_INT < 28) {
                                    j(canvas);
                                }
                                int i11 = 0;
                                while (i11 < ((List) eVar2.f3965w).size()) {
                                    List list = (List) eVar2.f3965w;
                                    e1.f fVar2 = (e1.f) list.get(i11);
                                    ArrayList arrayList = (ArrayList) eVar2.f3963u;
                                    AbstractC0421e abstractC0421e2 = (AbstractC0421e) arrayList.get(i11);
                                    AbstractC0421e abstractC0421e3 = (AbstractC0421e) ((ArrayList) eVar2.f3964v).get(i11);
                                    int d9 = AbstractC5088e.d(fVar2.f37262a);
                                    int i12 = i11;
                                    Paint paint2 = this.f37560f;
                                    boolean z9 = fVar2.f37265d;
                                    if (d9 == 0) {
                                        path4 = path3;
                                        if (z9) {
                                            Matrix matrix5 = j.f38533a;
                                            canvas.saveLayer(rectF2, aVar2);
                                            canvas.drawRect(rectF2, aVar2);
                                            path4.set((Path) abstractC0421e2.e());
                                            path4.transform(matrix3);
                                            aVar2.setAlpha((int) (((Integer) abstractC0421e3.e()).intValue() * 2.55f));
                                            canvas.drawPath(path4, paint2);
                                            canvas.restore();
                                        } else {
                                            path4.set((Path) abstractC0421e2.e());
                                            path4.transform(matrix3);
                                            aVar2.setAlpha((int) (((Integer) abstractC0421e3.e()).intValue() * 2.55f));
                                            canvas.drawPath(path4, aVar2);
                                        }
                                    } else if (d9 == 1) {
                                        path4 = path3;
                                        if (i12 == 0) {
                                            aVar2.setColor(-16777216);
                                            aVar2.setAlpha(p.f8630b);
                                            canvas.drawRect(rectF2, aVar2);
                                        }
                                        if (z9) {
                                            Matrix matrix6 = j.f38533a;
                                            canvas.saveLayer(rectF2, paint2);
                                            canvas.drawRect(rectF2, aVar2);
                                            paint2.setAlpha((int) (((Integer) abstractC0421e3.e()).intValue() * 2.55f));
                                            path4.set((Path) abstractC0421e2.e());
                                            path4.transform(matrix3);
                                            canvas.drawPath(path4, paint2);
                                            canvas.restore();
                                        } else {
                                            path4.set((Path) abstractC0421e2.e());
                                            path4.transform(matrix3);
                                            canvas.drawPath(path4, paint2);
                                        }
                                    } else if (d9 != 2) {
                                        if (d9 != 3) {
                                            path4 = path3;
                                        } else {
                                            if (!arrayList.isEmpty()) {
                                                int i13 = 0;
                                                while (true) {
                                                    if (i13 >= list.size()) {
                                                        aVar2.setAlpha(p.f8630b);
                                                        canvas.drawRect(rectF2, aVar2);
                                                        break;
                                                    } else if (((e1.f) list.get(i13)).f37262a != 4) {
                                                        break;
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            }
                                            path4 = path3;
                                        }
                                    } else if (z9) {
                                        Matrix matrix7 = j.f38533a;
                                        canvas.saveLayer(rectF2, paint);
                                        canvas.drawRect(rectF2, aVar2);
                                        paint2.setAlpha((int) (((Integer) abstractC0421e3.e()).intValue() * 2.55f));
                                        path4 = path3;
                                        path4.set((Path) abstractC0421e2.e());
                                        path4.transform(matrix3);
                                        canvas.drawPath(path4, paint2);
                                        canvas.restore();
                                    } else {
                                        path4 = path3;
                                        Matrix matrix8 = j.f38533a;
                                        canvas.saveLayer(rectF2, paint);
                                        path4.set((Path) abstractC0421e2.e());
                                        path4.transform(matrix3);
                                        aVar2.setAlpha((int) (((Integer) abstractC0421e3.e()).intValue() * 2.55f));
                                        canvas.drawPath(path4, aVar2);
                                        canvas.restore();
                                    }
                                    i11 = i12 + 1;
                                    path3 = path4;
                                }
                                canvas.restore();
                            }
                            if (this.f37572s != null) {
                                canvas.saveLayer(rectF2, this.f37561g);
                                j(canvas);
                                this.f37572s.h(canvas, matrix, i, null);
                                canvas.restore();
                            }
                            canvas.restore();
                        }
                        eVar2 = eVar;
                        path3 = path;
                        k(canvas, matrix3, intValue, c4589b);
                        if (m()) {
                        }
                        if (this.f37572s != null) {
                        }
                        canvas.restore();
                    }
                    if (this.f37578y && (aVar = this.f37579z) != null) {
                        aVar.setStyle(Paint.Style.STROKE);
                        this.f37579z.setColor(-251901);
                        this.f37579z.setStrokeWidth(4.0f);
                        canvas.drawRect(rectF2, this.f37579z);
                        this.f37579z.setStyle(Paint.Style.FILL);
                        this.f37579z.setColor(1357638635);
                        canvas.drawRect(rectF2, this.f37579z);
                    }
                    n();
                }
                f6 = 0.0f;
                rectF = this.f37563j;
                rectF.set(f6, f6, canvas.getWidth(), canvas.getHeight());
                matrix2 = this.f37557c;
                canvas.getMatrix(matrix2);
                if (!matrix2.isIdentity()) {
                }
                if (!rectF2.intersect(rectF)) {
                }
                if (rectF2.width() >= 1.0f) {
                    Y0.a aVar22 = this.f37558d;
                    aVar22.setAlpha(p.f8630b);
                    int d32 = AbstractC5088e.d(i9);
                    G.h.a(aVar22, d32 == 1 ? d32 != 2 ? d32 != 3 ? d32 != 4 ? d32 != 5 ? d32 != 16 ? null : G.a.f1142n : G.a.f1147y : G.a.f1146x : G.a.f1145w : G.a.f1144v : Build.VERSION.SDK_INT >= 29 ? G.a.f1148z : G.a.f1143u);
                    Matrix matrix42 = j.f38533a;
                    canvas.saveLayer(rectF2, aVar22);
                    if (i9 == 2) {
                    }
                    eVar2 = eVar;
                    path3 = path;
                    k(canvas, matrix3, intValue, c4589b);
                    if (m()) {
                    }
                    if (this.f37572s != null) {
                    }
                    canvas.restore();
                }
                if (this.f37578y) {
                    aVar.setStyle(Paint.Style.STROKE);
                    this.f37579z.setColor(-251901);
                    this.f37579z.setStrokeWidth(4.0f);
                    canvas.drawRect(rectF2, this.f37579z);
                    this.f37579z.setStyle(Paint.Style.FILL);
                    this.f37579z.setColor(1357638635);
                    canvas.drawRect(rectF2, this.f37579z);
                }
                n();
            }
            eVar = eVar3;
            path = path5;
            f6 = 0.0f;
            rectF = this.f37563j;
            rectF.set(f6, f6, canvas.getWidth(), canvas.getHeight());
            matrix2 = this.f37557c;
            canvas.getMatrix(matrix2);
            if (!matrix2.isIdentity()) {
            }
            if (!rectF2.intersect(rectF)) {
            }
            if (rectF2.width() >= 1.0f) {
            }
            if (this.f37578y) {
            }
            n();
        }
    }

    public final void i() {
        if (this.f37574u != null) {
            return;
        }
        if (this.f37573t == null) {
            this.f37574u = Collections.EMPTY_LIST;
            return;
        }
        this.f37574u = new ArrayList();
        for (AbstractC4490a abstractC4490a = this.f37573t; abstractC4490a != null; abstractC4490a = abstractC4490a.f37573t) {
            this.f37574u.add(abstractC4490a);
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f37562h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i, C4589b c4589b);

    public C4524d l() {
        return this.f37569p.f37619w;
    }

    public final boolean m() {
        Y2.e eVar = this.f37570q;
        return (eVar == null || ((ArrayList) eVar.f3963u).isEmpty()) ? false : true;
    }

    public final void n() {
        D d2 = this.f37568o.f3746n.f3669a;
        String str = this.f37569p.f37600c;
        if (d2.f3639a) {
            HashMap hashMap = d2.f3641c;
            C4594g c4594g = (C4594g) hashMap.get(str);
            if (c4594g == null) {
                c4594g = new C4594g();
                hashMap.put(str, c4594g);
            }
            int i = c4594g.f38504a + 1;
            c4594g.f38504a = i;
            if (i == Integer.MAX_VALUE) {
                c4594g.f38504a = i / 2;
            }
            if (str.equals("__container")) {
                s.f fVar = (s.f) d2.f3640b.iterator();
                if (fVar.hasNext()) {
                    fVar.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void o(AbstractC0421e abstractC0421e) {
        this.f37575v.remove(abstractC0421e);
    }

    public void q(boolean z8) {
        if (z8 && this.f37579z == null) {
            this.f37579z = new Y0.a();
        }
        this.f37578y = z8;
    }

    public void r(float f6) {
        r rVar = this.f37576w;
        AbstractC0421e abstractC0421e = rVar.f4354p;
        if (abstractC0421e != null) {
            abstractC0421e.i(f6);
        }
        AbstractC0421e abstractC0421e2 = rVar.f4360v;
        if (abstractC0421e2 != null) {
            abstractC0421e2.i(f6);
        }
        AbstractC0421e abstractC0421e3 = rVar.f4361w;
        if (abstractC0421e3 != null) {
            abstractC0421e3.i(f6);
        }
        AbstractC0421e abstractC0421e4 = rVar.f4350l;
        if (abstractC0421e4 != null) {
            abstractC0421e4.i(f6);
        }
        AbstractC0421e abstractC0421e5 = rVar.f4351m;
        if (abstractC0421e5 != null) {
            abstractC0421e5.i(f6);
        }
        AbstractC0421e abstractC0421e6 = rVar.f4352n;
        if (abstractC0421e6 != null) {
            abstractC0421e6.i(f6);
        }
        AbstractC0421e abstractC0421e7 = rVar.f4353o;
        if (abstractC0421e7 != null) {
            abstractC0421e7.i(f6);
        }
        a1.i iVar = rVar.f4355q;
        if (iVar != null) {
            iVar.i(f6);
        }
        a1.i iVar2 = rVar.f4356r;
        if (iVar2 != null) {
            iVar2.i(f6);
        }
        a1.i iVar3 = rVar.f4357s;
        if (iVar3 != null) {
            iVar3.i(f6);
        }
        a1.i iVar4 = rVar.f4358t;
        if (iVar4 != null) {
            iVar4.i(f6);
        }
        a1.i iVar5 = rVar.f4359u;
        if (iVar5 != null) {
            iVar5.i(f6);
        }
        Y2.e eVar = this.f37570q;
        int i = 0;
        if (eVar != null) {
            int i4 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) eVar.f3963u;
                if (i4 >= arrayList.size()) {
                    break;
                }
                ((AbstractC0421e) arrayList.get(i4)).i(f6);
                i4++;
            }
        }
        a1.i iVar6 = this.f37571r;
        if (iVar6 != null) {
            iVar6.i(f6);
        }
        AbstractC4490a abstractC4490a = this.f37572s;
        if (abstractC4490a != null) {
            abstractC4490a.r(f6);
        }
        while (true) {
            ArrayList arrayList2 = this.f37575v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((AbstractC0421e) arrayList2.get(i)).i(f6);
            i++;
        }
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
    }

    public void p(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
    }
}
