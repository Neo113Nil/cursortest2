package ru.yandex.taxi.plaque.api.models.display;

import android.content.res.ColorStateList;
import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import defpackage.ae20;
import defpackage.ee20;
import defpackage.ge20;
import defpackage.lhc;
import defpackage.nlb1;
import defpackage.pe20;
import defpackage.re20;
import defpackage.tcc;
import defpackage.te20;
import defpackage.vvb1;
import defpackage.w511;
import defpackage.yd20;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/plaque/api/models/display/MicroWidgetDrawable;", "Landroid/graphics/drawable/RippleDrawable;", "Lte20;", "backgroundSettings", "", "viewHeight", "<init>", "(Lte20;I)V", "another", "", "hasSameGradient", "(Lru/yandex/taxi/plaque/api/models/display/MicroWidgetDrawable;)Z", "hasSameShape", "Lte20;", "Landroid/graphics/drawable/PaintDrawable;", C0553n3.g, "Landroid/graphics/drawable/PaintDrawable;", "", "initialCornerRadii", "[F", "getInitialCornerRadii", "()[F", "value", "cornerRadii", "getCornerRadii", "setCornerRadii", "([F)V", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MicroWidgetDrawable extends RippleDrawable {
    private final PaintDrawable background;
    private final te20 backgroundSettings;
    private float[] cornerRadii;
    private final float[] initialCornerRadii;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MicroWidgetDrawable(te20 te20Var, int i) {
        super(r0, r2, null);
        Integer valueOf;
        ColorStateList valueOf2;
        ShapeDrawable.ShaderFactory shaderFactory;
        PaintDrawable paintDrawable;
        boolean z = te20Var.c;
        re20 re20Var = te20Var.b;
        ee20 ee20Var = te20Var.a;
        PaintDrawable paintDrawable2 = null;
        if (!z) {
            valueOf2 = ColorStateList.valueOf(0);
        } else if (ee20Var instanceof yd20) {
            List list = ((ae20) ((yd20) ee20Var)).a;
            if (!list.isEmpty()) {
                int i2 = ((pe20) a.P(list)).a;
                int size = list.size();
                for (int i3 = 1; i3 < size; i3++) {
                    if (((pe20) list.get(i3)).a == i2) {
                    }
                }
                valueOf = Integer.valueOf(i2);
                valueOf2 = valueOf != null ? ColorStateList.valueOf(0) : ColorStateList.valueOf(lhc.f(~valueOf.intValue(), Math.abs(25) & 255));
            }
            valueOf = null;
            if (valueOf != null) {
            }
        } else {
            if (ee20Var instanceof ge20) {
                valueOf = Integer.valueOf(((ge20) ee20Var).a);
                if (valueOf != null) {
                }
            }
            valueOf = null;
            if (valueOf != null) {
            }
        }
        if (ee20Var instanceof ge20) {
            final ge20 ge20Var = (ge20) ee20Var;
            shaderFactory = new ShapeDrawable.ShaderFactory() { // from class: ru.yandex.taxi.plaque.api.models.display.MicroWidgetDrawableFactory$createSolidColorShader$1
                @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                public Shader resize(int width, int height) {
                    int i4 = ge20.this.a;
                    return new LinearGradient(0.0f, 0.0f, width, height, new int[]{i4, i4}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                }
            };
        } else {
            if (ee20Var instanceof ae20) {
                final ae20 ae20Var = (ae20) ee20Var;
                List list2 = ae20Var.a;
                if (!list2.isEmpty()) {
                    if (list2.size() == 1) {
                        final ge20 ge20Var2 = new ge20(((pe20) a.P(list2)).a);
                        shaderFactory = new ShapeDrawable.ShaderFactory() { // from class: ru.yandex.taxi.plaque.api.models.display.MicroWidgetDrawableFactory$createSolidColorShader$1
                            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                            public Shader resize(int width, int height) {
                                int i4 = ge20.this.a;
                                return new LinearGradient(0.0f, 0.0f, width, height, new int[]{i4, i4}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            }
                        };
                    } else {
                        shaderFactory = new ShapeDrawable.ShaderFactory() { // from class: ru.yandex.taxi.plaque.api.models.display.MicroWidgetDrawableFactory$createLinearShader$1
                            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                            public Shader resize(int width, int height) {
                                float f = width;
                                float f2 = height;
                                ae20 ae20Var2 = ae20.this;
                                PointF pointF = ae20Var2.c;
                                float f3 = pointF.x;
                                PointF pointF2 = ae20Var2.b;
                                float f4 = pointF2.x;
                                float f5 = (f3 - f4) * f;
                                float f6 = pointF.y;
                                float f7 = pointF2.y;
                                float f8 = (f6 - f7) * f2;
                                RectF rectF = new RectF(0.0f, (f7 * f2) - (f5 == 0.0f ? 0.0f : ((f4 * f) * f8) / f5), f, (f6 * f2) + (f5 == 0.0f ? 0.0f : (f8 * ((1.0f - f3) * f)) / f5));
                                float f9 = rectF.left;
                                float f10 = rectF.top;
                                float f11 = rectF.right;
                                float f12 = rectF.bottom;
                                List list3 = ae20.this.a;
                                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(Integer.valueOf(((pe20) it.next()).a));
                                }
                                int[] I0 = a.I0(arrayList);
                                List list4 = ae20.this.a;
                                ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                                Iterator it2 = list4.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(Float.valueOf(((pe20) it2.next()).b));
                                }
                                return new LinearGradient(f9, f10, f11, f12, I0, a.G0(arrayList2), Shader.TileMode.CLAMP);
                            }
                        };
                    }
                }
            } else if (!ee20Var.equals(vvb1.F)) {
                w511.b();
                throw null;
            }
            shaderFactory = null;
        }
        if (shaderFactory == null) {
            paintDrawable = null;
        } else {
            paintDrawable = new PaintDrawable();
            paintDrawable.setShape(new RoundRectShape(nlb1.c(re20Var, i), null, null));
            paintDrawable.setShaderFactory(shaderFactory);
        }
        this.backgroundSettings = te20Var;
        if (getNumberOfLayers() != 0) {
            Drawable drawable = getDrawable(0);
            if (drawable instanceof PaintDrawable) {
                paintDrawable2 = (PaintDrawable) drawable;
            }
        }
        this.background = paintDrawable2;
        float[] c = nlb1.c(re20Var, i);
        this.initialCornerRadii = c;
        this.cornerRadii = c;
    }

    public final float[] getCornerRadii() {
        return this.cornerRadii;
    }

    public final float[] getInitialCornerRadii() {
        return this.initialCornerRadii;
    }

    public final boolean hasSameGradient(MicroWidgetDrawable another) {
        return this.backgroundSettings.a.equals(another.backgroundSettings.a);
    }

    public final boolean hasSameShape(MicroWidgetDrawable another) {
        return this.backgroundSettings.b.equals(another.backgroundSettings.b);
    }

    public final void setCornerRadii(float[] fArr) {
        if (fArr.length != 8 || Arrays.equals(fArr, this.cornerRadii)) {
            return;
        }
        PaintDrawable paintDrawable = this.background;
        if (paintDrawable != null) {
            paintDrawable.setCornerRadii(fArr);
            invalidateDrawable(paintDrawable);
        }
        this.cornerRadii = fArr;
    }
}
