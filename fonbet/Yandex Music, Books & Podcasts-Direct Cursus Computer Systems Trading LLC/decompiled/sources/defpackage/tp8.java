package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinVersion;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class tp8 implements a0c {
    public final gc8 a;
    public final View b;
    public op8 c;
    public final es6 d;
    public final jyr e;
    public final jyr f;
    public final qp8 g;
    public float h;
    public float[] i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final ArrayList o;

    public tp8(gc8 gc8Var, View view) {
        this.a = gc8Var;
        this.b = view;
        es6 es6Var = new es6();
        es6Var.c = this;
        es6Var.a = new Path();
        es6Var.b = new RectF();
        this.d = es6Var;
        this.e = btf.b(new sp8(this, 0));
        this.f = btf.b(new sp8(this, 1));
        qp8 qp8Var = new qp8();
        qp8Var.b = 0.0f;
        this.g = qp8Var;
        this.n = true;
        this.o = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b8, code lost:
    
        if ((r5.getParent() instanceof defpackage.f09) == false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(op8 op8Var, xzb xzbVar) {
        float f;
        float[] fArr;
        boolean z;
        View view;
        bf9 bf9Var;
        ow8 ow8Var;
        bf9 bf9Var2;
        ow8 ow8Var2;
        szb szbVar;
        szb szbVar2;
        szb szbVar3;
        boolean z2;
        szb szbVar4;
        szb szbVar5;
        szb szbVar6;
        szb szbVar7;
        ln9 ln9Var;
        ln9 ln9Var2;
        szb szbVar8;
        ln9 ln9Var3;
        DisplayMetrics f2 = f();
        float v0 = (op8Var == null || (ln9Var3 = op8Var.e) == null) ? 0.0f : bkp.v0(ln9Var3, xzbVar, f2);
        this.h = v0;
        boolean z3 = true;
        boolean z4 = v0 > 0.0f;
        this.k = z4;
        if (z4) {
            int intValue = (op8Var == null || (ln9Var2 = op8Var.e) == null || (szbVar8 = ln9Var2.a) == null) ? 0 : ((Number) szbVar8.a(xzbVar)).intValue();
            jyr jyrVar = this.e;
            pp8 pp8Var = (pp8) jyrVar.getValue();
            float f3 = this.h;
            Paint paint = pp8Var.a;
            paint.setStrokeWidth(Math.min(pp8Var.d, Math.max(1.0f, pp8Var.h.h * 0.1f)) + f3);
            paint.setColor(intValue);
            ((pp8) jyrVar.getValue()).c = ((op8Var == null || (ln9Var = op8Var.e) == null) ? null : ln9Var.b) instanceof pn9;
        }
        View view2 = this.b;
        if (op8Var != null) {
            float x = bg3.x(Integer.valueOf(view2.getWidth()), f2);
            float x2 = bg3.x(Integer.valueOf(view2.getHeight()), f2);
            fu8 fu8Var = op8Var.b;
            szb szbVar9 = op8Var.a;
            if (fu8Var == null || (szbVar4 = fu8Var.c) == null) {
                szbVar4 = szbVar9;
            }
            float w = bg3.w(szbVar4 != null ? (Long) szbVar4.a(xzbVar) : null, f2);
            if (fu8Var == null || (szbVar5 = fu8Var.d) == null) {
                szbVar5 = szbVar9;
            }
            float w2 = bg3.w(szbVar5 != null ? (Long) szbVar5.a(xzbVar) : null, f2);
            f = 0.0f;
            if (fu8Var == null || (szbVar6 = fu8Var.a) == null) {
                szbVar6 = szbVar9;
            }
            float w3 = bg3.w(szbVar6 != null ? (Long) szbVar6.a(xzbVar) : null, f2);
            if (fu8Var != null && (szbVar7 = fu8Var.b) != null) {
                szbVar9 = szbVar7;
            }
            float w4 = bg3.w(szbVar9 != null ? (Long) szbVar9.a(xzbVar) : null, f2);
            Float f4 = (Float) Collections.min(u75.h(Float.valueOf(x / (w + w2)), Float.valueOf(x / (w3 + w4)), Float.valueOf(x2 / (w + w3)), Float.valueOf(x2 / (w2 + w4))));
            if (f4.floatValue() > 0.0f && f4.floatValue() < 1.0f) {
                w *= f4.floatValue();
                w2 *= f4.floatValue();
                w3 *= f4.floatValue();
                w4 *= f4.floatValue();
            }
            fArr = new float[]{w, w, w2, w2, w4, w4, w3, w3};
        } else {
            f = 0.0f;
            fArr = null;
        }
        this.i = fArr;
        if (fArr == null) {
            z = false;
        } else {
            if (fArr.length == 0) {
                wvs.h("Array is empty.");
                return;
            }
            float f5 = fArr[0];
            int length = fArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = true;
                    break;
                } else {
                    if (!Float.valueOf(fArr[i]).equals(Float.valueOf(f5))) {
                        z2 = false;
                        break;
                    }
                    i++;
                }
            }
            z = !z2;
        }
        this.j = z;
        boolean z5 = this.l;
        boolean booleanValue = op8Var != null ? ((Boolean) op8Var.c.a(xzbVar)).booleanValue() : false;
        this.m = booleanValue;
        if (booleanValue) {
            if ((op8Var != null ? op8Var.d : null) == null) {
            }
            this.l = z3;
            view2.setElevation((this.m && !z3) ? view2.getContext().getResources().getDimension(R.dimen.div_shadow_elevation) : f);
            if (this.l) {
                rp8 g = g();
                dj9 dj9Var = op8Var != null ? op8Var.d : null;
                g.b = (dj9Var == null || (szbVar3 = dj9Var.b) == null) ? g.a : bg3.y(Long.valueOf(((Number) szbVar3.a(xzbVar)).longValue()), g.j.f());
                g.c = (dj9Var == null || (szbVar2 = dj9Var.c) == null) ? -16777216 : ((Number) szbVar2.a(xzbVar)).intValue();
                g.d = (dj9Var == null || (szbVar = dj9Var.a) == null) ? 0.14f : (float) ((Number) szbVar.a(xzbVar)).doubleValue();
                g.h = ((dj9Var == null || (bf9Var2 = dj9Var.d) == null || (ow8Var2 = bf9Var2.a) == null) ? bg3.x(Float.valueOf(f), r6) : bg3.f0(ow8Var2, r6, xzbVar)) - g.b;
                g.i = ((dj9Var == null || (bf9Var = dj9Var.d) == null || (ow8Var = bf9Var.b) == null) ? bg3.x(Float.valueOf(0.5f), r6) : bg3.f0(ow8Var, r6, xzbVar)) - g.b;
            }
            h();
            if (!this.l || z5) {
                Object parent = view2.getParent();
                view = parent instanceof View ? (View) parent : null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        z3 = false;
        this.l = z3;
        if (this.m) {
            view2.setElevation((this.m && !z3) ? view2.getContext().getResources().getDimension(R.dimen.div_shadow_elevation) : f);
            if (this.l) {
            }
            h();
            if (this.l) {
            }
            Object parent2 = view2.getParent();
            if (parent2 instanceof View) {
            }
            if (view != null) {
            }
        }
        view2.setElevation((this.m && !z3) ? view2.getContext().getResources().getDimension(R.dimen.div_shadow_elevation) : f);
        if (this.l) {
        }
        h();
        if (this.l) {
        }
        Object parent22 = view2.getParent();
        if (parent22 instanceof View) {
        }
        if (view != null) {
        }
    }

    public final void c(Canvas canvas) {
        if (k()) {
            canvas.clipPath((Path) this.d.a);
        }
    }

    public final void d(Canvas canvas) {
        if (this.k) {
            jyr jyrVar = this.e;
            canvas.drawPath(((pp8) jyrVar.getValue()).b, ((pp8) jyrVar.getValue()).a);
        }
    }

    public final void e(Canvas canvas) {
        View view = this.b;
        if (y5g.d0(view)) {
            Object parent = view.getParent();
            if (!(parent instanceof p7t) || !y5g.d0((View) parent)) {
                return;
            }
        }
        if (this.l) {
            float f = g().h;
            float f2 = g().i;
            int save = canvas.save();
            canvas.translate(f, f2);
            try {
                NinePatch ninePatch = g().g;
                if (ninePatch != null) {
                    ninePatch.draw(canvas, g().f, g().e);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public final DisplayMetrics f() {
        return this.b.getResources().getDisplayMetrics();
    }

    public final rp8 g() {
        return (rp8) this.f.getValue();
    }

    @Override // defpackage.a0c
    public final List getSubscriptions() {
        return this.o;
    }

    public final void h() {
        float[] fArr;
        NinePatch ninePatch;
        Bitmap bitmap;
        DashPathEffect dashPathEffect;
        float[] fArr2 = this.i;
        if (fArr2 != null && (fArr = (float[]) fArr2.clone()) != null) {
            this.d.S(fArr);
            float f = this.h / 2.0f;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = Math.max(0.0f, fArr[i] - f);
            }
            NinePatch ninePatch2 = null;
            if (this.k) {
                pp8 pp8Var = (pp8) this.e.getValue();
                tp8 tp8Var = pp8Var.h;
                float f2 = tp8Var.h;
                View view = tp8Var.b;
                float min = (f2 - Math.min(pp8Var.d, Math.max(1.0f, 0.1f * f2))) / 2.0f;
                float width = view.getWidth();
                float height = view.getHeight();
                RectF rectF = pp8Var.g;
                rectF.set(min, min, width - min, height - min);
                Path path = pp8Var.b;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                Paint paint = pp8Var.a;
                if (pp8Var.c) {
                    float width2 = rectF.width();
                    float height2 = rectF.height();
                    float f3 = 2;
                    float f4 = (f3 * height2) + (width2 * f3);
                    if (fArr.length != 8) {
                        int i2 = i9f.a;
                    } else {
                        int s = hag.s(0, fArr.length - 1, 2);
                        if (s >= 0) {
                            int i3 = 0;
                            while (true) {
                                float f5 = fArr[i3];
                                f4 = ((f4 - f5) - fArr[i3 + 1]) + ((float) (Math.sqrt(((r14 * r14) + (f5 * f5)) / 8.0d) * 3.141592653589793d));
                                if (i3 == s) {
                                    break;
                                } else {
                                    i3 += 2;
                                }
                            }
                        }
                        if (f4 < 0.0f) {
                            f4 = 0.0f;
                        }
                    }
                    float f6 = pp8Var.f;
                    float f7 = pp8Var.e;
                    if (f4 > 0.0f) {
                        float f8 = f7 + f6;
                        float f9 = (int) (f4 / f8);
                        float f10 = f4 - (f8 * f9);
                        f7 += ((f10 * f7) / f8) / f9;
                        f6 += ((f10 * f6) / f8) / f9;
                    }
                    dashPathEffect = new DashPathEffect(new float[]{f7, f6}, 0.0f);
                } else {
                    dashPathEffect = null;
                }
                paint.setPathEffect(dashPathEffect);
            }
            if (this.l) {
                rp8 g = g();
                Rect rect = g.f;
                tp8 tp8Var2 = g.j;
                View view2 = tp8Var2.b;
                float f11 = 2;
                rect.set(0, 0, (int) ((g.b * f11) + view2.getWidth()), (int) ((g.b * f11) + view2.getHeight()));
                Paint paint2 = g.e;
                paint2.setColor(g.c);
                paint2.setAlpha((int) (view2.getAlpha() * g.d * KotlinVersion.MAX_COMPONENT_VALUE));
                Paint paint3 = qtp.a;
                float f12 = g.b;
                wzg q = tp8Var2.a.getDiv2Component$div_release().q();
                ptp ptpVar = new ptp(f12, fArr);
                LinkedHashMap linkedHashMap = qtp.b;
                NinePatch ninePatch3 = (NinePatch) linkedHashMap.get(ptpVar);
                if (ninePatch3 == null) {
                    float max = Math.max(fArr[1] + fArr[2], fArr[5] + fArr[6]) + f12;
                    float max2 = Math.max(fArr[0] + fArr[7], fArr[3] + fArr[4]) + f12;
                    if (max <= 0.0f || max2 <= 0.0f) {
                        ninePatch = null;
                    } else {
                        q.getClass();
                        float c = yhn.c(f12, 1.0f, 25.0f);
                        float f13 = f12 <= 25.0f ? 1.0f : 25.0f / f12;
                        float f14 = f12 * f11;
                        Bitmap createBitmap = Bitmap.createBitmap((int) ((max + f14) * f13), (int) ((f14 + max2) * f13), Bitmap.Config.ALPHA_8);
                        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
                        roundRectShape.resize(max, max2);
                        Canvas canvas = new Canvas();
                        canvas.setBitmap(createBitmap);
                        int save = canvas.save();
                        canvas.translate(c, c);
                        try {
                            save = canvas.save();
                            canvas.scale(f13, f13, 0.0f, 0.0f);
                            try {
                                roundRectShape.draw(canvas, qtp.a);
                                canvas.restoreToCount(save);
                                if (createBitmap.isRecycled() || createBitmap.getWidth() <= 0 || createBitmap.getHeight() <= 0 || c <= 0.0f) {
                                    bitmap = createBitmap;
                                } else {
                                    bitmap = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Bitmap.Config.ALPHA_8);
                                    RenderScript renderScript = q.b;
                                    if (renderScript == null) {
                                        Context context = q.a;
                                        renderScript = RenderScript.createMultiContext(context, RenderScript.ContextType.NORMAL, 0, context.getApplicationInfo().targetSdkVersion);
                                        q.b = renderScript;
                                    }
                                    ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.A_8(renderScript));
                                    Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, createBitmap);
                                    Allocation createFromBitmap2 = Allocation.createFromBitmap(renderScript, bitmap);
                                    create.setRadius(c);
                                    create.setInput(createFromBitmap);
                                    create.forEach(createFromBitmap2);
                                    createFromBitmap2.copyTo(bitmap);
                                    createFromBitmap2.destroy();
                                    createFromBitmap.destroy();
                                    create.destroy();
                                }
                                createBitmap.recycle();
                                if (f13 < 1.0f) {
                                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f13), (int) (bitmap.getHeight() / f13), true);
                                    bitmap.recycle();
                                    bitmap = createScaledBitmap;
                                }
                                int width3 = bitmap.getWidth();
                                int height3 = bitmap.getHeight() / 2;
                                int i4 = width3 / 2;
                                ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
                                order.put((byte) 1);
                                order.put((byte) 2);
                                order.put((byte) 2);
                                order.put((byte) 9);
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(i4 - 1);
                                order.putInt(i4 + 1);
                                order.putInt(height3 - 1);
                                order.putInt(height3 + 1);
                                for (int i5 = 0; i5 < 9; i5++) {
                                    order.putInt(1);
                                }
                                ninePatch = new NinePatch(bitmap, order.array());
                            } finally {
                                canvas.restoreToCount(save);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (ninePatch != null) {
                        linkedHashMap.put(ptpVar, ninePatch);
                        ninePatch2 = ninePatch;
                    }
                } else {
                    ninePatch2 = ninePatch3;
                }
                g.g = ninePatch2;
            }
        }
        j();
    }

    public final void j() {
        float f;
        boolean k = k();
        ViewOutlineProvider viewOutlineProvider = null;
        View view = this.b;
        if (k) {
            view.setClipToOutline(false);
            if (!this.l && !y5g.d0(view)) {
                viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
            }
            view.setOutlineProvider(viewOutlineProvider);
            return;
        }
        float[] fArr = this.i;
        if (fArr == null) {
            f = 0.0f;
        } else {
            if (fArr.length == 0) {
                wvs.h("Array is empty.");
                return;
            }
            f = fArr[0];
        }
        if (f != 0.0f) {
            qp8 qp8Var = this.g;
            qp8Var.b = f;
            view.setOutlineProvider(qp8Var);
            view.setClipToOutline(this.n);
            return;
        }
        view.setClipToOutline(false);
        if (!this.l && !y5g.d0(view)) {
            viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
        }
        view.setOutlineProvider(viewOutlineProvider);
    }

    public final boolean k() {
        if (!this.n) {
            return false;
        }
        if (this.a.getForceCanvasClipping() || this.l) {
            return true;
        }
        return (!this.m && (this.j || this.k)) || y5g.d0(this.b);
    }
}
