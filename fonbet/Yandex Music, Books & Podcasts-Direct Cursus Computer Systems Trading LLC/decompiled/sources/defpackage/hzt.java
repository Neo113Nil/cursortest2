package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class hzt {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final ezt g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final xy0 o;

    public hzt(hzt hztVar) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.m = null;
        this.n = null;
        xy0 xy0Var = new xy0(0);
        this.o = xy0Var;
        this.g = new ezt(hztVar.g, xy0Var);
        this.a = new Path(hztVar.a);
        this.b = new Path(hztVar.b);
        this.h = hztVar.h;
        this.i = hztVar.i;
        this.j = hztVar.j;
        this.k = hztVar.k;
        this.l = hztVar.l;
        this.m = hztVar.m;
        String str = hztVar.m;
        if (str != null) {
            xy0Var.put(str, this);
        }
        this.n = hztVar.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ezt eztVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = eztVar.a;
        ArrayList arrayList = eztVar.b;
        matrix2.set(matrix);
        Matrix matrix3 = eztVar.a;
        matrix3.preConcat(eztVar.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            fzt fztVar = (fzt) arrayList.get(i5);
            if (fztVar instanceof ezt) {
                a((ezt) fztVar, matrix3, canvas, i, i2);
            } else if (fztVar instanceof gzt) {
                gzt gztVar = (gzt) fztVar;
                float f3 = i / this.j;
                float f4 = i2 / this.k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    fbk[] fbkVarArr = gztVar.a;
                    if (fbkVarArr != null) {
                        fbk.b(fbkVarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (gztVar instanceof czt) {
                        path2.setFillType(gztVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        dzt dztVar = (dzt) gztVar;
                        float f6 = dztVar.i;
                        if (f6 != 0.0f || dztVar.j != 1.0f) {
                            float f7 = dztVar.k;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (dztVar.j + f7) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, z);
                            float length = this.f.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            PathMeasure pathMeasure = this.f;
                            if (f10 > f11) {
                                pathMeasure.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                pathMeasure.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        x0 x0Var = dztVar.f;
                        if (((Shader) x0Var.c) == null && x0Var.b == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) x0Var.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(dztVar.h * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                int i6 = x0Var.b;
                                float f12 = dztVar.h;
                                PorterDuff.Mode mode = kzt.j;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(dztVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        x0 x0Var2 = dztVar.d;
                        if (((Shader) x0Var2.c) != null || x0Var2.b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = dztVar.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = dztVar.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(dztVar.n);
                            Shader shader2 = (Shader) x0Var2.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(dztVar.g * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                int i7 = x0Var2.b;
                                float f13 = dztVar.g;
                                PorterDuff.Mode mode2 = kzt.j;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(dztVar.e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public hzt() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.m = null;
        this.n = null;
        this.o = new xy0(0);
        this.g = new ezt();
        this.a = new Path();
        this.b = new Path();
    }
}
