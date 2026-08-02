package h1;

import Z0.D;
import Z0.v;
import a1.C0428a;
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
import b1.InterfaceC0521e;
import c1.AbstractC0545e;
import c1.InterfaceC0541a;
import c1.q;
import c1.r;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.LP;
import i1.C4586c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l1.C4666a;
import l1.C4671f;
import u.AbstractC5050e;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4563a implements InterfaceC0521e, InterfaceC0541a, e1.f {

    /* renamed from: A, reason: collision with root package name */
    public float f37972A;

    /* renamed from: B, reason: collision with root package name */
    public BlurMaskFilter f37973B;

    /* renamed from: C, reason: collision with root package name */
    public C0428a f37974C;

    /* renamed from: a, reason: collision with root package name */
    public final Path f37975a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f37976b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f37977c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final C0428a f37978d = new C0428a(1, 0);

    /* renamed from: e, reason: collision with root package name */
    public final C0428a f37979e;

    /* renamed from: f, reason: collision with root package name */
    public final C0428a f37980f;

    /* renamed from: g, reason: collision with root package name */
    public final C0428a f37981g;

    /* renamed from: h, reason: collision with root package name */
    public final C0428a f37982h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f37983j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f37984k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f37985l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f37986m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f37987n;

    /* renamed from: o, reason: collision with root package name */
    public final v f37988o;

    /* renamed from: p, reason: collision with root package name */
    public final C4566d f37989p;

    /* renamed from: q, reason: collision with root package name */
    public final b3.e f37990q;

    /* renamed from: r, reason: collision with root package name */
    public final c1.i f37991r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC4563a f37992s;

    /* renamed from: t, reason: collision with root package name */
    public AbstractC4563a f37993t;

    /* renamed from: u, reason: collision with root package name */
    public List f37994u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f37995v;

    /* renamed from: w, reason: collision with root package name */
    public final r f37996w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f37997x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f37998y;

    /* renamed from: z, reason: collision with root package name */
    public C0428a f37999z;

    public AbstractC4563a(v vVar, C4566d c4566d) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f37979e = new C0428a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f37980f = new C0428a(mode2);
        C0428a c0428a = new C0428a(1, 0);
        this.f37981g = c0428a;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        C0428a c0428a2 = new C0428a();
        c0428a2.setXfermode(new PorterDuffXfermode(mode3));
        this.f37982h = c0428a2;
        this.i = new RectF();
        this.f37983j = new RectF();
        this.f37984k = new RectF();
        this.f37985l = new RectF();
        this.f37986m = new RectF();
        this.f37987n = new Matrix();
        this.f37995v = new ArrayList();
        this.f37997x = true;
        this.f37972A = 0.0f;
        this.f37988o = vVar;
        this.f37989p = c4566d;
        if (c4566d.f38037u == 3) {
            c0428a.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c0428a.setXfermode(new PorterDuffXfermode(mode));
        }
        f1.d dVar = c4566d.i;
        dVar.getClass();
        r rVar = new r(dVar);
        this.f37996w = rVar;
        rVar.b(this);
        List list = c4566d.f38025h;
        if (list != null && !list.isEmpty()) {
            b3.e eVar = new b3.e(list);
            this.f37990q = eVar;
            Iterator it = ((ArrayList) eVar.f5557u).iterator();
            while (it.hasNext()) {
                ((AbstractC0545e) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.f37990q.f5558v).iterator();
            while (it2.hasNext()) {
                AbstractC0545e abstractC0545e = (AbstractC0545e) it2.next();
                f(abstractC0545e);
                abstractC0545e.a(this);
            }
        }
        C4566d c4566d2 = this.f37989p;
        if (c4566d2.f38036t.isEmpty()) {
            if (true != this.f37997x) {
                this.f37997x = true;
                this.f37988o.invalidateSelf();
                return;
            }
            return;
        }
        c1.i iVar = new c1.i(c4566d2.f38036t);
        this.f37991r = iVar;
        iVar.f5649b = true;
        iVar.a(new q(3, this));
        boolean z6 = ((Float) this.f37991r.e()).floatValue() == 1.0f;
        if (z6 != this.f37997x) {
            this.f37997x = z6;
            this.f37988o.invalidateSelf();
        }
        f(this.f37991r);
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        this.f37988o.invalidateSelf();
    }

    @Override // e1.f
    public final void c(e1.e eVar, int i, ArrayList arrayList, e1.e eVar2) {
        AbstractC4563a abstractC4563a = this.f37992s;
        C4566d c4566d = this.f37989p;
        if (abstractC4563a != null) {
            String str = abstractC4563a.f37989p.f38020c;
            e1.e eVar3 = new e1.e(eVar2);
            eVar3.f37237a.add(str);
            if (eVar.a(i, this.f37992s.f37989p.f38020c)) {
                AbstractC4563a abstractC4563a2 = this.f37992s;
                e1.e eVar4 = new e1.e(eVar3);
                eVar4.f37238b = abstractC4563a2;
                arrayList.add(eVar4);
            }
            if (eVar.c(i, this.f37992s.f37989p.f38020c) && eVar.d(i, c4566d.f38020c)) {
                this.f37992s.p(eVar, eVar.b(i, this.f37992s.f37989p.f38020c) + i, arrayList, eVar3);
            }
        }
        if (eVar.c(i, c4566d.f38020c)) {
            String str2 = c4566d.f38020c;
            if (!"__container".equals(str2)) {
                e1.e eVar5 = new e1.e(eVar2);
                eVar5.f37237a.add(str2);
                if (eVar.a(i, str2)) {
                    e1.e eVar6 = new e1.e(eVar5);
                    eVar6.f37238b = this;
                    arrayList.add(eVar6);
                }
                eVar2 = eVar5;
            }
            if (eVar.d(i, str2)) {
                p(eVar, eVar.b(i, str2) + i, arrayList, eVar2);
            }
        }
    }

    @Override // e1.f
    public void d(ColorFilter colorFilter, LP lp) {
        this.f37996w.c(colorFilter, lp);
    }

    @Override // b1.InterfaceC0521e
    public void e(RectF rectF, Matrix matrix, boolean z6) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f37987n;
        matrix2.set(matrix);
        if (z6) {
            List list = this.f37994u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((AbstractC4563a) this.f37994u.get(size)).f37996w.e());
                }
            } else {
                AbstractC4563a abstractC4563a = this.f37993t;
                if (abstractC4563a != null) {
                    matrix2.preConcat(abstractC4563a.f37996w.e());
                }
            }
        }
        matrix2.preConcat(this.f37996w.e());
    }

    public final void f(AbstractC0545e abstractC0545e) {
        if (abstractC0545e == null) {
            return;
        }
        this.f37995v.add(abstractC0545e);
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
    @Override // b1.InterfaceC0521e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        b3.e eVar;
        Path path;
        float f2;
        int i4;
        Path path2;
        RectF rectF;
        Matrix matrix2;
        C0428a c0428a;
        b3.e eVar2;
        Path path3;
        Path path4;
        Integer num;
        if (this.f37997x) {
            C4566d c4566d = this.f37989p;
            if (c4566d.f38038v) {
                return;
            }
            i();
            Matrix matrix3 = this.f37976b;
            matrix3.reset();
            matrix3.set(matrix);
            for (int size = this.f37994u.size() - 1; size >= 0; size--) {
                matrix3.preConcat(((AbstractC4563a) this.f37994u.get(size)).f37996w.e());
            }
            r rVar = this.f37996w;
            AbstractC0545e abstractC0545e = rVar.f5700p;
            int intValue = (int) ((((i / 255.0f) * ((abstractC0545e == null || (num = (Integer) abstractC0545e.e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            boolean z6 = this.f37992s != null;
            int i6 = c4566d.f38041y;
            if (!z6 && !m() && i6 == 1) {
                matrix3.preConcat(rVar.e());
                k(canvas, matrix3, intValue, c4666a);
                n();
                return;
            }
            RectF rectF2 = this.i;
            e(rectF2, matrix3, false);
            if (this.f37992s != null && c4566d.f38037u != 3) {
                RectF rectF3 = this.f37985l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f37992s.e(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix3.preConcat(rVar.e());
            RectF rectF4 = this.f37984k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean m9 = m();
            Path path5 = this.f37975a;
            b3.e eVar3 = this.f37990q;
            if (m9) {
                int size2 = ((List) eVar3.f5559w).size();
                int i9 = 0;
                while (i9 < size2) {
                    g1.f fVar = (g1.f) ((List) eVar3.f5559w).get(i9);
                    Path path6 = (Path) ((AbstractC0545e) ((ArrayList) eVar3.f5557u).get(i9)).e();
                    if (path6 == null) {
                        eVar = eVar3;
                    } else {
                        path5.set(path6);
                        path5.transform(matrix3);
                        int d9 = AbstractC5050e.d(fVar.f37607a);
                        eVar = eVar3;
                        if (d9 != 0) {
                            if (d9 != 1) {
                                if (d9 != 2) {
                                    if (d9 == 3) {
                                    }
                                    RectF rectF5 = this.f37986m;
                                    path5.computeBounds(rectF5, false);
                                    if (i9 != 0) {
                                        rectF4.set(rectF5);
                                    } else {
                                        i4 = size2;
                                        path2 = path5;
                                        rectF4.set(Math.min(rectF4.left, rectF5.left), Math.min(rectF4.top, rectF5.top), Math.max(rectF4.right, rectF5.right), Math.max(rectF4.bottom, rectF5.bottom));
                                        i9++;
                                        eVar3 = eVar;
                                        size2 = i4;
                                        path5 = path2;
                                    }
                                }
                            }
                        }
                        if (fVar.f37610d) {
                        }
                        RectF rectF52 = this.f37986m;
                        path5.computeBounds(rectF52, false);
                        if (i9 != 0) {
                        }
                    }
                    i4 = size2;
                    path2 = path5;
                    i9++;
                    eVar3 = eVar;
                    size2 = i4;
                    path5 = path2;
                }
                eVar = eVar3;
                path = path5;
                if (!rectF2.intersect(rectF4)) {
                    f2 = 0.0f;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    rectF = this.f37983j;
                    rectF.set(f2, f2, canvas.getWidth(), canvas.getHeight());
                    matrix2 = this.f37977c;
                    canvas.getMatrix(matrix2);
                    if (!matrix2.isIdentity()) {
                        matrix2.invert(matrix2);
                        matrix2.mapRect(rectF);
                    }
                    if (!rectF2.intersect(rectF)) {
                        rectF2.set(f2, f2, f2, f2);
                    }
                    if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                        C0428a c0428a2 = this.f37978d;
                        c0428a2.setAlpha(p.f9259b);
                        int d10 = AbstractC5050e.d(i6);
                        G.h.a(c0428a2, d10 == 1 ? d10 != 2 ? d10 != 3 ? d10 != 4 ? d10 != 5 ? d10 != 16 ? null : G.a.f1022n : G.a.f1027y : G.a.f1026x : G.a.f1025w : G.a.f1024v : Build.VERSION.SDK_INT >= 29 ? G.a.f1028z : G.a.f1023u);
                        Matrix matrix4 = l1.i.f38862a;
                        canvas.saveLayer(rectF2, c0428a2);
                        if (i6 == 2) {
                            j(canvas);
                        } else if (Build.VERSION.SDK_INT < 29) {
                            if (this.f37974C == null) {
                                C0428a c0428a3 = new C0428a();
                                this.f37974C = c0428a3;
                                c0428a3.setColor(-1);
                            }
                            eVar2 = eVar;
                            path3 = path;
                            canvas.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.f37974C);
                            k(canvas, matrix3, intValue, c4666a);
                            if (m()) {
                                Paint paint = this.f37979e;
                                canvas.saveLayer(rectF2, paint);
                                if (Build.VERSION.SDK_INT < 28) {
                                    j(canvas);
                                }
                                int i10 = 0;
                                while (i10 < ((List) eVar2.f5559w).size()) {
                                    List list = (List) eVar2.f5559w;
                                    g1.f fVar2 = (g1.f) list.get(i10);
                                    ArrayList arrayList = (ArrayList) eVar2.f5557u;
                                    AbstractC0545e abstractC0545e2 = (AbstractC0545e) arrayList.get(i10);
                                    AbstractC0545e abstractC0545e3 = (AbstractC0545e) ((ArrayList) eVar2.f5558v).get(i10);
                                    int d11 = AbstractC5050e.d(fVar2.f37607a);
                                    int i11 = i10;
                                    Paint paint2 = this.f37980f;
                                    boolean z9 = fVar2.f37610d;
                                    if (d11 == 0) {
                                        path4 = path3;
                                        if (z9) {
                                            Matrix matrix5 = l1.i.f38862a;
                                            canvas.saveLayer(rectF2, c0428a2);
                                            canvas.drawRect(rectF2, c0428a2);
                                            path4.set((Path) abstractC0545e2.e());
                                            path4.transform(matrix3);
                                            c0428a2.setAlpha((int) (((Integer) abstractC0545e3.e()).intValue() * 2.55f));
                                            canvas.drawPath(path4, paint2);
                                            canvas.restore();
                                        } else {
                                            path4.set((Path) abstractC0545e2.e());
                                            path4.transform(matrix3);
                                            c0428a2.setAlpha((int) (((Integer) abstractC0545e3.e()).intValue() * 2.55f));
                                            canvas.drawPath(path4, c0428a2);
                                        }
                                    } else if (d11 == 1) {
                                        path4 = path3;
                                        if (i11 == 0) {
                                            c0428a2.setColor(-16777216);
                                            c0428a2.setAlpha(p.f9259b);
                                            canvas.drawRect(rectF2, c0428a2);
                                        }
                                        if (z9) {
                                            Matrix matrix6 = l1.i.f38862a;
                                            canvas.saveLayer(rectF2, paint2);
                                            canvas.drawRect(rectF2, c0428a2);
                                            paint2.setAlpha((int) (((Integer) abstractC0545e3.e()).intValue() * 2.55f));
                                            path4.set((Path) abstractC0545e2.e());
                                            path4.transform(matrix3);
                                            canvas.drawPath(path4, paint2);
                                            canvas.restore();
                                        } else {
                                            path4.set((Path) abstractC0545e2.e());
                                            path4.transform(matrix3);
                                            canvas.drawPath(path4, paint2);
                                        }
                                    } else if (d11 != 2) {
                                        if (d11 != 3) {
                                            path4 = path3;
                                        } else {
                                            if (!arrayList.isEmpty()) {
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 >= list.size()) {
                                                        c0428a2.setAlpha(p.f9259b);
                                                        canvas.drawRect(rectF2, c0428a2);
                                                        break;
                                                    } else if (((g1.f) list.get(i12)).f37607a != 4) {
                                                        break;
                                                    } else {
                                                        i12++;
                                                    }
                                                }
                                            }
                                            path4 = path3;
                                        }
                                    } else if (z9) {
                                        Matrix matrix7 = l1.i.f38862a;
                                        canvas.saveLayer(rectF2, paint);
                                        canvas.drawRect(rectF2, c0428a2);
                                        paint2.setAlpha((int) (((Integer) abstractC0545e3.e()).intValue() * 2.55f));
                                        path4 = path3;
                                        path4.set((Path) abstractC0545e2.e());
                                        path4.transform(matrix3);
                                        canvas.drawPath(path4, paint2);
                                        canvas.restore();
                                    } else {
                                        path4 = path3;
                                        Matrix matrix8 = l1.i.f38862a;
                                        canvas.saveLayer(rectF2, paint);
                                        path4.set((Path) abstractC0545e2.e());
                                        path4.transform(matrix3);
                                        c0428a2.setAlpha((int) (((Integer) abstractC0545e3.e()).intValue() * 2.55f));
                                        canvas.drawPath(path4, c0428a2);
                                        canvas.restore();
                                    }
                                    i10 = i11 + 1;
                                    path3 = path4;
                                }
                                canvas.restore();
                            }
                            if (this.f37992s != null) {
                                canvas.saveLayer(rectF2, this.f37981g);
                                j(canvas);
                                this.f37992s.h(canvas, matrix, i, null);
                                canvas.restore();
                            }
                            canvas.restore();
                        }
                        eVar2 = eVar;
                        path3 = path;
                        k(canvas, matrix3, intValue, c4666a);
                        if (m()) {
                        }
                        if (this.f37992s != null) {
                        }
                        canvas.restore();
                    }
                    if (this.f37998y && (c0428a = this.f37999z) != null) {
                        c0428a.setStyle(Paint.Style.STROKE);
                        this.f37999z.setColor(-251901);
                        this.f37999z.setStrokeWidth(4.0f);
                        canvas.drawRect(rectF2, this.f37999z);
                        this.f37999z.setStyle(Paint.Style.FILL);
                        this.f37999z.setColor(1357638635);
                        canvas.drawRect(rectF2, this.f37999z);
                    }
                    n();
                }
                f2 = 0.0f;
                rectF = this.f37983j;
                rectF.set(f2, f2, canvas.getWidth(), canvas.getHeight());
                matrix2 = this.f37977c;
                canvas.getMatrix(matrix2);
                if (!matrix2.isIdentity()) {
                }
                if (!rectF2.intersect(rectF)) {
                }
                if (rectF2.width() >= 1.0f) {
                    C0428a c0428a22 = this.f37978d;
                    c0428a22.setAlpha(p.f9259b);
                    int d102 = AbstractC5050e.d(i6);
                    G.h.a(c0428a22, d102 == 1 ? d102 != 2 ? d102 != 3 ? d102 != 4 ? d102 != 5 ? d102 != 16 ? null : G.a.f1022n : G.a.f1027y : G.a.f1026x : G.a.f1025w : G.a.f1024v : Build.VERSION.SDK_INT >= 29 ? G.a.f1028z : G.a.f1023u);
                    Matrix matrix42 = l1.i.f38862a;
                    canvas.saveLayer(rectF2, c0428a22);
                    if (i6 == 2) {
                    }
                    eVar2 = eVar;
                    path3 = path;
                    k(canvas, matrix3, intValue, c4666a);
                    if (m()) {
                    }
                    if (this.f37992s != null) {
                    }
                    canvas.restore();
                }
                if (this.f37998y) {
                    c0428a.setStyle(Paint.Style.STROKE);
                    this.f37999z.setColor(-251901);
                    this.f37999z.setStrokeWidth(4.0f);
                    canvas.drawRect(rectF2, this.f37999z);
                    this.f37999z.setStyle(Paint.Style.FILL);
                    this.f37999z.setColor(1357638635);
                    canvas.drawRect(rectF2, this.f37999z);
                }
                n();
            }
            eVar = eVar3;
            path = path5;
            f2 = 0.0f;
            rectF = this.f37983j;
            rectF.set(f2, f2, canvas.getWidth(), canvas.getHeight());
            matrix2 = this.f37977c;
            canvas.getMatrix(matrix2);
            if (!matrix2.isIdentity()) {
            }
            if (!rectF2.intersect(rectF)) {
            }
            if (rectF2.width() >= 1.0f) {
            }
            if (this.f37998y) {
            }
            n();
        }
    }

    public final void i() {
        if (this.f37994u != null) {
            return;
        }
        if (this.f37993t == null) {
            this.f37994u = Collections.EMPTY_LIST;
            return;
        }
        this.f37994u = new ArrayList();
        for (AbstractC4563a abstractC4563a = this.f37993t; abstractC4563a != null; abstractC4563a = abstractC4563a.f37993t) {
            this.f37994u.add(abstractC4563a);
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f37982h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i, C4666a c4666a);

    public C4586c l() {
        return this.f37989p.f38039w;
    }

    public final boolean m() {
        b3.e eVar = this.f37990q;
        return (eVar == null || ((ArrayList) eVar.f5557u).isEmpty()) ? false : true;
    }

    public final void n() {
        D d9 = this.f37988o.f4046n.f3965a;
        String str = this.f37989p.f38020c;
        if (d9.f3935a) {
            HashMap hashMap = d9.f3937c;
            C4671f c4671f = (C4671f) hashMap.get(str);
            if (c4671f == null) {
                c4671f = new C4671f();
                hashMap.put(str, c4671f);
            }
            int i = c4671f.f38833a + 1;
            c4671f.f38833a = i;
            if (i == Integer.MAX_VALUE) {
                c4671f.f38833a = i / 2;
            }
            if (str.equals("__container")) {
                s.f fVar = (s.f) d9.f3936b.iterator();
                if (fVar.hasNext()) {
                    fVar.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void o(AbstractC0545e abstractC0545e) {
        this.f37995v.remove(abstractC0545e);
    }

    public void q(boolean z6) {
        if (z6 && this.f37999z == null) {
            this.f37999z = new C0428a();
        }
        this.f37998y = z6;
    }

    public void r(float f2) {
        r rVar = this.f37996w;
        AbstractC0545e abstractC0545e = rVar.f5700p;
        if (abstractC0545e != null) {
            abstractC0545e.i(f2);
        }
        AbstractC0545e abstractC0545e2 = rVar.f5706v;
        if (abstractC0545e2 != null) {
            abstractC0545e2.i(f2);
        }
        AbstractC0545e abstractC0545e3 = rVar.f5707w;
        if (abstractC0545e3 != null) {
            abstractC0545e3.i(f2);
        }
        AbstractC0545e abstractC0545e4 = rVar.f5696l;
        if (abstractC0545e4 != null) {
            abstractC0545e4.i(f2);
        }
        AbstractC0545e abstractC0545e5 = rVar.f5697m;
        if (abstractC0545e5 != null) {
            abstractC0545e5.i(f2);
        }
        AbstractC0545e abstractC0545e6 = rVar.f5698n;
        if (abstractC0545e6 != null) {
            abstractC0545e6.i(f2);
        }
        AbstractC0545e abstractC0545e7 = rVar.f5699o;
        if (abstractC0545e7 != null) {
            abstractC0545e7.i(f2);
        }
        c1.i iVar = rVar.f5701q;
        if (iVar != null) {
            iVar.i(f2);
        }
        c1.i iVar2 = rVar.f5702r;
        if (iVar2 != null) {
            iVar2.i(f2);
        }
        c1.i iVar3 = rVar.f5703s;
        if (iVar3 != null) {
            iVar3.i(f2);
        }
        c1.i iVar4 = rVar.f5704t;
        if (iVar4 != null) {
            iVar4.i(f2);
        }
        c1.i iVar5 = rVar.f5705u;
        if (iVar5 != null) {
            iVar5.i(f2);
        }
        b3.e eVar = this.f37990q;
        int i = 0;
        if (eVar != null) {
            int i4 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) eVar.f5557u;
                if (i4 >= arrayList.size()) {
                    break;
                }
                ((AbstractC0545e) arrayList.get(i4)).i(f2);
                i4++;
            }
        }
        c1.i iVar6 = this.f37991r;
        if (iVar6 != null) {
            iVar6.i(f2);
        }
        AbstractC4563a abstractC4563a = this.f37992s;
        if (abstractC4563a != null) {
            abstractC4563a.r(f2);
        }
        while (true) {
            ArrayList arrayList2 = this.f37995v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((AbstractC0545e) arrayList2.get(i)).i(f2);
            i++;
        }
    }

    @Override // b1.InterfaceC0519c
    public final void b(List list, List list2) {
    }

    public void p(e1.e eVar, int i, ArrayList arrayList, e1.e eVar2) {
    }
}
