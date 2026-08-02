package E0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f674p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f675a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f676b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f677c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f678d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f679e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f680f;

    /* renamed from: g, reason: collision with root package name */
    public final j f681g;

    /* renamed from: h, reason: collision with root package name */
    public float f682h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f683j;

    /* renamed from: k, reason: collision with root package name */
    public float f684k;

    /* renamed from: l, reason: collision with root package name */
    public int f685l;

    /* renamed from: m, reason: collision with root package name */
    public String f686m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f687n;

    /* renamed from: o, reason: collision with root package name */
    public final s.b f688o;

    public m() {
        this.f677c = new Matrix();
        this.f682h = 0.0f;
        this.i = 0.0f;
        this.f683j = 0.0f;
        this.f684k = 0.0f;
        this.f685l = com.anythink.basead.exoplayer.k.p.f9259b;
        this.f686m = null;
        this.f687n = null;
        this.f688o = new s.b();
        this.f681g = new j();
        this.f675a = new Path();
        this.f676b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i, int i4) {
        char c9;
        float f2;
        float f9;
        int i6;
        j jVar2 = jVar;
        char c10 = 1;
        jVar2.f661a.set(matrix);
        Matrix matrix2 = jVar2.f661a;
        matrix2.preConcat(jVar2.f669j);
        canvas.save();
        char c11 = 0;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = jVar2.f662b;
            if (i9 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            k kVar = (k) arrayList.get(i9);
            if (kVar instanceof j) {
                a((j) kVar, matrix2, canvas, i, i4);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f10 = i / this.f683j;
                float f11 = i4 / this.f684k;
                float min = Math.min(f10, f11);
                Matrix matrix3 = this.f677c;
                matrix3.set(matrix2);
                matrix3.postScale(f10, f11);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c11], fArr[c10]);
                boolean z6 = c10;
                boolean z9 = c11;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f12 = (fArr[z9 ? 1 : 0] * fArr[3]) - (fArr[z6 ? 1 : 0] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f12) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f675a;
                    lVar.getClass();
                    path.reset();
                    G.i[] iVarArr = lVar.f671a;
                    if (iVarArr != null) {
                        G.i.b(iVarArr, path);
                    }
                    Path path2 = this.f676b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.f673c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f13 = iVar.i;
                        if (f13 != 0.0f || iVar.f656j != 1.0f) {
                            float f14 = iVar.f657k;
                            float f15 = (f13 + f14) % 1.0f;
                            float f16 = (iVar.f656j + f14) % 1.0f;
                            if (this.f680f == null) {
                                this.f680f = new PathMeasure();
                            }
                            this.f680f.setPath(path, z9);
                            float length = this.f680f.getLength();
                            float f17 = f15 * length;
                            float f18 = f16 * length;
                            path.reset();
                            if (f17 > f18) {
                                this.f680f.getSegment(f17, length, path, z6);
                                f2 = 0.0f;
                                this.f680f.getSegment(0.0f, f18, path, z6);
                            } else {
                                f2 = 0.0f;
                                this.f680f.getSegment(f17, f18, path, z6);
                            }
                            path.rLineTo(f2, f2);
                        }
                        path2.addPath(path, matrix3);
                        F.d dVar = iVar.f653f;
                        if ((((Shader) dVar.f918c) == null && dVar.f917b == 0) ? false : true) {
                            if (this.f679e == null) {
                                i6 = 16777215;
                                Paint paint = new Paint(1);
                                this.f679e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i6 = 16777215;
                            }
                            Paint paint2 = this.f679e;
                            Shader shader = (Shader) dVar.f918c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.f655h * 255.0f));
                                f9 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(com.anythink.basead.exoplayer.k.p.f9259b);
                                int i10 = dVar.f917b;
                                float f19 = iVar.f655h;
                                PorterDuff.Mode mode = p.f701C;
                                f9 = 255.0f;
                                paint2.setColor((i10 & i6) | (((int) (Color.alpha(i10) * f19)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.f673c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f9 = 255.0f;
                            i6 = 16777215;
                        }
                        F.d dVar2 = iVar.f651d;
                        if (((Shader) dVar2.f918c) != null || dVar2.f917b != 0) {
                            if (this.f678d == null) {
                                Paint paint3 = new Paint(1);
                                this.f678d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f678d;
                            Paint.Join join = iVar.f659m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f658l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f660n);
                            Shader shader2 = (Shader) dVar2.f918c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix3);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f654g * f9));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(com.anythink.basead.exoplayer.k.p.f9259b);
                                int i11 = dVar2.f917b;
                                float f20 = iVar.f654g;
                                PorterDuff.Mode mode2 = p.f701C;
                                paint4.setColor((i11 & i6) | (((int) (Color.alpha(i11) * f20)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f652e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                c9 = 1;
                i9++;
                jVar2 = jVar;
                c10 = c9;
                c11 = 0;
            }
            c9 = c10;
            i9++;
            jVar2 = jVar;
            c10 = c9;
            c11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f685l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f685l = i;
    }

    public m(m mVar) {
        this.f677c = new Matrix();
        this.f682h = 0.0f;
        this.i = 0.0f;
        this.f683j = 0.0f;
        this.f684k = 0.0f;
        this.f685l = com.anythink.basead.exoplayer.k.p.f9259b;
        this.f686m = null;
        this.f687n = null;
        s.b bVar = new s.b();
        this.f688o = bVar;
        this.f681g = new j(mVar.f681g, bVar);
        this.f675a = new Path(mVar.f675a);
        this.f676b = new Path(mVar.f676b);
        this.f682h = mVar.f682h;
        this.i = mVar.i;
        this.f683j = mVar.f683j;
        this.f684k = mVar.f684k;
        this.f685l = mVar.f685l;
        this.f686m = mVar.f686m;
        String str = mVar.f686m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f687n = mVar.f687n;
    }
}
