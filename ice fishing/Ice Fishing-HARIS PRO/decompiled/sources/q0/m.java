package q0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import r.C0338f;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f4269p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f4270a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f4271b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f4272c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f4273d;
    public Paint e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f4274f;

    /* renamed from: g, reason: collision with root package name */
    public final j f4275g;

    /* renamed from: h, reason: collision with root package name */
    public float f4276h;
    public float i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f4277k;

    /* renamed from: l, reason: collision with root package name */
    public int f4278l;

    /* renamed from: m, reason: collision with root package name */
    public String f4279m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f4280n;

    /* renamed from: o, reason: collision with root package name */
    public final C0338f f4281o;

    public m() {
        this.f4272c = new Matrix();
        this.f4276h = RecyclerView.f2111C0;
        this.i = RecyclerView.f2111C0;
        this.j = RecyclerView.f2111C0;
        this.f4277k = RecyclerView.f2111C0;
        this.f4278l = 255;
        this.f4279m = null;
        this.f4280n = null;
        this.f4281o = new C0338f(0);
        this.f4275g = new j();
        this.f4270a = new Path();
        this.f4271b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        jVar.f4258a.set(matrix);
        Matrix matrix3 = jVar.f4258a;
        matrix3.preConcat(jVar.j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = jVar.f4259b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            k kVar = (k) arrayList.get(i5);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f3 = i / this.j;
                float f4 = i2 / this.f4277k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f4272c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {RecyclerView.f2111C0, 1.0f, 1.0f, RecyclerView.f2111C0};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[i4]);
                matrix2 = matrix3;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > RecyclerView.f2111C0 ? Math.abs(f5) / max : 0.0f;
                if (abs != RecyclerView.f2111C0) {
                    lVar.getClass();
                    Path path = this.f4270a;
                    path.reset();
                    G.e[] eVarArr = lVar.f4266a;
                    if (eVarArr != null) {
                        G.e.b(eVarArr, path);
                    }
                    Path path2 = this.f4271b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.f4268c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f6 = iVar.i;
                        float f7 = f6 == RecyclerView.f2111C0 ? 1.0f : 1.0f;
                        float f8 = iVar.f4254k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (iVar.j + f8) % f7;
                        if (this.f4274f == null) {
                            this.f4274f = new PathMeasure();
                        }
                        this.f4274f.setPath(path, r11);
                        float length = this.f4274f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f4274f.getSegment(f11, length, path, true);
                            PathMeasure pathMeasure = this.f4274f;
                            f2 = RecyclerView.f2111C0;
                            pathMeasure.getSegment(RecyclerView.f2111C0, f12, path, true);
                        } else {
                            f2 = RecyclerView.f2111C0;
                            this.f4274f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        F.d dVar = iVar.f4251f;
                        if ((((Shader) dVar.f195b) == null && dVar.f194a == 0) ? r11 : true) {
                            if (this.e == null) {
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) dVar.f195b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.f4253h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f194a;
                                float f13 = iVar.f4253h;
                                PorterDuff.Mode mode = p.j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.f4268c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        F.d dVar2 = iVar.f4250d;
                        if (((Shader) dVar2.f195b) != null || dVar2.f194a != 0) {
                            if (this.f4273d == null) {
                                Paint paint3 = new Paint(1);
                                this.f4273d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f4273d;
                            Paint.Join join = iVar.f4256m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f4255l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f4257n);
                            Shader shader2 = (Shader) dVar2.f195b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f4252g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f194a;
                                float f14 = iVar.f4252g;
                                PorterDuff.Mode mode2 = p.j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.e * abs * min);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i3 = 1;
            } else {
                matrix2 = matrix3;
                i3 = i4;
            }
            i5 += i3;
            i4 = i3;
            matrix3 = matrix2;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f4278l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f4278l = i;
    }

    public m(m mVar) {
        this.f4272c = new Matrix();
        this.f4276h = RecyclerView.f2111C0;
        this.i = RecyclerView.f2111C0;
        this.j = RecyclerView.f2111C0;
        this.f4277k = RecyclerView.f2111C0;
        this.f4278l = 255;
        this.f4279m = null;
        this.f4280n = null;
        C0338f c0338f = new C0338f(0);
        this.f4281o = c0338f;
        this.f4275g = new j(mVar.f4275g, c0338f);
        this.f4270a = new Path(mVar.f4270a);
        this.f4271b = new Path(mVar.f4271b);
        this.f4276h = mVar.f4276h;
        this.i = mVar.i;
        this.j = mVar.j;
        this.f4277k = mVar.f4277k;
        this.f4278l = mVar.f4278l;
        this.f4279m = mVar.f4279m;
        String str = mVar.f4279m;
        if (str != null) {
            c0338f.put(str, this);
        }
        this.f4280n = mVar.f4280n;
    }
}
