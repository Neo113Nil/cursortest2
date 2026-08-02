package defpackage;

import android.opengl.GLES20;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class awm {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;
    public Object h;

    public awm(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.g = constraintLayout2;
    }

    public static boolean b(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    public static boolean c(zvm zvmVar) {
        yvm yvmVar = zvmVar.a;
        yvm yvmVar2 = zvmVar.b;
        ah3[] ah3VarArr = yvmVar.a;
        if (ah3VarArr.length == 1 && ah3VarArr[0].b == 0) {
            ah3[] ah3VarArr2 = yvmVar2.a;
            if (ah3VarArr2.length == 1 && ah3VarArr2[0].b == 0) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        try {
            c1t c1tVar = new c1t("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n", 6);
            this.h = c1tVar;
            this.b = GLES20.glGetUniformLocation(c1tVar.b, "uMvpMatrix");
            this.c = GLES20.glGetUniformLocation(((c1t) this.h).b, "uTexMatrix");
            this.d = ((c1t) this.h).j("aPosition");
            this.e = ((c1t) this.h).j("aTexCoords");
            this.f = GLES20.glGetUniformLocation(((c1t) this.h).b, "uTexture");
        } catch (add e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(aa6 aa6Var, fv2 fv2Var) {
        int makeMeasureSpec;
        int i2;
        int ordinal;
        int makeMeasureSpec2;
        int i3;
        ba6 ba6Var;
        int baseline;
        int max;
        int max2;
        boolean z;
        int i4;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.h;
        if (aa6Var == null) {
            return;
        }
        o86 o86Var = aa6Var.L;
        o86 o86Var2 = aa6Var.J;
        if (aa6Var.i0 == 8 && !aa6Var.F) {
            fv2Var.e = 0;
            fv2Var.f = 0;
            fv2Var.g = 0;
            return;
        }
        if (aa6Var.V == null) {
            return;
        }
        q8q q8qVar = ConstraintLayout.p;
        z96 z96Var = fv2Var.a;
        z96 z96Var2 = fv2Var.b;
        int i5 = fv2Var.c;
        int i6 = fv2Var.d;
        int i7 = this.a + this.b;
        int i8 = this.c;
        View view = aa6Var.h0;
        int ordinal2 = z96Var.ordinal();
        if (ordinal2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (ordinal2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i8, -2);
        } else if (ordinal2 != 2) {
            if (ordinal2 != 3) {
                i2 = 0;
            } else {
                int i9 = this.e;
                int i10 = o86Var2 != null ? o86Var2.g : 0;
                if (o86Var != null) {
                    i10 += o86Var.g;
                }
                i2 = ViewGroup.getChildMeasureSpec(i9, i8 + i10, -1);
            }
            ordinal = z96Var2.ordinal();
            if (ordinal != 0) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else if (ordinal == 1) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            } else {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        i3 = 0;
                    } else {
                        int i11 = this.f;
                        int i12 = o86Var2 != null ? aa6Var.K.g : 0;
                        if (o86Var != null) {
                            i12 += aa6Var.M.g;
                        }
                        i3 = ViewGroup.getChildMeasureSpec(i11, i7 + i12, -1);
                    }
                    ba6Var = (ba6) aa6Var.V;
                    if (ba6Var == null && ff7.w(constraintLayout.i, 256) && view.getMeasuredWidth() == aa6Var.r() && view.getMeasuredWidth() < ba6Var.r() && view.getMeasuredHeight() == aa6Var.l() && view.getMeasuredHeight() < ba6Var.l() && view.getBaseline() == aa6Var.c0 && !aa6Var.A() && b(aa6Var.H, i2, aa6Var.r()) && b(aa6Var.I, i3, aa6Var.l())) {
                        fv2Var.e = aa6Var.r();
                        fv2Var.f = aa6Var.l();
                        fv2Var.g = aa6Var.c0;
                        return;
                    }
                    z96 z96Var3 = z96.c;
                    boolean z2 = z96Var == z96Var3;
                    boolean z3 = z96Var2 == z96Var3;
                    z96 z96Var4 = z96.a;
                    z96 z96Var5 = z96.d;
                    boolean z4 = z96Var2 != z96Var5 || z96Var2 == z96Var4;
                    boolean z5 = z96Var != z96Var5 || z96Var == z96Var4;
                    boolean z6 = !z2 && aa6Var.Y > 0.0f;
                    boolean z7 = !z3 && aa6Var.Y > 0.0f;
                    if (view == null) {
                        return;
                    }
                    t86 t86Var = (t86) view.getLayoutParams();
                    int i13 = fv2Var.j;
                    if (i13 != 1 && i13 != 2 && z2 && aa6Var.r == 0 && z3 && aa6Var.s == 0) {
                        max2 = 0;
                        z = false;
                        i4 = -1;
                        baseline = 0;
                        max = 0;
                    } else {
                        if ((view instanceof jiu) && (aa6Var instanceof kiu)) {
                            ((jiu) view).l((kiu) aa6Var, i2, i3);
                        } else {
                            view.measure(i2, i3);
                        }
                        aa6Var.H = i2;
                        aa6Var.I = i3;
                        aa6Var.g = false;
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        int i14 = aa6Var.u;
                        max = i14 > 0 ? Math.max(i14, measuredWidth) : measuredWidth;
                        int i15 = aa6Var.v;
                        if (i15 > 0) {
                            max = Math.min(i15, max);
                        }
                        int i16 = aa6Var.x;
                        max2 = i16 > 0 ? Math.max(i16, measuredHeight) : measuredHeight;
                        int i17 = i3;
                        int i18 = aa6Var.y;
                        if (i18 > 0) {
                            max2 = Math.min(i18, max2);
                        }
                        if (!ff7.w(constraintLayout.i, 1)) {
                            if (z6 && z4) {
                                max = (int) ((max2 * aa6Var.Y) + 0.5f);
                            } else if (z7 && z5) {
                                max2 = (int) ((max / aa6Var.Y) + 0.5f);
                            }
                        }
                        if (measuredWidth == max && measuredHeight == max2) {
                            z = false;
                        } else {
                            if (measuredWidth != max) {
                                i2 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                            }
                            int makeMeasureSpec3 = measuredHeight != max2 ? View.MeasureSpec.makeMeasureSpec(max2, 1073741824) : i17;
                            view.measure(i2, makeMeasureSpec3);
                            aa6Var.H = i2;
                            aa6Var.I = makeMeasureSpec3;
                            z = false;
                            aa6Var.g = false;
                            max = view.getMeasuredWidth();
                            max2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i4 = -1;
                    }
                    boolean z8 = baseline != i4 ? true : z;
                    fv2Var.i = (max == fv2Var.c && max2 == fv2Var.d) ? z : true;
                    if (t86Var.c0) {
                        z8 = true;
                    }
                    if (z8 && baseline != -1 && aa6Var.c0 != baseline) {
                        fv2Var.i = true;
                    }
                    fv2Var.e = max;
                    fv2Var.f = max2;
                    fv2Var.h = z8;
                    fv2Var.g = baseline;
                    return;
                }
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
                boolean z9 = aa6Var.s == 1;
                int i19 = fv2Var.j;
                if (i19 == 1 || i19 == 2) {
                    boolean z10 = view.getMeasuredWidth() == aa6Var.r();
                    if (fv2Var.j == 2 || !z9 || ((z9 && z10) || (view instanceof osk) || aa6Var.C())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(aa6Var.l(), 1073741824);
                    }
                }
            }
            i3 = makeMeasureSpec2;
            ba6Var = (ba6) aa6Var.V;
            if (ba6Var == null) {
            }
            z96 z96Var32 = z96.c;
            if (z96Var == z96Var32) {
            }
            if (z96Var2 == z96Var32) {
            }
            z96 z96Var42 = z96.a;
            z96 z96Var52 = z96.d;
            if (z96Var2 != z96Var52) {
            }
            if (z96Var != z96Var52) {
            }
            if (z2) {
            }
            if (z3) {
            }
            if (view == null) {
            }
        } else {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i8, -2);
            boolean z11 = aa6Var.r == 1;
            int i20 = fv2Var.j;
            if (i20 == 1 || i20 == 2) {
                boolean z12 = view.getMeasuredHeight() == aa6Var.l();
                if (fv2Var.j == 2 || !z11 || ((z11 && z12) || (view instanceof osk) || aa6Var.B())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(aa6Var.r(), 1073741824);
                }
            }
        }
        i2 = makeMeasureSpec;
        ordinal = z96Var2.ordinal();
        if (ordinal != 0) {
        }
        i3 = makeMeasureSpec2;
        ba6Var = (ba6) aa6Var.V;
        if (ba6Var == null) {
        }
        z96 z96Var322 = z96.c;
        if (z96Var == z96Var322) {
        }
        if (z96Var2 == z96Var322) {
        }
        z96 z96Var422 = z96.a;
        z96 z96Var522 = z96.d;
        if (z96Var2 != z96Var522) {
        }
        if (z96Var != z96Var522) {
        }
        if (z2) {
        }
        if (z3) {
        }
        if (view == null) {
        }
    }
}
