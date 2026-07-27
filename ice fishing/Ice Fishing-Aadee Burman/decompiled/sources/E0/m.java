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
    public static final Matrix f694p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f695a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f696b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f697c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f698d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f699e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f700f;

    /* renamed from: g, reason: collision with root package name */
    public final j f701g;

    /* renamed from: h, reason: collision with root package name */
    public float f702h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f703j;

    /* renamed from: k, reason: collision with root package name */
    public float f704k;

    /* renamed from: l, reason: collision with root package name */
    public int f705l;

    /* renamed from: m, reason: collision with root package name */
    public String f706m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f707n;

    /* renamed from: o, reason: collision with root package name */
    public final s.b f708o;

    public m() {
        this.f697c = new Matrix();
        this.f702h = 0.0f;
        this.i = 0.0f;
        this.f703j = 0.0f;
        this.f704k = 0.0f;
        this.f705l = com.anythink.basead.exoplayer.k.p.f8473b;
        this.f706m = null;
        this.f707n = null;
        this.f708o = new s.b();
        this.f701g = new j();
        this.f695a = new Path();
        this.f696b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i, int i6) {
        char c9;
        float f3;
        float f9;
        int i9;
        j jVar2 = jVar;
        char c10 = 1;
        jVar2.f681a.set(matrix);
        Matrix matrix2 = jVar2.f681a;
        matrix2.preConcat(jVar2.f689j);
        canvas.save();
        char c11 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = jVar2.f682b;
            if (i10 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            k kVar = (k) arrayList.get(i10);
            if (kVar instanceof j) {
                a((j) kVar, matrix2, canvas, i, i6);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f10 = i / this.f703j;
                float f11 = i6 / this.f704k;
                float min = Math.min(f10, f11);
                Matrix matrix3 = this.f697c;
                matrix3.set(matrix2);
                matrix3.postScale(f10, f11);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c11], fArr[c10]);
                boolean z3 = c10;
                boolean z6 = c11;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f12 = (fArr[z6 ? 1 : 0] * fArr[3]) - (fArr[z3 ? 1 : 0] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f12) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f695a;
                    lVar.getClass();
                    path.reset();
                    G.i[] iVarArr = lVar.f691a;
                    if (iVarArr != null) {
                        G.i.b(iVarArr, path);
                    }
                    Path path2 = this.f696b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.f693c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f13 = iVar.i;
                        if (f13 != 0.0f || iVar.f676j != 1.0f) {
                            float f14 = iVar.f677k;
                            float f15 = (f13 + f14) % 1.0f;
                            float f16 = (iVar.f676j + f14) % 1.0f;
                            if (this.f700f == null) {
                                this.f700f = new PathMeasure();
                            }
                            this.f700f.setPath(path, z6);
                            float length = this.f700f.getLength();
                            float f17 = f15 * length;
                            float f18 = f16 * length;
                            path.reset();
                            if (f17 > f18) {
                                this.f700f.getSegment(f17, length, path, z3);
                                f3 = 0.0f;
                                this.f700f.getSegment(0.0f, f18, path, z3);
                            } else {
                                f3 = 0.0f;
                                this.f700f.getSegment(f17, f18, path, z3);
                            }
                            path.rLineTo(f3, f3);
                        }
                        path2.addPath(path, matrix3);
                        F.d dVar = iVar.f673f;
                        if ((((Shader) dVar.f855c) == null && dVar.f854b == 0) ? false : true) {
                            if (this.f699e == null) {
                                i9 = 16777215;
                                Paint paint = new Paint(1);
                                this.f699e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i9 = 16777215;
                            }
                            Paint paint2 = this.f699e;
                            Shader shader = (Shader) dVar.f855c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.f675h * 255.0f));
                                f9 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(com.anythink.basead.exoplayer.k.p.f8473b);
                                int i11 = dVar.f854b;
                                float f19 = iVar.f675h;
                                PorterDuff.Mode mode = p.f721C;
                                f9 = 255.0f;
                                paint2.setColor((i11 & i9) | (((int) (Color.alpha(i11) * f19)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.f693c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f9 = 255.0f;
                            i9 = 16777215;
                        }
                        F.d dVar2 = iVar.f671d;
                        if (((Shader) dVar2.f855c) != null || dVar2.f854b != 0) {
                            if (this.f698d == null) {
                                Paint paint3 = new Paint(1);
                                this.f698d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f698d;
                            Paint.Join join = iVar.f679m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f678l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f680n);
                            Shader shader2 = (Shader) dVar2.f855c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix3);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f674g * f9));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(com.anythink.basead.exoplayer.k.p.f8473b);
                                int i12 = dVar2.f854b;
                                float f20 = iVar.f674g;
                                PorterDuff.Mode mode2 = p.f721C;
                                paint4.setColor((i12 & i9) | (((int) (Color.alpha(i12) * f20)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f672e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                c9 = 1;
                i10++;
                jVar2 = jVar;
                c10 = c9;
                c11 = 0;
            }
            c9 = c10;
            i10++;
            jVar2 = jVar;
            c10 = c9;
            c11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f705l;
    }

    public void setAlpha(float f3) {
        setRootAlpha((int) (f3 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f705l = i;
    }

    public m(m mVar) {
        this.f697c = new Matrix();
        this.f702h = 0.0f;
        this.i = 0.0f;
        this.f703j = 0.0f;
        this.f704k = 0.0f;
        this.f705l = com.anythink.basead.exoplayer.k.p.f8473b;
        this.f706m = null;
        this.f707n = null;
        s.b bVar = new s.b();
        this.f708o = bVar;
        this.f701g = new j(mVar.f701g, bVar);
        this.f695a = new Path(mVar.f695a);
        this.f696b = new Path(mVar.f696b);
        this.f702h = mVar.f702h;
        this.i = mVar.i;
        this.f703j = mVar.f703j;
        this.f704k = mVar.f704k;
        this.f705l = mVar.f705l;
        this.f706m = mVar.f706m;
        String str = mVar.f706m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f707n = mVar.f707n;
    }
}
