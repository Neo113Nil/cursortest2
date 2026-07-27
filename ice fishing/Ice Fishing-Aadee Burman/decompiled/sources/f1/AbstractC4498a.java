package f1;

import X0.D;
import X0.v;
import a1.AbstractC0428e;
import a1.InterfaceC0424a;
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
import com.google.android.gms.internal.ads.C2991bm;
import j1.C4597a;
import j1.C4602f;
import j1.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import u.AbstractC5049e;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4498a implements Z0.e, InterfaceC0424a, c1.f {

    /* renamed from: A, reason: collision with root package name */
    public float f37348A;

    /* renamed from: B, reason: collision with root package name */
    public BlurMaskFilter f37349B;

    /* renamed from: C, reason: collision with root package name */
    public Y0.a f37350C;

    /* renamed from: a, reason: collision with root package name */
    public final Path f37351a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f37352b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f37353c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final Y0.a f37354d = new Y0.a(1, 0);

    /* renamed from: e, reason: collision with root package name */
    public final Y0.a f37355e;

    /* renamed from: f, reason: collision with root package name */
    public final Y0.a f37356f;

    /* renamed from: g, reason: collision with root package name */
    public final Y0.a f37357g;

    /* renamed from: h, reason: collision with root package name */
    public final Y0.a f37358h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f37359j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f37360k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f37361l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f37362m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f37363n;

    /* renamed from: o, reason: collision with root package name */
    public final v f37364o;

    /* renamed from: p, reason: collision with root package name */
    public final C4501d f37365p;

    /* renamed from: q, reason: collision with root package name */
    public final Z2.e f37366q;

    /* renamed from: r, reason: collision with root package name */
    public final a1.i f37367r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC4498a f37368s;

    /* renamed from: t, reason: collision with root package name */
    public AbstractC4498a f37369t;

    /* renamed from: u, reason: collision with root package name */
    public List f37370u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f37371v;

    /* renamed from: w, reason: collision with root package name */
    public final r f37372w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f37373x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f37374y;

    /* renamed from: z, reason: collision with root package name */
    public Y0.a f37375z;

    public AbstractC4498a(v vVar, C4501d c4501d) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f37355e = new Y0.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f37356f = new Y0.a(mode2);
        Y0.a aVar = new Y0.a(1, 0);
        this.f37357g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        Y0.a aVar2 = new Y0.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f37358h = aVar2;
        this.i = new RectF();
        this.f37359j = new RectF();
        this.f37360k = new RectF();
        this.f37361l = new RectF();
        this.f37362m = new RectF();
        this.f37363n = new Matrix();
        this.f37371v = new ArrayList();
        this.f37373x = true;
        this.f37348A = 0.0f;
        this.f37364o = vVar;
        this.f37365p = c4501d;
        if (c4501d.f37413u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        d1.e eVar = c4501d.i;
        eVar.getClass();
        r rVar = new r(eVar);
        this.f37372w = rVar;
        rVar.b(this);
        List list = c4501d.f37401h;
        if (list != null && !list.isEmpty()) {
            Z2.e eVar2 = new Z2.e(list);
            this.f37366q = eVar2;
            Iterator it = ((ArrayList) eVar2.f4170u).iterator();
            while (it.hasNext()) {
                ((AbstractC0428e) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.f37366q.f4171v).iterator();
            while (it2.hasNext()) {
                AbstractC0428e abstractC0428e = (AbstractC0428e) it2.next();
                d(abstractC0428e);
                abstractC0428e.a(this);
            }
        }
        C4501d c4501d2 = this.f37365p;
        if (c4501d2.f37412t.isEmpty()) {
            if (true != this.f37373x) {
                this.f37373x = true;
                this.f37364o.invalidateSelf();
                return;
            }
            return;
        }
        a1.i iVar = new a1.i(c4501d2.f37412t);
        this.f37367r = iVar;
        iVar.f4254b = true;
        iVar.a(new q(3, this));
        boolean z3 = ((Float) this.f37367r.e()).floatValue() == 1.0f;
        if (z3 != this.f37373x) {
            this.f37373x = z3;
            this.f37364o.invalidateSelf();
        }
        d(this.f37367r);
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        this.f37364o.invalidateSelf();
    }

    @Override // Z0.e
    public void c(RectF rectF, Matrix matrix, boolean z3) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f37363n;
        matrix2.set(matrix);
        if (z3) {
            List list = this.f37370u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((AbstractC4498a) this.f37370u.get(size)).f37372w.e());
                }
            } else {
                AbstractC4498a abstractC4498a = this.f37369t;
                if (abstractC4498a != null) {
                    matrix2.preConcat(abstractC4498a.f37372w.e());
                }
            }
        }
        matrix2.preConcat(this.f37372w.e());
    }

    public final void d(AbstractC0428e abstractC0428e) {
        if (abstractC0428e == null) {
            return;
        }
        this.f37371v.add(abstractC0428e);
    }

    @Override // c1.f
    public final void e(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        AbstractC4498a abstractC4498a = this.f37368s;
        C4501d c4501d = this.f37365p;
        if (abstractC4498a != null) {
            String str = abstractC4498a.f37365p.f37396c;
            c1.e eVar3 = new c1.e(eVar2);
            eVar3.f5519a.add(str);
            if (eVar.a(i, this.f37368s.f37365p.f37396c)) {
                AbstractC4498a abstractC4498a2 = this.f37368s;
                c1.e eVar4 = new c1.e(eVar3);
                eVar4.f5520b = abstractC4498a2;
                arrayList.add(eVar4);
            }
            if (eVar.c(i, this.f37368s.f37365p.f37396c) && eVar.d(i, c4501d.f37396c)) {
                this.f37368s.p(eVar, eVar.b(i, this.f37368s.f37365p.f37396c) + i, arrayList, eVar3);
            }
        }
        if (eVar.c(i, c4501d.f37396c)) {
            String str2 = c4501d.f37396c;
            if (!"__container".equals(str2)) {
                c1.e eVar5 = new c1.e(eVar2);
                eVar5.f5519a.add(str2);
                if (eVar.a(i, str2)) {
                    c1.e eVar6 = new c1.e(eVar5);
                    eVar6.f5520b = this;
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
    public final void g(Canvas canvas, Matrix matrix, int i, C4597a c4597a) {
        Z2.e eVar;
        Path path;
        float f3;
        int i6;
        Path path2;
        RectF rectF;
        Matrix matrix2;
        Y0.a aVar;
        Z2.e eVar2;
        Path path3;
        Path path4;
        Integer num;
        if (this.f37373x) {
            C4501d c4501d = this.f37365p;
            if (c4501d.f37414v) {
                return;
            }
            i();
            Matrix matrix3 = this.f37352b;
            matrix3.reset();
            matrix3.set(matrix);
            for (int size = this.f37370u.size() - 1; size >= 0; size--) {
                matrix3.preConcat(((AbstractC4498a) this.f37370u.get(size)).f37372w.e());
            }
            r rVar = this.f37372w;
            AbstractC0428e abstractC0428e = rVar.f4305p;
            int intValue = (int) ((((i / 255.0f) * ((abstractC0428e == null || (num = (Integer) abstractC0428e.e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            boolean z3 = this.f37368s != null;
            int i9 = c4501d.f37417y;
            if (!z3 && !m() && i9 == 1) {
                matrix3.preConcat(rVar.e());
                k(canvas, matrix3, intValue, c4597a);
                n();
                return;
            }
            RectF rectF2 = this.i;
            c(rectF2, matrix3, false);
            if (this.f37368s != null && c4501d.f37413u != 3) {
                RectF rectF3 = this.f37361l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f37368s.c(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix3.preConcat(rVar.e());
            RectF rectF4 = this.f37360k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean m4 = m();
            Path path5 = this.f37351a;
            Z2.e eVar3 = this.f37366q;
            if (m4) {
                int size2 = ((List) eVar3.f4172w).size();
                int i10 = 0;
                while (i10 < size2) {
                    e1.f fVar = (e1.f) ((List) eVar3.f4172w).get(i10);
                    Path path6 = (Path) ((AbstractC0428e) ((ArrayList) eVar3.f4170u).get(i10)).e();
                    if (path6 == null) {
                        eVar = eVar3;
                    } else {
                        path5.set(path6);
                        path5.transform(matrix3);
                        int d2 = AbstractC5049e.d(fVar.f37131a);
                        eVar = eVar3;
                        if (d2 != 0) {
                            if (d2 != 1) {
                                if (d2 != 2) {
                                    if (d2 == 3) {
                                    }
                                    RectF rectF5 = this.f37362m;
                                    path5.computeBounds(rectF5, false);
                                    if (i10 != 0) {
                                        rectF4.set(rectF5);
                                    } else {
                                        i6 = size2;
                                        path2 = path5;
                                        rectF4.set(Math.min(rectF4.left, rectF5.left), Math.min(rectF4.top, rectF5.top), Math.max(rectF4.right, rectF5.right), Math.max(rectF4.bottom, rectF5.bottom));
                                        i10++;
                                        eVar3 = eVar;
                                        size2 = i6;
                                        path5 = path2;
                                    }
                                }
                            }
                        }
                        if (fVar.f37134d) {
                        }
                        RectF rectF52 = this.f37362m;
                        path5.computeBounds(rectF52, false);
                        if (i10 != 0) {
                        }
                    }
                    i6 = size2;
                    path2 = path5;
                    i10++;
                    eVar3 = eVar;
                    size2 = i6;
                    path5 = path2;
                }
                eVar = eVar3;
                path = path5;
                if (!rectF2.intersect(rectF4)) {
                    f3 = 0.0f;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    rectF = this.f37359j;
                    rectF.set(f3, f3, canvas.getWidth(), canvas.getHeight());
                    matrix2 = this.f37353c;
                    canvas.getMatrix(matrix2);
                    if (!matrix2.isIdentity()) {
                        matrix2.invert(matrix2);
                        matrix2.mapRect(rectF);
                    }
                    if (!rectF2.intersect(rectF)) {
                        rectF2.set(f3, f3, f3, f3);
                    }
                    if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                        Y0.a aVar2 = this.f37354d;
                        aVar2.setAlpha(p.f8473b);
                        int d9 = AbstractC5049e.d(i9);
                        G.h.a(aVar2, d9 == 1 ? d9 != 2 ? d9 != 3 ? d9 != 4 ? d9 != 5 ? d9 != 16 ? null : G.a.f996n : G.a.f1001y : G.a.f1000x : G.a.f999w : G.a.f998v : Build.VERSION.SDK_INT >= 29 ? G.a.f1002z : G.a.f997u);
                        Matrix matrix4 = j.f38350a;
                        canvas.saveLayer(rectF2, aVar2);
                        if (i9 == 2) {
                            j(canvas);
                        } else if (Build.VERSION.SDK_INT < 29) {
                            if (this.f37350C == null) {
                                Y0.a aVar3 = new Y0.a();
                                this.f37350C = aVar3;
                                aVar3.setColor(-1);
                            }
                            eVar2 = eVar;
                            path3 = path;
                            canvas.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.f37350C);
                            k(canvas, matrix3, intValue, c4597a);
                            if (m()) {
                                Paint paint = this.f37355e;
                                canvas.saveLayer(rectF2, paint);
                                if (Build.VERSION.SDK_INT < 28) {
                                    j(canvas);
                                }
                                int i11 = 0;
                                while (i11 < ((List) eVar2.f4172w).size()) {
                                    List list = (List) eVar2.f4172w;
                                    e1.f fVar2 = (e1.f) list.get(i11);
                                    ArrayList arrayList = (ArrayList) eVar2.f4170u;
                                    AbstractC0428e abstractC0428e2 = (AbstractC0428e) arrayList.get(i11);
                                    AbstractC0428e abstractC0428e3 = (AbstractC0428e) ((ArrayList) eVar2.f4171v).get(i11);
                                    int d10 = AbstractC5049e.d(fVar2.f37131a);
                                    int i12 = i11;
                                    Paint paint2 = this.f37356f;
                                    boolean z6 = fVar2.f37134d;
                                    if (d10 == 0) {
                                        path4 = path3;
                                        if (z6) {
                                            Matrix matrix5 = j.f38350a;
                                            canvas.saveLayer(rectF2, aVar2);
                                            canvas.drawRect(rectF2, aVar2);
                                            path4.set((Path) abstractC0428e2.e());
                                            path4.transform(matrix3);
                                            aVar2.setAlpha((int) (((Integer) abstractC0428e3.e()).intValue() * 2.55f));
                                            canvas.drawPath(path4, paint2);
                                            canvas.restore();
                                        } else {
                                            path4.set((Path) abstractC0428e2.e());
                                            path4.transform(matrix3);
                                            aVar2.setAlpha((int) (((Integer) abstractC0428e3.e()).intValue() * 2.55f));
                                            canvas.drawPath(path4, aVar2);
                                        }
                                    } else if (d10 == 1) {
                                        path4 = path3;
                                        if (i12 == 0) {
                                            aVar2.setColor(-16777216);
                                            aVar2.setAlpha(p.f8473b);
                                            canvas.drawRect(rectF2, aVar2);
                                        }
                                        if (z6) {
                                            Matrix matrix6 = j.f38350a;
                                            canvas.saveLayer(rectF2, paint2);
                                            canvas.drawRect(rectF2, aVar2);
                                            paint2.setAlpha((int) (((Integer) abstractC0428e3.e()).intValue() * 2.55f));
                                            path4.set((Path) abstractC0428e2.e());
                                            path4.transform(matrix3);
                                            canvas.drawPath(path4, paint2);
                                            canvas.restore();
                                        } else {
                                            path4.set((Path) abstractC0428e2.e());
                                            path4.transform(matrix3);
                                            canvas.drawPath(path4, paint2);
                                        }
                                    } else if (d10 != 2) {
                                        if (d10 != 3) {
                                            path4 = path3;
                                        } else {
                                            if (!arrayList.isEmpty()) {
                                                int i13 = 0;
                                                while (true) {
                                                    if (i13 >= list.size()) {
                                                        aVar2.setAlpha(p.f8473b);
                                                        canvas.drawRect(rectF2, aVar2);
                                                        break;
                                                    } else if (((e1.f) list.get(i13)).f37131a != 4) {
                                                        break;
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            }
                                            path4 = path3;
                                        }
                                    } else if (z6) {
                                        Matrix matrix7 = j.f38350a;
                                        canvas.saveLayer(rectF2, paint);
                                        canvas.drawRect(rectF2, aVar2);
                                        paint2.setAlpha((int) (((Integer) abstractC0428e3.e()).intValue() * 2.55f));
                                        path4 = path3;
                                        path4.set((Path) abstractC0428e2.e());
                                        path4.transform(matrix3);
                                        canvas.drawPath(path4, paint2);
                                        canvas.restore();
                                    } else {
                                        path4 = path3;
                                        Matrix matrix8 = j.f38350a;
                                        canvas.saveLayer(rectF2, paint);
                                        path4.set((Path) abstractC0428e2.e());
                                        path4.transform(matrix3);
                                        aVar2.setAlpha((int) (((Integer) abstractC0428e3.e()).intValue() * 2.55f));
                                        canvas.drawPath(path4, aVar2);
                                        canvas.restore();
                                    }
                                    i11 = i12 + 1;
                                    path3 = path4;
                                }
                                canvas.restore();
                            }
                            if (this.f37368s != null) {
                                canvas.saveLayer(rectF2, this.f37357g);
                                j(canvas);
                                this.f37368s.g(canvas, matrix, i, null);
                                canvas.restore();
                            }
                            canvas.restore();
                        }
                        eVar2 = eVar;
                        path3 = path;
                        k(canvas, matrix3, intValue, c4597a);
                        if (m()) {
                        }
                        if (this.f37368s != null) {
                        }
                        canvas.restore();
                    }
                    if (this.f37374y && (aVar = this.f37375z) != null) {
                        aVar.setStyle(Paint.Style.STROKE);
                        this.f37375z.setColor(-251901);
                        this.f37375z.setStrokeWidth(4.0f);
                        canvas.drawRect(rectF2, this.f37375z);
                        this.f37375z.setStyle(Paint.Style.FILL);
                        this.f37375z.setColor(1357638635);
                        canvas.drawRect(rectF2, this.f37375z);
                    }
                    n();
                }
                f3 = 0.0f;
                rectF = this.f37359j;
                rectF.set(f3, f3, canvas.getWidth(), canvas.getHeight());
                matrix2 = this.f37353c;
                canvas.getMatrix(matrix2);
                if (!matrix2.isIdentity()) {
                }
                if (!rectF2.intersect(rectF)) {
                }
                if (rectF2.width() >= 1.0f) {
                    Y0.a aVar22 = this.f37354d;
                    aVar22.setAlpha(p.f8473b);
                    int d92 = AbstractC5049e.d(i9);
                    G.h.a(aVar22, d92 == 1 ? d92 != 2 ? d92 != 3 ? d92 != 4 ? d92 != 5 ? d92 != 16 ? null : G.a.f996n : G.a.f1001y : G.a.f1000x : G.a.f999w : G.a.f998v : Build.VERSION.SDK_INT >= 29 ? G.a.f1002z : G.a.f997u);
                    Matrix matrix42 = j.f38350a;
                    canvas.saveLayer(rectF2, aVar22);
                    if (i9 == 2) {
                    }
                    eVar2 = eVar;
                    path3 = path;
                    k(canvas, matrix3, intValue, c4597a);
                    if (m()) {
                    }
                    if (this.f37368s != null) {
                    }
                    canvas.restore();
                }
                if (this.f37374y) {
                    aVar.setStyle(Paint.Style.STROKE);
                    this.f37375z.setColor(-251901);
                    this.f37375z.setStrokeWidth(4.0f);
                    canvas.drawRect(rectF2, this.f37375z);
                    this.f37375z.setStyle(Paint.Style.FILL);
                    this.f37375z.setColor(1357638635);
                    canvas.drawRect(rectF2, this.f37375z);
                }
                n();
            }
            eVar = eVar3;
            path = path5;
            f3 = 0.0f;
            rectF = this.f37359j;
            rectF.set(f3, f3, canvas.getWidth(), canvas.getHeight());
            matrix2 = this.f37353c;
            canvas.getMatrix(matrix2);
            if (!matrix2.isIdentity()) {
            }
            if (!rectF2.intersect(rectF)) {
            }
            if (rectF2.width() >= 1.0f) {
            }
            if (this.f37374y) {
            }
            n();
        }
    }

    @Override // c1.f
    public void h(ColorFilter colorFilter, C2991bm c2991bm) {
        this.f37372w.c(colorFilter, c2991bm);
    }

    public final void i() {
        if (this.f37370u != null) {
            return;
        }
        if (this.f37369t == null) {
            this.f37370u = Collections.EMPTY_LIST;
            return;
        }
        this.f37370u = new ArrayList();
        for (AbstractC4498a abstractC4498a = this.f37369t; abstractC4498a != null; abstractC4498a = abstractC4498a.f37369t) {
            this.f37370u.add(abstractC4498a);
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f37358h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i, C4597a c4597a);

    public F1.a l() {
        return this.f37365p.f37415w;
    }

    public final boolean m() {
        Z2.e eVar = this.f37366q;
        return (eVar == null || ((ArrayList) eVar.f4170u).isEmpty()) ? false : true;
    }

    public final void n() {
        D d2 = this.f37364o.f3690n.f3613a;
        String str = this.f37365p.f37396c;
        if (d2.f3583a) {
            HashMap hashMap = d2.f3585c;
            C4602f c4602f = (C4602f) hashMap.get(str);
            if (c4602f == null) {
                c4602f = new C4602f();
                hashMap.put(str, c4602f);
            }
            int i = c4602f.f38321a + 1;
            c4602f.f38321a = i;
            if (i == Integer.MAX_VALUE) {
                c4602f.f38321a = i / 2;
            }
            if (str.equals("__container")) {
                s.f fVar = (s.f) d2.f3584b.iterator();
                if (fVar.hasNext()) {
                    fVar.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void o(AbstractC0428e abstractC0428e) {
        this.f37371v.remove(abstractC0428e);
    }

    public void q(boolean z3) {
        if (z3 && this.f37375z == null) {
            this.f37375z = new Y0.a();
        }
        this.f37374y = z3;
    }

    public void r(float f3) {
        r rVar = this.f37372w;
        AbstractC0428e abstractC0428e = rVar.f4305p;
        if (abstractC0428e != null) {
            abstractC0428e.i(f3);
        }
        AbstractC0428e abstractC0428e2 = rVar.f4311v;
        if (abstractC0428e2 != null) {
            abstractC0428e2.i(f3);
        }
        AbstractC0428e abstractC0428e3 = rVar.f4312w;
        if (abstractC0428e3 != null) {
            abstractC0428e3.i(f3);
        }
        AbstractC0428e abstractC0428e4 = rVar.f4301l;
        if (abstractC0428e4 != null) {
            abstractC0428e4.i(f3);
        }
        AbstractC0428e abstractC0428e5 = rVar.f4302m;
        if (abstractC0428e5 != null) {
            abstractC0428e5.i(f3);
        }
        AbstractC0428e abstractC0428e6 = rVar.f4303n;
        if (abstractC0428e6 != null) {
            abstractC0428e6.i(f3);
        }
        AbstractC0428e abstractC0428e7 = rVar.f4304o;
        if (abstractC0428e7 != null) {
            abstractC0428e7.i(f3);
        }
        a1.i iVar = rVar.f4306q;
        if (iVar != null) {
            iVar.i(f3);
        }
        a1.i iVar2 = rVar.f4307r;
        if (iVar2 != null) {
            iVar2.i(f3);
        }
        a1.i iVar3 = rVar.f4308s;
        if (iVar3 != null) {
            iVar3.i(f3);
        }
        a1.i iVar4 = rVar.f4309t;
        if (iVar4 != null) {
            iVar4.i(f3);
        }
        a1.i iVar5 = rVar.f4310u;
        if (iVar5 != null) {
            iVar5.i(f3);
        }
        Z2.e eVar = this.f37366q;
        int i = 0;
        if (eVar != null) {
            int i6 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) eVar.f4170u;
                if (i6 >= arrayList.size()) {
                    break;
                }
                ((AbstractC0428e) arrayList.get(i6)).i(f3);
                i6++;
            }
        }
        a1.i iVar6 = this.f37367r;
        if (iVar6 != null) {
            iVar6.i(f3);
        }
        AbstractC4498a abstractC4498a = this.f37368s;
        if (abstractC4498a != null) {
            abstractC4498a.r(f3);
        }
        while (true) {
            ArrayList arrayList2 = this.f37371v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((AbstractC0428e) arrayList2.get(i)).i(f3);
            i++;
        }
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
    }

    public void p(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
    }
}
